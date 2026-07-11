package t2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 implements w6, I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SecurityException f73434n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CN3) && Intrinsics.areEqual(this.f73434n, ((CN3) obj).f73434n);
    }

    public CN3(SecurityException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f73434n = cause;
    }

    public int hashCode() {
        return this.f73434n.hashCode();
    }

    public final SecurityException n() {
        return this.f73434n;
    }

    public String toString() {
        return "SecurityError(cause=" + this.f73434n + ')';
    }
}
