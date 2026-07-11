package KfI;

import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ln implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f5647n;

    public static Ln n(InterfaceC2342j interfaceC2342j) {
        return new Ln(interfaceC2342j);
    }

    public static qf t(Context context) {
        return new qf(context);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public qf get() {
        return t((Context) this.f5647n.get());
    }

    public Ln(InterfaceC2342j interfaceC2342j) {
        this.f5647n = interfaceC2342j;
    }
}
