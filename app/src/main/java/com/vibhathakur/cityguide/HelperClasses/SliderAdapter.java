package com.vibhathakur.cityguide.HelperClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.vibhathakur.cityguide.R;
import android.widget.TextView;
import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context) {
        this.context = context;
    }
    int images[]={
            R.drawable.search_place,
            R.drawable.sit_back_and_relax,
            R.drawable.add_missing_place,
            R.drawable.make_a_call
    };
    int headings[]={
            R.string.first_slide_title,
            R.string.second_slide_title,
            R.string.third_slide_title,
            R.string.fourth_slide_title
    };
    int descriptions[]={
            R.string.first_slide_desc,
            R.string.second_slide_desc,
            R.string.third_slide_desc,
            R.string.fourth_slide_desc
    };

    @Override
    public int getCount() {// how many sides is to be display
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {//is this view is using this object
        return view==object;//set views
    }
    //initialization of images and headings

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    View view= layoutInflater.inflate(R.layout.slides_layout,container,false);
//Hooks
        ImageView imageView=view.findViewById(R.id.slider_image);
        TextView heading=view.findViewById(R.id.slider_heading);
        TextView desc=view.findViewById(R.id.slider_desc);

  imageView.setImageResource(images[position]);
  heading.setText(headings[position]);
  desc.setText(descriptions[position]);

container.addView(view);
    //we have created design as xml file so in order to use that design we need to request the same from system
        return view;
    }
//instantiate items
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
container.removeView((View) object);//destroy
    }
}
