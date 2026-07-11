package pu;

import androidx.content.core.DataStore;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f72093n;

    public static o n(InterfaceC2342j interfaceC2342j) {
        return new o(interfaceC2342j);
    }

    public static C t(DataStore dataStore) {
        return new C(dataStore);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public C get() {
        return t((DataStore) this.f72093n.get());
    }

    public o(InterfaceC2342j interfaceC2342j) {
        this.f72093n = interfaceC2342j;
    }
}
