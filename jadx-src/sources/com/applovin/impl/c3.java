package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.applovin.impl.sdk.C1802k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class c3 extends y2 implements t1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final AtomicReference f48175A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f48176B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final AtomicBoolean f48177C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final AtomicBoolean f48178D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f48179E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f48180F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Bundle f48181z;

    public c3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        super(a3Var, jSONObject, jSONObject2, null, c1802k);
        this.f48181z = new Bundle();
        this.f48177C = new AtomicBoolean();
        this.f48178D = new AtomicBoolean();
        this.f48175A = new AtomicReference();
        this.f48176B = new AtomicBoolean();
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new c3(this, hVar);
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.f48179E = true;
    }

    private long k0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f48807a.a(r3.R7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.y2
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f48181z.putBundle("applovin_ad_view_info", bundle2);
    }

    public void j(String str) {
        this.f48180F = str;
    }

    public void j0() {
        this.f48176B.set(true);
    }

    public long l0() {
        return a("ahdm", ((Long) this.f48807a.a(r3.L7)).longValue());
    }

    public long m0() {
        String str = QiDPjiOCZHDS.gfavjg;
        long jA = a(str, -1L);
        return jA >= 0 ? jA : b(str, ((Long) this.f48807a.a(r3.f49869Z7)).longValue());
    }

    public long n0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f48807a.a(r3.W7)).longValue());
    }

    public o4 o0() {
        return (o4) this.f48175A.getAndSet(null);
    }

    public Bundle q0() {
        return this.f48181z;
    }

    public long r0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f48807a.a(r3.J7)).longValue();
    }

    public String s0() {
        return b("mcode", "");
    }

    public AtomicBoolean t0() {
        return this.f48177C;
    }

    public String u0() {
        return this.f48180F;
    }

    public AtomicBoolean v0() {
        return this.f48178D;
    }

    public boolean w0() {
        return this.f48176B.get();
    }

    public boolean x0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f48807a.a(r3.f49868X7)).booleanValue();
    }

    public boolean y0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f48807a.a(r3.Y7)).booleanValue();
    }

    public boolean z0() {
        return a("susaode", (Boolean) this.f48807a.a(r3.K7)).booleanValue();
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - I());
    }

    public long p0() {
        if (I() > 0) {
            return SystemClock.elapsedRealtime() - I();
        }
        return -1L;
    }

    public void a(o4 o4Var) {
        this.f48175A.set(o4Var);
    }

    private c3(c3 c3Var, com.applovin.impl.mediation.h hVar) {
        super(c3Var.N(), c3Var.a(), c3Var.g(), hVar, c3Var.f48807a);
        this.f48181z = new Bundle();
        this.f48177C = new AtomicBoolean();
        this.f48178D = new AtomicBoolean();
        this.f48175A = c3Var.f48175A;
        this.f48176B = c3Var.f48176B;
    }
}
