package com.josepvictorr.tugas_uas_akb_genap_2021_10118369.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.josepvictorr.tugas_uas_akb_genap_2021_10118369.R;
import com.josepvictorr.tugas_uas_akb_genap_2021_10118369.detail.DetailActivityWisata1;
import com.josepvictorr.tugas_uas_akb_genap_2021_10118369.model.Wisata1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Wisata1Adapter extends RecyclerView.Adapter<Wisata1Adapter.ViewHolder> {
    private Context context;
    private ArrayList<Wisata1> wisata1s;

    private DatabaseReference ref;

    public Wisata1Adapter(Context context, ArrayList<Wisata1> wisata1s){
        this.context= context;
        this.wisata1s = wisata1s;
        ref = FirebaseDatabase.getInstance("https://world-of-bandung-default-rtdb.asia-southeast1.firebasedatabase.app")
                .getReference().child("kota_bandung");
    }
    @Override
    public Wisata1Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_wisata1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Wisata1Adapter.ViewHolder holder, int position) {
        holder.tvPreviewWisata1.setText(wisata1s.get(position).getNama_tempat());
        Glide.with(context)
                .load(wisata1s.get(position).getGambar_tempat())
                .into(holder.ivPreviewWisata1);

        holder.itemView.setOnClickListener(view -> {
            Intent detailWisata1 = new Intent(context.getApplicationContext(), DetailActivityWisata1.class);
            detailWisata1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            detailWisata1.putExtra("biaya_masuk", wisata1s.get(position).getBiaya_masuk());
            context.startActivity(detailWisata1);
        });
    }

    @Override
    public int getItemCount() {
        return wisata1s.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPreviewWisata1;
        TextView tvPreviewWisata1;

        public ViewHolder(View itemView) {
            super(itemView);
            ivPreviewWisata1 = itemView.findViewById(R.id.ivPreviewWisata1);
            tvPreviewWisata1 = itemView.findViewById(R.id.tvPreviewWisata1);
        }
    }
}
