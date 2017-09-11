package com.juborajsarker.cgpacalculator.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.juborajsarker.cgpacalculator.R;


public class ViewDialog {

    public void showDialog (Activity activity,  int total_courses,
                           float total_credits, float total_grades, float total_cgpa ){

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);


        TextView total_course = (TextView) dialog.findViewById(R.id.total_course_TV);
        TextView total_credit = (TextView) dialog.findViewById(R.id.total_credit_TV);
        TextView total_grade = (TextView) dialog.findViewById(R.id.total_grade_TV);
        TextView cgpa_tv = (TextView) dialog.findViewById(R.id.total_cgpa_TV);



        total_course.setText(String.valueOf(total_courses));
        total_credit.setText(String.valueOf(total_credits));
        total_grade.setText(String.valueOf(total_grades));
        cgpa_tv.setText(String.valueOf(total_cgpa));


        Button dialogButton = (Button) dialog.findViewById(R.id.btn_dialog);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
