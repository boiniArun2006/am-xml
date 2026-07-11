package hay;

import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f67969n;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f67970t;

    public static aC n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3) {
        return new aC(interfaceC2342j, interfaceC2342j2, interfaceC2342j3);
    }

    public static Dsr t(Context context, MR.j jVar, MR.j jVar2) {
        return new Dsr(context, jVar, jVar2);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Dsr get() {
        return t((Context) this.f67969n.get(), (MR.j) this.rl.get(), (MR.j) this.f67970t.get());
    }

    public aC(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3) {
        this.f67969n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f67970t = interfaceC2342j3;
    }
}
