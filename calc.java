package com.example.calculator;


        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import java.lang.Math;


public class MainActivity extends AppCompatActivity{

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, sub, result, equate, dec, mul, div, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = (Button) findViewById(R.id.b0);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        Button b5 = (Button) findViewById(R.id.b5);
        Button b6 = (Button) findViewById(R.id.b6);
        Button b7 = (Button) findViewById(R.id.b7);
        Button b8 = (Button) findViewById(R.id.b8);
        Button b9 = (Button) findViewById(R.id.b9);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button equate = (Button) findViewById(R.id.equals);
        Button dec = (Button) findViewById(R.id.dec);
        Button mul  = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);
        Button clear = (Button) findViewById(R.id.clear);




        TextView result = (TextView) findViewById(R.id.result);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("0"));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("1"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("2"));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("3"));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("4"));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("5"));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("6"));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("7"));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("8"));
            }
        });b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("9"));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("9"));
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("."));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("+"));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("-"));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("*"));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("/"));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });

        equate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equation = result.getText().toString();
                if (equation.contains("+"))
                {
                    String operands[] = equation.split("\\+");
                    Double op1 = Double.parseDouble(operands[0]);
                    Double op2 = Double.parseDouble(operands[1]);
                    Double ans = op1 + op2;

                    result.setText(ans.toString());
                }
                else if (equation.contains("-"))
                {
                    String operands[] = equation.split("-");
                    Double op1 = Double.parseDouble(operands[0]);
                    Double op2 = Double.parseDouble(operands[1]);
                    Double ans = op1 - op2;

                    result.setText(ans.toString());
                }
                else if (equation.contains("*"))
                {
                    String operands[] = equation.split("\\*");
                    Double op1 = Double.parseDouble(operands[0]);
                    Double op2 = Double.parseDouble(operands[1]);
                    Double ans = op1 * op2;

                    result.setText(ans.toString());
                }
                else if (equation.contains("/"))
                {
                    String operands[] = equation.split("/");
                    Double op1 = Double.parseDouble(operands[0]);
                    Double op2 = Double.parseDouble(operands[1]);

                    if (op2 == 0)
                        result.setText("Divide By Zero Error!");
                    else
                    {
                        Double ans = op1 / op2;

                        result.setText(ans.toString());
                    }
                }

            }
        });





    }

}
