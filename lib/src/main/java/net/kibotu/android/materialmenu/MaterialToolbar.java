package net.kibotu.android.materialmenu;

import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import net.kibotu.materialmenu.R;

import butterknife.Unbinder;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public abstract class MaterialToolbar {

    @NonNull
    protected final AppCompatActivity context;

    @NonNull
    protected Toolbar toolbar;

    protected View.OnClickListener homeIconClickListener;

    private Unbinder unbinder;

    public MaterialToolbar(@NonNull final AppCompatActivity context) {
        this.context = context;
        toolbar = (Toolbar) context.findViewById(R.id.toolbar_layout);
        init();
    }

    protected void init() {
        setHomeIconClickListener(v -> {
//            if (isInRoot())
////                MaterialMenu.hasOpenDrawer()
//                drawer.drawerLayout.openDrawer(Gravity.LEFT);
//            else
//                getContext().onBackPressed();
        });
    }

    public void show(final boolean isVisible) {
        toolbar.setVisibility(isVisible
                ? View.VISIBLE
                : View.GONE);
    }

    @LayoutRes
    public abstract int getLayout();

    public void setHomeIconClickListener(View.OnClickListener homeIconClickListener) {
        this.homeIconClickListener = homeIconClickListener;
    }

    @CallSuper
    public void onCreate() {
//        unbinder = ButterKnife.bind(this, toolbar.getv);
    }

    public abstract void onBind();

    @CallSuper
    public void onDestroy() {
//        unbinder.unbind();
    }
}