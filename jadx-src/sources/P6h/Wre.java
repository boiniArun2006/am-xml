package P6h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Wre extends Drawable implements Animatable, D5.j {
    private final OLt.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Ml f7582O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y8.j f7583n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f7584r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f7585t;

    public static final class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Wre.this.unscheduleSelf(this);
            Wre.this.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Wre(y8.j animationBackend) {
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        this.f7583n = animationBackend;
        this.f7585t = new w6(new GV.j(this.f7583n));
        this.f7582O = new I28();
        OLt.Ml ml = new OLt.Ml();
        ml.n(this);
        this.J2 = ml;
        this.f7584r = new j();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iN = this.f7585t.n();
        if (iN == -1) {
            iN = this.f7583n.n() - 1;
            this.f7585t.Uo(false);
            this.f7582O.t(this);
        } else if (iN == 0 && this.f7585t.KN()) {
            this.f7582O.n(this);
        }
        if (this.f7583n.KN(this, canvas, iN)) {
            this.f7582O.nr(this, iN);
            this.f7585t.J2(iN);
        } else {
            this.f7585t.O();
        }
        long jT2 = this.f7585t.t();
        if (jT2 != -1) {
            scheduleSelf(this.f7584r, jT2);
        } else {
            this.f7582O.t(this);
            this.f7585t.Uo(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7583n.t();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7583n.O();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f7585t.rl();
    }

    @Override // D5.j
    public void n() {
        this.f7583n.clear();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f7583n.nr(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.J2.rl(i2);
        this.f7583n.qie(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.J2.t(colorFilter);
        this.f7583n.J2(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f7583n.n() <= 0) {
            return;
        }
        this.f7585t.xMQ();
        this.f7582O.rl(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f7585t.mUb();
        this.f7582O.t(this);
        unscheduleSelf(this.f7584r);
    }
}
