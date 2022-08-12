package sg.edu.rp.c346.id21021397.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
     Context parent_context;
     int layout_id;
     ArrayList<Weather> WeatherList;

     public CustomAdapter(Context context, int resource, ArrayList<Weather> weather){
         super(context,resource,weather);

         parent_context = context;
         layout_id = resource;
         WeatherList = weather;
     }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvArea = rowView.findViewById(R.id.tvArea);
        TextView tvForcast = rowView.findViewById(R.id.tvForcast);

        Weather currentWeather = WeatherList.get(position);

        tvArea.setText("Area: " + currentWeather.getArea());
        tvForcast.setText("Forecast: " + currentWeather.getForecast());

        return rowView;
    }
}
