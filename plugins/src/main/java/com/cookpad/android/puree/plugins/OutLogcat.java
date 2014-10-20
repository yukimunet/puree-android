package com.cookpad.android.puree.plugins;

import android.util.Log;

import com.cookpad.android.puree.OutputConfiguration;
import com.cookpad.android.puree.outputs.PureeOutput;

import org.json.JSONObject;

public class OutLogcat extends PureeOutput {
    public static final String TYPE = "logcat";

    private static final String TAG = OutLogcat.class.getSimpleName();

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public OutputConfiguration configure(OutputConfiguration conf) {
        return conf;
    }

    @Override
    public void emit(JSONObject serializedLog) {
        Log.d(TAG, serializedLog.toString());
    }
}
