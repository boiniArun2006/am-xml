package kG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n implements I28, CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69756n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f69756n, ((n) obj).f69756n);
    }

    public n(String cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f69756n = cause;
    }

    public int hashCode() {
        return this.f69756n.hashCode();
    }

    public String toString() {
        return "MalformedFile(cause=" + this.f69756n + ')';
    }
}
