package net.kibotu.android.materialmenu;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;

import net.kibotu.android.recyclerviewpresenter.PresenterAdapter;
import net.kibotu.materialmenu.R;

import java.util.Collection;
import java.util.List;

import static net.kibotu.android.materialmenu.FragmentExtensions.replaceFragment;

/**
 * Created by Nyaruhodo on 14.05.2016.
 */
public class MaterialMenu {

    // region vars

    protected static final String TAG = MaterialMenu.class.getSimpleName();

    @Nullable
    private static MaterialMenu instance;

    @Nullable
    protected final AppCompatActivity context;

    /**
     * Holds menu items.
     */
    protected PresenterAdapter<MenuItem> adapter;


    /**
     * Actual toolbar.
     */
    protected ActionBar actionBar;

    /**
     * Manages the action toolbar.
     */
    protected MaterialToolbar materialToolbar;

    /**
     * Manages the drawer layout.
     */
    protected Drawer drawer;

    // endregion

    protected MaterialMenu(@NonNull final AppCompatActivity context) {
        MaterialMenu.instance = this;
        this.context = context;
        adapter = new PresenterAdapter<>();
        drawer = new Drawer(context);
        materialToolbar = new SimpleMaterialToolbar(context);
        init();
    }

    protected void init() {
        setActionBar(materialToolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(getContext(), drawer.drawerLayout, materialToolbar.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @NonNull
    public static MaterialMenu with(@NonNull final AppCompatActivity context) {
        return instance != null
                ? instance
                : new MaterialMenu(context);
    }

    @IdRes
    public static int fragmentContainerId() {
        return R.id.fragment_container;
    }

    @IdRes
    public static int leftDrawerFragmentId() {
        return R.id.left_drawer_container;
    }

    @IdRes
    public static int rightDrawerFragmentId() {
        return R.id.right_drawer_container;
    }

    @NonNull
    public static PresenterAdapter<MenuItem> adapter() {
        return getInstance().adapter;
    }

    @NonNull
    public static MaterialMenu addMenuItem(@NonNull final MenuItem... items) {
        final MaterialMenu instance = getInstance();
        for (MenuItem menuItem : items)
            instance.adapter.add(menuItem, menuItem.getPresenter());
        return instance;
    }

    @NonNull
    public static MaterialMenu addMenuItem(@NonNull final Collection<MenuItem> items) {
        final MaterialMenu instance = getInstance();
        for (MenuItem menuItem : items)
            instance.adapter.add(menuItem, menuItem.getPresenter());
        return instance;
    }

    @NonNull
    public static MaterialMenu setMenuItems(@NonNull final List<MenuItem> menuItems) {
        clear();
        addMenuItem(menuItems);
        return notifyDataSetChanged();
    }

    @NonNull
    public static MaterialMenu clear() {
        adapter().clear();
        return getInstance();
    }

    @NonNull
    public static MaterialMenu notifyDataSetChanged() {
        adapter().notifyDataSetChanged();
        return getInstance();
    }

    @NonNull
    public static MaterialMenu setAdapterToList(@NonNull final RecyclerView list) {
        list.setAdapter(adapter());
        return getInstance();
    }

    @NonNull
    public static AppCompatActivity getContext() {
        return getInstance().context;
    }

    @NonNull
    protected static MaterialMenu getInstance() {
        if (instance == null || instance.context == null)
            throw new IllegalStateException("Please init MaterialMenu.with()");
        return instance;
    }

    @NonNull
    public <T extends Fragment & FragmentTag> MaterialMenu setLeftDrawerFragment(@NonNull final T fragment) {
        replaceFragment(leftDrawerFragmentId(), fragment);
        return this;
    }

    @NonNull
    public <T extends Fragment & FragmentTag> MaterialMenu setRightDrawerFragment(@NonNull final T fragment) {
        replaceFragment(rightDrawerFragmentId(), fragment);
        return this;
    }

    public static MaterialMenu setActionBar(@NonNull final MaterialToolbar toolbar) {
        getInstance().materialToolbar = toolbar;
        configureActionBar(getContext(), toolbar);
        setCustomView(ViewExtensions.inflate(toolbar.getLayout()));
        return getInstance();
    }

    protected static void configureActionBar(@NonNull final AppCompatActivity context, @NonNull final MaterialToolbar materialToolbar) {
        context.setSupportActionBar(materialToolbar.toolbar);
        final ActionBar actionBar = context.getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setIcon(android.R.color.transparent);
        actionBar.setHomeButtonEnabled(false);
        materialToolbar.toolbar.setContentInsetsAbsolute(0, 0);
    }

    public static void setCustomView(@NonNull final View view) {
        getContext().getSupportActionBar().setCustomView(view);
    }

    @NonNull
    public static MaterialMenu showActionBar(final boolean isVisible) {
        final MaterialMenu instance = getInstance();
        if (isVisible) {
            getContext().getSupportActionBar().show();
        } else {
            getContext().getSupportActionBar().hide();
        }

        return instance;
    }

    public static void setLeftDrawerOpenHitBox(@Nullable final View hitBox) {
        if (hitBox == null)
            return;

        hitBox.setOnClickListener(v -> openLeftDrawer());
    }

    public static boolean hasOpenDrawer() {
        return isLeftDrawerOpen() || isRightDrawerOpen();
    }

    private static boolean isRightDrawerOpen() {
        return getInstance().drawer.drawerLayout.isDrawerOpen(Gravity.RIGHT);
    }

    private static boolean isLeftDrawerOpen() {
        return getInstance().drawer.drawerLayout.isDrawerOpen(Gravity.LEFT);
    }

    public static MaterialMenu openLeftDrawer() {
        final MaterialMenu instance = getInstance();
        instance.drawer.drawerLayout.openDrawer(Gravity.LEFT);
        return instance;
    }

    public static MaterialMenu openRightDrawer() {
        final MaterialMenu instance = getInstance();
        instance.drawer.drawerLayout.openDrawer(Gravity.RIGHT);
        return instance;
    }

    public static MaterialMenu closeDrawers() {
        final MaterialMenu instance = getInstance();
        instance.drawer.drawerLayout.closeDrawers();
        return instance;
    }

    public static MaterialMenu unlockDrawers() {
        final MaterialMenu instance = getInstance();
        instance.drawer.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, instance.drawer.leftDrawerView);
        instance.drawer.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, instance.drawer.rightDrawerView);
        return instance;
    }

    protected MaterialMenu setDrawerLockMode(@LockMode final int lockMode, @NonNull final View view) {
        drawer.drawerLayout.setDrawerLockMode(lockMode, view);
        return this;
    }

    public static MaterialMenu setDrawerLockModeLeftDrawer(@LockMode final int lockMode) {
        final MaterialMenu instance = getInstance();
        instance.setDrawerLockMode(lockMode, instance.drawer.leftDrawerView);
        return instance;
    }

    public static MaterialMenu setDrawerLockModeRightDrawer(@LockMode final int lockMode) {
        final MaterialMenu instance = getInstance();
        instance.setDrawerLockMode(lockMode, instance.drawer.rightDrawerView);
        return instance;
    }
}
