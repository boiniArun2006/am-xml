package kG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements I28, CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f69753n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f69753n, ((Ml) obj).f69753n);
    }

    public Ml(Object cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f69753n = cause;
    }

    public int hashCode() {
        return this.f69753n.hashCode();
    }

    public String toString() {
        return "Unexpected(cause=" + this.f69753n + ')';
    }
}
