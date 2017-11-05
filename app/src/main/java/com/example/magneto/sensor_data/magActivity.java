package com.example.magneto.sensor_data;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class magActivity extends AppCompatActivity implements SensorEventListener{
    SensorManager sm;
    TextView t;
    Sensor s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mag);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        t=(TextView)findViewById(R.id.mvalue);
    }
    protected void onResume()
    {
        super.onResume();
        if(s!= null )
        {
            sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        }
        else
        {
            Toast.makeText(this,"Not Supported",Toast.LENGTH_SHORT).show();
            finish();
        }
    }
    protected void onPause()
    {
        super.onPause();
        sm.unregisterListener(this);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        t.setText("X:"+String.valueOf(event.values[0])+"\n\nY:"+String.valueOf(event.values[1])+"\n\nZ:"+String.valueOf(event.values[2]));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
