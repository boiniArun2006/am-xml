package QmE;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8359n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wre) && Intrinsics.areEqual(this.f8359n, ((Wre) obj).f8359n);
    }

    public int hashCode() {
        String str = this.f8359n;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String n() {
        return this.f8359n;
    }

    public String toString() {
        return "Failed(reason=" + this.f8359n + ")";
    }

    public Wre(String str) {
        this.f8359n = str;
    }
}
