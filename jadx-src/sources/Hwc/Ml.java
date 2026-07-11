package Hwc;

import FSZ.Q;
import Hh.C;
import Hh.Dsr;
import Hh.qz;
import OLt.InterfaceC1421z;
import OLt.Xo;
import QVk.o;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bA.InterfaceC1656I28;
import bA.InterfaceC1664qz;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sp.C2364j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml extends SY6.j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Class f3989v = Ml.class;
    private qz E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Set f3990N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private XJa.j f3991T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Hh.Wre f3992X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3993e;
    private lN.Ml fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ypp.j f3994g;
    private final Q iF;
    private com.facebook.imagepipeline.request.j nHg;
    private final Resources nY;
    private com.facebook.imagepipeline.request.j[] s7N;
    private final Hh.Wre te;
    private com.facebook.imagepipeline.request.j wTp;

    public Ml(Resources resources, TD.j jVar, ypp.j jVar2, ypp.j jVar3, Executor executor, Q q2, Hh.Wre wre) {
        super(jVar, executor, null, null);
        this.nY = resources;
        this.f3994g = new j(resources, jVar2, jVar3);
        this.te = wre;
        this.iF = q2;
    }

    private Drawable Mx(Hh.Wre wre, InterfaceC1656I28 interfaceC1656I28) {
        Drawable drawableN;
        if (wre == null) {
            return null;
        }
        Iterator<E> it = wre.iterator();
        while (it.hasNext()) {
            ypp.j jVar = (ypp.j) it.next();
            if (jVar.rl(interfaceC1656I28) && (drawableN = jVar.n(interfaceC1656I28)) != null) {
                return drawableN;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Xo z(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof Xo) {
            return (Xo) drawable;
        }
        if (drawable instanceof OLt.w6) {
            return z(((OLt.w6) drawable).n());
        }
        if (drawable instanceof OLt.j) {
            OLt.j jVar = (OLt.j) drawable;
            int iO = jVar.O();
            for (int i2 = 0; i2 < iO; i2++) {
                Xo xoZ = z(jVar.rl(i2));
                if (xoZ != null) {
                    return xoZ;
                }
            }
        }
        return null;
    }

    protected synchronized void C(QVk.CN3 cn3, SY6.n nVar) {
        try {
            XJa.j jVar = this.f3991T;
            if (jVar != null) {
                jVar.J2();
            }
            if (cn3 != null) {
                if (this.f3991T == null) {
                    this.f3991T = new XJa.j(AwakeTimeSinceBootClock.get(), this);
                }
                this.f3991T.t(cn3);
                this.f3991T.Uo(true);
            }
            this.nHg = (com.facebook.imagepipeline.request.j) nVar.ty();
            this.s7N = (com.facebook.imagepipeline.request.j[]) nVar.az();
            this.wTp = (com.facebook.imagepipeline.request.j) nVar.HI();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k(jl.I28 i28) {
        try {
            if (this.f3990N == null) {
                this.f3990N = new HashSet();
            }
            this.f3990N.add(i28);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n1(jl.I28 i28) {
        Set set = this.f3990N;
        if (set == null) {
            return;
        }
        set.remove(i28);
    }

    public synchronized jl.I28 xg() {
        Set set = this.f3990N;
        if (set == null) {
            return null;
        }
        return new jl.w6(set);
    }

    private void G7(InterfaceC1656I28 interfaceC1656I28) {
        if (this.f3993e) {
            if (Ik() == null) {
                C2364j c2364j = new C2364j();
                xMQ(new jp5.j(c2364j));
                B(c2364j);
            }
            if (Ik() instanceof C2364j) {
                qm(interfaceC1656I28, (C2364j) Ik());
            }
        }
    }

    private void pJg(qz qzVar) {
        this.E2 = qzVar;
        G7(null);
    }

    public void Jk(Hh.Wre wre) {
        this.f3992X = wre;
    }

    public void Rl(boolean z2) {
        this.f3993e = z2;
    }

    @Override // SY6.j
    protected Uri ViF() {
        return o.n(this.nHg, this.wTp, this.s7N, com.facebook.imagepipeline.request.j.f52634g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // SY6.j
    protected void bzg(Drawable drawable) {
        if (drawable instanceof D5.j) {
            ((D5.j) drawable).n();
        }
    }

    @Override // SY6.j
    /* JADX INFO: renamed from: fcU, reason: merged with bridge method [inline-methods] */
    public Map nHg(InterfaceC1664qz interfaceC1664qz) {
        if (interfaceC1664qz == null) {
            return null;
        }
        return interfaceC1664qz.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int WPU(Pj0.j jVar) {
        if (jVar != null) {
            return jVar.M();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.j
    /* JADX INFO: renamed from: dR0, reason: merged with bridge method [inline-methods] */
    public Drawable gh(Pj0.j jVar) {
        try {
            if (T5.n.nr()) {
                T5.n.n("PipelineDraweeController#createDrawable");
            }
            C.xMQ(Pj0.j.FX(jVar));
            InterfaceC1656I28 interfaceC1656I28 = (InterfaceC1656I28) jVar.eF();
            G7(interfaceC1656I28);
            Drawable drawableMx = Mx(this.f3992X, interfaceC1656I28);
            if (drawableMx != null) {
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return drawableMx;
            }
            Drawable drawableMx2 = Mx(this.te, interfaceC1656I28);
            if (drawableMx2 != null) {
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return drawableMx2;
            }
            Drawable drawableN = this.f3994g.n(interfaceC1656I28);
            if (drawableN != null) {
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return drawableN;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + interfaceC1656I28);
        } catch (Throwable th) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.j
    /* JADX INFO: renamed from: eTf, reason: merged with bridge method [inline-methods] */
    public InterfaceC1664qz aYN(Pj0.j jVar) {
        C.xMQ(Pj0.j.FX(jVar));
        return ((InterfaceC1656I28) jVar.eF()).EWS();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.j
    /* JADX INFO: renamed from: eWT, reason: merged with bridge method [inline-methods] */
    public void wTp(String str, Pj0.j jVar) {
        super.wTp(str, jVar);
        synchronized (this) {
        }
    }

    protected String ijL() {
        Object objTy = ty();
        if (objTy == null) {
            return null;
        }
        return objTy.toString();
    }

    public void ofS(qz qzVar, String str, lN.Ml ml, Object obj, Hh.Wre wre) {
        if (T5.n.nr()) {
            T5.n.n("PipelineDraweeController#initialize");
        }
        super.iF(str, obj);
        pJg(qzVar);
        this.fD = ml;
        Jk(wre);
        G7(null);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.j
    /* JADX INFO: renamed from: piY, reason: merged with bridge method [inline-methods] */
    public Pj0.j az() {
        lN.Ml ml;
        if (T5.n.nr()) {
            T5.n.n("PipelineDraweeController#getCachedImage");
        }
        try {
            Q q2 = this.iF;
            if (q2 != null && (ml = this.fD) != null) {
                Pj0.j jVar = q2.get(ml);
                if (jVar != null && !((InterfaceC1656I28) jVar.eF()).mYa().n()) {
                    jVar.close();
                    return null;
                }
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return jVar;
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return null;
        } finally {
            if (T5.n.nr()) {
                T5.n.rl();
            }
        }
    }

    protected void qm(InterfaceC1656I28 interfaceC1656I28, C2364j c2364j) {
        Xo xoZ;
        c2364j.mUb(XQ());
        htt.n nVarO = O();
        InterfaceC1421z interfaceC1421zZ = null;
        if (nVarO != null && (xoZ = z(nVarO.nr())) != null) {
            interfaceC1421zZ = xoZ.Z();
        }
        c2364j.az(interfaceC1421zZ);
        String strIjL = ijL();
        if (strIjL != null) {
            c2364j.rl("cc", strIjL);
        }
        if (interfaceC1656I28 != null) {
            c2364j.gh(interfaceC1656I28.getWidth(), interfaceC1656I28.getHeight());
            c2364j.qie(interfaceC1656I28.getSizeInBytes());
        } else {
            c2364j.xMQ();
        }
    }

    @Override // SY6.j
    protected com.facebook.datasource.w6 r() {
        if (T5.n.nr()) {
            T5.n.n("PipelineDraweeController#getDataSource");
        }
        if (Dzy.j.az(2)) {
            Dzy.j.HI(f3989v, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.w6 w6Var = (com.facebook.datasource.w6) this.E2.get();
        if (T5.n.nr()) {
            T5.n.rl();
        }
        return w6Var;
    }

    @Override // SY6.j, htt.j
    public void t(htt.n nVar) {
        super.t(nVar);
        G7(null);
    }

    @Override // SY6.j
    public String toString() {
        return Dsr.rl(this).rl("super", super.toString()).rl("dataSourceSupplier", this.E2).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.j
    /* JADX INFO: renamed from: ul, reason: merged with bridge method [inline-methods] */
    public void jB(Pj0.j jVar) {
        Pj0.j.M7(jVar);
    }
}
