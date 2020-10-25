const log = console.log;

const input = document.querySelector(`#input`);
const btn = document.querySelector(`#button`);

btn.addEventListener(`click`, (e) => {
  const value = input.value;
  log(`value =`, value);
  // alert(value);
  // setTimeout(() => {
  //   autoFillInput(`xgqfrms`);
  // }, 0);
  // ✅ WebView SDK 提供给 js 调用的 SDK 方法, 挂载到 window 全局对象下面
  // js 全局对象 window 上挂载 SDK 定义的接口方法
  if(window.JsLauncher) {
    window.JsLauncher.setValue(value);
    // window.JsLauncher?.setValue(value);
  } else {
    log(`❌ JsLauncher.setValue not found!`)
  }
});

// ✅ js 提供给 WebView SDK 调用的 js 全局函数 ??? namespace
function autoFillInput(str = ``) {
  input.value = str;
}
