package net.kibotu.android.materialmenu.legacy;

/**
 * Created by jan.rabe on 02/02/16.
 */
public interface ISupportMenu /*extends TitleProvider */{

    void updateMenu();

    boolean showActionBar();

    boolean lockLeftMenu();

    boolean lockRightMenu();
}
