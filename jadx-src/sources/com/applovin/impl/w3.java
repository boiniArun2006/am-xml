package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bendingspoons.legal.privacy.Tracker;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.utils.SdksMapping;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TreeMap f50691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f50692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f50693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f50694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f50695e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f50696f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f50697g = Collections.synchronizedMap(new HashMap(1));

    public static List a(C1802k c1802k) {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList(c1802k.c(r3.m7));
        if (!((Boolean) c1802k.a(r3.f49872n7)).booleanValue()) {
            return arrayList;
        }
        synchronized (f50696f) {
            hashSet = new HashSet(f50695e.keySet());
        }
        arrayList.retainAll(hashSet);
        return arrayList;
    }

    public static JSONArray b(C1802k c1802k) {
        synchronized (f50696f) {
            try {
                if (f50694d != null) {
                    d(c1802k);
                    return f50694d;
                }
                f50694d = new JSONArray();
                for (String str : f50693c) {
                    MaxAdapter maxAdapterA = a(str, c1802k);
                    if (maxAdapterA != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, f50691a.get(str));
                            jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
                            jSONObject.put("sdk_version", a(maxAdapterA));
                            jSONObject.put(NodeModuleProcess.PROPERTY_VERSION, maxAdapterA.getAdapterVersion());
                            jSONObject.put("is_supported", a(maxAdapterA, str));
                        } catch (Throwable unused) {
                        }
                        f50694d.put(jSONObject);
                        f50695e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
                    }
                }
                return f50694d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(JSONObject jSONObject, String str, C1802k c1802k) {
        synchronized (f50696f) {
            try {
                if (StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", ""))) {
                    return;
                }
                MaxAdapter maxAdapterA = a(str, c1802k);
                if (maxAdapterA == null) {
                    return;
                }
                String strA = a(maxAdapterA);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                JsonUtils.putString(jSONObject, "sdk_version", strA);
                f50695e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        f50691a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Tracker.AppLovin.NAME);
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", Tracker.Pangle.NAME);
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", Tracker.InMobi.NAME);
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", Tracker.Fyber.NAME);
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", Tracker.Mintegral.NAME);
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", Tracker.MobileFuse.NAME);
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", Tracker.Pangle.NAME);
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", Tracker.Smaato.NAME);
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", Tracker.Verve.NAME);
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put(gUxOLwRQBPPLC.PhiMzQjBvJgXYtb, "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        f50693c = new ArrayList(treeMap.keySet());
        HashMap map = new HashMap();
        f50692b = map;
        map.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        map.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.5.0.8.1");
        map.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        map.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        map.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        map.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        map.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.6.1");
        map.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        map.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        map.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        map.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        map.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        map.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        map.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "3.9.0.2");
        map.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        map.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        map.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        map.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        map.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    private static void d(C1802k c1802k) {
        synchronized (f50696f) {
            for (int i2 = 0; i2 < f50694d.length(); i2++) {
                try {
                    JSONObject jSONObject = JsonUtils.getJSONObject(f50694d, i2, (JSONObject) null);
                    String string = JsonUtils.getString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, "");
                    b(jSONObject, string, c1802k);
                    c(jSONObject, string, c1802k);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void e(C1802k c1802k) {
        JSONArray jSONArrayB = b(c1802k);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayB.length(); i2++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayB, i2, (JSONObject) null);
            if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                arrayList.add(JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "unknown") + " (" + JsonUtils.getString(jSONObject, NodeModuleProcess.PROPERTY_VERSION, "unknown") + ")");
            }
        }
        if (!arrayList.isEmpty()) {
            String strJoin = StringUtils.join(", ", arrayList);
            String str = "Please update to the latest adapter versions. Incompatible adapter(s) found: " + strJoin;
            if (!n7.c(c1802k)) {
                C1804o.h("MediationUtils", str);
                HashMap map = new HashMap();
                CollectionUtils.putStringIfValid("details", strJoin, map);
                c1802k.D().d(d2.S0, map);
                return;
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static String a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            C1804o.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    public static MaxMediatedNetworkInfo a(String str) {
        MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f50696f) {
            maxMediatedNetworkInfo = (MaxMediatedNetworkInfo) f50695e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
        return new MaxMediatedNetworkInfoImpl(jSONObject);
    }

    public static Map c(C1802k c1802k) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(c1802k.w0().e());
        if (!((Boolean) c1802k.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", "");
        map.put("{CUSTOM_DATA}", "");
        map.put("{CREATIVE_ID}", "");
        return map;
    }

    public static boolean a(MaxAdapter maxAdapter, String str) {
        String str2 = (String) f50692b.get(str);
        return TextUtils.isEmpty(str2) || n7.a(maxAdapter.getAdapterVersion(), str2) >= 0;
    }

    private static void b(JSONObject jSONObject, String str, C1802k c1802k) {
        synchronized (f50696f) {
            try {
                Integer numA = c1802k.S().a(str);
                if (numA == null) {
                    return;
                }
                JsonUtils.putInt(jSONObject, "initialization_status", numA.intValue());
                f50695e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static MaxAdapter a(String str, C1802k c1802k) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(c1802k.y0());
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    public static AppLovinSdkUtils.Size b(int i2, MaxAdFormat maxAdFormat, Context context) {
        try {
            int i3 = AdSize.FULL_WIDTH;
            Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
            Method method2 = AdSize.class.getMethod("getWidth", null);
            Method method3 = AdSize.class.getMethod("getHeight", null);
            Object objInvoke = method.invoke(null, context, Integer.valueOf(i2));
            AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, null)).intValue(), ((Integer) method3.invoke(objInvoke, null)).intValue());
            f50697g.put(Integer.valueOf(i2), size);
            return size;
        } catch (Throwable unused) {
            return maxAdFormat.getSize();
        }
    }

    public static boolean a(Object obj) {
        return (obj instanceof com.applovin.impl.sdk.ad.b) && StringUtils.isValidString(((com.applovin.impl.sdk.ad.b) obj).getMediationServeId());
    }

    public static AppLovinSdkUtils.Size a(int i2, MaxAdFormat maxAdFormat, Context context) {
        if (i2 < 0) {
            i2 = AppLovinSdkUtils.pxToDp(context, o0.a(context).x);
        }
        Map map = f50697g;
        if (map.containsKey(Integer.valueOf(i2))) {
            return (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i2));
        }
        if (Boolean.TRUE.equals((Boolean) a5.a(z4.f50989J, Boolean.FALSE, context))) {
            return a(i2, context);
        }
        return b(i2, maxAdFormat, context);
    }

    public static AppLovinSdkUtils.Size a(int i2, Context context) {
        int iRound;
        if (i2 >= 600) {
            iRound = Math.round(i2 / 8.088889f);
        } else if (i2 > 450) {
            iRound = Math.round(i2 / 7.8f);
        } else {
            iRound = Math.round(i2 / 6.4f);
        }
        AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(i2, Math.max(50, Math.min(iRound, Math.min(90, Math.round(AppLovinSdkUtils.pxToDp(context, o0.b(context).y) * 0.15f)))));
        f50697g.put(Integer.valueOf(i2), size);
        return size;
    }

    public static boolean a(JSONObject jSONObject, String str, C1802k c1802k) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), 1035, "code")) {
            return false;
        }
        c1802k.D().a(d2.S0, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str), "invalid_or_disabled_ad_unit_id" + str);
        return true;
    }

    public static Map a(y2 y2Var, C1802k c1802k) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(c1802k.w0().e());
        if (!((Boolean) c1802k.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", StringUtils.emptyIfNull(y2Var.getPlacement()));
        map.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(y2Var.e()));
        map.put("{CREATIVE_ID}", StringUtils.emptyIfNull(y2Var.getCreativeId()));
        return map;
    }
}
