package com.example.chef101.custom_recycler_adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chef101.R;
import com.example.chef101.pojo.Instructions;


import java.util.ArrayList;

public class CustomInstructionsRecyclerViewAdapter extends RecyclerView.Adapter<CustomInstructionsRecyclerViewAdapter.ViewHolder>{
    ArrayList<Instructions> instructions;

    public CustomInstructionsRecyclerViewAdapter(ArrayList<Instructions> instructionsList) {
        this.instructions = instructionsList;
    }


    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instructions_recycler_layout, null);
        return new CustomInstructionsRecyclerViewAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Instructions instructions = this.instructions.get(position);
        holder.instructions.setText(instructions.getInstruction());
    }

    @Override
    public int getItemCount() {
        if (instructions == null) {
            return -1;
        }
        return instructions.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView instructions;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            instructions = itemView.findViewById(R.id.instructionsText);
        }
    }
}
