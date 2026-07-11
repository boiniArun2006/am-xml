package ef;

import B.j;
import FQq.SPz;
import QJ.C1428c;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Wre implements qz, j.n, C {
    private final QJ.n J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final B.j f63808O;
    private final B.j nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.Xo f63810t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f63809n = new Path();
    private final n Uo = new n();

    private void xMQ() {
        this.KN = false;
        this.f63810t.invalidateSelf();
    }

    @Override // ef.w6
    public void rl(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            w6 w6Var = (w6) list.get(i2);
            if (w6Var instanceof s4) {
                s4 s4Var = (s4) w6Var;
                if (s4Var.gh() == C1428c.j.SIMULTANEOUSLY) {
                    this.Uo.n(s4Var);
                    s4Var.O(this);
                }
            }
        }
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.gh) {
            this.nr.HI(w6Var);
        } else if (obj == SPz.ty) {
            this.f63808O.HI(w6Var);
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.rl;
    }

    @Override // ef.qz
    public Path getPath() {
        if (this.KN) {
            return this.f63809n;
        }
        this.f63809n.reset();
        if (this.J2.O()) {
            this.KN = true;
            return this.f63809n;
        }
        PointF pointF = (PointF) this.nr.KN();
        float f3 = pointF.x / 2.0f;
        float f4 = pointF.y / 2.0f;
        float f5 = f3 * 0.55228f;
        float f6 = 0.55228f * f4;
        this.f63809n.reset();
        if (this.J2.J2()) {
            float f7 = -f4;
            this.f63809n.moveTo(0.0f, f7);
            float f8 = 0.0f - f5;
            float f9 = -f3;
            float f10 = 0.0f - f6;
            this.f63809n.cubicTo(f8, f7, f9, f10, f9, 0.0f);
            float f11 = f6 + 0.0f;
            this.f63809n.cubicTo(f9, f11, f8, f4, 0.0f, f4);
            float f12 = f5 + 0.0f;
            this.f63809n.cubicTo(f12, f4, f3, f11, f3, 0.0f);
            this.f63809n.cubicTo(f3, f10, f12, f7, 0.0f, f7);
        } else {
            float f13 = -f4;
            this.f63809n.moveTo(0.0f, f13);
            float f14 = f5 + 0.0f;
            float f15 = 0.0f - f6;
            this.f63809n.cubicTo(f14, f13, f3, f15, f3, 0.0f);
            float f16 = f6 + 0.0f;
            this.f63809n.cubicTo(f3, f16, f14, f4, 0.0f, f4);
            float f17 = 0.0f - f5;
            float f18 = -f3;
            this.f63809n.cubicTo(f17, f4, f18, f16, f18, 0.0f);
            this.f63809n.cubicTo(f18, f15, f17, f13, 0.0f, f13);
        }
        PointF pointF2 = (PointF) this.f63808O.KN();
        this.f63809n.offset(pointF2.x, pointF2.y);
        this.f63809n.close();
        this.Uo.rl(this.f63809n);
        this.KN = true;
        return this.f63809n;
    }

    public Wre(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.n nVar2) {
        this.rl = nVar2.rl();
        this.f63810t = xo;
        B.j jVarN = nVar2.nr().n();
        this.nr = jVarN;
        B.j jVarN2 = nVar2.t().n();
        this.f63808O = jVarN2;
        this.J2 = nVar2;
        nVar.mUb(jVarN);
        nVar.mUb(jVarN2);
        jVarN.n(this);
        jVarN2.n(this);
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
