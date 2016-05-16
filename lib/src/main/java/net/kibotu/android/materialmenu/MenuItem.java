package net.kibotu.android.materialmenu;


import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import net.kibotu.android.recyclerviewpresenter.Presenter;

import static net.kibotu.android.materialmenu.FragmentExtensions.replaceFragmentAddToBackStack;
import static net.kibotu.android.materialmenu.MaterialMenu.fragmentContainerId;

/**
 * Created by Nyaruhodo on 20.02.2016.
 */
public class MenuItem {

    @StringRes
    int label;

    @DrawableRes
    int icon;

    @StringRes
    int analyticsTag;

    @Nullable
    View.OnClickListener action;

    @NonNull
    Class<? extends Presenter<MenuItem, ? extends RecyclerView.ViewHolder>> presenter = MenuItemPresenter.class;

    public MenuItem() {
    }

    @StringRes
    public int getLabel() {
        return label;
    }

    public MenuItem setLabel(@StringRes final int label) {
        this.label = label;
        return this;
    }

    @DrawableRes
    public int getIcon() {
        return icon;
    }

    public MenuItem setIcon(@DrawableRes final int icon) {
        this.icon = icon;
        return this;
    }

    @StringRes
    public int getAnalyticsTag() {
        return analyticsTag;
    }

    public MenuItem setAnalyticsTag(@StringRes final int analyticsName) {
        this.analyticsTag = analyticsName;
        return this;
    }

    @NonNull
    public Class<? extends Presenter<MenuItem, ? extends RecyclerView.ViewHolder>> getPresenter() {
        return presenter;
    }

    public <T extends Presenter<MenuItem, ? extends RecyclerView.ViewHolder>> MenuItem setPresenter(@NonNull final Class<T> presenter) {
        this.presenter = presenter;
        return this;
    }

    @Nullable
    public View.OnClickListener getAction() {
        return action;
    }

    public MenuItem setAction(@Nullable final View.OnClickListener action) {
        this.action = action;
        return this;
    }

    public <T extends Fragment & FragmentTag> MenuItem setOpenFragmentAction(@NonNull final Class<T> fragmentClass) {
        return setAction((v) -> replaceFragmentAddToBackStack(fragmentContainerId(), fragmentClass));
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (label != menuItem.label) return false;
        if (icon != menuItem.icon) return false;
        if (analyticsTag != menuItem.analyticsTag) return false;
        return action != null ? action.equals(menuItem.action) : menuItem.action == null;

    }

    @Override
    public int hashCode() {
        int result = label;
        result = 31 * result + icon;
        result = 31 * result + analyticsTag;
        result = 31 * result + (action != null ? action.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "label=" + label +
                ", icon=" + icon +
                ", analyticsTag=" + analyticsTag +
                ", action=" + action +
                '}';
    }
}
