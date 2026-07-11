package QmE;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8622n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && Intrinsics.areEqual(this.f8622n, ((w6) obj).f8622n);
    }

    public int hashCode() {
        String str = this.f8622n;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String n() {
        return this.f8622n;
    }

    public String toString() {
        return "Failed(appSetupError=" + this.f8622n + ")";
    }

    public w6(String str) {
        this.f8622n = str;
    }
}
