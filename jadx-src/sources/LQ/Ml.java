package LQ;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements w6, CN3, TFv.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ CN3 f6076n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ TFv.CN3 f6077t;

    public Ml(CN3 scope, TFv.CN3 collector) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.f6076n = scope;
        this.f6077t = collector;
    }

    @Override // LQ.CN3
    public TFv.Wre J2(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return this.f6076n.J2(nVar);
    }

    @Override // LQ.CN3
    public Object O(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return this.f6076n.O(jVar);
    }

    @Override // LQ.CN3
    public Void n(Object obj) {
        this.f6076n.n(obj);
        return null;
    }

    @Override // TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        return this.f6077t.rl(obj, continuation);
    }
}
