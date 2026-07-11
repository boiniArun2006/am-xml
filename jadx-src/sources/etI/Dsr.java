package etI;

import Gg.r;
import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f63881n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f63882t;

    public static Dsr n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        return new Dsr(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public r get() {
        return t((Context) this.f63881n.get(), (ePt.Ml) this.rl.get(), (Gg.Wre) this.f63882t.get(), (MR.j) this.nr.get());
    }

    public Dsr(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        this.f63881n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f63882t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
    }

    public static r t(Context context, ePt.Ml ml, Gg.Wre wre, MR.j jVar) {
        return (r) lK3.Ml.nr(fuX.n(context, ml, wre, jVar));
    }
}
