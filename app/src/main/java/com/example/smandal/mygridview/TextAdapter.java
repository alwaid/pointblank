package com.example.smandal.mygridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by smandal on 8/24/2015.
 */
public class TextAdapter extends BaseAdapter {
    private Context mContext;

    TextAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public int getCount() {
        return resources.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = null;
        if(convertView == null){
            textView = new TextView(mContext);
        }else{
            textView = (TextView)convertView;
        }
        textView.setText(resources[position]);
        return textView;
    }

    String[] resources = {"Sam1", "Sam2", "Sam3", "Sam4", "Sam5", "Sam6"};

}
