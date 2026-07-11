package xfE;

import java.io.IOException;
import lN.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class o implements lN.n {
    private static int gh;
    private static o mUb;
    private static final Object xMQ = new Object();
    private IOException J2;
    private o KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f75399O;
    private w6.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private lN.Ml f75400n;
    private long nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f75401t;

    private void t() {
        this.f75400n = null;
        this.rl = null;
        this.f75401t = 0L;
        this.nr = 0L;
        this.f75399O = 0L;
        this.J2 = null;
        this.Uo = null;
    }

    public static o n() {
        synchronized (xMQ) {
            try {
                o oVar = mUb;
                if (oVar == null) {
                    return new o();
                }
                mUb = oVar.KN;
                oVar.KN = null;
                gh--;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o J2(long j2) {
        this.f75399O = j2;
        return this;
    }

    public o KN(IOException iOException) {
        this.J2 = iOException;
        return this;
    }

    public o O(long j2) {
        this.nr = j2;
        return this;
    }

    public o Uo(w6.j jVar) {
        this.Uo = jVar;
        return this;
    }

    public o mUb(String str) {
        this.rl = str;
        return this;
    }

    public o nr(lN.Ml ml) {
        this.f75400n = ml;
        return this;
    }

    public void rl() {
        synchronized (xMQ) {
            try {
                if (gh < 5) {
                    t();
                    gh++;
                    o oVar = mUb;
                    if (oVar != null) {
                        this.KN = oVar;
                    }
                    mUb = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o xMQ(long j2) {
        this.f75401t = j2;
        return this;
    }

    private o() {
    }
}
