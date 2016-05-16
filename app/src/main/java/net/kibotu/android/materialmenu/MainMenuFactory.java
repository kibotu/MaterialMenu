package net.kibotu.android.materialmenu;

import android.support.annotation.NonNull;

import net.kibotu.android.materialmenu.legacy.qde.MainMenuItem;
import net.kibotu.android.materialmenu.legacy.qde.MainMenuParentListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jan.rabe on 14/01/16.
 */
public class MainMenuFactory {
    public static List<MainMenuItem> create() {

        final List<MainMenuItem> list = new ArrayList<>();

//        list.add(MainMenuItemType.Nearby_Crews.item);
//        list.add(MainMenuItemType.Chats.item);
//        list.add(MainMenuItemType.My_Crew_Chat.item);
////        add(MainMenuItemType.Location.item);
//        list.add(MainMenuItemType.LocationReinforcement.item);
////        add(MainMenuItemType.Contacts.item);
////        add(MainMenuItemType.ContactsReinforcement.item);
//        list.add(MainMenuItemType.Chat.item);
//        list.add(MainMenuItemType.ChatReinforcement.item);
//        list.add(MainMenuItemType.AddressBook.item);
//        list.add(MainMenuItemType.InviteFriends.item);
//        list.add(MainMenuItemType.SendInvites.item);
//        list.add(MainMenuItemType.InvitedNotification.item);
//        list.add(new MainMenuItem(R.string.logout, R.drawable.ic_person_outline, R.string.ga_label, null).setAction(LoginFragment::logout));

        return list;
    }
    /**
     * @see <a href="https://docs.google.com/spreadsheets/d/19VrWaUZxHFGhPxWWvY09Rw1gX8VUYHfGN9a-oCLFX8M/edit#gid=1222579688">https://docs.google.com/spreadsheets/d/19VrWaUZxHFGhPxWWvY09Rw1gX8VUYHfGN9a-oCLFX8M/edit#gid=1222579688</a>
     */
    @NonNull
    public static List<MainMenuParentListItem> getLoggedInMenuItems() {
        final List<MainMenuParentListItem> items = new ArrayList<>();

//        // start
//        items.add(new MainMenuParentListItem(R.string.menu_title_start, R.drawable.menu_start_icon, R.string.gA_Screen_Name_Expert_List, null, Arrays.asList(
//                // Spiritual.item,
//                new MainMenuItem(R.string.menu_title_expert, MainMenuItemType.ExpertList.item.getIconId(), MainMenuItemType.ExpertList.item.getGaEventName(), MainMenuItemType.ExpertList.item.getFragmentClass())
//        )));
//
//        // my questico
//        items.add(new MainMenuParentListItem(MainMenuItemType.MyQuestico.item.getNameResId(), MainMenuItemType.MyQuestico.item.getIconId(), MainMenuItemType.MyQuestico.item.getGaEventName(), null, Arrays.asList(
//                // dashboard
//                new MainMenuItem(R.string.menu_title_overview, MainMenuItemType.MyQuestico.item.getIconId(), MainMenuItemType.MyQuestico.item.getGaEventName(), MainMenuItemType.MyQuestico.item.getFragmentClass()),
//                MainMenuItemType.Favorites.item,
//                MainMenuItemType.CallbackList.item,
//                new MainMenuItem(R.string.menu_title_promotions, MainMenuItemType.PromotionList.item.getIconId(), MainMenuItemType.PromotionList.item.getGaEventName(), MainMenuItemType.PromotionList.item.getFragmentClass())
//                // TelephoneNumber.item,
//                // Balance.item,
//                // Transactions.item,
//                // PaymentInformation.item
//        )));
//
//
//        // my day
//        final List<MainMenuItem> myDayList = Arrays.asList(
//                // Spiritual.item,
//                MainMenuItemType.QuoteOfTheDay.item,
//                MainMenuItemType.Horoscope.item
//        );
//
//        items.add(new MainMenuParentListItem(R.string.menu_title_day, MainMenuItemType.Horoscope.item.getIconId(), R.string.gA_Screen_Name_Expert_List, null, myDayList));
//
//        // redeem voucher
//        items.add(new MainMenuParentListItem(MainMenuItemType.RedeemVoucher.item.getNameResId(), MainMenuItemType.RedeemVoucher.item.getIconId(), MainMenuItemType.RedeemVoucher.item.getGaEventName(), MainMenuItemType.RedeemVoucher.item.getFragmentClass(), null));
//
//        // info & help
//        final List<MainMenuItem> help = new ArrayList<>();
//        help.add(MainMenuItemType.Contact.item);
//        if (Settings.SHOW_TUTORIALS)
//            help.add(MainMenuItemType.Tutorial.item);
//        help.add(new MainMenuItem(R.string.menu_title_recommend, R.drawable.selector_button_transparent, R.string.gA_Label_Menu_Recommend).setAction(MainMenuFactory::sendRecommendMail));
//
//        items.add(new MainMenuParentListItem(R.string.menu_title_help, R.drawable.menu_info_icon, MainMenuItemType.Settings.item.getGaEventName(), null, help));
//
//        // about the app
//        addAboutTheAppEntry(items);
//
//        // logout new MainMenuItem(R.string.menu_title_recommend, R.drawable.selector_button_transparent, R.string.gA_Label_Menu_Recommend)));
//        items.add((MainMenuParentListItem) new MainMenuParentListItem(MainMenuItemType.Logout.item.getNameResId(), MainMenuItemType.Logout.item.getIconId(), MainMenuItemType.Logout.item.getGaEventName(), null, null).setAction(MainMenuFactory::logout));

        return items;
    }

