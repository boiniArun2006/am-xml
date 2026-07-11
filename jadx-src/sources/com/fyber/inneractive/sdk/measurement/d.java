package com.fyber.inneractive.sdk.measurement;

import a88.o;
import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import ixS.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f54035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f54036b;

    public d(e eVar, Context context) {
        this.f54036b = eVar;
        this.f54035a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            j.n(this.f54035a);
            this.f54036b.f54041e = o.n(Tracker.Fyber.NAME, InneractiveAdManager.getVersion());
            e.a(this.f54036b, this.f54035a);
            IAlog.a("OMID SDK was activated - version %s", j.rl());
            IAlog.d("OMID SDK was activated - version %s", j.rl());
        } catch (Throwable th) {
            IAlog.a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.f54036b.getClass();
            z.a(th.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th.getMessage(), null, null);
        }
    }
}
