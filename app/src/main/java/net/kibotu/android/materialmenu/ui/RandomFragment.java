package net.kibotu.android.materialmenu.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import net.kibotu.android.materialmenu.R;

import butterknife.BindView;

/**
 * Created by Nyaruhodo on 15.05.2016.
 */
public class RandomFragment extends BaseFragment {

    @NonNull
    @BindView(R.id.title)
    TextView text;

    @Override
    protected int getLayout() {
        return R.layout.fragment_random;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        text.setText("random text");
    }
}
