package com.achep.acdisplay.ui.fragments.settings;

import android.os.Bundle;

import com.achep.acdisplay.Config;
import com.achep.acdisplay.R;
import com.afollestad.digitus.Digitus;

/**
 * Created by Shaun on 01-Nov-16.
 */

public class FingerPrintSettings extends BaseSettings {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestMasterSwitch(Config.KEY_FINGERPRINT);
        addPreferencesFromResource(R.xml.settings_fingerprint_fragment);
        getConfig().setActivity(getActivity());
    }

    @Override
    public void onPause() {
        super.onPause();
        try {
            Digitus.deinit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
