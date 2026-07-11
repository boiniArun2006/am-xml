package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f55997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f55999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f56000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f56001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56002f;

    public abstract int a();

    public final boolean a(int i2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.f56001e[i2] > jElapsedRealtime;
        int i3 = 0;
        while (i3 < this.f55998b && !z2) {
            z2 = i3 != i2 && this.f56001e[i3] <= jElapsedRealtime;
            i3++;
        }
        if (!z2) {
            return false;
        }
        long[] jArr = this.f56001e;
        jArr[i2] = Math.max(jArr[i2], jElapsedRealtime + 60000);
        return true;
    }

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f55997a == bVar.f55997a && Arrays.equals(this.f55999c, bVar.f55999c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f56002f == 0) {
            this.f56002f = Arrays.hashCode(this.f55999c) + (System.identityHashCode(this.f55997a) * 31);
        }
        return this.f56002f;
    }

    public b(y yVar, int... iArr) {
        if (iArr.length > 0) {
            yVar.getClass();
            this.f55997a = yVar;
            int length = iArr.length;
            this.f55998b = length;
            this.f56000d = new o[length];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                this.f56000d[i3] = yVar.f55986b[iArr[i3]];
            }
            Arrays.sort(this.f56000d, new a());
            this.f55999c = new int[this.f55998b];
            while (true) {
                int i5 = this.f55998b;
                if (i2 < i5) {
                    this.f55999c[i2] = yVar.a(this.f56000d[i2]);
                    i2++;
                } else {
                    this.f56001e = new long[i5];
                    return;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
