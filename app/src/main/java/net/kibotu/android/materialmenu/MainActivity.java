package net.kibotu.android.materialmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

import net.kibotu.android.materialmenu.ui.CustomMenuItemPresenter;
import net.kibotu.android.materialmenu.ui.LeftDrawerFragment;
import net.kibotu.android.materialmenu.ui.RandomFragment;
import net.kibotu.android.materialmenu.ui.RightDrawerFragment;

import java.util.ArrayList;
import java.util.List;

import static android.text.TextUtils.isEmpty;
import static net.kibotu.android.materialmenu.FragmentExtensions.replaceFragment;
import static net.kibotu.android.materialmenu.MaterialMenu.fragmentContainerId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialMenu.with(this)
                .addMenuItem(createUserMenu())
                .setActionBar(new SimpleMaterialToolbar(this))
                .setLeftDrawerFragment(new LeftDrawerFragment())
                .setRightDrawerFragment(new RightDrawerFragment());

        // initial fragment
        replaceFragment(fragmentContainerId(), new RandomFragment());
    }

    public List<MenuItem> createUserMenu() {
        final List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem().setLabel(R.string.menu_item1).setIcon(R.drawable.ic_bug_report_black_18dp).setAnalyticsTag(R.string.ga_menu_item1).setOpenFragmentAction(RandomFragment.class));
        list.add(new MenuItem().setLabel(R.string.menu_item2).setIcon(R.drawable.ic_vpn_key_black_18dp).setAnalyticsTag(R.string.ga_menu_item2).setOpenFragmentAction(RandomFragment.class));
        list.add(new MenuItem().setLabel(R.string.menu_item3).setIcon(R.drawable.ic_lock_black_18dp).setAnalyticsTag(R.string.ga_menu_item3).setAction(v -> logout()));
        return list;
    }

    public List<MenuItem> createGuestMenu() {
        final List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem().setLabel(R.string.menu_item1).setIcon(R.drawable.ic_bug_report_black_18dp).setAnalyticsTag(R.string.ga_menu_item1).setOpenFragmentAction(RandomFragment.class).setPresenter(CustomMenuItemPresenter.class));
        list.add(new MenuItem().setLabel(R.string.menu_item4).setIcon(R.drawable.ic_play_arrow_black_18dp).setAnalyticsTag(R.string.ga_menu_item4).setOpenFragmentAction(RandomFragment.class).setPresenter(CustomMenuItemPresenter.class));
        list.add(new MenuItem().setLabel(R.string.menu_item5).setIcon(R.drawable.ic_lock_open_black_18dp).setAnalyticsTag(R.string.ga_menu_item5).setAction(v -> login()).setPresenter(CustomMenuItemPresenter.class));
        return list;
    }

    public void logout() {
        toast("logout");
        MaterialMenu.setMenuItems(createGuestMenu());
    }

    public void login() {
        toast("login");
        MaterialMenu.setMenuItems(createUserMenu());
    }

    public void toast(@Nullable final String message) {
        if (isEmpty(message))
            return;

        final Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.show();
    }

    @Override
    public void onBackPressed() {
        if (MaterialMenu.hasOpenDrawer()) {
            MaterialMenu.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}
