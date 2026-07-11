package AL;

import Be4.Dsr;
import Z.CN3;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import kYF.Wre;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import x.EnumC2421n;
import x.InterfaceC2420j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 extends Drawable implements Animatable2Compat {
    public static final j eF = new j(null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f52N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CN3 f53O;
    private Picture P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Canvas f54S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f55T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f56U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f57X;
    private long Xw;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f60g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Movie f61n;
    private boolean p5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Bitmap.Config f64t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f65v;
    private final Paint J2 = new Paint(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f63r = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f62o = new Rect();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Rect f58Z = new Rect();
    private float E2 = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f59e = 1.0f;
    private int jB = -1;
    private EnumC2421n M7 = EnumC2421n.f75141n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final void O(int i2) {
        if (i2 >= -1) {
            this.jB = i2;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i2).toString());
    }

    private final void J2(Rect rect) {
        if (Intrinsics.areEqual(this.f62o, rect)) {
            return;
        }
        this.f62o.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int iWidth2 = this.f61n.width();
        int iHeight2 = this.f61n.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        double dT = Dsr.t(iWidth2, iHeight2, iWidth, iHeight, this.f53O);
        if (!this.p5) {
            dT = RangesKt.coerceAtMost(dT, 1.0d);
        }
        float f3 = (float) dT;
        this.E2 = f3;
        int i2 = (int) (iWidth2 * f3);
        int i3 = (int) (f3 * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, this.f64t);
        Bitmap bitmap = this.f60g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f60g = bitmapCreateBitmap;
        this.f54S = new Canvas(bitmapCreateBitmap);
        if (this.p5) {
            this.f59e = 1.0f;
            this.f57X = 0.0f;
            this.f55T = 0.0f;
        } else {
            float fT = (float) Dsr.t(i2, i3, iWidth, iHeight, this.f53O);
            this.f59e = fT;
            float f4 = iWidth - (i2 * fT);
            float f5 = 2;
            this.f57X = rect.left + (f4 / f5);
            this.f55T = rect.top + ((iHeight - (fT * i3)) / f5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean Uo() {
        boolean z2;
        int iDuration = this.f61n.duration();
        if (iDuration == 0) {
            z2 = 0;
        } else {
            if (this.f52N) {
                this.Xw = SystemClock.uptimeMillis();
            }
            int i2 = (int) (this.Xw - this.f65v);
            int i3 = i2 / iDuration;
            this.f56U = i3;
            int i5 = this.jB;
            i = (i5 == -1 || i3 <= i5) ? 1 : 0;
            if (i != 0) {
                iDuration = i2 - (i3 * iDuration);
            }
            int i7 = i;
            i = iDuration;
            z2 = i7;
        }
        this.f61n.setTime(i);
        return z2;
    }

    private final void n(Canvas canvas) {
        Canvas canvas2 = this.f54S;
        Bitmap bitmap = this.f60g;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f3 = this.E2;
            canvas2.scale(f3, f3);
            this.f61n.draw(canvas2, 0.0f, 0.0f, this.J2);
            Picture picture = this.P5;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f57X, this.f55T);
                float f4 = this.f59e;
                canvas.scale(f4, f4);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.J2);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    private final Rect rl(Canvas canvas) {
        Rect rect = this.f58Z;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f61n.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f61n.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.J2.getAlpha() != 255) {
            return -3;
        }
        EnumC2421n enumC2421n = this.M7;
        if (enumC2421n != EnumC2421n.f75140O) {
            return (enumC2421n == EnumC2421n.f75141n && this.f61n.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f52N;
    }

    public final void nr(InterfaceC2420j interfaceC2420j) {
        if (interfaceC2420j == null || this.f61n.width() <= 0 || this.f61n.height() <= 0) {
            this.P5 = null;
            this.M7 = EnumC2421n.f75141n;
            this.p5 = false;
        } else {
            Picture picture = new Picture();
            this.M7 = interfaceC2420j.n(picture.beginRecording(this.f61n.width(), this.f61n.height()));
            picture.endRecording();
            this.P5 = picture;
            this.p5 = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 >= 0 && i2 < 256) {
            this.J2.setAlpha(i2);
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i2).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.J2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f52N) {
            return;
        }
        this.f52N = true;
        this.f56U = 0;
        this.f65v = SystemClock.uptimeMillis();
        List list = this.f63r;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Animatable2Compat.AnimationCallback) list.get(i2)).t(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f52N) {
            this.f52N = false;
            List list = this.f63r;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Animatable2Compat.AnimationCallback) list.get(i2)).rl(this);
            }
        }
    }

    public void t(Animatable2Compat.AnimationCallback animationCallback) {
        this.f63r.add(animationCallback);
    }

    public w6(Movie movie, Bitmap.Config config, CN3 cn3) {
        this.f61n = movie;
        this.f64t = config;
        this.f53O = cn3;
        if (!Wre.t(config)) {
        } else {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zUo = Uo();
        if (this.p5) {
            J2(rl(canvas));
            int iSave = canvas.save();
            try {
                float f3 = 1 / this.E2;
                canvas.scale(f3, f3);
                n(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            J2(getBounds());
            n(canvas);
        }
        if (this.f52N && zUo) {
            invalidateSelf();
        } else {
            stop();
        }
    }
}
