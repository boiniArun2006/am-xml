package Vi;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.alightcreative.time.Kw.znsSxz;
import d.AbstractC1951j;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX extends Drawable {
    private final RectF HI;
    private int Ik;
    private final float J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f11025O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Paint f11026S;
    private final float Uo;
    private boolean WPU;
    private final Path XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Path f11027Z;
    private final boolean aYN;
    private final boolean az;
    private final RectF ck;
    private final int gh;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f11028n;
    private final float nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Path f11029o;
    private final int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorFilter f11030r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f11031t;
    private final RectF ty;
    private final Drawable xMQ;

    public /* synthetic */ fuX(int i2, int i3, float f3, float f4, float f5, float f6, float f7, boolean z2, Drawable drawable, int i5, int i7, int i8, boolean z3, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f3, f4, f5, f6, (i9 & 64) != 0 ? -1.0f : f7, (i9 & 128) != 0 ? false : z2, (i9 & 256) != 0 ? null : drawable, (i9 & 512) != 0 ? -15854825 : i5, (i9 & 1024) != 0 ? -855638017 : i7, (i9 & 2048) != 0 ? -15854825 : i8, (i9 & 4096) != 0 ? true : z3);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public fuX(int i2, int i3, float f3, float f4, float f5, float f6, float f7, boolean z2, Drawable drawable, int i5, int i7, int i8, boolean z3) {
        this.f11028n = i2;
        this.rl = i3;
        this.f11031t = f3;
        this.nr = f4;
        this.f11025O = f5;
        this.J2 = f6;
        this.Uo = f7;
        this.KN = z2;
        this.xMQ = drawable;
        this.mUb = i5;
        this.gh = i7;
        this.qie = i8;
        this.az = z3;
        this.ty = new RectF();
        this.HI = new RectF();
        this.ck = new RectF();
        this.Ik = 255;
        this.f11029o = new Path();
        this.f11027Z = new Path();
        this.XQ = new Path();
        boolean z4 = true;
        this.f11026S = new Paint(1);
        if (i2 > 0 && i3 > 0) {
            z4 = false;
        }
        this.aYN = z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f11026S.setColor(this.WPU ? this.gh : this.mUb);
        Paint paint = this.f11026S;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        canvas.drawPath(this.f11029o, this.f11026S);
        this.f11026S.setColor(this.qie);
        this.f11026S.setStyle(style);
        Path path = this.WPU ? this.XQ : this.az ? this.f11027Z : null;
        if (path != null) {
            canvas.drawPath(path, this.f11026S);
        }
        if (this.KN) {
            if (this.aYN) {
                Drawable drawable = this.xMQ;
                if (drawable != null) {
                    float intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                    this.xMQ.setBounds((int) (this.ty.centerX() - intrinsicWidth), (int) (this.ty.centerY() - (this.xMQ.getIntrinsicHeight() / 2)), (int) (this.ty.centerX() + intrinsicWidth), (int) (this.ty.centerY() + intrinsicWidth));
                    this.xMQ.setAlpha(this.WPU ? 255 : 127);
                    this.xMQ.draw(canvas);
                    return;
                }
                return;
            }
            this.f11026S.setTextAlign(Paint.Align.CENTER);
            this.f11026S.setTextSize(this.Uo / 3.0f);
            canvas.drawText(this.f11028n + ":" + this.rl, this.ty.centerX(), this.ty.centerY() - (this.f11026S.ascent() * 0.46f), this.f11026S);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        float f3 = this.Uo;
        if (f3 < 0.0f) {
            return -1;
        }
        int i2 = this.rl;
        int i3 = this.f11028n;
        return i2 > i3 ? (int) ((f3 * i2) / i3) : (int) f3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f3 = this.Uo;
        if (f3 < 0.0f) {
            return -1;
        }
        int i2 = this.f11028n;
        int i3 = this.rl;
        return i2 > i3 ? (int) ((f3 * i2) / i3) : (int) f3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, znsSxz.dGyDiUOQb);
        super.onBoundsChange(rect);
        this.ty.set(rect);
        RectF rectF = this.ty;
        float f3 = this.J2;
        rectF.inset(f3, f3);
        boolean z2 = this.aYN;
        Pair pairUo = AbstractC1951j.Uo(z2 ? 1 : this.f11028n, z2 ? 1 : this.rl, (int) this.ty.width(), (int) this.ty.height());
        int iIntValue = ((Number) pairUo.component1()).intValue();
        int iIntValue2 = ((Number) pairUo.component2()).intValue();
        float fCenterX = this.ty.centerX();
        float fCenterY = this.ty.centerY();
        float f4 = iIntValue / 2.0f;
        float f5 = iIntValue2 / 2.0f;
        this.HI.set(fCenterX - f4, fCenterY - f5, fCenterX + f4, fCenterY + f5);
        this.ck.set(this.HI);
        RectF rectF2 = this.ck;
        float f6 = this.f11025O;
        rectF2.inset(f6, f6);
        this.f11029o.rewind();
        Path path = this.f11029o;
        RectF rectF3 = this.HI;
        float f7 = this.f11031t;
        Path.Direction direction = Path.Direction.CCW;
        path.addRoundRect(rectF3, f7, f7, direction);
        this.f11027Z.rewind();
        this.f11027Z.setFillType(Path.FillType.WINDING);
        Path path2 = this.f11027Z;
        RectF rectF4 = this.HI;
        float f8 = this.f11031t;
        path2.addRoundRect(rectF4, f8, f8, direction);
        Path path3 = this.f11027Z;
        RectF rectF5 = this.ck;
        float f9 = this.f11031t;
        Path.Direction direction2 = Path.Direction.CW;
        path3.addRoundRect(rectF5, f9 / 2.0f, f9, direction2);
        this.XQ.rewind();
        this.XQ.set(this.f11027Z);
        Path path4 = this.f11027Z;
        RectF rectF6 = this.HI;
        float f10 = rectF6.left;
        float f11 = rectF6.top;
        float f12 = this.nr;
        path4.addRect(f10, f11 + f12, f10 + this.f11025O, rectF6.bottom - f12, direction2);
        Path path5 = this.f11027Z;
        RectF rectF7 = this.HI;
        float f13 = rectF7.right;
        float f14 = f13 - this.f11025O;
        float f15 = rectF7.top;
        float f16 = this.nr;
        path5.addRect(f14, f15 + f16, f13, rectF7.bottom - f16, direction2);
        Path path6 = this.f11027Z;
        RectF rectF8 = this.HI;
        float f17 = rectF8.left;
        float f18 = this.nr;
        float f19 = rectF8.top;
        path6.addRect(f17 + f18, f19, rectF8.right - f18, f19 + this.f11025O, direction2);
        Path path7 = this.f11027Z;
        RectF rectF9 = this.HI;
        float f20 = rectF9.left;
        float f21 = this.nr;
        float f22 = rectF9.bottom;
        path7.addRect(f20 + f21, f22 - this.f11025O, rectF9.right - f21, f22, direction2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zContains = ArraysKt.contains(state, R.attr.state_activated);
        if (zContains == this.WPU) {
            return false;
        }
        this.WPU = zContains;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.Ik = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11030r = colorFilter;
    }
}
