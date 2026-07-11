package aC;

import GJW.iwV;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n implements iwV {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ j f12750n = j.f12747n;

    @Override // GJW.iwV
    public void a(CoroutineContext coroutineContext, Throwable th) {
        this.f12750n.a(coroutineContext, th);
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) || (obj instanceof j);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f12750n.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f12750n.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return this.f12750n.getKey();
    }

    public int hashCode() {
        return j.f12747n.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f12750n.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f12750n.plus(coroutineContext);
    }
}
