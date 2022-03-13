package com.fastaccess.helper;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fastaccess.App;
import com.tencent.mmkv.MMKV;

import java.util.Map;

/**
 * Created by kosh20111 on 19 Feb 2017, 2:01 AM
 */
public class PrefHelper {
    private static MMKV mmkv;

    public static void init(Context context) {
        MMKV.initialize(context);
        mmkv = MMKV.mmkvWithID("preferences");
    }

    public static MMKV getInstance() {
        return mmkv;
    }


    public static MMKV getInstanceWithKey(String key) {
        return MMKV.mmkvWithID(key);
    }

    /**
     * @param key   ( the Key to used to retrieve this data later  )
     * @param value ( any kind of primitive values  )
     *              <p/>
     *              non can be null!!!
     */
    @SuppressLint("ApplySharedPref")
    public static <T> void set(@NonNull String key, @Nullable T value) {
        if (InputHelper.isEmpty(key)) {
            throw new NullPointerException("Key must not be null! (key = " + key + "), (value = " + value + ")");
        }
        SharedPreferences.Editor edit = getInstance().edit();
        if (value == null || InputHelper.isEmpty(value.toString())) {
            clearKey(key);
            return;
        }
        if (value instanceof String) {
            edit.putString(key, (String) value);
        } else if (value instanceof Integer) {
            edit.putInt(key, (Integer) value);
        } else if (value instanceof Long) {
            edit.putLong(key, (Long) value);
        } else if (value instanceof Boolean) {
            edit.putBoolean(key, (Boolean) value);
        } else if (value instanceof Float) {
            edit.putFloat(key, (Float) value);
        } else {
            assert value != null;
            edit.putString(key, value.toString());
        }
        edit.commit();//apply on UI
    }

    @Nullable
    public static String getString(@NonNull String key) {
        return getInstance().getString(key, null);
    }

    public static boolean getBoolean(@NonNull String key) {
        SharedPreferences preferences = getInstance();
        return preferences.getBoolean(key, false);
    }

    public static int getInt(@NonNull String key) {
        SharedPreferences preferences = getInstance();
        return preferences.getInt(key, 0);
    }

    public static long getLong(@NonNull String key) {
        return getInstance().getLong(key, 0);
    }

    public static float getFloat(@NonNull String key) {
        return getInstance().getFloat(key, 0);
    }

    public static void clearKey(@NonNull String key) {
        getInstance().edit().remove(key).apply();
    }

    public static boolean isExist(@NonNull String key) {
        return getInstance().contains(key);
    }

    public static void clearPrefs() {
        getInstance().edit().clear().apply();
    }

    public static Map<String, ?> getAll() {
        return getInstance().getAll();
    }
}
