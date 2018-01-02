package com.juborajsarker.cgpacalculator.fragment;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.juborajsarker.cgpacalculator.R;
import com.juborajsarker.cgpacalculator.dialog.ViewDialog;


public class SGPAFragment extends Fragment {

    InterstitialAd mInterstitialAd;

    TextView addCourse, calculateTV, resetCourseTV;
    LinearLayout calculateLayout;
    ScrollView scroll;

    boolean finish = false;
    boolean permission3, permission4, permission5, permission6, permission7, permission8, permission9, permission10,
            permission11, permission12, permission13, permission14, permission15 = false;
    boolean stringEmpty = false;
    boolean gpaEmpty = false;

    LinearLayout s_Raw_3, s_Raw_4, s_Raw_5, s_Raw_6, s_Raw_7, s_Raw_8, s_Raw_9, s_Raw_10,
            s_Raw_11, s_Raw_12, s_Raw_13, s_Raw_14, s_Raw_15;

    EditText creditET1, creditET2, creditET3, creditET4, creditET5, creditET6, creditET7, creditET8, creditET9, creditET10,
            creditET11, creditET12, creditET13, creditET14, creditET15;

    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10,
            spinner11, spinner12, spinner13, spinner14, spinner15;


    int addCourseBtnClickCount = 2;

    float gpa1, gpa2, gpa3, gpa4, gpa5, gpa6, gpa7, gpa8, gpa9, gpa10, gpa11, gpa12, gpa13, gpa14, gpa15;

    float credit1, credit2, credit3, credit4, credit5, credit6, credit7, credit8, credit9, credit10,
            credit11, credit12, credit13, credit14, credit15;

    float point1, point2, point3, point4, point5, point6, point7, point8, point9, point10,
            point11, point12, point13, point14, point15;

    int g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15;

    View view;