    /**
     * @see <a href="https://docs.google.com/spreadsheets/d/19VrWaUZxHFGhPxWWvY09Rw1gX8VUYHfGN9a-oCLFX8M/edit#gid=1222579688">https://docs.google.com/spreadsheets/d/19VrWaUZxHFGhPxWWvY09Rw1gX8VUYHfGN9a-oCLFX8M/edit#gid=1222579688</a>
     */
    @NonNull
    public static List<MainMenuParentListItem> getLoggedOutMenuItems() {
        final List<MainMenuParentListItem> items = new ArrayList<>();

//        // start
//        items.add(new MainMenuParentListItem(R.string.menu_title_start, R.drawable.menu_start_icon, R.string.gA_Screen_Name_Expert_List, null, Arrays.asList(
//                // Spiritual.item,
//                MainMenuItemType.ExpertList.item
//        )));
//
//        // my day
//        final List<MainMenuItem> myDayList = Arrays.asList(
//                // Spiritual.item,
//                MainMenuItemType.QuoteOfTheDay.item,
//                MainMenuItemType.Horoscope.item
//        );
//
//        if (BuildConfig.FLAVOR.equals("questico"))
//            myDayList.add(MainMenuItemType.QuoteOfTheDay.item);
//
//        items.add(new MainMenuParentListItem(R.string.menu_title_day, MainMenuItemType.Horoscope.item.getIconId(), R.string.gA_Screen_Name_Expert_List, null, myDayList));
//
//
//        // info & help
//        final List<MainMenuItem> help = new ArrayList<>();
//        help.add(MainMenuItemType.Contact.item);
//        if (Settings.SHOW_TUTORIALS)
//            help.add(MainMenuItemType.Tutorial.item);
//        items.add(new MainMenuParentListItem(R.string.menu_title_help, R.drawable.menu_info_icon, MainMenuItemType.Settings.item.getGaEventName(), null, help));
//
//        // about the app
//        addAboutTheAppEntry(items);
//
//        items.add(new MainMenuParentListItem(MainMenuItemType.Login.item.getNameResId(), MainMenuItemType.Login.item.getIconId(), MainMenuItemType.Login.item.getGaEventName(), MainMenuItemType.Login.item.getFragmentClass(), null));

        return items;
    }

    private static void addAboutTheAppEntry(@NonNull List<MainMenuParentListItem> items) {
//        items.add(new MainMenuParentListItem(R.string.menu_title_about_app, R.drawable.menu_about_app_icon, MainMenuItemType.Settings.item.getGaEventName(), null, Arrays.asList(
//                setWebViewFragmentAction(new MainMenuItem(R.string.settings_item_AGB, R.drawable.selector_button_transparent, R.string.gA_Label_Settings_Agb), getString(R.string.settings_AGB_URL)),
//                setWebViewFragmentAction(new MainMenuItem(R.string.settings_item_impressum, R.drawable.selector_button_transparent, R.string.gA_Label_Settings_Imprint), getString(R.string.settings_impressum_link)),
//                setWebViewFragmentAction(new MainMenuItem(R.string.settings_item_cancellation_policy, R.drawable.selector_button_transparent, R.string.gA_Label_Settings_Cancellation_Policy), getString(R.string.settings_cancellation_policy_link)),
//                setWebViewFragmentAction(new MainMenuItem(R.string.settings_item_privacy_policy, R.drawable.selector_button_transparent, R.string.gA_Label_Settings_Privacy_Policy), getString(R.string.settings_privacy_link)),
//                new MainMenuItem(R.string.settings_item_app_version, R.drawable.selector_button_transparent, MainMenuItemType.Settings.item.getGaEventName(), MainMenuItemType.Settings.item.getFragmentClass())
//        )));
    }

    @NonNull
    public static MainMenuItem setWebViewFragmentAction(@NonNull MainMenuItem menuItem, String url) {
//        menuItem.setAction(() -> {
//            final SettingsWebViewFragment fragment = new SettingsWebViewFragment();
//            final Bundle args = new Bundle();
//            args.putString("url", url);
//            args.putString("title", menuItem.getLocalizedName());
//            args.putInt("gaScreenName", menuItem.getGaEventName());
//
////                        if (!TextUtils.isEmpty(item.getStylesheet()))
////                            args.putString("stylesheet", item.getStylesheet());
//
//            fragment.setArguments(args);
//
//            MainMenu.closeMenu();
//
//            clearBackStack();
//
//            replaceToBackStackBySlidingHorizontally(fragment);
//        });

        return menuItem;
    }

    public static void sendRecommendMail() {
//        sendEmail("", getString(R.string.recommend_mail_subject), getStringAsHtml(R.string.recommend_mail_text_android), MainMenuItemType.Recommend.getRequestCode(), getString(R.string.recommend_dialog_title));
    }

    public static void logout() {
//        ClientFactory.getInstance().logout();
//        Session.instance.activateGuestMode();
//        final Drawer drawerViewHolder = getDrawerViewHolder();
//        if (drawerViewHolder != null)
//            drawerViewHolder.getMenu().updateMenu();
//        MainMenu.select(MainMenuItemType.Login);
    }

    private static void toastAppVersion() {
//        final Version version = new Version(getContext());
//        toast(MessageFormat.format("{0} ({1})", version.getVersionName(), version.getVersionCode()));
    }
}
