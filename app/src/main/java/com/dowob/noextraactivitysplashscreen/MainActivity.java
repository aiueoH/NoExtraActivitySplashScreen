package com.dowob.noextraactivitysplashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Use them(window background) to make the splash screen transition effect,
 * the splash screen will terminate after Application.onCreate().
 *
 * Reference:
 * https://android.jlelse.eu/launch-screen-in-android-the-right-way-aca7e8c31f52#.u72i2o11q
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
