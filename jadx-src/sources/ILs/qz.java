package ILs;

import GJW.HcS;
import dzu.afx;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class qz extends afx {
    private final /* synthetic */ AtomicReferenceArray J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f4193O;

    public final void WPU(int i2) {
        E2(i2, null);
    }

    private final /* synthetic */ AtomicReferenceArray nY() {
        return this.J2;
    }

    public final I28 ViF() {
        I28 i28 = this.f4193O;
        Intrinsics.checkNotNull(i28);
        return i28;
    }

    public final void iF(int i2, boolean z2) {
        if (z2) {
            ViF().EF((this.f63562t * ((long) Wre.rl)) + ((long) i2));
        }
        Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        WPU(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = ViF().f4158t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        dzu.r.n(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // dzu.afx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i2, Throwable th, CoroutineContext coroutineContext) {
        Function1 function1;
        int i3 = Wre.rl;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object objG = g(i2);
        while (true) {
            Object objTe = te(i2);
            if ((objTe instanceof HcS) || (objTe instanceof SPz)) {
                if (S(i2, objTe, z2 ? Wre.mUb : Wre.gh)) {
                    WPU(i2);
                    iF(i2, !z2);
                    if (!z2 || (function1 = ViF().f4158t) == null) {
                        return;
                    }
                    dzu.r.n(function1, objG, coroutineContext);
                    return;
                }
            } else {
                if (objTe == Wre.mUb || objTe == Wre.gh) {
                    break;
                }
                if (objTe != Wre.Uo && objTe != Wre.J2) {
                    if (objTe == Wre.xMQ || objTe == Wre.nr || objTe == Wre.nY()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objTe).toString());
                }
            }
        }
    }

    @Override // dzu.afx
    public int r() {
        return Wre.rl;
    }

    public qz(long j2, qz qzVar, I28 i28, int i2) {
        super(j2, qzVar, i2);
        this.f4193O = i28;
        this.J2 = new AtomicReferenceArray(Wre.rl * 2);
    }

    private final void E2(int i2, Object obj) {
        nY().set(i2 * 2, obj);
    }

    public final boolean S(int i2, Object obj, Object obj2) {
        return o.n(nY(), (i2 * 2) + 1, obj, obj2);
    }

    public final void X(int i2, Object obj) {
        E2(i2, obj);
    }

    public final Object aYN(int i2, Object obj) {
        return nY().getAndSet((i2 * 2) + 1, obj);
    }

    public final void e(int i2, Object obj) {
        nY().set((i2 * 2) + 1, obj);
    }

    public final Object fD(int i2) {
        Object objG = g(i2);
        WPU(i2);
        return objG;
    }

    public final Object g(int i2) {
        return nY().get(i2 * 2);
    }

    public final Object te(int i2) {
        return nY().get((i2 * 2) + 1);
    }
}
