package x4x;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n implements Cloneable {
    private final int[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f75190O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75191n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f75192t;

    public n(int i2) {
        this(i2, i2);
    }

    public n(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f75191n = i2;
        this.f75192t = i3;
        int i5 = (i2 + 31) / 32;
        this.f75190O = i5;
        this.J2 = new int[i5 * i3];
    }

    private String n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f75192t * (this.f75191n + 1));
        for (int i2 = 0; i2 < this.f75192t; i2++) {
            for (int i3 = 0; i3 < this.f75191n; i3++) {
                sb.append(nr(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public int J2() {
        return this.f75191n;
    }

    public void KN(int i2, int i3) {
        int i5 = (i3 * this.f75190O) + (i2 / 32);
        int[] iArr = this.J2;
        iArr[i5] = (1 << (i2 & 31)) | iArr[i5];
    }

    public int O() {
        return this.f75192t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f75191n == nVar.f75191n && this.f75192t == nVar.f75192t && this.f75190O == nVar.f75190O && Arrays.equals(this.J2, nVar.J2);
    }

    public int hashCode() {
        int i2 = this.f75191n;
        return (((((((i2 * 31) + i2) * 31) + this.f75192t) * 31) + this.f75190O) * 31) + Arrays.hashCode(this.J2);
    }

    public String mUb(String str, String str2) {
        return n(str, str2, "\n");
    }

    public boolean nr(int i2, int i3) {
        return ((this.J2[(i3 * this.f75190O) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public void rl() {
        int length = this.J2.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.J2[i2] = 0;
        }
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public n clone() {
        return new n(this.f75191n, this.f75192t, this.f75190O, (int[]) this.J2.clone());
    }

    public String toString() {
        return mUb("X ", "  ");
    }

    public void xMQ(int i2, int i3, int i5, int i7) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i7 <= 0 || i5 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i8 = i5 + i2;
        int i9 = i7 + i3;
        if (i9 > this.f75192t || i8 > this.f75191n) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i3 < i9) {
            int i10 = this.f75190O * i3;
            for (int i11 = i2; i11 < i8; i11++) {
                int[] iArr = this.J2;
                int i12 = (i11 / 32) + i10;
                iArr[i12] = iArr[i12] | (1 << (i11 & 31));
            }
            i3++;
        }
    }

    private n(int i2, int i3, int i5, int[] iArr) {
        this.f75191n = i2;
        this.f75192t = i3;
        this.f75190O = i5;
        this.J2 = iArr;
    }
}
