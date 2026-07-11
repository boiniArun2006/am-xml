package dzu;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dzu.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1959z {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f63584n;
    private final /* synthetic */ AtomicReferenceArray nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f63585t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f63583O = new j(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater J2 = AtomicReferenceFieldUpdater.newUpdater(C1959z.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater Uo = AtomicLongFieldUpdater.newUpdater(C1959z.class, "_state$volatile");
    public static final nKK KN = new nKK("REMOVE_FROZEN");

    /* JADX INFO: renamed from: dzu.z$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long nr(long j2, long j3) {
            return j2 & (~j3);
        }

        private j() {
        }

        public final int n(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long rl(long j2, int i2) {
            return nr(j2, 1073741823L) | ((long) i2);
        }

        public final long t(long j2, int i2) {
            return nr(j2, 1152921503533105152L) | (((long) i2) << 30);
        }
    }

    /* JADX INFO: renamed from: dzu.z$n */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f63586n;

        public n(int i2) {
            this.f63586n = i2;
        }
    }

    private final /* synthetic */ AtomicReferenceArray J2() {
        return this.nr;
    }

    private final C1959z rl(long j2) {
        C1959z c1959z = new C1959z(this.f63584n * 2, this.rl);
        int i2 = (int) (1073741823 & j2);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i5 = this.f63585t;
            if ((i2 & i5) == (i5 & i3)) {
                Uo.set(c1959z, f63583O.nr(j2, 1152921504606846976L));
                return c1959z;
            }
            Object nVar = J2().get(this.f63585t & i2);
            if (nVar == null) {
                nVar = new n(i2);
            }
            c1959z.J2().set(c1959z.f63585t & i2, nVar);
            i2++;
        }
    }

    public C1959z(int i2, boolean z2) {
        this.f63584n = i2;
        this.rl = z2;
        int i3 = i2 - 1;
        this.f63585t = i3;
        this.nr = new AtomicReferenceArray(i2);
        if (i3 <= 1073741823) {
            if ((i2 & i3) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    private final C1959z O(int i2, Object obj) {
        Object obj2 = J2().get(this.f63585t & i2);
        if ((obj2 instanceof n) && ((n) obj2).f63586n == i2) {
            J2().set(i2 & this.f63585t, obj);
            return this;
        }
        return null;
    }

    private final long gh() {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Uo;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = 1152921504606846976L | j2;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        return j3;
    }

    private final C1959z t(long j2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J2;
        while (true) {
            C1959z c1959z = (C1959z) atomicReferenceFieldUpdater.get(this);
            if (c1959z != null) {
                return c1959z;
            }
            androidx.concurrent.futures.j.n(J2, this, null, rl(j2));
        }
    }

    private final C1959z ty(int i2, int i3) {
        long j2;
        int i5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Uo;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            i5 = (int) (1073741823 & j2);
            if ((1152921504606846976L & j2) != 0) {
                return qie();
            }
        } while (!Uo.compareAndSet(this, j2, f63583O.rl(j2, i3)));
        J2().set(this.f63585t & i5, null);
        return null;
    }

    public final int Uo() {
        long j2 = Uo.get(this);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final Object az() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = Uo;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j2) != 0) {
                return KN;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = this.f63585t;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == (i3 & i2)) {
                return null;
            }
            Object obj = J2().get(this.f63585t & i2);
            if (obj == null) {
                if (this.rl) {
                    return null;
                }
            } else {
                if (obj instanceof n) {
                    return null;
                }
                int i5 = (i2 + 1) & 1073741823;
                if (Uo.compareAndSet(this, j2, f63583O.rl(j2, i5))) {
                    J2().set(this.f63585t & i2, null);
                    return obj;
                }
                if (this.rl) {
                    C1959z c1959zTy = this;
                    do {
                        c1959zTy = c1959zTy.ty(i2, i5);
                    } while (c1959zTy != null);
                    return obj;
                }
            }
        }
    }

    public final boolean mUb() {
        long j2 = Uo.get(this);
        if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = Uo;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return f63583O.n(j2);
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i5 = this.f63585t;
            if (((i3 + 2) & i5) == (i2 & i5)) {
                return 1;
            }
            if (!this.rl && J2().get(i3 & i5) != null) {
                int i7 = this.f63584n;
                if (i7 < 1024 || ((i3 - i2) & 1073741823) > (i7 >> 1)) {
                    break;
                }
            } else if (Uo.compareAndSet(this, j2, f63583O.t(j2, (i3 + 1) & 1073741823))) {
                J2().set(i3 & i5, obj);
                C1959z c1959zO = this;
                while ((Uo.get(c1959zO) & 1152921504606846976L) != 0 && (c1959zO = c1959zO.qie().O(i3, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean nr() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Uo;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final C1959z qie() {
        return t(gh());
    }
}
