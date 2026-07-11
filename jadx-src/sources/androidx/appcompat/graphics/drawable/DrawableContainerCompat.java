package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    private long E2;
    private Drawable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Drawable f13723O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f13724S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private BlockInvalidateCallback f13725X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f13727e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f13728g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DrawableContainerState f13729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13730o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Rect f13732t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13731r = 255;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f13726Z = -1;

    static class BlockInvalidateCallback implements Drawable.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Drawable.Callback f13734n;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        public Drawable.Callback n() {
            Drawable.Callback callback = this.f13734n;
            this.f13734n = null;
            return callback;
        }

        public BlockInvalidateCallback rl(Drawable.Callback callback) {
            this.f13734n = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f13734n;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f13734n;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        BlockInvalidateCallback() {
        }
    }

    static abstract class DrawableContainerState extends Drawable.ConstantState {
        boolean E2;
        int HI;
        int Ik;
        SparseArray J2;
        int KN;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        boolean f13735N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f13736O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f13737S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        boolean f13738T;
        Drawable[] Uo;
        boolean ViF;
        boolean WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        PorterDuff.Mode f13739X;
        boolean XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f13740Z;
        boolean aYN;
        boolean az;
        int ck;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f13741e;
        ColorFilter fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f13742g;
        Rect gh;
        boolean iF;
        boolean mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final DrawableContainerCompat f13743n;
        int nY;
        int nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f13744o;
        boolean qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f13745r;
        Resources rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f13746t;
        int te;
        int ty;
        boolean xMQ;

        void ck() {
            this.f13745r = false;
            this.f13740Z = false;
        }

        protected void nr() {
            this.az = true;
            O();
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            this.HI = -1;
            this.ty = -1;
            this.Ik = 0;
            this.ck = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.ty) {
                    this.ty = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.HI) {
                    this.HI = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.ck) {
                    this.ck = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.Ik) {
                    this.Ik = minimumHeight;
                }
            }
        }

        private void O() {
            SparseArray sparseArray = this.J2;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.Uo[this.J2.keyAt(i2)] = Z(((Drawable.ConstantState) this.J2.valueAt(i2)).newDrawable(this.rl));
                }
                this.J2 = null;
            }
        }

        private Drawable Z(Drawable drawable) {
            DrawableCompat.az(drawable, this.nY);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f13743n);
            return drawableMutate;
        }

        public void HI(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.Uo;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.Uo = drawableArr;
        }

        public final boolean Ik() {
            return this.qie;
        }

        final int J2() {
            return this.Uo.length;
        }

        public final int KN() {
            return this.KN;
        }

        public final void S(int i2) {
            this.f13742g = i2;
        }

        public final Drawable Uo(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.Uo[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.J2;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableZ = Z(((Drawable.ConstantState) this.J2.valueAt(iIndexOfKey)).newDrawable(this.rl));
            this.Uo[i2] = drawableZ;
            this.J2.removeAt(iIndexOfKey);
            if (this.J2.size() == 0) {
                this.J2 = null;
            }
            return drawableZ;
        }

        public final void ViF(boolean z2) {
            this.xMQ = z2;
        }

        public final void WPU(int i2) {
            this.te = i2;
        }

        public final void XQ(boolean z2) {
            this.qie = z2;
        }

        final boolean aYN(int i2, int i3) {
            int i5 = this.KN;
            Drawable[] drawableArr = this.Uo;
            boolean z2 = false;
            for (int i7 = 0; i7 < i5; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    boolean zAz = DrawableCompat.az(drawable, i2);
                    if (i7 == i3) {
                        z2 = zAz;
                    }
                }
            }
            this.nY = i2;
            return z2;
        }

        public final int az() {
            if (!this.az) {
                nr();
            }
            return this.ty;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.J2.get(i3);
                    if (constantState != null && Api21Impl.n(constantState)) {
                        return true;
                    }
                } else if (DrawableCompat.rl(drawable)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.nr | this.f13736O;
        }

        public final int gh() {
            if (!this.az) {
                nr();
            }
            return this.ck;
        }

        public final int mUb() {
            if (!this.az) {
                nr();
            }
            return this.Ik;
        }

        public final int n(Drawable drawable) {
            int i2 = this.KN;
            if (i2 >= this.Uo.length) {
                HI(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f13743n);
            this.Uo[i2] = drawable;
            this.KN++;
            this.f13736O = drawable.getChangingConfigurations() | this.f13736O;
            ck();
            this.gh = null;
            this.mUb = false;
            this.az = false;
            this.f13737S = false;
            return i2;
        }

        final void nY(Resources resources) {
            if (resources != null) {
                this.rl = resources;
                int iJ2 = DrawableContainerCompat.J2(resources, this.f13746t);
                int i2 = this.f13746t;
                this.f13746t = iJ2;
                if (i2 != iJ2) {
                    this.az = false;
                    this.mUb = false;
                }
            }
        }

        void o() {
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.ViF = true;
        }

        public final Rect qie() {
            Rect rect = null;
            if (this.xMQ) {
                return null;
            }
            Rect rect2 = this.gh;
            if (rect2 != null || this.mUb) {
                return rect2;
            }
            O();
            Rect rect3 = new Rect();
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i5 = rect3.left;
                    if (i5 > rect.left) {
                        rect.left = i5;
                    }
                    int i7 = rect3.top;
                    if (i7 > rect.top) {
                        rect.top = i7;
                    }
                    int i8 = rect3.right;
                    if (i8 > rect.right) {
                        rect.right = i8;
                    }
                    int i9 = rect3.bottom;
                    if (i9 > rect.bottom) {
                        rect.bottom = i9;
                    }
                }
            }
            this.mUb = true;
            this.gh = rect;
            return rect;
        }

        public final boolean r() {
            if (this.f13740Z) {
                return this.XQ;
            }
            O();
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (drawableArr[i3].isStateful()) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            this.XQ = z2;
            this.f13740Z = true;
            return z2;
        }

        final void rl(Resources.Theme theme) {
            if (theme != null) {
                O();
                int i2 = this.KN;
                Drawable[] drawableArr = this.Uo;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null && DrawableCompat.rl(drawable)) {
                        DrawableCompat.n(drawableArr[i3], theme);
                        this.f13736O |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                nY(Api21Impl.t(theme));
            }
        }

        public boolean t() {
            if (this.f13737S) {
                return this.WPU;
            }
            O();
            this.f13737S = true;
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.WPU = false;
                    return false;
                }
            }
            this.WPU = true;
            return true;
        }

        public final int ty() {
            if (this.f13745r) {
                return this.f13744o;
            }
            O();
            int i2 = this.KN;
            Drawable[] drawableArr = this.Uo;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f13744o = opacity;
            this.f13745r = true;
            return opacity;
        }

        public final int xMQ() {
            if (!this.az) {
                nr();
            }
            return this.HI;
        }

        DrawableContainerState(DrawableContainerState drawableContainerState, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            Resources resources2;
            int i2;
            this.xMQ = false;
            this.qie = false;
            this.aYN = true;
            this.f13742g = 0;
            this.te = 0;
            this.f13743n = drawableContainerCompat;
            if (resources != null) {
                resources2 = resources;
            } else if (drawableContainerState != null) {
                resources2 = drawableContainerState.rl;
            } else {
                resources2 = null;
            }
            this.rl = resources2;
            if (drawableContainerState != null) {
                i2 = drawableContainerState.f13746t;
            } else {
                i2 = 0;
            }
            int iJ2 = DrawableContainerCompat.J2(resources, i2);
            this.f13746t = iJ2;
            if (drawableContainerState != null) {
                this.nr = drawableContainerState.nr;
                this.f13736O = drawableContainerState.f13736O;
                this.f13737S = true;
                this.WPU = true;
                this.xMQ = drawableContainerState.xMQ;
                this.qie = drawableContainerState.qie;
                this.aYN = drawableContainerState.aYN;
                this.ViF = drawableContainerState.ViF;
                this.nY = drawableContainerState.nY;
                this.f13742g = drawableContainerState.f13742g;
                this.te = drawableContainerState.te;
                this.iF = drawableContainerState.iF;
                this.fD = drawableContainerState.fD;
                this.E2 = drawableContainerState.E2;
                this.f13741e = drawableContainerState.f13741e;
                this.f13739X = drawableContainerState.f13739X;
                this.f13738T = drawableContainerState.f13738T;
                this.f13735N = drawableContainerState.f13735N;
                if (drawableContainerState.f13746t == iJ2) {
                    if (drawableContainerState.mUb) {
                        this.gh = drawableContainerState.gh != null ? new Rect(drawableContainerState.gh) : null;
                        this.mUb = true;
                    }
                    if (drawableContainerState.az) {
                        this.ty = drawableContainerState.ty;
                        this.HI = drawableContainerState.HI;
                        this.ck = drawableContainerState.ck;
                        this.Ik = drawableContainerState.Ik;
                        this.az = true;
                    }
                }
                if (drawableContainerState.f13745r) {
                    this.f13744o = drawableContainerState.f13744o;
                    this.f13745r = true;
                }
                if (drawableContainerState.f13740Z) {
                    this.XQ = drawableContainerState.XQ;
                    this.f13740Z = true;
                }
                Drawable[] drawableArr = drawableContainerState.Uo;
                this.Uo = new Drawable[drawableArr.length];
                this.KN = drawableContainerState.KN;
                SparseArray sparseArray = drawableContainerState.J2;
                if (sparseArray != null) {
                    this.J2 = sparseArray.clone();
                } else {
                    this.J2 = new SparseArray(this.KN);
                }
                int i3 = this.KN;
                for (int i5 = 0; i5 < i3; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.J2.put(i5, constantState);
                        } else {
                            this.Uo[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.Uo = new Drawable[10];
            this.KN = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void n(boolean z2) {
        boolean z3;
        Drawable drawable;
        boolean z4 = true;
        this.f13730o = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f13723O;
        if (drawable2 != null) {
            long j2 = this.E2;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f13731r);
                    this.E2 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f13729n.f13742g)) * this.f13731r) / 255);
                    z3 = true;
                }
            }
            drawable = this.J2;
            if (drawable == null) {
                long j3 = this.f13727e;
                if (j3 != 0) {
                    if (j3 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.J2 = null;
                        this.f13727e = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f13729n.te) * this.f13731r) / 255);
                    }
                }
                if (z2 && z4) {
                    scheduleSelf(this.f13728g, jUptimeMillis + 16);
                    return;
                }
                return;
            }
            this.f13727e = 0L;
            z4 = z3;
            if (z2) {
                return;
            } else {
                return;
            }
        }
        this.E2 = 0L;
        z3 = false;
        drawable = this.J2;
        if (drawable == null) {
        }
        z4 = z3;
        if (z2) {
        }
    }

    @RequiresApi
    private static class Api21Impl {
        public static boolean n(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void rl(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources t(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static int J2(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    private void nr(Drawable drawable) {
        if (this.f13725X == null) {
            this.f13725X = new BlockInvalidateCallback();
        }
        drawable.setCallback(this.f13725X.rl(drawable.getCallback()));
        try {
            if (this.f13729n.f13742g <= 0 && this.f13730o) {
                drawable.setAlpha(this.f13731r);
            }
            DrawableContainerState drawableContainerState = this.f13729n;
            if (drawableContainerState.E2) {
                drawable.setColorFilter(drawableContainerState.fD);
            } else {
                if (drawableContainerState.f13738T) {
                    DrawableCompat.HI(drawable, drawableContainerState.f13741e);
                }
                DrawableContainerState drawableContainerState2 = this.f13729n;
                if (drawableContainerState2.f13735N) {
                    DrawableCompat.ck(drawable, drawableContainerState2.f13739X);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13729n.aYN);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            DrawableCompat.az(drawable, DrawableCompat.J2(this));
            DrawableCompat.mUb(drawable, this.f13729n.iF);
            Rect rect = this.f13732t;
            if (rect != null) {
                DrawableCompat.qie(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f13725X.n());
        } catch (Throwable th) {
            drawable.setCallback(this.f13725X.n());
            throw th;
        }
    }

    void KN(DrawableContainerState drawableContainerState) {
        this.f13729n = drawableContainerState;
        int i2 = this.f13726Z;
        if (i2 >= 0) {
            Drawable drawableUo = drawableContainerState.Uo(i2);
            this.f13723O = drawableUo;
            if (drawableUo != null) {
                nr(drawableUo);
            }
        }
        this.J2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean Uo(int i2) {
        if (i2 == this.f13726Z) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f13729n.te > 0) {
            Drawable drawable = this.J2;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f13723O;
            if (drawable2 != null) {
                this.J2 = drawable2;
                this.f13727e = ((long) this.f13729n.te) + jUptimeMillis;
            } else {
                this.J2 = null;
                this.f13727e = 0L;
            }
        } else {
            Drawable drawable3 = this.f13723O;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            DrawableContainerState drawableContainerState = this.f13729n;
            if (i2 < drawableContainerState.KN) {
                Drawable drawableUo = drawableContainerState.Uo(i2);
                this.f13723O = drawableUo;
                this.f13726Z = i2;
                if (drawableUo != null) {
                    int i3 = this.f13729n.f13742g;
                    if (i3 > 0) {
                        this.E2 = jUptimeMillis + ((long) i3);
                    }
                    nr(drawableUo);
                }
            } else {
                this.f13723O = null;
                this.f13726Z = -1;
            }
        }
        if (this.E2 != 0 || this.f13727e != 0) {
            Runnable runnable = this.f13728g;
            if (runnable == null) {
                this.f13728g = new Runnable() { // from class: androidx.appcompat.graphics.drawable.DrawableContainerCompat.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DrawableContainerCompat.this.n(true);
                        DrawableContainerCompat.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            n(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f13729n.rl(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f13729n.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.J2;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13731r;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f13729n.t()) {
            return null;
        }
        this.f13729n.nr = getChangingConfigurations();
        return this.f13729n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f13723O;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13732t;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f13729n.Ik()) {
            return this.f13729n.xMQ();
        }
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f13729n.Ik()) {
            return this.f13729n.az();
        }
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f13729n.Ik()) {
            return this.f13729n.mUb();
        }
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f13729n.Ik()) {
            return this.f13729n.gh();
        }
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f13723O;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f13729n.ty();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            Api21Impl.rl(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectQie = this.f13729n.qie();
        if (rectQie != null) {
            rect.set(rectQie);
            padding = (rectQie.right | ((rectQie.left | rectQie.top) | rectQie.bottom)) != 0;
        } else {
            Drawable drawable = this.f13723O;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (O()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        DrawableContainerState drawableContainerState = this.f13729n;
        if (drawableContainerState != null) {
            drawableContainerState.ck();
        }
        if (drawable != this.f13723O || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f13729n.iF;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f13729n.r();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.J2;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.J2 = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f13723O;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13730o) {
                this.f13723O.setAlpha(this.f13731r);
            }
        }
        if (this.f13727e != 0) {
            this.f13727e = 0L;
            z2 = true;
        }
        if (this.E2 != 0) {
            this.E2 = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13724S && super.mutate() == this) {
            DrawableContainerState drawableContainerStateRl = rl();
            drawableContainerStateRl.o();
            KN(drawableContainerStateRl);
            this.f13724S = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.J2;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13723O;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f13729n.aYN(i2, t());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.J2;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f13723O;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.J2;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f13723O;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    DrawableContainerState rl() {
        return this.f13729n;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f13723O || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f13730o && this.f13731r == i2) {
            return;
        }
        this.f13730o = true;
        this.f13731r = i2;
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            if (this.E2 == 0) {
                drawable.setAlpha(i2);
            } else {
                n(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        DrawableContainerState drawableContainerState = this.f13729n;
        if (drawableContainerState.iF != z2) {
            drawableContainerState.iF = z2;
            Drawable drawable = this.f13723O;
            if (drawable != null) {
                DrawableCompat.mUb(drawable, z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.f13729n;
        drawableContainerState.E2 = true;
        if (drawableContainerState.fD != colorFilter) {
            drawableContainerState.fD = colorFilter;
            Drawable drawable = this.f13723O;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        DrawableContainerState drawableContainerState = this.f13729n;
        if (drawableContainerState.aYN != z2) {
            drawableContainerState.aYN = z2;
            Drawable drawable = this.f13723O;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            DrawableCompat.gh(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i5, int i7) {
        Rect rect = this.f13732t;
        if (rect == null) {
            this.f13732t = new Rect(i2, i3, i5, i7);
        } else {
            rect.set(i2, i3, i5, i7);
        }
        Drawable drawable = this.f13723O;
        if (drawable != null) {
            DrawableCompat.qie(drawable, i2, i3, i5, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.f13729n;
        drawableContainerState.f13738T = true;
        if (drawableContainerState.f13741e != colorStateList) {
            drawableContainerState.f13741e = colorStateList;
            DrawableCompat.HI(this.f13723O, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.f13729n;
        drawableContainerState.f13735N = true;
        if (drawableContainerState.f13739X != mode) {
            drawableContainerState.f13739X = mode;
            DrawableCompat.ck(this.f13723O, mode);
        }
    }

    int t() {
        return this.f13726Z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f13723O || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    final void xMQ(Resources resources) {
        this.f13729n.nY(resources);
    }

    private boolean O() {
        if (isAutoMirrored() && DrawableCompat.J2(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13729n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.J2;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f13723O;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }
}
