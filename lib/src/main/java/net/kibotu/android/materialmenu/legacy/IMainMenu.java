package net.kibotu.android.materialmenu.legacy;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import net.kibotu.android.materialmenu.*;

import java.util.List;

/**
 * Created by Nyaruhodo on 20.02.2016.
 */
public interface IMainMenu {

    IMainMenu prepareDrawers();

    IMainMenu setLeftDrawerTitle(@NonNull String title);

    IMainMenu setTitle(@NonNull String title);

    IMainMenu showActionBar(boolean isShowing);

    IMainMenu setHomeIcon(@DrawableRes int drawable);

    IMainMenu setLeftDrawerLockMode(@LockMode int lockMode);

    IMainMenu setMenuItems(List<net.kibotu.android.materialmenu.MenuItem> menu);

    boolean isDrawerOpen();

    IMainMenu closeDrawers();

//    boolean isDrawerOpen();
//
//    IMainMenu closeDrawers();
//
//    IMainMenu prepareDrawers();
//
//    IMainMenu showActionBar(boolean showActionBar);
//
//    IMainMenu setDrawerLockModeLeftDrawer(@LockMode int lockMode);
//
//    IMainMenu setDrawerLockModeRightDrawer(@LockMode int lockMode);
//
//    IMainMenu setTitle(String title);
//
////    IMainMenu setMenuItems(@NonNull final List<MainMenuItem> menu);
//
////    <T extends Fragment> IMainMenu setRightDrawerFragment(Class<T> fragment);
}