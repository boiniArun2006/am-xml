package B;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class n extends CN3 {
    public int o(Ect.j jVar, float f3) {
        float f4;
        Float f5;
        if (jVar.rl == null || jVar.f2329t == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Ect.w6 w6Var = this.f211O;
        if (w6Var == null || (f5 = jVar.KN) == null) {
            f4 = f3;
        } else {
            f4 = f3;
            Integer num = (Integer) w6Var.rl(jVar.Uo, f5.floatValue(), (Integer) jVar.rl, (Integer) jVar.f2329t, f4, O(), J2());
            if (num != null) {
                return num.intValue();
            }
        }
        return x0.I28.t(x0.o.rl(f4, 0.0f, 1.0f), ((Integer) jVar.rl).intValue(), ((Integer) jVar.f2329t).intValue());
    }

    public n(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // B.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Integer xMQ(Ect.j jVar, float f3) {
        return Integer.valueOf(o(jVar, f3));
    }

    public int r() {
        return o(rl(), nr());
    }
}
