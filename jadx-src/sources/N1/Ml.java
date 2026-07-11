package N1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f6945n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f6945n, ((Ml) obj).f6945n);
    }

    public Ml(Object cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f6945n = cause;
    }

    public int hashCode() {
        return this.f6945n.hashCode();
    }

    public final Object n() {
        return this.f6945n;
    }

    public String toString() {
        return "FMGenericFailure(cause=" + this.f6945n + ')';
    }
}
