package com.example.ryanhsueh.databindingsample;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.ryanhsueh.databindingsample.databinding.ListItemHeroBinding;
import com.example.ryanhsueh.databindingsample.model.Hero;

import java.util.List;

/**
 * Created by ryanhsueh on 2018/7/30
 */
public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {

    private List<Hero> avangers;

    public HeroAdapter(List<Hero> list) {
        avangers = list;
    }

    @NonNull
    @Override
    public HeroAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        ListItemHeroBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_hero, viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroAdapter.ViewHolder viewHolder, int i) {
        Hero hero = avangers.get(i);
        viewHolder.binding.setHero(hero);
    }

    @Override
    public int getItemCount() {
        return avangers.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ListItemHeroBinding binding;

        ViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = (ListItemHeroBinding) binding;
        }
    }

}
