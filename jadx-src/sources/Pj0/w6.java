package Pj0;

import Pj0.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 extends j {
    w6(Object obj, fuX fux, j.w6 w6Var, Throwable th) {
        super(obj, fux, w6Var, th, true);
    }

    @Override // Pj0.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f7750n) {
                    return;
                }
                Object objJ2 = this.f7751t.J2();
                Dzy.j.ViF("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f7751t)), objJ2 == null ? null : objJ2.getClass().getName());
                this.f7751t.nr();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // Pj0.j
    /* JADX INFO: renamed from: rl */
    public j clone() {
        return this;
    }
}
