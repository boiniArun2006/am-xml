package B;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class o extends CN3 {
    private final Ect.Ml xMQ;

    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Ect.Ml xMQ(Ect.j jVar, float f3) {
        Object obj;
        float f4;
        Object obj2 = jVar.rl;
        if (obj2 == null || (obj = jVar.f2329t) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Ect.Ml ml = (Ect.Ml) obj2;
        Ect.Ml ml2 = (Ect.Ml) obj;
        Ect.w6 w6Var = this.f211O;
        if (w6Var != null) {
            f4 = f3;
            Ect.Ml ml3 = (Ect.Ml) w6Var.rl(jVar.Uo, jVar.KN.floatValue(), ml, ml2, f4, O(), J2());
            if (ml3 != null) {
                return ml3;
            }
        } else {
            f4 = f3;
        }
        this.xMQ.nr(x0.o.xMQ(ml.rl(), ml2.rl(), f4), x0.o.xMQ(ml.t(), ml2.t(), f4));
        return this.xMQ;
    }

    public o(List list) {
        super(list);
        this.xMQ = new Ect.Ml();
    }
}
