package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Dsr {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f57952O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f57953n = 0;
    private int rl = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f57954t = 0;
    private int[] nr = new int[16];

    public void rl() {
        this.f57953n = 0;
        this.rl = -1;
        this.f57954t = 0;
    }

    private void t() {
        int[] iArr = this.nr;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i2 = this.f57953n;
        int i3 = length2 - i2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.nr, 0, iArr2, i3, i2);
        this.f57953n = 0;
        this.rl = this.f57954t - 1;
        this.nr = iArr2;
        this.f57952O = iArr2.length - 1;
    }

    public int O() {
        int i2 = this.f57954t;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.nr;
        int i3 = this.f57953n;
        int i5 = iArr[i3];
        this.f57953n = (i3 + 1) & this.f57952O;
        this.f57954t = i2 - 1;
        return i5;
    }

    public void n(int i2) {
        if (this.f57954t == this.nr.length) {
            t();
        }
        int i3 = (this.rl + 1) & this.f57952O;
        this.rl = i3;
        this.nr[i3] = i2;
        this.f57954t++;
    }

    public boolean nr() {
        return this.f57954t == 0;
    }

    public Dsr() {
        this.f57952O = r0.length - 1;
    }
}
