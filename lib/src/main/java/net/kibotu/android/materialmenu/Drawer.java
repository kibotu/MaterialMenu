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
}
