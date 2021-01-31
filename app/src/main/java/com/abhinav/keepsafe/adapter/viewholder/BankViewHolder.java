package com.abhinav.keepsafe.adapter.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.abhinav.keepsafe.R;

/**
 * Created by abhinav.sharma on 11/10/17.
 */

public class BankViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public BankViewHolder(View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
    }
}
