package com.fyber.inneractive.sdk.ui.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f56966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f56967b = new AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f3) {
        if (f3 >= 0.01f && this.f56967b.compareAndSet(false, true)) {
            IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f3 * 100.0f));
            this.f56966a.t();
        }
    }
}
