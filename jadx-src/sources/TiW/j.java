package TiW;

import GJW.psW;
import Hr.CQ.USEaHtCMH;
import dzu.ci;
import dzu.nKK;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements Executor, Closeable {
    public final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f10557O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final ci f10558Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TiW.Ml f10560o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TiW.Ml f10561r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10562t;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C0374j f10553S = new C0374j(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10556g = AtomicLongFieldUpdater.newUpdater(j.class, "parkedWorkersStack$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater E2 = AtomicLongFieldUpdater.newUpdater(j.class, "controlState$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10555e = AtomicIntegerFieldUpdater.newUpdater(j.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final nKK f10554X = new nKK("NOT_IN_STACK");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class Ml {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f10564Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ Ml[] f10566o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f10565n = new Ml("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Ml f10568t = new Ml("BLOCKING", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Ml f10563O = new Ml("PARKING", 2);
        public static final Ml J2 = new Ml("DORMANT", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Ml f10567r = new Ml("TERMINATED", 4);

        static {
            Ml[] mlArrN = n();
            f10566o = mlArrN;
            f10564Z = EnumEntriesKt.enumEntries(mlArrN);
        }

        private static final /* synthetic */ Ml[] n() {
            return new Ml[]{f10565n, f10568t, f10563O, J2, f10567r};
        }

        public static Ml valueOf(String str) {
            return (Ml) Enum.valueOf(Ml.class, str);
        }

        public static Ml[] values() {
            return (Ml[]) f10566o.clone();
        }

        private Ml(String str, int i2) {
        }
    }

    /* JADX INFO: renamed from: TiW.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class C0374j {
        public /* synthetic */ C0374j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0374j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public final class w6 extends Thread {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f10569g = AtomicIntegerFieldUpdater.newUpdater(w6.class, "workerCtl$volatile");
        private long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public Ml f10570O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public boolean f10572Z;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final o f10573n;
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f10574o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f10575r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Ref.ObjectRef f10576t;
        private volatile /* synthetic */ int workerCtl$volatile;

        private w6() {
            setDaemon(true);
            setContextClassLoader(j.this.getClass().getClassLoader());
            this.f10573n = new o();
            this.f10576t = new Ref.ObjectRef();
            this.f10570O = Ml.J2;
            this.nextParkedWorker = j.f10554X;
            int iNanoTime = (int) System.nanoTime();
            this.f10574o = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void az() {
            loop0: while (true) {
                boolean z2 = false;
                while (!j.this.isTerminated() && this.f10570O != Ml.f10567r) {
                    fuX fuxO = O(this.f10572Z);
                    if (fuxO != null) {
                        this.f10575r = 0L;
                        rl(fuxO);
                    } else {
                        this.f10572Z = false;
                        if (this.f10575r == 0) {
                            Ik();
                        } else if (z2) {
                            r(Ml.f10563O);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10575r);
                            this.f10575r = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
                break loop0;
            }
            r(Ml.f10567r);
        }

        private final fuX qie() {
            if (mUb(2) == 0) {
                fuX fux = (fuX) j.this.f10561r.O();
                return fux != null ? fux : (fuX) j.this.f10560o.O();
            }
            fuX fux2 = (fuX) j.this.f10560o.O();
            return fux2 != null ? fux2 : (fuX) j.this.f10561r.O();
        }

        private final void Z() {
            j jVar = j.this;
            synchronized (jVar.f10558Z) {
                try {
                    if (jVar.isTerminated()) {
                        return;
                    }
                    if (((int) (j.eF().get(jVar) & 2097151)) <= jVar.f10559n) {
                        return;
                    }
                    if (f10569g.compareAndSet(this, -1, 1)) {
                        int i2 = this.indexInArray;
                        ty(0);
                        jVar.fcU(this, i2, 0);
                        int andDecrement = (int) (j.eF().getAndDecrement(jVar) & 2097151);
                        if (andDecrement != i2) {
                            Object objRl = jVar.f10558Z.rl(andDecrement);
                            Intrinsics.checkNotNull(objRl);
                            w6 w6Var = (w6) objRl;
                            jVar.f10558Z.t(i2, w6Var);
                            w6Var.ty(i2);
                            jVar.fcU(w6Var, andDecrement, i2);
                        }
                        jVar.f10558Z.t(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.f10570O = Ml.f10567r;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private final boolean ck() {
            long j2;
            if (this.f10570O == Ml.f10565n) {
                return true;
            }
            j jVar = j.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterEF = j.eF();
            do {
                j2 = atomicLongFieldUpdaterEF.get(jVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    return false;
                }
            } while (!j.eF().compareAndSet(jVar, j2, j2 - 4398046511104L));
            this.f10570O = Ml.f10565n;
            return true;
        }

        private final void gh() {
            if (this.J2 == 0) {
                this.J2 = System.nanoTime() + j.this.f10557O;
            }
            LockSupport.parkNanos(j.this.f10557O);
            if (System.nanoTime() - this.J2 >= 0) {
                this.J2 = 0L;
                Z();
            }
        }

        private final fuX nr() {
            fuX fuxQie = this.f10573n.qie();
            if (fuxQie != null) {
                return fuxQie;
            }
            fuX fux = (fuX) j.this.f10560o.O();
            return fux == null ? o(1) : fux;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final fuX o(int i2) {
            int i3 = (int) (j.eF().get(j.this) & 2097151);
            if (i3 < 2) {
                return null;
            }
            int iMUb = mUb(i3);
            j jVar = j.this;
            long jMin = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i3; i5++) {
                iMUb++;
                if (iMUb > i3) {
                    iMUb = 1;
                }
                w6 w6Var = (w6) jVar.f10558Z.rl(iMUb);
                if (w6Var != null && w6Var != this) {
                    long jR = w6Var.f10573n.r(i2, this.f10576t);
                    if (jR == -1) {
                        Ref.ObjectRef objectRef = this.f10576t;
                        fuX fux = (fuX) objectRef.element;
                        objectRef.element = null;
                        return fux;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f10575r = jMin;
            return null;
        }

        private final void rl(fuX fux) {
            this.J2 = 0L;
            if (this.f10570O == Ml.f10563O) {
                this.f10570O = Ml.f10568t;
            }
            if (!fux.f10552t) {
                j.this.n1(fux);
                return;
            }
            if (r(Ml.f10568t)) {
                j.this.GD();
            }
            j.this.n1(fux);
            j.eF().addAndGet(j.this, -2097152L);
            if (this.f10570O != Ml.f10567r) {
                this.f10570O = Ml.J2;
            }
        }

        private final fuX t(boolean z2) {
            fuX fuxQie;
            fuX fuxQie2;
            if (z2) {
                boolean z3 = mUb(j.this.f10559n * 2) == 0;
                if (z3 && (fuxQie2 = qie()) != null) {
                    return fuxQie2;
                }
                fuX fuxGh = this.f10573n.gh();
                if (fuxGh != null) {
                    return fuxGh;
                }
                if (!z3 && (fuxQie = qie()) != null) {
                    return fuxQie;
                }
            } else {
                fuX fuxQie3 = qie();
                if (fuxQie3 != null) {
                    return fuxQie3;
                }
            }
            return o(3);
        }

        private final boolean xMQ() {
            return this.nextParkedWorker != j.f10554X;
        }

        public final void HI(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final int J2() {
            return this.indexInArray;
        }

        public final Object Uo() {
            return this.nextParkedWorker;
        }

        public final int mUb(int i2) {
            int i3 = this.f10574o;
            int i5 = i3 ^ (i3 << 13);
            int i7 = i5 ^ (i5 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f10574o = i8;
            int i9 = i2 - 1;
            return (i9 & i2) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i2;
        }

        public final boolean r(Ml ml) {
            Ml ml2 = this.f10570O;
            boolean z2 = ml2 == Ml.f10565n;
            if (z2) {
                j.eF().addAndGet(j.this, 4398046511104L);
            }
            if (ml2 != ml) {
                this.f10570O = ml;
            }
            return z2;
        }

        public final void ty(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(j.this.J2);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        private final void Ik() {
            if (!xMQ()) {
                j.this.Mx(this);
                return;
            }
            f10569g.set(this, -1);
            while (xMQ() && f10569g.get(this) == -1 && !j.this.isTerminated() && this.f10570O != Ml.f10567r) {
                r(Ml.f10563O);
                Thread.interrupted();
                gh();
            }
        }

        public final fuX O(boolean z2) {
            if (ck()) {
                return t(z2);
            }
            return nr();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            az();
        }

        public w6(j jVar, int i2) {
            this();
            ty(i2);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        p5(this, runnable, false, false, 6, null);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ml.values().length];
            try {
                iArr[Ml.f10563O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ml.f10568t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ml.f10565n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Ml.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Ml.f10567r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final fuX K(w6 w6Var, fuX fux, boolean z2) {
        Ml ml;
        if (w6Var == null || (ml = w6Var.f10570O) == Ml.f10567r) {
            return fux;
        }
        if (!fux.f10552t && ml == Ml.f10568t) {
            return fux;
        }
        w6Var.f10572Z = true;
        return w6Var.f10573n.n(fux, z2);
    }

    static /* synthetic */ boolean T3L(j jVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = E2.get(jVar);
        }
        return jVar.How(j2);
    }

    private final int Z() {
        synchronized (this.f10558Z) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j2 = E2.get(this);
                int i2 = (int) (j2 & 2097151);
                int iCoerceAtLeast = RangesKt.coerceAtLeast(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
                if (iCoerceAtLeast >= this.f10559n) {
                    return 0;
                }
                if (i2 >= this.f10562t) {
                    return 0;
                }
                int i3 = ((int) (eF().get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f10558Z.rl(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                w6 w6Var = new w6(this, i3);
                this.f10558Z.t(i3, w6Var);
                if (i3 != ((int) (2097151 & E2.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = iCoerceAtLeast + 1;
                w6Var.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater eF() {
        return E2;
    }

    public static /* synthetic */ void p5(j jVar, Runnable runnable, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        jVar.U(runnable, z2, z3);
    }

    private final boolean rl(fuX fux) {
        return fux.f10552t ? this.f10560o.n(fux) : this.f10561r.n(fux);
    }

    public final fuX T(Runnable runnable, boolean z2) {
        long jN = aC.J2.n();
        if (!(runnable instanceof fuX)) {
            return aC.rl(runnable, jN, z2);
        }
        fuX fux = (fuX) runnable;
        fux.f10551n = jN;
        fux.f10552t = z2;
        return fux;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        qm(10000L);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iN = this.f10558Z.n();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iN; i9++) {
            w6 w6Var = (w6) this.f10558Z.rl(i9);
            if (w6Var != null) {
                int iXMQ = w6Var.f10573n.xMQ();
                int i10 = n.$EnumSwitchMapping$0[w6Var.f10570O.ordinal()];
                if (i10 == 1) {
                    i5++;
                } else if (i10 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iXMQ);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i10 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iXMQ);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i10 == 4) {
                    i7++;
                    if (iXMQ > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iXMQ);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i8++;
                }
            }
        }
        long j2 = E2.get(this);
        return this.J2 + '@' + psW.rl(this) + "[Pool Size {core = " + this.f10559n + ", max = " + this.f10562t + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i5 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f10561r.t() + ", global blocking queue size = " + this.f10560o.t() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f10559n - ((int) ((9223367638808264704L & j2) >> 42))) + USEaHtCMH.WkavteZp;
    }

    public j(int i2, int i3, long j2, String str) {
        this.f10559n = i2;
        this.f10562t = i3;
        this.f10557O = j2;
        this.J2 = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.f10561r = new TiW.Ml();
                        this.f10560o = new TiW.Ml();
                        this.f10558Z = new ci((i2 + 1) * 2);
                        this.controlState$volatile = ((long) i2) << 42;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
    }

    private final boolean Bu() {
        w6 w6VarZ;
        do {
            w6VarZ = z();
            if (w6VarZ == null) {
                return false;
            }
        } while (!w6.f10569g.compareAndSet(w6VarZ, -1, 0));
        LockSupport.unpark(w6VarZ);
        return true;
    }

    private final boolean How(long j2) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.f10559n) {
            int iZ = Z();
            if (iZ == 1 && this.f10559n > 1) {
                Z();
            }
            if (iZ > 0) {
                return true;
            }
        }
        return false;
    }

    private final void Org(long j2) {
        if (Bu() || How(j2)) {
            return;
        }
        Bu();
    }

    private final int a(w6 w6Var) {
        Object objUo = w6Var.Uo();
        while (objUo != f10554X) {
            if (objUo == null) {
                return 0;
            }
            w6 w6Var2 = (w6) objUo;
            int iJ2 = w6Var2.J2();
            if (iJ2 != 0) {
                return iJ2;
            }
            objUo = w6Var2.Uo();
        }
        return -1;
    }

    private final w6 jB() {
        w6 w6Var;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof w6) {
            w6Var = (w6) threadCurrentThread;
        } else {
            w6Var = null;
        }
        if (w6Var == null || !Intrinsics.areEqual(j.this, this)) {
            return null;
        }
        return w6Var;
    }

    private final w6 z() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10556g;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            w6 w6Var = (w6) this.f10558Z.rl((int) (2097151 & j2));
            if (w6Var == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int iA = a(w6Var);
            if (iA >= 0 && f10556g.compareAndSet(this, j2, ((long) iA) | j3)) {
                w6Var.HI(f10554X);
                return w6Var;
            }
        }
    }

    public final void GD() {
        if (Bu() || T3L(this, 0L, 1, null)) {
            return;
        }
        Bu();
    }

    public final boolean Mx(w6 w6Var) {
        long j2;
        int iJ2;
        if (w6Var.Uo() == f10554X) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10556g;
            do {
                j2 = atomicLongFieldUpdater.get(this);
                iJ2 = w6Var.J2();
                w6Var.HI(this.f10558Z.rl((int) (2097151 & j2)));
            } while (!f10556g.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | ((long) iJ2)));
            return true;
        }
        return false;
    }

    public final void U(Runnable runnable, boolean z2, boolean z3) {
        long jAddAndGet;
        GJW.w6.n();
        fuX fuxT = T(runnable, z2);
        boolean z4 = fuxT.f10552t;
        if (z4) {
            jAddAndGet = E2.addAndGet(this, 2097152L);
        } else {
            jAddAndGet = 0;
        }
        fuX fuxK = K(jB(), fuxT, z3);
        if (fuxK != null && !rl(fuxK)) {
            throw new RejectedExecutionException(this.J2 + " was terminated");
        }
        if (z4) {
            Org(jAddAndGet);
        } else {
            GD();
        }
    }

    public final void fcU(w6 w6Var, int i2, int i3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10556g;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            int iA = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iA == i2) {
                if (i3 == 0) {
                    iA = a(w6Var);
                } else {
                    iA = i3;
                }
            }
            if (iA >= 0) {
                if (f10556g.compareAndSet(this, j2, j3 | ((long) iA))) {
                    return;
                }
            }
        }
    }

    public final boolean isTerminated() {
        if (f10555e.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final void n1(fuX fux) {
        try {
            fux.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                GJW.w6.n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qm(long j2) throws InterruptedException {
        int i2;
        fuX fuxO;
        if (!f10555e.compareAndSet(this, 0, 1)) {
            return;
        }
        w6 w6VarJB = jB();
        synchronized (this.f10558Z) {
            i2 = (int) (eF().get(this) & 2097151);
        }
        if (1 <= i2) {
            int i3 = 1;
            while (true) {
                Object objRl = this.f10558Z.rl(i3);
                Intrinsics.checkNotNull(objRl);
                w6 w6Var = (w6) objRl;
                if (w6Var != w6VarJB) {
                    while (w6Var.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(w6Var);
                        w6Var.join(j2);
                    }
                    w6Var.f10573n.mUb(this.f10560o);
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f10560o.rl();
        this.f10561r.rl();
        while (true) {
            if (w6VarJB != null) {
                fuxO = w6VarJB.O(true);
                if (fuxO != null) {
                    continue;
                }
            } else {
                fuxO = (fuX) this.f10561r.O();
                if (fuxO == null && (fuxO = (fuX) this.f10560o.O()) == null) {
                    break;
                }
            }
            n1(fuxO);
        }
        if (w6VarJB != null) {
            w6VarJB.r(Ml.f10567r);
        }
        f10556g.set(this, 0L);
        E2.set(this, 0L);
    }
}
