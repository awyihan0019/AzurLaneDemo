package com.example.azurlanedemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yihan on 2017/7/26.
 */

public class KantaiAdapter extends BaseAdapter{
    Context context;
    List<RowItem> rowlist;

    KantaiAdapter(Context context, List<RowItem> rowlist) {
        this.context = context;
        this.rowlist = rowlist;
    }

    @Override
    public int getCount() {
        return rowlist.size();
    }

    @Override
    public Object getItem(int position) {
        return rowlist.get(position);
    }

    @Override
    public long getItemId(int position){
        return rowlist.indexOf(getItem(position));
    }

    private class ViewHolder{
        ImageView kantai_image;
        TextView kantai_name;
        TextView shipType;
        TextView shipCamp;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
        {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();

            holder.kantai_image = (ImageView) convertView
                    .findViewById(R.id.kantai_image);
            holder.kantai_name = (TextView) convertView
                    .findViewById(R.id.kantai_name);
            holder.shipType = (TextView) convertView
                    .findViewById(R.id.kantai_type);
            holder.shipCamp = (TextView) convertView
                    .findViewById(R.id.kantai_camp);

            RowItem row_pos = rowlist.get(position);

            holder.kantai_image.setImageResource(row_pos.getKantaiImageID());
            holder.kantai_name.setText(row_pos.getKantaiName());
            holder.shipType.setText(row_pos.getShipType());
            holder.shipCamp.setText(row_pos.getShipCamp());
        }

        return convertView;
    }
}
