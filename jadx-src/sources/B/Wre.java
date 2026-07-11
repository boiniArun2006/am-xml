package B;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Wre extends CN3 {
    int r(Ect.j jVar, float f3) {
        float f4;
        if (jVar.rl == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iKN = jVar.f2329t == null ? jVar.KN() : jVar.O();
        Ect.w6 w6Var = this.f211O;
        if (w6Var != null) {
            f4 = f3;
            Integer num = (Integer) w6Var.rl(jVar.Uo, jVar.KN.floatValue(), (Integer) jVar.rl, Integer.valueOf(iKN), f4, O(), J2());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f4 = f3;
        }
        return x0.o.mUb(jVar.KN(), iKN, f4);
    }

    public Wre(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // B.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer xMQ(Ect.j jVar, float f3) {
        return Integer.valueOf(r(jVar, f3));
    }
}
