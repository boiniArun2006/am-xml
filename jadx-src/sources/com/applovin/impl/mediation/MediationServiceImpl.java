package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.view.Lifecycle;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.EnumC1781i;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.b6;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.d2;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.h3;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n6;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b5 f49040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f49041d = new AtomicReference();

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0704a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y2 f49043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.InterfaceC0704a f49044b;

        public void a(a.InterfaceC0704a interfaceC0704a) {
            this.f49044b = interfaceC0704a;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public b(y2 y2Var, a.InterfaceC0704a interfaceC0704a) {
            this.f49043a = y2Var;
            this.f49044b = interfaceC0704a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f49038a.H().b(maxAd);
            }
            t2.e(this.f49044b, maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f49043a.a(bundle);
            t2.b(this.f49044b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f49043a.a(bundle);
            this.f49043a.b0();
            C1804o unused = MediationServiceImpl.this.f49039b;
            if (C1804o.a()) {
                MediationServiceImpl.this.f49039b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f49043a, this.f49044b);
            if (!((Boolean) MediationServiceImpl.this.f49038a.a(r3.w8)).booleanValue() || this.f49043a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f49038a.l().a(this.f49043a, g.c.SHOW);
                MediationServiceImpl.this.f49038a.t().b(this.f49043a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f49038a.H().a(this.f49043a);
                }
                t2.c(this.f49044b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f49043a.a(bundle);
            t2.d(this.f49044b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) {
            this.f49043a.a(bundle);
            this.f49043a.c0();
            MediationServiceImpl.this.f49038a.l().a(this.f49043a, g.c.HIDE);
            MediationServiceImpl.this.a(this.f49043a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.Dsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48980n.a(maxAd);
                }
            }, maxAd instanceof c3 ? ((c3) maxAd).l0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f49043a.a(bundle);
            this.f49043a.e0();
            MediationServiceImpl.this.f49038a.l().a(this.f49043a, g.c.LOAD);
            MediationServiceImpl.this.b(this.f49043a);
            t2.f(this.f49044b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f49043a.e0();
            MediationServiceImpl.this.b(this.f49043a, maxError, this.f49044b);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f49043a.a(bundle);
            MediationServiceImpl.this.f49038a.l().a(this.f49043a, g.c.CLICK);
            MediationServiceImpl.this.a(this.f49043a, this.f49044b);
            t2.a((MaxAdListener) this.f49044b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f49043a.a(bundle);
            this.f49043a.a0();
            MediationServiceImpl.this.a(this.f49043a, maxError, this.f49044b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof c3)) {
                ((c3) maxAd).j0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f49043a.a(bundle);
            t2.a(this.f49044b, maxAd, maxReward);
            MediationServiceImpl.this.f49038a.q0().a((AbstractRunnableC1782i5) new n6((c3) maxAd, MediationServiceImpl.this.f49038a), d6.b.OTHER);
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, y2 y2Var) {
        a(maxError, y2Var, false);
    }

    public void showFullscreenAd(final c3 c3Var, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final a.InterfaceC0704a interfaceC0704a) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != c3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f49038a.H().a(true);
        final h hVarB = b(c3Var);
        long jR0 = c3Var.r0();
        if (((Boolean) this.f49038a.a(r3.f8)).booleanValue() && this.f49038a.R() == null && this.f49038a.Q().a((MaxAd) c3Var)) {
            this.f49038a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), EnumC1781i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (a.InterfaceC0704a) null);
        }
        if (C1804o.a()) {
            this.f49039b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + jR0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f49395n.a(c3Var, hVarB, activity, interfaceC0704a);
            }
        }, jR0);
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49042a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f49042a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49042a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49042a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49042a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49042a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49042a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void collectSignal(final d5 d5Var, Context context, final c5.a aVar) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        a3 a3VarU = d5Var.u();
        final String strB = a3VarU.b();
        final MaxAdFormat maxAdFormatA = a3VarU.a();
        c5 c5VarB = this.f49040c.b(d5Var, strB, maxAdFormatA);
        if (c5VarB != null) {
            aVar.a(c5.a(c5VarB));
            return;
        }
        final h hVarA = this.f49038a.T().a(d5Var, d5Var.A());
        if (hVarA == null) {
            aVar.a(c5.a(d5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final com.applovin.impl.s4 s4Var = new com.applovin.impl.s4("SignalCollection:" + d5Var.c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = com.applovin.impl.s4.f49924j;
        s4Var.a(executor, new s4.b() { // from class: com.applovin.impl.mediation.w6
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z2, Object obj, Object obj2) {
                this.f49434n.a(jElapsedRealtime, hVarA, strB, d5Var, maxAdFormatA, aVar, z2, (String) obj, (MaxError) obj2);
            }
        });
        i6.a(d5Var.m(), s4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + d5Var.c() + ") timed out collecting signal"), "MediationService", this.f49038a);
        final Activity activityU0 = context instanceof Activity ? (Activity) context : this.f49038a.u0();
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(d5Var, strB, maxAdFormatA);
        if (d5Var.w()) {
            com.applovin.impl.s4 s4VarA = this.f49038a.S().a(d5Var, activityU0);
            s4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49047n.a(s4Var, hVarA, maxAdapterParametersImplA, d5Var, activityU0);
                }
            });
            s4VarA.a(executor, new s4.a() { // from class: com.applovin.impl.mediation.I28
                @Override // com.applovin.impl.s4.a
                public final void a(Object obj) {
                    this.f48985n.a(hVarA, s4Var, (String) obj);
                }
            });
            return;
        }
        if (d5Var.x()) {
            com.applovin.impl.s4 s4VarA2 = this.f49038a.S().a(d5Var, activityU0);
            if (s4VarA2.e() && !d5Var.z()) {
                if (C1804o.a()) {
                    this.f49039b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVarA.g());
                }
                s4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) s4VarA2.b())));
                return;
            }
        }
        if (C1804o.a()) {
            this.f49039b.a("MediationService", "Collecting signal for adapter: " + hVarA.g());
        }
        hVarA.a(maxAdapterParametersImplA, d5Var, activityU0, s4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof y2) {
            if (C1804o.a()) {
                this.f49039b.d("MediationService", "Destroying " + maxAd);
            }
            y2 y2Var = (y2) maxAd;
            h hVarA = y2Var.A();
            if (hVarA != null) {
                hVarA.a();
                y2Var.t();
            }
            this.f49038a.j().c(y2Var.Q());
            this.f49038a.l().a(y2Var, g.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f49041d.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, EnumC1781i enumC1781i, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0704a interfaceC0704a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0704a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f49038a.V())) {
            C1804o.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f49038a.B0()) {
            C1804o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f49038a.J() != null ? this.f49038a.J().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (n7.c(this.f49038a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.f49038a.a(x4.B6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (C1804o.a()) {
                    this.f49039b.b("MediationService", str3);
                }
            }
            this.f49038a.D().a(d2.S0, "uninitialized_ad_unit_id", CollectionUtils.hashMap(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str), "uninitialized_ad_unit_id" + str);
        }
        this.f49038a.c();
        if (str.length() != 16 && !zStartsWith && !this.f49038a.i0().startsWith("05TMD")) {
            C1804o.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (!this.f49038a.a(maxAdFormat)) {
            this.f49038a.U0();
            t2.a((MaxAdRequestListener) interfaceC0704a, str, true);
            if (this.f49038a.R() != null) {
                this.f49038a.R().a(str, str2, maxAdFormat, enumC1781i, map, map2, context, interfaceC0704a);
                return;
            } else {
                this.f49038a.Q().a(str, str2, maxAdFormat, enumC1781i, map, map2, context, interfaceC0704a);
                return;
            }
        }
        C1804o.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        t2.a(interfaceC0704a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    public void loadThirdPartyMediatedAd(final String str, final y2 y2Var, final Activity activity, final a.InterfaceC0704a interfaceC0704a) {
        com.applovin.impl.s4 s4VarA;
        if (y2Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (C1804o.a()) {
            this.f49039b.a("MediationService", "Loading " + y2Var + "...");
        }
        this.f49038a.P().a(d2.k0, y2Var);
        this.f49038a.l().a(y2Var, g.c.LOADING);
        this.f49038a.t().b(y2Var, "WILL_LOAD");
        final h hVarA = this.f49038a.T().a(y2Var);
        if (hVarA == null) {
            String str2 = "Failed to load " + y2Var + ": adapter not loaded";
            C1804o.h("MediationService", str2);
            b(y2Var, new MaxErrorImpl(-5001, str2), interfaceC0704a);
            return;
        }
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(y2Var);
        if (y2Var.Y()) {
            s4VarA = this.f49038a.S().a(y2Var, activity);
        } else {
            if (y2Var.Z()) {
                this.f49038a.S().a(y2Var, activity);
            }
            s4VarA = null;
        }
        final y2 y2VarA = y2Var.a(hVarA);
        hVarA.a(str, y2VarA);
        y2VarA.f0();
        if (s4VarA == null) {
            hVarA.a(str, maxAdapterParametersImplA, y2VarA, activity, new b(y2VarA, interfaceC0704a));
            return;
        }
        Executor executor = com.applovin.impl.s4.f49924j;
        s4VarA.a(executor, new s4.a() { // from class: com.applovin.impl.mediation.Wre
            @Override // com.applovin.impl.s4.a
            public final void a(Object obj) {
                this.f49064n.a(y2Var, interfaceC0704a, (String) obj);
            }
        });
        s4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.CN3
            @Override // java.lang.Runnable
            public final void run() {
                this.f48974n.a(hVarA, str, maxAdapterParametersImplA, y2VarA, activity, interfaceC0704a);
            }
        });
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f49038a.b(z4.f50997R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jSONObjectJsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l2 = (Long) this.f49038a.b(z4.f50998S);
            String string = l2 != null ? l2.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "ad_info");
            Map mapTryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", string, mapTryToStringMap);
            this.f49038a.D().d(d2.I0, mapTryToStringMap);
            List list = JsonUtils.getList(jSONObjectJsonObjectFromJsonString, "app_killed_urls", Collections.EMPTY_LIST);
            if (CollectionUtils.isEmpty(list)) {
                if (C1804o.a()) {
                    this.f49039b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "user_info");
                Map<String, String> mapTryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : w3.c(this.f49038a);
                mapTryToStringMap2.put("{IMP_DURATION_MS}", string);
                a("mappk", list, mapTryToStringMap2, null, null, null, true);
            }
        }
    }

    public void processAdapterInitializationPostback(k3 k3Var, long j2, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j2));
        a("minit", map, new MaxErrorImpl(str), k3Var);
        Map mapA = f2.a(k3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), mapA);
        switch (a.f49042a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f49038a.P().d(d2.d0, mapA);
                break;
            case 4:
                this.f49038a.P().d(d2.e0, mapA);
                break;
            case 5:
            case 6:
                this.f49038a.O();
                if (C1804o.a()) {
                    this.f49038a.O().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f49038a.D().a(d2.f48277d, "adapterNotInitializedForPostback", mapA);
                break;
        }
    }

    public void processRawAdImpression(y2 y2Var, a.InterfaceC0704a interfaceC0704a) {
        this.f49038a.t().b(y2Var, "WILL_DISPLAY");
        if (y2Var.O().endsWith("mimp")) {
            this.f49038a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0704a, (MaxAd) y2Var);
        }
        if (((Boolean) this.f49038a.a(x4.M4)).booleanValue()) {
            this.f49038a.Y().a(s3.f49916g, t3.a(y2Var), Long.valueOf(System.currentTimeMillis() - this.f49038a.K()));
        }
        HashMap map = new HashMap(3);
        if (y2Var instanceof c3) {
            c3 c3Var = (c3) y2Var;
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(c3Var.p0()));
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(c3Var.u0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f49038a.w0().e());
        if (!((Boolean) this.f49038a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, y2Var);
        this.f49038a.P().a(d2.o0, y2Var);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f49041d.set(jSONObject);
    }

    public MediationServiceImpl(C1802k c1802k) {
        this.f49038a = c1802k;
        this.f49039b = c1802k.O();
        this.f49040c = new b5(c1802k);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objA = this.f49038a.H().a();
            if (objA instanceof y2) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (y2) objA, true);
            }
        }
    }

    public void processCallbackAdImpressionPostback(y2 y2Var, a.InterfaceC0704a interfaceC0704a) {
        if (y2Var.O().endsWith("cimp")) {
            this.f49038a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0704a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(2);
        if (y2Var instanceof c3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f49038a.w0().e());
        if (!((Boolean) this.f49038a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, y2Var);
        this.f49038a.P().a(d2.p0, y2Var);
    }

    public void processViewabilityAdImpressionPostback(h3 h3Var, long j2, a.InterfaceC0704a interfaceC0704a) {
        if (h3Var.O().endsWith("vimp")) {
            this.f49038a.t().b(h3Var);
            t2.a((MaxAdRevenueListener) interfaceC0704a, (MaxAd) h3Var);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j2));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(h3Var.q0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f49038a.w0().e());
        if (!((Boolean) this.f49038a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, h3Var);
        this.f49038a.P().a(d2.q0, h3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, @Nullable MaxError maxError, long j2, long j3) {
        a3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String strB = requestParameters.b();
        MaxAdFormat maxAdFormatA = requestParameters.a();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j3), map);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), map);
        if (maxError != null) {
            map.putAll(f2.a(maxError));
        }
        this.f49038a.P().d(d2.n0, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map2);
        CollectionUtils.putStringIfValid(AppMeasurementSdk.ConditionalUserProperty.NAME, maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j3), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j2), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        map2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map4 = new HashMap(4);
                map4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, map2, null, null, false);
    }

    private h b(c3 c3Var) {
        h hVarA = c3Var.A();
        if (hVarA != null) {
            return hVarA;
        }
        this.f49038a.H().a(false);
        if (C1804o.a()) {
            this.f49039b.k("MediationService", "Failed to show " + c3Var + ": adapter not found");
        }
        C1804o.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + c3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, h hVar, Activity activity, a.InterfaceC0704a interfaceC0704a) {
        a(c3Var);
        hVar.b(c3Var, activity);
        a(c3Var, interfaceC0704a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, h hVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0704a interfaceC0704a) {
        a(c3Var);
        hVar.a(c3Var, viewGroup, lifecycle, activity);
        a(c3Var, interfaceC0704a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, y2Var);
        destroyAd(y2Var);
        t2.a(maxAdListener, y2Var.getAdUnitId(), maxError);
    }

    private void a(c3 c3Var) {
        if (c3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f49038a.q0().a((AbstractRunnableC1782i5) new u6(c3Var, this.f49038a), d6.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f49038a.t().b(y2Var, "DID_LOAD");
        if (y2Var.O().endsWith("load")) {
            this.f49038a.t().b(y2Var);
        }
        HashMap map = new HashMap(3);
        long jG = y2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (y2Var.getFormat().isFullscreenAd()) {
            n.a aVarB = this.f49038a.H().b(y2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("load", map, y2Var);
        Map mapA = f2.a(y2Var);
        mapA.put("duration_ms", String.valueOf(jG));
        this.f49038a.P().d(d2.f48287l0, mapA);
    }

    public void showFullscreenAd(final c3 c3Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final a.InterfaceC0704a interfaceC0704a) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f49038a.H().a(true);
            final h hVarB = b(c3Var);
            long jR0 = c3Var.r0();
            if (((Boolean) this.f49038a.a(r3.f8)).booleanValue() && this.f49038a.R() == null && this.f49038a.Q().a((MaxAd) c3Var)) {
                this.f49038a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), EnumC1781i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (a.InterfaceC0704a) null);
            }
            if (C1804o.a()) {
                this.f49039b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + jR0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49343n.a(c3Var, hVarB, viewGroup, lifecycle, activity, interfaceC0704a);
                }
            }, jR0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void a(c3 c3Var, a.InterfaceC0704a interfaceC0704a) {
        this.f49038a.H().a(false);
        a(c3Var, (MaxAdListener) interfaceC0704a);
        if (C1804o.a()) {
            this.f49039b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(c3Var, interfaceC0704a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, a.InterfaceC0704a interfaceC0704a, String str) {
        String str2 = "Failed to load " + y2Var + ": adapter init failed with error: " + str;
        if (C1804o.a()) {
            this.f49039b.k("MediationService", str2);
        }
        b(y2Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0704a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, a.InterfaceC0704a interfaceC0704a) {
        hVar.a(str, maxAdapterParametersImpl, y2Var, activity, new b(y2Var, interfaceC0704a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j2, h hVar, String str, d5 d5Var, MaxAdFormat maxAdFormat, c5.a aVar, boolean z2, String str2, MaxError maxError) {
        c5 c5VarA;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        if (z2) {
            if (C1804o.a()) {
                this.f49039b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
                str3 = str2;
            } else {
                str3 = str2;
            }
            c5VarA = c5.a(d5Var, hVar, str3, j2, jElapsedRealtime);
            this.f49040c.a(c5VarA, d5Var, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, d5Var.c(), map);
            CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), map);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str, map);
            this.f49038a.P().d(d2.f0, map);
        } else {
            if (C1804o.a()) {
                this.f49039b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            c5VarA = c5.a(d5Var, hVar, maxError, j2, jElapsedRealtime);
            a(c5VarA, d5Var, hVar);
        }
        aVar.a(c5VarA);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.s4 s4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, d5 d5Var, Activity activity) {
        if (s4Var.d()) {
            return;
        }
        if (C1804o.a()) {
            this.f49039b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, d5Var, activity, s4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, com.applovin.impl.s4 s4Var, String str) {
        if (C1804o.a()) {
            this.f49039b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    private void a(final c3 c3Var, final MaxAdListener maxAdListener) {
        final Long l2 = (Long) this.f49038a.a(r3.U7);
        if (l2.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f49405n.a(c3Var, l2, maxAdListener);
            }
        }, l2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, Long l2, MaxAdListener maxAdListener) {
        if (c3Var.u().get()) {
            return;
        }
        String str = "Ad (" + c3Var.k() + ") has not been displayed after " + l2 + "ms. Failing ad display...";
        C1804o.h("MediationService", str);
        a(c3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f49038a.H().b(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f49038a.l().a(y2Var, g.c.SHOW_ERROR);
        this.f49038a.t().b(y2Var, "DID_FAIL_DISPLAY");
        a(maxError, y2Var, true);
        if (y2Var.u().compareAndSet(false, true)) {
            t2.a(maxAdListener, y2Var, maxError);
        }
    }

    private void a(MaxError maxError, y2 y2Var) {
        HashMap map = new HashMap(3);
        long jG = y2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (y2Var.getFormat().isFullscreenAd()) {
            n.a aVarB = this.f49038a.H().b(y2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("mlerr", map, maxError, y2Var);
        Map mapA = f2.a(y2Var);
        mapA.putAll(f2.a(maxError));
        mapA.put("duration_ms", String.valueOf(jG));
        this.f49038a.P().d(d2.m0, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        this.f49038a.t().b(y2Var, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f49038a.w0().e());
        if (!((Boolean) this.f49038a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclose", map, y2Var);
        long jS2 = y2Var.S();
        long jH = y2Var.H();
        Map map2 = CollectionUtils.map("duration_ms", String.valueOf(jS2));
        map2.put("details", "foreground_duration_ms = " + jH);
        this.f49038a.P().a(d2.s0, y2Var, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var, a.InterfaceC0704a interfaceC0704a) {
        this.f49038a.t().b(y2Var, "DID_CLICKED");
        this.f49038a.t().b(y2Var, "DID_CLICK");
        if (y2Var.O().endsWith("click")) {
            this.f49038a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0704a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f49038a.w0().e());
        if (!((Boolean) this.f49038a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, y2Var);
    }

    private void a(MaxError maxError, y2 y2Var, boolean z2) {
        HashMap map = new HashMap(1);
        if (y2Var instanceof c3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        a("mierr", map, maxError, y2Var, z2);
        if (!z2 || y2Var == null) {
            return;
        }
        this.f49038a.P().a(d2.f48294r0, y2Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(y2Var.F())));
    }

    private void a(c5 c5Var, d5 d5Var, h hVar) {
        long jB = c5Var.b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jB));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), map);
        a("serr", map, c5Var.c(), d5Var);
        Map mapA = f2.a(c5Var.c());
        CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, d5Var.c(), mapA);
        CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), mapA);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jB), mapA);
        this.f49038a.P().d(d2.f48281g0, mapA);
    }

    private void a(String str, Map map, k3 k3Var) {
        a(str, map, (MaxError) null, k3Var);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var) {
        a(str, map, maxError, k3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var, boolean z2) {
        String strEmptyIfNull;
        Map map2 = CollectionUtils.map(map);
        String strEmptyIfNull2 = "";
        map2.put("{PLACEMENT}", z2 ? StringUtils.emptyIfNull(k3Var.getPlacement()) : "");
        if (!z2) {
            strEmptyIfNull = "";
        } else {
            strEmptyIfNull = StringUtils.emptyIfNull(k3Var.e());
        }
        map2.put("{CUSTOM_DATA}", strEmptyIfNull);
        if (k3Var instanceof y2) {
            y2 y2Var = (y2) k3Var;
            if (z2) {
                strEmptyIfNull2 = StringUtils.emptyIfNull(y2Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", strEmptyIfNull2);
        }
        a(str, null, map2, null, maxError, k3Var, z2);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, k3 k3Var, boolean z2) {
        this.f49038a.q0().a((AbstractRunnableC1782i5) new b6(str, list, map, map2, maxError, k3Var, this.f49038a, z2), d6.b.OTHER);
    }

    private boolean a(long j2) {
        return System.currentTimeMillis() - j2 <= ((Long) this.f49038a.a(x4.E2)).longValue();
    }
}
