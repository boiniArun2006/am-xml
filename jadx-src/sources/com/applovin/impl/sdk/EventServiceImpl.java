package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.database.Kr.FlTC;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1797r6;
import com.applovin.impl.d6;
import com.applovin.impl.i1;
import com.applovin.impl.n7;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", SafeDKWebAppInterface.f62918d, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f50006b = new AtomicBoolean();

    private void a(final String str, final Map map) {
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f50005a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50005a, zContains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                this.f50003n.a(str, map, zContains);
            }
        }), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f50005a.a(x4.k5)).booleanValue()).a(AbstractC1810u4.a.a(((Integer) this.f50005a.a(x4.v5)).intValue())).d(false);
        if (this.f50005a.s0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.f50005a.f0().e(bVarD.a());
    }

    private void c(final String str, final Map map, final Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        this.f50005a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50005a, false, "track_event:" + str, new Runnable() { // from class: com.applovin.impl.sdk.aC
            @Override // java.lang.Runnable
            public final void run() {
                this.f50062n.b(str, map, map2);
            }
        }), d6.b.OTHER);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    private String d() {
        return ((String) this.f50005a.a(x4.p0)) + "4.0/pix";
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f50006b.compareAndSet(false, true)) {
            this.f50005a.F().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f50005a.O();
        if (C1804o.a()) {
            this.f50005a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        s1 s1Var = new s1(str, new HashMap());
        boolean zContains = this.f50005a.c(x4.z0).contains(s1Var.c());
        Map mapA = a(s1Var, true, zContains);
        HashMap map = new HashMap(s1Var.d());
        if (((Boolean) this.f50005a.a(x4.E5)).booleanValue() || ((Boolean) this.f50005a.a(x4.z5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f50005a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(s1Var, zContains)).c(((Boolean) this.f50005a.a(x4.O5)).booleanValue()).a(((Boolean) this.f50005a.a(x4.k5)).booleanValue()).a());
    }

    public EventServiceImpl(C1802k c1802k) {
        this.f50005a = c1802k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z2) {
        s1 s1Var = new s1(str, map);
        boolean zContains = this.f50005a.c(x4.z0).contains(s1Var.c());
        Map mapA = a(s1Var, false, zContains);
        HashMap map2 = new HashMap(s1Var.d());
        if (((Boolean) this.f50005a.a(x4.E5)).booleanValue() || ((Boolean) this.f50005a.a(x4.z5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f50005a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(s1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f50005a.a(x4.O5)).booleanValue()).a(((Boolean) this.f50005a.a(x4.k5)).booleanValue()).d(z2).a(AbstractC1810u4.a.a(((Integer) this.f50005a.a(x4.u5)).intValue())).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f50005a.c(x4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            C1804o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f50005a.D().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private String c() {
        return ((String) this.f50005a.a(x4.q0)) + "4.0/pix";
    }

    private String b() {
        return ((String) this.f50005a.a(x4.f50838r0)) + FlTC.GXVYAj;
    }

    private void a(String str) {
        C1804o.h("AppLovinEventService", str);
        if (n7.c(this.f50005a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(s1 s1Var, boolean z2, boolean z3) {
        Map mapA = this.f50005a.A().a((Map) null, z2, false);
        mapA.put("event_id", s1Var.b());
        mapA.put(com.safedk.android.analytics.events.a.f62812b, Long.toString(s1Var.a()));
        if (z3) {
            mapA.put(com.safedk.android.analytics.events.a.f62811a, s1Var.c());
        } else {
            mapA.put(com.safedk.android.analytics.events.a.f62811a, "postinstall");
            mapA.put("sub_event", s1Var.c());
        }
        return n7.a(mapA);
    }

    private Map a(s1 s1Var, boolean z2) {
        HashMap map = new HashMap();
        if (z2) {
            map.put("AppLovin-Event", s1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", s1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        s1 s1Var = new s1(str, map);
        map3.put("id", s1Var.b());
        map3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, s1Var.c());
        map3.put("data", s1Var.d());
        map3.put(StatsEvent.f62824A, i1.a(s1Var.a()));
        Map mapG = this.f50005a.A().G();
        map3.put("app_info", mapG);
        map3.put("device_info", this.f50005a.A().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f50005a.q());
        CollectionUtils.putStringIfValid("eventId", this.f50005a.E(), map4);
        map4.put(NodeModuleProcess.PROPERTY_VERSION, AppLovinSdk.VERSION);
        map4.put("sdk_key", this.f50005a.i0());
        map4.put(AppLovinBridge.f61288f, this.f50005a.A().A());
        if (((Boolean) this.f50005a.a(x4.J3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f50005a.r(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapG.get("ia_v2"));
        map5.put("lastVisitTs", mapG.get("last_launch_ms"));
        map5.put("visitCount", mapG.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapG.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private String a() {
        return ((String) this.f50005a.a(x4.s0)) + "v1/app";
    }
}
