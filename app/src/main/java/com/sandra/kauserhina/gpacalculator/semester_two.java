package com.sandra.kauserhina.gpacalculator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.sandra.kauserhina.gpacalculator.R;

public class semester_two extends Fragment {
    double a,b,c,d,e,f, p,q,r;
    String string;
    TextView textView;
    Button button;
    Spinner spin1, spin2, spin3, spin4, spin5, spin6,spinp1,spinp2,spinp3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.semester_two_layout, container, false);


        button =(Button)view.findViewById(R.id.b);
        textView =(TextView)view.findViewById(R.id.t1);

        spin1 = (Spinner)view.findViewById(R.id.s1);
        ArrayAdapter<CharSequence> adapter1 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter1);
        spin2 = (Spinner)view.findViewById(R.id.s2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);
        spin3 = (Spinner)view.findViewById(R.id.s3);
        ArrayAdapter<CharSequence> adapter3 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter3);
        spin4 = (Spinner)view.findViewById(R.id.s4);
        ArrayAdapter<CharSequence> adapter4 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin4.setAdapter(adapter4);
        spin5 = (Spinner)view.findViewById(R.id.s5);
        ArrayAdapter<CharSequence> adapter5 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin5.setAdapter(adapter5);
        spin6 = (Spinner)view.findViewById(R.id.s6);
        ArrayAdapter<CharSequence> adapter6 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin6.setAdapter(adapter6);

        spinp1 = (Spinner)view.findViewById(R.id.sp1);
        ArrayAdapter<CharSequence> adapterp1 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapterp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinp1.setAdapter(adapterp1);
        spinp2 = (Spinner)view.findViewById(R.id.sp2);
        ArrayAdapter<CharSequence> adapterp2 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapterp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinp2.setAdapter(adapterp2);
        spinp3 = (Spinner)view.findViewById(R.id.sp3);
        ArrayAdapter<CharSequence> adapterp3 =ArrayAdapter.createFromResource(getActivity(),R.array.grade, android.R.layout.simple_spinner_item);
        adapterp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinp3.setAdapter(adapterp3);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        a = 10;
                        break;
                    case 2:
                        a = 9;
                        break;
                    case 3:
                        a = 8;
                        break;
                    case 4:
                        a= 7;
                        break;
                    case 5:
                        a = 6;
                        break;
                    case 6:
                        a = 5;
                        break;
                    case 7:
                        a =0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        b = 10;
                        break;
                    case 2:
                        b = 9;
                        break;
                    case 3:
                        b = 8;
                        break;
                    case 4:
                        b = 7;
                        break;
                    case 5:
                        b = 6;
                        break;
                    case 6:
                        b = 5;
                        break;
                    case 7:
                        b =0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        c = 10;
                        break;
                    case 2:
                        c = 9;
                        break;
                    case 3:
                        c = 8;
                        break;
                    case 4:
                        c = 7;
                        break;
                    case 5:
                        c =6;
                        break;
                    case 6:
                        c = 5;
                        break;
                    case 7:
                        c = 0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        d = 10;
                        break;
                    case 2:
                        d =9;
                        break;
                    case 3:
                        d= 8;
                        break;
                    case 4:
                        d= 7;
                        break;
                    case 5:
                        d = 6;
                        break;
                    case 6:
                        d = 5;
                        break;
                    case 7:
                        d =0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        e = 10;
                        break;
                    case 2:
                        e = 9;
                        break;
                    case 3:
                        e = 8;
                        break;
                    case 4:
                        e = 7;
                        break;
                    case 5:
                        e = 6;
                        break;
                    case 6:
                        e = 5;
                        break;
                    case 7:
                        e =0;
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        f = 10;
                        break;
                    case 2:
                        f = 9;
                        break;
                    case 3:
                        f = 8;
                        break;
                    case 4:
                        f = 7;
                        break;
                    case 5:
                        f = 6;
                        break;
                    case 6:
                        f = 5;
                        break;
                    case 7:
                        f =0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        p = 10;
                        break;
                    case 2:
                        p = 9;
                        break;
                    case 3:
                        p = 8;
                        break;
                    case 4:
                        p = 7;
                        break;
                    case 5:
                        p = 6;
                        break;
                    case 6:
                        p = 5;
                        break;
                    case 7:
                        p = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        q = 10;
                        break;
                    case 2:
                        q = 9;
                        break;
                    case 3:
                        q = 8;
                        break;
                    case 4:
                        q = 7;
                        break;
                    case 5:
                        q = 6;
                        break;
                    case 6:
                        q = 5;
                        break;
                    case 7:
                        q = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        r = 10;
                        break;
                    case 2:
                        r = 9;
                        break;
                    case 3:
                        r = 8;
                        break;
                    case 4:
                        r = 7;
                        break;
                    case 5:
                        r = 6;
                        break;
                    case 6:
                        r = 5;
                        break;
                    case 7:
                        r = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = (a*4)+(b*4)+(c*4)+(d*4)+(e*4)+(f*4) ;
                double y = (p*2)+(q*2)+(r*2);
                double z = 0.0;
                z = (x+y)/30;
                //Toast.makeText(getActivity(),"z="+z,Toast.LENGTH_SHORT).show();
                string =Double.toString(z);
                //string = Integer.toString(a);
                //Toast.makeText(getActivity(),"x="+x+"y="+y+"z="+z,Toast.LENGTH_SHORT).show();
                textView.setText(string);
            }
        });
        return view;
    }
}
