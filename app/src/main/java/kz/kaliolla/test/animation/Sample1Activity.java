package kz.kaliolla.test.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import kz.kaliolla.test.R;

public class Sample1Activity extends AppCompatActivity {
    private LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample1);
        content = findViewById(R.id.content);
    }

    public void animate(View view){
        content.setVisibility(content.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
    }
}
