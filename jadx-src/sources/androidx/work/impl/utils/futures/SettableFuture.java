package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public final class SettableFuture<V> extends AbstractFuture<V> {
    public static SettableFuture o() {
        return new SettableFuture();
    }

    private SettableFuture() {
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean HI(Object obj) {
        return super.HI(obj);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean Ik(Xo xo) {
        return super.Ik(xo);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean ck(Throwable th) {
        return super.ck(th);
    }
}
