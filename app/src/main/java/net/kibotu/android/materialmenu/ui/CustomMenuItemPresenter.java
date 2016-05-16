package net.kibotu.android.materialmenu.ui;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.kibotu.android.materialmenu.MenuItem;
import net.kibotu.android.materialmenu.R;
import net.kibotu.android.recyclerviewpresenter.BaseViewHolder;
import net.kibotu.android.recyclerviewpresenter.Presenter;
import net.kibotu.android.recyclerviewpresenter.PresenterAdapter;

import java.util.Random;

/**
 * Created by Nyaruhodo on 16.05.2016.
 */
public class CustomMenuItemPresenter extends Presenter<MenuItem, CustomMenuItemPresenter.ViewHolder> {

    private final int id;

    public CustomMenuItemPresenter(@NonNull PresenterAdapter<MenuItem> presenterAdapter) {
        super(presenterAdapter);

        id = new Random().nextInt(Integer.MAX_VALUE);
    }

    @LayoutRes
    @Override
    protected int getLayout() {
        return R.layout.custom_menu_item_view;
    }

    @NonNull
    @Override
    protected ViewHolder createViewHolder(@LayoutRes int layout, @NonNull ViewGroup viewGroup) {
        return new ViewHolder(layout, viewGroup);
    }

    @Override
    public void bindViewHolder(@NonNull ViewHolder viewHolder, @NonNull MenuItem item, int position) {
        final Context context = viewHolder.itemView.getContext();

        if (item.getIcon() != 0)
            Glide.with(context)
                    .load(item.getIcon())
                    .into(viewHolder.icon);

        viewHolder.label.setText(context.getString(item.getLabel()));

        //        final Fragment currentFragment = currentFragment();
//        if (currentFragment != null && item.getFragment().tag().equalsIgnoreCase(currentFragment.getClass().getSimpleName()))
//            return;

        if (item.getAction() != null)
            viewHolder.itemView.setOnClickListener(item.getAction()::onClick);
    }

    public static class ViewHolder extends BaseViewHolder {

        @NonNull
        ImageView icon;

        @NonNull
        TextView label;

        public ViewHolder(@LayoutRes int layout, @NonNull ViewGroup parent) {
            super(layout, parent);

            icon = (ImageView) itemView.findViewById(net.kibotu.materialmenu.R.id.icon);
            label = (TextView) itemView.findViewById(net.kibotu.materialmenu.R.id.label);
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

        CustomMenuItemPresenter that = (CustomMenuItemPresenter) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
