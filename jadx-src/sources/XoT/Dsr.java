package XoT;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f11832n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f11833t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Intrinsics.areEqual(this.f11832n, dsr.f11832n) && Intrinsics.areEqual(this.rl, dsr.rl) && Intrinsics.areEqual(this.f11833t, dsr.f11833t);
    }

    public Dsr(Class clazz, String str, Integer num) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.f11832n = clazz;
        this.rl = str;
        this.f11833t = num;
    }

    public int hashCode() {
        int iHashCode = this.f11832n.hashCode() * 31;
        String str = this.rl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f11833t;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ExceptionId(clazz=" + this.f11832n + ", fileName=" + this.rl + ", lineNumber=" + this.f11833t + ")";
    }
}
