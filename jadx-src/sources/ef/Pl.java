package ef;

import B.j;
import FQq.SPz;
import QJ.C;
import QJ.C1428c;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Pl implements qz, j.n, C {
    private final B.j HI;
    private final com.airbnb.lottie.Xo J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f63800O;
    private final C.j Uo;
    private final B.j az;
    private final B.j ck;
    private final B.j gh;
    private final B.j mUb;
    private final B.j qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f63802r;
    private final B.j ty;
    private final boolean xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f63801n = new Path();
    private final Path rl = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PathMeasure f63803t = new PathMeasure();
    private final float[] nr = new float[2];
    private final n Ik = new n();

    private void gh() {
        this.f63802r = false;
        this.J2.invalidateSelf();
    }

    @Override // ef.w6
    public void rl(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            w6 w6Var = (w6) list.get(i2);
            if (w6Var instanceof s4) {
                s4 s4Var = (s4) w6Var;
                if (s4Var.gh() == C1428c.j.SIMULTANEOUSLY) {
                    this.Ik.n(s4Var);
                    s4Var.O(this);
                }
            }
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f63804n;

        static {
            int[] iArr = new int[C.j.values().length];
            f63804n = iArr;
            try {
                iArr[C.j.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63804n[C.j.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void mUb() {
        float f3;
        float f4;
        int i2;
        float fCos;
        float fSin;
        float f5;
        float f6;
        double d2;
        float f7;
        int i3;
        float f8;
        double d4;
        float f9;
        float f10;
        double d5;
        float f11;
        float f12;
        float fFloatValue = ((Float) this.mUb.KN()).floatValue();
        double radians = Math.toRadians((this.qie == null ? 0.0d : ((Float) r2.KN()).floatValue()) - 90.0d);
        double d6 = fFloatValue;
        float f13 = (float) (6.283185307179586d / d6);
        if (this.xMQ) {
            f13 *= -1.0f;
        }
        float f14 = f13 / 2.0f;
        float f15 = fFloatValue - ((int) fFloatValue);
        int i5 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i5 != 0) {
            radians += (double) ((1.0f - f15) * f14);
        }
        float fFloatValue2 = ((Float) this.ty.KN()).floatValue();
        float fFloatValue3 = ((Float) this.az.KN()).floatValue();
        B.j jVar = this.HI;
        float fFloatValue4 = jVar != null ? ((Float) jVar.KN()).floatValue() / 100.0f : 0.0f;
        B.j jVar2 = this.ck;
        float fFloatValue5 = jVar2 != null ? ((Float) jVar2.KN()).floatValue() / 100.0f : 0.0f;
        if (i5 != 0) {
            f7 = ((fFloatValue2 - fFloatValue3) * f15) + fFloatValue3;
            f4 = 0.0f;
            i2 = i5;
            double d7 = f7;
            f3 = 2.0f;
            float fCos2 = (float) (d7 * Math.cos(radians));
            fSin = (float) (d7 * Math.sin(radians));
            this.f63801n.moveTo(fCos2, fSin);
            d2 = radians + ((double) ((f13 * f15) / 2.0f));
            f5 = f15;
            fCos = fCos2;
            f6 = f14;
        } else {
            f3 = 2.0f;
            f4 = 0.0f;
            i2 = i5;
            double d8 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d8);
            fSin = (float) (d8 * Math.sin(radians));
            this.f63801n.moveTo(fCos, fSin);
            f5 = f15;
            f6 = f14;
            d2 = radians + ((double) f6);
            f7 = 0.0f;
        }
        double dCeil = Math.ceil(d6) * 2.0d;
        int i7 = 0;
        boolean z2 = false;
        double d9 = d2;
        float f16 = fSin;
        float f17 = fCos;
        double d10 = d9;
        while (true) {
            double d11 = i7;
            if (d11 >= dCeil) {
                PointF pointF = (PointF) this.gh.KN();
                this.f63801n.offset(pointF.x, pointF.y);
                this.f63801n.close();
                return;
            }
            float f18 = z2 ? fFloatValue2 : fFloatValue3;
            if (f7 == f4 || d11 != dCeil - 2.0d) {
                i3 = i7;
                f8 = f6;
            } else {
                i3 = i7;
                f8 = (f13 * f5) / f3;
            }
            if (f7 == f4 || d11 != dCeil - 1.0d) {
                d4 = d11;
                f9 = f18;
            } else {
                d4 = d11;
                f9 = f7;
            }
            double d12 = f9;
            float fCos3 = (float) (d12 * Math.cos(d10));
            float f19 = f13;
            float fSin2 = (float) (d12 * Math.sin(d10));
            if (fFloatValue4 == f4 && fFloatValue5 == f4) {
                this.f63801n.lineTo(fCos3, fSin2);
                f12 = fCos3;
                f11 = fSin2;
                f10 = f6;
                d5 = d10;
            } else {
                f10 = f6;
                d5 = d10;
                double dAtan2 = (float) (Math.atan2(f16, f17) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f20 = f17;
                float f21 = f16;
                f11 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f22 = z2 ? fFloatValue4 : fFloatValue5;
                float f23 = z2 ? fFloatValue5 : fFloatValue4;
                float f24 = (z2 ? fFloatValue3 : fFloatValue2) * f22 * 0.47829f;
                float f25 = fCos4 * f24;
                float f26 = f24 * fSin3;
                float f27 = (z2 ? fFloatValue2 : fFloatValue3) * f23 * 0.47829f;
                float f28 = fCos5 * f27;
                float f29 = f27 * fSin4;
                if (i2 != 0) {
                    if (i3 == 0) {
                        f25 *= f5;
                        f26 *= f5;
                    } else if (d4 == dCeil - 1.0d) {
                        f28 *= f5;
                        f29 *= f5;
                    }
                }
                f12 = fCos3;
                this.f63801n.cubicTo(f20 - f25, f21 - f26, fCos3 + f28, f11 + f29, f12, f11);
            }
            d10 = d5 + ((double) f8);
            z2 = !z2;
            i7 = i3 + 1;
            f6 = f10;
            f17 = f12;
            f16 = f11;
            f13 = f19;
        }
    }

    private void xMQ() {
        double d2;
        float f3;
        float f4;
        float f5;
        int iFloor = (int) Math.floor(((Float) this.mUb.KN()).floatValue());
        double radians = Math.toRadians((this.qie == null ? 0.0d : ((Float) r2.KN()).floatValue()) - 90.0d);
        double d4 = iFloor;
        float fFloatValue = ((Float) this.ck.KN()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.ty.KN()).floatValue();
        double d5 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d5);
        float fSin = (float) (Math.sin(radians) * d5);
        this.f63801n.moveTo(fCos, fSin);
        double d6 = (float) (6.283185307179586d / d4);
        double dCeil = Math.ceil(d4);
        double d7 = radians + d6;
        int i2 = 0;
        while (true) {
            double d8 = i2;
            if (d8 >= dCeil) {
                PointF pointF = (PointF) this.gh.KN();
                this.f63801n.offset(pointF.x, pointF.y);
                this.f63801n.close();
                return;
            }
            float fCos2 = (float) (d5 * Math.cos(d7));
            float fSin2 = (float) (Math.sin(d7) * d5);
            if (fFloatValue != 0.0f) {
                d2 = dCeil;
                f3 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f6 = fFloatValue2 * f3 * 0.25f;
                float f7 = f6 * fCos3;
                float f8 = f6 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan22)) * f6;
                float fSin4 = f6 * ((float) Math.sin(dAtan22));
                if (d8 == d2 - 1.0d) {
                    this.rl.reset();
                    this.rl.moveTo(fCos, fSin);
                    float f9 = fCos - f7;
                    float f10 = fSin - f8;
                    float f11 = fCos2 + fCos4;
                    float f12 = fSin2 + fSin4;
                    f4 = fCos2;
                    f5 = fSin2;
                    this.rl.cubicTo(f9, f10, f11, f12, f4, f5);
                    this.f63803t.setPath(this.rl, false);
                    PathMeasure pathMeasure = this.f63803t;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.nr, null);
                    Path path = this.f63801n;
                    float[] fArr = this.nr;
                    path.cubicTo(f9, f10, f11, f12, fArr[0], fArr[1]);
                } else {
                    f4 = fCos2;
                    f5 = fSin2;
                    this.f63801n.cubicTo(fCos - f7, fSin - f8, f4 + fCos4, f5 + fSin4, f4, f5);
                }
                fCos = f4;
                fSin = f5;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d2 = dCeil;
                f3 = fFloatValue;
                if (d8 == d2 - 1.0d) {
                    i2++;
                    dCeil = d2;
                    fFloatValue = f3;
                } else {
                    this.f63801n.lineTo(fCos, fSin);
                }
            }
            d7 += d6;
            i2++;
            dCeil = d2;
            fFloatValue = f3;
        }
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        B.j jVar;
        B.j jVar2;
        if (obj == SPz.WPU) {
            this.mUb.HI(w6Var);
            return;
        }
        if (obj == SPz.aYN) {
            this.qie.HI(w6Var);
            return;
        }
        if (obj == SPz.ty) {
            this.gh.HI(w6Var);
            return;
        }
        if (obj == SPz.ViF && (jVar2 = this.az) != null) {
            jVar2.HI(w6Var);
            return;
        }
        if (obj == SPz.nY) {
            this.ty.HI(w6Var);
            return;
        }
        if (obj == SPz.f2550g && (jVar = this.HI) != null) {
            jVar.HI(w6Var);
        } else if (obj == SPz.te) {
            this.ck.HI(w6Var);
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.f63800O;
    }

    @Override // ef.qz
    public Path getPath() {
        if (this.f63802r) {
            return this.f63801n;
        }
        this.f63801n.reset();
        if (this.KN) {
            this.f63802r = true;
            return this.f63801n;
        }
        int i2 = j.f63804n[this.Uo.ordinal()];
        if (i2 == 1) {
            mUb();
        } else if (i2 == 2) {
            xMQ();
        }
        this.f63801n.close();
        this.Ik.rl(this.f63801n);
        this.f63802r = true;
        return this.f63801n;
    }

    public Pl(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.C c2) {
        this.J2 = xo;
        this.f63800O = c2.nr();
        C.j jVarMUb = c2.mUb();
        this.Uo = jVarMUb;
        this.KN = c2.gh();
        this.xMQ = c2.qie();
        B.Ml mlN = c2.Uo().n();
        this.mUb = mlN;
        B.j jVarN = c2.KN().n();
        this.gh = jVarN;
        B.Ml mlN2 = c2.xMQ().n();
        this.qie = mlN2;
        B.Ml mlN3 = c2.O().n();
        this.ty = mlN3;
        B.Ml mlN4 = c2.J2().n();
        this.ck = mlN4;
        C.j jVar = C.j.STAR;
        if (jVarMUb == jVar) {
            this.az = c2.rl().n();
            this.HI = c2.t().n();
        } else {
            this.az = null;
            this.HI = null;
        }
        nVar.mUb(mlN);
        nVar.mUb(jVarN);
        nVar.mUb(mlN2);
        nVar.mUb(mlN3);
        nVar.mUb(mlN4);
        if (jVarMUb == jVar) {
            nVar.mUb(this.az);
            nVar.mUb(this.HI);
        }
        mlN.n(this);
        jVarN.n(this);
        mlN2.n(this);
        mlN3.n(this);
        mlN4.n(this);
        if (jVarMUb == jVar) {
            this.az.n(this);
            this.HI.n(this);
        }
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
    }

    @Override // B.j.n
    public void n() {
        gh();
    }
}
