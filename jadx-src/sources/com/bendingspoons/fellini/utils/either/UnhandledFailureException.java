package com.bendingspoons.fellini.utils.either;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/bendingspoons/fellini/utils/either/UnhandledFailureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "failure", "", "cause", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/lang/Object;)V", c.f62177j, "Ljava/lang/Object;", "()Ljava/lang/Object;", "utils_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UnhandledFailureException extends Exception {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object failure;

    public UnhandledFailureException(Object obj, Throwable th) {
        super("A failure was not handled: " + obj, th);
        this.failure = obj;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object getFailure() {
        return this.failure;
    }

    public UnhandledFailureException(Object obj) {
        this(obj, obj instanceof Throwable ? (Throwable) obj : null);
    }
}
