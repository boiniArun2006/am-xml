package B;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Ml extends CN3 {
    float o(Ect.j jVar, float f3) {
        float f4;
        if (jVar.rl == null || jVar.f2329t == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Ect.w6 w6Var = this.f211O;
        if (w6Var != null) {
            f4 = f3;
            Float f5 = (Float) w6Var.rl(jVar.Uo, jVar.KN.floatValue(), (Float) jVar.rl, (Float) jVar.f2329t, f4, O(), J2());
            if (f5 != null) {
                return f5.floatValue();
            }
        } else {
            f4 = f3;
        }
        return x0.o.xMQ(jVar.Uo(), jVar.nr(), f4);
    }

    public Ml(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // B.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Float xMQ(Ect.j jVar, float f3) {
        return Float.valueOf(o(jVar, f3));
    }

    public float r() {
        return o(rl(), nr());
    }
}
