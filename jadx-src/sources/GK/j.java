package GK;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j {
    private long HI;
    private boolean Ik;
    private boolean J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f3514O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f3515S;
    private float Uo;
    private GestureDetector ViF;
    private int WPU;
    private float XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Handler f3516Z;
    private int aYN;
    private float az;
    private boolean ck;
    private float gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3517n;
    private boolean nY;
    private float nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3518o;
    private float qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3519r;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f3520t;
    private long ty;
    private float xMQ;

    /* JADX INFO: renamed from: GK.j$j, reason: collision with other inner class name */
    class C0123j extends GestureDetector.SimpleOnGestureListener {
        C0123j() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            j.this.XQ = motionEvent.getX();
            j.this.f3515S = motionEvent.getY();
            j.this.WPU = 1;
            return true;
        }
    }

    public interface n {
        boolean J2(j jVar);

        boolean O(j jVar);

        void nr(j jVar);

        boolean rl(j jVar);
    }

    public static class w6 implements n {
        @Override // GK.j.n
        public boolean J2(j jVar) {
            return true;
        }
    }

    public j(Context context, n nVar) {
        this(context, nVar, null);
    }

    public j(Context context, n nVar, Handler handler) {
        this.Ik = false;
        this.WPU = 0;
        this.aYN = 2;
        this.f3517n = context;
        this.rl = nVar;
        this.f3519r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3518o = context.getResources().getDimensionPixelSize(2131165351);
        this.f3516Z = handler;
        xMQ(true);
        mUb(true);
    }

    private boolean Uo() {
        return this.WPU != 0;
    }

    public boolean KN(MotionEvent motionEvent) {
        float f3;
        float f4;
        if (!this.rl.J2(this)) {
            return false;
        }
        if (this.aYN > motionEvent.getPointerCount()) {
            if (!this.Ik) {
                return false;
            }
            if (motionEvent.getActionMasked() == 1) {
                this.Ik = false;
            }
            return true;
        }
        this.Ik = false;
        this.ty = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3514O) {
            this.ViF.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z2 = (motionEvent.getButtonState() & 32) != 0;
        boolean z3 = this.WPU == 2 && !z2;
        boolean z4 = actionMasked == 1 || actionMasked == 3 || z3;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z4) {
            if (this.ck) {
                this.rl.nr(this);
                this.ck = false;
                this.xMQ = 0.0f;
                this.Ik = true;
                this.WPU = 0;
            } else if (Uo() && z4) {
                this.ck = false;
                this.xMQ = 0.0f;
                this.WPU = 0;
            }
            if (z4) {
                return true;
            }
        }
        if (!this.ck && this.J2 && !Uo() && !z4 && z2) {
            this.XQ = motionEvent.getX();
            this.f3515S = motionEvent.getY();
            this.WPU = 2;
            this.xMQ = 0.0f;
        }
        boolean z5 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z3;
        boolean z6 = actionMasked == 6;
        int actionIndex = z6 ? motionEvent.getActionIndex() : -1;
        int i2 = z6 ? pointerCount - 1 : pointerCount;
        if (Uo()) {
            f4 = this.XQ;
            f3 = this.f3515S;
            if (motionEvent.getY() < f3) {
                this.nY = true;
            } else {
                this.nY = false;
            }
        } else {
            float x2 = 0.0f;
            float y2 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x2 += motionEvent.getX(i3);
                    y2 += motionEvent.getY(i3);
                }
            }
            float f5 = i2;
            float f6 = x2 / f5;
            f3 = y2 / f5;
            f4 = f6;
        }
        float fAbs2 = 0.0f;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            if (actionIndex != i5) {
                fAbs += Math.abs(motionEvent.getX(i5) - f4);
                fAbs2 += Math.abs(motionEvent.getY(i5) - f3);
            }
        }
        float f7 = i2;
        float f8 = (fAbs / f7) * 2.0f;
        float f9 = (fAbs2 / f7) * 2.0f;
        float fHypot = Uo() ? f9 : (float) Math.hypot(f8, f9);
        boolean z7 = this.ck;
        this.f3520t = f4;
        this.nr = f3;
        if (!Uo() && this.ck && (fHypot < this.f3518o || z5)) {
            this.rl.nr(this);
            this.ck = false;
            this.Ik = true;
            this.xMQ = fHypot;
        }
        if (z5) {
            this.mUb = f8;
            this.qie = f8;
            this.gh = f9;
            this.az = f9;
            this.Uo = fHypot;
            this.KN = fHypot;
            this.xMQ = fHypot;
        }
        int i7 = Uo() ? this.f3519r : this.f3518o;
        if (!this.ck && fHypot >= i7 && (z7 || Math.abs(fHypot - this.xMQ) > this.f3519r)) {
            this.mUb = f8;
            this.qie = f8;
            this.gh = f9;
            this.az = f9;
            this.Uo = fHypot;
            this.KN = fHypot;
            this.HI = this.ty;
            this.ck = this.rl.O(this);
            this.Ik = false;
        }
        if (actionMasked == 2) {
            this.mUb = f8;
            this.gh = f9;
            this.Uo = fHypot;
            if (this.ck ? this.rl.rl(this) : true) {
                this.qie = this.mUb;
                this.az = this.gh;
                this.KN = this.Uo;
                this.HI = this.ty;
            }
        }
        return true;
    }

    public float O() {
        return this.nr;
    }

    public void mUb(boolean z2) {
        this.J2 = z2;
    }

    public float nr() {
        return this.f3520t;
    }

    public void xMQ(boolean z2) {
        this.f3514O = z2;
        if (z2 && this.ViF == null) {
            this.ViF = new GestureDetector(this.f3517n, new C0123j(), this.f3516Z);
        }
    }

    public float J2() {
        boolean z2;
        if (Uo()) {
            boolean z3 = this.nY;
            if ((z3 && this.Uo < this.KN) || (!z3 && this.Uo > this.KN)) {
                z2 = true;
            } else {
                z2 = false;
            }
            float fAbs = Math.abs(1.0f - (this.Uo / this.KN)) * 0.5f;
            if (this.KN <= 0.0f) {
                return 1.0f;
            }
            if (z2) {
                return fAbs + 1.0f;
            }
            return 1.0f - fAbs;
        }
        float f3 = this.KN;
        if (f3 <= 0.0f) {
            return 1.0f;
        }
        return this.Uo / f3;
    }
}
