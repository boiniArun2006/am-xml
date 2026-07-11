package com.google.firebase.sessions;

import com.google.firebase.sessions.n;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f60825n;

    public static KfI.n n(com.google.firebase.Wre wre) {
        return (KfI.n) ep.Ml.nr(n.InterfaceC0812n.f60819n.n(wre));
    }

    public static w6 rl(InterfaceC2342j interfaceC2342j) {
        return new w6(interfaceC2342j);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public KfI.n get() {
        return n((com.google.firebase.Wre) this.f60825n.get());
    }

    public w6(InterfaceC2342j interfaceC2342j) {
        this.f60825n = interfaceC2342j;
    }
}
