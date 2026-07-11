package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l3 extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f48865e = {com.safedk.android.analytics.brandsafety.l.f62638S, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f48866f = {com.safedk.android.analytics.brandsafety.l.f62638S, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(C1802k c1802k) {
        return r0.a((String) c1802k.a(r3.q7), "1.0/mediate", c1802k);
    }

    public static String b(C1802k c1802k) {
        return r0.a((String) c1802k.a(r3.f49873p7), "1.0/mediate", c1802k);
    }

    public static void d(JSONObject jSONObject, C1802k c1802k) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            p5.a(jSONObject, c1802k);
        }
    }

    public static void f(JSONObject jSONObject, C1802k c1802k) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f48865e);
            c1802k.b(z4.f50985F, jSONObjectShallowCopy.toString());
            p5.a(jSONObjectShallowCopy);
        }
    }

    public static void g(JSONObject jSONObject, C1802k c1802k) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i2), AppMeasurementSdk.ConditionalUserProperty.NAME, null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                C1804o.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                C1804o.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                c1802k.D().a(d2.a1, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                l1.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e2) {
                C1804o.c("MediationConnectionUtils", "Failed to parse JSON", e2);
                c1802k.D().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e2);
                l1.a((Throwable) e2, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    public static String h(C1802k c1802k) {
        x4 x4Var = r3.C8;
        return r0.a((String) c1802k.a(((Boolean) c1802k.a(x4Var)).booleanValue() ? r3.B8 : r3.q7), ((Boolean) c1802k.a(x4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", c1802k);
    }

    public static String i(C1802k c1802k) {
        x4 x4Var = r3.C8;
        return r0.a((String) c1802k.a(((Boolean) c1802k.a(x4Var)).booleanValue() ? r3.A8 : r3.f49873p7), ((Boolean) c1802k.a(x4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", c1802k);
    }

    public static void e(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            c1802k.c(z4.f50986G);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f48866f);
        c1802k.b(z4.f50986G, jSONObjectShallowCopy.toString());
    }
}
