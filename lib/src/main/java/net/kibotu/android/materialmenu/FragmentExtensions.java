package net.kibotu.android.materialmenu;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import static net.kibotu.android.materialmenu.ClassExtensions.newFragment;
import static net.kibotu.android.materialmenu.MaterialMenu.getContext;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
class FragmentExtensions {

    public static <T extends Fragment & FragmentTag> void replaceFragmentAddToBackStack(@IdRes final int container, @NonNull final Class<T> fragmentClass) {
        final Context context = getContext();
        if (!(context instanceof AppCompatActivity))
            return;

        final Fragment fragment = newFragment(fragmentClass);

        ((AppCompatActivity) context).getSupportFragmentManager()
                .beginTransaction()
                .replace(container, fragment)
                .addToBackStack(((FragmentTag) fragment).fragmentTag())
                .commit();
    }

    public static <T extends Fragment & FragmentTag> void replaceFragment(@IdRes final int container, @NonNull final T fragment) {
        final Context context = getContext();
        if (!(context instanceof AppCompatActivity))
            return;

        ((AppCompatActivity) context).getSupportFragmentManager()
                .beginTransaction()
                .replace(container, fragment)
                .commit();
    }

    public static boolean isInRoot() {
        return getContext().getSupportFragmentManager().getBackStackEntryCount() == 0;
    }
}
