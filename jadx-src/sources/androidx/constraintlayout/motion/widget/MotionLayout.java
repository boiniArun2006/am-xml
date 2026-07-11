package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.IdRes;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static boolean wKp;
    TransitionState Aum;
    protected boolean Bu;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    float f35718C;
    private int[] EF;
    float ER;
    int EWS;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f35719F;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    float f35720G7;
    private DesignTool GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    Interpolator f35721GR;
    int HBN;
    private DecelerateInterpolator HV;
    float How;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    Interpolator f35722I;
    private StateCache JVN;
    private float Jk;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    float f35723K;
    private boolean Lp6;
    private View Mh;
    private long Mx;
    float Nxk;
    private StopLogic Org;
    int Po6;
    private long QZ6;
    int Qu;
    private ArrayList RQ;
    int Rl;
    boolean T3L;
    ArrayList Toy;
    float UF;
    int Uf;
    int UhV;
    private boolean Vvq;
    private int VwL;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private ArrayList f35724W;
    private KeyCache X4T;
    private boolean Zmq;
    HashMap Zn;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MotionScene f35725a;
    private CopyOnWriteArrayList a63;
    int dR0;
    HashMap eTf;
    boolean eWT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f35726f;
    private boolean fcU;
    private RectF g6;
    int hRu;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f35727i;
    private int ijL;
    private Matrix jO;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35728k;
    private ArrayList kSg;
    private boolean lLA;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35729m;
    private float mI;
    private boolean mYa;
    private float n1;
    private boolean n7b;
    private int nO;
    Rect o9;
    float ofS;
    int p0N;
    private float pJg;
    private int piY;
    DevModeDraw qm;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Model f35730s;
    private float tFV;
    long tUK;
    int uG;
    int ub;
    private TransitionListener ul;
    private int v0j;
    private int vl;
    private Runnable xVH;
    private long xg;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f35731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f35732z;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MotionLayout f35733n;

        @Override // java.lang.Runnable
        public void run() {
            this.f35733n.JVN.n();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MotionLayout f35734n;

        @Override // java.lang.Runnable
        public void run() {
            this.f35734n.Vvq = false;
        }
    }

    class DecelerateInterpolator extends MotionInterpolator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f35738n;
        final /* synthetic */ MotionLayout nr;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f35739t;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4;
            float f5;
            float f6 = this.f35738n;
            if (f6 > 0.0f) {
                float f7 = this.f35739t;
                if (f6 / f7 < f3) {
                    f3 = f6 / f7;
                }
                this.nr.Nxk = f6 - (f7 * f3);
                f4 = (f6 * f3) - (((f7 * f3) * f3) / 2.0f);
                f5 = this.rl;
            } else {
                float f8 = this.f35739t;
                if ((-f6) / f8 < f3) {
                    f3 = (-f6) / f8;
                }
                this.nr.Nxk = (f8 * f3) + f6;
                f4 = (f6 * f3) + (((f8 * f3) * f3) / 2.0f);
                f5 = this.rl;
            }
            return f4 + f5;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float n() {
            return this.nr.Nxk;
        }

        public void rl(float f3, float f4, float f5) {
            this.f35738n = f3;
            this.rl = f4;
            this.f35739t = f5;
        }
    }

    private class DevModeDraw {
        int Ik;
        Paint J2;
        Paint KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Paint f35740O;
        Paint Uo;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f35741Z;
        DashPathEffect ck;
        private float[] mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float[] f35742n;
        Path nr;
        int[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f35745t;
        Paint xMQ;
        final int gh = -21965;
        final int qie = -2067046;
        final int az = -13391360;
        final int ty = 1996488704;
        final int HI = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Rect f35744r = new Rect();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f35743o = false;

        private void nr(Canvas canvas) {
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < this.Ik; i2++) {
                int i3 = this.rl[i2];
                if (i3 == 1) {
                    z2 = true;
                }
                if (i3 == 0) {
                    z3 = true;
                }
            }
            if (z2) {
                Uo(canvas);
            }
            if (z3) {
                O(canvas);
            }
        }

        public void rl(Canvas canvas, int i2, int i3, MotionController motionController) {
            if (i2 == 4) {
                nr(canvas);
            }
            if (i2 == 2) {
                Uo(canvas);
            }
            if (i2 == 3) {
                O(canvas);
            }
            t(canvas);
            gh(canvas, i2, i3, motionController);
        }

        DevModeDraw() {
            this.f35741Z = 1;
            Paint paint = new Paint();
            this.f35740O = paint;
            paint.setAntiAlias(true);
            this.f35740O.setColor(-21965);
            this.f35740O.setStrokeWidth(2.0f);
            Paint paint2 = this.f35740O;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.J2 = paint3;
            paint3.setAntiAlias(true);
            this.J2.setColor(-2067046);
            this.J2.setStrokeWidth(2.0f);
            this.J2.setStyle(style);
            Paint paint4 = new Paint();
            this.Uo = paint4;
            paint4.setAntiAlias(true);
            this.Uo.setColor(-13391360);
            this.Uo.setStrokeWidth(2.0f);
            this.Uo.setStyle(style);
            Paint paint5 = new Paint();
            this.KN = paint5;
            paint5.setAntiAlias(true);
            this.KN.setColor(-13391360);
            this.KN.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mUb = new float[8];
            Paint paint6 = new Paint();
            this.xMQ = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.ck = dashPathEffect;
            this.Uo.setPathEffect(dashPathEffect);
            this.f35745t = new float[100];
            this.rl = new int[50];
            if (this.f35743o) {
                this.f35740O.setStrokeWidth(8.0f);
                this.xMQ.setStrokeWidth(8.0f);
                this.J2.setStrokeWidth(8.0f);
                this.f35741Z = 4;
            }
        }

        private void J2(Canvas canvas, float f3, float f4) {
            float[] fArr = this.f35742n;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            float fMin = Math.min(f5, f7);
            float fMax = Math.max(f6, f8);
            float fMin2 = f3 - Math.min(f5, f7);
            float fMax2 = Math.max(f6, f8) - f4;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f7 - f5))) + 0.5d)) / 100.0f);
            qie(str, this.KN);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f35744r.width() / 2)) + fMin, f4 - 20.0f, this.KN);
            canvas.drawLine(f3, f4, Math.min(f5, f7), f4, this.Uo);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f8 - f6))) + 0.5d)) / 100.0f);
            qie(str2, this.KN);
            canvas.drawText(str2, f3 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f35744r.height() / 2)), this.KN);
            canvas.drawLine(f3, f4, f3, Math.max(f6, f8), this.Uo);
        }

        private void KN(Canvas canvas, float f3, float f4) {
            float[] fArr = this.f35742n;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f5 - f7, f6 - f8);
            float f9 = f7 - f5;
            float f10 = f8 - f6;
            float f11 = (((f3 - f5) * f9) + ((f4 - f6) * f10)) / (fHypot * fHypot);
            float f12 = f5 + (f9 * f11);
            float f13 = f6 + (f11 * f10);
            Path path = new Path();
            path.moveTo(f3, f4);
            path.lineTo(f12, f13);
            float fHypot2 = (float) Math.hypot(f12 - f3, f13 - f4);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            qie(str, this.KN);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f35744r.width() / 2), -20.0f, this.KN);
            canvas.drawLine(f3, f4, f12, f13, this.Uo);
        }

        private void O(Canvas canvas) {
            float[] fArr = this.f35742n;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f3, f5), Math.max(f4, f6), Math.max(f3, f5), Math.max(f4, f6), this.Uo);
            canvas.drawLine(Math.min(f3, f5), Math.min(f4, f6), Math.min(f3, f5), Math.max(f4, f6), this.Uo);
        }

        private void Uo(Canvas canvas) {
            float[] fArr = this.f35742n;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.Uo);
        }

        private void gh(Canvas canvas, int i2, int i3, MotionController motionController) {
            int width;
            int height;
            View view = motionController.rl;
            if (view != null) {
                width = view.getWidth();
                height = motionController.rl.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i5 = 1; i5 < i3 - 1; i5++) {
                if (i2 != 4 || this.rl[i5 - 1] != 0) {
                    float[] fArr = this.f35745t;
                    int i7 = i5 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.nr.reset();
                    this.nr.moveTo(f3, f4 + 10.0f);
                    this.nr.lineTo(f3 + 10.0f, f4);
                    this.nr.lineTo(f3, f4 - 10.0f);
                    this.nr.lineTo(f3 - 10.0f, f4);
                    this.nr.close();
                    int i8 = i5 - 1;
                    motionController.Ik(i8);
                    if (i2 == 4) {
                        int i9 = this.rl[i8];
                        if (i9 == 1) {
                            KN(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 0) {
                            J2(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 2) {
                            xMQ(canvas, f3 - 0.0f, f4 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.nr, this.xMQ);
                    }
                    if (i2 == 2) {
                        KN(canvas, f3 - 0.0f, f4 - 0.0f);
                    }
                    if (i2 == 3) {
                        J2(canvas, f3 - 0.0f, f4 - 0.0f);
                    }
                    if (i2 == 6) {
                        xMQ(canvas, f3 - 0.0f, f4 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.nr, this.xMQ);
                }
            }
            float[] fArr2 = this.f35742n;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.J2);
                float[] fArr3 = this.f35742n;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.J2);
            }
        }

        private void mUb(Canvas canvas, MotionController motionController) {
            this.nr.reset();
            for (int i2 = 0; i2 <= 50; i2++) {
                motionController.O(i2 / 50, this.mUb, 0);
                Path path = this.nr;
                float[] fArr = this.mUb;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.nr;
                float[] fArr2 = this.mUb;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.nr;
                float[] fArr3 = this.mUb;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.nr;
                float[] fArr4 = this.mUb;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.nr.close();
            }
            this.f35740O.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.nr, this.f35740O);
            canvas.translate(-2.0f, -2.0f);
            this.f35740O.setColor(-65536);
            canvas.drawPath(this.nr, this.f35740O);
        }

        private void t(Canvas canvas) {
            canvas.drawLines(this.f35742n, this.f35740O);
        }

        private void xMQ(Canvas canvas, float f3, float f4, int i2, int i3) {
            String str = "" + (((int) (((double) (((f3 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i2))) + 0.5d)) / 100.0f);
            qie(str, this.KN);
            canvas.drawText(str, ((f3 / 2.0f) - (this.f35744r.width() / 2)) + 0.0f, f4 - 20.0f, this.KN);
            canvas.drawLine(f3, f4, Math.min(0.0f, 1.0f), f4, this.Uo);
            String str2 = "" + (((int) (((double) (((f4 - (i3 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i3))) + 0.5d)) / 100.0f);
            qie(str2, this.KN);
            canvas.drawText(str2, 5.0f + f3, 0.0f - ((f4 / 2.0f) - (this.f35744r.height() / 2)), this.KN);
            canvas.drawLine(f3, f4, f3, Math.max(0.0f, 1.0f), this.Uo);
        }

        public void n(Canvas canvas, HashMap map, int i2, int i3) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i3 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f35732z) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.KN);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f35740O);
            }
            for (MotionController motionController : map.values()) {
                int iAz = motionController.az();
                if (i3 > 0 && iAz == 0) {
                    iAz = 1;
                }
                if (iAz != 0) {
                    this.Ik = motionController.t(this.f35745t, this.rl);
                    if (iAz >= 1) {
                        int i5 = i2 / 16;
                        float[] fArr = this.f35742n;
                        if (fArr == null || fArr.length != i5 * 2) {
                            this.f35742n = new float[i5 * 2];
                            this.nr = new Path();
                        }
                        int i7 = this.f35741Z;
                        canvas.translate(i7, i7);
                        this.f35740O.setColor(1996488704);
                        this.xMQ.setColor(1996488704);
                        this.J2.setColor(1996488704);
                        this.Uo.setColor(1996488704);
                        motionController.nr(this.f35742n, i5);
                        rl(canvas, iAz, this.Ik, motionController);
                        this.f35740O.setColor(-21965);
                        this.J2.setColor(-2067046);
                        this.xMQ.setColor(-2067046);
                        this.Uo.setColor(-13391360);
                        int i8 = this.f35741Z;
                        canvas.translate(-i8, -i8);
                        rl(canvas, iAz, this.Ik, motionController);
                        if (iAz == 5) {
                            mUb(canvas, motionController);
                        }
                    }
                }
            }
            canvas.restore();
        }

        void qie(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f35744r);
        }
    }

    class Model {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f35746O;
        final /* synthetic */ MotionLayout Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ConstraintWidgetContainer f35747n;
        ConstraintSet nr;
        ConstraintWidgetContainer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ConstraintSet f35748t;

        /* JADX WARN: Multi-variable type inference failed */
        private void mUb(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(this.Uo.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.nr != 0) {
                MotionLayout motionLayout = this.Uo;
                motionLayout.aYN(this.rl, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(this.Uo.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.Uo.getWidth(), 1073741824));
            }
            for (ConstraintWidget constraintWidget : constraintWidgetContainer.Mh()) {
                constraintWidget.EWS(true);
                sparseArray.put(((View) constraintWidget.XQ()).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : constraintWidgetContainer.Mh()) {
                View view = (View) constraintWidget2.XQ();
                constraintSet.qie(view.getId(), layoutParams);
                constraintWidget2.vl(constraintSet.nY(view.getId()));
                constraintWidget2.a63(constraintSet.S(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.mUb((ConstraintHelper) view, constraintWidget2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).WPU();
                    }
                }
                layoutParams.resolveLayoutDirection(this.Uo.getLayoutDirection());
                this.Uo.O(false, view, constraintWidget2, layoutParams, sparseArray);
                if (constraintSet.ViF(view.getId()) == 1) {
                    constraintWidget2.nO(view.getVisibility());
                } else {
                    constraintWidget2.nO(constraintSet.aYN(view.getId()));
                }
            }
            for (ConstraintWidget constraintWidget3 : constraintWidgetContainer.Mh()) {
                if (constraintWidget3 instanceof VirtualLayout) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) constraintWidget3.XQ();
                    Helper helper = (Helper) constraintWidget3;
                    constraintHelper.XQ(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).Toy();
                }
            }
        }

        private void rl(int i2, int i3) {
            int optimizationLevel = this.Uo.getOptimizationLevel();
            MotionLayout motionLayout = this.Uo;
            if (motionLayout.dR0 == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = this.Uo;
                ConstraintWidgetContainer constraintWidgetContainer = this.rl;
                ConstraintSet constraintSet = this.nr;
                motionLayout2.aYN(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.nr == 0) ? i2 : i3, (constraintSet == null || constraintSet.nr == 0) ? i3 : i2);
                ConstraintSet constraintSet2 = this.f35748t;
                if (constraintSet2 != null) {
                    MotionLayout motionLayout3 = this.Uo;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f35747n;
                    int i5 = constraintSet2.nr;
                    int i7 = i5 == 0 ? i2 : i3;
                    if (i5 == 0) {
                        i2 = i3;
                    }
                    motionLayout3.aYN(constraintWidgetContainer2, optimizationLevel, i7, i2);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.f35748t;
            if (constraintSet3 != null) {
                MotionLayout motionLayout4 = this.Uo;
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f35747n;
                int i8 = constraintSet3.nr;
                motionLayout4.aYN(constraintWidgetContainer3, optimizationLevel, i8 == 0 ? i2 : i3, i8 == 0 ? i3 : i2);
            }
            MotionLayout motionLayout5 = this.Uo;
            ConstraintWidgetContainer constraintWidgetContainer4 = this.rl;
            ConstraintSet constraintSet4 = this.nr;
            int i9 = (constraintSet4 == null || constraintSet4.nr == 0) ? i2 : i3;
            if (constraintSet4 == null || constraintSet4.nr == 0) {
                i2 = i3;
            }
            motionLayout5.aYN(constraintWidgetContainer4, optimizationLevel, i9, i2);
        }

        public boolean J2(int i2, int i3) {
            return (i2 == this.f35746O && i3 == this.J2) ? false : true;
        }

        public void KN() {
            Uo(this.Uo.piY, this.Uo.ijL);
            this.Uo.qm();
        }

        void O(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.f35748t = constraintSet;
            this.nr = constraintSet2;
            this.f35747n = new ConstraintWidgetContainer();
            this.rl = new ConstraintWidgetContainer();
            this.f35747n.iV(((ConstraintLayout) this.Uo).f35908O.Ro());
            this.rl.iV(((ConstraintLayout) this.Uo).f35908O.Ro());
            this.f35747n.wKp();
            this.rl.wKp();
            t(((ConstraintLayout) this.Uo).f35908O, this.f35747n);
            t(((ConstraintLayout) this.Uo).f35908O, this.rl);
            if (this.Uo.f35718C > 0.5d) {
                if (constraintSet != null) {
                    mUb(this.f35747n, constraintSet);
                }
                mUb(this.rl, constraintSet2);
            } else {
                mUb(this.rl, constraintSet2);
                if (constraintSet != null) {
                    mUb(this.f35747n, constraintSet);
                }
            }
            this.f35747n.Co(this.Uo.Z());
            this.f35747n.A();
            this.rl.Co(this.Uo.Z());
            this.rl.A();
            ViewGroup.LayoutParams layoutParams = this.Uo.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f35747n;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.VwL(dimensionBehaviour);
                    this.rl.VwL(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.f35747n;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.Vvq(dimensionBehaviour2);
                    this.rl.Vvq(dimensionBehaviour2);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0133 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void n() {
            String str;
            int childCount = this.Uo.getChildCount();
            this.Uo.eTf.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.Uo.getChildAt(i2);
                MotionController motionController = new MotionController(childAt);
                int id = childAt.getId();
                iArr[i2] = id;
                sparseArray.put(id, motionController);
                this.Uo.eTf.put(childAt, motionController);
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = this.Uo.getChildAt(i3);
                MotionController motionController2 = (MotionController) this.Uo.eTf.get(childAt2);
                if (motionController2 != null) {
                    if (this.f35748t != null) {
                        ConstraintWidget constraintWidgetNr = nr(this.f35747n, childAt2);
                        if (constraintWidgetNr != null) {
                            motionController2.e(this.Uo.mYa(constraintWidgetNr), this.f35748t, this.Uo.getWidth(), this.Uo.getHeight());
                        } else if (this.Uo.Rl != 0) {
                            Log.e("MotionLayout", Debug.rl() + "no widget for  " + Debug.nr(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    } else {
                        if (this.Uo.Vvq) {
                            ViewState viewState = (ViewState) this.Uo.Zn.get(childAt2);
                            MotionLayout motionLayout = this.Uo;
                            str = "MotionLayout";
                            motionController2.X(viewState, childAt2, motionLayout.f35731y, motionLayout.nO, this.Uo.vl);
                        }
                        if (this.nr != null) {
                            ConstraintWidget constraintWidgetNr2 = nr(this.rl, childAt2);
                            if (constraintWidgetNr2 != null) {
                                motionController2.iF(this.Uo.mYa(constraintWidgetNr2), this.nr, this.Uo.getWidth(), this.Uo.getHeight());
                            } else if (this.Uo.Rl != 0) {
                                Log.e(str, Debug.rl() + "no widget for  " + Debug.nr(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    }
                    str = "MotionLayout";
                    if (this.nr != null) {
                    }
                }
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                MotionController motionController3 = (MotionController) sparseArray.get(iArr[i5]);
                int iKN = motionController3.KN();
                if (iKN != -1) {
                    motionController3.nHg((MotionController) sparseArray.get(iKN));
                }
            }
        }

        public void xMQ(int i2, int i3) {
            this.f35746O = i2;
            this.J2 = i3;
        }

        public void Uo(int i2, int i3) {
            boolean z2;
            boolean z3;
            boolean z4;
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            MotionLayout motionLayout = this.Uo;
            motionLayout.Qu = mode;
            motionLayout.HBN = mode2;
            rl(i2, i3);
            if (!(this.Uo.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                rl(i2, i3);
                this.Uo.p0N = this.f35747n.J();
                this.Uo.Uf = this.f35747n.nY();
                this.Uo.f35726f = this.rl.J();
                this.Uo.ub = this.rl.nY();
                MotionLayout motionLayout2 = this.Uo;
                if (motionLayout2.p0N == motionLayout2.f35726f && motionLayout2.Uf == motionLayout2.ub) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                motionLayout2.Bu = z2;
            }
            MotionLayout motionLayout3 = this.Uo;
            int i5 = motionLayout3.p0N;
            int i7 = motionLayout3.Uf;
            int i8 = motionLayout3.Qu;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                i5 = (int) (i5 + (motionLayout3.UF * (motionLayout3.f35726f - i5)));
            }
            int i9 = i5;
            int i10 = motionLayout3.HBN;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                i7 = (int) (i7 + (motionLayout3.UF * (motionLayout3.ub - i7)));
            }
            int i11 = i7;
            if (!this.f35747n.eo() && !this.rl.eo()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!this.f35747n.h() && !this.rl.h()) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.Uo.WPU(i2, i3, i9, i11, z3, z4);
        }

        ConstraintWidget nr(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.XQ() == view) {
                return constraintWidgetContainer;
            }
            ArrayList arrayListMh = constraintWidgetContainer.Mh();
            int size = arrayListMh.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i2);
                if (constraintWidget.XQ() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        void t(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> arrayListMh = constraintWidgetContainer.Mh();
            HashMap map = new HashMap();
            map.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.Mh().clear();
            constraintWidgetContainer2.ty(constraintWidgetContainer, map);
            for (ConstraintWidget constraintWidget2 : arrayListMh) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Barrier();
                } else if (constraintWidget2 instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (constraintWidget2 instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (constraintWidget2 instanceof Placeholder) {
                    constraintWidget = new Placeholder();
                } else if (constraintWidget2 instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.n(constraintWidget);
                map.put(constraintWidget2, constraintWidget);
            }
            for (ConstraintWidget constraintWidget3 : arrayListMh) {
                ((ConstraintWidget) map.get(constraintWidget3)).ty(constraintWidget3, map);
            }
        }
    }

    protected interface MotionTracker {
        void O(int i2);

        void n(MotionEvent motionEvent);

        void nr();

        float rl();

        float t();
    }

    private static class MyTracker implements MotionTracker {
        private static MyTracker rl = new MyTracker();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        VelocityTracker f35749n;

        public static MyTracker J2() {
            rl.f35749n = VelocityTracker.obtain();
            return rl;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void O(int i2) {
            VelocityTracker velocityTracker = this.f35749n;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i2);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void n(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f35749n;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void nr() {
            VelocityTracker velocityTracker = this.f35749n;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35749n = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float rl() {
            VelocityTracker velocityTracker = this.f35749n;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float t() {
            VelocityTracker velocityTracker = this.f35749n;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        private MyTracker() {
        }
    }

    class StateCache {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f35751n = Float.NaN;
        float rl = Float.NaN;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35752t = -1;
        int nr = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final String f35750O = "motion.progress";
        final String J2 = "motion.velocity";
        final String Uo = "motion.StartState";
        final String KN = "motion.EndState";

        StateCache() {
        }

        public void J2(int i2) {
            this.f35752t = i2;
        }

        public void KN(float f3) {
            this.rl = f3;
        }

        public void O(float f3) {
            this.f35751n = f3;
        }

        public void Uo(Bundle bundle) {
            this.f35751n = bundle.getFloat("motion.progress");
            this.rl = bundle.getFloat("motion.velocity");
            this.f35752t = bundle.getInt("motion.StartState");
            this.nr = bundle.getInt("motion.EndState");
        }

        void n() {
            int i2 = this.f35752t;
            if (i2 != -1 || this.nr != -1) {
                if (i2 == -1) {
                    MotionLayout.this.EWS(this.nr);
                } else {
                    int i3 = this.nr;
                    if (i3 == -1) {
                        MotionLayout.this.Jk(i2, -1, -1);
                    } else {
                        MotionLayout.this.Rl(i2, i3);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.rl)) {
                if (Float.isNaN(this.f35751n)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f35751n);
            } else {
                MotionLayout.this.n1(this.f35751n, this.rl);
                this.f35751n = Float.NaN;
                this.rl = Float.NaN;
                this.f35752t = -1;
                this.nr = -1;
            }
        }

        public void nr(int i2) {
            this.nr = i2;
        }

        public Bundle rl() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f35751n);
            bundle.putFloat("motion.velocity", this.rl);
            bundle.putInt("motion.StartState", this.f35752t);
            bundle.putInt("motion.EndState", this.nr);
            return bundle;
        }

        public void t() {
            this.nr = MotionLayout.this.f35732z;
            this.f35752t = MotionLayout.this.f35728k;
            this.rl = MotionLayout.this.getVelocity();
            this.f35751n = MotionLayout.this.getProgress();
        }
    }

    public interface TransitionListener {
        void n(MotionLayout motionLayout, int i2, int i3, float f3);

        void nr(MotionLayout motionLayout, int i2, boolean z2, float f3);

        void rl(MotionLayout motionLayout, int i2);

        void t(MotionLayout motionLayout, int i2, int i3);
    }

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private static boolean ER(float f3, float f4, float f5) {
        if (f3 > 0.0f) {
            float f6 = f3 / f5;
            return f4 + ((f3 * f6) - (((f5 * f6) * f6) / 2.0f)) > 1.0f;
        }
        float f7 = (-f3) / f5;
        return f4 + ((f3 * f7) + (((f5 * f7) * f7) / 2.0f)) < 0.0f;
    }

    public void Po6() {
        D(0.0f);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void S(int i2) {
        this.f35910T = null;
    }

    public void UhV(int i2, int i3, int i5) {
        i(i2, i3, i5, -1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) throws Throwable {
        MotionLayout motionLayout;
        this.Zmq = true;
        try {
            if (this.f35725a == null) {
                super.onLayout(z2, i2, i3, i5, i7);
                this.Zmq = false;
                return;
            }
            motionLayout = this;
            int i8 = i5 - i2;
            int i9 = i7 - i3;
            try {
                if (motionLayout.hRu != i8 || motionLayout.UhV != i9) {
                    ul();
                    Y(true);
                }
                motionLayout.hRu = i8;
                motionLayout.UhV = i9;
                motionLayout.Po6 = i8;
                motionLayout.EWS = i9;
                motionLayout.Zmq = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.Zmq = false;
        throw th3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    public void setProgress(float f3) {
        if (f3 < 0.0f || f3 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.JVN == null) {
                this.JVN = new StateCache();
            }
            this.JVN.O(f3);
            return;
        }
        if (f3 <= 0.0f) {
            if (this.f35718C == 1.0f && this.dR0 == this.f35732z) {
                setState(TransitionState.MOVING);
            }
            this.dR0 = this.f35728k;
            if (this.f35718C == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f3 >= 1.0f) {
            if (this.f35718C == 0.0f && this.dR0 == this.f35728k) {
                setState(TransitionState.MOVING);
            }
            this.dR0 = this.f35732z;
            if (this.f35718C == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.dR0 = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f35725a == null) {
            return;
        }
        this.fcU = true;
        this.f35720G7 = f3;
        this.ofS = f3;
        this.Mx = -1L;
        this.xg = -1L;
        this.f35722I = null;
        this.eWT = true;
        invalidate();
    }

    public void setTransition(int i2) {
        if (this.f35725a != null) {
            MotionScene.Transition transitionPJg = pJg(i2);
            this.f35728k = transitionPJg.S();
            this.f35732z = transitionPJg.Z();
            if (!isAttachedToWindow()) {
                if (this.JVN == null) {
                    this.JVN = new StateCache();
                }
                this.JVN.J2(this.f35728k);
                this.JVN.nr(this.f35732z);
                return;
            }
            int i3 = this.dR0;
            float f3 = i3 == this.f35728k ? 0.0f : i3 == this.f35732z ? 1.0f : Float.NaN;
            this.f35725a.jB(transitionPJg);
            this.f35730s.O(this.f35908O, this.f35725a.mUb(this.f35728k), this.f35725a.mUb(this.f35732z));
            ul();
            if (this.f35718C != f3) {
                if (f3 == 0.0f) {
                    Nxk(true);
                    this.f35725a.mUb(this.f35728k).xMQ(this);
                } else if (f3 == 1.0f) {
                    Nxk(false);
                    this.f35725a.mUb(this.f35732z).xMQ(this);
                }
            }
            this.f35718C = Float.isNaN(f3) ? 0.0f : f3;
            if (!Float.isNaN(f3)) {
                setProgress(f3);
                return;
            }
            Log.v("MotionLayout", Debug.rl() + " transitionToStart ");
            Po6();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void ty(View view, int i2, int i3, int i5, int i7, int i8) {
    }

    private boolean C(float f3, float f4, View view, MotionEvent motionEvent) {
        boolean z2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (C((r3.getLeft() + f3) - view.getScrollX(), (r3.getTop() + f4) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.g6.set(f3, f4, (view.getRight() + f3) - view.getLeft(), (view.getBottom() + f4) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.g6.contains(motionEvent.getX(), motionEvent.getY())) && I(view, motionEvent, -f3, -f4)) {
                return true;
            }
        }
        return z2;
    }

    private void dR0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.ul == null && ((copyOnWriteArrayList = this.a63) == null || copyOnWriteArrayList.isEmpty())) || this.mI == this.ofS) {
            return;
        }
        if (this.VwL != -1) {
            piY();
            this.T3L = true;
        }
        this.VwL = -1;
        float f3 = this.ofS;
        this.mI = f3;
        TransitionListener transitionListener = this.ul;
        if (transitionListener != null) {
            transitionListener.n(this, this.f35728k, this.f35732z, f3);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.a63;
        if (copyOnWriteArrayList2 != null) {
            Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).n(this, this.f35728k, this.f35732z, this.ofS);
            }
        }
        this.T3L = true;
    }

    private void eWT() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.ul == null && ((copyOnWriteArrayList = this.a63) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.T3L = false;
        for (Integer num : this.Toy) {
            TransitionListener transitionListener = this.ul;
            if (transitionListener != null) {
                transitionListener.rl(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.a63;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((TransitionListener) it.next()).rl(this, num.intValue());
                }
            }
        }
        this.Toy.clear();
    }

    private void k() {
        boolean z2;
        float fSignum = Math.signum(this.f35720G7 - this.f35718C);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f35722I;
        float interpolation = this.f35718C + (!(interpolator instanceof StopLogic) ? (((nanoTime - this.Mx) * fSignum) * 1.0E-9f) / this.pJg : 0.0f);
        if (this.fcU) {
            interpolation = this.f35720G7;
        }
        if ((fSignum <= 0.0f || interpolation < this.f35720G7) && (fSignum > 0.0f || interpolation > this.f35720G7)) {
            z2 = false;
        } else {
            interpolation = this.f35720G7;
            z2 = true;
        }
        if (interpolator != null && !z2) {
            interpolation = this.mYa ? interpolator.getInterpolation((nanoTime - this.xg) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f35720G7) || (fSignum <= 0.0f && interpolation <= this.f35720G7)) {
            interpolation = this.f35720G7;
        }
        this.UF = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f35721GR;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f3 = interpolation;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = (MotionController) this.eTf.get(childAt);
            if (motionController != null) {
                motionController.aYN(childAt, f3, nanoTime2, this.X4T);
            }
        }
        if (this.Bu) {
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect mYa(ConstraintWidget constraintWidget) {
        this.o9.top = constraintWidget.a();
        this.o9.left = constraintWidget.D();
        Rect rect = this.o9;
        int iJ = constraintWidget.J();
        Rect rect2 = this.o9;
        rect.right = iJ + rect2.left;
        int iNY = constraintWidget.nY();
        Rect rect3 = this.o9;
        rect2.bottom = iNY + rect3.top;
        return rect3;
    }

    private void piY() {
        TransitionListener transitionListener = this.ul;
        if (transitionListener != null) {
            transitionListener.t(this, this.f35728k, this.f35732z);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.a63;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).t(this, this.f35728k, this.f35732z);
            }
        }
    }

    void D(float f3) {
        if (this.f35725a == null) {
            return;
        }
        float f4 = this.f35718C;
        float f5 = this.ofS;
        if (f4 != f5 && this.fcU) {
            this.f35718C = f5;
        }
        float f6 = this.f35718C;
        if (f6 == f3) {
            return;
        }
        this.mYa = false;
        this.f35720G7 = f3;
        this.pJg = r0.ty() / 1000.0f;
        setProgress(this.f35720G7);
        this.f35722I = null;
        this.f35721GR = this.f35725a.ck();
        this.fcU = false;
        this.xg = getNanoTime();
        this.eWT = true;
        this.ofS = f6;
        this.f35718C = f6;
        invalidate();
    }

    public void GD(Runnable runnable) {
        D(1.0f);
        this.xVH = runnable;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean HI(View view, View view2, int i2, int i3) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.f35725a;
        return (motionScene == null || (transition = motionScene.f35775t) == null || transition.WPU() == null || (this.f35725a.f35775t.WPU().t() & 2) != 0) ? false : true;
    }

    public void HV() {
        D(1.0f);
        this.xVH = null;
    }

    public void How(int i2, ConstraintSet constraintSet) {
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            motionScene.v(i2, constraintSet);
        }
        K();
        if (this.dR0 == i2) {
            constraintSet.xMQ(this);
        }
    }

    public void Jk(int i2, int i3, int i5) {
        setState(TransitionState.SETUP);
        this.dR0 = i2;
        this.f35728k = -1;
        this.f35732z = -1;
        ConstraintLayoutStates constraintLayoutStates = this.f35910T;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.nr(i2, i3, i5);
            return;
        }
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            motionScene.mUb(i2).xMQ(this);
        }
    }

    public void K() {
        this.f35730s.O(this.f35908O, this.f35725a.mUb(this.f35728k), this.f35725a.mUb(this.f35732z));
        ul();
    }

    public boolean Mx() {
        return this.f35729m;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Org(int i2, float f3, float f4) {
        float f5;
        if (this.f35725a == null || this.f35718C == f3) {
            return;
        }
        this.mYa = true;
        this.xg = getNanoTime();
        this.pJg = this.f35725a.ty() / 1000.0f;
        this.f35720G7 = f3;
        this.eWT = true;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (i2 == 1 || i2 == 7) {
                f5 = 0.0f;
            } else {
                if (i2 == 2 || i2 == 6) {
                    f3 = 1.0f;
                }
                f5 = f3;
            }
            if (this.f35725a.xMQ() == 0) {
                this.Org.rl(this.f35718C, f5, f4, this.pJg, this.f35725a.r(), this.f35725a.o());
            } else {
                this.Org.nr(this.f35718C, f5, f4, this.f35725a.ViF(), this.f35725a.nY(), this.f35725a.aYN(), this.f35725a.g(), this.f35725a.WPU());
            }
            int i3 = this.dR0;
            this.f35720G7 = f5;
            this.dR0 = i3;
            this.f35722I = this.Org;
        } else if (i2 == 4) {
            this.HV.rl(f4, this.f35718C, this.f35725a.r());
            this.f35722I = this.HV;
        } else if (i2 != 5) {
            if (i2 == 6 || i2 == 7) {
            }
        } else if (ER(f4, this.f35718C, this.f35725a.r())) {
            this.HV.rl(f4, this.f35718C, this.f35725a.r());
            this.f35722I = this.HV;
        } else {
            this.Org.rl(this.f35718C, f3, f4, this.pJg, this.f35725a.r(), this.f35725a.o());
            this.Nxk = 0.0f;
            int i5 = this.dR0;
            this.f35720G7 = f3;
            this.dR0 = i5;
            this.f35722I = this.Org;
        }
        this.fcU = false;
        this.xg = getNanoTime();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void Y(boolean z2) {
        boolean z3;
        char c2;
        int childCount;
        Interpolator interpolator;
        int i2;
        int i3;
        boolean z4;
        if (this.Mx == -1) {
            this.Mx = getNanoTime();
        }
        float f3 = this.f35718C;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.dR0 = -1;
        }
        boolean z5 = false;
        if (this.lLA || (this.eWT && (z2 || this.f35720G7 != f3))) {
            float fSignum = Math.signum(this.f35720G7 - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator2 = this.f35722I;
            float f4 = !(interpolator2 instanceof MotionInterpolator) ? (((nanoTime - this.Mx) * fSignum) * 1.0E-9f) / this.pJg : 0.0f;
            float f5 = this.f35718C + f4;
            if (this.fcU) {
                f5 = this.f35720G7;
            }
            if ((fSignum <= 0.0f || f5 < this.f35720G7) && (fSignum > 0.0f || f5 > this.f35720G7)) {
                z3 = false;
            } else {
                f5 = this.f35720G7;
                this.eWT = false;
                z3 = true;
            }
            this.f35718C = f5;
            this.ofS = f5;
            this.Mx = nanoTime;
            if (interpolator2 == null || z3) {
                this.Nxk = f4;
            } else if (this.mYa) {
                float interpolation = interpolator2.getInterpolation((nanoTime - this.xg) * 1.0E-9f);
                Interpolator interpolator3 = this.f35722I;
                StopLogic stopLogic = this.Org;
                c2 = interpolator3 == stopLogic ? stopLogic.t() ? (char) 2 : (char) 1 : (char) 0;
                this.f35718C = interpolation;
                this.Mx = nanoTime;
                Interpolator interpolator4 = this.f35722I;
                if (interpolator4 instanceof MotionInterpolator) {
                    float fN = ((MotionInterpolator) interpolator4).n();
                    this.Nxk = fN;
                    if (Math.abs(fN) * this.pJg <= 1.0E-5f && c2 == 2) {
                        this.eWT = false;
                    }
                    if (fN > 0.0f && interpolation >= 1.0f) {
                        this.f35718C = 1.0f;
                        this.eWT = false;
                        interpolation = 1.0f;
                    }
                    if (fN >= 0.0f || interpolation > 0.0f) {
                        f5 = interpolation;
                    } else {
                        this.f35718C = 0.0f;
                        this.eWT = false;
                        f5 = 0.0f;
                    }
                    if (Math.abs(this.Nxk) > 1.0E-5f) {
                        setState(TransitionState.MOVING);
                    }
                    if (c2 != 1) {
                        if ((fSignum > 0.0f && f5 >= this.f35720G7) || (fSignum <= 0.0f && f5 <= this.f35720G7)) {
                            f5 = this.f35720G7;
                            this.eWT = false;
                        }
                        if (f5 >= 1.0f || f5 <= 0.0f) {
                            this.eWT = false;
                            setState(TransitionState.FINISHED);
                        }
                    }
                    childCount = getChildCount();
                    this.lLA = false;
                    long nanoTime2 = getNanoTime();
                    this.UF = f5;
                    Interpolator interpolator5 = this.f35721GR;
                    float interpolation2 = interpolator5 != null ? f5 : interpolator5.getInterpolation(f5);
                    interpolator = this.f35721GR;
                    if (interpolator != null) {
                        float interpolation3 = interpolator.getInterpolation((fSignum / this.pJg) + f5);
                        this.Nxk = interpolation3;
                        this.Nxk = interpolation3 - this.f35721GR.getInterpolation(f5);
                    }
                    for (i2 = 0; i2 < childCount; i2++) {
                        View childAt = getChildAt(i2);
                        MotionController motionController = (MotionController) this.eTf.get(childAt);
                        if (motionController != null) {
                            this.lLA |= motionController.aYN(childAt, interpolation2, nanoTime2, this.X4T);
                        }
                    }
                    boolean z6 = (fSignum <= 0.0f && f5 >= this.f35720G7) || (fSignum <= 0.0f && f5 <= this.f35720G7);
                    if (!this.lLA && !this.eWT && z6) {
                        setState(TransitionState.FINISHED);
                    }
                    if (this.Bu) {
                        requestLayout();
                    }
                    this.lLA = (!z6) | this.lLA;
                    if (f5 <= 0.0f && (i3 = this.f35728k) != -1 && this.dR0 != i3) {
                        this.dR0 = i3;
                        this.f35725a.mUb(i3).Uo(this);
                        setState(TransitionState.FINISHED);
                        z5 = true;
                    }
                    if (f5 >= 1.0d) {
                        int i5 = this.dR0;
                        int i7 = this.f35732z;
                        if (i5 != i7) {
                            this.dR0 = i7;
                            this.f35725a.mUb(i7).Uo(this);
                            setState(TransitionState.FINISHED);
                            z5 = true;
                        }
                    }
                    if (this.lLA || this.eWT) {
                        invalidate();
                    } else if ((fSignum > 0.0f && f5 == 1.0f) || (fSignum < 0.0f && f5 == 0.0f)) {
                        setState(TransitionState.FINISHED);
                    }
                    if (!this.lLA && !this.eWT && ((fSignum > 0.0f && f5 == 1.0f) || (fSignum < 0.0f && f5 == 0.0f))) {
                        fcU();
                    }
                }
            } else {
                float interpolation4 = interpolator2.getInterpolation(f5);
                Interpolator interpolator6 = this.f35722I;
                if (interpolator6 instanceof MotionInterpolator) {
                    this.Nxk = ((MotionInterpolator) interpolator6).n();
                } else {
                    this.Nxk = ((interpolator6.getInterpolation(f5 + f4) - interpolation4) * fSignum) / f4;
                }
                f5 = interpolation4;
            }
            c2 = 0;
            if (Math.abs(this.Nxk) > 1.0E-5f) {
            }
            if (c2 != 1) {
            }
            childCount = getChildCount();
            this.lLA = false;
            long nanoTime22 = getNanoTime();
            this.UF = f5;
            Interpolator interpolator52 = this.f35721GR;
            if (interpolator52 != null) {
            }
            interpolator = this.f35721GR;
            if (interpolator != null) {
            }
            while (i2 < childCount) {
            }
            if (fSignum <= 0.0f) {
                if (!this.lLA) {
                    setState(TransitionState.FINISHED);
                }
                if (this.Bu) {
                }
                this.lLA = (!z6) | this.lLA;
                if (f5 <= 0.0f) {
                    this.dR0 = i3;
                    this.f35725a.mUb(i3).Uo(this);
                    setState(TransitionState.FINISHED);
                    z5 = true;
                }
                if (f5 >= 1.0d) {
                }
                if (this.lLA) {
                    invalidate();
                    if (!this.lLA) {
                        fcU();
                    }
                }
            } else {
                if (!this.lLA) {
                }
                if (this.Bu) {
                }
                this.lLA = (!z6) | this.lLA;
                if (f5 <= 0.0f) {
                }
                if (f5 >= 1.0d) {
                }
                if (this.lLA) {
                }
            }
        }
        float f6 = this.f35718C;
        if (f6 < 1.0f) {
            if (f6 <= 0.0f) {
                int i8 = this.dR0;
                int i9 = this.f35728k;
                z4 = i8 == i9 ? z5 : true;
                this.dR0 = i9;
            }
            this.Lp6 |= z5;
            if (z5 && !this.Zmq) {
                requestLayout();
            }
            this.ofS = this.f35718C;
        }
        int i10 = this.dR0;
        int i11 = this.f35732z;
        z4 = i10 == i11 ? z5 : true;
        this.dR0 = i11;
        z5 = z4;
        this.Lp6 |= z5;
        if (z5) {
            requestLayout();
        }
        this.ofS = this.f35718C;
    }

    public boolean a(int i2, MotionController motionController) {
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            return motionScene.O(i2, motionController);
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void az(View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
        if (this.f35727i || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i5;
            iArr[1] = iArr[1] + i7;
        }
        this.f35727i = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ViewTransitionController viewTransitionController;
        ArrayList arrayList = this.RQ;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).iF(canvas);
            }
        }
        Y(false);
        MotionScene motionScene = this.f35725a;
        if (motionScene != null && (viewTransitionController = motionScene.Ik) != null) {
            viewTransitionController.rl();
        }
        super.dispatchDraw(canvas);
        if (this.f35725a == null) {
            return;
        }
        if ((this.Rl & 1) == 1 && !isInEditMode()) {
            this.f35719F++;
            long nanoTime = getNanoTime();
            long j2 = this.QZ6;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.tFV = ((int) ((this.f35719F / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f35719F = 0;
                    this.QZ6 = nanoTime;
                }
            } else {
                this.QZ6 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.tFV + " fps " + Debug.O(this, this.f35728k) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Debug.O(this, this.f35732z));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i2 = this.dR0;
            sb.append(i2 == -1 ? "undefined" : Debug.O(this, i2));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.Rl > 1) {
            if (this.qm == null) {
                this.qm = new DevModeDraw();
            }
            this.qm.n(canvas, this.eTf, this.f35725a.ty(), this.Rl);
        }
        ArrayList arrayList2 = this.RQ;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((MotionHelper) it2.next()).te(canvas);
            }
        }
    }

    public ConstraintSet eTf(int i2) {
        MotionScene motionScene = this.f35725a;
        if (motionScene == null) {
            return null;
        }
        return motionScene.mUb(i2);
    }

    void fcU() {
        MotionScene motionScene = this.f35725a;
        if (motionScene == null) {
            return;
        }
        if (motionScene.J2(this, this.dR0)) {
            requestLayout();
            return;
        }
        int i2 = this.dR0;
        if (i2 != -1) {
            this.f35725a.nr(this, i2);
        }
        if (this.f35725a.P5()) {
            this.f35725a.U();
        }
    }

    @IdRes
    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.f35725a;
        if (motionScene == null) {
            return null;
        }
        return motionScene.qie();
    }

    public int getCurrentState() {
        return this.dR0;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.f35725a;
        if (motionScene == null) {
            return null;
        }
        return motionScene.az();
    }

    public DesignTool getDesignTool() {
        if (this.GD == null) {
            this.GD = new DesignTool(this);
        }
        return this.GD;
    }

    public int getEndState() {
        return this.f35732z;
    }

    public float getProgress() {
        return this.f35718C;
    }

    public MotionScene getScene() {
        return this.f35725a;
    }

    public int getStartState() {
        return this.f35728k;
    }

    public float getTargetPosition() {
        return this.f35720G7;
    }

    public Bundle getTransitionState() {
        if (this.JVN == null) {
            this.JVN = new StateCache();
        }
        this.JVN.t();
        return this.JVN.rl();
    }

    public long getTransitionTimeMs() {
        if (this.f35725a != null) {
            this.pJg = r0.ty() / 1000.0f;
        }
        return (long) (this.pJg * 1000.0f);
    }

    public float getVelocity() {
        return this.Nxk;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void gh(final View view, int i2, int i3, int[] iArr, int i5) {
        MotionScene.Transition transition;
        TouchResponse touchResponseWPU;
        int iHI;
        MotionScene motionScene = this.f35725a;
        if (motionScene == null || (transition = motionScene.f35775t) == null || !transition.aYN()) {
            return;
        }
        int i7 = -1;
        if (!transition.aYN() || (touchResponseWPU = transition.WPU()) == null || (iHI = touchResponseWPU.HI()) == -1 || view.getId() == iHI) {
            if (motionScene.Z()) {
                TouchResponse touchResponseWPU2 = transition.WPU();
                if (touchResponseWPU2 != null && (touchResponseWPU2.t() & 4) != 0) {
                    i7 = i3;
                }
                float f3 = this.ofS;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i7)) {
                    return;
                }
            }
            if (transition.WPU() != null && (transition.WPU().t() & 1) != 0) {
                float fXQ = motionScene.XQ(i2, i3);
                float f4 = this.f35718C;
                if ((f4 <= 0.0f && fXQ < 0.0f) || (f4 >= 1.0f && fXQ > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                        @Override // java.lang.Runnable
                        public void run() {
                            view.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f5 = this.ofS;
            long nanoTime = getNanoTime();
            float f6 = i2;
            this.f35723K = f6;
            float f7 = i3;
            this.How = f7;
            this.ER = (float) ((nanoTime - this.tUK) * 1.0E-9d);
            this.tUK = nanoTime;
            motionScene.T(f6, f7);
            if (f5 != this.ofS) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            Y(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f35727i = true;
        }
    }

    public void i(int i2, int i3, int i5, int i7) {
        StateSet stateSet;
        int iN;
        MotionScene motionScene = this.f35725a;
        if (motionScene != null && (stateSet = motionScene.rl) != null && (iN = stateSet.n(this.dR0, i2, i3, i5)) != -1) {
            i2 = iN;
        }
        int i8 = this.dR0;
        if (i8 == i2) {
            return;
        }
        if (this.f35728k == i2) {
            D(0.0f);
            if (i7 > 0) {
                this.pJg = i7 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f35732z == i2) {
            D(1.0f);
            if (i7 > 0) {
                this.pJg = i7 / 1000.0f;
                return;
            }
            return;
        }
        this.f35732z = i2;
        if (i8 != -1) {
            Rl(i8, i2);
            D(1.0f);
            this.f35718C = 0.0f;
            HV();
            if (i7 > 0) {
                this.pJg = i7 / 1000.0f;
                return;
            }
            return;
        }
        this.mYa = false;
        this.f35720G7 = 1.0f;
        this.ofS = 0.0f;
        this.f35718C = 0.0f;
        this.Mx = getNanoTime();
        this.xg = getNanoTime();
        this.fcU = false;
        this.f35722I = null;
        if (i7 == -1) {
            this.pJg = this.f35725a.ty() / 1000.0f;
        }
        this.f35728k = -1;
        this.f35725a.Xw(-1, this.f35732z);
        SparseArray sparseArray = new SparseArray();
        if (i7 == 0) {
            this.pJg = this.f35725a.ty() / 1000.0f;
        } else if (i7 > 0) {
            this.pJg = i7 / 1000.0f;
        }
        int childCount = getChildCount();
        this.eTf.clear();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            this.eTf.put(childAt, new MotionController(childAt));
            sparseArray.put(childAt.getId(), (MotionController) this.eTf.get(childAt));
        }
        this.eWT = true;
        this.f35730s.O(this.f35908O, null, this.f35725a.mUb(i2));
        ul();
        this.f35730s.n();
        GR();
        int width = getWidth();
        int height = getHeight();
        if (this.RQ != null) {
            for (int i10 = 0; i10 < childCount; i10++) {
                MotionController motionController = (MotionController) this.eTf.get(getChildAt(i10));
                if (motionController != null) {
                    this.f35725a.Ik(motionController);
                }
            }
            Iterator it = this.RQ.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).fD(this, this.eTf);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                MotionController motionController2 = (MotionController) this.eTf.get(getChildAt(i11));
                if (motionController2 != null) {
                    motionController2.N(width, height, this.pJg, getNanoTime());
                }
            }
        } else {
            for (int i12 = 0; i12 < childCount; i12++) {
                MotionController motionController3 = (MotionController) this.eTf.get(getChildAt(i12));
                if (motionController3 != null) {
                    this.f35725a.Ik(motionController3);
                    motionController3.N(width, height, this.pJg, getNanoTime());
                }
            }
        }
        float fTe = this.f35725a.te();
        if (fTe != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i13 = 0; i13 < childCount; i13++) {
                MotionController motionController4 = (MotionController) this.eTf.get(getChildAt(i13));
                float fHI = motionController4.HI() + motionController4.ty();
                fMin = Math.min(fMin, fHI);
                fMax = Math.max(fMax, fHI);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                MotionController motionController5 = (MotionController) this.eTf.get(getChildAt(i14));
                float fTy = motionController5.ty();
                float fHI2 = motionController5.HI();
                motionController5.HI = 1.0f / (1.0f - fTe);
                motionController5.ty = fTe - ((((fTy + fHI2) - fMin) * fTe) / (fMax - fMin));
            }
        }
        this.ofS = 0.0f;
        this.f35718C = 0.0f;
        this.eWT = true;
        invalidate();
    }

    public void ijL(int i2, boolean z2, float f3) {
        TransitionListener transitionListener = this.ul;
        if (transitionListener != null) {
            transitionListener.nr(this, i2, z2, f3);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.a63;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).nr(this, i2, z2, f3);
            }
        }
    }

    void m(int i2, float f3, float f4, float f5, float[] fArr) {
        String resourceName;
        HashMap map = this.eTf;
        View viewIk = Ik(i2);
        MotionController motionController = (MotionController) map.get(viewIk);
        if (motionController != null) {
            motionController.qie(f3, f4, f5, fArr);
            float y2 = viewIk.getY();
            this.n1 = f3;
            this.Jk = y2;
            return;
        }
        if (viewIk == null) {
            resourceName = "" + i2;
        } else {
            resourceName = viewIk.getContext().getResources().getResourceName(i2);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void mUb(View view, int i2) {
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            float f3 = this.ER;
            if (f3 == 0.0f) {
                return;
            }
            motionScene.N(this.f35723K / f3, this.How / f3);
        }
    }

    public void ofS(View view, float f3, float f4, float[] fArr, int i2) {
        float interpolation;
        float[] fArr2;
        float fN = this.Nxk;
        float f5 = this.f35718C;
        if (this.f35722I != null) {
            float fSignum = Math.signum(this.f35720G7 - f5);
            float interpolation2 = this.f35722I.getInterpolation(this.f35718C + 1.0E-5f);
            interpolation = this.f35722I.getInterpolation(this.f35718C);
            fN = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.pJg;
        } else {
            interpolation = f5;
        }
        Interpolator interpolator = this.f35722I;
        if (interpolator instanceof MotionInterpolator) {
            fN = ((MotionInterpolator) interpolator).n();
        }
        MotionController motionController = (MotionController) this.eTf.get(view);
        if ((i2 & 1) == 0) {
            fArr2 = fArr;
            motionController.r(interpolation, view.getWidth(), view.getHeight(), f3, f4, fArr2);
        } else {
            fArr2 = fArr;
            motionController.qie(interpolation, f3, f4, fArr2);
        }
        if (i2 < 2) {
            fArr2[0] = fArr2[0] * fN;
            fArr2[1] = fArr2[1] * fN;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchResponse touchResponseWPU;
        int iHI;
        RectF rectFTy;
        MotionScene motionScene = this.f35725a;
        if (motionScene != null && this.f35729m) {
            ViewTransitionController viewTransitionController = motionScene.Ik;
            if (viewTransitionController != null) {
                viewTransitionController.J2(motionEvent);
            }
            MotionScene.Transition transition = this.f35725a.f35775t;
            if (transition != null && transition.aYN() && (touchResponseWPU = transition.WPU()) != null && ((motionEvent.getAction() != 0 || (rectFTy = touchResponseWPU.ty(this, new RectF())) == null || rectFTy.contains(motionEvent.getX(), motionEvent.getY())) && (iHI = touchResponseWPU.HI()) != -1)) {
                View view = this.Mh;
                if (view == null || view.getId() != iHI) {
                    this.Mh = findViewById(iHI);
                }
                if (this.Mh != null) {
                    this.g6.set(r0.getLeft(), this.Mh.getTop(), this.Mh.getRight(), this.Mh.getBottom());
                    if (this.g6.contains(motionEvent.getX(), motionEvent.getY()) && !C(this.Mh.getLeft(), this.Mh.getTop(), this.Mh, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f35725a == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        boolean z3 = (this.piY == i2 && this.ijL == i3) ? false : true;
        if (this.Lp6) {
            this.Lp6 = false;
            fcU();
            eWT();
            z3 = true;
        }
        if (this.f35913g) {
            z3 = true;
        }
        this.piY = i2;
        this.ijL = i3;
        int iIF = this.f35725a.iF();
        int iHI = this.f35725a.HI();
        if ((z3 || this.f35730s.J2(iIF, iHI)) && this.f35728k != -1) {
            super.onMeasure(i2, i3);
            this.f35730s.O(this.f35908O, this.f35725a.mUb(iIF), this.f35725a.mUb(iHI));
            this.f35730s.KN();
            this.f35730s.xMQ(iIF, iHI);
        } else {
            if (z3) {
                super.onMeasure(i2, i3);
            }
            z2 = true;
        }
        if (this.Bu || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iJ = this.f35908O.J() + getPaddingLeft() + getPaddingRight();
            int iNY = this.f35908O.nY() + paddingTop;
            int i5 = this.Qu;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                iJ = (int) (this.p0N + (this.UF * (this.f35726f - r8)));
                requestLayout();
            }
            int i7 = this.HBN;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                iNY = (int) (this.Uf + (this.UF * (this.ub - r8)));
                requestLayout();
            }
            setMeasuredDimension(iJ, iNY);
        }
        k();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            motionScene.bzg(Z());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.f35725a;
        if (motionScene == null || !this.f35729m || !motionScene.P5()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition = this.f35725a.f35775t;
        if (transition != null && !transition.aYN()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f35725a.nHg(motionEvent, getCurrentState(), this);
        if (this.f35725a.f35775t.ViF(4)) {
            return this.f35725a.f35775t.WPU().ck();
        }
        return true;
    }

    public MotionScene.Transition pJg(int i2) {
        return this.f35725a.fD(i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.Bu && this.dR0 == -1 && (motionScene = this.f35725a) != null && (transition = motionScene.f35775t) != null) {
            int iXQ = transition.XQ();
            if (iXQ == 0) {
                return;
            }
            if (iXQ == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((MotionController) this.eTf.get(getChildAt(i2))).nY();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i2) {
        this.Rl = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z2) {
        this.n7b = z2;
    }

    public void setInteractionEnabled(boolean z2) {
        this.f35729m = z2;
    }

    public void setInterpolatedProgress(float f3) {
        if (this.f35725a != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolatorCk = this.f35725a.ck();
            if (interpolatorCk != null) {
                setProgress(interpolatorCk.getInterpolation(f3));
                return;
            }
        }
        setProgress(f3);
    }

    public void setOnHide(float f3) {
        ArrayList arrayList = this.f35724W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((MotionHelper) this.f35724W.get(i2)).setProgress(f3);
            }
        }
    }

    public void setOnShow(float f3) {
        ArrayList arrayList = this.kSg;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((MotionHelper) this.kSg.get(i2)).setProgress(f3);
            }
        }
    }

    public void setScene(MotionScene motionScene) {
        this.f35725a = motionScene;
        motionScene.bzg(Z());
        ul();
    }

    void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.dR0 == -1) {
            return;
        }
        TransitionState transitionState3 = this.Aum;
        this.Aum = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            dR0();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                z();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            dR0();
        }
        if (transitionState == transitionState2) {
            z();
        }
    }

    public void setTransitionDuration(int i2) {
        MotionScene motionScene = this.f35725a;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            motionScene.rV9(i2);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.ul = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.JVN == null) {
            this.JVN = new StateCache();
        }
        this.JVN.Uo(bundle);
        if (isAttachedToWindow()) {
            this.JVN.n();
        }
    }

    public void tUK(int i2, View... viewArr) {
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            motionScene.M7(i2, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    public void ul() {
        this.f35730s.KN();
        invalidate();
    }

    MotionController xg(int i2) {
        return (MotionController) this.eTf.get(findViewById(i2));
    }

    protected void z() {
        int iIntValue;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.ul != null || ((copyOnWriteArrayList = this.a63) != null && !copyOnWriteArrayList.isEmpty())) && this.VwL == -1) {
            this.VwL = this.dR0;
            if (this.Toy.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList arrayList = this.Toy;
                iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            }
            int i2 = this.dR0;
            if (iIntValue != i2 && i2 != -1) {
                this.Toy.add(Integer.valueOf(i2));
            }
        }
        eWT();
        Runnable runnable = this.xVH;
        if (runnable != null) {
            runnable.run();
            this.xVH = null;
        }
        int[] iArr = this.EF;
        if (iArr == null || this.uG <= 0) {
            return;
        }
        EWS(iArr[0]);
        int[] iArr2 = this.EF;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.uG--;
    }

    private void GR() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = (MotionController) this.eTf.get(childAt);
            if (motionController != null) {
                motionController.E2(childAt);
            }
        }
    }

    private boolean I(View view, MotionEvent motionEvent, float f3, float f4) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f3, f4);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f3, -f4);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f3, f4);
        if (this.jO == null) {
            this.jO = new Matrix();
        }
        matrix.invert(this.jO);
        motionEventObtain.transform(this.jO);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        float f3;
        float f4;
        int childCount = getChildCount();
        this.f35730s.n();
        boolean z2 = true;
        this.eWT = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            sparseArray.put(childAt.getId(), (MotionController) this.eTf.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iKN = this.f35725a.KN();
        if (iKN != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                MotionController motionController = (MotionController) this.eTf.get(getChildAt(i5));
                if (motionController != null) {
                    motionController.fD(iKN);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.eTf.size()];
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            MotionController motionController2 = (MotionController) this.eTf.get(getChildAt(i8));
            if (motionController2.KN() != -1) {
                sparseBooleanArray.put(motionController2.KN(), true);
                iArr[i7] = motionController2.KN();
                i7++;
            }
        }
        if (this.RQ != null) {
            for (int i9 = 0; i9 < i7; i9++) {
                MotionController motionController3 = (MotionController) this.eTf.get(findViewById(iArr[i9]));
                if (motionController3 != null) {
                    this.f35725a.Ik(motionController3);
                }
            }
            Iterator it = this.RQ.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).fD(this, this.eTf);
            }
            for (int i10 = 0; i10 < i7; i10++) {
                MotionController motionController4 = (MotionController) this.eTf.get(findViewById(iArr[i10]));
                if (motionController4 != null) {
                    motionController4.N(width, height, this.pJg, getNanoTime());
                }
            }
        } else {
            for (int i11 = 0; i11 < i7; i11++) {
                MotionController motionController5 = (MotionController) this.eTf.get(findViewById(iArr[i11]));
                if (motionController5 != null) {
                    this.f35725a.Ik(motionController5);
                    motionController5.N(width, height, this.pJg, getNanoTime());
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            MotionController motionController6 = (MotionController) this.eTf.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.f35725a.Ik(motionController6);
                motionController6.N(width, height, this.pJg, getNanoTime());
            }
        }
        float fTe = this.f35725a.te();
        if (fTe != 0.0f) {
            if (fTe >= 0.0d) {
                z2 = false;
            }
            float fAbs = Math.abs(fTe);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i13 = 0; i13 < childCount; i13++) {
                MotionController motionController7 = (MotionController) this.eTf.get(getChildAt(i13));
                if (!Float.isNaN(motionController7.az)) {
                    for (int i14 = 0; i14 < childCount; i14++) {
                        MotionController motionController8 = (MotionController) this.eTf.get(getChildAt(i14));
                        if (!Float.isNaN(motionController8.az)) {
                            fMin = Math.min(fMin, motionController8.az);
                            fMax = Math.max(fMax, motionController8.az);
                        }
                    }
                    while (i2 < childCount) {
                        MotionController motionController9 = (MotionController) this.eTf.get(getChildAt(i2));
                        if (!Float.isNaN(motionController9.az)) {
                            motionController9.HI = 1.0f / (1.0f - fAbs);
                            if (z2) {
                                motionController9.ty = fAbs - (((fMax - motionController9.az) / (fMax - fMin)) * fAbs);
                            } else {
                                motionController9.ty = fAbs - (((motionController9.az - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i2++;
                    }
                    return;
                }
                float fTy = motionController7.ty();
                float fHI = motionController7.HI();
                if (z2) {
                    f4 = fHI - fTy;
                } else {
                    f4 = fHI + fTy;
                }
                fMin2 = Math.min(fMin2, f4);
                fMax2 = Math.max(fMax2, f4);
            }
            while (i2 < childCount) {
                MotionController motionController10 = (MotionController) this.eTf.get(getChildAt(i2));
                float fTy2 = motionController10.ty();
                float fHI2 = motionController10.HI();
                if (z2) {
                    f3 = fHI2 - fTy2;
                } else {
                    f3 = fHI2 + fTy2;
                }
                motionController10.HI = 1.0f / (1.0f - fAbs);
                motionController10.ty = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i2++;
            }
        }
    }

    public void EWS(int i2) {
        if (!isAttachedToWindow()) {
            if (this.JVN == null) {
                this.JVN = new StateCache();
            }
            this.JVN.nr(i2);
            return;
        }
        UhV(i2, -1, -1);
    }

    protected MotionTracker G7() {
        return MyTracker.J2();
    }

    void Nxk(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            MotionController motionController = (MotionController) this.eTf.get(getChildAt(i2));
            if (motionController != null) {
                motionController.J2(z2);
            }
        }
    }

    public void Rl(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.JVN == null) {
                this.JVN = new StateCache();
            }
            this.JVN.J2(i2);
            this.JVN.nr(i3);
            return;
        }
        MotionScene motionScene = this.f35725a;
        if (motionScene != null) {
            this.f35728k = i2;
            this.f35732z = i3;
            motionScene.Xw(i2, i3);
            this.f35730s.O(this.f35908O, this.f35725a.mUb(i2), this.f35725a.mUb(i3));
            ul();
            this.f35718C = 0.0f;
            Po6();
        }
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public void hRu(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.JVN == null) {
                this.JVN = new StateCache();
            }
            this.JVN.nr(i2);
            return;
        }
        i(i2, -1, -1, i3);
    }

    public void n1(float f3, float f4) {
        if (!isAttachedToWindow()) {
            if (this.JVN == null) {
                this.JVN = new StateCache();
            }
            this.JVN.O(f3);
            this.JVN.KN(f4);
            return;
        }
        setProgress(f3);
        setState(TransitionState.MOVING);
        this.Nxk = f4;
        float f5 = 0.0f;
        if (f4 != 0.0f) {
            if (f4 > 0.0f) {
                f5 = 1.0f;
            }
            D(f5);
        } else if (f3 != 0.0f && f3 != 1.0f) {
            if (f3 > 0.5f) {
                f5 = 1.0f;
            }
            D(f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.v0j = display.getRotation();
        }
        MotionScene motionScene = this.f35725a;
        if (motionScene != null && (i2 = this.dR0) != -1) {
            ConstraintSet constraintSetMUb = motionScene.mUb(i2);
            this.f35725a.wTp(this);
            ArrayList arrayList = this.RQ;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).g(this);
                }
            }
            if (constraintSetMUb != null) {
                constraintSetMUb.xMQ(this);
            }
            this.f35728k = this.dR0;
        }
        fcU();
        StateCache stateCache = this.JVN;
        if (stateCache != null) {
            if (this.n7b) {
                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MotionLayout.this.JVN.n();
                    }
                });
                return;
            } else {
                stateCache.n();
                return;
            }
        }
        MotionScene motionScene2 = this.f35725a;
        if (motionScene2 != null && (transition = motionScene2.f35775t) != null && transition.o() == 4) {
            HV();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.a63 == null) {
                this.a63 = new CopyOnWriteArrayList();
            }
            this.a63.add(motionHelper);
            if (motionHelper.nY()) {
                if (this.kSg == null) {
                    this.kSg = new ArrayList();
                }
                this.kSg.add(motionHelper);
            }
            if (motionHelper.ViF()) {
                if (this.f35724W == null) {
                    this.f35724W = new ArrayList();
                }
                this.f35724W.add(motionHelper);
            }
            if (motionHelper.aYN()) {
                if (this.RQ == null) {
                    this.RQ = new ArrayList();
                }
                this.RQ.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.kSg;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f35724W;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.JVN == null) {
                this.JVN = new StateCache();
            }
            this.JVN.J2(i2);
            this.JVN.nr(i2);
            return;
        }
        this.dR0 = i2;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.t(context, this.f35728k) + "->" + Debug.t(context, this.f35732z) + " (pos:" + this.f35718C + " Dpos/Dt:" + this.Nxk;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void xMQ(View view, View view2, int i2, int i3) {
        this.tUK = getNanoTime();
        this.ER = 0.0f;
        this.f35723K = 0.0f;
        this.How = 0.0f;
    }

    protected void setTransition(MotionScene.Transition transition) {
        this.f35725a.jB(transition);
        setState(TransitionState.SETUP);
        if (this.dR0 == this.f35725a.HI()) {
            this.f35718C = 1.0f;
            this.ofS = 1.0f;
            this.f35720G7 = 1.0f;
        } else {
            this.f35718C = 0.0f;
            this.ofS = 0.0f;
            this.f35720G7 = 0.0f;
        }
        this.Mx = transition.ViF(1) ? -1L : getNanoTime();
        int iIF = this.f35725a.iF();
        int iHI = this.f35725a.HI();
        if (iIF == this.f35728k && iHI == this.f35732z) {
            return;
        }
        this.f35728k = iIF;
        this.f35732z = iHI;
        this.f35725a.Xw(iIF, iHI);
        this.f35730s.O(this.f35908O, this.f35725a.mUb(this.f35728k), this.f35725a.mUb(this.f35732z));
        this.f35730s.xMQ(this.f35728k, this.f35732z);
        this.f35730s.KN();
        ul();
    }
}
