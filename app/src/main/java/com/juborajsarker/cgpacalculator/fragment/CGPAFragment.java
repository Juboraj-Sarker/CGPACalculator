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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.juborajsarker.cgpacalculator.R;
import com.juborajsarker.cgpacalculator.dialog.ViewDialog2;


public class CGPAFragment extends Fragment {

    InterstitialAd mInterstitialAd;

    View view;

    TextView addSemesterTV, resetSemesterTV, cgpaCalculateTV;

    LinearLayout cgpaCalculateLayout;

    LinearLayout cRaw1, cRaw2, cRaw3, cRaw4, cRaw5, cRaw6, cRaw7, cRaw8,
            cRaw9, cRaw10, cRaw11, cRaw12;

    EditText cCredit1ET, cCredit2ET, cCredit3ET, cCredit4ET, cCredit5ET, cCredit6ET, cCredit7ET, cCredit8ET,
            cCredit9ET, cCredit10ET, cCredit11ET, cCredit12ET;

    EditText cSGPA_ET1,cSGPA_ET2, cSGPA_ET3, cSGPA_ET4, cSGPA_ET5, cSGPA_ET6, cSGPA_ET7,
            cSGPA_ET8, cSGPA_ET9, cSGPA_ET10, cSGPA_ET11, cSGPA_ET12;


    int addSemesterBtnClickCount = 2;

    boolean finish = false;
    boolean permission1, permission2, permission3, permission4, permission5, permission6, permission7, permission8, permission9,
            permission10, permission11, permission12 = false;

    boolean creditEmpty = false, sgpaEmpty = false;
    boolean credit1Empty, credit2Empty, credit3Empty, credit4Empty, credit5Empty, credit6Empty, credit7Empty, credit8Empty, credit9Empty,
            credit10Empty, credit11Empty , credit12Empty;
    boolean sgpa1Empty, sgpa2Empty, sgpa3Empty, sgpa4Empty, sgpa5Empty, sgpa6Empty, sgpa7Empty,sgpa8Empty, sgpa9Empty,
            sgpa10Empty, sgpa11Empty , sgpa12Empty;
    boolean sgpaBoundaryCross = false;
    boolean cross1, cross2, cross3, cross4, cross5, cross6, cross7, cross8, cross9, cross10, cross11, cross12;

    float credit1, credit2, credit3, credit4, credit5, credit6, credit7, credit8, credit9, credit10, credit11, credit12;
    float sgpa1, sgpa2, sgpa3, sgpa4, sgpa5, sgpa6, sgpa7, sgpa8, sgpa9, sgpa10, sgpa11, sgpa12;