    public SGPAFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_sgpa, container, false);

        init();

        return view;
    }

    private void init() {

        addCourse = (TextView) view.findViewById(R.id.add_course_TV);
        calculateTV = (TextView) view.findViewById(R.id.calculate_TV);
        resetCourseTV = (TextView) view.findViewById(R.id.reset_course_TV);
        calculateLayout = (LinearLayout) view.findViewById(R.id.calculate_layout);
        scroll = (ScrollView) view.findViewById(R.id.scroll_view);

        s_Raw_3 = (LinearLayout) view.findViewById(R.id.s_raw_3);
        s_Raw_4 = (LinearLayout) view.findViewById(R.id.s_row_4);
        s_Raw_5 = (LinearLayout) view.findViewById(R.id.s_row_5);
        s_Raw_6 = (LinearLayout) view.findViewById(R.id.s_row_6);
        s_Raw_7 = (LinearLayout) view.findViewById(R.id.s_row_7);
        s_Raw_8 = (LinearLayout) view.findViewById(R.id.s_row_8);
        s_Raw_9 = (LinearLayout) view.findViewById(R.id.s_row_9);
        s_Raw_10 = (LinearLayout) view.findViewById(R.id.s_row_10);
        s_Raw_11 = (LinearLayout) view.findViewById(R.id.s_row_11);
        s_Raw_12 = (LinearLayout) view.findViewById(R.id.s_row_12);
        s_Raw_13 = (LinearLayout) view.findViewById(R.id.s_row_13);
        s_Raw_14 = (LinearLayout) view.findViewById(R.id.s_row_14);
        s_Raw_15 = (LinearLayout) view.findViewById(R.id.s_row_15);

        creditET1 = (EditText) view.findViewById(R.id.s_credit_ET1);
        creditET2 = (EditText) view.findViewById(R.id.s_credit_ET2);
        creditET3 = (EditText) view.findViewById(R.id.s_credit_ET3);
        creditET4 = (EditText) view.findViewById(R.id.s_credit_ET4);
        creditET5 = (EditText) view.findViewById(R.id.s_credit_ET5);
        creditET6 = (EditText) view.findViewById(R.id.s_credit_ET6);
        creditET7 = (EditText) view.findViewById(R.id.s_credit_ET7);
        creditET8 = (EditText) view.findViewById(R.id.s_credit_ET8);
        creditET9 = (EditText) view.findViewById(R.id.s_credit_ET9);
        creditET10 = (EditText) view.findViewById(R.id.s_credit_ET10);
        creditET11 = (EditText) view.findViewById(R.id.s_credit_ET11);
        creditET12 = (EditText) view.findViewById(R.id.s_credit_ET12);
        creditET13 = (EditText) view.findViewById(R.id.s_credit_ET13);
        creditET14 = (EditText) view.findViewById(R.id.s_credit_ET14);
        creditET15 = (EditText) view.findViewById(R.id.s_credit_ET15);

        spinner1 = (Spinner) view.findViewById(R.id.s_spinner1);
        spinner2 = (Spinner) view.findViewById(R.id.s_spinner2);
        spinner3 = (Spinner) view.findViewById(R.id.s_spinner3);
        spinner4 = (Spinner) view.findViewById(R.id.s_spinner4);
        spinner5 = (Spinner) view.findViewById(R.id.s_spinner5);
        spinner6 = (Spinner) view.findViewById(R.id.s_spinner6);
        spinner7 = (Spinner) view.findViewById(R.id.s_spinner7);
        spinner8 = (Spinner) view.findViewById(R.id.s_spinner8);
        spinner9 = (Spinner) view.findViewById(R.id.s_spinner9);
        spinner10 = (Spinner) view.findViewById(R.id.s_spinner10);
        spinner11 = (Spinner) view.findViewById(R.id.s_spinner11);
        spinner12 = (Spinner) view.findViewById(R.id.s_spinner12);
        spinner13 = (Spinner) view.findViewById(R.id.s_spinner13);
        spinner14 = (Spinner) view.findViewById(R.id.s_spinner14);
        spinner15 = (Spinner) view.findViewById(R.id.s_spinner15);


        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addNewCourse();

            }


        });


        calculateTV.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {


                mInterstitialAd = new InterstitialAd(getContext());
                mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

                AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build(); //add test device
                mInterstitialAd.loadAd(adRequest);

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        showInterstitial();
                    }
                });



                calculateSGPA();





            }
        });


        calculateLayout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {



                mInterstitialAd = new InterstitialAd(getContext());
                mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

                AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build(); //add test device
                mInterstitialAd.loadAd(adRequest);

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        showInterstitial();
                    }
                });



                calculateSGPA();




            }
        });


        resetCourseTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetAll();
            }
        });


    }

    private void resetAll() {

        s_Raw_3.setVisibility(LinearLayout.GONE);
        s_Raw_4.setVisibility(LinearLayout.GONE);
        s_Raw_5.setVisibility(LinearLayout.GONE);
        s_Raw_6.setVisibility(LinearLayout.GONE);
        s_Raw_7.setVisibility(LinearLayout.GONE);
        s_Raw_8.setVisibility(LinearLayout.GONE);
        s_Raw_9.setVisibility(LinearLayout.GONE);
        s_Raw_10.setVisibility(LinearLayout.GONE);
        s_Raw_11.setVisibility(LinearLayout.GONE);
        s_Raw_12.setVisibility(LinearLayout.GONE);
        s_Raw_13.setVisibility(LinearLayout.GONE);
        s_Raw_14.setVisibility(LinearLayout.GONE);
        s_Raw_15.setVisibility(LinearLayout.GONE);


        finish = false;

        permission3 = false;
        permission4 = false;
        permission5 = false;
        permission6 = false;
        permission7 = false;
        permission8 = false;
        permission9 = false;
        permission10 = false;
        permission11 = false;
        permission12 = false;
        permission13 = false;
        permission14 = false;
        permission15 = false;

        creditET1.setText("");
        creditET2.setText("");
        creditET3.setText("");
        creditET4.setText("");
        creditET5.setText("");
        creditET6.setText("");
        creditET7.setText("");
        creditET8.setText("");
        creditET9.setText("");
        creditET10.setText("");
        creditET10.setText("");
        creditET12.setText("");
        creditET13.setText("");
        creditET14.setText("");
        creditET15.setText("");

        spinner1.setSelection(0);
        spinner2.setSelection(0);
        spinner3.setSelection(0);
        spinner4.setSelection(0);
        spinner5.setSelection(0);
        spinner6.setSelection(0);
        spinner7.setSelection(0);
        spinner8.setSelection(0);
        spinner9.setSelection(0);
        spinner10.setSelection(0);
        spinner11.setSelection(0);
        spinner12.setSelection(0);
        spinner13.setSelection(0);
        spinner14.setSelection(0);
        spinner15.setSelection(0);

        addCourseBtnClickCount = 2;
    }


    private void addNewCourse() {

        switch (++addCourseBtnClickCount) {

            case 3: {
                s_Raw_3.setVisibility(LinearLayout.VISIBLE);
                s_Raw_3.requestFocus();
                finish = false;
                break;
            }
            case 4: {
                s_Raw_4.setVisibility(LinearLayout.VISIBLE);
                s_Raw_4.requestFocus();
                finish = false;
                break;
            }
            case 5: {
                s_Raw_5.setVisibility(LinearLayout.VISIBLE);
                s_Raw_5.requestFocus();
                finish = false;
                break;
            }
            case 6: {
                s_Raw_6.setVisibility(LinearLayout.VISIBLE);
                s_Raw_6.requestFocus();
                finish = false;
                break;
            }
            case 7: {
                s_Raw_7.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                finish = false;
                break;
            }
            case 8: {
                s_Raw_8.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                finish = false;
                break;
            }
            case 9: {
                s_Raw_9.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }
            case 10: {
                s_Raw_10.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }
            case 11: {
                s_Raw_11.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }
            case 12: {
                s_Raw_12.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }
            case 13: {
                s_Raw_13.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }
            case 14: {
                s_Raw_14.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }
            case 15: {
                s_Raw_15.setVisibility(LinearLayout.VISIBLE);
                addCourse.requestFocus();
                scroll.fullScroll(View.FOCUS_DOWN);
                finish = false;
                break;
            }

            default:{

                Toast.makeText(getContext(), "Maximum number of Course has been added", Toast.LENGTH_SHORT).show();
            }


        }
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    private void calculateSGPA() {


        getGradeGPA();

        if (creditET1.getText().toString().equals("")) {

            creditET1.setError("Required");
            stringEmpty = true;

        } else {

            credit1 = Float.parseFloat(creditET1.getText().toString());
            stringEmpty = false;


        }


        if (creditET2.getText().toString().equals("")) {

            creditET2.setError("Required");
            stringEmpty = true;

        } else {

            credit2 = Float.parseFloat(creditET2.getText().toString());
            stringEmpty = false;

        }



        if (s_Raw_3.getVisibility() == View.VISIBLE){

            if (creditET3.getText().toString().equals("")) {

                creditET3.setError("Required");
                stringEmpty = true;

            } else {

                credit3 = Float.parseFloat(creditET3.getText().toString());
                stringEmpty = false;

            }

        }else {




            if (!stringEmpty && !gpaEmpty){



                finish = true;
                float totalCredit = credit1 + credit2 ;

                point1 = gpa1 * credit1 ;
                point2 = gpa2 * credit2 ;

                float totalPoint = point1 + point2;
                float sGPA = totalPoint / totalCredit;

               // DecimalFormat decimalFormat = new DecimalFormat("0.00");
               // float finalSGPA = Float.valueOf(decimalFormat.format(sGPA));
               // float finalTotalPoint = Float.valueOf(decimalFormat.format(totalPoint));
               // float finalTotalCredit = Float.valueOf(decimalFormat.format(totalCredit));


//                String roundOffTo2DecPlaces(float val)
//                {
//                    return String.format("%.2f", val);
//                }

                String totalSGPA = String.format("%.2f", sGPA);
                String finalTotalPoint = String.format("%.2f", totalPoint);
                String finalTotalCredit = String.format("%.2f", totalCredit);



                ViewDialog alert = new ViewDialog();
                alert.showDialog(getActivity(),2, finalTotalCredit, finalTotalPoint, totalSGPA);
            }
        }



        if (!finish || permission3){

            if (s_Raw_4.getVisibility() == View.VISIBLE){

                if (creditET4.getText().toString().equals("")) {

                    creditET4.setError("Required");
                    stringEmpty = true;

                } else {

                    credit4 = Float.parseFloat(creditET4.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission3 = true;
                    float totalCredit = credit1 + credit2 + credit3 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;

                    float totalPoint = point1 + point2 + point3;
                    float sGPA = totalPoint / totalCredit;





                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),3, finalTotalCredit, finalTotalPoint, totalSGPA);
                }


            }
        }




        if (!finish || permission4){

            if (s_Raw_5.getVisibility() == View.VISIBLE){

                if (creditET5.getText().toString().equals("")) {

                    creditET5.setError("Required");
                    stringEmpty = true;

                } else {

                    credit5 = Float.parseFloat(creditET5.getText().toString());
                    stringEmpty = false;
                }

            }else {

                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission4 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;

                    float totalPoint = point1 + point2 + point3 + point4;
                    float sGPA = totalPoint / totalCredit;




                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),4, finalTotalCredit, finalTotalPoint, totalSGPA);
                }


            }

        }




        if (!finish || permission5){

            if (s_Raw_6.getVisibility() == View.VISIBLE){

                if (creditET6.getText().toString().equals("")) {

                    creditET6.setError("Required");
                    stringEmpty = true;

                } else {

                    credit6 = Float.parseFloat(creditET6.getText().toString());
                    stringEmpty = false;
                }

            }else {

                if (! stringEmpty && ! gpaEmpty){

                    permission5 = true;
                    finish = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5;
                    float sGPA = totalPoint / totalCredit;





                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),5, finalTotalCredit, finalTotalPoint, totalSGPA);

                }


            }

        }



        if (!finish || permission6){


            if (s_Raw_7.getVisibility() == View.VISIBLE){

                if (creditET7.getText().toString().equals("")) {

                    creditET7.setError("Required");
                    stringEmpty = true;

                } else {

                    credit7 = Float.parseFloat(creditET7.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission6 = true;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6;
                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),6, finalTotalCredit, finalTotalPoint, totalSGPA);
                }

            }
        }




        if (!finish || permission7){

            if (s_Raw_8.getVisibility() == View.VISIBLE){

                if (creditET8.getText().toString().equals("")) {

                    creditET8.setError("Required");
                    stringEmpty = true;

                } else {

                    credit8 = Float.parseFloat(creditET8.getText().toString());
                    stringEmpty = false;
                }

            }else {

                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission7 = true;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7;
                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),7, finalTotalCredit, finalTotalPoint, totalSGPA);
                }
            }
        }




        if (!finish || permission8){


            if (s_Raw_9.getVisibility() == View.VISIBLE){

                if (creditET9.getText().toString().equals("")) {

                    creditET9.setError("Required");
                    stringEmpty = true;

                } else {

                    credit9 = Float.parseFloat(creditET9.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && !gpaEmpty ){

                    finish = true;
                    permission8 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8;
                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),8, finalTotalCredit, finalTotalPoint, totalSGPA);
                }

            }

        }



        if (!finish || permission9){



            if (s_Raw_10.getVisibility() == View.VISIBLE){

                if (creditET10.getText().toString().equals("")) {

                    creditET10.setError("Required");
                    stringEmpty = true;

                } else {

                    credit10 = Float.parseFloat(creditET10.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission9 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;
                    point9 = gpa9 * credit9 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9;
                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),9, finalTotalCredit, finalTotalPoint, totalSGPA);
                }

            }
        }




        if (!finish || permission10){


            if (s_Raw_11.getVisibility() == View.VISIBLE){

                if (creditET11.getText().toString().equals("")) {

                    creditET11.setError("Required");
                    stringEmpty = true;
                } else {

                    credit11 = Float.parseFloat(creditET11.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission10 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 ;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;
                    point9 = gpa9 * credit9 ;
                    point10 = gpa10 * credit10 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10;
                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),10, finalTotalCredit, finalTotalPoint, totalSGPA);
                }


            }

        }




        if (!finish || permission11){


            if (s_Raw_12.getVisibility() == View.VISIBLE){

                if (creditET12.getText().toString().equals("")) {

                    creditET12.setError("Required");
                    stringEmpty = true;

                } else {

                    credit12 = Float.parseFloat(creditET12.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission11 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 +
                            credit11;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;
                    point9 = gpa9 * credit9 ;
                    point10 = gpa10 * credit10 ;
                    point11 = gpa11 * credit11 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10 +
                            point11;
                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),11, finalTotalCredit, finalTotalPoint, totalSGPA);
                }

            }

        }




        if (!finish || permission12){


            if (s_Raw_13.getVisibility() == View.VISIBLE){

                if (creditET13.getText().toString().equals("")) {

                    creditET13.setError("Required");
                    stringEmpty = true;

                } else {

                    credit13 = Float.parseFloat(creditET13.getText().toString());
                    stringEmpty = false;
                }

            }else {



                if (! stringEmpty && ! gpaEmpty){


                    finish = true;
                    permission12 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 +
                            credit11 + credit12;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;
                    point9 = gpa9 * credit9 ;
                    point10 = gpa10 * credit10 ;
                    point11 = gpa11 * credit11 ;
                    point12 = gpa12 * credit12 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10 +
                            point11 + point12;

                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),12, finalTotalCredit, finalTotalPoint, totalSGPA);
                }

            }




        }




        if (!finish || permission13){


            if (s_Raw_14.getVisibility() == View.VISIBLE){

                if (creditET14.getText().toString().equals("")) {

                    creditET14.setError("Required");
                    stringEmpty = true;

                } else {

                    credit14 = Float.parseFloat(creditET14.getText().toString());
                    stringEmpty = false;
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission13 = true;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 +
                            credit11 + credit12 + credit13;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;
                    point9 = gpa9 * credit9 ;
                    point10 = gpa10 * credit10 ;
                    point11 = gpa11 * credit11 ;
                    point12 = gpa12 * credit12 ;
                    point13 = gpa13 * credit13 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10 +
                            point11 + point12 + point13;

                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),13, finalTotalCredit, finalTotalPoint, totalSGPA);;
                }

            }


        }





        if (!finish || permission14){


            if (s_Raw_15.getVisibility() == View.VISIBLE){

                if (creditET15.getText().toString().equals("")) {

                    creditET15.setError("Required");
                    stringEmpty = true;

                } else {

                    credit15 = Float.parseFloat(creditET15.getText().toString());
                    stringEmpty = false;
                    doLast();
                }

            }else {


                if (! stringEmpty && ! gpaEmpty){

                    finish = true;
                    permission14 = true;
                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 +
                            credit11 + credit12 + credit13 + credit14;

                    point1 = gpa1 * credit1 ;
                    point2 = gpa2 * credit2 ;
                    point3 = gpa3 * credit3 ;
                    point4 = gpa4 * credit4 ;
                    point5 = gpa5 * credit5 ;
                    point6 = gpa6 * credit6 ;
                    point7 = gpa7 * credit7 ;
                    point8 = gpa8 * credit8 ;
                    point9 = gpa9 * credit9 ;
                    point10 = gpa10 * credit10 ;
                    point11 = gpa11 * credit11 ;
                    point12 = gpa12 * credit12 ;
                    point13 = gpa13 * credit13 ;
                    point14 = gpa13 * credit14 ;

                    float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10 +
                            point11 + point12 + point13 + point14;

                    float sGPA = totalPoint / totalCredit;

                    String totalSGPA = String.format("%.2f", sGPA);
                    String finalTotalPoint = String.format("%.2f", totalPoint);
                    String finalTotalCredit = String.format("%.2f", totalCredit);



                    ViewDialog alert = new ViewDialog();
                    alert.showDialog(getActivity(),14, finalTotalCredit, finalTotalPoint, totalSGPA);

                }

            }
        }












    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void doLast() {


        float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 +
                credit11 + credit12 + credit13 + credit14 + credit15;

        point1 = gpa1 * credit1 ;
        point2 = gpa2 * credit2 ;
        point3 = gpa3 * credit3 ;
        point4 = gpa4 * credit4 ;
        point5 = gpa5 * credit5 ;
        point6 = gpa6 * credit6 ;
        point7 = gpa7 * credit7 ;
        point8 = gpa8 * credit8 ;
        point9 = gpa9 * credit9 ;
        point10 = gpa10 * credit10 ;
        point11 = gpa11 * credit11 ;
        point12 = gpa12 * credit12 ;
        point13 = gpa13 * credit13 ;
        point14 = gpa13 * credit14 ;
        point15 = gpa15 * credit15 ;

        float totalPoint = point1 + point2 + point3 + point4 + point5 + point6 + point7 + point8 + point9 + point10 +
                point11 + point12 + point13 + point14 + point15;

        float sGPA = totalPoint / totalCredit;

        String totalSGPA = String.format("%.2f", sGPA);
        String finalTotalPoint = String.format("%.2f", totalPoint);
        String finalTotalCredit = String.format("%.2f", totalCredit);



        ViewDialog alert = new ViewDialog();
        alert.showDialog(getActivity(),15, finalTotalCredit, finalTotalPoint, totalSGPA);

    }


    private void getGradeGPA() {


         g1 = spinner1.getSelectedItemPosition();
         g2 = spinner2.getSelectedItemPosition();
         g3 = spinner3.getSelectedItemPosition();
         g4 = spinner4.getSelectedItemPosition();
         g5 = spinner5.getSelectedItemPosition();
         g6 = spinner6.getSelectedItemPosition();
         g7 = spinner7.getSelectedItemPosition();
         g8 = spinner8.getSelectedItemPosition();
         g9 = spinner9.getSelectedItemPosition();
         g10 = spinner10.getSelectedItemPosition();
         g11 = spinner11.getSelectedItemPosition();
         g12 = spinner12.getSelectedItemPosition();
         g13 = spinner13.getSelectedItemPosition();
         g14 = spinner14.getSelectedItemPosition();
         g15 = spinner15.getSelectedItemPosition();

        if (g1 == 0) {

            Toast.makeText(getContext(), "Please enter a valid GPA in Course 1", Toast.LENGTH_SHORT).show();
            gpaEmpty = true;

        } else if (g1 == 1) {

            gpa1 = (float) 4.00;
            gpaEmpty = false;

        } else if (g1 == 2) {

            gpa1 = (float) 3.75;
            gpaEmpty = false;

        } else if (g1 == 3) {

            gpa1 = (float) 3.50;
            gpaEmpty = false;


        } else if (g1 == 4) {

            gpa1 = (float) 3.25;
            gpaEmpty = false;

        } else if (g1 == 5) {

            gpa1 = (float) 3.00;
            gpaEmpty = false;

        } else if (g1 == 6) {

            gpa1 = (float) 2.75;
            gpaEmpty = false;

        } else if (g1 == 7) {

            gpa1 = (float) 2.50;
            gpaEmpty = false;

        } else if (g1 == 8) {

            gpa1 = (float) 2.25;
            gpaEmpty = false;

        } else if (g1 == 9) {

            gpa1 = (float) 2.00;
            gpaEmpty = false;

        } else if (g1 == 10) {

            gpa1 = (float) 0.00;
            gpaEmpty = false;
        }


        if (g2 == 0) {

            gpaEmpty = true;
            Toast.makeText(getContext(), "Please enter a valid GPA in Course 2", Toast.LENGTH_SHORT).show();

        } else if (g2 == 1) {

            gpa2 = (float) 4.00;
            gpaEmpty = false;

        } else if (g2 == 2) {

            gpa2 = (float) 3.75;
            gpaEmpty = false;

        } else if (g2 == 3) {

            gpa2 = (float) 3.50;
            gpaEmpty = false;


        } else if (g2 == 4) {

            gpa2 = (float) 3.25;
            gpaEmpty = false;

        } else if (g2 == 5) {

            gpa2 = (float) 3.00;
            gpaEmpty = false;

        } else if (g2 == 6) {

            gpa2 = (float) 2.75;
            gpaEmpty = false;

        } else if (g2 == 7) {

            gpa2 = (float) 2.50;
            gpaEmpty = false;

        } else if (g2 == 8) {

            gpa2 = (float) 2.25;
            gpaEmpty = false;

        } else if (g2 == 9) {

            gpa2 = (float) 2.00;
            gpaEmpty = false;

        } else if (g2 == 10) {

            gpa2 = (float) 0.00;
            gpaEmpty = false;
        }


        if (s_Raw_3.getVisibility() == View.VISIBLE){


            if (g3 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 3", Toast.LENGTH_SHORT).show();

            } else if (g3 == 1) {

                gpa3 = (float) 4.00;
                gpaEmpty = false;

            } else if (g3 == 2) {

                gpa3 = (float) 3.75;
                gpaEmpty = false;

            } else if (g3 == 3) {

                gpa3 = (float) 3.50;
                gpaEmpty = false;


            } else if (g3 == 4) {

                gpa3 = (float) 3.25;
                gpaEmpty = false;

            } else if (g3 == 5) {

                gpa3 = (float) 3.00;
                gpaEmpty = false;

            } else if (g3 == 6) {

                gpa3 = (float) 2.75;
                gpaEmpty = false;

            } else if (g3 == 7) {

                gpa3 = (float) 2.50;
                gpaEmpty = false;

            } else if (g3 == 8) {

                gpa3 = (float) 2.25;
                gpaEmpty = false;

            } else if (g3 == 9) {

                gpa3 = (float) 2.00;
                gpaEmpty = false;

            } else if (g3 == 10) {

                gpa3 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_4.getVisibility() == View.VISIBLE){


            if (g4 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 4", Toast.LENGTH_SHORT).show();

            } else if (g4 == 1) {

                gpa4 = (float) 4.00;
                gpaEmpty = false;

            } else if (g4 == 2) {

                gpa4 = (float) 3.75;
                gpaEmpty = false;

            } else if (g4 == 3) {

                gpa4 = (float) 3.50;
                gpaEmpty = false;

            } else if (g4 == 4) {

                gpa4 = (float) 3.25;
                gpaEmpty = false;

            } else if (g4 == 5) {

                gpa4 = (float) 3.00;
                gpaEmpty = false;

            } else if (g4 == 6) {

                gpa4 = (float) 2.75;
                gpaEmpty = false;

            } else if (g4 == 7) {

                gpa4 = (float) 2.50;
                gpaEmpty = false;

            } else if (g4 == 8) {

                gpa4 = (float) 2.25;
                gpaEmpty = false;

            } else if (g4 == 9) {

                gpa4 = (float) 2.00;
                gpaEmpty = false;

            } else if (g4 == 10) {

                gpa4 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_5.getVisibility() == View.VISIBLE){

            if (g5 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 5", Toast.LENGTH_SHORT).show();

            } else if (g5 == 1) {

                gpa5 = (float) 4.00;
                gpaEmpty = false;

            } else if (g5 == 2) {

                gpa5 = (float) 3.75;
                gpaEmpty = false;

            } else if (g5 == 3) {

                gpa5 = (float) 3.50;
                gpaEmpty = false;

            } else if (g5 == 4) {

                gpa5 = (float) 3.25;
                gpaEmpty = false;

            } else if (g5 == 5) {

                gpa5 = (float) 3.00;
                gpaEmpty = false;

            } else if (g5 == 6) {

                gpa5 = (float) 2.75;
                gpaEmpty = false;

            } else if (g5 == 7) {

                gpa5 = (float) 2.50;
                gpaEmpty = false;

            } else if (g5 == 8) {

                gpa5 = (float) 2.25;
                gpaEmpty = false;

            } else if (g5 == 9) {

                gpa5 = (float) 2.00;
                gpaEmpty = false;

            } else if (g5 == 10) {

                gpa5 = (float) 0.00;
                gpaEmpty = false;
            }


        }




        if (s_Raw_6.getVisibility() == View.VISIBLE){

            if (g6 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 6", Toast.LENGTH_SHORT).show();

            } else if (g6 == 1) {

                gpa6 = (float) 4.00;
                gpaEmpty = false;

            } else if (g6 == 2) {

                gpa6 = (float) 3.75;
                gpaEmpty = false;

            } else if (g6 == 3) {

                gpa6 = (float) 3.50;
                gpaEmpty = false;

            } else if (g6 == 4) {

                gpa6 = (float) 3.25;
                gpaEmpty = false;

            } else if (g6 == 5) {

                gpa6 = (float) 3.00;
                gpaEmpty = false;

            } else if (g6 == 6) {

                gpa6 = (float) 2.75;
                gpaEmpty = false;

            } else if (g6 == 7) {

                gpa6 = (float) 2.50;
                gpaEmpty = false;

            } else if (g6 == 8) {

                gpa6 = (float) 2.25;
                gpaEmpty = false;

            } else if (g6 == 9) {

                gpa6 = (float) 2.00;
                gpaEmpty = false;

            } else if (g6 == 10) {

                gpa6 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_7.getVisibility() == View.VISIBLE){

            if (g7 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 7", Toast.LENGTH_SHORT).show();

            } else if (g7 == 1) {

                gpa7 = (float) 4.00;
                gpaEmpty = false;

            } else if (g7 == 2) {

                gpa7 = (float) 3.75;
                gpaEmpty = false;

            } else if (g7 == 3) {

                gpa7 = (float) 3.50;
                gpaEmpty = false;

            } else if (g7 == 4) {

                gpa7 = (float) 3.25;
                gpaEmpty = false;

            } else if (g7 == 5) {

                gpa7 = (float) 3.00;
                gpaEmpty = false;

            } else if (g7 == 6) {

                gpa7 = (float) 2.75;
                gpaEmpty = false;

            } else if (g7 == 7) {

                gpa7 = (float) 2.50;
                gpaEmpty = false;

            } else if (g7 == 8) {

                gpa7 = (float) 2.25;
                gpaEmpty = false;

            } else if (g7 == 9) {

                gpa7 = (float) 2.00;
                gpaEmpty = false;

            } else if (g7 == 10) {

                gpa7 = (float) 0.00;
                gpaEmpty = false;
            }


        }


        if (s_Raw_8.getVisibility() == View.VISIBLE){

            if (g8 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 8", Toast.LENGTH_SHORT).show();

            } else if (g8 == 1) {

                gpa8 = (float) 4.00;
                gpaEmpty = false;

            } else if (g8 == 2) {

                gpa8 = (float) 3.75;
                gpaEmpty = false;

            } else if (g8 == 3) {

                gpa8 = (float) 3.50;
                gpaEmpty = false;

            } else if (g8 == 4) {

                gpa8 = (float) 3.25;
                gpaEmpty = false;

            } else if (g8 == 5) {

                gpa8 = (float) 3.00;
                gpaEmpty = false;

            } else if (g8 == 6) {

                gpa8 = (float) 2.75;
                gpaEmpty = false;

            } else if (g8 == 7) {

                gpa8 = (float) 2.50;
                gpaEmpty = false;

            } else if (g8 == 8) {

                gpa8 = (float) 2.25;
                gpaEmpty = false;

            } else if (g8 == 9) {

                gpa8 = (float) 2.00;
                gpaEmpty = false;

            } else if (g8 == 10) {

                gpa8 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_9.getVisibility() == View.VISIBLE){

            if (g9 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 9", Toast.LENGTH_SHORT).show();

            } else if (g9 == 1) {

                gpa9 = (float) 4.00;
                gpaEmpty = false;

            } else if (g9 == 2) {

                gpa9 = (float) 3.75;
                gpaEmpty = false;

            } else if (g9 == 3) {

                gpa9 = (float) 3.50;
                gpaEmpty = false;

            } else if (g9 == 4) {

                gpa9 = (float) 3.25;
                gpaEmpty = false;

            } else if (g9 == 5) {

                gpa9 = (float) 3.00;
                gpaEmpty = false;

            } else if (g9 == 6) {

                gpa9 = (float) 2.75;
                gpaEmpty = false;

            } else if (g9 == 7) {

                gpa9 = (float) 2.50;
                gpaEmpty = false;

            } else if (g9 == 8) {

                gpa9 = (float) 2.25;
                gpaEmpty = false;

            } else if (g9 == 9) {

                gpa9 = (float) 2.00;
                gpaEmpty = false;

            } else if (g9 == 10) {

                gpa9 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_10.getVisibility() == View.VISIBLE){

            if (g10 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 10", Toast.LENGTH_SHORT).show();

            } else if (g10 == 1) {

                gpa10 = (float) 4.00;
                gpaEmpty = false;

            } else if (g10 == 2) {

                gpa10 = (float) 3.75;
                gpaEmpty = false;

            } else if (g10 == 3) {

                gpa10 = (float) 3.50;
                gpaEmpty = false;

            } else if (g10 == 4) {

                gpa10 = (float) 3.25;
                gpaEmpty = false;

            } else if (g10 == 5) {

                gpa10 = (float) 3.00;
                gpaEmpty = false;

            } else if (g10 == 6) {

                gpa10 = (float) 2.75;
                gpaEmpty = false;

            } else if (g10 == 7) {

                gpa10 = (float) 2.50;
                gpaEmpty = false;

            } else if (g10 == 8) {

                gpa10 = (float) 2.25;
                gpaEmpty = false;

            } else if (g10 == 9) {

                gpa10 = (float) 2.00;
                gpaEmpty = false;

            } else if (g10 == 10) {

                gpa10 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_11.getVisibility() == View.VISIBLE){

            if (g11 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 11", Toast.LENGTH_SHORT).show();

            } else if (g11 == 1) {

                gpa11 = (float) 4.00;
                gpaEmpty = false;

            } else if (g11 == 2) {

                gpa11 = (float) 3.75;
                gpaEmpty = false;

            } else if (g11 == 3) {

                gpa11 = (float) 3.50;
                gpaEmpty = false;

            } else if (g11 == 4) {

                gpa11 = (float) 3.25;
                gpaEmpty = false;

            } else if (g11 == 5) {

                gpa11 = (float) 3.00;
                gpaEmpty = false;

            } else if (g11 == 6) {

                gpa11 = (float) 2.75;
                gpaEmpty = false;

            } else if (g11 == 7) {

                gpa11 = (float) 2.50;
                gpaEmpty = false;

            } else if (g11 == 8) {

                gpa11 = (float) 2.25;
                gpaEmpty = false;

            } else if (g11 == 9) {

                gpa11 = (float) 2.00;
                gpaEmpty = false;

            } else if (g11 == 10) {

                gpa11 = (float) 0.00;
                gpaEmpty = false;
            }


        }


        if (s_Raw_12.getVisibility() == View.VISIBLE){

            if (g12 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 12", Toast.LENGTH_SHORT).show();

            } else if (g12 == 1) {

                gpa12 = (float) 4.00;
                gpaEmpty = false;

            } else if (g12 == 2) {

                gpa12 = (float) 3.75;
                gpaEmpty = false;

            } else if (g12 == 3) {

                gpa12 = (float) 3.50;
                gpaEmpty = false;

            } else if (g12 == 4) {

                gpa12 = (float) 3.25;
                gpaEmpty = false;

            } else if (g12 == 5) {

                gpa12 = (float) 3.00;
                gpaEmpty = false;

            } else if (g12 == 6) {

                gpa12 = (float) 2.75;
                gpaEmpty = false;

            } else if (g12 == 7) {

                gpa12 = (float) 2.50;
                gpaEmpty = false;

            } else if (g12 == 8) {

                gpa12 = (float) 2.25;
                gpaEmpty = false;

            } else if (g12 == 9) {

                gpa12 = (float) 2.00;
                gpaEmpty = false;

            } else if (g12 == 10) {

                gpa12 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_13.getVisibility() == View.VISIBLE){

            if (g13 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 13", Toast.LENGTH_SHORT).show();

            } else if (g13 == 1) {

                gpa13 = (float) 4.00;
                gpaEmpty = false;

            } else if (g13 == 2) {

                gpa13 = (float) 3.75;
                gpaEmpty = false;

            } else if (g13 == 3) {

                gpa13 = (float) 3.50;
                gpaEmpty = false;

            } else if (g13 == 4) {

                gpa13 = (float) 3.25;
                gpaEmpty = false;

            } else if (g13 == 5) {

                gpa13 = (float) 3.00;
                gpaEmpty = false;

            } else if (g13 == 6) {

                gpa13 = (float) 2.75;
                gpaEmpty = false;

            } else if (g13 == 7) {

                gpa13 = (float) 2.50;
                gpaEmpty = false;

            } else if (g13 == 8) {

                gpa13 = (float) 2.25;
                gpaEmpty = false;

            } else if (g13 == 9) {

                gpa13 = (float) 2.00;
                gpaEmpty = false;

            } else if (g13 == 10) {

                gpa13 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_14.getVisibility() == View.VISIBLE){

            if (g14 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 14", Toast.LENGTH_SHORT).show();

            } else if (g14 == 1) {

                gpa14 = (float) 4.00;
                gpaEmpty = false;

            } else if (g14 == 2) {

                gpa14 = (float) 3.75;
                gpaEmpty = false;

            } else if (g14 == 3) {

                gpa14 = (float) 3.50;
                gpaEmpty = false;

            } else if (g14 == 4) {

                gpa14 = (float) 3.25;
                gpaEmpty = false;

            } else if (g14 == 5) {

                gpa14 = (float) 3.00;
                gpaEmpty = false;

            } else if (g14 == 6) {

                gpa14 = (float) 2.75;
                gpaEmpty = false;

            } else if (g14 == 7) {

                gpa14 = (float) 2.50;
                gpaEmpty = false;

            } else if (g14 == 8) {

                gpa14 = (float) 2.25;
                gpaEmpty = false;

            } else if (g14 == 9) {

                gpa14 = (float) 2.00;
                gpaEmpty = false;

            } else if (g14 == 10) {

                gpa14 = (float) 0.00;
                gpaEmpty = false;
            }


        }



        if (s_Raw_15.getVisibility() == View.VISIBLE){

            if (g15 == 0) {
                gpaEmpty = true;
                Toast.makeText(getContext(), "Please enter a valid GPA in Course 15", Toast.LENGTH_SHORT).show();

            } else if (g15 == 1) {

                gpa15 = (float) 4.00;
                gpaEmpty = false;

            } else if (g15 == 2) {

                gpa15 = (float) 3.75;
                gpaEmpty = false;

            } else if (g15 == 3) {

                gpa15 = (float) 3.50;
                gpaEmpty = false;

            } else if (g15 == 4) {

                gpa15 = (float) 3.25;
                gpaEmpty = false;

            } else if (g15 == 5) {

                gpa15 = (float) 3.00;
                gpaEmpty = false;

            } else if (g15 == 6) {

                gpa15 = (float) 2.75;
                gpaEmpty = false;

            } else if (g15 == 7) {

                gpa15 = (float) 2.50;
                gpaEmpty = false;

            } else if (g15 == 8) {

                gpa15 = (float) 2.25;
                gpaEmpty = false;

            } else if (g15 == 9) {

                gpa15 = (float) 2.00;
                gpaEmpty = false;

            } else if (g15 == 10) {

                gpa15 = (float) 0.00;
                gpaEmpty = false;
            }


        }



    }






    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }













}
