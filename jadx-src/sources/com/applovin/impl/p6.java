package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class p6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f49689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f49690h;

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i2) {
            this.f48733a.q0().a(h6.a(p8Var, p6.this.f49689g, p6.this.f49690h, p6.this.f48733a));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, p8 p8Var) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to resolve VAST wrapper. Server returned " + i2);
            }
            p6.this.a(i2);
        }
    }

    p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        super("TaskResolveVastWrapper", c1802k);
        this.f49690h = appLovinAdLoadListener;
        this.f49689g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = a8.a(this.f49689g);
        if (!StringUtils.isValidString(strA)) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Resolving VAST ad with depth " + this.f49689g.d() + " at " + strA);
        }
        try {
            this.f48733a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f48733a).b(strA).c("GET").a(p8.f49696f).a(((Integer) this.f48733a.a(x4.U4)).intValue()).c(((Integer) this.f48733a.a(x4.V4)).intValue()).a(false).a(), this.f48733a));
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Failed to resolve VAST wrapper due to error code " + i2);
        }
        if (i2 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f49690h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i2);
                return;
            }
            return;
        }
        a8.a(this.f49689g, this.f49690h, i2 == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i2, this.f48733a);
    }
}
