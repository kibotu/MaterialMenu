MaterialMenu [![](https://jitpack.io/v/kibotu/MaterialMenu.svg)](https://jitpack.io/#kibotu/MaterialMenu) [![Build Status](https://travis-ci.org/kibotu/MaterialMenu.svg)](https://travis-ci.org/kibotu/MaterialMenu)  [![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=15) [![Licence](https://img.shields.io/badge/licence-Apache-blue.svg)](https://raw.githubusercontent.com/kibotu/MaterialMenu/master/LICENSE) [![Gradle Version](https://img.shields.io/badge/gradle-2.13-green.svg)](https://docs.gradle.org/current/release-notes)
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Small library to help getting started for creating material design navigation drawer, handling action bar and an actual usable menu. 

### How to install
	
	repositories {
	    maven {
	        url "https://jitpack.io"
	    }
	}
		
	dependencies {
            compile 'com.github.kibotu:MaterialMenu:-SNAPSHOT'
    }
    
### How to use

Set the main layout as content view in your activity.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
    }

Or include the drawer layout into your layout. 
   
    <?xml version="1.0" encoding="utf-8"?>
    <android.support.design.widget.CoordinatorLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true">
    
        <include
            layout="@layout/drawer_layout"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    
    </android.support.design.widget.CoordinatorLayout>  
    
Later use R.id.fragment_container for fragment action.

### Menu    

Set menu items with:
                
     MaterialMenu.with(this).addMenuItem(createUserMenu());
     
 or later
    
    MaterialMenu.setMenuItems(createGuestMenu());
    
### Menu Items

Basically they're a simplified way of creating a menu structure at the beginning.

    new MenuItem()
        .setLabel(R.string.menu_item1)
        .setIcon(R.drawable.ic_bug_report_black_18dp)
        .setAnalyticsTag(R.string.ga_menu_item1)
        .setAction(v -> login());       
    
It also has a custom action to open as fragments inside the R.id.fragment_container;

    setOpenFragmentAction(RandomFragment.class);
    
As you might have noticed we're using @StringRes for the label and for the analytic tag in case we want runtime localization, which we can do in custom MenuItemPresenter.    

    setPresenter(CustomMenuItemPresenter.class)
    
### NavigationDrawer

Set custom fragments as left or right navigation drawer.

    MaterialMenu.with(this)
        .setLeftDrawerFragment(new LeftDrawerFragment())
        .setRightDrawerFragment(new RightDrawerFragment());

To keep the translucent status bar make sure to have a CoordinatorLayout as root element with fitSystemWindows enabled. 
    
    <android.support.design.widget.CoordinatorLayout
        android:fitsSystemWindows="true"

### ActionBar
    
    MaterialMenu.setActionBar(new MyToolbar(this));
    
Set the action bar style since we're using a toolbar. 
  
    <style name="AppTheme" parent="@style/Theme.AppCompat.Light.DarkActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
    </style>
   
Otherwise you might hit this exception:
    
    java.lang.RuntimeException: java.lang.IllegalStateException: This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.

###License
<pre>
Copyright 2016 Jan Rabe

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>