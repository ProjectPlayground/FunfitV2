package com.funfit.usjr.thesis.funfitv2.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.funfit.usjr.thesis.funfitv2.R;
import com.funfit.usjr.thesis.funfitv2.model.FoodServing;
import com.funfit.usjr.thesis.funfitv2.model.Meal;
import com.funfit.usjr.thesis.funfitv2.utils.Utils;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by victor on 1/12/2016.
 */
public class BreakFastRecyclerAdapter extends RecyclerView.Adapter<BreakFastRecyclerAdapter.ViewHolder>{

    private List<Meal> mealList;
    private int size;
    private int position;
    Context context;
    public class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.foodNameTxt)TextView mFoodName;
        @Bind(R.id.rdiTxt)TextView mRdi;
        @Bind(R.id.kCalTxt)TextView mKCal;
        @Bind(R.id.search_serving_layout)LinearLayout mServingLayout;
        public ViewHolder(final View itemView) {
            super(itemView);
            position = getPosition();
            ButterKnife.bind(this, itemView);
        }
    }

    public BreakFastRecyclerAdapter(List<Meal> mealList){
        this.mealList = mealList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_serving_adapter_layout, parent, false);
        context = parent.getContext();
        view.setFocusable(true);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(Utils.getCluster(context).equals("impulse"))
            holder.mServingLayout.setBackgroundColor(context.getResources().getColor(R.color.filter_impulse));
        else
            holder.mServingLayout.setBackgroundColor(context.getResources().getColor(R.color.filter_velocity));
        if (mealList.get(position).getCourse().equals("Breakfast")) {
            holder.mFoodName.setText(mealList.get(position).getName());
            holder.mKCal.setText(String.valueOf(mealList.get(position).getCalories()) + " kcal");
        }
    }

    @Override
    public int getItemCount() {
        return mealList.size();
    }

}