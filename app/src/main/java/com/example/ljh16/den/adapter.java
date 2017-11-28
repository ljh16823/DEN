
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


    private int[] images = {R.drawable.building2,R.drawable.building3,R.drawable.building4,R.drawable.building9,R.drawable.building10,R.drawable.building12,R.drawable.building13,R.drawable.building19,R.drawable.building20,R.drawable.building24,R.drawable.building27,R.drawable.building29,R.drawable.building31,R.drawable.building32};
    private LayoutInflater inflater;
    private Context context;

    public  adapter(Context context){
        this.context=context;

    }

    @Override
    public int getCount() {
        return images.length*5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        int realPos = position % (14);
        View v = inflater.inflate(R.layout.slider, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        imageView.setImageResource(images[realPos]);
        textView.setText((realPos + 1) + "번째 이미지입니다.");
        container.addView(v);
        return v;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }

}
