# Android Navigation Sample

In this app I created a demonstration of how to navigate to a new activity or fragment using an
intent and using the android navigation component.

To use the navigation component, some configuration must be done on the gradle files

On the project level gradle, the following line must be added to the dependencies with its corresponding
version.

safe_args_plugin_version = "1.0.0"
- classpath "android.arch.navigation:navigation-safe-args-gradle-plugin:$safe_args_plugin_version"

On the module app gradle the following lines must be added to the plugins and dependencies respectively,
with its corresponding version.

plugin
- id 'androidx.navigation.safeargs'
- id 'kotlin-parcelize'

dependencies  
navigation_version = "2.3.0"
- implementation "androidx.navigation:navigation-fragment-ktx:$navigation_version"
- implementation "androidx.navigation:navigation-ui-ktx:$navigation_version"


