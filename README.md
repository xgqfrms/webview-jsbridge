# webview jsbridge

> webview jsbridge all in one


webview-jsbridge/src/app/src/main/res/layout/activity_main.xml


```java
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
  xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:app="http://schemas.android.com/apk/res-auto"
  xmlns:tools="http://schemas.android.com/tools"
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  tools:context=".MainActivity">

  <TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello World!"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
  xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:tools="http://schemas.android.com/tools"
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  android:orientation="vertical">

  <WebView
    android:id="@+id/webview"
    android:layout_width="match_content"
    android:layout_height="280dp"/>

  <TextView
    android:id="@+id/textview"
    android:layout_width="match_content"
    android:layout_height="wrap_content"
    android:layout_marginTop="20dp"
    tools:text="Hello World!"
    android:textSize="23sp"
    android:textColor="#00ff00" />

</LinearLayout>

```
