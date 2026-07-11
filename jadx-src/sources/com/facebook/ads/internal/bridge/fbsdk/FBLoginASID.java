package com.facebook.ads.internal.bridge.fbsdk;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Keep
public class FBLoginASID {
    @Nullable
    public static String getFBLoginASID() {
        try {
            AccessToken.Companion companion = AccessToken.INSTANCE;
            Object objInvoke = AccessToken.class.getDeclaredMethod("getCurrentAccessToken", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return (String) AccessToken.class.getDeclaredMethod("getUserId", new Class[0]).invoke(objInvoke, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
