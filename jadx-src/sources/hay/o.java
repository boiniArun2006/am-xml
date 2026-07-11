package hay;

import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f67974n;
    private final InterfaceC2342j rl;

    public static o n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        return new o(interfaceC2342j, interfaceC2342j2);
    }

    public static C t(Context context, Object obj) {
        return new C(context, (Dsr) obj);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public C get() {
        return t((Context) this.f67974n.get(), this.rl.get());
    }

    public o(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        this.f67974n = interfaceC2342j;
        this.rl = interfaceC2342j2;
    }
}
