package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float value1,value2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edt1=findViewById(R.id.edt1);
        Button button1=findViewById(R.id.btn1);
        Button button2=findViewById(R.id.btn2);
        Button button3=findViewById(R.id.btn3);
        Button button4=findViewById(R.id.btn4);
        Button button5=findViewById(R.id.btn5);
        Button button6=findViewById(R.id.btn6);
        Button button7=findViewById(R.id.btn7);
        Button button8=findViewById(R.id.btn8);
        Button button9=findViewById(R.id.btn9);
        Button button10=findViewById(R.id.btn10);
        Button buttonadd=findViewById(R.id.btn11);
        Button buttonsub=findViewById(R.id.btn22);
        Button buttonmul=findViewById(R.id.btn33);
        Button button0=findViewById(R.id.btn0);
        Button buttonC=findViewById(R.id.btnC);
        Button buttondiv=findViewById(R.id.btn44);
        Button buttoneq=findViewById(R.id.btn55);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"4");
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"5");
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"6");
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"7");
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"8");
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"9");
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+".");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText("");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1==null){
                    edt1.setText("");
                }
                else {
                    value1=Float.parseFloat((edt1.getText()+" "));
                    add=true;
                    edt1.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1==null){
                    edt1.setText("");
                }
                else {
                    value1=Float.parseFloat((edt1.getText()+" "));
                    sub=true;
                    edt1.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1==null){
                    edt1.setText("");
                }
                else {
                    value1=Float.parseFloat((edt1.getText()+" "));
                    mul=true;
                    edt1.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1==null){
                    edt1.setText(" ");
                }
                else {
                    value1=Float.parseFloat((edt1.getText()+" "));
                    div=true;
                    edt1.setText(null);
                }
            }
        });

        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2=Float.parseFloat(edt1.getText()+"");
                if (add=true)
                {
                    edt1.setText(value1+value2+"");
                    add=false;
                }

                if (sub==true)
                {
                    edt1.setText(value1-value2+"");
                    sub=false;
                }

                if (mul==true)
                {
                    edt1.setText(value1*value2+"");
                    mul=false;
                }

                if (div==true)
                {
                    edt1.setText(value1/value2+"");
                    div=false;
                }

            }
        });




    }

}