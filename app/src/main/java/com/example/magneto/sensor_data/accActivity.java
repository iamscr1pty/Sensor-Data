package com.example.magneto.sensor_data;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class accActivity extends AppCompatActivity implements SensorEventListener{
    SensorManager sm;
    TextView tx;
    Sensor s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        tx=(TextView)findViewById(R.id.avalue);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        tx.setText("X:  "+String.valueOf(event.values[0])+" m/s2\n\nY:   "+String.valueOf(event.values[1])+"    m/s2\n\nZ    :"+String.valueOf(event.values[2])+"   m/s2");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
