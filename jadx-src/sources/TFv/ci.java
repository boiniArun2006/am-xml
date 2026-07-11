package TFv;

import GJW.xuv;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class ci implements Z, Wre, teV.Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Z f10409n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final xuv f10410t;

    @Override // TFv.Z, TFv.Wre
    public Object n(CN3 cn3, Continuation continuation) {
        return this.f10409n.n(cn3, continuation);
    }

    public ci(Z z2, xuv xuvVar) {
        this.f10409n = z2;
        this.f10410t = xuvVar;
    }

    @Override // teV.Pl
    public Wre O(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return nKK.O(this, coroutineContext, i2, jVar);
    }
}
