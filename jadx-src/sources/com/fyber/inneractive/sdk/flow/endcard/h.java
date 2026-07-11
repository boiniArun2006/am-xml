package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.o f53600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53601b;

    public final void a(b bVar, boolean z2) {
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
        } else {
            bVar.f53591f = bVar.k() ? z2 ? this.f53600a.b("d_e_pl_dl_pl", this.f53601b, 0) : this.f53600a.b("d_e_pl", this.f53601b, 0) : z2 ? this.f53600a.b("d_e_npl_dl_npl", this.f53601b, 0) : this.f53600a.b("d_e_npl", this.f53601b, 0);
        }
    }

    public h() {
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.f53260M.f53294t.f53466b;
        this.f53600a = oVar;
        this.f53601b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(b bVar, boolean z2, boolean z3) {
        int iB;
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (!z2) {
            iB = this.f53600a.b("d_e_def", this.f53601b, 0);
        } else if (z3) {
            iB = this.f53600a.b("d_e_pl_dl_dl", this.f53601b, 0);
        } else {
            iB = this.f53600a.b("d_e_npl_dl_dl", this.f53601b, 0);
        }
        bVar.f53591f = iB;
    }
}
