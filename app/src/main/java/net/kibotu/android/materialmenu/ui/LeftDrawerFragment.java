package net.kibotu.android.materialmenu.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.kibotu.android.materialmenu.MaterialMenu;
import net.kibotu.android.materialmenu.R;

import butterknife.BindView;

import static net.kibotu.android.materialmenu.ViewExtensions.getStatusBarHeight;
import static net.kibotu.android.materialmenu.ViewExtensions.setLayoutMargin;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public class LeftDrawerFragment extends BaseFragment {

    @NonNull
    @BindView(R.id.left_drawer_layout)
    View layout;
    @NonNull
    @BindView(R.id.drawer_title)
    TextView title;
    @NonNull
    @BindView(R.id.main_menu_list)
    RecyclerView list;

    @Override
    protected int getLayout() {
        return R.layout.left_drawer;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setLayoutMargin(layout, 0, getStatusBarHeight(), 0, 0);

        title.setText("Left Drawer Title");

        list.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        MaterialMenu.setAdapterToList(list);
    }
}
