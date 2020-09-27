package com.med.calculatordemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_main)
    TextView tvMain;
    @BindView(R.id.btnOne)
    Button btnOne;
    @BindView(R.id.btnTwo)
    Button btnTwo;
    @BindView(R.id.btnThree)
    Button btnThree;
    @BindView(R.id.btnPlus)
    Button btnPlus;
    @BindView(R.id.btnFour)
    Button btnFour;
    @BindView(R.id.btnFive)
    Button btnFive;
    @BindView(R.id.btnSix)
    Button btnSix;
    @BindView(R.id.btnMinus)
    Button btnMinus;
    @BindView(R.id.btnSeven)
    Button btnSeven;
    @BindView(R.id.btnEight)
    Button btnEight;
    @BindView(R.id.btnNine)
    Button btnNine;
    @BindView(R.id.btnMulti)
    Button btnMulti;
    @BindView(R.id.btnEqual)
    Button btnEqual;
    @BindView(R.id.btnZero)
    Button btnZero;
    @BindView(R.id.btnClear)
    Button btnClear;
    @BindView(R.id.btnDivide)
    Button btnDivide;

    String mainText="";
    double ans = 0;

    ArrayList<String> listOperator = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        listOperator.add("+");

    }




    public void calculation(String mainText){

        StringTokenizer st = new StringTokenizer(mainText, "[+-*/]");
//        String firstValue = st.nextToken();
//        String secondValue = st.nextToken();

        Iterator<String> itr = listOperator.iterator();

        while(st.hasMoreTokens()){
            String currentOperator = itr.next();
            String token = st.nextToken();
            double dToken = Double.parseDouble(token);
            if (currentOperator.equalsIgnoreCase("+"))
                ans = ans + dToken;
            else if (currentOperator.equalsIgnoreCase("-"))
                ans = ans - dToken;
            else if (currentOperator.equalsIgnoreCase("*"))
                ans = ans * dToken;
            else if (currentOperator.equalsIgnoreCase("/"))
                ans = ans / dToken;
        }

        tvMain.setText(ans+"");


//        String data = mainText;
//        String[] items = data.split()
//        for (String item : items)
//        {
//            System.out.println("item = " + item);
//        }

//        double nFirst = Double.parseDouble(firstValue);
//        double nSecond = Double.parseDouble(secondValue);
//
//        if(operator.equalsIgnoreCase("+")){
//             ans = nFirst + nSecond;
//            tvMain.setText(ans+"");
//        }else if(operator.equalsIgnoreCase("-")){
//            ans = nFirst - nSecond;
//            tvMain.setText(ans+"");
//        }else if(operator.equalsIgnoreCase("*")){
//            ans = nFirst * nSecond;
//            tvMain.setText(ans+"");
//        }else if(operator.equalsIgnoreCase("/")){
//            ans = nFirst / nSecond;
//            tvMain.setText(ans+"");
//        }
    }





    @OnClick({R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnPlus, R.id.btnFour, R.id.btnFive, R.id.btnSix, R.id.btnMinus, R.id.btnSeven, R.id.btnEight, R.id.btnNine, R.id.btnMulti, R.id.btnEqual, R.id.btnZero, R.id.btnClear, R.id.btnDivide})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                tvMain.append("1");
                break;
            case R.id.btnTwo:
                tvMain.append("2");
                break;
            case R.id.btnThree:
                tvMain.append("3");
                break;
            case R.id.btnPlus:
                tvMain.append("+");
                listOperator.add("+");
                break;
            case R.id.btnFour:
                tvMain.append("4");
                break;
            case R.id.btnFive:
                tvMain.append("5");
                break;
            case R.id.btnSix:
                tvMain.append("6");
                break;
            case R.id.btnMinus:
                tvMain.append("-");
                listOperator.add("-");
                break;
            case R.id.btnSeven:
                tvMain.append("7");
                break;
            case R.id.btnEight:
                tvMain.append("8");
                break;
            case R.id.btnNine:
                tvMain.append("9");
                break;
            case R.id.btnMulti:
                tvMain.append("*");
                listOperator.add("*");
                break;
            case R.id.btnEqual:
                mainText = tvMain.getText().toString();
                calculation(mainText);
                break;
            case R.id.btnZero:
                tvMain.append("0");
                break;
            case R.id.btnClear:
                tvMain.setText("");
                ans = 0;
                listOperator.clear();
                listOperator.add("+");
                break;
            case R.id.btnDivide:
                tvMain.append("/");
                listOperator.add("/");
                break;
        }
    }



}
