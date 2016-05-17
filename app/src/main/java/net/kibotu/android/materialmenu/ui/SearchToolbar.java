package net.kibotu.android.materialmenu.ui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import net.kibotu.android.materialmenu.MaterialToolbar;
import net.kibotu.android.materialmenu.R;

/**
 * Created by jan.rabe on 17/05/16.
 */
public class SearchToolbar extends MaterialToolbar {

    protected View homeIconHitBox;

    protected ImageView homeIcon;

    protected TextView title;

    protected SearchView searchView;

    public SearchToolbar(@NonNull AppCompatActivity context) {
        super(context);

        homeIcon = (ImageView) context.findViewById(net.kibotu.materialmenu.R.id.home_icon);
//        homeIconHitBox = context.findViewById(net.kibotu.materialmenu.R.id.icon_layout);
        title = (TextView) context.findViewById(net.kibotu.materialmenu.R.id.actionbar_title);
        searchView = (SearchView) context.findViewById(R.id.menu_toolbar_search);
    }



    @Override
    public int getLayout() {
        return R.layout.search_toolbar;
    }
}
