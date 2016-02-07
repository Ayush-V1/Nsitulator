package com.example.ayush.nsitulator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner s1;
    Spinner s2;
    ArrayAdapter<CharSequence>adapter;
    ArrayAdapter<CharSequence>adapter1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        s1 = (Spinner)findViewById(R.id.spinb);
        adapter = ArrayAdapter.createFromResource(this,R.array.branch,android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String val = s1.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),"Branch selected is "+ val, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        s2 = (Spinner)findViewById(R.id.spins);
        adapter1 = ArrayAdapter.createFromResource(this,R.array.semester,android.R.layout.simple_list_item_1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter1);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String val1 = s2.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),"Semester selected is "+ val1, Toast.LENGTH_SHORT).show();

                if(s1.getSelectedItem().toString().equals("COE"))
                {
                    if(s2.getSelectedItem().toString().equals("Sem 1"))
                    {
                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 2"))
                    {
                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }


                    else if(s2.getSelectedItem().toString().equals("Sem 3"))
                    {
                        cc();

                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                    else if(s2.getSelectedItem().toString().equals("Sem 4"))
                    {
                        cc();}

                    else if(s2.getSelectedItem().toString().equals("Sem 5"))
                    {
                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 6"))
                    {
                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);


                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc9.setTextColor(Color.parseColor("#b3b3b3"));

                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 7"))
                    {
                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);

                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));

                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 8"))
                    {
                        cc();

                        TextView tc4 = (TextView)findViewById(R.id.tv4);
                        TextView tc5 = (TextView)findViewById(R.id.tv5);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc10= (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc5.setTextColor(Color.parseColor("#b3b3b3"));
                        tc4.setTextColor(Color.parseColor("#b3b3b3"));
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                }
                else if (s1.getSelectedItem().toString().equals("IT"))
                {

                    if(s2.getSelectedItem().toString().equals("Sem 1")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 2")){

                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 3")){
                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 4"))
                    {

                        cc();
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);


                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 5")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 6")){

                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                    else if(s2.getSelectedItem().toString().equals("Sem 7"))
                    {
                        cc();}

                    else if(s2.getSelectedItem().toString().equals("Sem 8"))
                    {
                        cc();

                        TextView tc4 = (TextView)findViewById(R.id.tv4);
                        TextView tc5 = (TextView)findViewById(R.id.tv5);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc10= (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc5.setTextColor(Color.parseColor("#b3b3b3"));
                        tc4.setTextColor(Color.parseColor("#b3b3b3"));
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                }

                else if (s1.getSelectedItem().toString().equals("MPAE"))
                {

                    if(s2.getSelectedItem().toString().equals("Sem 1")){

                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 2")){

                        cc();

                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 3")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 4"))
                    {
                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 5")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 6")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));

                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 7"))
                    {

                        cc();
                        TextView tc10= (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);


                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 8"))
                    {
                        cc();
                        TextView tc4= (TextView)findViewById(R.id.tv4);
                        TextView tc5 = (TextView)findViewById(R.id.tv5);
                        TextView tc10= (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);


                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc4.setTextColor(Color.parseColor("#b3b3b3"));
                        tc5.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                }

                else if (s1.getSelectedItem().toString().equals("ECE")) {

                    if (s2.getSelectedItem().toString().equals("Sem 1")) {

                        cc();
                        TextView tc10 = (TextView) findViewById(R.id.tv10);
                        TextView tc11 = (TextView) findViewById(R.id.tv11);
                        TextView tc12 = (TextView) findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                    else if (s2.getSelectedItem().toString().equals("Sem 2")) {

                        cc();
                        TextView tc10 = (TextView) findViewById(R.id.tv10);
                        TextView tc11 = (TextView) findViewById(R.id.tv11);
                        TextView tc12 = (TextView) findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));

                    }
                    else if (s2.getSelectedItem().toString().equals("Sem 3")) {

                        cc();
                        TextView tc10 = (TextView) findViewById(R.id.tv10);
                        TextView tc12 = (TextView) findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                    else if(s2.getSelectedItem().toString().equals("Sem 4"))
                    {
                        cc();}

                    else if (s2.getSelectedItem().toString().equals("Sem 5")) {

                        cc();
                        TextView tc10 = (TextView) findViewById(R.id.tv10);
                        TextView tc9 = (TextView) findViewById(R.id.tv9);
                        TextView tc12 = (TextView) findViewById(R.id.tv12);

                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }
                    else if(s2.getSelectedItem().toString().equals("Sem 6"))
                    {
                        cc();}
                    else if(s2.getSelectedItem().toString().equals("Sem 7"))
                    {
                        cc();}
                    else if(s2.getSelectedItem().toString().equals("Sem 8"))
                    {
                        cc();}
                }

                else if (s1.getSelectedItem().toString().equals("BT"))
                {

                    if(s2.getSelectedItem().toString().equals("Sem 1")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 2")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 3")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 4"))
                    {

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 5")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 6")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));

                    }
                    else if(s2.getSelectedItem().toString().equals("Sem 7"))
                    {
                        cc();}
                    else if(s2.getSelectedItem().toString().equals("Sem 8"))
                    {
                        cc();}

                }

                else if (s1.getSelectedItem().toString().equals("ICE"))
                {

                    if(s2.getSelectedItem().toString().equals("Sem 1")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 2")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc11 = (TextView)findViewById(R.id.tv11);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc11.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 3")){

                        cc();
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 4"))
                    {
                        cc();}

                    else if(s2.getSelectedItem().toString().equals("Sem 5")){

                        cc();
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc10 = (TextView)findViewById(R.id.tv10);
                        TextView tc12 = (TextView)findViewById(R.id.tv12);

                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));
                        tc12.setTextColor(Color.parseColor("#b3b3b3"));
                    }

                    else if(s2.getSelectedItem().toString().equals("Sem 6")){

                        cc();
                        TextView tc9 = (TextView)findViewById(R.id.tv9);
                        TextView tc10 = (TextView)findViewById(R.id.tv10);

                        tc9.setTextColor(Color.parseColor("#b3b3b3"));
                        tc10.setTextColor(Color.parseColor("#b3b3b3"));

                    }
                    else if(s2.getSelectedItem().toString().equals("Sem 7"))
                    {
                        cc();}
                    else if(s2.getSelectedItem().toString().equals("Sem 8"))
                    {
                        cc();}


                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    public void onCalculate(View a)
    {
        if(a.getId()==R.id.buttC)

        {



            double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;



            double tux,pux,p;


            if(s1.getSelectedItem().toString().equals("COE"))
            {
                if(s2.getSelectedItem().toString().equals("Sem 1"))
                {


                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());



                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = (3*n6)+2*(n7+n8+n9);
                    p   = (tux+pux)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));
                }

                else if (s2.getSelectedItem().toString().equals("Sem 2"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 3"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t10 = (EditText)findViewById(R.id.ten);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n10 =Double.parseDouble(t10.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8)+(3*n9);
                    p   = (tux+pux+n10)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 4"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t10 = (EditText)findViewById(R.id.ten);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n10 =Double.parseDouble(t10.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9+n10);
                    p   = (tux+pux+n11+n12)/32;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 5"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 6"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n12);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }
                else if (s2.getSelectedItem().toString().equals("Sem 7"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8)+3*n9;
                    p   = (tux+pux+n11)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 8"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3);
                    pux = (2*n6)+(8*n7)+(4*n8);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

            }
            else if (s1.getSelectedItem().toString().equals("IT"))
            {

                if(s2.getSelectedItem().toString().equals("Sem 1"))
                {
                    //code here
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = (3*n6)+2*(n7+n8+n9);
                    p   = (tux+pux)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));
                }

                else if (s2.getSelectedItem().toString().equals("Sem 2"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 3"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 4"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t10 = (EditText)findViewById(R.id.ten);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n10 =Double.parseDouble(t10.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9+n10);
                    p   = (tux+pux)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 5"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 6"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }
                else if (s2.getSelectedItem().toString().equals("Sem 7"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9+n12)+(4*n11);
                    p   = (tux+pux)/34;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 8"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3);
                    pux = (2*n6)+(8*n7)+(4*n8)+(2*n11);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

            }
            else if (s1.getSelectedItem().toString().equals("MPAE"))
            {

                if(s2.getSelectedItem().toString().equals("Sem 1"))
                {
                    //code here
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = (3*n6)+2*(n7+n8+n9);
                    p   = (tux+pux)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));
                }

                else if (s2.getSelectedItem().toString().equals("Sem 2"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 3"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 4"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11+n12)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 5"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 6"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11+n12)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }
                else if (s2.getSelectedItem().toString().equals("Sem 7"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 8"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3);
                    pux = 2*(n6+n7)+(8*n8)+(2*n9);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

            }

            else if (s1.getSelectedItem().toString().equals("ECE"))  // 6, 7, 8 Credits not found false data taken
            {

                if(s2.getSelectedItem().toString().equals("Sem 1"))
                {
                    //code here
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = (3*n6)+2*(n7+n8+n9);
                    p   = (tux+pux)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));
                }

                else if (s2.getSelectedItem().toString().equals("Sem 2"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5+n8);
                    pux = 2*(n6+n7+n9);
                    p   = (tux+pux)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 3"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8)+3*n9;
                    p   = (tux+pux+n11)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 4"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t10 = (EditText)findViewById(R.id.ten);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n10 =Double.parseDouble(t10.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9+n10);
                    p   = (tux+pux+n11+n12)/32;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 5"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 6"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 6 ECE credits not found. Can't calculate result", Toast.LENGTH_LONG).show();

                    /* EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t4 = (EditText)findViewById(R.id.four);
                     EditText t5 = (EditText)findViewById(R.id.five);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);
                     EditText t11 = (EditText)findViewById(R.id.eleven);
                     EditText t12 = (EditText)findViewById(R.id.twelve);

                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n4 =Double.parseDouble(t4.getText().toString());
                     n5 =Double.parseDouble(t5.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n12 = Double.parseDouble(t12.getText().toString());

                     tux = 4*(n1+n2+n3+n4+n5);
                     pux = 2*(n6+n7+n8+n9);
                     p   = (tux+pux+n11+n12)/30;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));*/

                }
                else if (s2.getSelectedItem().toString().equals("Sem 7"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 7 ECE credits not found. Can't calculate result", Toast.LENGTH_LONG).show();
                    /* EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t4 = (EditText)findViewById(R.id.four);
                     EditText t5 = (EditText)findViewById(R.id.five);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);
                     EditText t11 = (EditText)findViewById(R.id.eleven);


                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n4 =Double.parseDouble(t4.getText().toString());
                     n5 =Double.parseDouble(t5.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     tux = 4*(n1+n2+n3+n4+n5);
                     pux = 2*(n6+n7+n8+n9);
                     p   = (tux+pux+n11)/29;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));*/

                }

                else if (s2.getSelectedItem().toString().equals("Sem 8"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 8 ECE credits not found. Can't calculate result", Toast.LENGTH_LONG).show();

                    /* EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);
                     EditText t11 = (EditText)findViewById(R.id.eleven);

                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     tux = 4*(n1+n2+n3);
                     pux = 2*(n6+n7)+(4*n8)+(2*n9);
                     p   = (tux+pux+n11)/28;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));*/

                }

            }

            else if (s1.getSelectedItem().toString().equals("ICE")) // 7, 8 credits not found false data taken
            {


                if(s2.getSelectedItem().toString().equals("Sem 1"))
                {
                    //code here

                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t10 = (EditText)findViewById(R.id.ten);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());

                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = (3*n6)+2*(n7+n8+n9);
                    p   = (tux+pux)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));
                }

                else if (s2.getSelectedItem().toString().equals("Sem 2"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 3"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8)+3*n9;
                    p   = (tux+pux+n11)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 4"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t10 = (EditText)findViewById(R.id.ten);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    n10 =Double.parseDouble(t10.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9+n10);
                    p   = (tux+pux+n11+n12)/32;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 5"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8);
                    p   = (tux+pux+n11)/27;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 6"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);
                    EditText t12 = (EditText)findViewById(R.id.twelve);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());
                    n12 = Double.parseDouble(t12.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n12);
                    p   = (tux+pux+n11)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }
                else if (s2.getSelectedItem().toString().equals("Sem 7"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 7 ICE credits not found. Can't calculate result", Toast.LENGTH_LONG).show();
                     /*EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t4 = (EditText)findViewById(R.id.four);
                     EditText t5 = (EditText)findViewById(R.id.five);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);
                     EditText t11 = (EditText)findViewById(R.id.eleven);


                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n4 =Double.parseDouble(t4.getText().toString());
                     n5 =Double.parseDouble(t5.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     tux = 4*(n1+n2+n3+n4+n5);
                     pux = 2*(n6+n7+n8+n9);
                     p   = (tux+pux+n11)/29;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));
*/
                }

                else if (s2.getSelectedItem().toString().equals("Sem 8"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 8 ICE credits not found. Can't calculate result", Toast.LENGTH_LONG).show();
                     /*
                     EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);
                     EditText t11 = (EditText)findViewById(R.id.eleven);


                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     tux = 4*(n1+n2+n3);
                     pux = 2*(n6+n7)+(4*n8)+(2*n9);
                     p   = (tux+pux+n11)/28;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));
                     */

                }

            }

            else if (s1.getSelectedItem().toString().equals("BT")) // 7,8 Credits not found false data taken
            {

                if(s2.getSelectedItem().toString().equals("Sem 1"))
                {
                    //code here
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = (3*n6)+2*(n7+n8+n9);
                    p   = (tux+pux)/29;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));
                }

                else if (s2.getSelectedItem().toString().equals("Sem 2"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 3"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n9);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 4"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t11 = (EditText)findViewById(R.id.eleven);


                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());


                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n11);
                    p   = (tux+pux)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 5"))
                {
                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);
                    EditText t11 = (EditText)findViewById(R.id.eleven);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n11 = Double.parseDouble(t11.getText().toString());

                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8+n11);
                    p   = (tux+pux)/30;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }

                else if (s2.getSelectedItem().toString().equals("Sem 6"))
                {

                    EditText t1 = (EditText)findViewById(R.id.one);
                    EditText t2 = (EditText)findViewById(R.id.two);
                    EditText t3 = (EditText)findViewById(R.id.three);
                    EditText t4 = (EditText)findViewById(R.id.four);
                    EditText t5 = (EditText)findViewById(R.id.five);
                    EditText t6 = (EditText)findViewById(R.id.six);
                    EditText t7 = (EditText)findViewById(R.id.seven);
                    EditText t8 = (EditText)findViewById(R.id.eight);
                    EditText t9 = (EditText)findViewById(R.id.nine);

                    n1 =Double.parseDouble(t1.getText().toString());
                    n2 =Double.parseDouble(t2.getText().toString());
                    n3 =Double.parseDouble(t3.getText().toString());
                    n4 =Double.parseDouble(t4.getText().toString());
                    n5 =Double.parseDouble(t5.getText().toString());
                    n6 =Double.parseDouble(t6.getText().toString());
                    n7 =Double.parseDouble(t7.getText().toString());
                    n8 =Double.parseDouble(t8.getText().toString());
                    n9 =Double.parseDouble(t9.getText().toString());
                    tux = 4*(n1+n2+n3+n4+n5);
                    pux = 2*(n6+n7+n8);
                    p   = (tux+pux+n9)/28;

                    TextView rs = (TextView)findViewById(R.id.per);
                    rs.setText(String.format("%.2f ",p));

                }
                else if (s2.getSelectedItem().toString().equals("Sem 7"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 7 BT credits not found. Can't calculate result", Toast.LENGTH_LONG).show();
                     /*
                     EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t4 = (EditText)findViewById(R.id.four);
                     EditText t5 = (EditText)findViewById(R.id.five);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);
                     EditText t11 = (EditText)findViewById(R.id.eleven);


                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n4 =Double.parseDouble(t4.getText().toString());
                     n5 =Double.parseDouble(t5.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     tux = 4*(n1+n2+n3+n4+n5);
                     pux = 2*(n6+n7+n8+n9);
                     p   = (tux+pux+n11)/29;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));
                     */

                }

                else if (s2.getSelectedItem().toString().equals("Sem 8"))
                {
                    Toast.makeText(getApplicationContext(), "Sem 8 BT credits not found. Can't calculate result", Toast.LENGTH_LONG).show();
                     /*
                     EditText t1 = (EditText)findViewById(R.id.one);
                     EditText t2 = (EditText)findViewById(R.id.two);
                     EditText t3 = (EditText)findViewById(R.id.three);
                     EditText t6 = (EditText)findViewById(R.id.six);
                     EditText t7 = (EditText)findViewById(R.id.seven);
                     EditText t8 = (EditText)findViewById(R.id.eight);
                     EditText t9 = (EditText)findViewById(R.id.nine);

                     EditText t11 = (EditText)findViewById(R.id.eleven);


                     n1 =Double.parseDouble(t1.getText().toString());
                     n2 =Double.parseDouble(t2.getText().toString());
                     n3 =Double.parseDouble(t3.getText().toString());
                     n6 =Double.parseDouble(t6.getText().toString());
                     n7 =Double.parseDouble(t7.getText().toString());
                     n8 =Double.parseDouble(t8.getText().toString());
                     n11 = Double.parseDouble(t11.getText().toString());
                     n9 =Double.parseDouble(t9.getText().toString());
                     tux = 4*(n1+n2+n3);
                     pux = 2*(n6+n7)+(4*n8)+(2*n9);
                     p   = (tux+pux+n11)/28;

                     TextView rs = (TextView)findViewById(R.id.per);
                     rs.setText(String.format("%.2f ",p));
                     */

                }

            }
        }

    }

    public void cc(){

        TextView c1 = (TextView)findViewById(R.id.tv1);
        TextView c2 = (TextView)findViewById(R.id.tv2);
        TextView c3 = (TextView)findViewById(R.id.tv3);
        TextView c4 = (TextView)findViewById(R.id.tv4);
        TextView c5 = (TextView)findViewById(R.id.tv5);
        TextView c6 = (TextView)findViewById(R.id.tv6);
        TextView c7 = (TextView)findViewById(R.id.tv7);
        TextView c8 = (TextView)findViewById(R.id.tv8);
        TextView c9 = (TextView)findViewById(R.id.tv9);
        TextView c10 = (TextView)findViewById(R.id.tv10);
        TextView c11 = (TextView)findViewById(R.id.tv11);
        TextView c12 = (TextView)findViewById(R.id.tv12);

        c1.setTextColor(Color.parseColor("#01b29b"));
        c2.setTextColor(Color.parseColor("#01b29b"));
        c3.setTextColor(Color.parseColor("#01b29b"));
        c4.setTextColor(Color.parseColor("#01b29b"));
        c5.setTextColor(Color.parseColor("#01b29b"));
        c6.setTextColor(Color.parseColor("#01b29b"));
        c7.setTextColor(Color.parseColor("#01b29b"));
        c8.setTextColor(Color.parseColor("#01b29b"));
        c9.setTextColor(Color.parseColor("#01b29b"));
        c10.setTextColor(Color.parseColor("#01b29b"));
        c11.setTextColor(Color.parseColor("#01b29b"));
        c12.setTextColor(Color.parseColor("#01b29b"));



    }

    public void onSub(View b)
    {
        Intent i = new Intent(this,sub_load.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
