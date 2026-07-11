package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.internal.QJ;
import com.facebook.internal.aC;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class UGc {
    private static JSONArray KN;
    private static boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final UGc f52770n = new UGc();
    private static final String rl = UGc.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f52771t = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')'});
    private static final Map nr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final AtomicReference f52769O = new AtomicReference(j.NOT_LOADED);
    private static final ConcurrentLinkedQueue J2 = new ConcurrentLinkedQueue();

    public enum j {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    public interface n {
        void n();

        void rl(QJ qj);
    }

    private final Map ck(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e2) {
                vd.z("FacebookSDK", e2);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e3) {
                vd.z("FacebookSDK", e3);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private final synchronized void r() {
        j jVar = (j) f52769O.get();
        if (j.NOT_LOADED != jVar && j.LOADING != jVar) {
            final QJ qj = (QJ) nr.get(com.facebook.s4.az());
            Handler handler = new Handler(Looper.getMainLooper());
            if (j.ERROR == jVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = J2;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final n nVar = (n) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            UGc.o(nVar);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = J2;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final n nVar2 = (n) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.s4
                        @Override // java.lang.Runnable
                        public final void run() {
                            UGc.Z(nVar2, qj);
                        }
                    });
                }
            }
        }
    }

    private final Long ty(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return Long.valueOf(jSONObject.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final Map HI(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                QJ.n.j jVar = QJ.n.f52764O;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                QJ.n nVarN = jVar.n(jSONObjectOptJSONObject);
                if (nVarN != null) {
                    String strN = nVarN.n();
                    Map map2 = (Map) map.get(strN);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strN, map2);
                    }
                    map2.put(nVarN.rl(), nVarN);
                }
            }
        }
        return map;
    }

    private final JSONArray Ik(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final QJ J2(String str) {
        if (str != null) {
            return (QJ) nr.get(str);
        }
        return null;
    }

    private final JSONObject O(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f52771t);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest graphRequestAYN = GraphRequest.ty.aYN(null, PangleCreativeInfo.f62498a, null);
        graphRequestAYN.E2(true);
        graphRequestAYN.T(bundle);
        JSONObject jSONObjectNr = graphRequestAYN.gh().nr();
        return jSONObjectNr == null ? new JSONObject() : jSONObjectNr;
    }

    public static final QJ XQ(String applicationId, boolean z2) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z2) {
            Map map = nr;
            if (map.containsKey(applicationId)) {
                return (QJ) map.get(applicationId);
            }
        }
        UGc uGc = f52770n;
        QJ qjMUb = uGc.mUb(applicationId, uGc.O(applicationId));
        if (Intrinsics.areEqual(applicationId, com.facebook.s4.az())) {
            f52769O.set(j.SUCCESS);
            uGc.r();
        }
        return qjMUb;
    }

    static /* synthetic */ ArrayList az(UGc uGc, JSONObject jSONObject, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return uGc.qie(jSONObject, z2);
    }

    private final List gh(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (Intrinsics.areEqual(jSONObject2.getString("key"), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    if (Intrinsics.areEqual(jSONObject3.getString("key"), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i5 = 0; i5 < length3; i5++) {
                            arrayList.add(jSONArray3.getJSONObject(i5).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    public static final void nr(n callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        J2.add(callback);
        KN();
    }

    private final ArrayList qie(JSONObject jSONObject, boolean z2) {
        JSONArray jSONArray;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return arrayList2;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList3 = null;
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String string = jSONObject2.getString("key");
            if ((!Intrinsics.areEqual(string, "prod_keys") || !z2) && (!Intrinsics.areEqual(string, "test_keys") || z2)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                int i3 = 0;
                while (i3 < length2) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    String string2 = jSONObject3.getString("key");
                    if (Intrinsics.areEqual(string2, "_valueToSum") || Intrinsics.areEqual(string2, "fb_currency")) {
                        arrayList = arrayList2;
                    } else {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = jSONArray3.length();
                        int i5 = 0;
                        while (i5 < length3) {
                            ArrayList arrayList5 = arrayList2;
                            try {
                                arrayList4.add(jSONArray3.getJSONObject(i5).getString("value"));
                                i5++;
                                arrayList2 = arrayList5;
                            } catch (Exception unused2) {
                                return arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(new Pair(string2, arrayList4));
                    }
                    i3++;
                    arrayList2 = arrayList;
                }
            }
            i2++;
            arrayList2 = arrayList2;
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        QJ qjMUb = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!vd.I(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e2) {
                vd.z("FacebookSDK", e2);
                jSONObject = null;
            }
            if (jSONObject != null) {
                qjMUb = f52770n.mUb(applicationId, jSONObject);
            }
        }
        UGc uGc = f52770n;
        JSONObject jSONObjectO = uGc.O(applicationId);
        if (jSONObjectO != null) {
            uGc.mUb(applicationId, jSONObjectO);
            sharedPreferences.edit().putString(settingsKey, jSONObjectO.toString()).apply();
        }
        if (qjMUb != null) {
            String strR = qjMUb.r();
            if (!Uo && strR != null && strR.length() > 0) {
                Uo = true;
                Log.w(rl, strR);
            }
        }
        C1869z.az(applicationId, true);
        UiE.C.KN();
        f52769O.set(nr.containsKey(applicationId) ? j.SUCCESS : j.ERROR);
        uGc.r();
    }

    public final QJ mUb(String applicationId, JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        aC.j jVar = aC.Uo;
        aC aCVarN = jVar.n(jSONArrayOptJSONArray);
        if (aCVarN == null) {
            aCVarN = jVar.rl();
        }
        aC aCVar = aCVarN;
        int iOptInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z2 = (iOptInt & 8) != 0;
        boolean z3 = (iOptInt & 16) != 0;
        boolean z4 = (iOptInt & 32) != 0;
        boolean z5 = (iOptInt & 256) != 0;
        boolean z6 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        KN = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && ci.rl()) {
            Zfb.I28.t(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = settingsJSON.optJSONObject("app_events_config");
        boolean zOptBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = settingsJSON.optInt("app_events_session_timeout", UiE.o.n());
        EnumSet enumSetN = Ln.f52681t.n(settingsJSON.optLong("seamless_login"));
        Map mapHI = HI(settingsJSON.optJSONObject("android_dialog_configs"));
        String strOptString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        QJ qj = new QJ(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetN, mapHI, z2, aCVar, strOptString2, strOptString3, z3, z4, jSONArrayOptJSONArray2, strOptString4, z5, z6, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), ck(settingsJSON), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_schema"), Ik(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_blocked"), gh(jSONObjectOptJSONObject, "fb_currency"), gh(jSONObjectOptJSONObject, "_valueToSum"), az(this, jSONObjectOptJSONObject, false, 2, null), qie(jSONObjectOptJSONObject, true), ty(settingsJSON.optJSONObject("app_events_config")));
        nr.put(applicationId, qj);
        return qj;
    }

    private UGc() {
    }

    public static final void KN() {
        final Context contextQie = com.facebook.s4.qie();
        final String strAz = com.facebook.s4.az();
        if (vd.I(strAz)) {
            f52769O.set(j.ERROR);
            f52770n.r();
            return;
        }
        if (nr.containsKey(strAz)) {
            f52769O.set(j.SUCCESS);
            f52770n.r();
            return;
        }
        AtomicReference atomicReference = f52769O;
        j jVar = j.NOT_LOADED;
        j jVar2 = j.LOADING;
        if (!androidx.compose.animation.core.fuX.n(atomicReference, jVar, jVar2) && !androidx.compose.animation.core.fuX.n(atomicReference, j.ERROR, jVar2)) {
            f52770n.r();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strAz}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        com.facebook.s4.Z().execute(new Runnable() { // from class: com.facebook.internal.l3D
            @Override // java.lang.Runnable
            public final void run() {
                UGc.xMQ(contextQie, str, strAz);
            }
        });
    }

    public static final Map Uo() {
        JSONObject jSONObject;
        Context contextQie = com.facebook.s4.qie();
        String strAz = com.facebook.s4.az();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strAz}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        String string = contextQie.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
        if (!vd.I(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    vd.z("FacebookSDK", e2);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return f52770n.ck(jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(n nVar, QJ qj) {
        nVar.rl(qj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(n nVar) {
        nVar.n();
    }
}
