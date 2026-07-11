package c;

import Rc.w6;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class AbstractC1671c {
    private static SparseArrayCompat rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Interpolator f43426n = new LinearInterpolator();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static w6.j f43427t = w6.j.n("t", CmcdData.STREAMING_FORMAT_SS, "e", "o", CmcdData.OBJECT_TYPE_INIT_SEGMENT, CmcdData.STREAMING_FORMAT_HLS, "to", "ti");
    static w6.j nr = w6.j.n("x", "y");

    private static void KN(int i2, WeakReference weakReference) {
        synchronized (AbstractC1671c.class) {
            rl.az(i2, weakReference);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Ect.j O(FQq.Dsr dsr, Rc.w6 w6Var, float f3, vd vdVar) {
        Interpolator interpolatorRl;
        Interpolator interpolatorRl2;
        Interpolator interpolatorRl3;
        Object obj;
        Interpolator interpolator;
        PointF pointF;
        PointF pointF2;
        Ect.j jVar;
        PointF pointF3;
        boolean z2;
        float f4;
        w6Var.Uo();
        boolean z3 = false;
        PointF pointFO = null;
        PointF pointFO2 = null;
        PointF pointF4 = null;
        Object objN = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointFO3 = null;
        PointF pointFO4 = null;
        float fM7 = 0.0f;
        Object objN2 = null;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43427t)) {
                case 0:
                    fM7 = (float) w6Var.M7();
                    break;
                case 1:
                    objN = vdVar.n(w6Var, f3);
                    break;
                case 2:
                    objN2 = vdVar.n(w6Var, f3);
                    break;
                case 3:
                    boolean z4 = z3;
                    if (w6Var.a() == w6.n.BEGIN_OBJECT) {
                        w6Var.Uo();
                        float fM72 = 0.0f;
                        float fM73 = 0.0f;
                        float fM74 = 0.0f;
                        float fM75 = 0.0f;
                        while (w6Var.jB()) {
                            int iMx = w6Var.Mx(nr);
                            if (iMx == 0) {
                                pointF3 = pointF6;
                                w6.n nVarA = w6Var.a();
                                w6.n nVar = w6.n.NUMBER;
                                if (nVarA == nVar) {
                                    fM74 = (float) w6Var.M7();
                                    fM72 = fM74;
                                } else {
                                    w6Var.rl();
                                    fM72 = (float) w6Var.M7();
                                    fM74 = w6Var.a() == nVar ? (float) w6Var.M7() : fM72;
                                    w6Var.Z();
                                }
                            } else if (iMx != 1) {
                                w6Var.n1();
                            } else {
                                w6.n nVarA2 = w6Var.a();
                                w6.n nVar2 = w6.n.NUMBER;
                                if (nVarA2 == nVar2) {
                                    pointF3 = pointF6;
                                    fM75 = (float) w6Var.M7();
                                    fM73 = fM75;
                                } else {
                                    pointF3 = pointF6;
                                    w6Var.rl();
                                    fM73 = (float) w6Var.M7();
                                    fM75 = w6Var.a() == nVar2 ? (float) w6Var.M7() : fM73;
                                    w6Var.Z();
                                }
                            }
                            pointF6 = pointF3;
                        }
                        pointF4 = new PointF(fM72, fM73);
                        pointF5 = new PointF(fM74, fM75);
                        w6Var.T();
                    } else {
                        pointFO = l3D.O(w6Var, f3);
                    }
                    z3 = z4;
                    break;
                case 4:
                    if (w6Var.a() != w6.n.BEGIN_OBJECT) {
                        pointFO2 = l3D.O(w6Var, f3);
                    } else {
                        w6Var.Uo();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float fM76 = 0.0f;
                        float fM77 = 0.0f;
                        while (w6Var.jB()) {
                            int iMx2 = w6Var.Mx(nr);
                            if (iMx2 != 0) {
                                z2 = z3;
                                if (iMx2 != 1) {
                                    w6Var.n1();
                                } else {
                                    w6.n nVarA3 = w6Var.a();
                                    w6.n nVar3 = w6.n.NUMBER;
                                    if (nVarA3 == nVar3) {
                                        fM77 = (float) w6Var.M7();
                                        f6 = fM77;
                                    } else {
                                        w6Var.rl();
                                        PointF pointF8 = pointFO3;
                                        float fM78 = (float) w6Var.M7();
                                        fM77 = w6Var.a() == nVar3 ? (float) w6Var.M7() : fM78;
                                        w6Var.Z();
                                        pointFO3 = pointF8;
                                        f6 = fM78;
                                    }
                                }
                            } else {
                                z2 = z3;
                                PointF pointF9 = pointFO3;
                                w6.n nVarA4 = w6Var.a();
                                w6.n nVar4 = w6.n.NUMBER;
                                if (nVarA4 == nVar4) {
                                    pointFO3 = pointF9;
                                    fM76 = (float) w6Var.M7();
                                    f5 = fM76;
                                } else {
                                    pointFO3 = pointF9;
                                    w6Var.rl();
                                    float fM79 = (float) w6Var.M7();
                                    if (w6Var.a() == nVar4) {
                                        f4 = fM79;
                                        fM76 = (float) w6Var.M7();
                                    } else {
                                        f4 = fM79;
                                        fM76 = f4;
                                    }
                                    w6Var.Z();
                                    f5 = f4;
                                }
                            }
                            z3 = z2;
                        }
                        PointF pointF10 = new PointF(f5, f6);
                        PointF pointF11 = new PointF(fM76, fM77);
                        w6Var.T();
                        pointF7 = pointF11;
                        pointF6 = pointF10;
                    }
                    break;
                case 5:
                    z3 = w6Var.p5() == 1;
                    break;
                case 6:
                    pointFO3 = l3D.O(w6Var, f3);
                    break;
                case 7:
                    pointFO4 = l3D.O(w6Var, f3);
                    break;
                default:
                    w6Var.n1();
                    break;
            }
        }
        boolean z5 = z3;
        PointF pointF12 = pointF6;
        w6Var.T();
        if (z5) {
            interpolator = f43426n;
            obj = objN;
        } else {
            if (pointFO == null || pointFO2 == null) {
                if (pointF4 != null && pointF5 != null && pointF12 != null && pointF7 != null) {
                    interpolatorRl2 = rl(pointF4, pointF12);
                    interpolatorRl3 = rl(pointF5, pointF7);
                    obj = objN2;
                    interpolator = null;
                    if (interpolatorRl2 != null || interpolatorRl3 == null) {
                        pointF = pointFO3;
                        pointF2 = pointFO4;
                        jVar = new Ect.j(dsr, objN, obj, interpolator, fM7, null);
                    } else {
                        pointF2 = pointFO4;
                        pointF = pointFO3;
                        jVar = new Ect.j(dsr, objN, obj, interpolatorRl2, interpolatorRl3, fM7, null);
                    }
                    jVar.HI = pointF;
                    jVar.ck = pointF2;
                    return jVar;
                }
                interpolatorRl = f43426n;
            } else {
                interpolatorRl = rl(pointFO, pointFO2);
            }
            interpolator = interpolatorRl;
            obj = objN2;
        }
        interpolatorRl2 = null;
        interpolatorRl3 = null;
        if (interpolatorRl2 != null) {
            pointF = pointFO3;
            pointF2 = pointFO4;
            jVar = new Ect.j(dsr, objN, obj, interpolator, fM7, null);
        }
        jVar.HI = pointF;
        jVar.ck = pointF2;
        return jVar;
    }

    private static SparseArrayCompat Uo() {
        if (rl == null) {
            rl = new SparseArrayCompat();
        }
        return rl;
    }

    private static WeakReference n(int i2) {
        WeakReference weakReference;
        synchronized (AbstractC1671c.class) {
            weakReference = (WeakReference) Uo().O(i2);
        }
        return weakReference;
    }

    private static Interpolator rl(PointF pointF, PointF pointF2) {
        Interpolator interpolatorN;
        pointF.x = x0.o.rl(pointF.x, -1.0f, 1.0f);
        pointF.y = x0.o.rl(pointF.y, -100.0f, 100.0f);
        pointF2.x = x0.o.rl(pointF2.x, -1.0f, 1.0f);
        float fRl = x0.o.rl(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fRl;
        int iXMQ = x0.eO.xMQ(pointF.x, pointF.y, pointF2.x, fRl);
        WeakReference weakReferenceN = FQq.I28.O() ? null : n(iXMQ);
        Interpolator interpolator = weakReferenceN != null ? (Interpolator) weakReferenceN.get() : null;
        if (weakReferenceN != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorN = PathInterpolatorCompat.n(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            interpolatorN = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? PathInterpolatorCompat.n(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!FQq.I28.O()) {
            try {
                KN(iXMQ, new WeakReference(interpolatorN));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorN;
    }

    static Ect.j t(Rc.w6 w6Var, FQq.Dsr dsr, float f3, vd vdVar, boolean z2, boolean z3) {
        return (z2 && z3) ? O(dsr, w6Var, f3, vdVar) : z2 ? nr(dsr, w6Var, f3, vdVar) : J2(w6Var, f3, vdVar);
    }

    private static Ect.j J2(Rc.w6 w6Var, float f3, vd vdVar) {
        return new Ect.j(vdVar.n(w6Var, f3));
    }

    private static Ect.j nr(FQq.Dsr dsr, Rc.w6 w6Var, float f3, vd vdVar) {
        Interpolator interpolatorRl;
        Interpolator interpolator;
        Object obj;
        w6Var.Uo();
        PointF pointFO = null;
        Object objN = null;
        Object objN2 = null;
        PointF pointFO2 = null;
        PointF pointFO3 = null;
        float fM7 = 0.0f;
        boolean z2 = false;
        PointF pointFO4 = null;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43427t)) {
                case 0:
                    fM7 = (float) w6Var.M7();
                    break;
                case 1:
                    objN2 = vdVar.n(w6Var, f3);
                    break;
                case 2:
                    objN = vdVar.n(w6Var, f3);
                    break;
                case 3:
                    pointFO = l3D.O(w6Var, 1.0f);
                    break;
                case 4:
                    pointFO4 = l3D.O(w6Var, 1.0f);
                    break;
                case 5:
                    if (w6Var.p5() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    break;
                case 6:
                    pointFO2 = l3D.O(w6Var, f3);
                    break;
                case 7:
                    pointFO3 = l3D.O(w6Var, f3);
                    break;
                default:
                    w6Var.n1();
                    break;
            }
        }
        w6Var.T();
        if (z2) {
            interpolator = f43426n;
            obj = objN2;
        } else {
            if (pointFO != null && pointFO4 != null) {
                interpolatorRl = rl(pointFO, pointFO4);
            } else {
                interpolatorRl = f43426n;
            }
            interpolator = interpolatorRl;
            obj = objN;
        }
        Ect.j jVar = new Ect.j(dsr, objN2, obj, interpolator, fM7, null);
        jVar.HI = pointFO2;
        jVar.ck = pointFO3;
        return jVar;
    }
}
