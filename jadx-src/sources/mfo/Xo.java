package mfo;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import i7B.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Xo {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    C f70928t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f70927n = false;
    boolean rl = false;
    RectF nr = new RectF();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Path f70926O = new Path();

    abstract void rl(View view);

    abstract boolean xMQ();

    public static Xo n(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new z(view) : new eO(view);
    }

    private boolean t() {
        RectF rectF = this.nr;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void J2(View view, C c2) {
        this.f70928t = c2;
        mUb();
        rl(view);
    }

    public void KN(View view, boolean z2) {
        this.rl = z2;
        rl(view);
    }

    public void O(View view, RectF rectF) {
        this.nr = rectF;
        mUb();
        rl(view);
    }

    public void Uo(View view, boolean z2) {
        if (z2 != this.f70927n) {
            this.f70927n = z2;
            rl(view);
        }
    }

    private void mUb() {
        if (t() && this.f70928t != null) {
            o.gh().nr(this.f70928t, 1.0f, this.nr, this.f70926O);
        }
    }

    public void nr(Canvas canvas, j.InterfaceC0967j interfaceC0967j) {
        if (xMQ() && !this.f70926O.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.f70926O);
            interfaceC0967j.n(canvas);
            canvas.restore();
            return;
        }
        interfaceC0967j.n(canvas);
    }
}
