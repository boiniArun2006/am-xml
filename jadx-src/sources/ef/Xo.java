package ef;

import B.j;
import FQq.SPz;
import QJ.C1428c;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Xo implements j.n, C, qz {
    private final B.j J2;
    private final B.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.airbnb.lottie.Xo f63811O;
    private final B.j Uo;
    private boolean gh;
    private final boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f63813t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f63812n = new Path();
    private final RectF rl = new RectF();
    private final n xMQ = new n();
    private B.j mUb = null;

    private void xMQ() {
        this.gh = false;
        this.f63811O.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // ef.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rl(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            w6 w6Var = (w6) list.get(i2);
            if (w6Var instanceof s4) {
                s4 s4Var = (s4) w6Var;
                if (s4Var.gh() == C1428c.j.SIMULTANEOUSLY) {
                    this.xMQ.n(s4Var);
                    s4Var.O(this);
                } else if (w6Var instanceof z) {
                    this.mUb = ((z) w6Var).xMQ();
                }
            }
        }
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.qie) {
            this.Uo.HI(w6Var);
        } else if (obj == SPz.ty) {
            this.J2.HI(w6Var);
        } else if (obj == SPz.az) {
            this.KN.HI(w6Var);
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.f63813t;
    }

    @Override // ef.qz
    public Path getPath() {
        B.j jVar;
        if (this.gh) {
            return this.f63812n;
        }
        this.f63812n.reset();
        if (this.nr) {
            this.gh = true;
            return this.f63812n;
        }
        PointF pointF = (PointF) this.Uo.KN();
        float f3 = pointF.x / 2.0f;
        float f4 = pointF.y / 2.0f;
        B.j jVar2 = this.KN;
        float fR = jVar2 == null ? 0.0f : ((B.Ml) jVar2).r();
        if (fR == 0.0f && (jVar = this.mUb) != null) {
            fR = Math.min(((Float) jVar.KN()).floatValue(), Math.min(f3, f4));
        }
        float fMin = Math.min(f3, f4);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointF2 = (PointF) this.J2.KN();
        this.f63812n.moveTo(pointF2.x + f3, (pointF2.y - f4) + fR);
        this.f63812n.lineTo(pointF2.x + f3, (pointF2.y + f4) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.rl;
            float f5 = pointF2.x;
            float f6 = fR * 2.0f;
            float f7 = pointF2.y;
            rectF.set((f5 + f3) - f6, (f7 + f4) - f6, f5 + f3, f7 + f4);
            this.f63812n.arcTo(this.rl, 0.0f, 90.0f, false);
        }
        this.f63812n.lineTo((pointF2.x - f3) + fR, pointF2.y + f4);
        if (fR > 0.0f) {
            RectF rectF2 = this.rl;
            float f8 = pointF2.x;
            float f9 = pointF2.y;
            float f10 = fR * 2.0f;
            rectF2.set(f8 - f3, (f9 + f4) - f10, (f8 - f3) + f10, f9 + f4);
            this.f63812n.arcTo(this.rl, 90.0f, 90.0f, false);
        }
        this.f63812n.lineTo(pointF2.x - f3, (pointF2.y - f4) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.rl;
            float f11 = pointF2.x;
            float f12 = pointF2.y;
            float f13 = fR * 2.0f;
            rectF3.set(f11 - f3, f12 - f4, (f11 - f3) + f13, (f12 - f4) + f13);
            this.f63812n.arcTo(this.rl, 180.0f, 90.0f, false);
        }
        this.f63812n.lineTo((pointF2.x + f3) - fR, pointF2.y - f4);
        if (fR > 0.0f) {
            RectF rectF4 = this.rl;
            float f14 = pointF2.x;
            float f15 = fR * 2.0f;
            float f16 = pointF2.y;
            rectF4.set((f14 + f3) - f15, f16 - f4, f14 + f3, (f16 - f4) + f15);
            this.f63812n.arcTo(this.rl, 270.0f, 90.0f, false);
        }
        this.f63812n.close();
        this.xMQ.rl(this.f63812n);
        this.gh = true;
        return this.f63812n;
    }

    public Xo(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.o oVar) {
        this.f63813t = oVar.t();
        this.nr = oVar.J2();
        this.f63811O = xo;
        B.j jVarN = oVar.nr().n();
        this.J2 = jVarN;
        B.j jVarN2 = oVar.O().n();
        this.Uo = jVarN2;
        B.Ml mlN = oVar.rl().n();
        this.KN = mlN;
        nVar.mUb(jVarN);
        nVar.mUb(jVarN2);
        nVar.mUb(mlN);
        jVarN.n(this);
        jVarN2.n(this);
        mlN.n(this);
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
    }

    @Override // B.j.n
    public void n() {
        xMQ();
    }
}
