package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Modules> modules;
    ArrayAdapter AA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);
        Intent i = getIntent();
        String year = i.getStringExtra("Aho Beast");
        tvYear.setText(year);
        modules = new ArrayList<Modules>();
        AA = new ModuleAdapter(this,R.layout.row,modules);
lv.setAdapter(AA);
        if(year == "Year 1"){
            modules.add(new Modules("nskjad",true));
            modules.add(new Modules("nskjad",true));
            modules.add(new Modules("nskjad",false));
        }else if(year == "Year 2"){
            modules.add(new Modules("nskjad",true));
            modules.add(new Modules("nskjad",false));
            modules.add(new Modules("nskjad",true));

        }
else{
            modules.add(new Modules("nskjad",true));
            modules.add(new Modules("nskjad",false));
            modules.add(new Modules("nskjad",true));
        }

    }



}
