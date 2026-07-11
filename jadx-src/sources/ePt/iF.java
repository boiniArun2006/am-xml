package ePt;

import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class iF implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f63641n;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f63642t;

    public static iF n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3) {
        return new iF(interfaceC2342j, interfaceC2342j2, interfaceC2342j3);
    }

    public static C1962m t(Context context, String str, int i2) {
        return new C1962m(context, str, i2);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public C1962m get() {
        return t((Context) this.f63641n.get(), (String) this.rl.get(), ((Integer) this.f63642t.get()).intValue());
    }

    public iF(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3) {
        this.f63641n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f63642t = interfaceC2342j3;
    }
}
