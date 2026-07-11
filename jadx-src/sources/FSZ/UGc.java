package FSZ;

import FSZ.Q;
import FSZ.qz;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class UGc implements qz, Q {
    private final Q.j J2;
    protected r KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Z f2600O;
    private final Hh.qz Uo;
    private final boolean gh;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz.n f2601n;
    final o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final o f2602t;
    final Map nr = new WeakHashMap();
    private long xMQ = SystemClock.uptimeMillis();

    class j implements Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Z f2603n;

        j(Z z2) {
            this.f2603n = z2;
        }

        @Override // FSZ.Z
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(qz.j jVar) {
            return UGc.this.mUb ? jVar.Uo : this.f2603n.n(jVar.rl.eF());
        }
    }

    class n implements Pj0.fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ qz.j f2604n;

        n(qz.j jVar) {
            this.f2604n = jVar;
        }

        @Override // Pj0.fuX
        public void n(Object obj) {
            UGc.this.aYN(this.f2604n);
        }
    }

    private synchronized boolean HI(qz.j jVar) {
        if (jVar.nr || jVar.f2620t != 0) {
            return false;
        }
        this.rl.Uo(jVar.f2619n, jVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean KN(int i2) {
        boolean z2;
        if (i2 <= this.KN.f2621O) {
            if (mUb() <= this.KN.rl - 1) {
                z2 = gh() <= this.KN.f2622n - i2;
            }
        }
        return z2;
    }

    private synchronized Pj0.j S(qz.j jVar) {
        qie(jVar);
        return Pj0.j.Mx(jVar.rl.eF(), new n(jVar));
    }

    private synchronized ArrayList ViF(int i2, int i3) {
        int iMax = Math.max(i2, 0);
        int iMax2 = Math.max(i3, 0);
        if (this.rl.t() <= iMax && this.rl.O() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.rl.t() <= iMax && this.rl.O() <= iMax2) {
                break;
            }
            Object objNr = this.rl.nr();
            if (objNr != null) {
                this.rl.KN(objNr);
                arrayList.add((qz.j) this.f2602t.KN(objNr));
            } else {
                if (!this.gh) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.rl.t()), Integer.valueOf(this.rl.O())));
                }
                this.rl.xMQ();
            }
        }
        return arrayList;
    }

    private synchronized Pj0.j WPU(qz.j jVar) {
        Hh.C.Uo(jVar);
        return (jVar.nr && jVar.f2620t == 0) ? jVar.rl : null;
    }

    private synchronized void XQ() {
        if (this.xMQ + this.KN.J2 > SystemClock.uptimeMillis()) {
            return;
        }
        this.xMQ = SystemClock.uptimeMillis();
        this.KN = (r) Hh.C.KN((r) this.Uo.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized void az(qz.j jVar) {
        Hh.C.Uo(jVar);
        Hh.C.xMQ(!jVar.nr);
        jVar.nr = true;
    }

    private synchronized void qie(qz.j jVar) {
        Hh.C.Uo(jVar);
        Hh.C.xMQ(!jVar.nr);
        jVar.f2620t++;
    }

    private synchronized void ty(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                az((qz.j) it.next());
            }
        }
    }

    private synchronized void xMQ(qz.j jVar) {
        Hh.C.Uo(jVar);
        Hh.C.xMQ(jVar.f2620t > 0);
        jVar.f2620t--;
    }

    public void Ik() {
        ArrayList arrayListViF;
        synchronized (this) {
            r rVar = this.KN;
            int iMin = Math.min(rVar.nr, rVar.rl - mUb());
            r rVar2 = this.KN;
            arrayListViF = ViF(iMin, Math.min(rVar2.f2623t, rVar2.f2622n - gh()));
            ty(arrayListViF);
        }
        ck(arrayListViF);
        Z(arrayListViF);
    }

    @Override // FSZ.Q
    public synchronized boolean contains(Object obj) {
        return this.f2602t.n(obj);
    }

    public synchronized int gh() {
        return this.f2602t.O() - this.rl.O();
    }

    public synchronized int mUb() {
        return this.f2602t.t() - this.rl.t();
    }

    private void Z(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((qz.j) it.next());
            }
        }
    }

    private void ck(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pj0.j.M7(WPU((qz.j) it.next()));
            }
        }
    }

    private Z nY(Z z2) {
        return new j(z2);
    }

    private static void o(qz.j jVar) {
        qz.n nVar;
        if (jVar == null || (nVar = jVar.f2618O) == null) {
            return;
        }
        nVar.n(jVar.f2619n, false);
    }

    private static void r(qz.j jVar) {
        qz.n nVar;
        if (jVar == null || (nVar = jVar.f2618O) == null) {
            return;
        }
        nVar.n(jVar.f2619n, true);
    }

    @Override // FSZ.Q
    public Pj0.j O(Object obj, Pj0.j jVar) {
        return t(obj, jVar, this.f2601n);
    }

    public UGc(Z z2, Q.j jVar, Hh.qz qzVar, qz.n nVar, boolean z3, boolean z4) {
        this.f2600O = z2;
        this.rl = new o(nY(z2));
        this.f2602t = new o(nY(z2));
        this.J2 = jVar;
        this.Uo = qzVar;
        this.KN = (r) Hh.C.KN((r) qzVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f2601n = nVar;
        this.mUb = z3;
        this.gh = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aYN(qz.j jVar) {
        boolean zHI;
        Pj0.j jVarWPU;
        Hh.C.Uo(jVar);
        synchronized (this) {
            xMQ(jVar);
            zHI = HI(jVar);
            jVarWPU = WPU(jVar);
        }
        Pj0.j.M7(jVarWPU);
        if (!zHI) {
            jVar = null;
        }
        r(jVar);
        XQ();
        Ik();
    }

    @Override // FSZ.Q
    public Pj0.j get(Object obj) {
        qz.j jVar;
        Pj0.j jVarS;
        Hh.C.Uo(obj);
        synchronized (this) {
            try {
                jVar = (qz.j) this.rl.KN(obj);
                qz.j jVar2 = (qz.j) this.f2602t.rl(obj);
                if (jVar2 != null) {
                    jVarS = S(jVar2);
                } else {
                    jVarS = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o(jVar);
        XQ();
        Ik();
        return jVarS;
    }

    @Override // FSZ.qz
    public Pj0.j nr(Object obj) {
        qz.j jVar;
        boolean z2;
        Pj0.j jVar2;
        Hh.C.Uo(obj);
        synchronized (this) {
            try {
                jVar = (qz.j) this.rl.KN(obj);
                z2 = false;
                if (jVar != null) {
                    qz.j jVar3 = (qz.j) this.f2602t.KN(obj);
                    Hh.C.Uo(jVar3);
                    if (jVar3.f2620t == 0) {
                        z2 = true;
                    }
                    Hh.C.xMQ(z2);
                    jVar2 = jVar3.rl;
                    z2 = true;
                } else {
                    jVar2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            o(jVar);
        }
        return jVar2;
    }

    @Override // FSZ.Q
    public void rl(Object obj) {
        Hh.C.Uo(obj);
        synchronized (this) {
            try {
                qz.j jVar = (qz.j) this.rl.KN(obj);
                if (jVar != null) {
                    this.rl.Uo(obj, jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // FSZ.qz
    public Pj0.j t(Object obj, Pj0.j jVar, qz.n nVar) {
        qz.j jVar2;
        Pj0.j jVarS;
        Pj0.j jVarWPU;
        qz.j jVarRl;
        Hh.C.Uo(obj);
        Hh.C.Uo(jVar);
        XQ();
        synchronized (this) {
            try {
                jVar2 = (qz.j) this.rl.KN(obj);
                qz.j jVar3 = (qz.j) this.f2602t.KN(obj);
                jVarS = null;
                if (jVar3 != null) {
                    az(jVar3);
                    jVarWPU = WPU(jVar3);
                } else {
                    jVarWPU = null;
                }
                int iN = this.f2600O.n(jVar.eF());
                if (KN(iN)) {
                    if (this.mUb) {
                        jVarRl = qz.j.n(obj, jVar, iN, nVar);
                    } else {
                        jVarRl = qz.j.rl(obj, jVar, nVar);
                    }
                    this.f2602t.Uo(obj, jVarRl);
                    jVarS = S(jVarRl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Pj0.j.M7(jVarWPU);
        o(jVar2);
        Ik();
        return jVarS;
    }
}
