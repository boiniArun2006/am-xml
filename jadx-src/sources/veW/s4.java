package veW;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import veW.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class s4 implements InterfaceC2407c {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static volatile UGc f74743O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MR.j f74744n;
    private final Gg.QJ nr;
    private final MR.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final etI.I28 f74745t;

    public static void J2(Context context) {
        if (f74743O == null) {
            synchronized (s4.class) {
                try {
                    if (f74743O == null) {
                        f74743O = I28.n().n(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static Set nr(Wre wre) {
        return wre instanceof CN3 ? Collections.unmodifiableSet(((CN3) wre).n()) : Collections.singleton(bF.n.rl("proto"));
    }

    public static s4 t() {
        UGc uGc = f74743O;
        if (uGc != null) {
            return uGc.rl();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public Gg.QJ O() {
        return this.nr;
    }

    public bF.Dsr Uo(Wre wre) {
        return new z(nr(wre), eO.n().rl(wre.getName()).t(wre.getExtras()).n(), this);
    }

    @Override // veW.InterfaceC2407c
    public void n(Xo xo, bF.aC aCVar) {
        this.f74745t.n(xo.J2().J2(xo.t().nr()), rl(xo), aCVar);
    }

    s4(MR.j jVar, MR.j jVar2, etI.I28 i28, Gg.QJ qj, Gg.UGc uGc) {
        this.f74744n = jVar;
        this.rl = jVar2;
        this.f74745t = i28;
        this.nr = qj;
        uGc.t();
    }

    private Dsr rl(Xo xo) {
        Dsr.j jVarUo = Dsr.n().xMQ(this.f74744n.getTime()).HI(this.rl.getTime()).ty(xo.Uo()).KN(new fuX(xo.rl(), xo.nr())).Uo(xo.t().n());
        xo.t().O();
        xo.t().rl();
        return jVarUo.nr();
    }
}
