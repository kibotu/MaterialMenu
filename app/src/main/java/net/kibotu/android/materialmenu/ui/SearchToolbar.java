package net.kibotu.android.materialmenu.ui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import net.kibotu.android.materialmenu.Configurator;
import net.kibotu.android.materialmenu.MaterialToolbar;
import net.kibotu.android.materialmenu.R;
import net.kibotu.android.materialmenu.ViewExtensions;

import butterknife.BindView;

/**
 * Created by Nyaruhodo on 21.05.2016.
 */
public class SearchToolbar extends MaterialToolbar implements Configurator<SearchView> {

    @BindView(R.id.actionbar_title)
    protected TextView title;

    public SearchToolbar(@NonNull AppCompatActivity context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.custom_toolbar;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onBind() {

    }

    @Override
    public void configure(@NonNull final SearchView searchView) {
        EditText searchText = (EditText) searchView.findViewById(R.id.search_src_text);
        View searchPlate = searchView.findViewById(R.id.search_plate);
        searchPlate.setBackgroundColor(ViewExtensions.color(android.R.color.transparent));
        searchText.setBackgroundColor(ViewExtensions.color(android.R.color.transparent));
    }
}
