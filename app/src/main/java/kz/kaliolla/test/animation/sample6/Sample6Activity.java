package kz.kaliolla.test.animation.sample6;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import kz.kaliolla.test.R;

public class Sample6Activity extends AppCompatActivity {
    private ConstraintLayout constraint;
    private ConstraintSet triggeredSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample6);

        constraint = findViewById(R.id.root);
        ConstraintSet idleSet = new ConstraintSet();
        triggeredSet = new ConstraintSet();

        idleSet.clone(constraint);
        triggeredSet.clone(constraint);

        triggeredSet.setVisibility(R.id.title, ConstraintSet.GONE);
        triggeredSet.setVisibility(R.id.instructions, ConstraintSet.GONE);
        triggeredSet.setVisibility(R.id.help, ConstraintSet.GONE);
        triggeredSet.setVisibility(R.id.ok, ConstraintSet.VISIBLE);
        triggeredSet.connect(R.id.whiteBG, ConstraintSet.TOP, R.id.guidline, ConstraintSet.TOP);
    }

    public void help(View view) {
        TransitionManager.beginDelayedTransition(constraint);
        triggeredSet.applyTo(constraint);
    }

}
