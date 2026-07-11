package gB;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f67169n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f67169n, ((Ml) obj).f67169n);
    }

    public Ml(Object cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f67169n = cause;
    }

    public int hashCode() {
        return this.f67169n.hashCode();
    }

    public String toString() {
        return "FigureGenerationFailure(cause=" + this.f67169n + ')';
    }
}
