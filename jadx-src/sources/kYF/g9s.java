package kYF;

import Lvl.Wre;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class g9s implements ComponentCallbacks2, Wre.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f69949o = new j(null);
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Lvl.Wre f69950O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f69951n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69952r = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Context f69953t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private final synchronized void nr() {
        Lvl.Wre i28;
        try {
            eQ.aC aCVar = (eQ.aC) this.f69951n.get();
            if (aCVar == null) {
                O();
            } else if (this.f69950O == null) {
                if (aCVar.xMQ().nr()) {
                    Context contextUo = aCVar.Uo();
                    aCVar.KN();
                    i28 = Lvl.CN3.n(contextUo, this, null);
                } else {
                    i28 = new Lvl.I28();
                }
                this.f69950O = i28;
                this.f69952r = i28.n();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O() {
        try {
            if (this.J2) {
                return;
            }
            this.J2 = true;
            Context context = this.f69953t;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            Lvl.Wre wre = this.f69950O;
            if (wre != null) {
                wre.shutdown();
            }
            this.f69951n.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Lvl.Wre.j
    public synchronized void n(boolean z2) {
        try {
            eQ.aC aCVar = (eQ.aC) this.f69951n.get();
            if (aCVar != null) {
                aCVar.KN();
                this.f69952r = z2;
            } else {
                O();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(Configuration configuration) {
        if (((eQ.aC) this.f69951n.get()) == null) {
            O();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int i2) {
        try {
            eQ.aC aCVar = (eQ.aC) this.f69951n.get();
            if (aCVar != null) {
                aCVar.KN();
                aCVar.az(i2);
            } else {
                O();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean rl() {
        nr();
        return this.f69952r;
    }

    public final synchronized void t() {
        try {
            eQ.aC aCVar = (eQ.aC) this.f69951n.get();
            if (aCVar == null) {
                O();
            } else if (this.f69953t == null) {
                Context contextUo = aCVar.Uo();
                this.f69953t = contextUo;
                contextUo.registerComponentCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public g9s(eQ.aC aCVar) {
        this.f69951n = new WeakReference(aCVar);
    }
}
