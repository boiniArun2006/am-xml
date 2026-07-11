package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.TracingControllerImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@AnyThread
public abstract class TracingController {

    private static class LAZY_HOLDER {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final TracingController f42482n = new TracingControllerImpl();
    }
}
