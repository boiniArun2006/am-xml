package P6h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y8.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class n extends Drawable implements Animatable, D5.j {
    private int E2;
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile boolean f7590O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f7591S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f7592T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f7593X;
    private OLt.Ml Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f7594Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7596g;
    private final Runnable jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y8.j f7597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7598o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7599r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private GV.n f7600t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final j.InterfaceC1280j f7601v;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final j f7588U = new j(null);
    private static final Class P5 = n.class;
    private static final Ml M7 = new I28();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7595e = 8;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private volatile Ml f7589N = M7;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GV.n rl(y8.j jVar) {
            if (jVar == null) {
                return null;
            }
            return new GV.j(jVar);
        }
    }

    /* JADX INFO: renamed from: P6h.n$n, reason: collision with other inner class name */
    public static final class RunnableC0264n implements Runnable {
        RunnableC0264n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.unscheduleSelf(this);
            n.this.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private final void nr(long j2) {
        long j3 = this.J2 + j2;
        this.f7598o = j3;
        scheduleSelf(this.jB, j3);
    }

    private final void t() {
        this.f7592T++;
        if (Dzy.j.az(2)) {
            Dzy.j.HI(P5, "Dropped a frame. Count: %s", Integer.valueOf(this.f7592T));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f7597n == null || this.f7600t == null) {
            return;
        }
        long jRl = rl();
        long jMax = this.f7590O ? (jRl - this.J2) + this.f7593X : (long) Math.max(this.f7599r, 0.0d);
        GV.n nVar = this.f7600t;
        Intrinsics.checkNotNull(nVar);
        int iRl = nVar.rl(jMax, this.f7599r);
        if (iRl == -1) {
            y8.j jVar = this.f7597n;
            Intrinsics.checkNotNull(jVar);
            iRl = jVar.n() - 1;
            this.f7589N.t(this);
            this.f7590O = false;
        } else if (iRl == 0 && this.f7594Z != -1 && jRl >= this.f7598o) {
            this.f7589N.n(this);
        }
        y8.j jVar2 = this.f7597n;
        Intrinsics.checkNotNull(jVar2);
        boolean zKN = jVar2.KN(this, canvas, iRl);
        if (zKN) {
            this.f7589N.nr(this, iRl);
            this.f7594Z = iRl;
        }
        if (!zKN) {
            t();
        }
        long jRl2 = rl();
        if (this.f7590O) {
            GV.n nVar2 = this.f7600t;
            Intrinsics.checkNotNull(nVar2);
            long jN = nVar2.n(jRl2 - this.J2);
            if (jN != -1) {
                nr(jN + this.f7595e);
            } else {
                this.f7589N.t(this);
                this.f7590O = false;
            }
        }
        this.f7599r = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        y8.j jVar = this.f7597n;
        return jVar != null ? jVar.t() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        y8.j jVar = this.f7597n;
        return jVar != null ? jVar.O() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f7590O;
    }

    @Override // D5.j
    public void n() {
        y8.j jVar = this.f7597n;
        if (jVar != null) {
            jVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        y8.j jVar = this.f7597n;
        if (jVar != null) {
            jVar.nr(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        if (this.f7590O) {
            return false;
        }
        long j2 = i2;
        if (this.f7599r == j2) {
            return false;
        }
        this.f7599r = j2;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.Xw == null) {
            this.Xw = new OLt.Ml();
        }
        OLt.Ml ml = this.Xw;
        Intrinsics.checkNotNull(ml);
        ml.rl(i2);
        y8.j jVar = this.f7597n;
        if (jVar != null) {
            jVar.qie(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.Xw == null) {
            this.Xw = new OLt.Ml();
        }
        OLt.Ml ml = this.Xw;
        Intrinsics.checkNotNull(ml);
        ml.t(colorFilter);
        y8.j jVar = this.f7597n;
        if (jVar != null) {
            jVar.J2(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        y8.j jVar;
        if (this.f7590O || (jVar = this.f7597n) == null) {
            return;
        }
        Intrinsics.checkNotNull(jVar);
        if (jVar.n() <= 1) {
            return;
        }
        this.f7590O = true;
        long jRl = rl();
        long j2 = jRl - this.f7591S;
        this.J2 = j2;
        this.f7598o = j2;
        this.f7599r = jRl - this.f7596g;
        this.f7594Z = this.E2;
        invalidateSelf();
        this.f7589N.rl(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f7590O) {
            long jRl = rl();
            this.f7591S = jRl - this.J2;
            this.f7596g = jRl - this.f7599r;
            this.E2 = this.f7594Z;
            this.f7590O = false;
            this.J2 = 0L;
            this.f7598o = 0L;
            this.f7599r = -1L;
            this.f7594Z = -1;
            unscheduleSelf(this.jB);
            this.f7589N.t(this);
        }
    }

    public n(y8.j jVar) {
        this.f7597n = jVar;
        j.InterfaceC1280j interfaceC1280j = new j.InterfaceC1280j() { // from class: P6h.j
        };
        this.f7601v = interfaceC1280j;
        this.jB = new RunnableC0264n();
        this.f7600t = f7588U.rl(this.f7597n);
        y8.j jVar2 = this.f7597n;
        if (jVar2 != null) {
            jVar2.ty(interfaceC1280j);
        }
    }

    private final long rl() {
        return SystemClock.uptimeMillis();
    }
}
