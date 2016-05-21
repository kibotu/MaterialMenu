package net.kibotu.android.materialmenu;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import net.kibotu.materialmenu.R;

import static android.text.TextUtils.isEmpty;

/**
 * Created by Nyaruhodo on 16.05.2016.
 */
public class SimpleMaterialToolbar extends MaterialToolbar {

    protected TextView title;

    public SimpleMaterialToolbar(@NonNull final AppCompatActivity context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.custom_toolbar;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        title = (TextView) context.findViewById(R.id.actionbar_title);
    }

    public void setTitle(@Nullable final String title) {
        this.title.setText(isEmpty(title)
                ? ""
                : title);
    }
}
