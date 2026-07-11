package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class CallbackWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FontsContractCompat.FontRequestCallback f36550n;
    private final Executor rl;

    CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback, Executor executor) {
        this.f36550n = fontRequestCallback;
        this.rl = executor;
    }

    private void n(final int i2) {
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.f36550n;
        this.rl.execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.n(i2);
            }
        });
    }

    private void t(final Typeface typeface) {
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.f36550n;
        this.rl.execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.rl(typeface);
            }
        });
    }

    void rl(FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.n()) {
            t(typefaceResult.f36573n);
        } else {
            n(typefaceResult.rl);
        }
    }

    CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this(fontRequestCallback, RequestExecutor.rl(CalleeHandler.n()));
    }
}
