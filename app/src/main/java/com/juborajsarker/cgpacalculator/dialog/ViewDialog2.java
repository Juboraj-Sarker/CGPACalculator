package com.juborajsarker.cgpacalculator.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.juborajsarker.cgpacalculator.R;

/**
 * Created by juboraj on 11/09/2017.
 */

public class ViewDialog2 {

    public void showDialog (Activity activity, int total_semester,
                            float total_credits, float total_sgpa, float total_cgpa ){

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_2);


        TextView total_semester_tv = (TextView) dialog.findViewById(R.id.total_semester_TV);
        TextView total_credit_tv = (TextView) dialog.findViewById(R.id.s_total_credit_TV);
        TextView sgpa_tv = (TextView) dialog.findViewById(R.id.s_total_sgpa_TV);
        TextView cgpa_tv = (TextView) dialog.findViewById(R.id.s_total_cgpa_TV);



        total_semester_tv.setText(String.valueOf(total_semester));
        total_credit_tv.setText(String.valueOf(total_credits));
        sgpa_tv.setText(String.valueOf(total_sgpa));
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

