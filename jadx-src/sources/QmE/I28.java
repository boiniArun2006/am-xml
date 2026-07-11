package QmE;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8345n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I28) && Intrinsics.areEqual(this.f8345n, ((I28) obj).f8345n);
    }

    public int hashCode() {
        String str = this.f8345n;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String n() {
        return this.f8345n;
    }

    public String toString() {
        return "Completed(description=" + this.f8345n + ")";
    }

    public I28(String str) {
        this.f8345n = str;
    }
}
