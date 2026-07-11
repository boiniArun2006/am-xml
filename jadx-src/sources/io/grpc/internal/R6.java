package io.grpc.internal;

import JP.M;
import io.grpc.Pl;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class R6 extends io.grpc.Pl {
    private static final Logger ck = Logger.getLogger(R6.class.getName());
    private final boolean HI;
    private final Pl.I28 Uo;
    private JP.qz az;
    private M.Ml qie;
    private JP.qz ty;
    private Ml xMQ;
    private final Map KN = new HashMap();
    private int mUb = 0;
    private boolean gh = true;

    private static final class CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Dsr f68364n;
        private boolean nr = false;
        private JP.qz rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final w6 f68365t;

        /* JADX INFO: Access modifiers changed from: private */
        public JP.qz J2() {
            return this.f68365t.f68373n.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mUb(JP.qz qzVar) {
            this.rl = qzVar;
            if (qzVar == JP.qz.READY || qzVar == JP.qz.TRANSIENT_FAILURE) {
                this.nr = true;
            } else if (qzVar == JP.qz.IDLE) {
                this.nr = false;
            }
        }

        public Pl.Dsr KN() {
            return this.f68364n;
        }

        public JP.qz Uo() {
            return this.rl;
        }

        public boolean xMQ() {
            return this.nr;
        }

        public CN3(Pl.Dsr dsr, JP.qz qzVar, w6 w6Var) {
            this.f68364n = dsr;
            this.rl = qzVar;
            this.f68365t = w6Var;
        }
    }

    private static final class I28 extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Wre f68366n;

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return this.f68366n;
        }

        public String toString() {
            return t1.Dsr.rl(I28.class).nr("result", this.f68366n).toString();
        }

        I28(Pl.Wre wre) {
            this.f68366n = (Pl.Wre) t1.Xo.ck(wre, "result");
        }
    }

    static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f68367n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f68368t;

        public boolean O(SocketAddress socketAddress) {
            for (int i2 = 0; i2 < this.f68367n.size(); i2++) {
                int iIndexOf = ((io.grpc.I28) this.f68367n.get(i2)).n().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.rl = i2;
                    this.f68368t = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void nr() {
            this.rl = 0;
            this.f68368t = 0;
        }

        public int J2() {
            List list = this.f68367n;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void Uo(com.google.common.collect.nKK nkk) {
            List list = nkk;
            if (nkk == null) {
                list = Collections.EMPTY_LIST;
            }
            this.f68367n = list;
            nr();
        }

        public boolean t() {
            return this.rl < this.f68367n.size();
        }

        public Ml(List list) {
            this.f68367n = list == null ? Collections.EMPTY_LIST : list;
        }

        public SocketAddress n() {
            if (t()) {
                return (SocketAddress) ((io.grpc.I28) this.f68367n.get(this.rl)).n().get(this.f68368t);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public boolean rl() {
            if (!t()) {
                return false;
            }
            io.grpc.I28 i28 = (io.grpc.I28) this.f68367n.get(this.rl);
            int i2 = this.f68368t + 1;
            this.f68368t = i2;
            if (i2 < i28.n().size()) {
                return true;
            }
            int i3 = this.rl + 1;
            this.rl = i3;
            this.f68368t = 0;
            if (i3 >= this.f68367n.size()) {
                return false;
            }
            return true;
        }
    }

    private final class Wre extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final R6 f68369n;
        private final AtomicBoolean rl = new AtomicBoolean(false);

        Wre(R6 r6) {
            this.f68369n = (R6) t1.Xo.ck(r6, "pickFirstLeafLoadBalancer");
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            if (this.rl.compareAndSet(false, true)) {
                JP.M mNr = R6.this.Uo.nr();
                final R6 r6 = this.f68369n;
                Objects.requireNonNull(r6);
                mNr.execute(new Runnable() { // from class: io.grpc.internal.RzR
                    @Override // java.lang.Runnable
                    public final void run() {
                        r6.O();
                    }
                });
            }
            return Pl.Wre.Uo();
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            R6.this.qie = null;
            if (R6.this.xMQ.rl()) {
                R6.this.O();
            }
        }
    }

    private final class w6 implements Pl.C {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private JP.Pl f68373n;
        private CN3 rl;

        private w6() {
            this.f68373n = JP.Pl.n(JP.qz.IDLE);
        }

        /* synthetic */ w6(R6 r6, j jVar) {
            this();
        }

        @Override // io.grpc.Pl.C
        public void n(JP.Pl pl) {
            R6.ck.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{pl, this.rl.f68364n});
            this.f68373n = pl;
            if (R6.this.xMQ.t() && ((CN3) R6.this.KN.get(R6.this.xMQ.n())).f68365t == this) {
                R6.this.S(this.rl);
            }
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68371n;

        static {
            int[] iArr = new int[JP.qz.values().length];
            f68371n = iArr;
            try {
                iArr[JP.qz.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68371n[JP.qz.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68371n[JP.qz.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68371n[JP.qz.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68371n[JP.qz.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private Pl.Dsr HI(SocketAddress socketAddress) {
        w6 w6Var = new w6(this, null);
        final Pl.Dsr dsrN = this.Uo.n(Pl.n.nr().O(com.google.common.collect.rv6.mUb(new io.grpc.I28(socketAddress))).rl(io.grpc.Pl.f68162t, w6Var).t());
        if (dsrN == null) {
            ck.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        CN3 cn3 = new CN3(dsrN, JP.qz.IDLE, w6Var);
        w6Var.rl = cn3;
        this.KN.put(socketAddress, cn3);
        if (dsrN.t().rl(io.grpc.Pl.nr) == null) {
            w6Var.f68373n = JP.Pl.n(JP.qz.READY);
        }
        dsrN.KN(new Pl.C() { // from class: io.grpc.internal.Fl
            @Override // io.grpc.Pl.C
            public final void n(JP.Pl pl) {
                this.f68271n.r(dsrN, pl);
            }
        });
        return dsrN;
    }

    private boolean Ik() {
        Ml ml = this.xMQ;
        if (ml == null || ml.t() || this.KN.size() < this.xMQ.J2()) {
            return false;
        }
        Iterator it = this.KN.values().iterator();
        while (it.hasNext()) {
            if (!((CN3) it.next()).xMQ()) {
                return false;
            }
        }
        return true;
    }

    private void XQ(JP.qz qzVar, Pl.aC aCVar) {
        if (qzVar == this.ty && (qzVar == JP.qz.IDLE || qzVar == JP.qz.CONNECTING)) {
            return;
        }
        this.ty = qzVar;
        this.Uo.J2(qzVar, aCVar);
    }

    private void o() {
        if (this.HI) {
            M.Ml ml = this.qie;
            if (ml == null || !ml.rl()) {
                this.qie = this.Uo.nr().t(new n(), 250L, TimeUnit.MILLISECONDS, this.Uo.t());
            }
        }
    }

    private void ty() {
        M.Ml ml = this.qie;
        if (ml != null) {
            ml.n();
            this.qie = null;
        }
    }

    @Override // io.grpc.Pl
    public void J2() {
        ck.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.KN.size()));
        JP.qz qzVar = JP.qz.SHUTDOWN;
        this.az = qzVar;
        this.ty = qzVar;
        ty();
        Iterator it = this.KN.values().iterator();
        while (it.hasNext()) {
            ((CN3) it.next()).KN().Uo();
        }
        this.KN.clear();
    }

    @Override // io.grpc.Pl
    public void O() {
        Ml ml = this.xMQ;
        if (ml == null || !ml.t() || this.az == JP.qz.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressN = this.xMQ.n();
        Pl.Dsr dsrKN = this.KN.containsKey(socketAddressN) ? ((CN3) this.KN.get(socketAddressN)).KN() : HI(socketAddressN);
        int i2 = j.f68371n[((CN3) this.KN.get(socketAddressN)).Uo().ordinal()];
        if (i2 == 1) {
            dsrKN.J2();
            ((CN3) this.KN.get(socketAddressN)).mUb(JP.qz.CONNECTING);
            o();
        } else {
            if (i2 == 2) {
                if (this.HI) {
                    o();
                    return;
                } else {
                    dsrKN.J2();
                    return;
                }
            }
            if (i2 == 3) {
                ck.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i2 != 4) {
                    return;
                }
                this.xMQ.rl();
                O();
            }
        }
    }

    @Override // io.grpc.Pl
    public io.grpc.SPz n(Pl.fuX fux) {
        JP.qz qzVar;
        if (this.az == JP.qz.SHUTDOWN) {
            return io.grpc.SPz.HI.Ik("Already shut down");
        }
        List listN = fux.n();
        if (listN.isEmpty()) {
            io.grpc.SPz sPzIk = io.grpc.SPz.f68186Z.Ik("NameResolver returned no usable address. addrs=" + fux.n() + ", attrs=" + fux.rl());
            t(sPzIk);
            return sPzIk;
        }
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            if (((io.grpc.I28) it.next()) == null) {
                io.grpc.SPz sPzIk2 = io.grpc.SPz.f68186Z.Ik("NameResolver returned address list with null endpoint. addrs=" + fux.n() + ", attrs=" + fux.rl());
                t(sPzIk2);
                return sPzIk2;
            }
        }
        this.gh = true;
        fux.t();
        com.google.common.collect.nKK nkkGh = com.google.common.collect.nKK.gh().mUb(listN).gh();
        Ml ml = this.xMQ;
        if (ml == null) {
            this.xMQ = new Ml(nkkGh);
        } else if (this.az == JP.qz.READY) {
            SocketAddress socketAddressN = ml.n();
            this.xMQ.Uo(nkkGh);
            if (this.xMQ.O(socketAddressN)) {
                return io.grpc.SPz.f68184O;
            }
            this.xMQ.nr();
        } else {
            ml.Uo(nkkGh);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.KN.keySet());
        HashSet hashSet2 = new HashSet();
        com.google.common.collect.xZD it2 = nkkGh.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(((io.grpc.I28) it2.next()).n());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((CN3) this.KN.remove(socketAddress)).KN().Uo();
            }
        }
        if (hashSet.size() == 0 || (qzVar = this.az) == JP.qz.CONNECTING || qzVar == JP.qz.READY) {
            JP.qz qzVar2 = JP.qz.CONNECTING;
            this.az = qzVar2;
            XQ(qzVar2, new I28(Pl.Wre.Uo()));
            ty();
            O();
        } else {
            JP.qz qzVar3 = JP.qz.IDLE;
            if (qzVar == qzVar3) {
                XQ(qzVar3, new Wre(this));
            } else if (qzVar == JP.qz.TRANSIENT_FAILURE) {
                ty();
                O();
            }
        }
        return io.grpc.SPz.f68184O;
    }

    @Override // io.grpc.Pl
    public void t(io.grpc.SPz sPz) {
        Iterator it = this.KN.values().iterator();
        while (it.hasNext()) {
            ((CN3) it.next()).KN().Uo();
        }
        this.KN.clear();
        XQ(JP.qz.TRANSIENT_FAILURE, new I28(Pl.Wre.J2(sPz)));
    }

    R6(Pl.I28 i28) {
        JP.qz qzVar = JP.qz.IDLE;
        this.az = qzVar;
        this.ty = qzVar;
        this.HI = psW.Uo("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", false);
        this.Uo = (Pl.I28) t1.Xo.ck(i28, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(CN3 cn3) {
        JP.qz qzVar = cn3.rl;
        JP.qz qzVar2 = JP.qz.READY;
        if (qzVar == qzVar2) {
            if (cn3.J2() != qzVar2) {
                JP.qz qzVarJ2 = cn3.J2();
                JP.qz qzVar3 = JP.qz.TRANSIENT_FAILURE;
                if (qzVarJ2 == qzVar3) {
                    XQ(qzVar3, new I28(Pl.Wre.J2(cn3.f68365t.f68373n.nr())));
                    return;
                } else {
                    if (this.ty != qzVar3) {
                        XQ(cn3.J2(), new I28(Pl.Wre.Uo()));
                        return;
                    }
                    return;
                }
            }
            XQ(qzVar2, new Pl.Ml(Pl.Wre.KN(cn3.f68364n)));
        }
    }

    private void Z(CN3 cn3) {
        ty();
        for (CN3 cn32 : this.KN.values()) {
            if (!cn32.KN().equals(cn3.f68364n)) {
                cn32.KN().Uo();
            }
        }
        this.KN.clear();
        cn3.mUb(JP.qz.READY);
        this.KN.put(ck(cn3.f68364n), cn3);
    }

    private SocketAddress ck(Pl.Dsr dsr) {
        return (SocketAddress) dsr.n().n().get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Pl.Dsr dsr, JP.Pl pl) {
        JP.qz qzVarT = pl.t();
        CN3 cn3 = (CN3) this.KN.get(ck(dsr));
        if (cn3 != null && cn3.KN() == dsr && qzVarT != JP.qz.SHUTDOWN) {
            JP.qz qzVar = JP.qz.IDLE;
            if (qzVarT == qzVar) {
                this.Uo.O();
            }
            cn3.mUb(qzVarT);
            JP.qz qzVar2 = this.az;
            JP.qz qzVar3 = JP.qz.TRANSIENT_FAILURE;
            if (qzVar2 == qzVar3 || this.ty == qzVar3) {
                if (qzVarT != JP.qz.CONNECTING) {
                    if (qzVarT == qzVar) {
                        O();
                        return;
                    }
                } else {
                    return;
                }
            }
            int i2 = j.f68371n[qzVarT.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (this.xMQ.t() && ((CN3) this.KN.get(this.xMQ.n())).KN() == dsr && this.xMQ.rl()) {
                                ty();
                                O();
                            }
                            if (Ik()) {
                                this.az = qzVar3;
                                XQ(qzVar3, new I28(Pl.Wre.J2(pl.nr())));
                                int i3 = this.mUb + 1;
                                this.mUb = i3;
                                if (i3 >= this.xMQ.J2() || this.gh) {
                                    this.gh = false;
                                    this.mUb = 0;
                                    this.Uo.O();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported state:" + qzVarT);
                    }
                    Z(cn3);
                    this.xMQ.O(ck(dsr));
                    this.az = JP.qz.READY;
                    S(cn3);
                    return;
                }
                JP.qz qzVar4 = JP.qz.CONNECTING;
                this.az = qzVar4;
                XQ(qzVar4, new I28(Pl.Wre.Uo()));
                return;
            }
            this.xMQ.nr();
            this.az = qzVar;
            XQ(qzVar, new Wre(this));
        }
    }
}
