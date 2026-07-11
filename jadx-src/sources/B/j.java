package B;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected Ect.w6 f211O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f213t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f212n = new ArrayList(1);
    private boolean rl = false;
    protected float nr = 0.0f;
    private Object J2 = null;
    private float Uo = -1.0f;
    private float KN = -1.0f;

    private static final class I28 implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f214n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Ect.j f215t = null;
        private float nr = -1.0f;
        private Ect.j rl = J2(0.0f);

        @Override // B.j.Ml
        public boolean isEmpty() {
            return false;
        }

        private Ect.j J2(float f3) {
            List list = this.f214n;
            Ect.j jVar = (Ect.j) list.get(list.size() - 1);
            if (f3 >= jVar.J2()) {
                return jVar;
            }
            for (int size = this.f214n.size() - 2; size >= 1; size--) {
                Ect.j jVar2 = (Ect.j) this.f214n.get(size);
                if (this.rl != jVar2 && jVar2.n(f3)) {
                    return jVar2;
                }
            }
            return (Ect.j) this.f214n.get(0);
        }

        @Override // B.j.Ml
        public float O() {
            return ((Ect.j) this.f214n.get(r0.size() - 1)).t();
        }

        @Override // B.j.Ml
        public boolean n(float f3) {
            Ect.j jVar = this.f215t;
            Ect.j jVar2 = this.rl;
            if (jVar == jVar2 && this.nr == f3) {
                return true;
            }
            this.f215t = jVar2;
            this.nr = f3;
            return false;
        }

        @Override // B.j.Ml
        public float nr() {
            return ((Ect.j) this.f214n.get(0)).J2();
        }

        @Override // B.j.Ml
        public Ect.j rl() {
            return this.rl;
        }

        @Override // B.j.Ml
        public boolean t(float f3) {
            if (this.rl.n(f3)) {
                return !this.rl.xMQ();
            }
            this.rl = J2(f3);
            return true;
        }

        I28(List list) {
            this.f214n = list;
        }
    }

    private interface Ml {
        float O();

        boolean isEmpty();

        boolean n(float f3);

        float nr();

        Ect.j rl();

        boolean t(float f3);
    }

    private static final class Wre implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Ect.j f216n;
        private float rl = -1.0f;

        @Override // B.j.Ml
        public boolean isEmpty() {
            return false;
        }

        @Override // B.j.Ml
        public float O() {
            return this.f216n.t();
        }

        @Override // B.j.Ml
        public boolean n(float f3) {
            if (this.rl == f3) {
                return true;
            }
            this.rl = f3;
            return false;
        }

        @Override // B.j.Ml
        public float nr() {
            return this.f216n.J2();
        }

        @Override // B.j.Ml
        public Ect.j rl() {
            return this.f216n;
        }

        @Override // B.j.Ml
        public boolean t(float f3) {
            return !this.f216n.xMQ();
        }

        Wre(List list) {
            this.f216n = (Ect.j) list.get(0);
        }
    }

    public interface n {
        void n();
    }

    private static final class w6 implements Ml {
        private w6() {
        }

        @Override // B.j.Ml
        public boolean isEmpty() {
            return true;
        }

        @Override // B.j.Ml
        public float nr() {
            return 0.0f;
        }

        @Override // B.j.Ml
        public boolean t(float f3) {
            return false;
        }

        @Override // B.j.Ml
        public float O() {
            return 1.0f;
        }

        @Override // B.j.Ml
        public boolean n(float f3) {
            throw new IllegalStateException("not implemented");
        }

        @Override // B.j.Ml
        public Ect.j rl() {
            throw new IllegalStateException("not implemented");
        }
    }

    public void az() {
        this.rl = true;
    }

    protected boolean ck() {
        return false;
    }

    abstract Object xMQ(Ect.j jVar, float f3);

    private float Uo() {
        if (this.Uo == -1.0f) {
            this.Uo = this.f213t.nr();
        }
        return this.Uo;
    }

    public void HI(Ect.w6 w6Var) {
        Ect.w6 w6Var2 = this.f211O;
        if (w6Var2 != null) {
            w6Var2.t(null);
        }
        this.f211O = w6Var;
        if (w6Var != null) {
            w6Var.t(this);
        }
    }

    public float J2() {
        return this.nr;
    }

    float O() {
        if (this.rl) {
            return 0.0f;
        }
        Ect.j jVarRl = rl();
        if (jVarRl.xMQ()) {
            return 0.0f;
        }
        return (this.nr - jVarRl.J2()) / (jVarRl.t() - jVarRl.J2());
    }

    public boolean gh() {
        return this.f211O != null;
    }

    protected Object mUb(Ect.j jVar, float f3, float f4, float f5) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void n(n nVar) {
        this.f212n.add(nVar);
    }

    float t() {
        if (this.KN == -1.0f) {
            this.KN = this.f213t.O();
        }
        return this.KN;
    }

    j(List list) {
        this.f213t = Ik(list);
    }

    private static Ml Ik(List list) {
        if (list.isEmpty()) {
            return new w6();
        }
        if (list.size() == 1) {
            return new Wre(list);
        }
        return new I28(list);
    }

    public Object KN() {
        Object objXMQ;
        float fO = O();
        if (this.f211O == null && this.f213t.n(fO) && !ck()) {
            return this.J2;
        }
        Ect.j jVarRl = rl();
        Interpolator interpolator = jVarRl.f2327O;
        if (interpolator != null && jVarRl.J2 != null) {
            objXMQ = mUb(jVarRl, fO, interpolator.getInterpolation(fO), jVarRl.J2.getInterpolation(fO));
        } else {
            objXMQ = xMQ(jVarRl, nr());
        }
        this.J2 = objXMQ;
        return objXMQ;
    }

    protected float nr() {
        Interpolator interpolator;
        Ect.j jVarRl = rl();
        if (jVarRl != null && !jVarRl.xMQ() && (interpolator = jVarRl.nr) != null) {
            return interpolator.getInterpolation(O());
        }
        return 0.0f;
    }

    public void qie() {
        if (FQq.I28.KN()) {
            FQq.I28.rl("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i2 = 0; i2 < this.f212n.size(); i2++) {
            ((n) this.f212n.get(i2)).n();
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("BaseKeyframeAnimation#notifyListeners");
        }
    }

    protected Ect.j rl() {
        if (FQq.I28.KN()) {
            FQq.I28.rl("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        Ect.j jVarRl = this.f213t.rl();
        if (FQq.I28.KN()) {
            FQq.I28.t("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return jVarRl;
    }

    public void ty(float f3) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("BaseKeyframeAnimation#setProgress");
        }
        if (this.f213t.isEmpty()) {
            if (FQq.I28.KN()) {
                FQq.I28.t("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f3 < Uo()) {
            f3 = Uo();
        } else if (f3 > t()) {
            f3 = t();
        }
        if (f3 == this.nr) {
            if (FQq.I28.KN()) {
                FQq.I28.t("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.nr = f3;
            if (this.f213t.t(f3)) {
                qie();
            }
            if (FQq.I28.KN()) {
                FQq.I28.t("BaseKeyframeAnimation#setProgress");
            }
        }
    }
}
