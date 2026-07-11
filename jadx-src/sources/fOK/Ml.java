package fOK;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f66902n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f66902n, ((Ml) obj).f66902n);
    }

    public Ml(Object cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f66902n = cause;
    }

    public int hashCode() {
        return this.f66902n.hashCode();
    }

    public String toString() {
        return "Unexpected(cause=" + this.f66902n + ')';
    }
}
