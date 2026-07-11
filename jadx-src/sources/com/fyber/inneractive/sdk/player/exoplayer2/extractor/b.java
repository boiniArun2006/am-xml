package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f54723g = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f54724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f54727d = new byte[65536];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54729f;

    public final boolean a(byte[] bArr, int i2, int i3, boolean z2) {
        if (!a(i3, z2)) {
            return false;
        }
        System.arraycopy(this.f54727d, this.f54728e - i3, bArr, i2, i3);
        return true;
    }

    public final boolean b(byte[] bArr, int i2, int i3, boolean z2) throws InterruptedException, EOFException {
        int iA;
        int i5 = this.f54729f;
        if (i5 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i5, i3);
            System.arraycopy(this.f54727d, 0, bArr, i2, iMin);
            b(iMin);
            iA = iMin;
        }
        while (iA < i3 && iA != -1) {
            iA = a(bArr, i2, i3, iA, z2);
        }
        if (iA != -1) {
            this.f54726c += (long) iA;
        }
        return iA != -1;
    }

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, long j2, long j3) {
        this.f54724a = hVar;
        this.f54726c = j2;
        this.f54725b = j3;
    }

    public final boolean a(int i2, boolean z2) throws InterruptedException, EOFException {
        int i3 = this.f54728e + i2;
        byte[] bArr = this.f54727d;
        if (i3 > bArr.length) {
            int i5 = z.f56234a;
            this.f54727d = Arrays.copyOf(this.f54727d, Math.max(65536 + i3, Math.min(bArr.length * 2, i3 + 524288)));
        }
        int iMin = Math.min(this.f54729f - this.f54728e, i2);
        while (iMin < i2) {
            int i7 = i2;
            boolean z3 = z2;
            iMin = a(this.f54727d, this.f54728e, i7, iMin, z3);
            if (iMin == -1) {
                return false;
            }
            i2 = i7;
            z2 = z3;
        }
        int i8 = this.f54728e + i2;
        this.f54728e = i8;
        this.f54729f = Math.max(this.f54729f, i8);
        return true;
    }

    public final void b(int i2) {
        int i3 = this.f54729f - i2;
        this.f54729f = i3;
        this.f54728e = 0;
        byte[] bArr = this.f54727d;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f54727d = bArr2;
    }

    public final void a(int i2) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f54729f, i2);
        b(iMin);
        int iA = iMin;
        while (iA < i2 && iA != -1) {
            iA = a(f54723g, -iA, Math.min(i2, iA + 4096), iA, false);
        }
        if (iA != -1) {
            this.f54726c += (long) iA;
        }
    }

    public final int a(byte[] bArr, int i2, int i3, int i5, boolean z2) throws InterruptedException, EOFException {
        if (!Thread.interrupted()) {
            int i7 = this.f54724a.read(bArr, i2 + i5, i3 - i5);
            if (i7 != -1) {
                return i5 + i7;
            }
            if (i5 == 0 && z2) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
