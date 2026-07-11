package Pj0;

import Hh.C;
import Pj0.j;
import com.facebook.common.references.SharedReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class n extends j {
    private n(SharedReference sharedReference, j.w6 w6Var, Throwable th) {
        super(sharedReference, w6Var, th);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f7750n) {
                    super.finalize();
                    return;
                }
                Object objJ2 = this.f7751t.J2();
                Dzy.j.ViF("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f7751t)), objJ2 == null ? null : objJ2.getClass().getName());
                j.w6 w6Var = this.f7749O;
                if (w6Var != null) {
                    w6Var.n(this.f7751t, this.J2);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    n(Object obj, fuX fux, j.w6 w6Var, Throwable th) {
        super(obj, fux, w6Var, th, true);
    }

    @Override // Pj0.j
    /* JADX INFO: renamed from: rl */
    public j clone() {
        Throwable th;
        C.xMQ(isValid());
        SharedReference sharedReference = this.f7751t;
        j.w6 w6Var = this.f7749O;
        if (this.J2 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new n(sharedReference, w6Var, th);
    }
}
