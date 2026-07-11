package b1b;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements Cloneable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f43150n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43151t;

    public j() {
        this.f43151t = 0;
        this.f43150n = new int[1];
    }

    public void gh(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < 8; i9++) {
                if (J2(i2)) {
                    i8 |= 1 << (7 - i9);
                }
                i2++;
            }
            bArr[i3 + i7] = (byte) i8;
        }
    }

    private void O(int i2) {
        if (i2 > this.f43150n.length * 32) {
            int[] iArrMUb = mUb(i2);
            int[] iArr = this.f43150n;
            System.arraycopy(iArr, 0, iArrMUb, 0, iArr.length);
            this.f43150n = iArrMUb;
        }
    }

    private static int[] mUb(int i2) {
        return new int[(i2 + 31) / 32];
    }

    public boolean J2(int i2) {
        return ((1 << (i2 & 31)) & this.f43150n[i2 / 32]) != 0;
    }

    public int KN() {
        return this.f43151t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f43151t == jVar.f43151t && Arrays.equals(this.f43150n, jVar.f43150n);
    }

    public int hashCode() {
        return (this.f43151t * 31) + Arrays.hashCode(this.f43150n);
    }

    public void n(boolean z2) {
        O(this.f43151t + 1);
        if (z2) {
            int[] iArr = this.f43150n;
            int i2 = this.f43151t;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f43151t++;
    }

    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public j clone() {
        return new j((int[]) this.f43150n.clone(), this.f43151t);
    }

    public void qie(j jVar) {
        if (this.f43151t != jVar.f43151t) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f43150n;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] ^ jVar.f43150n[i2];
            i2++;
        }
    }

    public void rl(j jVar) {
        int i2 = jVar.f43151t;
        O(this.f43151t + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            n(jVar.J2(i3));
        }
    }

    public void t(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        O(this.f43151t + i3);
        while (i3 > 0) {
            boolean z2 = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z2 = false;
            }
            n(z2);
            i3--;
        }
    }

    public String toString() {
        int i2 = this.f43151t;
        StringBuilder sb = new StringBuilder(i2 + (i2 / 8) + 1);
        for (int i3 = 0; i3 < this.f43151t; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(J2(i3) ? 'X' : '.');
        }
        return sb.toString();
    }

    public int xMQ() {
        return (this.f43151t + 7) / 8;
    }

    j(int[] iArr, int i2) {
        this.f43150n = iArr;
        this.f43151t = i2;
    }
}
