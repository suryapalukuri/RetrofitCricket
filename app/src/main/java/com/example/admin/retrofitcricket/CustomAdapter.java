package com.example.admin.retrofitcricket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

class CustomAdapter extends BaseAdapter{
    List<Cricket.Bowlers> bowlers;
    List<Cricket.Batsman> batsmen;
    Context context;
    public CustomAdapter(Context context, List<Cricket.Bowlers> bowlers, List<Cricket.Batsman> batsmen) {
        this.batsmen=batsmen;
        this.bowlers=bowlers;
        this.context=context;
    }

    @Override
    public int getCount() {
        return bowlers.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View customview;
    view=LayoutInflater.from(context).inflate(R.layout.activity_main2,viewGroup,false);
        TextView name=view.findViewById(R.id.name);
        name.setText(batsmen.get(i).getName());
        TextView average=view.findViewById(R.id.average);
        average.setText(batsmen.get(i).getAge());
        TextView age=view.findViewById(R.id.age);
        age.setText(batsmen.get(i).getAverage());
        TextView inns=view.findViewById(R.id.inns);
        inns.setText(batsmen.get(i).getInns());
        TextView name1=view.findViewById(R.id.name1);
        name1.setText(bowlers.get(i).getName());
        TextView average1=view.findViewById(R.id.average1);
        average1.setText(bowlers.get(i).getAverage());
        TextView age1=view.findViewById(R.id.age1);
        age1.setText(bowlers.get(i).getAge());
        TextView inns1=view.findViewById(R.id.inns1);
        inns1.setText(bowlers.get(i).getInns());
        customview=view;


        return customview;
    }
}
