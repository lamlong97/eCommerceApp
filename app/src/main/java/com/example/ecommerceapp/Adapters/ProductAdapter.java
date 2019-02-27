package com.example.ecommerceapp.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceapp.Objects.Products;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Products> productsList;

    public ProductAdapter(Context context, int layout, List<Products> productsList) {
        this.context = context;
        this.layout = layout;
        this.productsList = productsList;
    }


    @Override
    public int getCount() {
        return productsList.size();
    }

    @Override
    public Object getItem(int position) {
        return productsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgProductImage;
        TextView txtProductName;
        TextView txtProductPrice;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
