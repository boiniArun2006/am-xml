package com.safedk.android.utils;

import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.ads.MobileAds;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class SdksMappingInitializer {
    private static final String TAG = "SdksMappingInitializer";

    public static void init(TreeMap<String, String> treeMap, TreeMap<String, String> treeMap2, TreeMap<String, String> treeMap3, TreeMap<String, String> treeMap4, TreeMap<String, String> treeMap5) {
        treeMap.put(h.f63164d, "LiftoffMonetize");
        treeMap2.put(h.f63164d, "217e8f437c9fc4244d6e74653ac8a8c7");
        treeMap4.put(h.f63164d, h.f63164d);
        treeMap5.put("com.applovin.mediation.adapters.VungleMediationAdapter", "217e8f437c9fc4244d6e74653ac8a8c7");
        treeMap.put(h.f63176p, "DTExchange");
        treeMap4.put("com.fyber.inneractive", h.f63176p);
        treeMap2.put(h.f63176p, "d41ed920405e4bd14f3a42cd93c43d89");
        treeMap4.put(h.f63176p, h.f63176p);
        treeMap5.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "d41ed920405e4bd14f3a42cd93c43d89");
        treeMap.put(h.f63168h, "AdMob");
        treeMap4.put("com.google.android.gms.internal", h.f63168h);
        treeMap4.put(MobileAds.ERROR_DOMAIN, h.f63168h);
        treeMap2.put(h.f63168h, "29015bbfcc182d80e7f75bd2c38e4521");
        treeMap4.put(h.f63168h, h.f63168h);
        treeMap5.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "29015bbfcc182d80e7f75bd2c38e4521");
        treeMap.put(h.f63161a, Tracker.AppLovin.NAME);
        treeMap2.put(h.f63161a, "74616804a7dc29147dfb0afe122a9fd2");
        treeMap4.put(h.f63161a, h.f63161a);
        treeMap5.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "74616804a7dc29147dfb0afe122a9fd2");
    }
}
