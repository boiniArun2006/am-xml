package dzu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class h {
    private static final /* synthetic */ AtomicIntegerFieldUpdater rl = AtomicIntegerFieldUpdater.newUpdater(h.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private K[] f63568n;

    public final K J2() {
        K kRl;
        synchronized (this) {
            kRl = rl();
        }
        return kRl;
    }

    public final boolean KN(K k2) {
        boolean z2;
        synchronized (this) {
            if (k2.nr() == null) {
                z2 = false;
            } else {
                xMQ(k2.getIndex());
                z2 = true;
            }
        }
        return z2;
    }

    public final K mUb() {
        K kXMQ;
        synchronized (this) {
            kXMQ = t() > 0 ? xMQ(0) : null;
        }
        return kXMQ;
    }

    private final K[] Uo() {
        K[] kArr = this.f63568n;
        if (kArr == null) {
            K[] kArr2 = new K[4];
            this.f63568n = kArr2;
            return kArr2;
        }
        if (t() < kArr.length) {
            return kArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(kArr, t() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        K[] kArr3 = (K[]) objArrCopyOf;
        this.f63568n = kArr3;
        return kArr3;
    }

    private final void az(int i2) {
        while (i2 > 0) {
            K[] kArr = this.f63568n;
            Intrinsics.checkNotNull(kArr);
            int i3 = (i2 - 1) / 2;
            K k2 = kArr[i3];
            Intrinsics.checkNotNull(k2);
            K k3 = kArr[i2];
            Intrinsics.checkNotNull(k3);
            if (((Comparable) k2).compareTo(k3) <= 0) {
                return;
            }
            ty(i2, i3);
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void qie(int i2) {
        while (true) {
            int i3 = i2 * 2;
            int i5 = i3 + 1;
            if (i5 >= t()) {
                return;
            }
            K[] kArr = this.f63568n;
            Intrinsics.checkNotNull(kArr);
            int i7 = i3 + 2;
            if (i7 < t()) {
                K k2 = kArr[i7];
                Intrinsics.checkNotNull(k2);
                K k3 = kArr[i5];
                Intrinsics.checkNotNull(k3);
                if (((Comparable) k2).compareTo(k3) >= 0) {
                    i7 = i5;
                }
            }
            K k4 = kArr[i2];
            Intrinsics.checkNotNull(k4);
            K k5 = kArr[i7];
            Intrinsics.checkNotNull(k5);
            if (((Comparable) k4).compareTo(k5) <= 0) {
                return;
            }
            ty(i2, i7);
            i2 = i7;
        }
    }

    private final void ty(int i2, int i3) {
        K[] kArr = this.f63568n;
        Intrinsics.checkNotNull(kArr);
        K k2 = kArr[i3];
        Intrinsics.checkNotNull(k2);
        K k3 = kArr[i2];
        Intrinsics.checkNotNull(k3);
        kArr[i2] = k2;
        kArr[i3] = k3;
        k2.setIndex(i2);
        k3.setIndex(i3);
    }

    public final K rl() {
        K[] kArr = this.f63568n;
        if (kArr != null) {
            return kArr[0];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final K xMQ(int i2) {
        K[] kArr = this.f63568n;
        Intrinsics.checkNotNull(kArr);
        gh(t() - 1);
        if (i2 < t()) {
            ty(i2, t());
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                K k2 = kArr[i2];
                Intrinsics.checkNotNull(k2);
                K k3 = kArr[i3];
                Intrinsics.checkNotNull(k3);
                if (((Comparable) k2).compareTo(k3) < 0) {
                    ty(i2, i3);
                    az(i3);
                } else {
                    qie(i2);
                }
            }
        }
        K k4 = kArr[t()];
        Intrinsics.checkNotNull(k4);
        k4.rl(null);
        k4.setIndex(-1);
        kArr[t()] = null;
        return k4;
    }

    private final void gh(int i2) {
        rl.set(this, i2);
    }

    public final boolean O() {
        if (t() == 0) {
            return true;
        }
        return false;
    }

    public final void n(K k2) {
        k2.rl(this);
        K[] kArrUo = Uo();
        int iT = t();
        gh(iT + 1);
        kArrUo[iT] = k2;
        k2.setIndex(iT);
        az(iT);
    }

    public final int t() {
        return rl.get(this);
    }
}
