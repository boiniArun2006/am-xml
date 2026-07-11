package com.fyber.inneractive.sdk.player.ui;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f56439b;

    public j(l lVar, int i2) {
        this.f56439b = lVar;
        this.f56438a = i2;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        if (this.f56439b.f56432h) {
            IAlog.a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.a("Autoclick is triggered", new Object[0]);
            ((z) this.f56439b.f56431g).a(this.f56438a, l.f56441J);
        }
        this.f56439b.p();
    }
}
