package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class h6y {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h6y f68609t = new h6y(new JP.iwV[0]);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.iwV[] f68610n;
    private final AtomicBoolean rl = new AtomicBoolean(false);

    public static h6y KN(io.grpc.w6[] w6VarArr, io.grpc.j jVar, io.grpc.QJ qj) {
        h6y h6yVar = new h6y(w6VarArr);
        for (io.grpc.w6 w6Var : w6VarArr) {
            w6Var.ty(jVar, qj);
        }
        return h6yVar;
    }

    public void J2(long j2) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.t(j2);
        }
    }

    public void O(int i2, long j2, long j3) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.rl(i2, j2, j3);
        }
    }

    public void Uo(long j2) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.nr(j2);
        }
    }

    public void az(io.grpc.SPz sPz) {
        if (this.rl.compareAndSet(false, true)) {
            for (JP.iwV iwv : this.f68610n) {
                iwv.xMQ(sPz);
            }
        }
    }

    public void gh(long j2) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.Uo(j2);
        }
    }

    public void mUb(int i2, long j2, long j3) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.J2(i2, j2, j3);
        }
    }

    public void n() {
        for (JP.iwV iwv : this.f68610n) {
            ((io.grpc.w6) iwv).gh();
        }
    }

    public void nr(int i2) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.n(i2);
        }
    }

    public void qie(long j2) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.KN(j2);
        }
    }

    public void rl(io.grpc.QJ qj) {
        for (JP.iwV iwv : this.f68610n) {
            ((io.grpc.w6) iwv).qie(qj);
        }
    }

    public void t() {
        for (JP.iwV iwv : this.f68610n) {
            ((io.grpc.w6) iwv).az();
        }
    }

    public void xMQ(int i2) {
        for (JP.iwV iwv : this.f68610n) {
            iwv.O(i2);
        }
    }

    h6y(JP.iwV[] iwvArr) {
        this.f68610n = iwvArr;
    }
}
