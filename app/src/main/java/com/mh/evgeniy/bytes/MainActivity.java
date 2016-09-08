package com.mh.evgeniy.bytes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mNumbersTextView;
    Button mButtonMod;
    Button mButtonA;
    Button mButtonB;
    Button mButtonC;
    Button mButtonD;
    Button mButtonE;
    Button mButtonF;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mButton0;
    Button mButtonDelLeft;
    Button mButtonDel;
    Button mButtonChangeSign;
    Button mButtonLeftBracket;
    Button mButtonRightBracket;
    Button mButtonDiv;
    Button mButtonRoL;
    Button mButtonRor;
    Button mButtonMul;
    Button mButtonOr;
    Button mButtonXor;
    Button mButtonMinus;
    Button mButtonLsh;
    Button mButtonRsh;
    Button mButtonComma;
    Button mButtonPlus;
    Button mButtonNot;
    Button mButtonAnd;
    Button mButtonEqual;
    Button mButtonSqrt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUI();
    }

    private void InitUI(){
        mNumbersTextView=(TextView)findViewById(R.id.numbersTextView);
        mButtonMod=(Button) findViewById(R.id.buttonMod);
        mButtonA=(Button) findViewById(R.id.buttonA);
        mButtonB=(Button) findViewById(R.id.buttonB);
        mButtonC=(Button) findViewById(R.id.buttonC);
        mButtonD=(Button) findViewById(R.id.buttonD);
        mButtonE=(Button) findViewById(R.id.buttonE);
        mButtonF=(Button) findViewById(R.id.buttonF);
        mButton1=(Button) findViewById(R.id.button1);
        mButton2=(Button) findViewById(R.id.button2);
        mButton3=(Button) findViewById(R.id.button3);
        mButton4=(Button) findViewById(R.id.button4);
        mButton5=(Button) findViewById(R.id.button5);
        mButton6=(Button) findViewById(R.id.button6);
        mButton7=(Button) findViewById(R.id.button7);
        mButton8=(Button) findViewById(R.id.button8);
        mButton9=(Button) findViewById(R.id.button9);
        mButton0=(Button) findViewById(R.id.button0);
        mButtonDelLeft=(Button) findViewById(R.id.buttonDelLeft);
        mButtonDel=(Button) findViewById(R.id.buttonDel);
        mButtonChangeSign=(Button) findViewById(R.id.buttonChangeSign);
        mButtonLeftBracket=(Button) findViewById(R.id.buttonLeftBracket);
        mButtonRightBracket=(Button) findViewById(R.id.buttonRightBracket);
        mButtonDiv=(Button) findViewById(R.id.buttonDiv);
        mButtonRoL=(Button) findViewById(R.id.buttonRoL);
        mButtonRor=(Button) findViewById(R.id.buttonRor);
        mButtonMul=(Button) findViewById(R.id.buttonMul);
        mButtonOr=(Button) findViewById(R.id.buttonOr);
        mButtonXor=(Button) findViewById(R.id.buttonXor);
        mButtonMinus=(Button) findViewById(R.id.buttonMinus);
        mButtonLsh=(Button) findViewById(R.id.buttonLsh);
        mButtonRsh=(Button) findViewById(R.id.buttonRsh);
        mButtonComma=(Button) findViewById(R.id.buttonComma);
        mButtonPlus=(Button) findViewById(R.id.buttonPlus);
        mButtonNot=(Button) findViewById(R.id.buttonNot);
        mButtonAnd=(Button) findViewById(R.id.buttonAnd);
        mButtonEqual=(Button) findViewById(R.id.buttonEqual);
        mButtonSqrt=(Button) findViewById(R.id.buttonSqrt);


    }

}
