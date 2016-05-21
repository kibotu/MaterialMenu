package net.kibotu.android.materialmenu;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.kibotu.materialmenu.R;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.LOLLIPOP_MR1;
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

    public static int color(@ColorRes final int color) {
        return SDK_INT >= Build.VERSION_CODES.M
                ? ContextCompat.getColor(getContext(), color)
                : getResources().getColor(color);
    }

    public static Resources getResources() {
        return getContext().getResources();
    }

    public static void setSize(@NonNull final View searchIcon, final int widthInDp, final int heightInDp) {
        final ViewGroup.LayoutParams params = searchIcon.getLayoutParams();
        params.width = dpToPx(widthInDp);
        params.height = dpToPx(heightInDp);
        searchIcon.setLayoutParams(params);
    }

    public static int dpToPx(final int dp) {
        final float scale = getDensity();
        return (int) (dp * scale + 0.5f);
    }

    public static float getDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Nullable
    @TargetApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    public static Drawable drawable(@DrawableRes final int drawable) {
        return SDK_INT >= LOLLIPOP_MR1
                ? getResources().getDrawable(drawable, getContext().getTheme())
                : getResources().getDrawable(drawable);
    }

}
