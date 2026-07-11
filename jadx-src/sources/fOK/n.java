package fOK;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f66903n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f66903n, ((n) obj).f66903n);
    }

    public n(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f66903n = message;
    }

    public int hashCode() {
        return this.f66903n.hashCode();
    }

    public String toString() {
        return "FormatNotSupported(message=" + this.f66903n + ')';
    }
}
