package io.grpc.internal;

import ScC.FuwU.XIvb;
import io.grpc.Pl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class pq extends io.grpc.Pl {
    private Pl.Dsr KN;
    private final Pl.I28 Uo;
    private JP.qz xMQ = JP.qz.IDLE;

    private final class I28 extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Dsr f68679n;
        private final AtomicBoolean rl = new AtomicBoolean(false);

        class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                I28.this.f68679n.J2();
            }
        }

        I28(Pl.Dsr dsr) {
            this.f68679n = (Pl.Dsr) t1.Xo.ck(dsr, "subchannel");
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            if (this.rl.compareAndSet(false, true)) {
                pq.this.Uo.nr().execute(new j());
            }
            return Pl.Wre.Uo();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private static final class Ml extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Wre f68682n;

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return this.f68682n;
        }

        public String toString() {
            return t1.Dsr.rl(Ml.class).nr("result", this.f68682n).toString();
        }

        Ml(Pl.Wre wre) {
            this.f68682n = (Pl.Wre) t1.Xo.ck(wre, XIvb.iCtt);
        }
    }

    class j implements Pl.C {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl.Dsr f68683n;

        j(Pl.Dsr dsr) {
            this.f68683n = dsr;
        }

        @Override // io.grpc.Pl.C
        public void n(JP.Pl pl) {
            pq.this.xMQ(this.f68683n, pl);
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Boolean f68685n;
        final Long rl;

        public w6(Boolean bool) {
            this(bool, null);
        }

        w6(Boolean bool, Long l2) {
            this.f68685n = bool;
            this.rl = l2;
        }
    }

    static /* synthetic */ class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68684n;

        static {
            int[] iArr = new int[JP.qz.values().length];
            f68684n = iArr;
            try {
                iArr[JP.qz.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68684n[JP.qz.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68684n[JP.qz.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68684n[JP.qz.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void mUb(JP.qz qzVar, Pl.aC aCVar) {
        this.xMQ = qzVar;
        this.Uo.J2(qzVar, aCVar);
    }

    @Override // io.grpc.Pl
    public void J2() {
        Pl.Dsr dsr = this.KN;
        if (dsr != null) {
            dsr.Uo();
        }
    }

    @Override // io.grpc.Pl
    public void O() {
        Pl.Dsr dsr = this.KN;
        if (dsr != null) {
            dsr.J2();
        }
    }

    @Override // io.grpc.Pl
    public void t(io.grpc.SPz sPz) {
        Pl.Dsr dsr = this.KN;
        if (dsr != null) {
            dsr.Uo();
            this.KN = null;
        }
        mUb(JP.qz.TRANSIENT_FAILURE, new Ml(Pl.Wre.J2(sPz)));
    }

    pq(Pl.I28 i28) {
        this.Uo = (Pl.I28) t1.Xo.ck(i28, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xMQ(Pl.Dsr dsr, JP.Pl pl) {
        Pl.aC i28;
        Pl.aC ml;
        JP.qz qzVarT = pl.t();
        if (qzVarT != JP.qz.SHUTDOWN) {
            JP.qz qzVar = JP.qz.TRANSIENT_FAILURE;
            if (qzVarT == qzVar || qzVarT == JP.qz.IDLE) {
                this.Uo.O();
            }
            if (this.xMQ == qzVar) {
                if (qzVarT == JP.qz.CONNECTING) {
                    return;
                }
                if (qzVarT == JP.qz.IDLE) {
                    O();
                    return;
                }
            }
            int i2 = n.f68684n[qzVarT.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            ml = new Ml(Pl.Wre.J2(pl.nr()));
                        } else {
                            throw new IllegalArgumentException("Unsupported state:" + qzVarT);
                        }
                    } else {
                        i28 = new Ml(Pl.Wre.KN(dsr));
                    }
                } else {
                    ml = new Ml(Pl.Wre.Uo());
                }
                mUb(qzVarT, ml);
            }
            i28 = new I28(dsr);
            ml = i28;
            mUb(qzVarT, ml);
        }
    }

    @Override // io.grpc.Pl
    public io.grpc.SPz n(Pl.fuX fux) {
        w6 w6Var;
        Boolean bool;
        Random random;
        List listN = fux.n();
        if (listN.isEmpty()) {
            io.grpc.SPz sPzIk = io.grpc.SPz.f68186Z.Ik("NameResolver returned no usable address. addrs=" + fux.n() + ", attrs=" + fux.rl());
            t(sPzIk);
            return sPzIk;
        }
        if ((fux.t() instanceof w6) && (bool = (w6Var = (w6) fux.t()).f68685n) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listN);
            if (w6Var.rl != null) {
                random = new Random(w6Var.rl.longValue());
            } else {
                random = new Random();
            }
            Collections.shuffle(arrayList, random);
            listN = arrayList;
        }
        Pl.Dsr dsr = this.KN;
        if (dsr == null) {
            Pl.Dsr dsrN = this.Uo.n(Pl.n.nr().O(listN).t());
            dsrN.KN(new j(dsrN));
            this.KN = dsrN;
            mUb(JP.qz.CONNECTING, new Ml(Pl.Wre.KN(dsrN)));
            dsrN.J2();
        } else {
            dsr.xMQ(listN);
        }
        return io.grpc.SPz.f68184O;
    }
}
