package com.example.smandal.mygridview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by smandal on 9/5/2015.
 */
public class ProjectStatusFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View view = super.onCreateView(inflater, container, savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(container.getContext());

        final TextView textView = new TextView(getActivity().getBaseContext());
        Bundle bundle = getArguments();
        String projectStatus = bundle.getString("PROJECT_STATUS");
        textView.setText("hiiiiiiiiiii --- "+projectStatus);
        textView.setTextColor(Color.BLUE);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getBaseContext(), textView.getText(), Toast.LENGTH_LONG).show();
            }
        });
        linearLayout.addView(textView);

        return linearLayout;
    }
}
