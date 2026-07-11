package CKP;

import CKP.s4;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final QJ f850n = new QJ();

    public static final void KN() {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            try {
                com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final boolean O() {
        if (VmF.j.nr(QJ.class)) {
            return false;
        }
        try {
            return !com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return false;
        }
    }

    public static final void Uo() {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j2 = Long.parseLong((String) StringsKt.split$default((CharSequence) it.next(), new String[]{";"}, false, 2, 2, (Object) null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j2).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            t();
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final void nr(Map purchaseDetailsMap, Map skuDetailsMap, boolean z2, String packageName, s4.j billingClientVersion, boolean z3) {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
            QJ qj = f850n;
            qj.J2(qj.rl(qj.n(purchaseDetailsMap, z2), skuDetailsMap, packageName), z2, billingClientVersion, z3);
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final void t() {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final void xMQ() {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            KN();
            try {
                SharedPreferences sharedPreferences = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public final Map n(Map purchaseDetailsMap, boolean z2) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j2 = z2 ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : MapsKt.toMap(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j3 = jSONObject.getLong("purchaseTime");
                        if (j3 <= j2) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j3);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j2) {
                if (z2) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final Map rl(Map purchaseDetailsMap, Map skuDetailsMap, String packageName) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                try {
                    jSONObject.put("packageName", packageName);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "purchaseDetail.toString()");
                        String string2 = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private QJ() {
    }

    private final void J2(Map map, boolean z2, s4.j jVar, boolean z3) {
        if (!VmF.j.nr(this)) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    UiE.C.mUb((String) entry.getKey(), (String) entry.getValue(), z2, jVar, z3);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
