package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.GraphRequest;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C1869z {
    private static Long J2;
    private static vxB.n Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1869z f52825n = new C1869z();
    private static final String rl = Reflection.getOrCreateKotlinClass(C1869z.class).getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f52826t = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue nr = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Map f52824O = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.facebook.internal.z$j */
    public interface j {
        void onCompleted();
    }

    private final boolean J2(Long l2) {
        return l2 != null && System.currentTimeMillis() - l2.longValue() < 3600000;
    }

    public final void Uo() {
        KN(null);
    }

    public static final synchronized void KN(j jVar) {
        if (jVar != null) {
            try {
                nr.add(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        final String strAz = com.facebook.s4.az();
        C1869z c1869z = f52825n;
        if (c1869z.J2(J2) && f52824O.containsKey(strAz)) {
            c1869z.gh();
            return;
        }
        final Context contextQie = com.facebook.s4.qie();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strAz}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        if (contextQie == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextQie.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!vd.I(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e2) {
                vd.z("FacebookSDK", e2);
            }
            if (jSONObject != null) {
                mUb(strAz, jSONObject);
            }
        }
        Executor executorZ = com.facebook.s4.Z();
        if (executorZ == null) {
            return;
        }
        if (f52826t.compareAndSet(false, true)) {
            executorZ.execute(new Runnable() { // from class: com.facebook.internal.Xo
                @Override // java.lang.Runnable
                public final void run() {
                    C1869z.xMQ(strAz, contextQie, str);
                }
            });
        }
    }

    public static final JSONObject az(String applicationId, boolean z2) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z2) {
            Map map = f52824O;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = (JSONObject) map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectT = f52825n.t(applicationId);
        Context contextQie = com.facebook.s4.qie();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        contextQie.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectT.toString()).apply();
        return mUb(applicationId, jSONObjectT);
    }

    private final void gh() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = nr;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final j jVar = (j) concurrentLinkedQueue.poll();
            if (jVar != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.eO
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1869z.qie(jVar);
                    }
                });
            }
        }
    }

    public static final synchronized JSONObject mUb(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            jSONObject2 = (JSONObject) f52824O.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject = (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException e2) {
                    vd.z("FacebookSDK", e2);
                }
            }
            f52824O.put(applicationId, jSONObject2);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject2;
    }

    public static final boolean nr(String name, String str, boolean z2) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map mapO = f52825n.O(str);
        return (mapO.containsKey(name) && (bool = (Boolean) mapO.get(name)) != null) ? bool.booleanValue() : z2;
    }

    private final JSONObject t(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
        bundle.putString("sdk_version", com.facebook.s4.te());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.w6 w6Var = GraphRequest.ty;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        GraphRequest graphRequestAYN = w6Var.aYN(null, str2, null);
        graphRequestAYN.T(bundle);
        JSONObject jSONObjectNr = graphRequestAYN.gh().nr();
        return jSONObjectNr == null ? new JSONObject() : jSONObjectNr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        C1869z c1869z = f52825n;
        JSONObject jSONObjectT = c1869z.t(applicationId);
        if (jSONObjectT.length() != 0) {
            mUb(applicationId, jSONObjectT);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, jSONObjectT.toString()).apply();
            J2 = Long.valueOf(System.currentTimeMillis());
        }
        c1869z.gh();
        f52826t.set(false);
    }

    private C1869z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(j jVar) {
        jVar.onCompleted();
    }

    public final Map O(String str) {
        List<vxB.j> listN;
        Uo();
        if (str != null) {
            Map map = f52824O;
            if (map.containsKey(str)) {
                vxB.n nVar = Uo;
                if (nVar != null) {
                    listN = nVar.n(str);
                } else {
                    listN = null;
                }
                if (listN != null) {
                    HashMap map2 = new HashMap();
                    for (vxB.j jVar : listN) {
                        map2.put(jVar.n(), Boolean.valueOf(jVar.rl()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map3.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                vxB.n nVar2 = Uo;
                if (nVar2 == null) {
                    nVar2 = new vxB.n();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new vxB.j((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                nVar2.rl(str, arrayList);
                Uo = nVar2;
                return map3;
            }
        }
        return new HashMap();
    }
}
