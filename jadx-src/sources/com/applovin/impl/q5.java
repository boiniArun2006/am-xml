package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class q5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f49795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f49796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d6.b f49797i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i2) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.f49796h != null) {
                q5.this.f49796h.onPostbackSuccess(q5.this.f49795g.f());
            }
        }
    }

    class b extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final String f49799m;

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i2) {
            if (obj instanceof String) {
                for (String str2 : this.f48733a.c(x4.i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f48733a);
                                r0.b(jSONObject, this.f48733a);
                                r0.a(jSONObject, this.f48733a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.f49796h != null) {
                q5.this.f49796h.onPostbackSuccess(this.f49799m);
            }
            if (q5.this.f49795g.t()) {
                this.f48733a.t().a(q5.this.f49795g.s(), this.f49799m, i2, obj, null, true);
            }
        }

        b(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
            this.f49799m = q5.this.f49795g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, Object obj) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Failed to dispatch postback. Error code: " + i2 + " URL: " + this.f49799m);
            }
            if (q5.this.f49796h != null) {
                q5.this.f49796h.onPostbackFailure(this.f49799m, i2);
            }
            if (q5.this.f49795g.t()) {
                this.f48733a.t().a(q5.this.f49795g.s(), this.f49799m, i2, obj, str2, false);
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, C1802k c1802k, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", c1802k);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f49795g = eVar;
        this.f49796h = appLovinPostbackListener;
        this.f49797i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f49795g, b());
        bVar.a(this.f49797i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f49795g.f())) {
            if (this.f49795g.u()) {
                b().x0().a(this.f49795g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (C1804o.a()) {
            this.f48735c.d(this.f48734b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f49796h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f49795g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
