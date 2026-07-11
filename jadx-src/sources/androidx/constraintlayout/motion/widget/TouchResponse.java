package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class TouchResponse {
    private int E2;
    private boolean HI;
    private int[] Ik;
    private int J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f35786O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35787S;
    private float Uo;
    private int ViF;
    private boolean WPU;
    private float XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final MotionLayout f35788Z;
    private float aYN;
    private float az;
    private float[] ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35789e;
    private float fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35790g;
    private int gh;
    private float iF;
    float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35791n;
    private float nY;
    private int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35792o;
    boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35793r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35794t;
    private float te;
    private float ty;
    float xMQ;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final float[][] f35785X = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final float[][] f35784T = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    public void S(boolean z2) {
        if (z2) {
            float[][] fArr = f35784T;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f35785X;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f35784T;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f35785X;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f35785X[this.f35791n];
        this.KN = fArr5[0];
        this.Uo = fArr5[1];
        int i2 = this.rl;
        float[][] fArr6 = f35784T;
        if (i2 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i2];
        this.az = fArr7[0];
        this.ty = fArr7[1];
    }

    void Z(float f3, float f4) {
        int i2;
        this.HI = false;
        float progress = this.f35788Z.getProgress();
        this.f35788Z.m(this.nr, progress, this.KN, this.Uo, this.ck);
        float f5 = this.az;
        float[] fArr = this.ck;
        float f6 = f5 != 0.0f ? (f3 * f5) / fArr[0] : (f4 * this.ty) / fArr[1];
        if (!Float.isNaN(f6)) {
            progress += f6 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i2 = this.f35794t) == 3) {
            return;
        }
        this.f35788Z.Org(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f6);
    }

    int HI() {
        return this.f35786O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void Ik(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i2, MotionScene motionScene) {
        char c2;
        int i3;
        char c4;
        float f3;
        char c5;
        if (this.qie) {
            r(motionEvent, motionTracker, i2, motionScene);
            return;
        }
        motionTracker.n(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f35793r = motionEvent.getRawX();
            this.f35792o = motionEvent.getRawY();
            this.HI = false;
            return;
        }
        if (action == 1) {
            this.HI = false;
            motionTracker.O(1000);
            float fT = motionTracker.t();
            float fRl = motionTracker.rl();
            float progress = this.f35788Z.getProgress();
            int i5 = this.nr;
            if (i5 != -1) {
                this.f35788Z.m(i5, progress, this.KN, this.Uo, this.ck);
                c2 = 0;
            } else {
                float fMin = Math.min(this.f35788Z.getWidth(), this.f35788Z.getHeight());
                float[] fArr = this.ck;
                fArr[1] = this.ty * fMin;
                c2 = 0;
                fArr[0] = fMin * this.az;
            }
            float f4 = this.az;
            float[] fArr2 = this.ck;
            float fAbs = f4 != 0.0f ? fT / fArr2[c2] : fRl / fArr2[1];
            float f5 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f5 == 0.0f || f5 == 1.0f || (i3 = this.f35794t) == 3) {
                if (0.0f >= f5 || 1.0f <= f5) {
                    this.f35788Z.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f6 = ((double) f5) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f6 = 1.0f;
            }
            if (this.f35794t == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f6 = 0.0f;
            }
            this.f35788Z.Org(this.f35794t, f6, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f35788Z.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f35792o;
        float rawX = motionEvent.getRawX() - this.f35793r;
        if (Math.abs((this.az * rawX) + (this.ty * rawY)) > this.nY || this.HI) {
            float progress2 = this.f35788Z.getProgress();
            if (!this.HI) {
                this.HI = true;
                this.f35788Z.setProgress(progress2);
            }
            int i7 = this.nr;
            if (i7 != -1) {
                c4 = 1;
                c5 = 0;
                f3 = progress2;
                this.f35788Z.m(i7, f3, this.KN, this.Uo, this.ck);
            } else {
                c4 = 1;
                f3 = progress2;
                c5 = 0;
                float fMin2 = Math.min(this.f35788Z.getWidth(), this.f35788Z.getHeight());
                float[] fArr3 = this.ck;
                fArr3[1] = this.ty * fMin2;
                fArr3[0] = fMin2 * this.az;
            }
            float f7 = this.az;
            float[] fArr4 = this.ck;
            if (Math.abs(((f7 * fArr4[c5]) + (this.ty * fArr4[c4])) * this.aYN) < 0.01d) {
                float[] fArr5 = this.ck;
                fArr5[c5] = 0.01f;
                fArr5[c4] = 0.01f;
            }
            float fMax = Math.max(Math.min(f3 + (this.az != 0.0f ? rawX / this.ck[c5] : rawY / this.ck[c4]), 1.0f), 0.0f);
            if (this.f35794t == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f35794t == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f35788Z.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f35788Z.Nxk(progress3 == 0.0f ? c4 : c5);
                }
                this.f35788Z.setProgress(fMax);
                motionTracker.O(1000);
                this.f35788Z.Nxk = this.az != 0.0f ? motionTracker.t() / this.ck[c5] : motionTracker.rl() / this.ck[c4];
            } else {
                this.f35788Z.Nxk = 0.0f;
            }
            this.f35793r = motionEvent.getRawX();
            this.f35792o = motionEvent.getRawY();
        }
    }

    public float J2() {
        return this.XQ;
    }

    float KN(float f3, float f4) {
        this.f35788Z.m(this.nr, this.f35788Z.getProgress(), this.KN, this.Uo, this.ck);
        float f5 = this.az;
        if (f5 != 0.0f) {
            float[] fArr = this.ck;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f3 * f5) / fArr[0];
        }
        float[] fArr2 = this.ck;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f4 * this.ty) / fArr2[1];
    }

    float O() {
        return this.f35787S;
    }

    boolean Uo() {
        return this.WPU;
    }

    void ViF() {
        View viewFindViewById;
        int i2 = this.nr;
        if (i2 != -1) {
            viewFindViewById = this.f35788Z.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.t(this.f35788Z.getContext(), this.nr));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void n(NestedScrollView nestedScrollView2, int i3, int i5, int i7, int i8) {
                }
            });
        }
    }

    public void WPU(int i2) {
        this.f35794t = i2;
    }

    void XQ(float f3, float f4) {
        this.f35793r = f3;
        this.f35792o = f4;
    }

    void aYN(float f3, float f4) {
        this.f35793r = f3;
        this.f35792o = f4;
        this.HI = false;
    }

    public float az() {
        return this.fD;
    }

    boolean ck() {
        return this.HI;
    }

    public float gh() {
        return this.te;
    }

    public float mUb() {
        return this.f35790g;
    }

    float n(float f3, float f4) {
        return (f3 * this.az) + (f4 * this.ty);
    }

    RectF nr(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i2 = this.J2;
        if (i2 == -1 || (viewFindViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    void o(float f3, float f4) {
        float progress = this.f35788Z.getProgress();
        if (!this.HI) {
            this.HI = true;
            this.f35788Z.setProgress(progress);
        }
        this.f35788Z.m(this.nr, progress, this.KN, this.Uo, this.ck);
        float f5 = this.az;
        float[] fArr = this.ck;
        if (Math.abs((f5 * fArr[0]) + (this.ty * fArr[1])) < 0.01d) {
            float[] fArr2 = this.ck;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f6 = this.az;
        float fMax = Math.max(Math.min(progress + (f6 != 0.0f ? (f3 * f6) / this.ck[0] : (f4 * this.ty) / this.ck[1]), 1.0f), 0.0f);
        if (fMax != this.f35788Z.getProgress()) {
            this.f35788Z.setProgress(fMax);
        }
    }

    public float qie() {
        return this.iF;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void r(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i2, MotionScene motionScene) {
        float left;
        float f3;
        int top;
        int bottom;
        int i3;
        float f4;
        int i5;
        float f5;
        motionTracker.n(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f35793r = motionEvent.getRawX();
            this.f35792o = motionEvent.getRawY();
            this.HI = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f35788Z.getWidth() / 2.0f;
            float height = this.f35788Z.getHeight() / 2.0f;
            int i7 = this.gh;
            if (i7 != -1) {
                View viewFindViewById = this.f35788Z.findViewById(i7);
                this.f35788Z.getLocationOnScreen(this.Ik);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.Ik[1];
                width = this.Ik[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
            } else {
                int i8 = this.nr;
                if (i8 != -1) {
                    if (this.f35788Z.findViewById(this.f35788Z.xg(i8).KN()) == null) {
                        Log.e("TouchResponse", "could not find view to animate to");
                    } else {
                        this.f35788Z.getLocationOnScreen(this.Ik);
                        width = this.Ik[0] + ((r12.getLeft() + r12.getRight()) / 2.0f);
                        height = this.Ik[1] + ((r12.getTop() + r12.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            float fAtan2 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.f35792o - height, this.f35793r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.HI) {
                float progress = this.f35788Z.getProgress();
                if (!this.HI) {
                    this.HI = true;
                    this.f35788Z.setProgress(progress);
                }
                int i9 = this.nr;
                if (i9 != -1) {
                    f5 = progress;
                    this.f35788Z.m(i9, f5, this.KN, this.Uo, this.ck);
                    this.ck[1] = (float) Math.toDegrees(r3[1]);
                } else {
                    f5 = progress;
                    this.ck[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(f5 + ((fAtan2 * this.aYN) / this.ck[1]), 1.0f), 0.0f);
                float progress2 = this.f35788Z.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.f35788Z.Nxk(progress2 == 0.0f);
                    }
                    this.f35788Z.setProgress(fMax);
                    motionTracker.O(1000);
                    float fT = motionTracker.t();
                    double dRl = motionTracker.rl();
                    double d2 = fT;
                    this.f35788Z.Nxk = (float) Math.toDegrees((float) ((Math.hypot(dRl, d2) * Math.sin(Math.atan2(dRl, d2) - r4)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f35788Z.Nxk = 0.0f;
                }
                this.f35793r = motionEvent.getRawX();
                this.f35792o = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.HI = false;
        motionTracker.O(16);
        float fT2 = motionTracker.t();
        float fRl = motionTracker.rl();
        float progress3 = this.f35788Z.getProgress();
        float width2 = this.f35788Z.getWidth() / 2.0f;
        float height2 = this.f35788Z.getHeight() / 2.0f;
        int i10 = this.gh;
        if (i10 == -1) {
            int i11 = this.nr;
            if (i11 != -1) {
                View viewFindViewById2 = this.f35788Z.findViewById(this.f35788Z.xg(i11).KN());
                this.f35788Z.getLocationOnScreen(this.Ik);
                left = this.Ik[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                f3 = this.Ik[1];
                top = viewFindViewById2.getTop();
                bottom = viewFindViewById2.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX2));
            i3 = this.nr;
            if (i3 == -1) {
                this.f35788Z.m(i3, progress3, this.KN, this.Uo, this.ck);
                this.ck[1] = (float) Math.toDegrees(r5[1]);
            } else {
                this.ck[1] = 360.0f;
            }
            float degrees2 = ((float) (Math.toDegrees(Math.atan2(fRl + r2, fT2 + rawX2)) - degrees)) * 62.5f;
            f4 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * this.aYN) / this.ck[1]) + progress3 : progress3;
            if (f4 != 0.0f || f4 == 1.0f || (i5 = this.f35794t) == 3) {
                if (0.0f < f4 || 1.0f <= f4) {
                    this.f35788Z.setState(MotionLayout.TransitionState.FINISHED);
                }
                return;
            }
            float fAbs = (degrees2 * this.aYN) / this.ck[1];
            float f6 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
            if (i5 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f6 = 1.0f;
            }
            if (this.f35794t == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f6 = 0.0f;
            }
            this.f35788Z.Org(this.f35794t, f6, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.f35788Z.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById3 = this.f35788Z.findViewById(i10);
        this.f35788Z.getLocationOnScreen(this.Ik);
        left = this.Ik[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
        f3 = this.Ik[1];
        top = viewFindViewById3.getTop();
        bottom = viewFindViewById3.getBottom();
        float f7 = left;
        height2 = ((top + bottom) / 2.0f) + f3;
        width2 = f7;
        float rawX22 = motionEvent.getRawX() - width2;
        double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX22));
        i3 = this.nr;
        if (i3 == -1) {
        }
        float degrees22 = ((float) (Math.toDegrees(Math.atan2(fRl + r2, fT2 + rawX22)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees22)) {
        }
        if (f4 != 0.0f) {
        }
        if (0.0f < f4) {
        }
        this.f35788Z.setState(MotionLayout.TransitionState.FINISHED);
    }

    public int rl() {
        return this.f35789e;
    }

    public int t() {
        return this.ViF;
    }

    public String toString() {
        if (Float.isNaN(this.az)) {
            return "rotation";
        }
        return this.az + " , " + this.ty;
    }

    RectF ty(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i2 = this.f35786O;
        if (i2 == -1 || (viewFindViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public int xMQ() {
        return this.E2;
    }
}
