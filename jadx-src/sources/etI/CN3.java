package etI;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f63880n;

    public static CN3 rl(InterfaceC2342j interfaceC2342j) {
        return new CN3(interfaceC2342j);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Gg.Wre get() {
        return n((MR.j) this.f63880n.get());
    }

    public CN3(InterfaceC2342j interfaceC2342j) {
        this.f63880n = interfaceC2342j;
    }

    public static Gg.Wre n(MR.j jVar) {
        return (Gg.Wre) lK3.Ml.nr(Wre.n(jVar));
    }
}
