package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f57897O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f57898n;
    public byte[] nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57899t;

    public void nr() {
        this.rl = false;
        this.f57899t = false;
    }

    public void O(int i2) {
        Assertions.checkState(!this.rl);
        boolean z2 = i2 == this.f57898n;
        this.rl = z2;
        if (z2) {
            this.f57897O = 3;
            this.f57899t = false;
        }
    }

    public void n(byte[] bArr, int i2, int i3) {
        if (this.rl) {
            int i5 = i3 - i2;
            byte[] bArr2 = this.nr;
            int length = bArr2.length;
            int i7 = this.f57897O;
            if (length < i7 + i5) {
                this.nr = Arrays.copyOf(bArr2, (i7 + i5) * 2);
            }
            System.arraycopy(bArr, i2, this.nr, this.f57897O, i5);
            this.f57897O += i5;
        }
    }

    public boolean rl(int i2) {
        if (!this.rl) {
            return false;
        }
        this.f57897O -= i2;
        this.rl = false;
        this.f57899t = true;
        return true;
    }

    public boolean t() {
        return this.f57899t;
    }

    public Ml(int i2, int i3) {
        this.f57898n = i2;
        byte[] bArr = new byte[i3 + 3];
        this.nr = bArr;
        bArr[2] = 1;
    }
}
