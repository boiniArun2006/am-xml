package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d1 f54249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54250e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f54246a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f54247b = new JSONArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54251f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54252g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f54248c = new HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(Application application) {
        if (!this.f54252g) {
            this.f54252g = true;
            this.f54248c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.f54248c.getLooper(), this);
            this.f54249d = d1Var;
            this.f54251f = true;
            this.f54250e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.f54249d.removeMessages(12312329);
            }
            long j2 = this.f54250e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.f54249d;
            if (d1Var2 != null) {
                d1Var2.post(new c(this, 12312329, j2));
            }
        }
        application.registerActivityLifecycleCallbacks(new d(this));
    }
}
