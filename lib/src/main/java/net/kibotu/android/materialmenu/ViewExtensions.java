package net.kibotu.android.materialmenu;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.kibotu.materialmenu.R;

import static net.kibotu.android.materialmenu.MaterialMenu.getContext;

/**
 * Created by Nyaruhodo on 16.05.2016.
 */
public class ViewExtensions {

    public static View inflate(@LayoutRes final int layout) {
        return LayoutInflater.from(getContext()).inflate(layout, (ViewGroup) getContentRoot().findViewById(R.id.drawer_layout), false);
    }

    public static View getContentRoot() {
        return getContext()
                .getWindow()
                .getDecorView()
                .findViewById(android.R.id.content);
    }

    public static int getStatusBarHeight() {
        int result = 0;
        final int resourceId = getContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getContext().getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public static void setLayoutMargin(@NonNull final View view, final int left, final int top, final int right, final int bottom) {
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(left, top, right, bottom);
            view.setLayoutParams(layoutParams);
        }
    }
}
