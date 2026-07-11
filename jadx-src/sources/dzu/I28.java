package dzu;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 implements GJW.vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CoroutineContext f63551n;

    @Override // GJW.vd
    public CoroutineContext getCoroutineContext() {
        return this.f63551n;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }

    public I28(CoroutineContext coroutineContext) {
        this.f63551n = coroutineContext;
    }
}
