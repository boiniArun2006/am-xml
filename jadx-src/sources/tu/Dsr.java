package tu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f73876n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f73877t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return this.f73876n == dsr.f73876n && Intrinsics.areEqual(this.rl, dsr.rl) && this.f73877t == dsr.f73877t && this.nr == dsr.nr;
    }

    public Dsr(boolean z2, String mimeType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f73876n = z2;
        this.rl = mimeType;
        this.f73877t = i2;
        this.nr = i3;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f73876n) * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f73877t)) * 31) + Integer.hashCode(this.nr);
    }

    public final boolean n() {
        return this.f73876n;
    }

    public String toString() {
        return "ImageInfo(supported=" + this.f73876n + ", mimeType=" + this.rl + ", width=" + this.f73877t + ", height=" + this.nr + ")";
    }
}
