package com.ramavathubalaji.coolcalcy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button C;
    private Button equal;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private EditText info;
    private TextView result;
    private Button per;
    private Button dot;
    private Button AC;
    private Button tog;

    private final char ADD='+';
    private final char SUB='-';
    private final char MUL='*';
    private final char DIV='/';
    private final char PER='%';
    private final char TOG='`';
    private final char EQUAL=0;
    int t=0;
    private char ACTION='_';
    double val1=Double.NaN;
    double val2=Double.NaN;
    double r=Double.NaN;
   // EditText mEdit = (EditText) findViewById(R.id.etinfo);
    //mEdit.setEnabled(false);
    public void compute()
    {

            switch (ACTION)
            {
                case ADD:
                    info.setText(val1+val2+"");
                    break;
                case SUB:
                    info.setText(val1-val2+"");
                    break;
                case MUL:
                    info.setText(val1*val2+"");
                    break;
                case DIV:
                    info.setText(val1/val2+"");
                    break;
                case PER:
                    info.setText(val1/100+"");
                    break;
                case TOG:
                    info.setText(val1*(-1)+"");
                case EQUAL:
                    break;
            }



    }

    public void setupUIviews() {
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        zero = (Button) findViewById(R.id.btn0);
        C = (Button) findViewById(R.id.btnC);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsub);
        mul = (Button) findViewById(R.id.btnmul);
        div = (Button) findViewById(R.id.btndiv);
        equal = (Button) findViewById(R.id.btnequal);
        info=(EditText) findViewById(R.id.etinfo);
        per=(Button)  findViewById(R.id.btnper);
        dot=(Button)  findViewById(R.id.btndot);
        AC=(Button)  findViewById(R.id.btnAC);
        tog=(Button)  findViewById(R.id.btntog);
        result=(TextView) findViewById(R.id.tvresult);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIviews();



        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }

                if(result.getText().equals(""))
                {
                    info.setText("0.");
                    result.setText("0.");
                    t=1;

                }
                else
                {
                    if(t==0)
                    {
                        info.setText(info.getText().toString()+".");
                        result.setText(result.getText().toString()+".");
                        t=1;
                    }
                }


            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"1");
                result.setText(result.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"2");
                result.setText(result.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"3");
                result.setText(result.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"4");
                result.setText(result.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"5");
                result.setText(result.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"6");
                result.setText(result.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"7");
                result.setText(result.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"8");
                result.setText(result.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"9");
                result.setText(result.getText().toString()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION== EQUAL||ACTION== PER||ACTION== TOG) {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    r=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                    ACTION='_';
                    t=0;
                }
                info.setText(info.getText().toString()+"0");
                result.setText(result.getText().toString()+"0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //val1=Double.parseDouble(info.getText().toString());
                try{
                    if(info==null)
                    {
                        info.setText("");
                    }
                    else
                    {
                        if(ACTION=='_')
                        {
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=ADD;
                            info.setText(null);
                        }
                        else
                        {
                            val2=Double.parseDouble(info.getText().toString());
                            compute();
                            //result.setText(result.getText().toString()+"+");
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=ADD;
                            info.setText(null);

                        }

                    }
                    result.setText(result.getText().toString()+"+");
                }
                catch (Exception e) {}
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(info==null)
                    {
                        info.setText("");
                    }
                    else
                    {
                        if(ACTION=='_')
                        {
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=SUB;
                            info.setText(null);
                        }
                        else
                        {
                            val2=Double.parseDouble(info.getText().toString());
                            compute();
                            //result.setText(result.getText().toString()+"+");
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=SUB;
                            info.setText(null);

                        }

                    }
                    result.setText(result.getText().toString()+"-");
                }
                catch (Exception e)
                {}
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(info==null)
                    {
                        info.setText("");
                    }
                    else
                    {
                        if(ACTION=='_')
                        {
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=MUL;
                            info.setText(null);
                        }
                        else
                        {
                            val2=Double.parseDouble(info.getText().toString());
                            compute();
                            //result.setText(result.getText().toString()+"+");
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=MUL;
                            info.setText(null);

                        }

                    }
                    result.setText(result.getText().toString()+"x");
                }
                catch (Exception e)
                {

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(info==null)
                    {
                        info.setText("");
                    }
                    else
                    {
                        if(ACTION=='_')
                        {
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=DIV;
                            info.setText(null);
                        }
                        else
                        {
                            val2=Double.parseDouble(info.getText().toString());
                            compute();
                            //result.setText(result.getText().toString()+"+");
                            val1=Double.parseDouble(info.getText().toString());
                            ACTION=DIV;
                            info.setText(null);

                        }

                    }
                    result.setText(result.getText().toString()+"/");
                }
                catch (Exception e)
                {}
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(info==null)
                    {
                        info.setText("");
                    }
                    else
                    {
                        val1=Double.parseDouble(info.getText().toString());
                        ACTION=PER;
                        compute();
                        result.setText(null);
                    }
                }
                catch (Exception e)
                {}
                //result.setText(result.getText().toString()+"%");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    val2=Double.parseDouble(info.getText().toString());
                    compute();
                    ACTION=EQUAL;
                }
                catch (Exception e) {}



            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(info.getText().length() > 0&&ACTION!=EQUAL){
                        CharSequence name = info.getText().toString();
                        info.setText(name.subSequence(0, name.length()-1));
                        result.setText(result.getText().toString().subSequence(0, result.length()-1));
                    }
                    else{
                        val1 = Double.NaN;
                        val2 = Double.NaN;
                        r=Double.NaN;
                        t=0;
                        ACTION='_';
                        info.setText(null);
                        result.setText(null);
                    }
                }
                catch (Exception e)
                {}
            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                r=Double.NaN;
                info.setText(null);
                result.setText(null);
                ACTION='_';
                t=0;
            }
        });
        tog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    val1=Double.parseDouble(info.getText().toString());
                    ACTION=TOG;
                    compute();
                    result.setText(null);
                }
                catch (Exception e)
                {}
            }
        });

    }



}
