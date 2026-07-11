package teV;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements CoroutineContext {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f73622n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Throwable f73623t;

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f73622n.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f73622n.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f73622n.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f73622n.plus(coroutineContext);
    }

    public aC(Throwable th, CoroutineContext coroutineContext) {
        this.f73622n = coroutineContext;
        this.f73623t = th;
    }
}
