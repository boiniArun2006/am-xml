package pu;

import kotlin.coroutines.CoroutineContext;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f72087n;
    private final InterfaceC2342j rl;

    public static Wre n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        return new Wre(interfaceC2342j, interfaceC2342j2);
    }

    public static I28 t(KfI.n nVar, CoroutineContext coroutineContext) {
        return new I28(nVar, coroutineContext);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public I28 get() {
        return t((KfI.n) this.f72087n.get(), (CoroutineContext) this.rl.get());
    }

    public Wre(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        this.f72087n = interfaceC2342j;
        this.rl = interfaceC2342j2;
    }
}
