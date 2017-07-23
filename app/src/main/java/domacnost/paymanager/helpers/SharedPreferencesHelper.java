package domacnost.paymanager.helpers;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import domacnost.paymanager.base.BaseActivity;

public class SharedPreferencesHelper {

    public static void saveUser(String user) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(BaseActivity.getInstance());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(SharedPreferencesKey.USER, user);
        editor.apply();
    }

    public static String getUser() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(BaseActivity.getInstance());
        return preferences.getString(SharedPreferencesKey.USER, "");
    }
}
