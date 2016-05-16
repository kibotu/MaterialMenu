package net.kibotu.android.materialmenu.legacy;

/**
 * Created by jan.rabe on 13/01/16.
 */
public class MainMenuExpandableAdapter /*extends ExpandableRecyclerAdapter<MainMenuExpandableAdapter.MainMenuParentViewHolder, MainMenuExpandableAdapter.MainMenuChildViewHolder> */{

//    @NonNull
//    private final LayoutInflater inflater;
//
//    final HashMap<Integer, MainMenuParentViewHolder> viewHoldersCache = new HashMap<>();
//
//    public MainMenuExpandableAdapter(@NonNull List<? extends ParentListItem> parentItemList) {
//        super(parentItemList);
//        inflater = LayoutInflater.from(getContext());
//    }
//
//    private void refreshExpandableIcons() {
//        final List<? extends ParentListItem> list = getParentItemList();
//        for (int i = 0, parentItemList1Size = list.size(); i < parentItemList1Size; i++) {
//            final MainMenuParentListItem item = (MainMenuParentListItem) list.get(i);
//            final MainMenuParentViewHolder mainMenuParentViewHolder = viewHoldersCache.get(i);
//            setExpandableIcon(mainMenuParentViewHolder.expandableIcon, item.isExpanded(), item.hasChildren());
//        }
//    }
//
//    @NonNull
//    @Override
//    public MainMenuParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
//        return new MainMenuParentViewHolder(inflater.inflate(R.layout.main_menu_parent_item, viewGroup, false));
//    }
//
//    @NonNull
//    @Override
//    public MainMenuChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
//        return new MainMenuChildViewHolder(inflater.inflate(R.layout.main_menu_child_item, viewGroup, false));
//    }
//
//    @Override
//    public void onBindParentViewHolder(@NonNull MainMenuParentViewHolder viewHolder, int position, ParentListItem parentListItem) {
//
//        if (!(parentListItem instanceof MainMenuParentListItem))
//            return;
//
//        if (viewHoldersCache.containsKey(position)) {
//            viewHoldersCache.remove(position);
//        }
//        viewHoldersCache.put(position, viewHolder);
//
//        final MainMenuParentListItem item = (MainMenuParentListItem) parentListItem;
//
//        // set label
//        viewHolder.textView.setText(item.getLocalizedName());
//
//        // set icon
//        viewHolder.image.setImageResource(item.getIconId());
//
//        // set initial expandable icon
//        setExpandableIcon(viewHolder.expandableIcon, item.isExpanded(), item.hasChildren());
//
//        // inject expandable icon change to click event
//        injectClickEvent(viewHolder, v -> {
//
//            collapseAllBut(item);
//
//            toggle(item);
//
//            refreshExpandableIcons();
//
//            View.OnClickListener clickListener = (View.OnClickListener) viewHolder.itemView.getTag();
//            if (clickListener != null)
//                clickListener.onClick(v);
//        });
//
//        // set click listener
//        setClickListener(viewHolder.textView, item);
//    }
//
//    private void collapseAllBut(MainMenuParentListItem parent) {
//        final List<? extends ParentListItem> list = getParentItemList();
//        for (ParentListItem item : list) {
//            if (item != parent) {
//                ((MainMenuParentListItem) item).isExpanded(false);
//                collapseParent(item);
//            }
//        }
//        refreshExpandableIcons();
//    }
//
//    @Override
//    public void onParentListItemExpanded(int position) {
//        super.onParentListItemExpanded(position);
//    }
//
//    @Override
//    public void onParentListItemCollapsed(int position) {
//        super.onParentListItemCollapsed(position);
//    }
//
//    private void toggle(@NonNull MainMenuParentListItem item) {
//        item.isExpanded(!item.isExpanded());
//    }
//
//    private void setExpandableIcon(@NonNull ImageView expandableIcon, boolean isExpanded, boolean hasChildren) {
//        if (!hasChildren) {
//            expandableIcon.setImageResource(R.drawable.selector_button_transparent);
//            return;
//        }
//
//        if (isExpanded) {
//            play(sequence(rotateTo(90, 0.3f, Interpolations.SineEaseInOut)), expandableIcon);
//        } else
//            play(sequence(rotateTo(0, 0.3f, Interpolations.SineEaseInOut)), expandableIcon);
//    }
//
//    public static void setDimension(@NonNull View view, int width, int height) {
//        final ViewGroup.LayoutParams p = view.getLayoutParams();
//        p.width = width;
//        p.height = height;
//        view.setLayoutParams(p);
//    }
//
//    private void setClickListener(@NonNull View view, @NonNull MainMenuItem item) {
//        if (item.hasAction())
//            view.setOnClickListener(v -> {
//                track(item);
//                item.action.run();
//            });
//        else if (item.getFragmentClass() != null)
//            view.setOnClickListener(v -> {
//                track(item);
//                MainMenu.select(item);
//            });
//        else {
//            view.setOnClickListener(null);
//            view.setClickable(false);
//        }
//    }
//
//    private void track(@NonNull MainMenuItem item) {
//        BloodHound.track(R.string.gA_Screen_Name_Menu, R.string.gA_Category_OnClick, R.string.gA_Event_Menu_Touched, item.gaEventName);
//    }
//
//    public static void injectClickEvent(@NonNull MainMenuParentViewHolder viewHolder, final View.OnClickListener listener) {
//        try {
//            final View.OnClickListener clickListener = (View.OnClickListener) viewHolder.itemView.getTag();
//            if (clickListener == null) {
//                viewHolder.itemView.setTag(getClickListener(viewHolder.itemView));
//            }
//            viewHolder.itemView.setOnClickListener(listener);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static View.OnClickListener getClickListener(View view) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//        // get the nested class `android.view.View$ListenerInfo`
//        Field listenerInfoField = null;
//        listenerInfoField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
//        if (listenerInfoField != null) {
//            listenerInfoField.setAccessible(true);
//        }
//        Object myLiObject = null;
//        myLiObject = listenerInfoField.get(view);
//
//        // get the field mOnClickListener, that holds the listener and cast it to a listener
//        Field listenerField = null;
//        listenerField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
//        if (listenerField != null && myLiObject != null) {
//            View.OnClickListener myListener = (View.OnClickListener) listenerField.get(myLiObject);
//            return myListener;
//        }
//        return null;
//    }
//
//    @Override
//    public void onBindChildViewHolder(@NonNull MainMenuChildViewHolder viewHolder, int position, Object mainMenuItem) {
//        if (!(mainMenuItem instanceof MainMenuItem))
//            return;
//
//        final MainMenuItem item = (MainMenuItem) mainMenuItem;
//
//        // set label
//        viewHolder.textView.setText(item.getLocalizedName());
//
//        // set click listener
//
//        if (!item.hasAction() && item.getFragmentClass() == null) {
//            viewHolder.textView.setOnClickListener(null);
//            return;
//        }
//
//        viewHolder.textView.setOnClickListener(v -> {
//            track(item);
//            if (item.hasAction())
//                item.getAction().run();
//            else
//                MainMenu.select(item);
//        });
//    }
//
//    public static class MainMenuParentViewHolder extends ParentViewHolder {
//
//        @NonNull
//        @BindView(R.id.menu_item_name)
//        TextView textView;
//
//        @NonNull
//        @BindView(R.id.menu_item_image)
//        ImageView image;
//
//        @NonNull
//        @BindView(R.id.expandable_icon)
//        ImageView expandableIcon;
//
//        public MainMenuParentViewHolder(@NonNull final View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//            textView.setTypeface(FontCache.FontIstok.getFont());
//        }
//    }
//
//    public static class MainMenuChildViewHolder extends ChildViewHolder {
//
//        @NonNull
//        @BindView(R.id.menu_item_name)
//        TextView textView;
//
//        public MainMenuChildViewHolder(@NonNull final View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//            textView.setTypeface(FontCache.FontIstok.getFont());
//        }
//    }
}
