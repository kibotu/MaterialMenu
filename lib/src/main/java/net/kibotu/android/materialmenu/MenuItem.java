package net.kibotu.android.materialmenu;


import android.support.annotation.Nullable;

import net.kibotu.android.materialmenu.internal.LogTag;

//import android.support.v4.app.Fragment;

/**
 * Created by Nyaruhodo on 20.02.2016.
 */
public class MenuItem {
//
//    @StringRes
//    final int name;
//
//    @DrawableRes
//    final int icon;

    @Nullable
    private Class<? extends LogTag> fragment;
//
//    public <T extends Fragment & LogTag> MenuItem(@StringRes final int name, @DrawableRes final int icon, @Nullable final Class<T> fragment) {
//        this.name = name;
//        this.icon = icon;
//        this.fragment = fragment;
//    }

//    @SuppressWarnings("unchecked")
//    @NonNull
//    public <T extends Fragment & LogTag> T getFragment() {
//        T result = null;
//        try {
//            result = (T) fragment.getConstructors()[0].newInstance();
//        } catch (final InstantiationException e) {
//            e.printStackTrace();
//        } catch (final IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (final InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (final NullPointerException e) {
//            e.printStackTrace();
//        }
//
//        if (result == null)
//            throw new IllegalArgumentException("fragment has no empty constructor");
//
//        return result;
//    }
}
