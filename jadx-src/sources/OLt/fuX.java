package OLt;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX extends CN3 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Matrix f7341S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f7342Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f7343g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f7344o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f7345r;

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f7344o <= 0 && ((i2 = this.f7342Z) == 0 || i2 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f7345r);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i2 = this.f7342Z;
        return (i2 == 5 || i2 == 7 || this.f7344o % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i2 = this.f7342Z;
        return (i2 == 5 || i2 == 7 || this.f7344o % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // OLt.CN3, OLt.Ew
    public void nr(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        ty(transform);
        if (this.f7345r.isIdentity()) {
            return;
        }
        transform.preConcat(this.f7345r);
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int i2;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i3 = this.f7344o;
        if (i3 <= 0 && ((i2 = this.f7342Z) == 0 || i2 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i5 = this.f7342Z;
        if (i5 == 2) {
            this.f7345r.setScale(-1.0f, 1.0f);
        } else if (i5 == 7) {
            this.f7345r.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f7345r.postScale(-1.0f, 1.0f);
        } else if (i5 == 4) {
            this.f7345r.setScale(1.0f, -1.0f);
        } else if (i5 != 5) {
            this.f7345r.setRotate(i3, bounds.centerX(), bounds.centerY());
        } else {
            this.f7345r.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f7345r.postScale(1.0f, -1.0f);
        }
        this.f7341S.reset();
        this.f7345r.invert(this.f7341S);
        this.f7343g.set(bounds);
        this.f7341S.mapRect(this.f7343g);
        RectF rectF = this.f7343g;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public fuX(Drawable drawable, int i2, int i3) {
        super(drawable);
        this.f7345r = new Matrix();
        this.f7344o = i2 - (i2 % 90);
        this.f7342Z = (i3 < 0 || i3 > 8) ? 0 : i3;
        this.f7341S = new Matrix();
        this.f7343g = new RectF();
    }
}
