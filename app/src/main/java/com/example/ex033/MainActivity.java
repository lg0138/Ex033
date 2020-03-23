package com.example.ex033;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.ex033.R.drawable.*;

public class MainActivity extends AppCompatActivity {

    TextView tvA1;
    TextView tvB1;
    TextView tvC1;
    TextView tvA2;
    TextView tvB2;
    TextView tvC2;
    EditText etA3;
    EditText etB3;
    EditText etC3;
    ImageView ivA4;
    ImageView ivB4;
    ImageView ivC4;
    Button btnA5;
    Button btnB5;
    Button btnC5;
    Button btnNew;
    int pNull;
    int pv;
    int px;
    int win = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvA1 = (TextView)findViewById(R.id.tvA1 );
        tvB1 = (TextView)findViewById(R.id.tvB1 );
        tvC1 = (TextView)findViewById(R.id.tvC1 );
        tvA2 = (TextView)findViewById(R.id.tvA2 );
        tvB2 = (TextView)findViewById(R.id.tvB2 );
        tvC2 = (TextView)findViewById(R.id.tvC2 );
        etA3 = (EditText)findViewById(R.id.etA3);
        etB3 = (EditText)findViewById(R.id.etB3);
        etC3 = (EditText)findViewById(R.id.etC3);
        ivA4 = (ImageView)findViewById(R.id.ivA4);
        ivB4 = (ImageView)findViewById(R.id.ivB4);
        ivC4 = (ImageView)findViewById(R.id.ivC4);
        btnA5 = (Button) findViewById(R.id.btnA5);
        btnB5 = (Button) findViewById(R.id.btnB5);
        btnC5 = (Button)findViewById(R.id.btnC5);
        btnNew = (Button)findViewById(R.id.btnNew);
        pNull= p3;
        pv= pvnew1;
        px= pxnew2;

    }

    public void setTvA1(TextView tvA1,int num1) {
        this.tvA1 = tvA1;
        tvA1.setText(num1);
    }

    public void setTvA2(TextView tvA2,int num2){
        this.tvA2 = tvA2;
        tvA2.setText(num2);
    }

    public void check_one(View view) {
        String st1 = tvA1.getText().toString();
        int uAnswer1 = Integer.parseInt(st1);
        String st2 = tvA2.getText().toString();
        int uAnswer2 = Integer.parseInt(st2);
        int sum1= uAnswer1 + uAnswer2;
        String st3 = etA3.getText().toString();
        int uAnswer3 = Integer.parseInt(st3);
        if (uAnswer3==sum1){
            ivA4.setImageResource(pvnew1);
            win++;
        }
        else {
            ivA4.setImageResource(pxnew2);
        }
        tvB1.setText(""+sum1);
        int num3=(int) (Math.random()* ((99-10)+1)+10);
        tvB2.setText(String.valueOf(num3));


    }

    public void check_two(View view) {
        String st1 = tvB1.getText().toString();
        int uAnswer1 = Integer.parseInt(st1);
        String st2 = tvB2.getText().toString();
        int uAnswer2 = Integer.parseInt(st2);
        int sum1= uAnswer1 + uAnswer2;
        String st3 = etB3.getText().toString();
        int uAnswer3 = Integer.parseInt(st3);
        if (uAnswer3==sum1){
            ivB4.setImageResource(pv);
            win++;
        }
        else {
            ivB4.setImageResource(px);
        }
        tvC1.setText(""+sum1);
        int num3=(int) (Math.random()* ((99-10)+1)+10);
        tvC2.setText(String.valueOf(num3));

    }

    public void check_three(View view) {
        String st1 = tvC1.getText().toString();
        int uAnswer1 = Integer.parseInt(st1);
        String st2 = tvC2.getText().toString();
        int uAnswer2 = Integer.parseInt(st2);
        int sum1= uAnswer1 + uAnswer2;
        String st3 = etC3.getText().toString();
        int uAnswer3 = Integer.parseInt(st3);
        if (uAnswer3==sum1){
           ivC4.setImageResource(pv);
            win++;
        }
        else {
            ivC4.setImageResource(px);
        }


        //Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        //toast.show();

        if (win==1){
            Toast toast1 = Toast.makeText(getApplicationContext(),"33% , 1/3",Toast.LENGTH_SHORT);
            toast1.show();
        }

        else if (win==2){
            Toast toast1 = Toast.makeText(getApplicationContext(),"66% , 2/3",Toast.LENGTH_SHORT);
            toast1.show();
        }
        else {
            Toast toast1 = Toast.makeText(getApplicationContext(),"100% , 3/3",Toast.LENGTH_SHORT);
            toast1.show();
        }
    }

    public void new_game(View view) {

        int num1=(int) (Math.random()* ((99-10)+1)+10); //((max - min) + 1) + min;
        int num2=(int) (Math.random()* ((99-10)+1)+10);

        tvA1.setText(String.valueOf(num1));
        tvB1.setText("");
        tvC1.setText("");
        tvA2.setText(String.valueOf (num2));
        tvB2.setText("");
        tvC2.setText("");
        etA3.setText("");
        etB3.setText("");
        etC3.setText("");
        ivA4.setImageDrawable(null);
        ivB4.setImageDrawable(null);
        ivC4.setImageDrawable(null);

    }
}
