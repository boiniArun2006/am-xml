package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class p0 extends b0 implements com.fyber.inneractive.sdk.interfaces.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.e f53796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f53797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v1 f53798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f53799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v1 f53800o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f53803r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m0 f53808w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f53801p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f53802q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f53804s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f53805t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f53806u = new com.fyber.inneractive.sdk.util.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f53807v = new com.fyber.inneractive.sdk.util.a();

    public abstract boolean I();

    public abstract int K();

    public abstract int L();

    public abstract long M();

    public abstract boolean N();

    public abstract long a(long j2);

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.f53561a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        }
        if (eVar != null) {
            this.f53796k = eVar;
        } else {
            IAlog.f("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void b(boolean z2) {
    }

    public abstract boolean b(x xVar);

    public final void e(boolean z2) {
        com.fyber.inneractive.sdk.network.w wVar;
        this.f53801p = true;
        if (z2) {
            if (this.f53562b == null) {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
                wVar.f54359c = uVar;
                wVar.f54357a = null;
                wVar.f54360d = null;
            } else {
                com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                x xVar = this.f53562b;
                InneractiveAdRequest inneractiveAdRequest = xVar.f53977a;
                com.fyber.inneractive.sdk.response.e eVar = xVar.f53978b;
                JSONArray jSONArrayB = xVar.f53979c.b();
                wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f54359c = uVar2;
                wVar.f54357a = inneractiveAdRequest;
                wVar.f54360d = jSONArrayB;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean boolValueOf = Boolean.valueOf(N());
            try {
                jSONObject.put("is_endcard", boolValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "is_endcard", boolValueOf);
            }
            wVar.f54362f.put(jSONObject);
            wVar.a((String) null);
        }
        com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f53796k;
        if (eVar2 != null) {
            eVar2.showCloseButton(z2, L(), K());
            if (z2) {
                return;
            }
            com.fyber.inneractive.sdk.util.a aVar = this.f53807v;
            aVar.f56980d = 0L;
            aVar.f56981e = 0L;
            aVar.f56982f = 0L;
            aVar.f56978b = false;
            aVar.a(false);
        }
    }

    public final void J() {
        if (this.f53797l == null) {
            long jM = M();
            this.f53803r = jM;
            this.f53797l = new l0(this, jM);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.f53803r));
            x xVar = this.f53562b;
            boolean zB = xVar != null ? b(xVar) : false;
            if (!zB || I()) {
                if (this.f53802q) {
                    return;
                }
                this.f53802q = true;
                v1 v1Var = new v1(TimeUnit.MILLISECONDS, this.f53803r);
                this.f53798m = v1Var;
                v1Var.f57050e = new n0(this);
                v1Var.f57049d = false;
                v1Var.f57048c.sendEmptyMessage(1932593528);
                return;
            }
            if (zB) {
                com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
                if (eVar != null) {
                    eVar.showCloseCountdown();
                }
                m0 m0Var = new m0(this, this.f53803r + 100);
                this.f53808w = m0Var;
                m0Var.start();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : registerObserver: %s doesnt support Store Promo", getClass().getName());
        return false;
    }

    public final void d(boolean z2) {
        com.fyber.inneractive.sdk.network.w wVar;
        if (this.f53562b == null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
            wVar.f54359c = uVar;
            wVar.f54357a = null;
            wVar.f54360d = null;
        } else {
            com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            x xVar = this.f53562b;
            InneractiveAdRequest inneractiveAdRequest = xVar.f53977a;
            com.fyber.inneractive.sdk.response.e eVar = xVar.f53978b;
            JSONArray jSONArrayB = xVar.f53979c.b();
            wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.f54359c = uVar2;
            wVar.f54357a = inneractiveAdRequest;
            wVar.f54360d = jSONArrayB;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean boolValueOf = Boolean.valueOf(z2);
        try {
            jSONObject.put("fyber_close_enabled", boolValueOf);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", boolValueOf);
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f53797l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable);
            this.f53797l = null;
        }
        Runnable runnable2 = this.f53799n;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable2);
            this.f53799n = null;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f53796k = null;
        m0 m0Var = this.f53808w;
        if (m0Var != null) {
            m0Var.cancel();
            this.f53808w = null;
        }
        v1 v1Var = this.f53800o;
        if (v1Var != null) {
            v1Var.f57050e = null;
            this.f53800o = null;
        }
        v1 v1Var2 = this.f53798m;
        if (v1Var2 != null) {
            v1Var2.f57050e = null;
            this.f53798m = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View x() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
        if (eVar != null) {
            return eVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int y() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f53796k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int z() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f53796k.getLayout().getWidth();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.f53807v.f56977a = inneractiveAdSpot;
        this.f53806u.f56977a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : unregisterObserver: %s doesnt support Store Promo", getClass().getName());
    }
}
