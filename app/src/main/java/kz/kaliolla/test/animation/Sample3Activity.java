package kz.kaliolla.test.animation;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import kz.kaliolla.test.R;

public class Sample3Activity extends AppCompatActivity {
    private LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample3);
        content = findViewById(R.id.content);
    }

    public void animate1(View view){
        content.animate().rotation(100);
    }

    public void animate2(View view){
        content.animate().rotationY(content.getWidth() / 4);
    }

    public void animate3(View view){
        content.animate().rotationX(content.getHeight());
    }
}
