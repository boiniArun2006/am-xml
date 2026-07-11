package tu;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f73874n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73875t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAz)) {
            return false;
        }
        DAz dAz = (DAz) obj;
        return this.f73874n == dAz.f73874n && Intrinsics.areEqual(this.rl, dAz.rl) && Intrinsics.areEqual(this.f73875t, dAz.f73875t);
    }

    public DAz(boolean z2, String mimeType, String language) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f73874n = z2;
        this.rl = mimeType;
        this.f73875t = language;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f73874n) * 31) + this.rl.hashCode()) * 31) + this.f73875t.hashCode();
    }

    public final boolean n() {
        return this.f73874n;
    }

    public String toString() {
        return GDEJgAYrPQHfw.qmnbzw + this.f73874n + ", mimeType=" + this.rl + ", language=" + this.f73875t + ")";
    }
}
