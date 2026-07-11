package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    public static ResolvableFuture Z() {
        return new ResolvableFuture();
    }

    private ResolvableFuture() {
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean Ik(Throwable th) {
        return super.Ik(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean ck(Object obj) {
        return super.ck(obj);
    }
}
