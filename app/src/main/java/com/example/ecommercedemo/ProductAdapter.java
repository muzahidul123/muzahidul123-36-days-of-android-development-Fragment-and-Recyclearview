package com.example.ecommercedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> products;
    private Context context;

    public ProductAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_model_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Product product = products.get(position);

        holder.productNameTV.setText(product.getName());
        holder.productPriceTV.setText(product.getPrice());
        holder.productPhotoIV.setImageResource(product.getImage());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView productPhotoIV;
        private TextView productNameTV, productPriceTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productNameTV = itemView.findViewById(R.id.productNameTV);
            productPriceTV = itemView.findViewById(R.id.productPriceTV);
            productPhotoIV = itemView.findViewById(R.id.productPhotoIV);
        }
    }
}
