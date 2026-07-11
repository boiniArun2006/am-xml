package nri;

import B8M.C;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f71230n;

    public static j n(byte[] bArr) {
        if (bArr != null) {
            return rl(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static j rl(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            return new j(bArr, i2, i3);
        }
        throw new NullPointerException("data must be non-null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return Arrays.equals(((j) obj).f71230n, this.f71230n);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f71230n);
    }

    public int t() {
        return this.f71230n.length;
    }

    public String toString() {
        return "Bytes(" + C.rl(this.f71230n) + ")";
    }

    private j(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.f71230n = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
    }
}
