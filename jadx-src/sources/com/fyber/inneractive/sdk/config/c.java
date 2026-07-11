package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.util.z0;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f53305a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public c(e eVar) {
        this.f53305a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f53305a.f53327f.hasMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) || this.f53305a.f53323b.get()) {
            return;
        }
        this.f53305a.f53327f.sendEmptyMessageDelayed(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.f53305a.f53327f.removeMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        e eVar = this.f53305a;
        if (eVar.f53323b.compareAndSet(true, false)) {
            if (eVar.f53324c) {
                IAlog.a("onActivityResumed: restartSession", new Object[0]);
                eVar.f53324c = false;
                x0 x0Var = eVar.f53326e;
                if (x0Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = x0Var.f53492a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.f53201a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.f53211a.get(cVar)) != null && gVar.f53207a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.f53326e.f53495d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    eVar.f53326e.f53494c.clear();
                }
            }
            v1 v1Var = eVar.f53325d;
            if (v1Var != null) {
                v1Var.f57049d = false;
                v1Var.f57051f = 0L;
                t1 t1Var = v1Var.f57048c;
                if (t1Var != null) {
                    t1Var.removeMessages(1932593528);
                }
            }
        }
        for (z0 z0Var : this.f53305a.f53322a) {
            if (z0Var.f57065c) {
                z0Var.f57065c = false;
                e eVar3 = IAConfigManager.f53260M.f53297w.f53493b;
                if (eVar3 != null) {
                    eVar3.f53322a.remove(z0Var);
                }
                String strA = com.fyber.inneractive.sdk.util.c0.a(System.currentTimeMillis(), z0Var.f57064b, 0L);
                z0Var.f57064b = 0L;
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.TIME_SPENT_IN_PLAY_STORE;
                com.fyber.inneractive.sdk.flow.x xVar = z0Var.f57063a;
                InneractiveAdRequest inneractiveAdRequest = xVar == null ? null : xVar.f53977a;
                com.fyber.inneractive.sdk.response.e eVar4 = xVar == null ? null : xVar.f53978b;
                JSONArray jSONArrayB = (xVar == null || (rVar = xVar.f53979c) == null) ? null : rVar.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar4);
                wVar.f54359c = uVar;
                wVar.f54357a = inneractiveAdRequest;
                wVar.f54360d = jSONArrayB;
                wVar.a("appstore_time", strA);
                wVar.a((String) null);
            }
        }
    }
}
