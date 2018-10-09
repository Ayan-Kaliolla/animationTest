package kz.kaliolla.test.animation;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import kz.kaliolla.test.R;

public class Sample2Activity extends AppCompatActivity {

    private LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2);
        content = findViewById(R.id.content);

    }

    public void animate(View view){
        if (content.getVisibility() == View.GONE) {
            content.setVisibility(View.VISIBLE);
            content.animate().alpha(1).translationY(0).setListener(null);
        } else {
            content.animate().alpha(0).translationY(200).setListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {

                }

                @Override
                public void onAnimationEnd(Animator animator) {

                    content.setVisibility(View.GONE);
                }

                @Override
                public void onAnimationCancel(Animator animator) {

                }

                @Override
                public void onAnimationRepeat(Animator animator) {

                }
            });

        }
    }
}
