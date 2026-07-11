package com.safedk.android.utils;

import ScC.FuwU.XIvb;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63130a = "ConfigurationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f63131b = new HashSet(Arrays.asList("CONTENTCAT", "PLAYBACKMETHODS", "STOREID", "STOREURL", "CACHEBUSTING", "TIMESTAMP", "ADCATEGORIES", "ADCOUNT", "ADTYPE", "BLOCKEDADCATEGORIES", "BREAKMAXADLENGTH", "BREAKMAXADS", "BREAKMAXDURATION", "BREAKMINADLENGTH", "BREAKPOSITION", "CONTENTPLAYHEAD", "MEDIAPLAYHEAD", "PLACEMENTTYPE", "TRANSACTIONID", "UNIVERSALADID", "CLIENTUA", "DEVICEIP", "DEVICEUA", "IFA", "IFATYPE", "LATLONG", "SERVERSIDE", "SERVERUA", "APPBUNDLE", "DOMAIN", "PAGEURL", "APIFRAMEWORKS", "CLICKTYPE", "EXTENSIONS", "MEDIAMIME", "OMIDPARTNER", "PLAYERCAPABILITIES", "VASTVERSIONS", "VERIFICATIONVENDORS", XIvb.mMOBYoRNI, "ADSERVINGID", "ASvastMacroQueryParams.RI", "CONTENTID", "CONTENTURI", "INVENTORYSTATE", "PLAYERSIZE", "PLAYERSTATE", "PODSEQUENCE", "CLICKPOS", "ERRORCODE", "REASON", "GDPRCONSENT", "LIMITADTRACKING", "REGULATIONS"));

    public static boolean a(String str) {
        boolean z2;
        com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(str);
        if (bVarK == null) {
            Logger.d(f63130a, "cannot determine config item SUPPORTS_BANNER_IMPRESSION_TRACKING for sdk ", str);
        }
        if (bVarK != null && bVarK.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING)) {
            z2 = true;
        } else {
            z2 = false;
        }
        Logger.d(f63130a, "isBannerMonitoringSupported returned ", Boolean.valueOf(z2), " for sdk ", str);
        return z2;
    }
}
