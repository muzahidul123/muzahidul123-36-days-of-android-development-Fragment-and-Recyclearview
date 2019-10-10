package com.example.ecommercedemo;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private List<Product> products;
    private RecyclerView homeRecyclearViewRV;
    private ProductAdapter productAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        homeRecyclearViewRV = view.findViewById(R.id.homeRecyclearViewRV);
        homeRecyclearViewRV.setLayoutManager(new LinearLayoutManager(getContext()));

        products = new ArrayList<>();

        products.add(new Product("Iphone5s", "20000", R.drawable.iphone5s));
        products.add(new Product("Iphone6s", "25000", R.drawable.iphone6s));
        products.add(new Product("Iphone7plus", "30000", R.drawable.iphone7plus));
        products.add(new Product("IphoneX", "60000", R.drawable.iphonex));
        products.add(new Product("Iphone11", "100000", R.drawable.iphone11));
        products.add(new Product("Iphone11pro", "120000", R.drawable.iphone11pro));
        products.add(new Product("PixelXL", "25000", R.drawable.pixelxl));
        products.add(new Product("Pixel2XL", "65000", R.drawable.pixel2xl));
        products.add(new Product("Pixel3XL", "80000", R.drawable.pixel3xl));
        products.add(new Product("oneplus5", "35000", R.drawable.oneplus5));
        products.add(new Product("oneplus5T", "40000", R.drawable.oneplus5t));
        products.add(new Product("oneplus6", "45000", R.drawable.oneplus6));
        products.add(new Product("oneplus6T", "50000", R.drawable.oneplus6t));
        products.add(new Product("oneplus7", "56000", R.drawable.oneplus7));

        productAdapter = new ProductAdapter(products, getContext());
        homeRecyclearViewRV.setAdapter(productAdapter);
        productAdapter.notifyDataSetChanged();


        return view;
    }

}
