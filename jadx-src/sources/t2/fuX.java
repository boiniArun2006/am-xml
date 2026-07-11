package t2;

import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Throwable f73437n;

    protected fuX(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f73437n = cause;
    }

    public final String toString() {
        return getClass().getSimpleName() + "(cause=" + ExceptionsKt.stackTraceToString(this.f73437n) + ')';
    }
}
