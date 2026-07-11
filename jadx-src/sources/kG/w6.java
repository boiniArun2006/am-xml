package kG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 implements I28, CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69757n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && Intrinsics.areEqual(this.f69757n, ((w6) obj).f69757n);
    }

    public w6(String cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f69757n = cause;
    }

    public int hashCode() {
        return this.f69757n.hashCode();
    }

    public String toString() {
        return "MalformedFrame(cause=" + this.f69757n + ')';
    }
}
