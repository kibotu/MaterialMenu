package net.kibotu.android.materialmenu.legacy;

/**
 * Created by Jan Rabe on 17/09/15.
 */
public class Toolbar /* extends BaseViewHolder implements Localized*/ {

//    @NonNull
//    @BindView(R.id.menu_toolbar_search)
//    SearchView searchView;
//    @NonNull
//    @BindView(R.id.toolbar_title)
//    TextView title;
//    @NonNull
//    @BindView(search_plate)
//    View searchPlate;
//    @NonNull
//    @BindView(search_src_text)
//    EditText searchEditText;
//    @NonNull
//    @BindView(search_close_btn)
//    ImageView searchCloseIcon;
//    @NonNull
//    @BindView(search_voice_btn)
//    ImageView voiceIcon;
//    @NonNull
//    @BindView(search_mag_icon)
//    ImageView searchIcon;
//
//    @NonNull
//    @BindView(R.id.home_icon)
//    ImageView homeIcon;
//
//    private void styleSearchView() {
//        final SearchManager searchManager = (SearchManager) getContext().getSystemService(Context.SEARCH_SERVICE);
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getContext().getComponentName()));
//
//        if (BuildConfig.FLAVOR.equalsIgnoreCase("questico")) {
//            searchPlate.setBackgroundResource(R.drawable.textfield_search_selected_holo_light);
//            searchEditText.setTextColor(Color.WHITE);
//        } else {
//            searchPlate.setBackgroundColor(color(R.color.transparent));
//            searchEditText.setGravity(Gravity.BOTTOM);
//            searchEditText.setTextColor(color(R.color.standard_text));
//        }
//
//        searchView.setQueryHint(Localization.getString(R.string.expert_list_search_title));
//        setSize(searchIcon, 24, 24);
//    }
//
//    public void setupWithSearchProvider(final @Nullable SearchBarProvider searchBarProvider) {
//        if (searchBarProvider != null) {
//            searchView.setVisibility(View.VISIBLE);
//            searchView.setOnQueryTextListener(searchBarProvider.getOnQueryTextListener());
//            searchEditText.setOnFocusChangeListener(searchBarProvider.getOnFocusChangeListener());
//            searchCloseIcon.setOnClickListener(searchBarProvider.getOnCloseListener());
//            searchBarProvider.setSearchView(searchView);
//        } else {
//            searchView.setVisibility(View.GONE);
//            searchView.setOnQueryTextListener(null);
//            searchEditText.setOnFocusChangeListener(null);
//            searchCloseIcon.setOnClickListener(null);
//        }
//    }
}
