package dzu;

import GJW.IG;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class rv6 implements IG {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CoroutineContext.Key f63575O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f63576n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ThreadLocal f63577t;

    @Override // GJW.IG
    public Object fcU(CoroutineContext coroutineContext) {
        Object obj = this.f63577t.get();
        this.f63577t.set(this.f63576n);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return this.f63575O;
    }

    @Override // GJW.IG
    public void p5(CoroutineContext coroutineContext, Object obj) {
        this.f63577t.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f63576n + ", threadLocal = " + this.f63577t + ')';
    }

    public rv6(Object obj, ThreadLocal threadLocal) {
        this.f63576n = obj;
        this.f63577t = threadLocal;
        this.f63575O = new vd(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return IG.j.n(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        if (Intrinsics.areEqual(getKey(), key)) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        if (Intrinsics.areEqual(getKey(), key)) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return IG.j.rl(this, coroutineContext);
    }
}
