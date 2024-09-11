package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        //Create a new Fragment to be placed in the activity
        ForecastFragment forecastFragment = new ForecastFragment();

        //Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.fragment_forecast, forecastFragment).commit();

        Log.i(TAG, "App Created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "App Started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "App Resumed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "App Paused");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "App Stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "App Destroyed");
    }
}