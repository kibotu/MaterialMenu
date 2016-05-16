package net.kibotu.android.materialmenu;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import net.kibotu.materialmenu.R;

/**
 * Created by Nyaruhodo on 16.05.2016.
 */
public class Drawer {

    DrawerLayout drawerLayout;

    NavigationView leftDrawerView;

    NavigationView rightDrawerView;

    public Drawer(@NonNull final AppCompatActivity context) {
        drawerLayout = (DrawerLayout) context.findViewById(R.id.drawer_layout);
        leftDrawerView = (NavigationView) context.findViewById(R.id.left_drawer);
        rightDrawerView = (NavigationView) context.findViewById(R.id.right_drawer);

        drawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
    }


    @NonNull
    public void prepareDrawers() {
//        if (drawerToggle != null)
//            return this;

//        drawerToggle = new ActionBarDrawerToggle(getContext(), drawerLayout, toolbar.xml, R.string.drawer_open, R.string.drawer_close) {
//            @Override
//            public void onDrawerOpened(final View drawerView) {
//                super.onDrawerOpened(drawerView);
//            }
//
//            @Override
//            public void onDrawerClosed(final View drawerView) {
//                super.onDrawerClosed(drawerView);
//            }
//
//            @Override
//            public void onDrawerSlide(final View drawerView, final float slideOffset) {
//                super.onDrawerSlide(drawerView, slideOffset);
//            }
//        };

//        drawerLayout.post(() -> {
//            drawerToggle.setHomeAsUpIndicator(null);
//            drawerToggle.setDrawerIndicatorEnabled(false);
//            drawerLayout.addDrawerListener(drawerToggle);
//            drawerToggle.syncState();
//        });

    }

    //    @Override
//    public IMainMenu prepareDrawers() {
//        if (drawerToggle != null) {
//            return this;
//        }
//
//        drawerToggle = new ActionBarDrawerToggle(getContext(), drawerLayout, toolbar.xml, R.string.drawer_open, R.string.drawer_close) {
//            @Override
//            public void onDrawerClosed(final View drawerView) {
//                MainMenu.this.onDrawerClosed(drawerView);
//            }
//
//            @Override
//            public void onDrawerOpened(final View drawerView) {
//                MainMenu.this.onDrawerOpened(drawerView);
//            }
//
//            @Override
//            public void onDrawerSlide(final View drawerView, final float slideOffset) {
//                super.onDrawerSlide(drawerView, slideOffset);
//            }
//        };
//
//        drawerLayout.post(() -> {
//            drawerToggle.syncState();
//            drawerToggle.setDrawerIndicatorEnabled(true);
//            drawerLayout.setDrawerListener(drawerToggle);
//        });
//
//        return this;
//    }
//    private void onDrawerOpened(View drawerView) {
//        if (drawerView.equals(rightDrawerView)) {
//            onOpenRightDrawer();
//        }
//        if (!drawerView.equals(leftDrawerView)) {
//            onOpenLeftDrawer();
//        }
//        getContext().supportInvalidateOptionsMenu();
//        drawerToggle.syncState();
//    }
//
//    private void onOpenLeftDrawer() {
//
//    }
//
//    private void onOpenRightDrawer() {
//        if (rightDrawerFragmentClass != null) {
//            String tag = rightDrawerFragmentClass.getSimpleName();
//            rightDrawerFragment = newInstance(rightDrawerFragmentClass, null);
//            getContext().getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.right_drawer_container, rightDrawerFragment, tag)
//                    .commit();
//        }
//    }
//
//    private void onDrawerClosed(View drawerView) {
//        if (drawerView.equals(rightDrawerView)) {
//            onRightDrawerClosed();
//        }
//        if (!drawerView.equals(leftDrawerView)) {
//            onLeftDrawerClosed();
//        }
//        getContext().supportInvalidateOptionsMenu();
//        drawerToggle.syncState();
//    }
//    private void onLeftDrawerClosed() {
//
//    }
//
//    private void onRightDrawerClosed() {
//        if (rightDrawerFragment != null)
//            getContext().getSupportFragmentManager().beginTransaction().remove(rightDrawerFragment).commit();
//    }
//

}
