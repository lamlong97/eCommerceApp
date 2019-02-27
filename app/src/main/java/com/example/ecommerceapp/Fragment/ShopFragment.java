package com.example.ecommerceapp.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ecommerceapp.Adapters.SliderAdapter;

import com.example.ecommerceapp.Picasso.PicassoImageLoadingService;
import com.example.ecommerceapp.R;

import ss.com.bannerslider.Slider;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class ShopFragment extends Fragment {
    Slider slider;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop,container,false);

        //Tạo banner
        Slider.init(new PicassoImageLoadingService(getContext()));
        slider = view.findViewById(R.id.bannerSlider);
        slider.setAdapter(new com.example.ecommerceapp.Adapters.SliderAdapter());
        return view;
    }
}