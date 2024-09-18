package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        Log.i(TAG, "Create");

        String[] cities = new String[]{"Hanoi, Vietnam", "Paris, France", "Melbourne, Australia"};
        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(this);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {

            tab.setText(cities[position]);
        }).attach();

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