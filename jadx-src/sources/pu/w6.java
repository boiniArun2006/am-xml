package pu;

import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f72094n;

    public static w6 n(InterfaceC2342j interfaceC2342j) {
        return new w6(interfaceC2342j);
    }

    public static n t(Context context) {
        return new n(context);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public n get() {
        return t((Context) this.f72094n.get());
    }

    public w6(InterfaceC2342j interfaceC2342j) {
        this.f72094n = interfaceC2342j;
    }
}
