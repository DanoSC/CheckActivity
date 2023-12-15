package com.example.checkactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class Orientations extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener {
        RadioGroup orientation;
        RadioGroup gravity;

        @Override
        public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            setContentView(R.layout.activity_orientations);

            orientation=(RadioGroup)findViewById(R.id.orientation);
            orientation.setOnCheckedChangeListener(this);
            gravity=(RadioGroup)findViewById(R.id.gravity);
            gravity.setOnCheckedChangeListener(this);
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId == R.id.horizontal) {
                orientation.setOrientation(LinearLayout.HORIZONTAL);
            }

            if(checkedId == R.id.vertical) {
                orientation.setOrientation(LinearLayout.VERTICAL);
            }

            if(checkedId == R.id.left) {
                gravity.setGravity(Gravity.LEFT);
            }

            if(checkedId == R.id.center) {
                gravity.setGravity(Gravity.CENTER_HORIZONTAL);
            }

            if(checkedId == R.id.right) {
                gravity.setGravity(Gravity.RIGHT);
            }

        }
}