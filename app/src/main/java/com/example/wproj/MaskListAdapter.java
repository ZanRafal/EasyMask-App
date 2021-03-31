package com.example.wproj;

import android.content.Context;
import android.media.FaceDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.wproj.ui.main.Mask;

import java.util.ArrayList;
import java.util.List;

public class MaskListAdapter extends ArrayAdapter<FaceMask> {

    private Context mContext;
    int mResource;

    public MaskListAdapter(Context context, int resource, ArrayList<FaceMask> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        //get Masks information
        String name = getItem(position).getName();
        String condition = getItem(position).getCondition();
        //int time = getItem(position).getTime();

        FaceMask mask = new FaceMask(name, condition);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView mskName = (TextView) convertView.findViewById(R.id.maskName);
        //TextView mskTime = (TextView) convertView.findViewById(R.id.maskTime);
        TextView mskCondition = (TextView) convertView.findViewById(R.id.maskCondition);

        mskName.setText(name);
        mskCondition.setText(mask.getCondition());
        //mskTime.setText(Integer.toString(time));

        return convertView;
    }
}
