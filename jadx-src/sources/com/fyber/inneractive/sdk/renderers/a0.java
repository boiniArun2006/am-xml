package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a0 implements com.fyber.inneractive.sdk.ui.controller.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f56731a;

    public a0(c0 c0Var) {
        this.f56731a = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
        c0 c0Var = this.f56731a;
        boolean z2 = c0Var.f56735m;
        if (z2) {
            return;
        }
        if (c0Var.f53562b != null && !z2) {
            c0Var.f56735m = true;
            IAlog.a("%sTracking impression", IAlog.a(c0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) c0Var.f53562b);
            c0Var.f56736n = aVar;
            aVar.a(c0Var);
        }
        c0Var.E();
    }
}
