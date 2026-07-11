package b1b;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements Cloneable {
    private final int[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f43152O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43153n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f43154t;

    public n(int i2, int i3) {
        if (i2 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f43153n = i2;
        this.f43154t = i3;
        int i5 = (i2 + 31) / 32;
        this.f43152O = i5;
        this.J2 = new int[i5 * i3];
    }

    private String n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f43154t * (this.f43153n + 1));
        for (int i2 = 0; i2 < this.f43154t; i2++) {
            for (int i3 = 0; i3 < this.f43153n; i3++) {
                sb.append(t(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void J2(int i2, int i3, int i5, int i7) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i7 < 1 || i5 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i8 = i5 + i2;
        int i9 = i7 + i3;
        if (i9 > this.f43154t || i8 > this.f43153n) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i3 < i9) {
            int i10 = this.f43152O * i3;
            for (int i11 = i2; i11 < i8; i11++) {
                int[] iArr = this.J2;
                int i12 = (i11 / 32) + i10;
                iArr[i12] = iArr[i12] | (1 << (i11 & 31));
            }
            i3++;
        }
    }

    public String KN(String str, String str2) {
        return n(str, str2, "\n");
    }

    public int O() {
        return this.f43153n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f43153n == nVar.f43153n && this.f43154t == nVar.f43154t && this.f43152O == nVar.f43152O && Arrays.equals(this.J2, nVar.J2);
    }

    public int hashCode() {
        int i2 = this.f43153n;
        return (((((((i2 * 31) + i2) * 31) + this.f43154t) * 31) + this.f43152O) * 31) + Arrays.hashCode(this.J2);
    }

    public int nr() {
        return this.f43154t;
    }

    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public n clone() {
        return new n(this.f43153n, this.f43154t, this.f43152O, (int[]) this.J2.clone());
    }

    public boolean t(int i2, int i3) {
        return ((this.J2[(i3 * this.f43152O) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public String toString() {
        return KN("X ", "  ");
    }

    private n(int i2, int i3, int i5, int[] iArr) {
        this.f43153n = i2;
        this.f43154t = i3;
        this.f43152O = i5;
        this.J2 = iArr;
    }
}
