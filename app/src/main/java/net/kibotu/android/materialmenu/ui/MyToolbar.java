package net.kibotu.android.materialmenu.ui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import net.kibotu.android.materialmenu.MaterialToolbar;
import net.kibotu.android.materialmenu.R;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public class MyToolbar extends MaterialToolbar {

    public MyToolbar(@NonNull AppCompatActivity context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.default_custom_toolbar;
    }
}