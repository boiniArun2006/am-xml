package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CreativeInfoManagerInitializer {
    public static void init(TreeMap<String, AdNetworkDiscovery> treeMap) {
        treeMap.put(com.safedk.android.utils.h.f63176p, new FyberDiscovery());
        treeMap.put(com.safedk.android.utils.h.f63168h, new com.safedk.android.analytics.brandsafety.creatives.discoveries.a());
        treeMap.put(com.safedk.android.utils.h.f63161a, new com.safedk.android.analytics.brandsafety.creatives.discoveries.c());
        treeMap.put(com.safedk.android.utils.h.f63164d, new t());
    }
}
