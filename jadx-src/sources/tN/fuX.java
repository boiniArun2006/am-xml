package tN;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f73459n;
    private final boolean rl;

    public fuX(CN3 type, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f73459n = type;
        this.rl = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return this.f73459n == fux.f73459n && this.rl == fux.rl;
    }

    public static /* synthetic */ fuX rl(fuX fux, CN3 cn3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cn3 = fux.f73459n;
        }
        if ((i2 & 2) != 0) {
            z2 = fux.rl;
        }
        return fux.n(cn3, z2);
    }

    public int hashCode() {
        return (this.f73459n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final fuX n(CN3 type, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new fuX(type, z2);
    }

    public final CN3 nr() {
        return this.f73459n;
    }

    public final boolean t() {
        return this.rl;
    }

    public String toString() {
        return "PremadeContentTypeFilter(type=" + this.f73459n + ", enabled=" + this.rl + ")";
    }

    public /* synthetic */ fuX(CN3 cn3, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cn3, (i2 & 2) != 0 ? true : z2);
    }
}
