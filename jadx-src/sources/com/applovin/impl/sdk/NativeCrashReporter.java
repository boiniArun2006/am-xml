package com.applovin.impl.sdk;

import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.mediation.AppLovinUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class NativeCrashReporter implements g.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f50012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f50013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final NativeCrashReporter f50014d = new NativeCrashReporter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f50015a = new HashMap();

    public static void a(C1802k c1802k) {
        if (c1802k == null) {
            return;
        }
        if (!((Boolean) c1802k.a(x4.q4)).booleanValue() && !n7.k(C1802k.o())) {
            if (f50013c) {
                try {
                    g gVarL = c1802k.l();
                    NativeCrashReporter nativeCrashReporter = f50014d;
                    gVarL.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    c1802k.O();
                    if (C1804o.a()) {
                        c1802k.O().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    c1802k.D().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = c1802k.c(x4.f50840r4);
            int[] iArr = new int[listC.size()];
            for (int i2 = 0; i2 < listC.size(); i2++) {
                try {
                    iArr[i2] = Integer.parseInt((String) listC.get(i2));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(C1802k.o().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, c1802k);
            } else if (!file.mkdir()) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f50014d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) c1802k.a(x4.s4)).booleanValue());
                if (((Boolean) c1802k.a(x4.t4)).booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(g.c.LOADING);
                    hashSet.add(g.c.LOAD);
                    hashSet.add(g.c.SHOW);
                    hashSet.add(g.c.CLICK);
                    hashSet.add(g.c.SHOW_ERROR);
                    hashSet.add(g.c.DESTROY);
                    c1802k.l().a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th2) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                c1802k.D().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z2);

    private native void updateAdInfo(String str);

    private NativeCrashReporter() {
    }

    private static boolean a() {
        if (!f50012b) {
            f50012b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f50013c = true;
            } catch (Throwable th) {
                C1804o.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f50013c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(File file, C1802k c1802k) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String strF = c1802k.G().f(file2);
            if (StringUtils.isValidString(strF)) {
                String[] strArrSplit = strF.split("@@@@@");
                if (strArrSplit.length == 3) {
                    try {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        JSONArray jSONArray = new JSONArray(strArrSplit[2]);
                        if (jSONArray.length() == 0) {
                            c1802k.D().a(d2.V0, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
                                    mapHashMap.put("source", str2);
                                    mapHashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(mapHashMap);
                                }
                            }
                            c1802k.D().a(d2.V0, arrayList, 0L);
                        }
                    } catch (Throwable th) {
                        c1802k.O();
                        if (C1804o.a()) {
                            c1802k.O().a("NativeCrashReporter", "Failed to symbolicate native crash report", th);
                        }
                    }
                } else {
                    c1802k.O();
                    if (C1804o.a()) {
                        c1802k.O().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                    }
                }
            }
            try {
                if (!file2.delete()) {
                    c1802k.O();
                    if (C1804o.a()) {
                        c1802k.O().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                    }
                }
            } catch (Throwable th2) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath(), th2);
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(g.b bVar) {
        String strH = bVar.h();
        if (bVar.i() == g.c.DESTROY) {
            this.f50015a.remove(strH);
        } else if (this.f50015a.containsKey(strH)) {
            JsonUtils.putString((JSONObject) this.f50015a.get(strH), "operation", bVar.i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, bVar.a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.g());
            JsonUtils.putString(jSONObject, BrandSafetyEvent.ad, bVar.c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
            JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
            JsonUtils.putString(jSONObject, "bcode", bVar.e());
            JsonUtils.putString(jSONObject, "creative_id", bVar.f());
            JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
            this.f50015a.put(strH, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.f50015a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}
