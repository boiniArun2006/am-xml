package fOK;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t2.I28 f66904n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && Intrinsics.areEqual(this.f66904n, ((w6) obj).f66904n);
    }

    public w6(t2.I28 cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f66904n = cause;
    }

    public int hashCode() {
        return this.f66904n.hashCode();
    }

    public String toString() {
        return "OutputFileFailure(cause=" + this.f66904n + ')';
    }
}
