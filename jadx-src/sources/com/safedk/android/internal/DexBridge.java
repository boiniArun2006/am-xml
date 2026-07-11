package com.safedk.android.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.Context;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class DexBridge {
    private static final String TAG = "DexBridge";

    public static String generateString(String content) {
        return content;
    }

    public static Context getContext() {
        return SafeDK.getInstance().m();
    }

    public static void appClassOnCreateBefore(Application app) {
        Logger.d("SafeDKApplication", "onCreate");
        SafeDK.a(app.getApplicationContext(), app);
    }

    public static void providerOnCreateBefore(ContentProvider provider) {
        Logger.d(TAG, "Content Provider: onCreate (not active)");
    }
}
