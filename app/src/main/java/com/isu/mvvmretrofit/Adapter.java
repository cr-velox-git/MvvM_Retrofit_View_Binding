package com.isu.mvvmretrofit;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.isu.mvvmretrofit.databinding.ItemHolidayBinding;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    private List<Model> modelList;

    public Adapter() {
        modelList = new ArrayList<>();
    }

    public void addModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHolidayBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_holiday, parent, false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
        //item model is in item_holiday.xml
        holder.binding.setItemModel(modelList.get(position));
    }

    @Override
    public int getItemCount() {
        return  modelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private ItemHolidayBinding binding;

        public viewHolder(ItemHolidayBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


    }
}
