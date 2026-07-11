package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class f6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f48534o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f48535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f48536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f48537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0704a f48538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f48539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f48540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f48541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f48542n;

    private class b extends AbstractRunnableC1782i5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f48543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f48544h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final y2 f48545i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f48546j;

        class a extends i3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f48548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f48549c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.InterfaceC0704a interfaceC0704a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0704a);
                this.f48548b = maxAdFormat;
                this.f48549c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f48543g;
                C1804o unused = b.this.f48735c;
                if (C1804o.a()) {
                    b.this.f48735c.a(b.this.f48734b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f48548b.getLabel() + " ad unit " + this.f48549c);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i2 = b.this.f48544h;
                while (true) {
                    i2++;
                    if (i2 >= b.this.f48546j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.f48546j.get(i2), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f48543g;
                C1804o unused = b.this.f48735c;
                if (C1804o.a()) {
                    b.this.f48735c.a(b.this.f48734b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f48548b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f48545i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f48544h < b.this.f48546j.size() - 1) {
                    b bVar2 = b.this;
                    b.this.f48733a.q0().a((AbstractRunnableC1782i5) new b(bVar2.f48544h + 1, b.this.f48546j), d6.b.MEDIATION);
                } else {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        private b(int i2, List list) {
            super(f6.this.f48734b, f6.this.f48733a, f6.this.f48535g.b());
            this.f48543g = SystemClock.elapsedRealtime();
            this.f48544h = i2;
            this.f48545i = (y2) list.get(i2);
            this.f48546j = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = f6.this.f48535g.b();
            MaxAdFormat maxAdFormatA = f6.this.f48535g.a();
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Loading ad " + (this.f48544h + 1) + " of " + this.f48546j.size() + " from " + this.f48545i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) f6.this.f48539k.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f48733a.u0();
            this.f48733a.a0().b(this.f48545i);
            this.f48733a.X().loadThirdPartyMediatedAd(strB, this.f48545i, activityU0, new a(f6.this.f48538j, maxAdFormatA, strB));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j2, MaxError maxError) {
            f6.this.f48542n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j2, y2Var.B(), maxError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f48733a.u0());
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, C1802k c1802k, a.InterfaceC0704a interfaceC0704a) {
        super("TaskProcessMediationWaterfall", c1802k, a3Var.b());
        this.f48535g = a3Var;
        this.f48536h = jSONObject;
        this.f48538j = interfaceC0704a;
        this.f48539k = new WeakReference(context);
        this.f48540l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.safedk.android.analytics.brandsafety.l.f62638S, new JSONArray());
        this.f48537i = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f48537i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, c1802k));
        }
        this.f48542n = new ArrayList(this.f48537i.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f48733a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f48541m;
        if (C1804o.a()) {
            this.f48735c.d(this.f48734b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + y2Var.c() + " for " + this.f48535g.a().getLabel() + " ad unit " + this.f48535g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f48542n, this.f48540l));
        t2.f(this.f48538j, y2Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f48541m = SystemClock.elapsedRealtime();
        int i2 = 0;
        if (this.f48536h.optBoolean("is_testing", false) && !this.f48733a.s0().c() && f48534o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.M5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47775n.e();
                }
            });
        }
        String strB = this.f48535g.b();
        MaxAdFormat maxAdFormatA = this.f48535g.a();
        if (this.f48537i.size() > 0) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f48537i.size() + " ad(s)...");
            }
            this.f48733a.q0().a(new b(i2, this.f48537i));
            return;
        }
        if (C1804o.a()) {
            this.f48735c.k(this.f48734b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        n7.a(strB, maxAdFormatA, this.f48536h, this.f48733a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f48536h, "settings", new JSONObject());
        long j2 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f48536h, strB, this.f48733a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strB + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.f48733a) && ((Boolean) this.f48733a.a(x4.A6)).booleanValue()) {
                j2 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j2);
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.YzO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47867n.b(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                g0.a(millis, this.f48733a, runnable);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
                return;
            }
        }
        b(maxErrorImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f48542n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f48542n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i2 = 0;
            while (i2 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i2);
                i2++;
                sb.append(i2);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String strB = this.f48535g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f48541m;
        if (C1804o.a()) {
            this.f48735c.d(this.f48734b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.f48535g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f48536h, "waterfall_name", ""), JsonUtils.getString(this.f48536h, "waterfall_test_name", ""), jElapsedRealtime, this.f48542n, this.f48535g, JsonUtils.optList(JsonUtils.getJSONArray(this.f48536h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f48540l, JsonUtils.getString(this.f48536h, "event_id", "")));
        t2.a(this.f48538j, strB, maxError);
    }
}
