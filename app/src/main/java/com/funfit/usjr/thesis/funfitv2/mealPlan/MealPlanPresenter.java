package com.funfit.usjr.thesis.funfitv2.mealPlan;

import android.util.Log;

import com.funfit.usjr.thesis.funfitv2.dataManager.MealDbAdapter;
import com.funfit.usjr.thesis.funfitv2.model.Meal;
import com.funfit.usjr.thesis.funfitv2.views.IMealPlanFragmentView;

import java.util.List;

/**
 * Created by victor on 1/15/2016.
 */
public class MealPlanPresenter {
    private IMealPlanFragmentView iMealPlanFragmentView;

    private MealDbAdapter mealDbAdapter;

    public MealPlanPresenter(IMealPlanFragmentView iMealPlanFragmentView){
        this.iMealPlanFragmentView = iMealPlanFragmentView;
        this.mealDbAdapter = new MealDbAdapter(iMealPlanFragmentView.getContxt());
    }

    public void displayBreakfast(){
        iMealPlanFragmentView.displayBreakfast();
    }

    public void displayLunch(){ iMealPlanFragmentView.displayLunch();}

    public void getMealList(){
        List<Meal> mealList= mealDbAdapter.getMeals();
        Log.i("Meal list", String.valueOf(mealList.size()));
    }

    public void openDb(){
        mealDbAdapter.openDb();
    }

    public void closeDb(){
        mealDbAdapter.closeDb();
    }
}