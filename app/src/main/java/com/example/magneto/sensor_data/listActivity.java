package com.example.magneto.sensor_data;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class listActivity extends AppCompatActivity {

    SensorManager sm;
    List<Sensor> ss;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        ss=sm.getSensorList(Sensor.TYPE_ALL);
        tv=(TextView)findViewById(R.id.sslist);
        for(Sensor s: ss)
        {
            tv.append("\n\n"+s.getName());
        }

    }
}
