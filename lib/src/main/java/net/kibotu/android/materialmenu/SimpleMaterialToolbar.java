package net.kibotu.android.materialmenu;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import net.kibotu.materialmenu.R;

import static android.text.TextUtils.isEmpty;

/**
 * Created by Nyaruhodo on 16.05.2016.
 */
public class SimpleMaterialToolbar extends MaterialToolbar {

    protected View homeIconHitBox;

    protected ImageView homeIcon;

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
        homeIcon = (ImageView) context.findViewById(R.id.home_icon);
        homeIconHitBox = context.findViewById(R.id.icon_layout);
        title = (TextView) context.findViewById(R.id.actionbar_title);
    }

    @Override
    public void onBind() {
        MaterialMenu.setLeftDrawerOpenHitBox(homeIconHitBox);
    }


    public void setHomeIcon(@DrawableRes final int drawable) {
//        getSupportActionBar().setHomeAsUpIndicator(drawable(drawable));

//        Glide.with(getContext())
//                .load(drawable)
//                .asBitmap()
//                .fitCenter()
//                .into(new BitmapImageViewTarget(actionbarViewHolder.homeIcon) {
//                    @Override
//                    public void onResourceReady(final Bitmap drawable, final GlideAnimation anim) {
//                        super.onResourceReady(drawable, anim);
//                        // colorizing icon for contrast also making sure we don't accidentally cache the colorized image with same name as the original
//                        actionbarViewHolder.homeIcon.setColorFilter(color(android.R.color.white), PorterDuff.Mode.SRC_IN);
//                    }
//                });

    }

    public void setTitle(@Nullable final String title) {
        this.title.setText(isEmpty(title)
                ? ""
                : title);
    }
}
