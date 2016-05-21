package net.kibotu.android.materialmenu;

import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import net.kibotu.materialmenu.R;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public abstract class MaterialToolbar {

    @NonNull
    protected final AppCompatActivity context;

    @NonNull
    protected Toolbar toolbar;

    public MaterialToolbar(@NonNull final AppCompatActivity context) {
        this.context = context;
        toolbar = (Toolbar) context.findViewById(R.id.toolbar_layout);
    }

    @LayoutRes
    public abstract int getLayout();

    @CallSuper
    public void onCreate() {
    }

    public void onBind() {
    }

    @CallSuper
    public void onDestroy() {
    }
}