package ef;

import FQq.SPz;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: renamed from: ef.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1965c extends j {
    private final gL.n Ik;
    private B.j XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final B.j f63814Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f63815o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f63816r;

    @Override // ef.j, ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        if (this.f63815o) {
            return;
        }
        this.xMQ.setColor(((B.n) this.f63814Z).r());
        B.j jVar = this.XQ;
        if (jVar != null) {
            this.xMQ.setColorFilter((ColorFilter) jVar.KN());
        }
        super.Uo(canvas, matrix, i2, ml);
    }

    @Override // ef.w6
    public String getName() {
        return this.f63816r;
    }

    public C1965c(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.l3D l3d) {
        super(xo, nVar, l3d.rl().rl(), l3d.O().rl(), l3d.Uo(), l3d.xMQ(), l3d.mUb(), l3d.J2(), l3d.nr());
        this.Ik = nVar;
        this.f63816r = l3d.KN();
        this.f63815o = l3d.gh();
        B.j jVarN = l3d.t().n();
        this.f63814Z = jVarN;
        jVarN.n(this);
        nVar.mUb(jVarN);
    }

    @Override // ef.j, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        super.J2(obj, w6Var);
        if (obj == SPz.rl) {
            this.f63814Z.HI(w6Var);
            return;
        }
        if (obj == SPz.s7N) {
            B.j jVar = this.XQ;
            if (jVar != null) {
                this.Ik.T(jVar);
            }
            if (w6Var == null) {
                this.XQ = null;
                return;
            }
            B.z zVar = new B.z(w6Var);
            this.XQ = zVar;
            zVar.n(this);
            this.Ik.mUb(this.f63814Z);
        }
    }
}
