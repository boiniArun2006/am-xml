package AL;

import Be4.Dsr;
import Z.CN3;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n extends Drawable implements Drawable.Callback, Animatable2Compat {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final j f41T = new j(null);
    private int E2;
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f42O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f43S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Drawable f44X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f45Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f46e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f48n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f49o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f50r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f51t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private final void rl() {
        this.E2 = 2;
        this.f46e = null;
        List list = this.f50r;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Animatable2Compat.AnimationCallback) list.get(i2)).rl(this);
        }
    }

    private final int n(Integer num, Integer num2) {
        if (this.J2 || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i2 = this.E2;
        if (i2 == 0) {
            Drawable drawable2 = this.f46e;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f47g);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i2 == 2) {
            Drawable drawable3 = this.f44X;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f47g);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f43S) / ((double) this.f51t);
        double dCoerceIn = RangesKt.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i3 = this.f47g;
        int i5 = (int) (dCoerceIn * ((double) i3));
        if (this.f42O) {
            i3 -= i5;
        }
        boolean z2 = dUptimeMillis >= 1.0d;
        if (!z2 && (drawable = this.f46e) != null) {
            drawable.setAlpha(i3);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.f44X;
        if (drawable4 != null) {
            drawable4.setAlpha(i5);
            iSave = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z2) {
            rl();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f47g;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i2 = this.E2;
        if (i2 == 0) {
            Drawable drawable2 = this.f46e;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2 && (drawable = this.f44X) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f44X;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.f46e;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f45Z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f49o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f46e;
        Drawable drawable2 = this.f44X;
        int i2 = this.E2;
        if (i2 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i2 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.E2 == 1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f46e;
        if (drawable != null) {
            t(drawable, rect);
        }
        Drawable drawable2 = this.f44X;
        if (drawable2 != null) {
            t(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f46e;
        boolean level = drawable != null ? drawable.setLevel(i2) : false;
        Drawable drawable2 = this.f44X;
        return level || (drawable2 != null ? drawable2.setLevel(i2) : false);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f46e;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f44X;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 >= 0 && i2 < 256) {
            this.f47g = i2;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i2).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f46e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f44X;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f46e;
        if (drawable != null) {
            drawable.setTint(i2);
        }
        Drawable drawable2 = this.f44X;
        if (drawable2 != null) {
            drawable2.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f46e;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f44X;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f46e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f44X;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f46e;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f44X;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f46e;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f44X;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.E2 != 0) {
            return;
        }
        this.E2 = 1;
        this.f43S = SystemClock.uptimeMillis();
        List list = this.f50r;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Animatable2Compat.AnimationCallback) list.get(i2)).t(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f46e;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f44X;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.E2 != 2) {
            rl();
        }
    }

    public n(Drawable drawable, Drawable drawable2, CN3 cn3, int i2, boolean z2, boolean z3) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Drawable drawableMutate;
        this.f48n = cn3;
        this.f51t = i2;
        this.f42O = z2;
        this.J2 = z3;
        if (drawable != null) {
            numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            numValueOf = null;
        }
        if (drawable2 != null) {
            numValueOf2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            numValueOf2 = null;
        }
        this.f49o = n(numValueOf, numValueOf2);
        if (drawable != null) {
            numValueOf3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            numValueOf3 = null;
        }
        if (drawable2 != null) {
            numValueOf4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            numValueOf4 = null;
        }
        this.f45Z = n(numValueOf3, numValueOf4);
        this.f47g = 255;
        if (drawable != null) {
            drawableMutate = drawable.mutate();
        } else {
            drawableMutate = null;
        }
        this.f46e = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.mutate() : null;
        this.f44X = drawableMutate2;
        if (i2 > 0) {
            Drawable drawable3 = this.f46e;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawableMutate2 != null) {
                drawableMutate2.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public final void t(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            double dT = Dsr.t(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f48n);
            double d2 = 2;
            int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dT)) / d2);
            int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (dT * ((double) intrinsicHeight))) / d2);
            drawable.setBounds(rect.left + iRoundToInt, rect.top + iRoundToInt2, rect.right - iRoundToInt, rect.bottom - iRoundToInt2);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
