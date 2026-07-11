package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h0 implements i0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InneractiveAdSpot.RequestListener f53678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f53679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f53680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f53681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f53682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f53683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f53684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f53685i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f53688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.rtb.watermark.b f53689m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53686j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f53687k = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f53690n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f53691o = new Object();

    public static String a(h0 h0Var) {
        h0Var.getClass();
        return IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        if (this.f53690n.get()) {
            IAlog.a("%s : loadAd: spot is already destroyed", IAlog.a(this));
            a(this.f53681e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.a(this));
        if (IAConfigManager.c()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f53678b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f53678b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f53678b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.f54080d.a(this.f53677a).c();
        String str2 = this.f53677a;
        this.f53688l = new p(str2);
        if (this.f53680d == null) {
            this.f53680d = new e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        c0 c0Var = new c0(this, yVar, rVarA, str);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        if (IAConfigManager.f()) {
            Application application = com.fyber.inneractive.sdk.util.o.f57018a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.config.a0(IAConfigManager.f53260M, application));
        }
        IAConfigManager.f53260M.f53267E.a();
        com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, rVarA));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = (s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.f53683g.size() > 0) {
                for (InneractiveUnitController inneractiveUnitController2 : new HashSet(this.f53683g)) {
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f53683g.add(s0Var);
            if (this.f53681e != null) {
                for (s0 s0Var2 : this.f53683g) {
                    if (s0Var2.supports(this)) {
                        this.f53682f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    public final void b() {
        Bitmap bitmap;
        this.f53690n.set(true);
        Iterator it = this.f53683g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        this.f53683g.clear();
        a((x) null);
        this.f53678b = null;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.f53689m;
        if (bVar != null) {
            IAlog.a("%s destroy called", "InneractiveWatermark");
            ImageView imageView = bVar.f56910a;
            if (imageView != null) {
                Drawable background = imageView.getBackground();
                if ((background instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) background).getBitmap()) != null) {
                    try {
                        bitmap.recycle();
                    } catch (Throwable unused) {
                    }
                }
            }
            com.fyber.inneractive.sdk.util.v.a(bVar.f56910a);
            bVar.f56910a = null;
            this.f53689m = null;
        }
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.f53681e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f53679c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f53677a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.f53260M.f53287m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.f53260M.f53286l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.f53260M.f53288n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f53679c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f53682f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isReady() {
        boolean z2;
        x xVar;
        x xVar2 = this.f53681e;
        if (xVar2 == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.e eVar = xVar2.f53978b;
        if (eVar != null) {
            z2 = eVar.f56849a < System.currentTimeMillis();
        }
        if (z2 && (xVar = this.f53681e) != null) {
            com.fyber.inneractive.sdk.response.e eVar2 = xVar.f53978b;
            if (!this.f53687k && eVar2 != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - eVar2.f56851c);
                long j2 = eVar2.f56850b;
                long j3 = minutes - j2;
                IAlog.a("Firing Event 802 - AdExpired - time passed- " + j3 + ", sessionTimeOut - " + j2, new Object[0]);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = xVar.f53977a;
                JSONArray jSONArrayB = xVar.f53979c.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                wVar.f54358b = tVar;
                wVar.f54357a = inneractiveAdRequest;
                wVar.f54360d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                Long lValueOf = Long.valueOf(j3);
                try {
                    jSONObject.put("time_passed", lValueOf);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", lValueOf);
                }
                Long lValueOf2 = Long.valueOf(j2);
                try {
                    jSONObject.put("timeout", lValueOf2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "timeout", lValueOf2);
                }
                wVar.f54362f.put(jSONObject);
                wVar.a((String) null);
                this.f53687k = true;
            }
        }
        return !z2 && this.f53681e.d();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = this.f53682f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f53682f.destroy();
                this.f53682f = null;
            }
            this.f53683g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    public h0() {
        String string = UUID.randomUUID().toString();
        this.f53677a = string;
        this.f53683g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), string);
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
        this.f53685i = g0Var;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.a(this), this.f53677a);
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            b();
        } else {
            com.fyber.inneractive.sdk.util.r.f57026b.post(new d0(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z2;
        if (IAConfigManager.c()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f53678b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f53679c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f53678b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f53678b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest2 = inneractiveAdRequest;
        } else {
            inneractiveAdRequest2 = this.f53679c;
        }
        String str = this.f53677a;
        inneractiveAdRequest2.f53932b = str;
        com.fyber.inneractive.sdk.metrics.d.f54080d.a(str).c();
        if (this.f53683g.isEmpty()) {
            IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
            if (this.f53678b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.f53679c;
                }
                a(inneractiveAdRequest, null);
                this.f53678b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        m mVar = this.f53684h;
        if (mVar != null) {
            if (inneractiveAdRequest == null && this.f53679c != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            l lVar = mVar.f53710g;
            if (lVar != null) {
                IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.f53791d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.f53791d = null;
            }
            mVar.a(z2);
            mVar.f53789b = null;
        }
        if (inneractiveAdRequest != null) {
            InneractiveAdRequest inneractiveAdRequest3 = this.f53679c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.f53679c = inneractiveAdRequest;
            x xVar = this.f53681e;
            if (xVar != null) {
                xVar.destroy();
                this.f53686j = true;
            }
            Iterator it = this.f53683g.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((s0) it.next()) instanceof InneractiveFullscreenUnitController) {
                        break;
                    }
                } else {
                    this.f53679c.f53931a = false;
                    break;
                }
            }
        }
        this.f53684h = new m(this.f53677a);
        if (this.f53680d == null) {
            this.f53680d = new e0(this);
        }
        IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f53684h);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        if (IAConfigManager.f()) {
            Application application = com.fyber.inneractive.sdk.util.o.f57018a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.config.a0(IAConfigManager.f53260M, application));
        }
        IAConfigManager.f53260M.f53267E.a();
        m mVar3 = this.f53684h;
        if (mVar3 != null) {
            InneractiveAdRequest inneractiveAdRequest4 = this.f53679c;
            mVar3.f53789b = this.f53680d;
            if (IAConfigManager.d()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            l lVar2 = new l(mVar3, inneractiveAdRequest4);
            mVar3.f53710g = lVar2;
            IAConfigManager.addListener(lVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.f53678b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        x xVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar2 = this.f53681e;
        if (xVar2 != null) {
            if (xVar2.b() && (xVar = this.f53681e) != null && !xVar.f53981e) {
                String string = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.a("Firing Event 803 - Stack trace - %s", string);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                x xVar3 = this.f53681e;
                InneractiveAdRequest inneractiveAdRequest = xVar3.f53977a;
                com.fyber.inneractive.sdk.response.e eVar = xVar3.f53978b;
                m mVar = this.f53684h;
                p pVar = this.f53688l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.f53790c : null;
                if (mVar != null && (rVar = mVar.f53790c) != null) {
                    jSONArrayB = rVar.b();
                } else {
                    jSONArrayB = rVar2 != null ? rVar2.b() : null;
                }
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f54358b = tVar;
                wVar.f54357a = inneractiveAdRequest;
                wVar.f54360d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stack_trace", string);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
                }
                wVar.f54362f.put(jSONObject);
                wVar.a((String) null);
            }
            this.f53681e.destroy();
            this.f53681e = null;
        }
        this.f53682f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.response.e eVar2;
        if (inneractiveAdRequest == null || inneractiveAdRequest.getSelectedUnitConfig() == null) {
            unitDisplayType = null;
        } else if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f53417c != null) {
            unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f53417c.f53402b;
        } else if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f53420f != null) {
            unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f53420f.f53480j;
        }
        x xVar = this.f53681e;
        com.fyber.inneractive.sdk.response.e eVar3 = (xVar == null || (eVar2 = xVar.f53978b) == null) ? eVar : eVar2;
        String str = this.f53677a;
        if (unitDisplayType == null && eVar3 != null) {
            unitDisplayType = eVar3.f56862n;
        }
        UnitDisplayType unitDisplayType2 = unitDisplayType;
        x xVar2 = this.f53681e;
        new com.fyber.inneractive.sdk.metrics.c(eVar3, inneractiveAdRequest, str, unitDisplayType2, xVar2 != null ? xVar2.f53979c.b() : null).a();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str, String str2) {
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        com.fyber.inneractive.sdk.config.i iVar = iAConfigManager.f53295u;
        com.fyber.inneractive.sdk.config.s sVar = iAConfigManager.f53294t;
        if (sVar != null && sVar.f53466b.a(true, "ext_wm") && iVar != null && !TextUtils.isEmpty(str2)) {
            this.f53689m = new com.fyber.inneractive.sdk.rtb.watermark.b(iVar.a(), str2);
        }
        loadAd(str);
    }

    public final void a(x xVar) {
        synchronized (this.f53691o) {
            try {
                p pVar = this.f53688l;
                if (pVar != null) {
                    pVar.a(true);
                    pVar.f53789b = null;
                    this.f53688l = null;
                }
                m mVar = this.f53684h;
                if (mVar != null) {
                    l lVar = mVar.f53710g;
                    if (lVar != null) {
                        IAConfigManager.removeListener(lVar);
                    }
                    com.fyber.inneractive.sdk.network.m mVar2 = mVar.f53791d;
                    if (mVar2 != null) {
                        mVar2.a();
                        mVar.f53791d = null;
                    }
                    mVar.a(true);
                    mVar.f53789b = null;
                    this.f53684h = null;
                }
                if (xVar != null) {
                    xVar.destroy();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
