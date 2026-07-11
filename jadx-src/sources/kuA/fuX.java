package kuA;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX implements aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70332n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuX) && Intrinsics.areEqual(this.f70332n, ((fuX) obj).f70332n);
    }

    public fuX(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f70332n = value;
    }

    public int hashCode() {
        return this.f70332n.hashCode();
    }

    public final String n() {
        return this.f70332n;
    }

    public String toString() {
        return "StringResult(value=" + this.f70332n + ")";
    }
}
