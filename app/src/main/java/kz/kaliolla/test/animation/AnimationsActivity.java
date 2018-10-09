package kz.kaliolla.test.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kz.kaliolla.test.R;
import kz.kaliolla.test.animation.sample6.Sample6Activity;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
    }

    public void startSample1(View view) {
        startActivity(new Intent(this, Sample1Activity.class));
    }

    public void startSample2(View view) {
        startActivity(new Intent(this, Sample2Activity.class));
    }

    public void startSample3(View view) {
        startActivity(new Intent(this, Sample3Activity.class));
    }

    public void startSample4(View view) {
        startActivity(new Intent(this, Sample4Activity.class));
    }

    public void startSample5(View view) {
        startActivity(new Intent(this, Sample5Activity.class));
    }

    public void startSample6(View view) {
        startActivity(new Intent(this, Sample6Activity.class));
    }
}