package fJf;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: fJf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C2104c implements Dsr {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f66882O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final g9s f66883n = new aC();
    private final DAz nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f66884t;

    private synchronized void xMQ(int i2) {
        Bitmap bitmap;
        while (this.f66882O > i2 && (bitmap = (Bitmap) this.f66883n.pop()) != null) {
            int iN = this.f66883n.n(bitmap);
            this.f66882O -= iN;
            this.nr.rl(iN);
        }
    }

    @Override // A72.Wre
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i2) {
        try {
            int i3 = this.f66882O;
            int i5 = this.rl;
            if (i3 > i5) {
                xMQ(i5);
            }
            Bitmap bitmap = (Bitmap) this.f66883n.get(i2);
            if (bitmap == null) {
                return J2(i2);
            }
            int iN = this.f66883n.n(bitmap);
            this.f66882O -= iN;
            this.nr.O(iN);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    private Bitmap J2(int i2) {
        this.nr.nr(i2);
        return Bitmap.createBitmap(1, i2, Bitmap.Config.ALPHA_8);
    }

    @Override // A72.Wre, Pj0.fuX
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public void n(Bitmap bitmap) {
        int iN = this.f66883n.n(bitmap);
        if (iN <= this.f66884t) {
            this.nr.t(iN);
            this.f66883n.rl(bitmap);
            synchronized (this) {
                this.f66882O += iN;
            }
        }
    }

    public C2104c(int i2, int i3, DAz dAz, A72.Ml ml) {
        this.rl = i2;
        this.f66884t = i3;
        this.nr = dAz;
        if (ml != null) {
            ml.n(this);
        }
    }
}
