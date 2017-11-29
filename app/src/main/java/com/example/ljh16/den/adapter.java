
package com.example.ljh16.den;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by pshbo on 2017-11-11.
 */


public class adapter extends PagerAdapter {


    private int[] images = {R.drawable.building2, R.drawable.building3, R.drawable.building4, R.drawable.building9, R.drawable.building10, R.drawable.building12, R.drawable.building13, R.drawable.building19, R.drawable.building20, R.drawable.building24, R.drawable.building27, R.drawable.building29, R.drawable.building31, R.drawable.building32};
    private LayoutInflater inflater;
    private Context context;

    public adapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int realPos = position % (14);
        View v = inflater.inflate(R.layout.slider, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        imageView.setImageResource(images[realPos]);
        switch (realPos+1){
            case 1 :
                textView.setText("기초과학관");
                textView.setTextColor(0xAA00723f);
                 break;
            case 2 :
                textView.setText("공학관");
                textView.setTextColor(0xAA00723f);
                break;
            case 3 :
                textView.setText("응용과학관");
                textView.setTextColor(0xAA00723f);
                break;
            case 4 :
                textView.setText("창의학습관");
                textView.setTextColor(0xAA00723f);
                break;
            case 5 :
                textView.setText("창학관");
                textView.setTextColor(0xAA00723f);
                break;
            case 6 :
                textView.setText("맥센터");
                textView.setTextColor(0xAA00723f);
                break;
            case 7 :
                textView.setText("렉처홀");
                textView.setTextColor(0xAA00723f);
                break;
            case 8 :
                textView.setText("30주년 기념관");
                textView.setTextColor(0xAA00723f);
                break;
            case 9 :
                textView.setText("헤화문화관");
                textView.setTextColor(0xAA00723f);
                break;
            case 10 :
                textView.setText("인문사회관");
                textView.setTextColor(0xAA00723f);
                break;
            case 11 :
                textView.setText("문무관");
                textView.setTextColor(0xAA00723f);
                break;
            case 12 :
                textView.setText("한의학관");
                textView.setTextColor(0xAA00723f);
                break;
            case 13 :
                textView.setText("산학협력관");
                textView.setTextColor(0xAA00723f);
                break;
            case 14 :
                textView.setText("융합과학관");
                textView.setTextColor(0xAA00723f);
                break;
        }

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
