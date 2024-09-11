package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = new View(getActivity());
        view.setBackgroundColor(0x20FF0000);

        //Create a new LinearLayout
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        //Create a new TextView
        TextView dayTextView = new TextView(getActivity());
        dayTextView.setText("Thursday");

        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.ic_weather);

        //Add the TextView and ImageView to the LinearLayout
        linearLayout.addView(dayTextView);
        linearLayout.addView(weatherIcon);

        return linearLayout;
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }
}