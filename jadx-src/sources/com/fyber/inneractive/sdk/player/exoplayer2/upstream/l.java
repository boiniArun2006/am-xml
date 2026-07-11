package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56117d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f56118e = new a[100];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f56114a = new a[1];

    public final synchronized void a(int i2) {
        boolean z2 = i2 < this.f56115b;
        this.f56115b = i2;
        if (z2) {
            a();
        }
    }

    public final synchronized void a(a[] aVarArr) {
        try {
            int i2 = this.f56117d;
            int length = aVarArr.length + i2;
            a[] aVarArr2 = this.f56118e;
            if (length >= aVarArr2.length) {
                this.f56118e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i2 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f56013a;
                if (bArr != null && bArr.length != 65536) {
                    throw new IllegalArgumentException();
                }
                a[] aVarArr3 = this.f56118e;
                int i3 = this.f56117d;
                this.f56117d = i3 + 1;
                aVarArr3[i3] = aVar;
            }
            this.f56116c -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        int i2 = this.f56115b;
        int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
        int iMax = Math.max(0, ((i2 + 65535) / 65536) - this.f56116c);
        int i5 = this.f56117d;
        if (iMax >= i5) {
            return;
        }
        Arrays.fill(this.f56118e, iMax, i5, (Object) null);
        this.f56117d = iMax;
    }
}
