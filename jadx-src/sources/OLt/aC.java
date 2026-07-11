package OLt;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class aC extends qz {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private final Paint f7337GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Paint f7338I;
    private final Bitmap Nxk;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private WeakReference f7339Y;
    private RectF dR0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7340k;

    public aC(Resources resources, Bitmap bitmap, Paint paint, boolean z2) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f7338I = paint2;
        Paint paint3 = new Paint(1);
        this.f7337GR = paint3;
        this.dR0 = null;
        this.Nxk = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f7340k = z2;
    }

    private void HI() {
        Shader shader;
        WeakReference weakReference = this.f7339Y;
        if (weakReference == null || weakReference.get() != this.Nxk) {
            this.f7339Y = new WeakReference(this.Nxk);
            if (this.Nxk != null) {
                Paint paint = this.f7338I;
                Bitmap bitmap = this.Nxk;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f7391o = true;
            }
        }
        if (this.f7391o && (shader = this.f7338I.getShader()) != null) {
            shader.setLocalMatrix(this.f7379M);
            this.f7391o = false;
        }
        this.f7338I.setFilterBitmap(nr());
    }

    @Override // OLt.qz, OLt.Dsr
    public void KN(boolean z2) {
        this.f7340k = z2;
    }

    @Override // OLt.qz, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (T5.n.nr()) {
            T5.n.n("RoundedBitmapDrawable#draw");
        }
        if (!xMQ()) {
            super.draw(canvas);
            if (T5.n.nr()) {
                T5.n.rl();
                return;
            }
            return;
        }
        ty();
        qie();
        HI();
        int iSave = canvas.save();
        canvas.concat(this.p5);
        if (!this.f7340k && this.dR0 != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.dR0);
            canvas.drawPath(this.f7392r, this.f7338I);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(this.f7392r, this.f7338I);
        }
        float f3 = this.J2;
        if (f3 > 0.0f) {
            this.f7337GR.setStrokeWidth(f3);
            this.f7337GR.setColor(I28.t(this.f7386Z, this.f7338I.getAlpha()));
            canvas.drawPath(this.f7382S, this.f7337GR);
        }
        canvas.restoreToCount(iSave);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    @Override // OLt.qz, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        super.setAlpha(i2);
        if (i2 != this.f7338I.getAlpha()) {
            this.f7338I.setAlpha(i2);
            super.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // OLt.qz, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f7338I.setColorFilter(colorFilter);
    }

    @Override // OLt.qz
    protected void ty() {
        super.ty();
        if (!this.f7340k) {
            if (this.dR0 == null) {
                this.dR0 = new RectF();
            }
            this.f7379M.mapRect(this.dR0, this.f7380N);
        }
    }

    @Override // OLt.qz
    boolean xMQ() {
        if (super.xMQ() && this.Nxk != null) {
            return true;
        }
        return false;
    }
}
