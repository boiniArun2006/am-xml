package fJf;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Pj0.fuX f66861O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f66862n;
    private final int nr;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f66863t;

    class j implements Pj0.fuX {
        j() {
        }

        @Override // Pj0.fuX
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Bitmap bitmap) {
            try {
                CN3.this.n(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public synchronized long J2() {
        return this.rl;
    }

    public synchronized boolean Uo(Bitmap bitmap) {
        int iMUb = com.facebook.imageutils.Ml.mUb(bitmap);
        int i2 = this.f66862n;
        if (i2 < this.f66863t) {
            long j2 = this.rl;
            long j3 = iMUb;
            if (j2 + j3 <= this.nr) {
                this.f66862n = i2 + 1;
                this.rl = j2 + j3;
                return true;
            }
        }
        return false;
    }

    public synchronized void n(Bitmap bitmap) {
        int iMUb = com.facebook.imageutils.Ml.mUb(bitmap);
        Hh.C.t(this.f66862n > 0, "No bitmaps registered.");
        long j2 = iMUb;
        Hh.C.nr(j2 <= this.rl, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iMUb), Long.valueOf(this.rl));
        this.rl -= j2;
        this.f66862n--;
    }

    public synchronized int nr() {
        return this.nr;
    }

    public synchronized int rl() {
        return this.f66862n;
    }

    public synchronized int t() {
        return this.f66863t;
    }

    public Pj0.fuX O() {
        return this.f66861O;
    }

    public CN3(int i2, int i3) {
        boolean z2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Hh.C.rl(Boolean.valueOf(z2));
        Hh.C.rl(Boolean.valueOf(i3 > 0));
        this.f66863t = i2;
        this.nr = i3;
        this.f66861O = new j();
    }
}
