package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v1 f53325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f53326e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f53328g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f53322a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f53323b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53324c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f53327f = new Handler(Looper.getMainLooper(), new b(this));

    public final void a() {
        s sVar = IAConfigManager.f53260M.f53294t;
        if (!sVar.f53468d) {
            sVar.f53467c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, r0.f53294t.f53466b.a("session_duration", 30, 1));
        this.f53325d = v1Var;
        v1Var.f57050e = this.f53328g;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.f53325d;
        if (v1Var != null) {
            v1Var.f57049d = false;
            v1Var.f57051f = 0L;
            t1 t1Var = v1Var.f57048c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            long jA = oVar.a("session_duration", 30, 1);
            long j2 = this.f53325d.f57051f;
            v1 v1Var2 = new v1(timeUnit, jA);
            v1Var2.f57051f = j2;
            IAlog.a("Visible time counter init - time %d", Long.valueOf(jA));
            this.f53325d = v1Var2;
            v1Var2.f57050e = this.f53328g;
        }
        sVar.f53467c.remove(this);
    }

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.f53328g = new d(this);
        this.f53326e = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.f57018a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }
}
