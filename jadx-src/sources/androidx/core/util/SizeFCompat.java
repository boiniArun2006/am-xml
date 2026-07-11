package androidx.core.util;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SizeFCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f36693n;
    private final float rl;

    @RequiresApi
    private static final class Api21Impl {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.f36693n == this.f36693n && sizeFCompat.rl == this.rl;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f36693n) ^ Float.floatToIntBits(this.rl);
    }

    public String toString() {
        return this.f36693n + "x" + this.rl;
    }
}
