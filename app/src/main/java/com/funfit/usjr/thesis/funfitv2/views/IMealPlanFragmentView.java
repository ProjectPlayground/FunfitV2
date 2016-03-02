package com.funfit.usjr.thesis.funfitv2.views;

import android.content.Context;

import com.funfit.usjr.thesis.funfitv2.model.Meal;

import java.util.List;

/**
 * Created by victor on 1/15/2016.
 */
public interface IMealPlanFragmentView {
    public void displayBreakfast();
    public void displayLunch();
    public Context getContxt();
    public void setMealList(List<Meal> mealList);
    public List<Meal> getMealList();
    public void unhideBreakfast();
    public void unhideLunch();
    public void unhideDinner();
    public void unhideSnack();
    public void displayDinner();
    public void displaySnack();
}
