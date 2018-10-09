package kz.kaliolla.test.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import kz.kaliolla.test.R;

public class Sample5Activity extends AppCompatActivity {
    private LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample5);
        content = findViewById(R.id.content);
    }

    public void animate1(View view){
        content.animate().x(10f);
    }

    public void animate2(View view){
        content.animate().y(1.5f);
    }
}
