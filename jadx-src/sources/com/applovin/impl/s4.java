package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.AppLovinSdkUtils;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInPromise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f49923i = new Executor() { // from class: com.applovin.impl.iy
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f49924j = new androidx.credentials.j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49926b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Object f49931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f49932h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f49925a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f49927c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f49928d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f49929e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f49930f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z2, Object obj, Object obj2);
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public s4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public s4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public s4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public Object b() {
        l1.a(e());
        return this.f49932h;
    }

    public String c() {
        String str = this.f49926b;
        return str != null ? str : super.toString();
    }

    public boolean d() {
        return this.f49928d;
    }

    public boolean e() {
        return this.f49928d && !this.f49929e;
    }

    public String toString() {
        String str;
        if (!this.f49928d) {
            str = "Waiting";
        } else if (this.f49929e) {
            str = "Success -> " + this.f49931g;
        } else {
            str = "Failed -> " + this.f49932h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public s4(String str) {
        this.f49926b = str;
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.eh
            @Override // java.lang.Runnable
            public final void run() {
                this.f48506n.b(executor, bVar);
            }
        };
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.Ji
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z2, Object obj, Object obj2) {
                s4.a(runnable, z2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z2, Object obj, Object obj2) {
        if (z2) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.Il5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47743n.a(bVar);
                }
            });
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.rd
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z2, Object obj, Object obj2) {
                s4.a(aVar, z2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z2, Object obj, Object obj2) {
        if (z2) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f49925a) {
            try {
                if (!this.f49928d) {
                    this.f49927c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        return this.f49928d && this.f49930f;
    }

    private void a(boolean z2, Object obj, Object obj2, boolean z3) {
        synchronized (this.f49925a) {
            try {
                if (this.f49928d) {
                    return;
                }
                this.f49931g = obj;
                this.f49932h = obj2;
                this.f49929e = z2;
                this.f49930f = z3;
                this.f49928d = true;
                Iterator it = this.f49927c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f49927c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f49929e, this.f49931g, this.f49932h);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        l1.a(th);
        C1802k c1802k = C1802k.C0;
        if (c1802k != null) {
            c1802k.D().a(V8ValueBuiltInPromise.NAME, "PromiseCallback: " + c(), th);
        }
    }
}
