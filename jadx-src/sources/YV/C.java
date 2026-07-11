package YV;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12096n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Intrinsics.areEqual(this.f12096n, c2.f12096n) && Intrinsics.areEqual(this.rl, c2.rl);
    }

    public C(String id, String vendor) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        this.f12096n = id;
        this.rl = vendor;
    }

    public int hashCode() {
        return (this.f12096n.hashCode() * 31) + this.rl.hashCode();
    }

    public String toString() {
        return "OtherSubscription(id=" + this.f12096n + ", vendor=" + this.rl + ")";
    }
}
