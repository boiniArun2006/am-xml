package B;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Xo extends CN3 {

    class j extends Ect.w6 {
        final /* synthetic */ ES.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ect.w6 f205O;
        final /* synthetic */ Ect.n nr;

        j(Ect.n nVar, Ect.w6 w6Var, ES.n nVar2) {
            this.nr = nVar;
            this.f205O = w6Var;
            this.J2 = nVar2;
        }

        @Override // Ect.w6
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public ES.n n(Ect.n nVar) {
            this.nr.KN(nVar.J2(), nVar.n(), ((ES.n) nVar.Uo()).f2315n, ((ES.n) nVar.rl()).f2315n, nVar.nr(), nVar.t(), nVar.O());
            String str = (String) this.f205O.n(this.nr);
            ES.n nVar2 = (ES.n) (nVar.t() == 1.0f ? nVar.rl() : nVar.Uo());
            this.J2.n(str, nVar2.rl, nVar2.f2316t, nVar2.nr, nVar2.f2314O, nVar2.J2, nVar2.Uo, nVar2.KN, nVar2.xMQ, nVar2.mUb, nVar2.gh, nVar2.qie, nVar2.az);
            return this.J2;
        }
    }

    public void o(Ect.w6 w6Var) {
        super.HI(new j(new Ect.n(), w6Var, new ES.n()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ES.n xMQ(Ect.j jVar, float f3) {
        Object obj;
        Ect.w6 w6Var = this.f211O;
        if (w6Var == null) {
            return (f3 != 1.0f || (obj = jVar.f2329t) == null) ? (ES.n) jVar.rl : (ES.n) obj;
        }
        float f4 = jVar.Uo;
        Float f5 = jVar.KN;
        float fFloatValue = f5 == null ? Float.MAX_VALUE : f5.floatValue();
        Object obj2 = jVar.rl;
        ES.n nVar = (ES.n) obj2;
        Object obj3 = jVar.f2329t;
        return (ES.n) w6Var.rl(f4, fFloatValue, nVar, obj3 == null ? (ES.n) obj2 : (ES.n) obj3, f3, nr(), J2());
    }

    public Xo(List list) {
        super(list);
    }
}
