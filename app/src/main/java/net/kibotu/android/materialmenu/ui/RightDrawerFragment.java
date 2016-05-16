package net.kibotu.android.materialmenu.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import net.kibotu.android.materialmenu.R;

import butterknife.BindView;

import static net.kibotu.android.materialmenu.ViewExtensions.getStatusBarHeight;
import static net.kibotu.android.materialmenu.ViewExtensions.setLayoutMargin;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public class RightDrawerFragment extends BaseFragment {

    @NonNull
    @BindView(R.id.right_drawer_layout)
    View layout;
    @NonNull
    @BindView(R.id.title)
    TextView title;

    @Override
    protected int getLayout() {
        return R.layout.right_drawer;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setLayoutMargin(layout, 0, getStatusBarHeight(), 0, 0);

        title.setText("Right Drawer Title");
    }
}
