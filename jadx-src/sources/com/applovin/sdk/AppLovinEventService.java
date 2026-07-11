package com.applovin.sdk;

import android.content.Intent;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface AppLovinEventService {
    void trackCheckout(String str, Map<String, String> map);

    void trackEvent(String str);

    void trackEvent(String str, Map<String, ?> map);

    void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2);

    void trackInAppPurchase(Intent intent, Map<String, String> map);
}
