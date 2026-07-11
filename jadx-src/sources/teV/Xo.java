package teV;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Xo implements Continuation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xo f73620n = new Xo();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final CoroutineContext f73621t = EmptyCoroutineContext.INSTANCE;

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return f73621t;
    }

    private Xo() {
    }
}
