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
   
  
    
### NavigationDrawer

To keep the translucent status bar make sure to have a CoordinatorLayout as root element with fitSystemWindows enabled. 
    
    <android.support.design.widget.CoordinatorLayout
        android:fitsSystemWindows="true"

### ActionBar


  
#### With Custom ActionBar
    
    MaterialMenu.setActionBar(new MyToolbar(this));
  
    <style name="AppTheme" parent="@style/Theme.AppCompat.Light.DarkActionBar">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
    </style>
   
Otherwise you might hit this exception:
    
    java.lang.RuntimeException: java.lang.IllegalStateException: This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.

### Menu    
            
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