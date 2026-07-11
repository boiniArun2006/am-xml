package uB;

import JP.DAz;
import sL.AbstractC2361j;
import sL.AbstractC2362n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile DAz f74238n;
    private static volatile DAz rl;

    class j implements AbstractC2362n.j {
        @Override // sL.AbstractC2362n.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public n n(JP.n nVar, io.grpc.n nVar2) {
            return new n(nVar, nVar2, null);
        }

        j() {
        }
    }

    public static final class n extends AbstractC2361j {
        /* synthetic */ n(JP.n nVar, io.grpc.n nVar2, j jVar) {
            this(nVar, nVar2);
        }

        private n(JP.n nVar, io.grpc.n nVar2) {
            super(nVar, nVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // sL.AbstractC2362n
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public n n(JP.n nVar, io.grpc.n nVar2) {
            return new n(nVar, nVar2);
        }
    }

    public static DAz n() {
        DAz dAzN;
        DAz dAz = rl;
        if (dAz != null) {
            return dAz;
        }
        synchronized (qz.class) {
            try {
                dAzN = rl;
                if (dAzN == null) {
                    dAzN = DAz.Uo().J2(DAz.Ml.BIDI_STREAMING).rl(DAz.rl("google.firestore.v1.Firestore", "Listen")).O(true).t(QMK.n.rl(Pl.az())).nr(QMK.n.rl(Xo.xMQ())).n();
                    rl = dAzN;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dAzN;
    }

    public static DAz rl() {
        DAz dAzN;
        DAz dAz = f74238n;
        if (dAz != null) {
            return dAz;
        }
        synchronized (qz.class) {
            try {
                dAzN = f74238n;
                if (dAzN == null) {
                    dAzN = DAz.Uo().J2(DAz.Ml.BIDI_STREAMING).rl(DAz.rl("google.firestore.v1.Firestore", "Write")).O(true).t(QMK.n.rl(Q.ty())).nr(QMK.n.rl(r.mUb())).n();
                    f74238n = dAzN;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dAzN;
    }

    public static n t(JP.n nVar) {
        return (n) AbstractC2361j.O(new j(), nVar);
    }
}
