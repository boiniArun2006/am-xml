package OLt;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j extends Drawable implements Drawable.Callback, Ew, Z {
    private final w6[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Drawable[] f7346O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Ew f7349n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f7352t = new Ml();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f7351r = new Rect();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7350o = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f7348Z = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f7347S = false;

    /* JADX INFO: renamed from: OLt.j$j, reason: collision with other inner class name */
    class C0249j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f7353n;

        C0249j(int i2) {
            this.f7353n = i2;
        }

        @Override // OLt.w6
        public Drawable O(Drawable drawable) {
            return j.this.J2(this.f7353n, drawable);
        }

        @Override // OLt.w6
        public Drawable n() {
            return j.this.rl(this.f7353n);
        }
    }

    public Drawable J2(int i2, Drawable drawable) {
        Hh.C.rl(Boolean.valueOf(i2 >= 0));
        Hh.C.rl(Boolean.valueOf(i2 < this.f7346O.length));
        Drawable drawable2 = this.f7346O[i2];
        if (drawable != drawable2) {
            if (drawable != null && this.f7347S) {
                drawable.mutate();
            }
            I28.nr(this.f7346O[i2], null, null);
            I28.nr(drawable, null, null);
            I28.O(drawable, this.f7352t);
            I28.n(drawable, this);
            I28.nr(drawable, this, this);
            this.f7348Z = false;
            this.f7346O[i2] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i2 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i2++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i2 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i2++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i2 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f7351r;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                this.f7347S = true;
                return this;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.mutate();
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i3 >= drawableArr.length) {
                return z2;
            }
            Drawable drawable = drawableArr[i3];
            if (drawable != null && drawable.setLevel(i2)) {
                z2 = true;
            }
            i3++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return z2;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setState(iArr)) {
                z2 = true;
            }
            i2++;
        }
    }

    public Drawable rl(int i2) {
        Hh.C.rl(Boolean.valueOf(i2 >= 0));
        Hh.C.rl(Boolean.valueOf(i2 < this.f7346O.length));
        return this.f7346O[i2];
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setHotspot(f3, f4);
            }
            i2++;
        }
    }

    public w6 t(int i2) {
        Hh.C.rl(Boolean.valueOf(i2 >= 0));
        Hh.C.rl(Boolean.valueOf(i2 < this.J2.length));
        w6[] w6VarArr = this.J2;
        if (w6VarArr[i2] == null) {
            w6VarArr[i2] = n(i2);
        }
        return this.J2[i2];
    }

    private w6 n(int i2) {
        return new C0249j(i2);
    }

    public int O() {
        return this.f7346O.length;
    }

    @Override // OLt.Z
    public void Uo(Ew ew) {
        this.f7349n = ew;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f7346O.length == 0) {
            return -2;
        }
        int i2 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f7348Z) {
            this.f7350o = false;
            int i2 = 0;
            while (true) {
                Drawable[] drawableArr = this.f7346O;
                boolean z2 = true;
                if (i2 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i2];
                boolean z3 = this.f7350o;
                if (drawable == null || !drawable.isStateful()) {
                    z2 = false;
                }
                this.f7350o = z3 | z2;
                i2++;
            }
            this.f7348Z = true;
        }
        return this.f7350o;
    }

    @Override // OLt.Ew
    public void nr(Matrix matrix) {
        Ew ew = this.f7349n;
        if (ew != null) {
            ew.nr(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // OLt.Ew
    public void qie(RectF rectF) {
        Ew ew = this.f7349n;
        if (ew != null) {
            ew.qie(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7352t.t(colorFilter);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f7352t.nr(z2);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setDither(z2);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f7352t.O(z2);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setFilterBitmap(z2);
            }
            i2++;
        }
    }

    public j(Drawable[] drawableArr) {
        int i2 = 0;
        Hh.C.Uo(drawableArr);
        this.f7346O = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f7346O;
            if (i2 < drawableArr2.length) {
                I28.nr(drawableArr2[i2], this, this);
                i2++;
            } else {
                this.J2 = new w6[drawableArr2.length];
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7346O;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setVisible(z2, z3);
                }
                i2++;
            } else {
                return visible;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
