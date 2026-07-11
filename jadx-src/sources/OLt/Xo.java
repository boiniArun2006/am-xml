package OLt;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Xo extends CN3 {
    private final Matrix E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f7332S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f7333Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f7334g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f7335o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC1421z f7336r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xo(Drawable drawable, InterfaceC1421z scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.E2 = new Matrix();
        this.f7336r = scaleType;
    }

    public final void XQ(PointF pointF) {
        if (Hh.Dsr.n(this.f7335o, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f7335o = null;
        } else {
            if (this.f7335o == null) {
                this.f7335o = new PointF();
            }
            PointF pointF2 = this.f7335o;
            Intrinsics.checkNotNull(pointF2);
            pointF2.set(pointF);
        }
        Ik();
        invalidateSelf();
    }

    public final InterfaceC1421z Z() {
        return this.f7336r;
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        r();
        if (this.f7334g == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f7334g);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // OLt.CN3, OLt.Ew
    public void nr(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        ty(transform);
        r();
        Matrix matrix = this.f7334g;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    public final PointF o() {
        return this.f7335o;
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Ik();
    }

    private final void r() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f7333Z == current.getIntrinsicWidth() && this.f7332S == current.getIntrinsicHeight()) {
            return;
        }
        Ik();
    }

    @Override // OLt.CN3
    public Drawable HI(Drawable drawable) {
        Drawable drawableHI = super.HI(drawable);
        Ik();
        return drawableHI;
    }

    public final void Ik() {
        float f3;
        Drawable current = getCurrent();
        if (current == null) {
            this.f7332S = 0;
            this.f7333Z = 0;
            this.f7334g = null;
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f7333Z = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f7332S = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
                current.setBounds(bounds);
                this.f7334g = null;
                return;
            }
            if (this.f7336r == InterfaceC1421z.f7396n) {
                current.setBounds(bounds);
                this.f7334g = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.E2.reset();
            InterfaceC1421z interfaceC1421z = this.f7336r;
            Matrix matrix = this.E2;
            PointF pointF = this.f7335o;
            float f4 = 0.5f;
            if (pointF != null) {
                Intrinsics.checkNotNull(pointF);
                f3 = pointF.x;
            } else {
                f3 = 0.5f;
            }
            PointF pointF2 = this.f7335o;
            if (pointF2 != null) {
                Intrinsics.checkNotNull(pointF2);
                f4 = pointF2.y;
            }
            interfaceC1421z.n(matrix, bounds, intrinsicWidth, intrinsicHeight, f3, f4);
            this.f7334g = this.E2;
            return;
        }
        current.setBounds(bounds);
        this.f7334g = null;
    }
}
