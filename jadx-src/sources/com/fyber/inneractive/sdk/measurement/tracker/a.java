package com.fyber.inneractive.sdk.measurement.tracker;

import a88.C;
import a88.Dsr;
import a88.Wre;
import a88.j;
import a88.o;
import a88.w6;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a extends e {
    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(m mVar) {
        super.a(mVar);
        try {
            j jVarN = j.n(this.f54062a);
            this.f54063b = jVarN;
            jVarN.t();
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final w6 b() {
        try {
            return w6.n(Wre.HTML_DISPLAY, Dsr.UNSPECIFIED, C.NATIVE, C.NONE, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        j jVar;
        if (this.f54064c || this.f54062a == null || (jVar = this.f54063b) == null) {
            return;
        }
        this.f54064c = true;
        try {
            jVar.rl();
        } catch (Throwable unused) {
        }
    }

    public a(o oVar, m mVar) {
        super(oVar, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        IAlog.f("%s Unsupported functionality for non video MRAID ads", IAlog.a(this));
    }
}
