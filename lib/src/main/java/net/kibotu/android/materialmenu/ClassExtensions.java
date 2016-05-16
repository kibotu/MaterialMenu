package net.kibotu.android.materialmenu;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
class ClassExtensions {

    @NonNull
    public static <T extends Fragment & FragmentTag> T newFragment(final Class<T> fragmentClass) {
        T result = null;
        try {
            result = (T) fragmentClass.getConstructors()[0].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        if (result == null)
            throw new IllegalArgumentException("fragment has no empty constructor");

        return result;
    }
}
