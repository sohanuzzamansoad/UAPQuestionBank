package com.soad.uapquestionbank.civil;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.soad.uapquestionbank.Constants;
import com.soad.uapquestionbank.R;

import androidx.appcompat.app.AppCompatActivity;

public class Semester_CIVIL extends AppCompatActivity {
    public static String semester =null;
    public static void buttonEffect(View button){
        button.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(Color.rgb(255, 56, 131), PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        v.getBackground().clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_semester_cse);
        TextView dept = (TextView) findViewById(R.id.dept);
        Button ast_sem = (Button) findViewById(R.id.ast_sem);
        Button bnd_sem = (Button) findViewById(R.id.bnd_sem);
        Button crd_sem = (Button) findViewById(R.id.crd_sem);
        Button dth_sem = (Button) findViewById(R.id.dth_sem);
        Button eth_sem = (Button) findViewById(R.id.eth_sem);
        Button fth_sem = (Button) findViewById(R.id.fth_sem);
        Button gth_sem = (Button) findViewById(R.id.gth_sem);
        Button hth_sem = (Button) findViewById(R.id.hth_sem);
        dept.setText("Civil Engineering");




        ast_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(1);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_First.class);
                startActivity(in);
            }
        });

        bnd_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(2);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Second.class);
                startActivity(in);
            }
        });

        crd_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(3);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Third.class);
                startActivity(in);
            }
        });

        dth_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(4);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Fourth.class);
                startActivity(in);
            }
        });

        eth_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(5);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Fifth.class);
                startActivity(in);
            }
        });

        fth_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(6);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Sixth.class);
                startActivity(in);
            }
        });


        gth_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(7);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Seventh.class);
                startActivity(in);
            }
        });

        hth_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setSem(8);
                buttonEffect(v);
                Intent in = new Intent(Semester_CIVIL.this, ViewQuestion_CIVIL_Eighth.class);
                startActivity(in);
            }
        });


    }
}
