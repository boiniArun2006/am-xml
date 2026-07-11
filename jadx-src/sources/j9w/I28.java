package j9w;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CharSequence f69329n;
    private final byte[] nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69330t;

    public final void KN() {
        int i2;
        int i3;
        int i5 = 0;
        int i7 = 0;
        int i8 = 4;
        while (true) {
            if (i8 == this.rl && i5 == 0) {
                n(i7);
                i7++;
            }
            if (i8 == this.rl - 2 && i5 == 0 && this.f69330t % 4 != 0) {
                rl(i7);
                i7++;
            }
            if (i8 == this.rl - 2 && i5 == 0 && this.f69330t % 8 == 4) {
                t(i7);
                i7++;
            }
            if (i8 == this.rl + 4 && i5 == 2 && this.f69330t % 8 == 0) {
                nr(i7);
                i7++;
            }
            while (true) {
                if (i8 < this.rl && i5 >= 0 && !J2(i5, i8)) {
                    mUb(i8, i5, i7);
                    i7++;
                }
                int i9 = i8 - 2;
                int i10 = i5 + 2;
                if (i9 < 0 || i10 >= this.f69330t) {
                    break;
                }
                i8 = i9;
                i5 = i10;
            }
            int i11 = i8 - 1;
            int i12 = i5 + 5;
            while (true) {
                if (i11 >= 0 && i12 < this.f69330t && !J2(i12, i11)) {
                    mUb(i11, i12, i7);
                    i7++;
                }
                int i13 = i11 + 2;
                int i14 = i12 - 2;
                i2 = this.rl;
                if (i13 >= i2 || i14 < 0) {
                    break;
                }
                i11 = i13;
                i12 = i14;
            }
            i8 = i11 + 5;
            i5 = i12 - 1;
            if (i8 >= i2 && i5 >= (i3 = this.f69330t)) {
                break;
            }
        }
        if (J2(i3 - 1, i2 - 1)) {
            return;
        }
        xMQ(this.f69330t - 1, this.rl - 1, true);
        xMQ(this.f69330t - 2, this.rl - 2, true);
    }

    private boolean J2(int i2, int i3) {
        return this.nr[(i3 * this.f69330t) + i2] >= 0;
    }

    private void Uo(int i2, int i3, int i5, int i7) {
        if (i2 < 0) {
            int i8 = this.rl;
            i2 += i8;
            i3 += 4 - ((i8 + 4) % 8);
        }
        if (i3 < 0) {
            int i9 = this.f69330t;
            i3 += i9;
            i2 += 4 - ((i9 + 4) % 8);
        }
        xMQ(i3, i2, (this.f69329n.charAt(i5) & (1 << (8 - i7))) != 0);
    }

    private void mUb(int i2, int i3, int i5) {
        int i7 = i2 - 2;
        int i8 = i3 - 2;
        Uo(i7, i8, i5, 1);
        int i9 = i3 - 1;
        Uo(i7, i9, i5, 2);
        int i10 = i2 - 1;
        Uo(i10, i8, i5, 3);
        Uo(i10, i9, i5, 4);
        Uo(i10, i3, i5, 5);
        Uo(i2, i8, i5, 6);
        Uo(i2, i9, i5, 7);
        Uo(i2, i3, i5, 8);
    }

    private void n(int i2) {
        Uo(this.rl - 1, 0, i2, 1);
        Uo(this.rl - 1, 1, i2, 2);
        Uo(this.rl - 1, 2, i2, 3);
        Uo(0, this.f69330t - 2, i2, 4);
        Uo(0, this.f69330t - 1, i2, 5);
        Uo(1, this.f69330t - 1, i2, 6);
        Uo(2, this.f69330t - 1, i2, 7);
        Uo(3, this.f69330t - 1, i2, 8);
    }

    private void nr(int i2) {
        Uo(this.rl - 1, 0, i2, 1);
        Uo(this.rl - 1, this.f69330t - 1, i2, 2);
        Uo(0, this.f69330t - 3, i2, 3);
        Uo(0, this.f69330t - 2, i2, 4);
        Uo(0, this.f69330t - 1, i2, 5);
        Uo(1, this.f69330t - 3, i2, 6);
        Uo(1, this.f69330t - 2, i2, 7);
        Uo(1, this.f69330t - 1, i2, 8);
    }

    private void rl(int i2) {
        Uo(this.rl - 3, 0, i2, 1);
        Uo(this.rl - 2, 0, i2, 2);
        Uo(this.rl - 1, 0, i2, 3);
        Uo(0, this.f69330t - 4, i2, 4);
        Uo(0, this.f69330t - 3, i2, 5);
        Uo(0, this.f69330t - 2, i2, 6);
        Uo(0, this.f69330t - 1, i2, 7);
        Uo(1, this.f69330t - 1, i2, 8);
    }

    private void t(int i2) {
        Uo(this.rl - 3, 0, i2, 1);
        Uo(this.rl - 2, 0, i2, 2);
        Uo(this.rl - 1, 0, i2, 3);
        Uo(0, this.f69330t - 2, i2, 4);
        Uo(0, this.f69330t - 1, i2, 5);
        Uo(1, this.f69330t - 1, i2, 6);
        Uo(2, this.f69330t - 1, i2, 7);
        Uo(3, this.f69330t - 1, i2, 8);
    }

    private void xMQ(int i2, int i3, boolean z2) {
        this.nr[(i3 * this.f69330t) + i2] = z2 ? (byte) 1 : (byte) 0;
    }

    public final boolean O(int i2, int i3) {
        return this.nr[(i3 * this.f69330t) + i2] == 1;
    }

    public I28(CharSequence charSequence, int i2, int i3) {
        this.f69329n = charSequence;
        this.f69330t = i2;
        this.rl = i3;
        byte[] bArr = new byte[i2 * i3];
        this.nr = bArr;
        Arrays.fill(bArr, (byte) -1);
    }
}
