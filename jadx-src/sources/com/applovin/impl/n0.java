package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class n0 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f49451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f49452h;

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k, boolean z2) {
            super(aVar, c1802k, z2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            this.f48733a.t().a(n0.this.f49451g, n0.this.f49452h.f(), i2, jSONObject, null, true);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            this.f48733a.t().a(n0.this.f49451g, n0.this.f49452h.f(), i2, jSONObject, str2, false);
        }
    }

    public n0(String str, com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
        super("CommunicatorRequestTask", c1802k, str);
        this.f49451g = str;
        this.f49452h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f48733a.q0().a(new a(this.f49452h, this.f48733a, d()));
    }
}
