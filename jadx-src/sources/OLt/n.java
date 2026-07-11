package OLt;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n extends CN3 implements Runnable {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f7355S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    float f7356Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7357o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7358r;

    public n(Drawable drawable, int i2) {
        this(drawable, i2, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7355S = false;
        this.f7356Z += Ik();
        invalidateSelf();
    }

    public n(Drawable drawable, int i2, boolean z2) {
        super((Drawable) Hh.C.Uo(drawable));
        this.f7356Z = 0.0f;
        this.f7355S = false;
        this.f7358r = i2;
        this.f7357o = z2;
    }

    private int Ik() {
        return (int) ((20.0f / this.f7358r) * 360.0f);
    }

    private void r() {
        if (this.f7355S) {
            return;
        }
        this.f7355S = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i2 = bounds.right - bounds.left;
        int i3 = bounds.bottom - bounds.top;
        float f3 = this.f7356Z;
        if (!this.f7357o) {
            f3 = 360.0f - f3;
        }
        canvas.rotate(f3, r3 + (i2 / 2), r1 + (i3 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        r();
    }
}
