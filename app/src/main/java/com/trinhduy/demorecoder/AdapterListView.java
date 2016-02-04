package com.trinhduy.demorecoder;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ADMINISTER on 2/3/2016.
 */
public class AdapterListView extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public AdapterListView(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.item_list, itemname);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txtvExample);
        Button btnPlay = (Button) rowView.findViewById(R.id.btnPlay);
//        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);

//        btnPlay.setBackgroundResource(imgid[position]);



//        extratxt.setText("Description "+itemname[position]);
        return rowView;
    }

}
