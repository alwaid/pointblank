package com.example.smandal.mygridview;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by smandal on 8/24/2015.
 */
public class CardViewAdapter extends BaseAdapter {
    Context context;

    public CardViewAdapter(Context context) {
        this.context = context;
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
        android.support.v7.widget.CardView cardView = null;

        cardView = new android.support.v7.widget.CardView(this.context);

        TextView project = new TextView(context);
        project.setText(projects[position]);
        project.setTextSize(25);
        project.setTextColor(Color.BLUE);

        TextView textView2 = new TextView(context);
        textView2.setText(resources[position]);
        textView2.setTextSize(12);
        textView2.setTextColor(Color.LTGRAY);


        TextView textView3 = new TextView(context);
        textView3.setText(resources[position]);
        textView3.setTextSize(12);
        textView3.setTextColor(Color.GREEN);

        Random random = new Random();

        TextView wip = new TextView(context);
        wip.setText("Work In Progress : " + random.nextInt(100) + " %");
        wip.setTextSize(12);
        wip.setTextColor(Color.parseColor("#42A5F5"));


        TextView completed = new TextView(context);
        completed.setText("Completed : " + random.nextInt(100) + " %");
        completed.setTextSize(12);
        completed.setTextColor(Color.parseColor("#0D47A1"));


        TextView notStarted = new TextView(context);
        notStarted.setText("Not Started : " + random.nextInt(100) + " %");
        notStarted.setTextSize(12);
        notStarted.setTextColor(Color.BLACK);

        TextView accepted = new TextView(context);
        accepted.setText("Accepted : " + random.nextInt(100) + " %");
        accepted.setTextSize(12);
        accepted.setTextColor(Color.BLUE);


        TextView blocked = new TextView(context);
        blocked.setText("Blocked : " + random.nextInt(100) + " %");
        blocked.setTextSize(12);
        blocked.setTextColor(Color.RED);


        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(linearLayout.VERTICAL);

        linearLayout.addView(project);
        linearLayout.addView(wip);
        linearLayout.addView(completed);
        linearLayout.addView(notStarted);
        linearLayout.addView(accepted);
        linearLayout.addView(blocked);

        //cardView.setElevation(100);
        cardView.setLeft(40);
        cardView.setRight(40);
        cardView.setMinimumWidth(parent.getWidth());
        cardView.setMinimumHeight(parent.getHeight() / 3);
        cardView.setElevation(30);
        cardView.setRadius(25);
        cardView.setCardBackgroundColor(Color.parseColor("#00E676"));


        cardView.addView(linearLayout);

        return cardView;
    }


    String[] resources = {"This is Sam1. He lives in Kolkata", "This is Sam2. He lives in Kolkata",
            "This is Sam3. He lives in Kolkata", "This is Sam4. He lives in Kolkata",
            "This is Sam5. He lives in Kolkata", "This is Sam6. He lives in Kolkata"};

    String[] projects = {"Project # 1", "Project # 2",
            "Project # 3", "Project # 4",
            "Project # 5", "Project # 6"};

}
