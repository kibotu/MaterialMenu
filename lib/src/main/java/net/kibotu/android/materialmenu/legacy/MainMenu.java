package net.kibotu.android.materialmenu.legacy;

/**
 * Created by conrad on 2015/03/06.
 */
public class MainMenu /*extends BaseViewHolder implements Localized */{
//
//    MainMenuExpandableAdapter adapter;
//    final HashSet<View> views = new HashSet<>();
//
//    public MainMenu(@NonNull final RecyclerView recyclerView) {
//        super(recyclerView);
//        getItemViewAsRecyclerView().setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        updateMenu();
//    }
//
//    @NonNull
//    private RecyclerView getItemViewAsRecyclerView() {
//        return (RecyclerView) itemView;
//    }
//
//    public static void select(@NonNull final MainMenuItemType2 type) {
//        select(type.item);
//    }
//
//    public static void select(@NonNull MainMenuItem item) {
//        closeMenu();
//
//        // no duplicates
//        final Fragment currentFragment = currentFragment();
//        if (currentFragment != null && item.getFragment().tag().equalsIgnoreCase(currentFragment.getClass().getSimpleName()))
//            return;
//
//        replaceToBackStackBySlidingHorizontally(item.getFragment());
//    }
//
//    public void updateMenu() {
//        localize();
//    }
//
//    public static void closeMenu() {
//        final Drawer drawer = ProviderExtensions.getDrawerViewHolder();
//        if (drawer != null)
//            drawer.closeDrawers();
//    }
//
//    @Override
//    public void localize() {
//        final List<MainMenuParentListItem> items = LocalUser.isInGuestMode()
//                ? MainMenuFactory.getLoggedOutMenuItems()
//                : MainMenuFactory.getLoggedInMenuItems();
//
//        adapter = new MainMenuExpandableAdapter(items);
//        getItemViewAsRecyclerView().setAdapter(adapter);
//    }
//
//    @DrawableRes
//    public static int getRootHomeIcon() {
//        return R.drawable.ic_menu_white_36dp;
//    }
//
//    @DrawableRes
//    public static int getSubMenuHomeIcon() {
//        return R.drawable.ic_arrow_back_white_36dp;
//    }
//
//    public void setFonts() {
//        // handled in binder
//    }
}

