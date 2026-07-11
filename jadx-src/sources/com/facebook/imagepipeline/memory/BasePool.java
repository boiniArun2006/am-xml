package com.facebook.imagepipeline.memory;

import Hh.C;
import Hh.Xo;
import Hh.o;
import android.graphics.Trmy.yioUaKMByL;
import android.util.SparseArray;
import android.util.SparseIntArray;
import fJf.DAz;
import fJf.nKK;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class BasePool implements A72.Wre {
    private boolean J2;
    final j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Set f52420O;
    final j Uo;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f52421n;
    final SparseArray nr;
    final A72.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final nKK f52422t;
    private final DAz xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class InvalidValueException extends RuntimeException {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i2, int i3, int i5, int i7) {
            super("Pool hard cap violation? Hard cap = " + i2 + " Used size = " + i3 + " Free size = " + i5 + " Request size = " + i7);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class SizeTooLargeException extends InvalidSizeException {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52423n;
        int rl;

        public void n(int i2) {
            int i3;
            int i5 = this.rl;
            if (i5 < i2 || (i3 = this.f52423n) <= 0) {
                Dzy.j.g("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i2), Integer.valueOf(this.rl), Integer.valueOf(this.f52423n));
            } else {
                this.f52423n = i3 - 1;
                this.rl = i5 - i2;
            }
        }

        public void rl(int i2) {
            this.f52423n++;
            this.rl += i2;
        }

        j() {
        }
    }

    public BasePool(A72.Ml ml, nKK nkk, DAz dAz) {
        this.f52421n = getClass();
        this.rl = (A72.Ml) C.Uo(ml);
        nKK nkk2 = (nKK) C.Uo(nkk);
        this.f52422t = nkk2;
        this.xMQ = (DAz) C.Uo(dAz);
        this.nr = new SparseArray();
        if (nkk2.J2) {
            Ik();
        } else {
            XQ(new SparseIntArray(0));
        }
        this.f52420O = o.rl();
        this.KN = new j();
        this.Uo = new j();
    }

    private synchronized void Ik() {
        try {
            SparseIntArray sparseIntArray = this.f52422t.f66892t;
            if (sparseIntArray != null) {
                xMQ(sparseIntArray);
                this.J2 = false;
            } else {
                this.J2 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void KN() {
        try {
            C.xMQ(!o() || this.KN.rl == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void S() {
        if (Dzy.j.az(2)) {
            Dzy.j.r(this.f52421n, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.Uo.f52423n), Integer.valueOf(this.Uo.rl), Integer.valueOf(this.KN.f52423n), Integer.valueOf(this.KN.rl));
        }
    }

    private synchronized void XQ(SparseIntArray sparseIntArray) {
        try {
            C.Uo(sparseIntArray);
            this.nr.clear();
            SparseIntArray sparseIntArray2 = this.f52422t.f66892t;
            if (sparseIntArray2 != null) {
                for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    this.nr.put(iKeyAt, new com.facebook.imagepipeline.memory.j(HI(iKeyAt), sparseIntArray2.valueAt(i2), sparseIntArray.get(iKeyAt, 0), this.f52422t.J2));
                }
                this.J2 = false;
            } else {
                this.J2 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized com.facebook.imagepipeline.memory.j qie(int i2) {
        return (com.facebook.imagepipeline.memory.j) this.nr.get(i2);
    }

    protected abstract int HI(int i2);

    protected abstract Object J2(int i2);

    synchronized boolean Uo(int i2) {
        if (this.mUb) {
            return true;
        }
        nKK nkk = this.f52422t;
        int i3 = nkk.f66891n;
        int i5 = this.Uo.rl;
        if (i2 > i3 - i5) {
            this.xMQ.Uo();
            return false;
        }
        int i7 = nkk.rl;
        if (i2 > i7 - (i5 + this.KN.rl)) {
            aYN(i7 - i2);
        }
        if (i2 <= i3 - (this.Uo.rl + this.KN.rl)) {
            return true;
        }
        this.xMQ.Uo();
        return false;
    }

    synchronized void ViF() {
        if (o()) {
            aYN(this.f52422t.rl);
        }
    }

    synchronized void aYN(int i2) {
        try {
            int i3 = this.Uo.rl;
            int i5 = this.KN.rl;
            int iMin = Math.min((i3 + i5) - i2, i5);
            if (iMin <= 0) {
                return;
            }
            if (Dzy.j.az(2)) {
                Dzy.j.Ik(this.f52421n, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i2), Integer.valueOf(this.Uo.rl + this.KN.rl), Integer.valueOf(iMin));
            }
            S();
            for (int i7 = 0; i7 < this.nr.size() && iMin > 0; i7++) {
                com.facebook.imagepipeline.memory.j jVar = (com.facebook.imagepipeline.memory.j) C.Uo((com.facebook.imagepipeline.memory.j) this.nr.valueAt(i7));
                while (iMin > 0) {
                    Object objUo = jVar.Uo();
                    if (objUo == null) {
                        break;
                    }
                    mUb(objUo);
                    int i8 = jVar.f52431n;
                    iMin -= i8;
                    this.KN.n(i8);
                }
            }
            S();
            if (Dzy.j.az(2)) {
                Dzy.j.ck(this.f52421n, yioUaKMByL.QOBLqlhvUCt, Integer.valueOf(i2), Integer.valueOf(this.Uo.rl + this.KN.rl));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract int az(int i2);

    protected synchronized Object ck(com.facebook.imagepipeline.memory.j jVar) {
        return jVar.t();
    }

    synchronized com.facebook.imagepipeline.memory.j gh(int i2) {
        try {
            com.facebook.imagepipeline.memory.j jVar = (com.facebook.imagepipeline.memory.j) this.nr.get(i2);
            if (jVar == null && this.J2) {
                if (Dzy.j.az(2)) {
                    Dzy.j.HI(this.f52421n, "creating new bucket %s", Integer.valueOf(i2));
                }
                com.facebook.imagepipeline.memory.j jVarWPU = WPU(i2);
                this.nr.put(i2, jVarWPU);
                return jVarWPU;
            }
            return jVar;
        } finally {
        }
    }

    protected abstract void mUb(Object obj);

    synchronized boolean o() {
        boolean z2;
        z2 = this.Uo.rl + this.KN.rl > this.f52422t.rl;
        if (z2) {
            this.xMQ.n();
        }
        return z2;
    }

    protected abstract int ty(Object obj);

    private void xMQ(SparseIntArray sparseIntArray) {
        this.nr.clear();
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            int iKeyAt = sparseIntArray.keyAt(i2);
            this.nr.put(iKeyAt, new com.facebook.imagepipeline.memory.j(HI(iKeyAt), sparseIntArray.valueAt(i2), 0, this.f52422t.J2));
        }
    }

    com.facebook.imagepipeline.memory.j WPU(int i2) {
        return new com.facebook.imagepipeline.memory.j(HI(i2), Integer.MAX_VALUE, 0, this.f52422t.J2);
    }

    protected void r() {
        this.rl.n(this);
        this.xMQ.J2(this);
    }

    protected boolean Z(Object obj) {
        C.Uo(obj);
        return true;
    }

    @Override // A72.Wre
    public Object get(int i2) throws Throwable {
        Object objJ2;
        Object objCk;
        KN();
        int iAz = az(i2);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.j jVarGh = gh(iAz);
                if (jVarGh != null && (objCk = ck(jVarGh)) != null) {
                    C.xMQ(this.f52420O.add(objCk));
                    int iTy = ty(objCk);
                    int iHI = HI(iTy);
                    this.Uo.rl(iHI);
                    this.KN.n(iHI);
                    this.xMQ.O(iHI);
                    S();
                    if (Dzy.j.az(2)) {
                        Dzy.j.ck(this.f52421n, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objCk)), Integer.valueOf(iTy));
                    }
                    return objCk;
                }
                int iHI2 = HI(iAz);
                if (Uo(iHI2)) {
                    this.Uo.rl(iHI2);
                    if (jVarGh != null) {
                        jVarGh.O();
                    }
                    try {
                        objJ2 = J2(iAz);
                    } catch (Throwable th) {
                        synchronized (this) {
                            try {
                                this.Uo.n(iHI2);
                                com.facebook.imagepipeline.memory.j jVarGh2 = gh(iAz);
                                if (jVarGh2 != null) {
                                    jVarGh2.rl();
                                }
                                Xo.t(th);
                                objJ2 = null;
                            } finally {
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            C.xMQ(this.f52420O.add(objJ2));
                            ViF();
                            this.xMQ.nr(iHI2);
                            S();
                            if (Dzy.j.az(2)) {
                                Dzy.j.ck(this.f52421n, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objJ2)), Integer.valueOf(iAz));
                            }
                        } finally {
                        }
                    }
                    return objJ2;
                }
                throw new PoolSizeViolationException(this.f52422t.f66891n, this.Uo.rl, this.KN.rl, iHI2);
            } finally {
            }
        }
    }

    @Override // A72.Wre, Pj0.fuX
    public void n(Object obj) {
        C.Uo(obj);
        int iTy = ty(obj);
        int iHI = HI(iTy);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.j jVarQie = qie(iTy);
                if (!this.f52420O.remove(obj)) {
                    Dzy.j.J2(this.f52421n, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iTy));
                    mUb(obj);
                    this.xMQ.rl(iHI);
                } else if (jVarQie != null && !jVarQie.J2() && !o() && Z(obj)) {
                    jVarQie.KN(obj);
                    this.KN.rl(iHI);
                    this.Uo.n(iHI);
                    this.xMQ.t(iHI);
                    if (Dzy.j.az(2)) {
                        Dzy.j.ck(this.f52421n, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iTy));
                    }
                } else {
                    if (jVarQie != null) {
                        jVarQie.rl();
                    }
                    if (Dzy.j.az(2)) {
                        Dzy.j.ck(this.f52421n, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iTy));
                    }
                    mUb(obj);
                    this.Uo.n(iHI);
                    this.xMQ.rl(iHI);
                }
                S();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public BasePool(A72.Ml ml, nKK nkk, DAz dAz, boolean z2) {
        this(ml, nkk, dAz);
        this.mUb = z2;
    }
}
