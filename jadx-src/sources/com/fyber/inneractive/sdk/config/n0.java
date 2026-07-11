package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n0 {
    public static void a(Context context, w wVar) {
        boolean zIsLimitAdTrackingEnabled;
        AdvertisingIdClient.Info advertisingIdInfo;
        String id = null;
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Throwable th) {
            th = th;
            zIsLimitAdTrackingEnabled = false;
        }
        try {
            IAlog.e("limit ad tracking: %s", Boolean.valueOf(zIsLimitAdTrackingEnabled));
            if (zIsLimitAdTrackingEnabled) {
                IAlog.e("user has opt out of Ads Personalization. not accessing Advertising ID.", new Object[0]);
            } else {
                id = advertisingIdInfo.getId();
                IAlog.e("advertising id: %s", id);
            }
        } catch (Throwable th2) {
            th = th2;
            IAlog.e("Handled Exception:", new Object[0]);
            IAlog.e(com.fyber.inneractive.sdk.util.v.b(th), new Object[0]);
            IAlog.c("Advertising ID is not available. Please add Google Play Services library to improve your ad targeting.", new Object[0]);
        }
        synchronized (wVar) {
            v vVar = wVar.f53490b;
            vVar.f53486a = id;
            vVar.f53487b = zIsLimitAdTrackingEnabled;
            vVar.f53488c = false;
        }
    }
}
