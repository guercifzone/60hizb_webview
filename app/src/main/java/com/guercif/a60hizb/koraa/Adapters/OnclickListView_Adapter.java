package com.guercif.a60hizb.koraa.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.guercif.a60hizb.R;

import java.util.ArrayList;
import java.util.List;

public class OnclickListView_Adapter extends ArrayAdapter<String> {
    customButtonListener customListner;
    public interface customButtonListener {
        public void onButtonClickListner(int position,String value);
        public void onButtonClickListner1(int position,String value);


    }
    public void setCustomButtonListner(customButtonListener listener) {
        this.customListner= listener;
    }
    private Context context;
    private ArrayList<String> data = new ArrayList<String>();
    public OnclickListView_Adapter(@NonNull Context context, @NonNull ArrayList<String> dataItem) {
        super(context, R.layout.free_data, dataItem);
        this.data = dataItem;
        this.context = context;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.free_data, parent,false);
            viewHolder = new ViewHolder();
            viewHolder.text1 = (TextView) convertView.findViewById(R.id.hizbText);
            viewHolder.button1= (Button) convertView.findViewById(R.id.hizbplay);
           // viewHolder.text2 = (TextView) convertView.findViewById(R.id.downloadText);
            viewHolder.button2 = (Button)convertView.findViewById(R.id.hizbdownload);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final String temp = getItem(position);
        viewHolder.text1.setText(temp);
        viewHolder.button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (customListner != null) {
                    customListner.onButtonClickListner(position,temp);
                }

            }
        });
        viewHolder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (customListner != null) {
                    customListner.onButtonClickListner1(position,temp);
                }
            }
        });

        return convertView;
    }

    public class ViewHolder {
        TextView text1;

        Button button1;
        Button button2;


    }

}
