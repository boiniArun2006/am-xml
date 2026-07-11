package dzu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Xo {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63560n = AtomicReferenceFieldUpdater.newUpdater(Xo.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63561t = AtomicReferenceFieldUpdater.newUpdater(Xo.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63559O = AtomicReferenceFieldUpdater.newUpdater(Xo.class, Object.class, "_removedRef$volatile");

    public final void Uo(int i2) {
        nr(new qz(i2), i2);
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: dzu.Xo.j
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return GJW.psW.n(this.receiver);
            }
        } + '@' + GJW.psW.rl(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.j.n(dzu.Xo.f63560n, r3, r2, ((dzu.SPz) r4).f63556n) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Xo KN() {
        while (true) {
            Xo xo = (Xo) f63561t.get(this);
            Xo xo2 = xo;
            while (true) {
                Xo xo3 = null;
                while (true) {
                    Object obj = f63560n.get(xo2);
                    if (obj == this) {
                        if (xo == xo2 || androidx.concurrent.futures.j.n(f63561t, this, xo, xo2)) {
                            break;
                        }
                    } else {
                        if (Ik()) {
                            return null;
                        }
                        if (obj instanceof SPz) {
                            if (xo3 != null) {
                                break;
                            }
                            xo2 = (Xo) f63561t.get(xo2);
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            xo3 = xo2;
                            xo2 = (Xo) obj;
                        }
                    }
                }
                xo2 = xo3;
            }
        }
    }

    private final SPz Z() {
        SPz sPz = (SPz) f63559O.get(this);
        if (sPz == null) {
            SPz sPz2 = new SPz(this);
            f63559O.set(this, sPz2);
            return sPz2;
        }
        return sPz;
    }

    private final void mUb(Xo xo) {
        Xo xo2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f63561t;
        do {
            xo2 = (Xo) atomicReferenceFieldUpdater.get(xo);
            if (gh() != xo) {
                return;
            }
        } while (!androidx.concurrent.futures.j.n(f63561t, xo, xo2, this));
        if (Ik()) {
            xo.KN();
        }
    }

    private final Xo xMQ(Xo xo) {
        while (xo.Ik()) {
            xo = (Xo) f63561t.get(xo);
        }
        return xo;
    }

    public boolean Ik() {
        return gh() instanceof SPz;
    }

    public final boolean J2(Xo xo) {
        f63561t.set(xo, this);
        f63560n.set(xo, this);
        while (gh() == this) {
            if (androidx.concurrent.futures.j.n(f63560n, this, this, xo)) {
                xo.mUb(this);
                return true;
            }
        }
        return false;
    }

    public final boolean O(Xo xo, Xo xo2) {
        f63561t.set(xo, this);
        f63560n.set(xo, xo2);
        if (!androidx.concurrent.futures.j.n(f63560n, this, xo2, xo)) {
            return false;
        }
        xo.mUb(xo2);
        return true;
    }

    public final Xo az() {
        Xo xoKN = KN();
        if (xoKN == null) {
            return xMQ((Xo) f63561t.get(this));
        }
        return xoKN;
    }

    public final Object gh() {
        return f63560n.get(this);
    }

    public final boolean nr(Xo xo, int i2) {
        Xo xoAz;
        do {
            xoAz = az();
            if (xoAz instanceof qz) {
                if ((((qz) xoAz).J2 & i2) == 0 && xoAz.nr(xo, i2)) {
                    return true;
                }
                return false;
            }
        } while (!xoAz.O(xo, this));
        return true;
    }

    public final Xo o() {
        Object objGh;
        Xo xo;
        do {
            objGh = gh();
            if (objGh instanceof SPz) {
                return ((SPz) objGh).f63556n;
            }
            if (objGh == this) {
                return (Xo) objGh;
            }
            Intrinsics.checkNotNull(objGh, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            xo = (Xo) objGh;
        } while (!androidx.concurrent.futures.j.n(f63560n, this, objGh, xo.Z()));
        xo.KN();
        return null;
    }

    public final Xo qie() {
        SPz sPz;
        Xo xo;
        Object objGh = gh();
        if (objGh instanceof SPz) {
            sPz = (SPz) objGh;
        } else {
            sPz = null;
        }
        if (sPz != null && (xo = sPz.f63556n) != null) {
            return xo;
        }
        Intrinsics.checkNotNull(objGh, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (Xo) objGh;
    }

    public boolean r() {
        if (o() == null) {
            return true;
        }
        return false;
    }
}
