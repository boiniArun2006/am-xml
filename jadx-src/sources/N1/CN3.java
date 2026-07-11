package N1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SecurityException f6943n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CN3) && Intrinsics.areEqual(this.f6943n, ((CN3) obj).f6943n);
    }

    public CN3(SecurityException cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f6943n = cause;
    }

    public int hashCode() {
        return this.f6943n.hashCode();
    }

    public final SecurityException n() {
        return this.f6943n;
    }

    public String toString() {
        return "FMSecurityFailure(cause=" + this.f6943n + ')';
    }
}
