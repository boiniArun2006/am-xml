package Gg;

import android.content.Context;
import java.util.concurrent.Executor;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D implements lK3.n {
    private final InterfaceC2342j J2;
    private final InterfaceC2342j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f3720O;
    private final InterfaceC2342j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f3721n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f3722t;
    private final InterfaceC2342j xMQ;

    public static l3D n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5, InterfaceC2342j interfaceC2342j6, InterfaceC2342j interfaceC2342j7, InterfaceC2342j interfaceC2342j8, InterfaceC2342j interfaceC2342j9) {
        return new l3D(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5, interfaceC2342j6, interfaceC2342j7, interfaceC2342j8, interfaceC2342j9);
    }

    public static QJ t(Context context, hay.I28 i28, ePt.Ml ml, r rVar, Executor executor, Do.j jVar, MR.j jVar2, MR.j jVar3, ePt.w6 w6Var) {
        return new QJ(context, i28, ml, rVar, executor, jVar, jVar2, jVar3, w6Var);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public QJ get() {
        return t((Context) this.f3721n.get(), (hay.I28) this.rl.get(), (ePt.Ml) this.f3722t.get(), (r) this.nr.get(), (Executor) this.f3720O.get(), (Do.j) this.J2.get(), (MR.j) this.Uo.get(), (MR.j) this.KN.get(), (ePt.w6) this.xMQ.get());
    }

    public l3D(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5, InterfaceC2342j interfaceC2342j6, InterfaceC2342j interfaceC2342j7, InterfaceC2342j interfaceC2342j8, InterfaceC2342j interfaceC2342j9) {
        this.f3721n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f3722t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f3720O = interfaceC2342j5;
        this.J2 = interfaceC2342j6;
        this.Uo = interfaceC2342j7;
        this.KN = interfaceC2342j8;
        this.xMQ = interfaceC2342j9;
    }
}
