package net.kibotu.android.materialmenu;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import net.kibotu.materialmenu.R;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public class MaterialToolbar {

    @NonNull
    protected final AppCompatActivity context;
    protected Toolbar toolbar;
    protected ActionBar actionBar;

    public MaterialToolbar(@NonNull final AppCompatActivity context) {
        this.context = context;
        toolbar = (Toolbar) context.findViewById(R.id.toolbar_layout);

        configureActionBar();
        toolbar = (Toolbar) MaterialMenu.inflate(getCustomToolbarLayoutId());
        setCustomView(toolbar);
    }

    protected void configureActionBar() {
        context.setSupportActionBar(toolbar);
        actionBar = context.getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setIcon(android.R.color.transparent);
        actionBar.setHomeButtonEnabled(false);
        toolbar.setContentInsetsAbsolute(0, 0);
    }

    protected void setCustomView(@NonNull final View view) {
        final ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        actionBar.setCustomView(view, params);
    }

    @LayoutRes
    protected int getCustomToolbarLayoutId() {
        return R.layout.default_custom_toolbar;
    }
}