    public CGPAFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_cgpa, container, false);

        init();

        return view;
    }

    private void init() {

        addSemesterTV = (TextView) view.findViewById(R.id.add_semester_TV);
        resetSemesterTV = (TextView) view.findViewById(R.id.reset_semester_TV);
        cgpaCalculateTV = (TextView) view.findViewById(R.id.cgpa_calculate_TV);

        cgpaCalculateLayout = (LinearLayout) view.findViewById(R.id.cgpa_calculate_layout);

        cRaw1 = (LinearLayout) view.findViewById(R.id.c_raw_1);
        cRaw2 = (LinearLayout) view.findViewById(R.id.c_raw_2);
        cRaw3 = (LinearLayout) view.findViewById(R.id.c_raw_3);
        cRaw4 = (LinearLayout) view.findViewById(R.id.c_raw_4);
        cRaw5 = (LinearLayout) view.findViewById(R.id.c_raw_5);
        cRaw6 = (LinearLayout) view.findViewById(R.id.c_raw_6);
        cRaw7 = (LinearLayout) view.findViewById(R.id.c_raw_7);
        cRaw8 = (LinearLayout) view.findViewById(R.id.c_raw_8);
        cRaw9 = (LinearLayout) view.findViewById(R.id.c_raw_9);
        cRaw10 = (LinearLayout) view.findViewById(R.id.c_raw_10);
        cRaw11 = (LinearLayout) view.findViewById(R.id.c_raw_11);
        cRaw12 = (LinearLayout) view.findViewById(R.id.c_raw_12);

        cCredit1ET = (EditText) view.findViewById(R.id.c_credit_ET1);
        cCredit2ET = (EditText) view.findViewById(R.id.c_credit_ET2);
        cCredit3ET = (EditText) view.findViewById(R.id.c_credit_ET3);
        cCredit4ET = (EditText) view.findViewById(R.id.c_credit_ET4);
        cCredit5ET = (EditText) view.findViewById(R.id.c_credit_ET5);
        cCredit6ET = (EditText) view.findViewById(R.id.c_credit_ET6);
        cCredit7ET = (EditText) view.findViewById(R.id.c_credit_ET7);
        cCredit8ET = (EditText) view.findViewById(R.id.c_credit_ET8);
        cCredit9ET = (EditText) view.findViewById(R.id.c_credit_ET9);
        cCredit10ET = (EditText) view.findViewById(R.id.c_credit_ET10);
        cCredit11ET = (EditText) view.findViewById(R.id.c_credit_ET11);
        cCredit12ET = (EditText) view.findViewById(R.id.c_credit_ET12);


        cSGPA_ET1 = (EditText) view.findViewById(R.id.c_sgpa_ET1);
        cSGPA_ET2 = (EditText) view.findViewById(R.id.c_sgpa_ET2);
        cSGPA_ET3 = (EditText) view.findViewById(R.id.c_sgpa_ET3);
        cSGPA_ET4 = (EditText) view.findViewById(R.id.c_sgpa_ET4);
        cSGPA_ET5 = (EditText) view.findViewById(R.id.c_sgpa_ET5);
        cSGPA_ET6 = (EditText) view.findViewById(R.id.c_sgpa_ET6);
        cSGPA_ET7 = (EditText) view.findViewById(R.id.c_sgpa_ET7);
        cSGPA_ET8 = (EditText) view.findViewById(R.id.c_sgpa_ET8);
        cSGPA_ET9 = (EditText) view.findViewById(R.id.c_sgpa_ET9);
        cSGPA_ET10 = (EditText) view.findViewById(R.id.c_sgpa_ET10);
        cSGPA_ET11 = (EditText) view.findViewById(R.id.c_sgpa_ET11);
        cSGPA_ET12 = (EditText) view.findViewById(R.id.c_sgpa_ET12);


        addSemesterTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addNewSemester();
            }
        });

        resetSemesterTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetAll();
            }
        });


        cgpaCalculateTV.setOnClickListener(new View.OnClickListener() {
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


                calculateCGPA();
            }
        });


        cgpaCalculateLayout.setOnClickListener(new View.OnClickListener() {
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

                calculateCGPA();

            }
        });


    }



    private void resetAll() {

        cRaw3.setVisibility(LinearLayout.GONE);
        cRaw4.setVisibility(LinearLayout.GONE);
        cRaw5.setVisibility(LinearLayout.GONE);
        cRaw6.setVisibility(LinearLayout.GONE);
        cRaw7.setVisibility(LinearLayout.GONE);
        cRaw8.setVisibility(LinearLayout.GONE);
        cRaw9.setVisibility(LinearLayout.GONE);
        cRaw10.setVisibility(LinearLayout.GONE);
        cRaw11.setVisibility(LinearLayout.GONE);
        cRaw12.setVisibility(LinearLayout.GONE);

        cCredit1ET.setText("");
        cCredit2ET.setText("");
        cCredit3ET.setText("");
        cCredit4ET.setText("");
        cCredit5ET.setText("");
        cCredit6ET.setText("");
        cCredit7ET.setText("");
        cCredit8ET.setText("");
        cCredit9ET.setText("");
        cCredit10ET.setText("");
        cCredit11ET.setText("");
        cCredit12ET.setText("");

        cSGPA_ET1.setText("");
        cSGPA_ET2.setText("");
        cSGPA_ET3.setText("");
        cSGPA_ET4.setText("");
        cSGPA_ET5.setText("");
        cSGPA_ET6.setText("");
        cSGPA_ET7.setText("");
        cSGPA_ET8.setText("");
        cSGPA_ET9.setText("");
        cSGPA_ET10.setText("");
        cSGPA_ET11.setText("");
        cSGPA_ET12.setText("");

        finish = false;

        permission1 = false;
        permission2 = false;
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

        addSemesterBtnClickCount = 2;
    }

    private void addNewSemester() {

        switch (++addSemesterBtnClickCount) {

            case 3: {
                cRaw3.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 4: {
                cRaw4.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 5: {
                cRaw5.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 6: {
                cRaw6.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 7: {
                cRaw7.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 8: {
                cRaw8.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 9: {
                cRaw9.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 10: {
                cRaw10.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 11: {
                cRaw11.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;
            }
            case 12: {
                cRaw12.setVisibility(LinearLayout.VISIBLE);
                finish = false;
                break;

            }default:{

                Toast.makeText(getContext(), "Maximum number of Semester has been added", Toast.LENGTH_SHORT).show();
            }

        }
    }




    @RequiresApi(api = Build.VERSION_CODES.N)
    private void calculateCGPA() {

        getCreditAndSGPA();

        if (cRaw3.getVisibility() == View.VISIBLE){


            finish = false;

            if (cCredit3ET.getText().toString().equals("")){


                credit3Empty = true;
                cCredit3ET.setError("Required");

            }else {


                credit3Empty = false;
                credit3 = Float.parseFloat(cCredit3ET.getText().toString());
            }



            if (cSGPA_ET3.getText().toString().equals("")){


                sgpa3Empty = true;
                cSGPA_ET3.setError("Required");

            }else {



                sgpa3Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET3.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET3.setError("SGPA can't greater than must 5.0");
                    cross3 = true;

                }else {


                    sgpa3 = Float.parseFloat(cSGPA_ET3.getText().toString());

                    cross3 = false;
                }

            }








        }else {

            finish = true;

            if ( !credit1Empty && !sgpa1Empty && !cross1 && !credit2Empty && !sgpa2Empty && !cross2 ){



                float totalPoint1 = credit1 * sgpa1;
                float totalPoint2 = credit2 * sgpa2;

                float totalCredit = credit1 + credit2 ;
                float totalPoint = totalPoint1 + totalPoint2 ;


                float cgpa = totalPoint / totalCredit ;
                float totalSGPA = sgpa1 + sgpa2;



                String finalTotalCredit = String.format("%.2f", totalCredit);
                String finalTotalSGPA = String.format("%.2f", totalSGPA);
                String finalCGPA = String.format("%.2f", cgpa);


                ViewDialog2 alert2 = new ViewDialog2();
                alert2.showDialog(getActivity(),2, finalTotalCredit, finalTotalSGPA, finalCGPA);


            }

        }





        if (cRaw4.getVisibility() == View.VISIBLE){


            if (cCredit4ET.getText().toString().equals("")){

                credit4Empty = true;
                cCredit4ET.setError("Required");
            }else {

                credit4Empty = false;
                credit4 = Float.parseFloat(cCredit4ET.getText().toString());
            }



            if (cSGPA_ET4.getText().toString().equals("")){

                sgpa4Empty = true;
                cSGPA_ET4.setError("Required");

            }else {

                sgpa4Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET4.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET4.setError("SGPA can't greater than must 5.0");
                    cross4= true;

                }else {


                    sgpa4 = Float.parseFloat(cSGPA_ET4.getText().toString());

                    cross4 = false;
                }
            }








        }else {



            if (!finish || permission3){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3  ){

                    finish = true;
                    permission3 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;

                    float totalCredit = credit1 + credit2 + credit3 ;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 ;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3;


                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),3, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }





        if (cRaw5.getVisibility() == View.VISIBLE){


            if (cCredit5ET.getText().toString().equals("")){

                credit5Empty = true;
                cCredit5ET.setError("Required");
            }else {

                credit5Empty = false;
                credit5 = Float.parseFloat(cCredit5ET.getText().toString());
            }



            if (cSGPA_ET5.getText().toString().equals("")){

                sgpa5Empty = true;
                cSGPA_ET5.setError("Required");

            }else {

                sgpa5Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET5.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET5.setError("SGPA can't greater than must 5.0");
                    cross5 = true;

                }else {


                    sgpa5 = Float.parseFloat(cSGPA_ET5.getText().toString());

                    cross5 = false;
                }
            }








        }else {



            if (!finish || permission4){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  ){

                    finish = true;
                    permission4 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 ;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 ;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4;


                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),4, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }




        if (cRaw6.getVisibility() == View.VISIBLE){


            if (cCredit6ET.getText().toString().equals("")){

                credit6Empty = true;
                cCredit6ET.setError("Required");
            }else {

                credit6Empty = false;
                credit6 = Float.parseFloat(cCredit6ET.getText().toString());
            }



            if (cSGPA_ET6.getText().toString().equals("")){

                sgpa6Empty = true;
                cSGPA_ET6.setError("Required");
            }else {

                sgpa6Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET6.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET6.setError("SGPA can't greater than must 5.0");
                    cross6 = true;

                }else {


                    sgpa6 = Float.parseFloat(cSGPA_ET6.getText().toString());

                    cross6 = false;
                }
            }








        }else {



            if (!finish || permission5){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5  ){

                    finish = true;
                    permission5 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 ;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 ;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5;


                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),5, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }





        if (cRaw7.getVisibility() == View.VISIBLE){


            if (cCredit7ET.getText().toString().equals("")){

                credit7Empty = true;
                cCredit7ET.setError("Required");
            }else {

                credit7Empty = false;
                credit7 = Float.parseFloat(cCredit7ET.getText().toString());
            }



            if (cSGPA_ET7.getText().toString().equals("")){

                sgpa7Empty = true;
                cSGPA_ET7.setError("Required");
            }else {

                sgpa7Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET7.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET7.setError("SGPA can't greater than must 5.0");
                    cross7 = true;

                }else {


                    sgpa7 = Float.parseFloat(cSGPA_ET7.getText().toString());

                    cross7 = false;
                }
            }








        }else {



            if (!finish || permission6){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5 &&
                        !credit6Empty && !sgpa6Empty && !cross6 ){

                    finish = true;
                    permission6 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;
                    float totalPoint6 = credit6 * sgpa6;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 ;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 ;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6;



                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),6, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }




        if (cRaw8.getVisibility() == View.VISIBLE){


            if (cCredit8ET.getText().toString().equals("")){

                credit8Empty = true;
                cCredit8ET.setError("Required");
            }else {

                credit8Empty = false;
                credit8 = Float.parseFloat(cCredit8ET.getText().toString());
            }



            if (cSGPA_ET8.getText().toString().equals("")){

                sgpa8Empty = true;
                cSGPA_ET8.setError("Required");
            }else {

                sgpa8Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET8.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET8.setError("SGPA can't greater than must 5.0");
                    cross8 = true;

                }else {


                    sgpa8 = Float.parseFloat(cSGPA_ET8.getText().toString());

                    cross8 = false;
                }
            }








        }else {



            if (!finish || permission7){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5 &&
                        !credit6Empty && !sgpa6Empty && !cross6 &&
                        !credit7Empty && !sgpa7Empty && !cross7  ){

                    finish = true;
                    permission7 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;
                    float totalPoint6 = credit6 * sgpa6;
                    float totalPoint7 = credit7 * sgpa7;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 ;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 +
                                        totalPoint7;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7;


                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),7, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }




        if (cRaw9.getVisibility() == View.VISIBLE){


            if (cCredit9ET.getText().toString().equals("")){

                credit9Empty = true;
                cCredit9ET.setError("Required");
            }else {

                credit9Empty = false;
                credit9 = Float.parseFloat(cCredit9ET.getText().toString());
            }



            if (cSGPA_ET9.getText().toString().equals("")){

                sgpa9Empty = true;
                cSGPA_ET9.setError("Required");
            }else {

                sgpa9Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET9.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET9.setError("SGPA can't greater than must 5.0");
                    cross9 = true;

                }else {


                    sgpa9 = Float.parseFloat(cSGPA_ET9.getText().toString());

                    cross9 = false;
                }
            }








        }else {



            if (!finish || permission8){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5 &&
                        !credit6Empty && !sgpa6Empty && !cross6 &&
                        !credit7Empty && !sgpa7Empty && !cross7 &&
                        !credit8Empty && !sgpa8Empty && !cross8 ){

                    finish = true;
                    permission8 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;
                    float totalPoint6 = credit6 * sgpa6;
                    float totalPoint7 = credit7 * sgpa7;
                    float totalPoint8 = credit8 * sgpa8;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 ;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 +
                            totalPoint7 + totalPoint8;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7 + sgpa8;



                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),8, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }




        if (cRaw10.getVisibility() == View.VISIBLE){


            if (cCredit10ET.getText().toString().equals("")){

                credit10Empty = true;
                cCredit10ET.setError("Required");
            }else {

                credit10Empty = false;
                credit10 = Float.parseFloat(cCredit10ET.getText().toString());
            }



            if (cSGPA_ET10.getText().toString().equals("")){

                sgpa10Empty = true;
                cSGPA_ET10.setError("Required");
            }else {

                sgpa10Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET10.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET10.setError("SGPA can't greater than must 5.0");
                    cross10 = true;

                }else {


                    sgpa10 = Float.parseFloat(cSGPA_ET10.getText().toString());

                    cross10 = false;
                }
            }








        }else {



            if (!finish || permission9){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5 &&
                        !credit6Empty && !sgpa6Empty && !cross6 &&
                        !credit7Empty && !sgpa7Empty && !cross7 &&
                        !credit8Empty && !sgpa8Empty && !cross8 &&
                        !credit9Empty && !sgpa9Empty && !cross9 ){

                    finish = true;
                    permission9 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;
                    float totalPoint6 = credit6 * sgpa6;
                    float totalPoint7 = credit7 * sgpa7;
                    float totalPoint8 = credit8 * sgpa8;
                    float totalPoint9 = credit9 * sgpa9;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 +
                                         credit9;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 +
                            totalPoint7 + totalPoint8 + totalPoint9;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7 + sgpa8 + sgpa9;



                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),9, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }




        if (cRaw11.getVisibility() == View.VISIBLE){


            if (cCredit11ET.getText().toString().equals("")){

                credit11Empty = true;
                cCredit11ET.setError("Required");
            }else {

                credit11Empty = false;
                credit11 = Float.parseFloat(cCredit11ET.getText().toString());
            }



            if (cSGPA_ET11.getText().toString().equals("")){

                sgpa11Empty = true;
                cSGPA_ET11.setError("Required");
            }else {

                sgpa11Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET11.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET11.setError("SGPA can't greater than must 5.0");
                    cross11 = true;

                }else {


                    sgpa11 = Float.parseFloat(cSGPA_ET11.getText().toString());

                    cross11 = false;
                }
            }








        }else {



            if (!finish || permission10){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5 &&
                        !credit6Empty && !sgpa6Empty && !cross6 &&
                        !credit7Empty && !sgpa7Empty && !cross7 &&
                        !credit8Empty && !sgpa8Empty && !cross8 &&
                        !credit9Empty && !sgpa9Empty && !cross9 &&
                        !credit10Empty && !sgpa10Empty && !cross10 ){

                    finish = true;
                    permission10 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;
                    float totalPoint6 = credit6 * sgpa6;
                    float totalPoint7 = credit7 * sgpa7;
                    float totalPoint8 = credit8 * sgpa8;
                    float totalPoint9 = credit9 * sgpa9;
                    float totalPoint10 = credit10 * sgpa10;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 +
                            credit9 + credit10;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 +
                            totalPoint7 + totalPoint8 + totalPoint9 + totalPoint10;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7 + sgpa8 + sgpa9 + sgpa10;



                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),10, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }




        if (cRaw12.getVisibility() == View.VISIBLE){


            if (cCredit12ET.getText().toString().equals("")){

                credit12Empty = true;
                cCredit12ET.setError("Required");
            }else {

                credit12Empty = false;
                credit12 = Float.parseFloat(cCredit12ET.getText().toString());
            }



            if (cSGPA_ET12.getText().toString().equals("")){

                sgpa12Empty = true;
                cSGPA_ET12.setError("Required");

            }else {

                sgpa12Empty = false;
                float sgpaBoundary = Float.parseFloat(cSGPA_ET12.getText().toString());

                if (sgpaBoundary > 5.0){

                    cSGPA_ET12.setError("SGPA can't greater than must 5.0");
                    cross12 = true;

                }else {


                    sgpa12 = Float.parseFloat(cSGPA_ET12.getText().toString());

                    cross12 = false;
                }

                doFinal();
            }








        }else {



            if (!finish || permission11){


                if ( !credit1Empty && !sgpa1Empty && !cross1 &&
                        !credit2Empty && !sgpa2Empty && !cross2  &&
                        !credit3Empty && !sgpa3Empty && !cross3 &&
                        !credit4Empty && !sgpa4Empty && !cross4  &&
                        !credit5Empty && !sgpa5Empty && !cross5 &&
                        !credit6Empty && !sgpa6Empty && !cross6 &&
                        !credit7Empty && !sgpa7Empty && !cross7 &&
                        !credit8Empty && !sgpa8Empty && !cross8 &&
                        !credit9Empty && !sgpa9Empty && !cross9 &&
                        !credit10Empty && !sgpa10Empty && !cross10 &&
                        !credit11Empty && !sgpa11Empty && !cross11 ){

                    finish = true;
                    permission11 = true;

                    float totalPoint1 = credit1 * sgpa1;
                    float totalPoint2 = credit2 * sgpa2;
                    float totalPoint3 = credit3 * sgpa3;
                    float totalPoint4 = credit4 * sgpa4;
                    float totalPoint5 = credit5 * sgpa5;
                    float totalPoint6 = credit6 * sgpa6;
                    float totalPoint7 = credit7 * sgpa7;
                    float totalPoint8 = credit8 * sgpa8;
                    float totalPoint9 = credit9 * sgpa9;
                    float totalPoint10 = credit10 * sgpa10;
                    float totalPoint11 = credit11 * sgpa11;

                    float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 +
                            credit9 + credit10 + credit11;
                    float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 +
                            totalPoint7 + totalPoint8 + totalPoint9 + totalPoint10 + totalPoint11;

                    float cgpa = totalPoint / totalCredit ;

                    float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7 + sgpa8 + sgpa9 + sgpa10 + sgpa11;



                    String finalTotalCredit = String.format("%.2f", totalCredit);
                    String finalTotalSGPA = String.format("%.2f", totalSGPA);
                    String finalCGPA = String.format("%.2f", cgpa);


                    ViewDialog2 alert2 = new ViewDialog2();
                    alert2.showDialog(getActivity(),11, finalTotalCredit, finalTotalSGPA, finalCGPA);

                }

            }


        }





















    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void doFinal() {


        if (!credit1Empty && !sgpa1Empty && !cross1 &&
                !credit2Empty && !sgpa2Empty && !cross2  &&
                !credit3Empty && !sgpa3Empty && !cross3 &&
                !credit4Empty && !sgpa4Empty && !cross4  &&
                !credit5Empty && !sgpa5Empty && !cross5 &&
                !credit6Empty && !sgpa6Empty && !cross6 &&
                !credit7Empty && !sgpa7Empty && !cross7 &&
                !credit8Empty && !sgpa8Empty && !cross8 &&
                !credit9Empty && !sgpa9Empty && !cross9 &&
                !credit10Empty && !sgpa10Empty && !cross10 &&
                !credit11Empty && !sgpa11Empty && !cross11 &&
                !credit12Empty && !sgpa12Empty && !cross12 )


        {

            finish = true;
            permission11 = true;

            float totalPoint1 = credit1 * sgpa1;
            float totalPoint2 = credit2 * sgpa2;
            float totalPoint3 = credit3 * sgpa3;
            float totalPoint4 = credit4 * sgpa4;
            float totalPoint5 = credit5 * sgpa5;
            float totalPoint6 = credit6 * sgpa6;
            float totalPoint7 = credit7 * sgpa7;
            float totalPoint8 = credit8 * sgpa8;
            float totalPoint9 = credit9 * sgpa9;
            float totalPoint10 = credit10 * sgpa10;
            float totalPoint11 = credit11 * sgpa11;
            float totalPoint12 = credit12 * sgpa12;

            float totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 +
                    credit9 + credit10 + credit11 + credit12;
            float totalPoint = totalPoint1 + totalPoint2 + totalPoint3 + totalPoint4 + totalPoint5 + totalPoint6 +
                    totalPoint7 + totalPoint8 + totalPoint9 + totalPoint10 + totalPoint11 + totalPoint12;

            float cgpa = totalPoint / totalCredit ;

            float totalSGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7 + sgpa8 + sgpa9 + sgpa10 + sgpa11 + sgpa12;


            String finalTotalCredit = String.format("%.2f", totalCredit);
            String finalTotalSGPA = String.format("%.2f", totalSGPA);
            String finalCGPA = String.format("%.2f", cgpa);


            ViewDialog2 alert2 = new ViewDialog2();
            alert2.showDialog(getActivity(),12, finalTotalCredit, finalTotalSGPA, finalCGPA);



        }else {


            Toast.makeText(getContext(), "Error... Please check ", Toast.LENGTH_SHORT).show();
        }




    }

    private void getCreditAndSGPA() {


        if (cCredit1ET.getText().toString().equals("")){

            credit1Empty = true;
            cCredit1ET.setError("Required");

        }else {

            credit1Empty = false;
            credit1 = Float.parseFloat(cCredit1ET.getText().toString());
        }





        if (cCredit2ET.getText().toString().equals("")){


            credit2Empty = true;
            cCredit2ET.setError("Required");
        }else {

            credit2Empty = false;
            credit2 = Float.parseFloat(cCredit2ET.getText().toString());
        }




        if (cSGPA_ET1.getText().toString().equals("")){

            sgpa1Empty = true;
            cSGPA_ET1.setError("Required");

        }else {

            sgpa1Empty = false;
            float sgpaBoundary = Float.parseFloat(cSGPA_ET1.getText().toString());

            if (sgpaBoundary > 5.0){

                cSGPA_ET1.setError("SGPA can't greater than must 5.0");
                cross1 = true;

            }else {


                sgpa1 = Float.parseFloat(cSGPA_ET1.getText().toString());
                cross1 = false;
            }

        }



        if (cSGPA_ET2.getText().toString().equals("")){

            cSGPA_ET2.setError("Required");
            sgpa2Empty = true;

        }else {

            sgpa2Empty = false;
            float sgpaBoundary = Float.parseFloat(cSGPA_ET2.getText().toString());

            if (sgpaBoundary > 5.0){

                cSGPA_ET2.setError("SGPA can't greater than must 5.0");
                cross2 = true;

            }else {


                sgpa2 = Float.parseFloat(cSGPA_ET2.getText().toString());

                cross2 = false;
            }



        }





    }



    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }





}
