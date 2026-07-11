package com.google.common.util.concurrent;

import com.google.common.collect.Ln;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class CycleDetectingLockFactory {

    public static final class PotentialDeadlockException extends j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final j f59818O;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable cause = this.f59818O; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }
    }

    private static class j extends IllegalStateException {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final StackTraceElement[] f59819n = new StackTraceElement[0];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Ln f59820t = Ln.XQ(CycleDetectingLockFactory.class.getName(), j.class.getName(), n.class.getName());
    }

    private static class n {
    }
}
