package com.mh.evgeniy.bytes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

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

    private View.OnClickListener numbOnClickListener;
    private HashMap<Button,String> mButtonStringHashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUI();
    }

    private void InitUI(){
        mButtonStringHashMap=new HashMap<>();

        mNumbersTextView=(TextView)findViewById(R.id.numbersTextView);
        mButtonMod=(Button) findViewById(R.id.buttonMod);

        mButtonA=(Button) findViewById(R.id.buttonA);
        mButtonStringHashMap.put(mButtonA,"A");

        mButtonB=(Button) findViewById(R.id.buttonB);
        mButtonStringHashMap.put(mButtonB,"B");

        mButtonC=(Button) findViewById(R.id.buttonC);
        mButtonStringHashMap.put(mButtonC,"C");

        mButtonD=(Button) findViewById(R.id.buttonD);
        mButtonStringHashMap.put(mButtonD,"D");

        mButtonE=(Button) findViewById(R.id.buttonE);
        mButtonStringHashMap.put(mButtonE,"E");

        mButtonF=(Button) findViewById(R.id.buttonF);
        mButtonStringHashMap.put(mButtonF,"F");

        mButton1=(Button) findViewById(R.id.button1);
        mButtonStringHashMap.put(mButton1,"1");

        mButton2=(Button) findViewById(R.id.button2);
        mButtonStringHashMap.put(mButton2,"2");

        mButton3=(Button) findViewById(R.id.button3);
        mButtonStringHashMap.put(mButton3,"3");

        mButton4=(Button) findViewById(R.id.button4);
        mButtonStringHashMap.put(mButton4,"4");

        mButton5=(Button) findViewById(R.id.button5);
        mButtonStringHashMap.put(mButton5,"5");

        mButton6=(Button) findViewById(R.id.button6);
        mButtonStringHashMap.put(mButton6,"6");

        mButton7=(Button) findViewById(R.id.button7);
        mButtonStringHashMap.put(mButton7,"7");

        mButton8=(Button) findViewById(R.id.button8);
        mButtonStringHashMap.put(mButton8,"8");

        mButton9=(Button) findViewById(R.id.button9);
        mButtonStringHashMap.put(mButton9,"9");

        mButton0=(Button) findViewById(R.id.button0);
        mButtonStringHashMap.put(mButton0,"0");

        mButtonDelLeft=(Button) findViewById(R.id.buttonDelLeft);

        mButtonDel=(Button) findViewById(R.id.buttonDel);
        mButtonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersTextView.setText("");
            }
        });

        mButtonChangeSign=(Button) findViewById(R.id.buttonChangeSign);

        mButtonLeftBracket=(Button) findViewById(R.id.buttonLeftBracket);
        mButtonStringHashMap.put(mButtonLeftBracket,"(");

        mButtonRightBracket=(Button) findViewById(R.id.buttonRightBracket);
        mButtonStringHashMap.put(mButtonRightBracket,")");

        mButtonDiv=(Button) findViewById(R.id.buttonDiv);
        mButtonStringHashMap.put(mButtonDiv,"/");

        mButtonRoL=(Button) findViewById(R.id.buttonRoL);
        mButtonRor=(Button) findViewById(R.id.buttonRor);

        mButtonMul=(Button) findViewById(R.id.buttonMul);
        mButtonStringHashMap.put(mButtonMul,"*");

        mButtonOr=(Button) findViewById(R.id.buttonOr);
        mButtonXor=(Button) findViewById(R.id.buttonXor);

        mButtonMinus=(Button) findViewById(R.id.buttonMinus);
        mButtonStringHashMap.put(mButtonMinus,"-");

        mButtonLsh=(Button) findViewById(R.id.buttonLsh);
        mButtonRsh=(Button) findViewById(R.id.buttonRsh);

        mButtonComma=(Button) findViewById(R.id.buttonComma);
        mButtonStringHashMap.put(mButtonComma,",");

        mButtonPlus=(Button) findViewById(R.id.buttonPlus);
        mButtonStringHashMap.put(mButtonPlus,"+");

        mButtonNot=(Button) findViewById(R.id.buttonNot);
        mButtonAnd=(Button) findViewById(R.id.buttonAnd);

        mButtonEqual=(Button) findViewById(R.id.buttonEqual);
        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compute();
            }
        });

        mButtonSqrt=(Button) findViewById(R.id.buttonSqrt);
        mButtonStringHashMap.put(mButtonSqrt,"√");

        numbOnClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mButtonStringHashMap.containsKey (v)){
                    mNumbersTextView.append(mButtonStringHashMap.get(v));
                }

            }
        };

        for(Map.Entry<Button,String> entry: mButtonStringHashMap.entrySet()){
            Button b=entry.getKey();
            b.setOnClickListener(numbOnClickListener);
        }
    }

    private void Compute(){
        String text= mNumbersTextView.getText().toString();

        //while(!text.isEmpty()){
            if(text.contains("*")) {
                int mulInd=text.indexOf("*");

                String tempDigit1="";
                int temp=mulInd+1;
                int lastInd=0;
                while (temp<text.length() && Character.isDigit(text.charAt(temp))){ //получение числа справа от знака *
                    tempDigit1=tempDigit1+text.charAt(temp);
                    temp++;
                    lastInd=temp;
                }

                String tempDigit2="";
                temp=mulInd-1;
                while (temp>=0 && Character.isDigit(text.charAt(temp))){ //получение числа слева от знака *
                    tempDigit2=tempDigit2+text.charAt(temp);
                    temp--;
                }
                tempDigit2=new StringBuilder(tempDigit2).reverse().toString();

                int result=Integer.parseInt(tempDigit2)*Integer.parseInt(tempDigit1);
                text=text.substring(lastInd);
                text=result+text;

                mNumbersTextView.setText(text);

                Log.d("Computzz","mulInd="+mulInd);
                Log.d("Computzz","tempDigit1="+tempDigit1);
                Log.d("Computzz","tempDigit2="+tempDigit2);
            }

        //}

    }


}
