package pL6;

import JP.M;
import JP.Ml;
import JP.qz;
import com.google.common.collect.nKK;
import com.google.common.collect.r;
import io.grpc.Pl;
import io.grpc.QJ;
import io.grpc.SPz;
import io.grpc.internal.Pmq;
import io.grpc.internal.T;
import io.grpc.j;
import io.grpc.w6;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX extends Pl {
    private static final j.w6 ck = j.w6.n("addressTrackerKey");
    private final JP.Ml HI;
    private final M KN;
    final w6 Uo;
    private M.Ml az;
    private Pmq gh;
    private final pL6.I28 mUb;
    private final ScheduledExecutorService qie;
    private Long ty;
    private final Pl.I28 xMQ;

    static class C implements aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CN3 f71853n;
        private final JP.Ml rl;

        @Override // pL6.fuX.aC
        public void n(w6 w6Var, long j2) {
            List<n> listTy = fuX.ty(w6Var, this.f71853n.f71854O.nr.intValue());
            if (listTy.size() < this.f71853n.f71854O.f71865t.intValue() || listTy.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listTy.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((n) it.next()).ty()));
            }
            double dT = t(arrayList);
            double dNr = nr(arrayList, dT);
            double dIntValue = dT - (((double) (this.f71853n.f71854O.f71864n.intValue() / 1000.0f)) * dNr);
            for (n nVar : listTy) {
                if (w6Var.J2() >= this.f71853n.nr.intValue()) {
                    return;
                }
                if (nVar.ty() < dIntValue) {
                    this.rl.rl(Ml.j.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", nVar, Double.valueOf(nVar.ty()), Double.valueOf(dT), Double.valueOf(dNr), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.f71853n.f71854O.rl.intValue()) {
                        nVar.nr(j2);
                    }
                }
            }
        }

        C(CN3 cn3, JP.Ml ml) {
            boolean z2;
            if (cn3.f71854O != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Xo.O(z2, "success rate ejection config is null");
            this.f71853n = cn3;
            this.rl = ml;
        }

        static double nr(Collection collection, double d2) {
            Iterator it = collection.iterator();
            double d4 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = ((Double) it.next()).doubleValue() - d2;
                d4 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d4 / ((double) collection.size()));
        }

        static double t(Collection collection) {
            Iterator it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }
    }

    public static final class CN3 {
        public final n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final w6 f71854O;
        public final T.n Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Long f71855n;
        public final Integer nr;
        public final Long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Long f71856t;

        public static class j {
            n J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            w6 f71857O;
            T.n Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Long f71858n = 10000000000L;
            Long rl = 30000000000L;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Long f71859t = 300000000000L;
            Integer nr = 10;

            public j J2(Integer num) {
                Xo.nr(num != null);
                this.nr = num;
                return this;
            }

            public j KN(w6 w6Var) {
                this.f71857O = w6Var;
                return this;
            }

            public j O(Long l2) {
                Xo.nr(l2 != null);
                this.f71858n = l2;
                return this;
            }

            public j Uo(Long l2) {
                Xo.nr(l2 != null);
                this.f71859t = l2;
                return this;
            }

            public CN3 n() {
                Xo.XQ(this.Uo != null);
                return new CN3(this.f71858n, this.rl, this.f71859t, this.nr, this.f71857O, this.J2, this.Uo);
            }

            public j nr(n nVar) {
                this.J2 = nVar;
                return this;
            }

            public j rl(Long l2) {
                Xo.nr(l2 != null);
                this.rl = l2;
                return this;
            }

            public j t(T.n nVar) {
                Xo.XQ(nVar != null);
                this.Uo = nVar;
                return this;
            }
        }

        public static class n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final Integer f71860n;
            public final Integer nr;
            public final Integer rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final Integer f71861t;

            public static class j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Integer f71862n = 85;
                Integer rl = 100;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Integer f71863t = 5;
                Integer nr = 50;

                public j O(Integer num) {
                    boolean z2 = false;
                    Xo.nr(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z2 = true;
                    }
                    Xo.nr(z2);
                    this.f71862n = num;
                    return this;
                }

                public j nr(Integer num) {
                    Xo.nr(num != null);
                    Xo.nr(num.intValue() >= 0);
                    this.nr = num;
                    return this;
                }

                public j rl(Integer num) {
                    boolean z2 = false;
                    Xo.nr(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z2 = true;
                    }
                    Xo.nr(z2);
                    this.rl = num;
                    return this;
                }

                public j t(Integer num) {
                    Xo.nr(num != null);
                    Xo.nr(num.intValue() >= 0);
                    this.f71863t = num;
                    return this;
                }

                public n n() {
                    return new n(this.f71862n, this.rl, this.f71863t, this.nr);
                }
            }

            n(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f71860n = num;
                this.rl = num2;
                this.f71861t = num3;
                this.nr = num4;
            }
        }

        public static class w6 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final Integer f71864n;
            public final Integer nr;
            public final Integer rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final Integer f71865t;

            public static final class j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Integer f71866n = 1900;
                Integer rl = 100;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Integer f71867t = 5;
                Integer nr = 100;

                public j nr(Integer num) {
                    Xo.nr(num != null);
                    Xo.nr(num.intValue() >= 0);
                    this.nr = num;
                    return this;
                }

                public j rl(Integer num) {
                    boolean z2 = false;
                    Xo.nr(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z2 = true;
                    }
                    Xo.nr(z2);
                    this.rl = num;
                    return this;
                }

                public j t(Integer num) {
                    Xo.nr(num != null);
                    Xo.nr(num.intValue() >= 0);
                    this.f71867t = num;
                    return this;
                }

                public j O(Integer num) {
                    Xo.nr(num != null);
                    this.f71866n = num;
                    return this;
                }

                public w6 n() {
                    return new w6(this.f71866n, this.rl, this.f71867t, this.nr);
                }
            }

            w6(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f71864n = num;
                this.rl = num2;
                this.f71865t = num3;
                this.nr = num4;
            }
        }

        private CN3(Long l2, Long l5, Long l6, Integer num, w6 w6Var, n nVar, T.n nVar2) {
            this.f71855n = l2;
            this.rl = l5;
            this.f71856t = l6;
            this.nr = num;
            this.f71854O = w6Var;
            this.J2 = nVar;
            this.Uo = nVar2;
        }

        boolean n() {
            return (this.f71854O == null && this.J2 == null) ? false : true;
        }
    }

    class Dsr extends pL6.Ml {
        private final JP.Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Pl.C f71868O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Dsr f71869n;
        private JP.Pl nr;
        private n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f71870t;

        class j implements Pl.C {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Pl.C f71871n;

            j(Pl.C c2) {
                this.f71871n = c2;
            }

            @Override // io.grpc.Pl.C
            public void n(JP.Pl pl) {
                Dsr.this.nr = pl;
                if (Dsr.this.f71870t) {
                    return;
                }
                this.f71871n.n(pl);
            }
        }

        void Ik() {
            this.f71870t = false;
            JP.Pl pl = this.nr;
            if (pl != null) {
                this.f71868O.n(pl);
                this.J2.rl(Ml.j.INFO, "Subchannel unejected: {0}", this);
            }
        }

        void az() {
            this.rl = null;
        }

        void ty() {
            this.f71870t = true;
            this.f71868O.n(JP.Pl.rl(SPz.f68186Z));
            this.J2.rl(Ml.j.INFO, "Subchannel ejected: {0}", this);
        }

        Dsr(Pl.n nVar, Pl.I28 i28) {
            Pl.n.C0970n c0970n = Pl.f68162t;
            Pl.C c2 = (Pl.C) nVar.t(c0970n);
            if (c2 != null) {
                this.f71868O = c2;
                this.f71869n = i28.n(nVar.O().rl(c0970n, new j(c2)).t());
            } else {
                this.f71869n = i28.n(nVar);
            }
            this.J2 = this.f71869n.nr();
        }

        boolean HI() {
            return this.f71870t;
        }

        @Override // pL6.Ml, io.grpc.Pl.Dsr
        public void KN(Pl.C c2) {
            if (this.f71868O != null) {
                super.KN(c2);
            } else {
                this.f71868O = c2;
                super.KN(new j(c2));
            }
        }

        @Override // pL6.Ml, io.grpc.Pl.Dsr
        public void Uo() {
            n nVar = this.rl;
            if (nVar != null) {
                nVar.xMQ(this);
            }
            super.Uo();
        }

        void ck(n nVar) {
            this.rl = nVar;
        }

        @Override // pL6.Ml
        protected Pl.Dsr mUb() {
            return this.f71869n;
        }

        @Override // pL6.Ml, io.grpc.Pl.Dsr
        public io.grpc.j t() {
            return this.rl != null ? this.f71869n.t().nr().nr(fuX.ck, this.rl).n() : this.f71869n.t();
        }

        @Override // pL6.Ml
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f71869n.rl() + '}';
        }

        @Override // pL6.Ml, io.grpc.Pl.Dsr
        public void xMQ(List list) {
            if (fuX.az(rl()) && fuX.az(list)) {
                if (fuX.this.Uo.containsValue(this.rl)) {
                    this.rl.xMQ(this);
                }
                SocketAddress socketAddress = (SocketAddress) ((io.grpc.I28) list.get(0)).n().get(0);
                if (fuX.this.Uo.containsKey(socketAddress)) {
                    ((n) fuX.this.Uo.get(socketAddress)).rl(this);
                }
            } else if (fuX.az(rl()) && !fuX.az(list)) {
                if (fuX.this.Uo.containsKey(n().n().get(0))) {
                    n nVar = (n) fuX.this.Uo.get(n().n().get(0));
                    nVar.xMQ(this);
                    nVar.mUb();
                }
            } else if (!fuX.az(rl()) && fuX.az(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((io.grpc.I28) list.get(0)).n().get(0);
                if (fuX.this.Uo.containsKey(socketAddress2)) {
                    ((n) fuX.this.Uo.get(socketAddress2)).rl(this);
                }
            }
            this.f71869n.xMQ(list);
        }
    }

    class I28 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CN3 f71873n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        JP.Ml f71874t;

        I28(CN3 cn3, JP.Ml ml) {
            this.f71873n = cn3;
            this.f71874t = ml;
        }

        @Override // java.lang.Runnable
        public void run() {
            fuX fux = fuX.this;
            fux.ty = Long.valueOf(fux.gh.n());
            fuX.this.Uo.mUb();
            for (aC aCVar : aC.rl(this.f71873n, this.f71874t)) {
                fuX fux2 = fuX.this;
                aCVar.n(fux2.Uo, fux2.ty.longValue());
            }
            fuX fux3 = fuX.this;
            fux3.Uo.Uo(fux3.ty);
        }
    }

    class Ml extends pL6.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Pl.I28 f71875n;

        Ml(Pl.I28 i28) {
            this.f71875n = new pL6.Wre(i28);
        }

        @Override // pL6.w6, io.grpc.Pl.I28
        public void J2(qz qzVar, Pl.aC aCVar) {
            this.f71875n.J2(qzVar, fuX.this.new C1100fuX(aCVar));
        }

        @Override // pL6.w6
        protected Pl.I28 Uo() {
            return this.f71875n;
        }

        @Override // pL6.w6, io.grpc.Pl.I28
        public Pl.Dsr n(Pl.n nVar) {
            Dsr dsr = fuX.this.new Dsr(nVar, this.f71875n);
            List listN = nVar.n();
            if (fuX.az(listN) && fuX.this.Uo.containsKey(((io.grpc.I28) listN.get(0)).n().get(0))) {
                n nVar2 = (n) fuX.this.Uo.get(((io.grpc.I28) listN.get(0)).n().get(0));
                nVar2.rl(dsr);
                if (nVar2.nr != null) {
                    dsr.ty();
                }
            }
            return dsr;
        }
    }

    static class Wre implements aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CN3 f71876n;
        private final JP.Ml rl;

        @Override // pL6.fuX.aC
        public void n(w6 w6Var, long j2) {
            List<n> listTy = fuX.ty(w6Var, this.f71876n.J2.nr.intValue());
            if (listTy.size() < this.f71876n.J2.f71861t.intValue() || listTy.size() == 0) {
                return;
            }
            for (n nVar : listTy) {
                if (w6Var.J2() >= this.f71876n.nr.intValue()) {
                    return;
                }
                if (nVar.J2() >= this.f71876n.J2.nr.intValue()) {
                    if (nVar.O() > ((double) this.f71876n.J2.f71860n.intValue()) / 100.0d) {
                        this.rl.rl(Ml.j.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", nVar, Double.valueOf(nVar.O()));
                        if (new Random().nextInt(100) < this.f71876n.J2.rl.intValue()) {
                            nVar.nr(j2);
                        }
                    }
                }
            }
        }

        Wre(CN3 cn3, JP.Ml ml) {
            this.f71876n = cn3;
            this.rl = ml;
        }
    }

    /* JADX INFO: renamed from: pL6.fuX$fuX, reason: collision with other inner class name */
    class C1100fuX extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.aC f71877n;

        /* JADX INFO: renamed from: pL6.fuX$fuX$j */
        class j extends w6.j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final n f71878n;
            private final w6.j rl;

            /* JADX INFO: renamed from: pL6.fuX$fuX$j$j, reason: collision with other inner class name */
            class C1101j extends pL6.j {
                final /* synthetic */ io.grpc.w6 rl;

                C1101j(io.grpc.w6 w6Var) {
                    this.rl = w6Var;
                }

                @Override // pL6.j
                protected io.grpc.w6 HI() {
                    return this.rl;
                }

                @Override // JP.iwV
                public void xMQ(SPz sPz) {
                    j.this.f71878n.Uo(sPz.HI());
                    HI().xMQ(sPz);
                }
            }

            /* JADX INFO: renamed from: pL6.fuX$fuX$j$n */
            class n extends io.grpc.w6 {
                n() {
                }

                @Override // JP.iwV
                public void xMQ(SPz sPz) {
                    j.this.f71878n.Uo(sPz.HI());
                }
            }

            j(n nVar, w6.j jVar) {
                this.f71878n = nVar;
                this.rl = jVar;
            }

            @Override // io.grpc.w6.j
            public io.grpc.w6 n(w6.n nVar, QJ qj) {
                w6.j jVar = this.rl;
                return jVar != null ? new C1101j(jVar.n(nVar, qj)) : new n();
            }
        }

        C1100fuX(Pl.aC aCVar) {
            this.f71877n = aCVar;
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            Pl.Wre wreN = this.f71877n.n(cn3);
            Pl.Dsr dsrT = wreN.t();
            return dsrT != null ? Pl.Wre.xMQ(dsrT, new j((n) dsrT.t().rl(fuX.ck), wreN.rl())) : wreN;
        }
    }

    static class n {
        private final Set J2 = new HashSet();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f71881O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CN3 f71882n;
        private Long nr;
        private volatile j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private j f71883t;

        private static class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            AtomicLong f71884n;
            AtomicLong rl;

            private j() {
                this.f71884n = new AtomicLong();
                this.rl = new AtomicLong();
            }

            void n() {
                this.f71884n.set(0L);
                this.rl.set(0L);
            }
        }

        void gh() {
            this.f71881O = 0;
        }

        void HI() {
            this.f71883t.n();
            j jVar = this.rl;
            this.rl = this.f71883t;
            this.f71883t = jVar;
        }

        long J2() {
            return this.f71883t.f71884n.get() + this.f71883t.rl.get();
        }

        public boolean KN(long j2) {
            return j2 > this.nr.longValue() + Math.min(this.f71882n.rl.longValue() * ((long) this.f71881O), Math.max(this.f71882n.rl.longValue(), this.f71882n.f71856t.longValue()));
        }

        double O() {
            return this.f71883t.rl.get() / J2();
        }

        void Uo(boolean z2) {
            CN3 cn3 = this.f71882n;
            if (cn3.f71854O == null && cn3.J2 == null) {
                return;
            }
            if (z2) {
                this.rl.f71884n.getAndIncrement();
            } else {
                this.rl.rl.getAndIncrement();
            }
        }

        boolean az() {
            return this.nr != null;
        }

        void ck() {
            Xo.S(this.nr != null, "not currently ejected");
            this.nr = null;
            Iterator it = this.J2.iterator();
            while (it.hasNext()) {
                ((Dsr) it.next()).Ik();
            }
        }

        void mUb() {
            this.rl.n();
            this.f71883t.n();
        }

        void qie(CN3 cn3) {
            this.f71882n = cn3;
        }

        void t() {
            int i2 = this.f71881O;
            this.f71881O = i2 == 0 ? 0 : i2 - 1;
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.J2 + '}';
        }

        double ty() {
            return this.f71883t.f71884n.get() / J2();
        }

        n(CN3 cn3) {
            this.rl = new j();
            this.f71883t = new j();
            this.f71882n = cn3;
        }

        void nr(long j2) {
            this.nr = Long.valueOf(j2);
            this.f71881O++;
            Iterator it = this.J2.iterator();
            while (it.hasNext()) {
                ((Dsr) it.next()).ty();
            }
        }

        boolean rl(Dsr dsr) {
            if (az() && !dsr.HI()) {
                dsr.ty();
            } else if (!az() && dsr.HI()) {
                dsr.Ik();
            }
            dsr.ck(this);
            return this.J2.add(dsr);
        }

        boolean xMQ(Dsr dsr) {
            dsr.az();
            return this.J2.remove(dsr);
        }
    }

    static class w6 extends r {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f71885n = new HashMap();

        double J2() {
            if (this.f71885n.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f71885n.values().iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                i3++;
                if (((n) it.next()).az()) {
                    i2++;
                }
            }
            return (((double) i2) / ((double) i3)) * 100.0d;
        }

        void Uo(Long l2) {
            for (n nVar : this.f71885n.values()) {
                if (!nVar.az()) {
                    nVar.t();
                }
                if (nVar.az() && nVar.KN(l2.longValue())) {
                    nVar.ck();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ci
        /* JADX INFO: renamed from: delegate */
        public Map t() {
            return this.f71885n;
        }

        void gh(CN3 cn3) {
            Iterator it = this.f71885n.values().iterator();
            while (it.hasNext()) {
                ((n) it.next()).qie(cn3);
            }
        }

        void mUb() {
            Iterator it = this.f71885n.values().iterator();
            while (it.hasNext()) {
                ((n) it.next()).HI();
            }
        }

        void t() {
            for (n nVar : this.f71885n.values()) {
                if (nVar.az()) {
                    nVar.ck();
                }
                nVar.gh();
            }
        }

        void xMQ() {
            Iterator it = this.f71885n.values().iterator();
            while (it.hasNext()) {
                ((n) it.next()).mUb();
            }
        }

        w6() {
        }

        void KN(CN3 cn3, Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                SocketAddress socketAddress = (SocketAddress) it.next();
                if (!this.f71885n.containsKey(socketAddress)) {
                    this.f71885n.put(socketAddress, new n(cn3));
                }
            }
        }
    }

    interface aC {
        void n(w6 w6Var, long j2);

        static List rl(CN3 cn3, JP.Ml ml) {
            nKK.j jVarGh = nKK.gh();
            if (cn3.f71854O != null) {
                jVarGh.n(new C(cn3, ml));
            }
            if (cn3.J2 != null) {
                jVarGh.n(new Wre(cn3, ml));
            }
            return jVarGh.gh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List ty(w6 w6Var, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = w6Var.values().iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.J2() >= i2) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.Pl
    public void J2() {
        this.mUb.J2();
    }

    @Override // io.grpc.Pl
    public SPz n(Pl.fuX fux) {
        this.HI.rl(Ml.j.DEBUG, "Received resolution result: {0}", fux);
        CN3 cn3 = (CN3) fux.t();
        ArrayList arrayList = new ArrayList();
        Iterator it = fux.n().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((io.grpc.I28) it.next()).n());
        }
        this.Uo.keySet().retainAll(arrayList);
        this.Uo.gh(cn3);
        this.Uo.KN(cn3, arrayList);
        this.mUb.r(cn3.Uo.rl());
        if (cn3.n()) {
            Long lValueOf = this.ty == null ? cn3.f71855n : Long.valueOf(Math.max(0L, cn3.f71855n.longValue() - (this.gh.n() - this.ty.longValue())));
            M.Ml ml = this.az;
            if (ml != null) {
                ml.n();
                this.Uo.xMQ();
            }
            this.az = this.KN.nr(new I28(cn3, this.HI), lValueOf.longValue(), cn3.f71855n.longValue(), TimeUnit.NANOSECONDS, this.qie);
        } else {
            M.Ml ml2 = this.az;
            if (ml2 != null) {
                ml2.n();
                this.ty = null;
                this.Uo.t();
            }
        }
        this.mUb.nr(fux.O().nr(cn3.Uo.n()).n());
        return SPz.f68184O;
    }

    @Override // io.grpc.Pl
    public void t(SPz sPz) {
        this.mUb.t(sPz);
    }

    public fuX(Pl.I28 i28, Pmq pmq) {
        JP.Ml mlRl = i28.rl();
        this.HI = mlRl;
        Ml ml = new Ml((Pl.I28) Xo.ck(i28, "helper"));
        this.xMQ = ml;
        this.mUb = new pL6.I28(ml);
        this.Uo = new w6();
        this.KN = (M) Xo.ck(i28.nr(), "syncContext");
        this.qie = (ScheduledExecutorService) Xo.ck(i28.t(), "timeService");
        this.gh = pmq;
        mlRl.n(Ml.j.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean az(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((io.grpc.I28) it.next()).n().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }
}
