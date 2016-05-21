package net.kibotu.android.materialmenu.ui;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.kibotu.android.materialmenu.FragmentTag;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment implements FragmentTag {

    protected View rootView;

    private Unbinder unbinder;

    public BaseFragment() {
        // required empty public constructor
    }

    @LayoutRes
    protected abstract int getLayout();

    @CallSuper
    @Override
    public void onViewCreated(@NonNull final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
    }

    @Override
    final public View onCreateView(@NonNull final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        if (rootView == null) {
            final int layout = getLayout();
            rootView = inflater.inflate(layout, container, false);
        }
        return rootView;
    }

    @CallSuper
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @NonNull
    @Override
    public String fragmentTag() {
        return getClass().getSimpleName();
    }
}
