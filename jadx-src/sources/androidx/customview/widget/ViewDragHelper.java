package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ViewDragHelper {
    private static final Interpolator aYN = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    };
    private int HI;
    private int Ik;
    private float[] J2;
    private int[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float[] f37353O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final ViewGroup f37354S;
    private float[] Uo;
    private boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private View f37355Z;
    private float az;
    private final int ck;
    private int gh;
    private int[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37356n;
    private float[] nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Callback f37357o;
    private VelocityTracker qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f37358r;
    private int rl;
    private float ty;
    private int[] xMQ;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37359t = -1;
    private final Runnable WPU = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.wTp(0);
        }
    };

    public static abstract class Callback {
        public void J2(int i2, int i3) {
        }

        public void KN(int i2, int i3) {
        }

        public int O(View view) {
            return 0;
        }

        public boolean Uo(int i2) {
            return false;
        }

        public abstract boolean az(View view, int i2);

        public void gh(View view, int i2, int i3, int i5, int i7) {
        }

        public void mUb(int i2) {
        }

        public int n(View view, int i2, int i3) {
            return 0;
        }

        public int nr(View view) {
            return 0;
        }

        public void qie(View view, float f3, float f4) {
        }

        public int rl(View view, int i2, int i3) {
            return 0;
        }

        public int t(int i2) {
            return i2;
        }

        public void xMQ(View view, int i2) {
        }
    }

    private void Ik(float f3, float f4) {
        this.XQ = true;
        this.f37357o.qie(this.f37355Z, f3, f4);
        this.XQ = false;
        if (this.f37356n == 1) {
            wTp(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
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
    private void N(float f3, float f4, int i2) {
        boolean zNr = nr(f3, f4, i2, 1);
        ?? r02 = zNr;
        if (nr(f4, f3, i2, 4)) {
            r02 = (zNr ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (nr(f3, f4, i2, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (nr(f4, f3, i2, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.xMQ;
            iArr[i2] = iArr[i2] | r04;
            this.f37357o.J2(r04, i2);
        }
    }

    private boolean Uo(View view, float f3, float f4) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f37357o.nr(view) > 0;
        boolean z3 = this.f37357o.O(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f3) > ((float) this.rl) : z3 && Math.abs(f4) > ((float) this.rl);
        }
        float f5 = (f3 * f3) + (f4 * f4);
        int i2 = this.rl;
        return f5 > ((float) (i2 * i2));
    }

    public boolean e(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void rl() {
        this.f37359t = -1;
        mUb();
        VelocityTracker velocityTracker = this.qie;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.qie = null;
        }
    }

    private boolean S(int i2, int i3, int i5, int i7) {
        int left = this.f37355Z.getLeft();
        int top = this.f37355Z.getTop();
        int i8 = i2 - left;
        int i9 = i3 - top;
        if (i8 == 0 && i9 == 0) {
            this.f37358r.abortAnimation();
            wTp(0);
            return false;
        }
        this.f37358r.startScroll(left, top, i8, i9, az(this.f37355Z, i8, i9, i5, i7));
        wTp(2);
        return true;
    }

    private void T() {
        this.qie.computeCurrentVelocity(1000, this.az);
        Ik(KN(this.qie.getXVelocity(this.f37359t), this.ty, this.az), KN(this.qie.getYVelocity(this.f37359t), this.ty, this.az));
    }

    private void Z(int i2) {
        float[] fArr = this.nr;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f37353O;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.J2;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.Uo;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.KN;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.xMQ;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mUb;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.nr = fArr2;
            this.f37353O = fArr3;
            this.J2 = fArr4;
            this.Uo = fArr5;
            this.KN = iArr;
            this.xMQ = iArr2;
            this.mUb = iArr3;
        }
    }

    private int az(View view, int i2, int i3, int i5, int i7) {
        float f3;
        float f4;
        float f5;
        float f6;
        int iXMQ = xMQ(i5, (int) this.ty, (int) this.az);
        int iXMQ2 = xMQ(i7, (int) this.ty, (int) this.az);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iXMQ);
        int iAbs4 = Math.abs(iXMQ2);
        int i8 = iAbs3 + iAbs4;
        int i9 = iAbs + iAbs2;
        if (iXMQ != 0) {
            f3 = iAbs3;
            f4 = i8;
        } else {
            f3 = iAbs;
            f4 = i9;
        }
        float f7 = f3 / f4;
        if (iXMQ2 != 0) {
            f5 = iAbs4;
            f6 = i8;
        } else {
            f5 = iAbs2;
            f6 = i9;
        }
        return (int) ((qie(i2, iXMQ, this.f37357o.nr(view)) * f7) + (qie(i3, iXMQ2, this.f37357o.O(view)) * (f5 / f6)));
    }

    public static ViewDragHelper ck(ViewGroup viewGroup, Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void gh(int i2) {
        if (this.nr == null || !fD(i2)) {
            return;
        }
        this.nr[i2] = 0.0f;
        this.f37353O[i2] = 0.0f;
        this.J2[i2] = 0.0f;
        this.Uo[i2] = 0.0f;
        this.KN[i2] = 0;
        this.xMQ[i2] = 0;
        this.mUb[i2] = 0;
        this.gh = (~(1 << i2)) & this.gh;
    }

    private void mUb() {
        float[] fArr = this.nr;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f37353O, 0.0f);
        Arrays.fill(this.J2, 0.0f);
        Arrays.fill(this.Uo, 0.0f);
        Arrays.fill(this.KN, 0);
        Arrays.fill(this.xMQ, 0);
        Arrays.fill(this.mUb, 0);
        this.gh = 0;
    }

    private int nY(int i2, int i3) {
        int i5 = i2 < this.f37354S.getLeft() + this.HI ? 1 : 0;
        if (i3 < this.f37354S.getTop() + this.HI) {
            i5 |= 4;
        }
        if (i2 > this.f37354S.getRight() - this.HI) {
            i5 |= 2;
        }
        return i3 > this.f37354S.getBottom() - this.HI ? i5 | 8 : i5;
    }

    private void o(int i2, int i3, int i5, int i7) {
        int left = this.f37355Z.getLeft();
        int top = this.f37355Z.getTop();
        if (i5 != 0) {
            i2 = this.f37357o.n(this.f37355Z, i2, i5);
            ViewCompat.M(this.f37355Z, i2 - left);
        }
        int i8 = i2;
        if (i7 != 0) {
            i3 = this.f37357o.rl(this.f37355Z, i3, i7);
            ViewCompat.FX(this.f37355Z, i3 - top);
        }
        int i9 = i3;
        if (i5 == 0 && i7 == 0) {
            return;
        }
        this.f37357o.gh(this.f37355Z, i8, i9, i8 - left, i9 - top);
    }

    private int qie(int i2, int i3, int i5) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.f37354S.getWidth();
        float f3 = width / 2;
        float fR = f3 + (r(Math.min(1.0f, Math.abs(i2) / width)) * f3);
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fR / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i5) + 1.0f) * 256.0f), Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
    }

    private float r(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    public boolean O(int i2) {
        int length = this.nr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (J2(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    boolean P5(View view, int i2) {
        if (view == this.f37355Z && this.f37359t == i2) {
            return true;
        }
        if (view == null || !this.f37357o.az(view, i2)) {
            return false;
        }
        this.f37359t = i2;
        t(view, i2);
        return true;
    }

    public boolean U(View view, int i2, int i3) {
        this.f37355Z = view;
        this.f37359t = -1;
        boolean zS = S(i2, i3, 0, 0);
        if (!zS && this.f37356n == 0 && this.f37355Z != null) {
            this.f37355Z = null;
        }
        return zS;
    }

    public int ViF() {
        return this.HI;
    }

    public View WPU() {
        return this.f37355Z;
    }

    public View XQ(int i2, int i3) {
        for (int childCount = this.f37354S.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f37354S.getChildAt(this.f37357o.t(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean Xw(int i2, int i3) {
        if (this.XQ) {
            return S(i2, i3, (int) this.qie.getXVelocity(this.f37359t), (int) this.qie.getYVelocity(this.f37359t));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public int aYN() {
        return this.ck;
    }

    public void bzg(float f3) {
        this.ty = f3;
    }

    public boolean fD(int i2) {
        return ((1 << i2) & this.gh) != 0;
    }

    public int g() {
        return this.rl;
    }

    public boolean iF(int i2, int i3) {
        return e(this.f37355Z, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean jB(MotionEvent motionEvent) {
        View viewXQ;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            rl();
        }
        if (this.qie == null) {
            this.qie = VelocityTracker.obtain();
        }
        this.qie.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            nHg(x2, y2, pointerId);
            View viewXQ2 = XQ((int) x2, (int) y2);
            if (viewXQ2 == this.f37355Z && this.f37356n == 2) {
                P5(viewXQ2, pointerId);
            }
            int i2 = this.KN[pointerId];
            int i3 = this.Ik;
            if ((i2 & i3) != 0) {
                this.f37357o.KN(i2 & i3, pointerId);
            }
        } else if (actionMasked == 1) {
            rl();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    nHg(x3, y3, pointerId2);
                    int i5 = this.f37356n;
                    if (i5 == 0) {
                        int i7 = this.KN[pointerId2];
                        int i8 = this.Ik;
                        if ((i7 & i8) != 0) {
                            this.f37357o.KN(i7 & i8, pointerId2);
                        }
                    } else if (i5 == 2 && (viewXQ = XQ((int) x3, (int) y3)) == this.f37355Z) {
                        P5(viewXQ, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    gh(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.nr != null && this.f37353O != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i9 = 0; i9 < pointerCount; i9++) {
                int pointerId3 = motionEvent.getPointerId(i9);
                if (E2(pointerId3)) {
                    float x4 = motionEvent.getX(i9);
                    float y4 = motionEvent.getY(i9);
                    float f3 = x4 - this.nr[pointerId3];
                    float f4 = y4 - this.f37353O[pointerId3];
                    View viewXQ3 = XQ((int) x4, (int) y4);
                    boolean z2 = viewXQ3 != null && Uo(viewXQ3, f3, f4);
                    if (z2) {
                        int left = viewXQ3.getLeft();
                        int i10 = (int) f3;
                        int iN = this.f37357o.n(viewXQ3, left + i10, i10);
                        int top = viewXQ3.getTop();
                        int i11 = (int) f4;
                        int iRl = this.f37357o.rl(viewXQ3, top + i11, i11);
                        int iNr = this.f37357o.nr(viewXQ3);
                        int iO = this.f37357o.O(viewXQ3);
                        if ((iNr == 0 || (iNr > 0 && iN == left)) && (iO == 0 || (iO > 0 && iRl == top))) {
                            break;
                        }
                        N(f3, f4, pointerId3);
                        if (this.f37356n == 1 || (z2 && P5(viewXQ3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            s7N(motionEvent);
        }
        return this.f37356n == 1;
    }

    public void rV9(int i2) {
        this.Ik = i2;
    }

    public int te() {
        return this.f37356n;
    }

    public boolean ty(boolean z2) {
        if (this.f37356n == 2) {
            boolean zComputeScrollOffset = this.f37358r.computeScrollOffset();
            int currX = this.f37358r.getCurrX();
            int currY = this.f37358r.getCurrY();
            int left = currX - this.f37355Z.getLeft();
            int top = currY - this.f37355Z.getTop();
            if (left != 0) {
                ViewCompat.M(this.f37355Z, left);
            }
            if (top != 0) {
                ViewCompat.FX(this.f37355Z, top);
            }
            if (left != 0 || top != 0) {
                this.f37357o.gh(this.f37355Z, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f37358r.getFinalX() && currY == this.f37358r.getFinalY()) {
                this.f37358r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z2) {
                    this.f37354S.post(this.WPU);
                } else {
                    wTp(0);
                }
            }
        }
        return this.f37356n == 2;
    }

    public void v(int i2) {
        this.HI = i2;
    }

    void wTp(int i2) {
        this.f37354S.removeCallbacks(this.WPU);
        if (this.f37356n != i2) {
            this.f37356n = i2;
            this.f37357o.mUb(i2);
            if (this.f37356n == 0) {
                this.f37355Z = null;
            }
        }
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup != null) {
            if (callback != null) {
                this.f37354S = viewGroup;
                this.f37357o = callback;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.ck = i2;
                this.HI = i2;
                this.rl = viewConfiguration.getScaledTouchSlop();
                this.az = viewConfiguration.getScaledMaximumFlingVelocity();
                this.ty = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f37358r = new OverScroller(context, aYN);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private boolean E2(int i2) {
        if (!fD(i2)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public static ViewDragHelper HI(ViewGroup viewGroup, float f3, Callback callback) {
        ViewDragHelper viewDragHelperCk = ck(viewGroup, callback);
        viewDragHelperCk.rl = (int) (viewDragHelperCk.rl * (1.0f / f3));
        return viewDragHelperCk;
    }

    private float KN(float f3, float f4, float f5) {
        float fAbs = Math.abs(f3);
        if (fAbs < f4) {
            return 0.0f;
        }
        if (fAbs > f5) {
            if (f3 > 0.0f) {
                return f5;
            }
            return -f5;
        }
        return f3;
    }

    private void nHg(float f3, float f4, int i2) {
        Z(i2);
        float[] fArr = this.nr;
        this.J2[i2] = f3;
        fArr[i2] = f3;
        float[] fArr2 = this.f37353O;
        this.Uo[i2] = f4;
        fArr2[i2] = f4;
        this.KN[i2] = nY((int) f3, (int) f4);
        this.gh |= 1 << i2;
    }

    private boolean nr(float f3, float f4, int i2, int i3) {
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        if ((this.KN[i2] & i3) == i3 && (this.Ik & i3) != 0 && (this.mUb[i2] & i3) != i3 && (this.xMQ[i2] & i3) != i3) {
            int i5 = this.rl;
            if (fAbs > i5 || fAbs2 > i5) {
                if (fAbs < fAbs2 * 0.5f && this.f37357o.Uo(i3)) {
                    int[] iArr = this.mUb;
                    iArr[i2] = iArr[i2] | i3;
                    return false;
                }
                if ((this.xMQ[i2] & i3) == 0 && fAbs > this.rl) {
                    return true;
                }
            }
        }
        return false;
    }

    private void s7N(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (E2(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.J2[pointerId] = x2;
                this.Uo[pointerId] = y2;
            }
        }
    }

    private int xMQ(int i2, int i3, int i5) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        if (iAbs > i5) {
            if (i2 > 0) {
                return i5;
            }
            return -i5;
        }
        return i2;
    }

    public boolean J2(int i2, int i3) {
        boolean z2;
        boolean z3;
        if (!fD(i3)) {
            return false;
        }
        if ((i2 & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 2) == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f3 = this.J2[i3] - this.nr[i3];
        float f4 = this.Uo[i3] - this.f37353O[i3];
        if (z2 && z3) {
            float f5 = (f3 * f3) + (f4 * f4);
            int i5 = this.rl;
            if (f5 <= i5 * i5) {
                return false;
            }
            return true;
        }
        if (z2) {
            if (Math.abs(f3) <= this.rl) {
                return false;
            }
            return true;
        }
        if (!z3 || Math.abs(f4) <= this.rl) {
            return false;
        }
        return true;
    }

    public void X(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            rl();
        }
        if (this.qie == null) {
            this.qie = VelocityTracker.obtain();
        }
        this.qie.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f37356n == 1 && pointerId == this.f37359t) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i3 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i3);
                                            if (pointerId2 != this.f37359t) {
                                                View viewXQ = XQ((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                                View view = this.f37355Z;
                                                if (viewXQ == view && P5(view, pointerId2)) {
                                                    i2 = this.f37359t;
                                                    break;
                                                }
                                            }
                                            i3++;
                                        } else {
                                            i2 = -1;
                                            break;
                                        }
                                    }
                                    if (i2 == -1) {
                                        T();
                                    }
                                }
                                gh(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        nHg(x2, y2, pointerId3);
                        if (this.f37356n == 0) {
                            P5(XQ((int) x2, (int) y2), pointerId3);
                            int i5 = this.KN[pointerId3];
                            int i7 = this.Ik;
                            if ((i5 & i7) != 0) {
                                this.f37357o.KN(i5 & i7, pointerId3);
                                return;
                            }
                            return;
                        }
                        if (iF((int) x2, (int) y2)) {
                            P5(this.f37355Z, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f37356n == 1) {
                        Ik(0.0f, 0.0f);
                    }
                    rl();
                    return;
                }
                if (this.f37356n == 1) {
                    if (E2(this.f37359t)) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f37359t);
                        float x3 = motionEvent.getX(iFindPointerIndex);
                        float y3 = motionEvent.getY(iFindPointerIndex);
                        float[] fArr = this.J2;
                        int i8 = this.f37359t;
                        int i9 = (int) (x3 - fArr[i8]);
                        int i10 = (int) (y3 - this.Uo[i8]);
                        o(this.f37355Z.getLeft() + i9, this.f37355Z.getTop() + i10, i9, i10);
                        s7N(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i3 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (E2(pointerId4)) {
                        float x4 = motionEvent.getX(i3);
                        float y4 = motionEvent.getY(i3);
                        float f3 = x4 - this.nr[pointerId4];
                        float f4 = y4 - this.f37353O[pointerId4];
                        N(f3, f4, pointerId4);
                        if (this.f37356n != 1) {
                            View viewXQ2 = XQ((int) x4, (int) y4);
                            if (Uo(viewXQ2, f3, f4) && P5(viewXQ2, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                s7N(motionEvent);
                return;
            }
            if (this.f37356n == 1) {
                T();
            }
            rl();
            return;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View viewXQ3 = XQ((int) x5, (int) y5);
        nHg(x5, y5, pointerId5);
        P5(viewXQ3, pointerId5);
        int i11 = this.KN[pointerId5];
        int i12 = this.Ik;
        if ((i11 & i12) != 0) {
            this.f37357o.KN(i11 & i12, pointerId5);
        }
    }

    public void n() {
        rl();
        if (this.f37356n == 2) {
            int currX = this.f37358r.getCurrX();
            int currY = this.f37358r.getCurrY();
            this.f37358r.abortAnimation();
            int currX2 = this.f37358r.getCurrX();
            int currY2 = this.f37358r.getCurrY();
            this.f37357o.gh(this.f37355Z, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        wTp(0);
    }

    public void t(View view, int i2) {
        if (view.getParent() == this.f37354S) {
            this.f37355Z = view;
            this.f37359t = i2;
            this.f37357o.xMQ(view, i2);
            wTp(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f37354S + ")");
    }
}
