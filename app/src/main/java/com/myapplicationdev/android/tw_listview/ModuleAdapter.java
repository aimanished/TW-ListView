package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private Context context;
    private ArrayList<Modules> modules;
    private TextView tv;
    private ImageView imageView;


    public ModuleAdapter(Context context,int resource , ArrayList<Modules> objects){
        super(context,resource,objects);
        modules = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);
        tv = (TextView)rowView.findViewById(R.id.textView);
        imageView = (ImageView)rowView.findViewById(R.id.imageView);
        Modules currentModules = modules.get(position);
        tv.setText(currentModules.getModulesCode());

        if(currentModules.isProgramming()){
            imageView.setImageResource(R.drawable.prog);
        }else{
            imageView.setImageResource(R.drawable.nonprog);
        }
    return rowView;

    }

}
