package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by i-tomsolutions on 08/12/2017.
 */

public class SettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
