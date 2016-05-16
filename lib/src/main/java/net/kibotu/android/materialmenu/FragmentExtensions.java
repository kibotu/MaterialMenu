package net.kibotu.android.materialmenu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import net.kibotu.android.materialmenu.FragmentTag;
import net.kibotu.android.materialmenu.MaterialMenu;
import net.kibotu.android.materialmenu.internal.ClassExtensions;

import static net.kibotu.android.materialmenu.MaterialMenu.getFragmentContainerId;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
class FragmentExtensions {

    public static <T extends Fragment & FragmentTag> void replaceFragment(@NonNull final Class<T> fragmentClass) {
        final Context context = MaterialMenu.getContext();
        if (!(context instanceof AppCompatActivity))
            return;

        final Fragment fragment = ClassExtensions.newFragment(fragmentClass);

        ((AppCompatActivity) context).getSupportFragmentManager()
                .beginTransaction()
                .replace(getFragmentContainerId(), fragment)
                .addToBackStack(((FragmentTag) fragment).fragmentTag())
                .commit();
    }
}
