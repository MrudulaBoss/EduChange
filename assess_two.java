package com.example.aishwarya.edu;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Toast;

public class assess_two extends AppCompatActivity {
    RadioGroup radio;
    Button next,selected,back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assess_two);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        radio = (RadioGroup)findViewById(R.id.radio);
        next = (Button)findViewById(R.id.next);
        back=(Button)findViewById(R.id.back);

        next.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                int selectedId = radio.getCheckedRadioButtonId();
                selected = (RadioButton) findViewById(selectedId);
                if (radio.getCheckedRadioButtonId() == -1)
                {
                    Toast.makeText(assess_two.this,
                            "Please Select an option to continue!!", Toast.LENGTH_SHORT).show();
                }
                // find the radiobutton by returned id
                else {
                    startActivity(new Intent(assess_two.this,assess_three.class));

                }


            }
        });
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(assess_two.this,assess_one.class));

            }
        });
    }
}
