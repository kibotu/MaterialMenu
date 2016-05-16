package net.kibotu.android.materialmenu;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.kibotu.android.recyclerviewpresenter.BaseViewHolder;
import net.kibotu.android.recyclerviewpresenter.Presenter;
import net.kibotu.android.recyclerviewpresenter.PresenterAdapter;
import net.kibotu.materialmenu.R;

import java.util.Random;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public class MenuItemPresenter extends Presenter<MenuItem, MenuItemPresenter.ViewHolder> {

    private final int id;

    public MenuItemPresenter(@NonNull PresenterAdapter<MenuItem> presenterAdapter) {
        super(presenterAdapter);

        id = new Random().nextInt(Integer.MAX_VALUE);
    }

    @Override
    protected int getLayout() {
        return R.layout.menu_item;
    }

    @NonNull
    @Override
    protected ViewHolder createViewHolder(@LayoutRes int layout, @NonNull ViewGroup viewGroup) {
        return new ViewHolder(layout, viewGroup);
    }

    @Override
    public void bindViewHolder(@NonNull ViewHolder viewHolder, @NonNull MenuItem item, int position) {
        final Context context = viewHolder.itemView.getContext();

        if (item.icon != 0)
            Glide.with(context)
                    .load(item.icon)
                    .into(viewHolder.icon);

        viewHolder.label.setText(context.getString(item.label));

        if (item.action != null)
            viewHolder.itemView.setOnClickListener(item.action::onClick);

        //        viewHolder.textView.setText(item.getLocalizedName());
//        viewHolder.imageView.setImageResource(item.getIconId());
//        viewHolder.itemView.setOnClickListener(v -> {
//            MainMenuProvider.provide().closeDrawers();
//
//            if (item.hasAction())
//                item.getAction().run();
//            else if (item.getFragmentClass() != null)
//                replaceToBackStackBySlidingHorizontally(item.getFragment());
//        });
    }

    public static class ViewHolder extends BaseViewHolder {

        @NonNull
        ImageView icon;

        @NonNull
        TextView label;

        public ViewHolder(@LayoutRes int layout, @NonNull ViewGroup parent) {
            super(layout, parent);

            icon = (ImageView) itemView.findViewById(R.id.icon);
            label = (TextView) itemView.findViewById(R.id.label);
        }

        @Override
        public void onViewDetachedFromWindow() {
            super.onViewDetachedFromWindow();
            if (itemView != null)
                itemView.setOnClickListener(null);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItemPresenter that = (MenuItemPresenter) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
