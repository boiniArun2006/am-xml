package B;

import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class z extends j {
    private final Object xMQ;

    public z(Ect.w6 w6Var) {
        this(w6Var, null);
    }

    public z(Ect.w6 w6Var, Object obj) {
        super(Collections.EMPTY_LIST);
        HI(w6Var);
        this.xMQ = obj;
    }

    @Override // B.j
    public Object KN() {
        Ect.w6 w6Var = this.f211O;
        Object obj = this.xMQ;
        return w6Var.rl(0.0f, 0.0f, obj, obj, J2(), J2(), J2());
    }

    @Override // B.j
    public void qie() {
        if (this.f211O != null) {
            super.qie();
        }
    }

    @Override // B.j
    float t() {
        return 1.0f;
    }

    @Override // B.j
    public void ty(float f3) {
        this.nr = f3;
    }

    @Override // B.j
    Object xMQ(Ect.j jVar, float f3) {
        return KN();
    }
}
