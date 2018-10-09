package kz.kaliolla.test.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import kz.kaliolla.test.R;

public class Sample4Activity extends AppCompatActivity {
    private LinearLayout content1, content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample4);
        content1 = findViewById(R.id.content1);
        content2 = findViewById(R.id.content2);
    }

    public void animate1(View view){
        content1.animate().scaleX(70f);
    }

    public void animate2(View view){
        content2.animate().scaleY(1.5f);
    }
}
