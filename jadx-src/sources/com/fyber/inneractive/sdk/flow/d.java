package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f53576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.interfaces.b f53577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f53578c = new b(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f53579d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f53577b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.f53576a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.f53576a;
            if (handler != null) {
                handler.removeCallbacks(this.f53579d);
            }
            this.f53576a.getLooper().quitSafely();
            this.f53576a = null;
        }
    }
}
