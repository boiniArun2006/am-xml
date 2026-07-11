package androidx.appcompat.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class DrawerArrowDrawable extends Drawable {
    private static final float az = (float) Math.toRadians(45.0d);
    private boolean J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f13748O;
    private final Path Uo;
    private float gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f13749n;
    private float nr;
    private int qie;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f13750t;
    private boolean xMQ;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ArrowDirection {
    }

    private static float n(float f3, float f4, float f5) {
        return f3 + ((f4 - f3) * f5);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = this.qie;
        boolean z2 = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? DrawableCompat.J2(this) == 0 : DrawableCompat.J2(this) == 1))) {
            z2 = true;
        }
        float f3 = this.rl;
        float fN = n(this.f13750t, (float) Math.sqrt(f3 * f3 * 2.0f), this.mUb);
        float fN2 = n(this.f13750t, this.nr, this.mUb);
        float fRound = Math.round(n(0.0f, this.gh, this.mUb));
        float fN3 = n(0.0f, az, this.mUb);
        float fN4 = n(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.mUb);
        double d2 = fN;
        double d4 = fN3;
        boolean z3 = z2;
        float fRound2 = Math.round(Math.cos(d4) * d2);
        float fRound3 = Math.round(d2 * Math.sin(d4));
        this.Uo.rewind();
        float fN5 = n(this.f13748O + this.f13749n.getStrokeWidth(), -this.gh, this.mUb);
        float f4 = (-fN2) / 2.0f;
        this.Uo.moveTo(f4 + fRound, 0.0f);
        this.Uo.rLineTo(fN2 - (fRound * 2.0f), 0.0f);
        this.Uo.moveTo(f4, fN5);
        this.Uo.rLineTo(fRound2, fRound3);
        this.Uo.moveTo(f4, -fN5);
        this.Uo.rLineTo(fRound2, -fRound3);
        this.Uo.close();
        canvas.save();
        float strokeWidth = this.f13749n.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f13748O);
        if (this.J2) {
            canvas.rotate(fN4 * (this.xMQ ^ z3 ? -1 : 1));
        } else if (z3) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.Uo, this.f13749n);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.KN;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.KN;
    }

    public void rl(float f3) {
        if (this.mUb != f3) {
            this.mUb = f3;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.f13749n.getAlpha()) {
            this.f13749n.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13749n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z2) {
        if (this.xMQ != z2) {
            this.xMQ = z2;
            invalidateSelf();
        }
    }
}
