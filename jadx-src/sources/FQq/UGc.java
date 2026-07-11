package FQq;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class UGc {
    private Bitmap J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f2556O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f2557n;
    private final String nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f2558t;

    public int J2() {
        return this.f2557n;
    }

    public String O() {
        return this.f2558t;
    }

    public void Uo(Bitmap bitmap) {
        this.J2 = bitmap;
    }

    public UGc n(float f3) {
        UGc uGc = new UGc((int) (this.f2557n * f3), (int) (this.rl * f3), this.f2558t, this.nr, this.f2556O);
        Bitmap bitmap = this.J2;
        if (bitmap != null) {
            uGc.Uo(Bitmap.createScaledBitmap(bitmap, uGc.f2557n, uGc.rl, true));
        }
        return uGc;
    }

    public int nr() {
        return this.rl;
    }

    public Bitmap rl() {
        return this.J2;
    }

    public String t() {
        return this.nr;
    }

    public UGc(int i2, int i3, String str, String str2, String str3) {
        this.f2557n = i2;
        this.rl = i3;
        this.f2558t = str;
        this.nr = str2;
        this.f2556O = str3;
    }
}
