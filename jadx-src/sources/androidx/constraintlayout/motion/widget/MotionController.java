package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MotionController {
    private KeyTrigger[] E2;
    float Ik;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f35701N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    String f35702O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int[] f35703S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f35704T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f35705X;
    private String[] XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private double[] f35706Z;
    float ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35707e;
    private HashMap fD;
    private CurveFit[] gh;
    private HashMap iF;
    private float nHg;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double[] f35710o;
    private CurveFit qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f35711r;
    View rl;
    private Interpolator s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35712t;
    private HashMap te;
    private boolean wTp;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Rect f35709n = new Rect();
    boolean nr = false;
    private int J2 = -1;
    private MotionPaths Uo = new MotionPaths();
    private MotionPaths KN = new MotionPaths();
    private MotionConstrainedPoint xMQ = new MotionConstrainedPoint();
    private MotionConstrainedPoint mUb = new MotionConstrainedPoint();
    float az = Float.NaN;
    float ty = 0.0f;
    float HI = 1.0f;
    private int WPU = 4;
    private float[] aYN = new float[4];
    private ArrayList ViF = new ArrayList();
    private float[] nY = new float[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f35708g = new ArrayList();

    private float Uo(float f3, float[] fArr) {
        float f4 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f5 = this.HI;
            if (f5 != 1.0d) {
                float f6 = this.ty;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f5, 1.0f);
                }
            }
        }
        Easing easing = this.Uo.f35766n;
        float f7 = Float.NaN;
        for (MotionPaths motionPaths : this.ViF) {
            Easing easing2 = motionPaths.f35766n;
            if (easing2 != null) {
                float f8 = motionPaths.f35758O;
                if (f8 < f3) {
                    easing = easing2;
                    f4 = f8;
                } else if (Float.isNaN(f7)) {
                    f7 = motionPaths.f35758O;
                }
            }
        }
        if (easing != null) {
            float f9 = (Float.isNaN(f7) ? 1.0f : f7) - f4;
            double d2 = (f3 - f4) / f9;
            f3 = (((float) easing.n(d2)) * f9) + f4;
            if (fArr != null) {
                fArr[0] = (float) easing.rl(d2);
            }
        }
        return f3;
    }

    private static Interpolator ck(Context context, int i2, String str, int i3) {
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(context, i3);
        }
        if (i2 == -1) {
            final Easing easingT = Easing.t(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f3) {
                    return (float) easingT.n(f3);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    void O(float f3, float[] fArr, int i2) {
        this.gh[0].nr(Uo(f3, null), this.f35710o);
        this.Uo.gh(this.f35711r, this.f35710o, fArr, i2);
    }

    void g(Rect rect, Rect rect2, int i2, int i3, int i5) {
        if (i2 == 1) {
            int i7 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i5 - ((i7 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i2 == 2) {
            int i8 = rect.left + rect.right;
            rect2.left = i3 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i8 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i2 == 3) {
            int i9 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i9 / 2);
            rect2.top = i5 - ((i9 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i2 != 4) {
            return;
        }
        int i10 = rect.left + rect.right;
        rect2.left = i3 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i10 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public void nY() {
        this.nr = true;
    }

    int t(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrKN = this.gh[0].KN();
        if (iArr != null) {
            Iterator it = this.ViF.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = ((MotionPaths) it.next()).Xw;
                i2++;
            }
        }
        int i3 = 0;
        for (int i5 = 0; i5 < dArrKN.length; i5++) {
            this.gh[0].nr(dArrKN[i5], this.f35710o);
            this.Uo.Uo(dArrKN[i5], this.f35711r, this.f35710o, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void xMQ(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.gh[0].nr(d2, dArr);
        this.gh[0].Uo(d2, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.Uo.KN(d2, this.f35711r, dArr, fArr, dArr2, fArr2);
    }

    private void ViF(MotionPaths motionPaths) {
        motionPaths.r((int) this.rl.getX(), (int) this.rl.getY(), this.rl.getWidth(), this.rl.getHeight());
    }

    private void WPU(MotionPaths motionPaths) {
        if (Collections.binarySearch(this.ViF, motionPaths) == 0) {
            Log.e("MotionController", " KeyPath position \"" + motionPaths.J2 + "\" outside of range");
        }
        this.ViF.add((-r0) - 1, motionPaths);
    }

    private float o() {
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d2 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        float fHypot = 0.0f;
        while (i2 < 100) {
            float f4 = i2 * f3;
            double dN = f4;
            Easing easing = this.Uo.f35766n;
            float f5 = Float.NaN;
            float f6 = 0.0f;
            for (MotionPaths motionPaths : this.ViF) {
                Easing easing2 = motionPaths.f35766n;
                if (easing2 != null) {
                    float f7 = motionPaths.f35758O;
                    if (f7 < f4) {
                        easing = easing2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = motionPaths.f35758O;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                dN = (((float) easing.n((f4 - f6) / r17)) * (f5 - f6)) + f6;
            }
            double d5 = dN;
            this.gh[0].nr(d5, this.f35710o);
            int i3 = i2;
            this.Uo.Uo(d5, this.f35711r, this.f35710o, fArr, 0);
            if (i3 > 0) {
                fHypot += (float) Math.hypot(d4 - ((double) fArr[1]), d2 - ((double) fArr[0]));
            }
            d2 = fArr[0];
            d4 = fArr[1];
            i2 = i3 + 1;
        }
        return fHypot;
    }

    void E2(View view) {
        MotionPaths motionPaths = this.Uo;
        motionPaths.f35758O = 0.0f;
        motionPaths.J2 = 0.0f;
        motionPaths.r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.xMQ.gh(view);
    }

    public float HI() {
        return this.KN.f35767o;
    }

    MotionPaths Ik(int i2) {
        return (MotionPaths) this.ViF.get(i2);
    }

    void J2(boolean z2) {
        if (!"button".equals(Debug.nr(this.rl)) || this.E2 == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.E2;
            if (i2 >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i2].qie(z2 ? -100.0f : 100.0f, this.rl);
            i2++;
        }
    }

    public int KN() {
        return this.Uo.f35762X;
    }

    public void N(int i2, int i3, float f3, long j2) {
        ArrayList arrayList;
        String[] strArr;
        MotionPaths[] motionPathsArr;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleKN;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        ViewSpline viewSplineMUb;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        HashSet<String> hashSet3 = new HashSet();
        HashMap map = new HashMap();
        int i5 = this.f35707e;
        if (i5 != Key.J2) {
            this.Uo.f35764e = i5;
        }
        this.xMQ.Uo(this.mUb, hashSet2);
        ArrayList<Key> arrayList2 = this.f35708g;
        if (arrayList2 != null) {
            arrayList = null;
            for (Key key : arrayList2) {
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    WPU(new MotionPaths(i2, i3, keyPosition, this.Uo, this.KN));
                    int i7 = keyPosition.Uo;
                    if (i7 != Key.J2) {
                        this.J2 = i7;
                    }
                } else if (key instanceof KeyCycle) {
                    key.nr(hashSet3);
                } else if (key instanceof KeyTimeCycle) {
                    key.nr(hashSet);
                } else if (key instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key);
                } else {
                    key.Uo(map);
                    key.nr(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i8 = 0;
        if (arrayList != null) {
            this.E2 = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c2 = 1;
        if (!hashSet2.isEmpty()) {
            this.iF = new HashMap();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (Key key2 : this.f35708g) {
                        HashMap map2 = key2.f35651O;
                        if (map2 != null && (constraintAttribute3 = (ConstraintAttribute) map2.get(str2)) != null) {
                            sparseArray.append(key2.f35652n, constraintAttribute3);
                        }
                    }
                    viewSplineMUb = ViewSpline.xMQ(str, sparseArray);
                } else {
                    viewSplineMUb = ViewSpline.mUb(str);
                }
                if (viewSplineMUb != null) {
                    viewSplineMUb.Uo(str);
                    this.iF.put(str, viewSplineMUb);
                }
            }
            ArrayList<Key> arrayList3 = this.f35708g;
            if (arrayList3 != null) {
                for (Key key3 : arrayList3) {
                    if (key3 instanceof KeyAttributes) {
                        key3.n(this.iF);
                    }
                }
            }
            this.xMQ.n(this.iF, 0);
            this.mUb.n(this.iF, 100);
            for (String str3 : this.iF.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = (Integer) map.get(str3)) == null) ? 0 : num.intValue();
                SplineSet splineSet = (SplineSet) this.iF.get(str3);
                if (splineSet != null) {
                    splineSet.KN(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.te == null) {
                this.te = new HashMap();
            }
            for (String str4 : hashSet) {
                if (!this.te.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (Key key4 : this.f35708g) {
                            HashMap map3 = key4.f35651O;
                            if (map3 != null && (constraintAttribute2 = (ConstraintAttribute) map3.get(str5)) != null) {
                                sparseArray2.append(key4.f35652n, constraintAttribute2);
                            }
                        }
                        viewTimeCycleKN = ViewTimeCycle.Uo(str4, sparseArray2);
                    } else {
                        viewTimeCycleKN = ViewTimeCycle.KN(str4, j2);
                    }
                    if (viewTimeCycleKN != null) {
                        viewTimeCycleKN.nr(str4);
                        this.te.put(str4, viewTimeCycleKN);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.f35708g;
            if (arrayList4 != null) {
                for (Key key5 : arrayList4) {
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).qie(this.te);
                    }
                }
            }
            for (String str6 : this.te.keySet()) {
                ((ViewTimeCycle) this.te.get(str6)).O(map.containsKey(str6) ? ((Integer) map.get(str6)).intValue() : 0);
            }
        }
        int size = this.ViF.size();
        int i9 = size + 2;
        MotionPaths[] motionPathsArr2 = new MotionPaths[i9];
        motionPathsArr2[0] = this.Uo;
        motionPathsArr2[size + 1] = this.KN;
        if (this.ViF.size() > 0 && this.J2 == -1) {
            this.J2 = 0;
        }
        Iterator it = this.ViF.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            motionPathsArr2[i10] = (MotionPaths) it.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.KN.f35770v.keySet()) {
            if (this.Uo.f35770v.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.XQ = strArr2;
        this.f35703S = new int[strArr2.length];
        int i11 = 0;
        while (true) {
            strArr = this.XQ;
            if (i11 >= strArr.length) {
                break;
            }
            String str8 = strArr[i11];
            this.f35703S[i11] = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= i9) {
                    break;
                }
                if (motionPathsArr2[i12].f35770v.containsKey(str8) && (constraintAttribute = (ConstraintAttribute) motionPathsArr2[i12].f35770v.get(str8)) != null) {
                    int[] iArr = this.f35703S;
                    iArr[i11] = iArr[i11] + constraintAttribute.KN();
                    break;
                }
                i12++;
            }
            i11++;
        }
        boolean z2 = motionPathsArr2[0].f35764e != Key.J2;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 1; i13 < i9; i13++) {
            motionPathsArr2[i13].nr(motionPathsArr2[i13 - 1], zArr, this.XQ, z2);
        }
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                i14++;
            }
        }
        this.f35711r = new int[i14];
        int i16 = 2;
        int iMax = Math.max(2, i14);
        this.f35710o = new double[iMax];
        this.f35706Z = new double[iMax];
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                this.f35711r[i17] = i18;
                i17++;
            }
        }
        int[] iArr2 = {i9, this.f35711r.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i9];
        for (int i19 = 0; i19 < i9; i19++) {
            motionPathsArr2[i19].J2(dArr[i19], this.f35711r);
            dArr2[i19] = motionPathsArr2[i19].f35758O;
        }
        int i20 = 0;
        while (true) {
            int[] iArr3 = this.f35711r;
            if (i20 >= iArr3.length) {
                break;
            }
            if (iArr3[i20] < MotionPaths.M7.length) {
                String str9 = MotionPaths.M7[this.f35711r[i20]] + " [";
                for (int i21 = 0; i21 < i9; i21++) {
                    str9 = str9 + dArr[i21][i20];
                }
            }
            i20++;
        }
        this.gh = new CurveFit[this.XQ.length + 1];
        int i22 = 0;
        while (true) {
            String[] strArr3 = this.XQ;
            if (i22 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i22];
            int i23 = i8;
            int i24 = i23;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i23 < i9) {
                char c4 = c2;
                if (motionPathsArr2[i23].qie(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i9];
                        int[] iArr4 = new int[i16];
                        iArr4[c4] = motionPathsArr2[i23].mUb(str10);
                        iArr4[i8] = i9;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    }
                    MotionPaths motionPaths = motionPathsArr2[i23];
                    motionPathsArr = motionPathsArr2;
                    dArr3[i24] = motionPaths.f35758O;
                    motionPaths.xMQ(str10, dArr4[i24], 0);
                    i24++;
                } else {
                    motionPathsArr = motionPathsArr2;
                }
                i23++;
                c2 = c4;
                motionPathsArr2 = motionPathsArr;
                i16 = 2;
                i8 = 0;
            }
            i22++;
            this.gh[i22] = CurveFit.n(this.J2, Arrays.copyOf(dArr3, i24), (double[][]) Arrays.copyOf(dArr4, i24));
            c2 = c2;
            motionPathsArr2 = motionPathsArr2;
            i16 = 2;
            i8 = 0;
        }
        MotionPaths[] motionPathsArr3 = motionPathsArr2;
        char c5 = c2;
        this.gh[0] = CurveFit.n(this.J2, dArr2, dArr);
        if (motionPathsArr3[0].f35764e != Key.J2) {
            int[] iArr5 = new int[i9];
            double[] dArr5 = new double[i9];
            int[] iArr6 = new int[2];
            iArr6[c5] = 2;
            iArr6[0] = i9;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i25 = 0; i25 < i9; i25++) {
                iArr5[i25] = motionPathsArr3[i25].f35764e;
                dArr5[i25] = r7.f35758O;
                double[] dArr7 = dArr6[i25];
                dArr7[0] = r7.f35768r;
                dArr7[c5] = r7.f35767o;
            }
            this.qie = CurveFit.rl(iArr5, dArr5, dArr6);
        }
        this.fD = new HashMap();
        if (this.f35708g != null) {
            float fO = Float.NaN;
            for (String str11 : hashSet3) {
                ViewOscillator viewOscillatorGh = ViewOscillator.gh(str11);
                if (viewOscillatorGh != null) {
                    if (viewOscillatorGh.mUb() && Float.isNaN(fO)) {
                        fO = o();
                    }
                    viewOscillatorGh.KN(str11);
                    this.fD.put(str11, viewOscillatorGh);
                }
            }
            for (Key key6 : this.f35708g) {
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).qie(this.fD);
                }
            }
            Iterator it2 = this.fD.values().iterator();
            while (it2.hasNext()) {
                ((ViewOscillator) it2.next()).xMQ(fO);
            }
        }
    }

    public View S() {
        return this.rl;
    }

    public void T(View view) {
        this.rl = view;
        this.f35712t = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f35702O = ((ConstraintLayout.LayoutParams) layoutParams).n();
        }
    }

    public void X(ViewState viewState, View view, int i2, int i3, int i5) {
        MotionPaths motionPaths = this.Uo;
        motionPaths.f35758O = 0.0f;
        motionPaths.J2 = 0.0f;
        Rect rect = new Rect();
        if (i2 == 1) {
            int i7 = viewState.rl + viewState.nr;
            rect.left = ((viewState.f35647t + viewState.f35645O) - viewState.rl()) / 2;
            rect.top = i3 - ((i7 + viewState.n()) / 2);
            rect.right = rect.left + viewState.rl();
            rect.bottom = rect.top + viewState.n();
        } else if (i2 == 2) {
            int i8 = viewState.rl + viewState.nr;
            rect.left = i5 - (((viewState.f35647t + viewState.f35645O) + viewState.rl()) / 2);
            rect.top = (i8 - viewState.n()) / 2;
            rect.right = rect.left + viewState.rl();
            rect.bottom = rect.top + viewState.n();
        }
        this.Uo.r(rect.left, rect.top, rect.width(), rect.height());
        this.xMQ.xMQ(rect, view, i2, viewState.f35646n);
    }

    public float XQ() {
        return this.Uo.f35767o;
    }

    public float Z() {
        return this.Uo.f35768r;
    }

    boolean aYN(View view, float f3, long j2, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean zMUb;
        View view2;
        View view3;
        float f4;
        float f5;
        double d2;
        View view4 = view;
        float fUo = Uo(f3, null);
        int i2 = this.f35701N;
        if (i2 != Key.J2) {
            float f6 = 1.0f / i2;
            float fFloor = ((float) Math.floor(fUo / f6)) * f6;
            float f7 = (fUo % f6) / f6;
            if (!Float.isNaN(this.nHg)) {
                f7 = (f7 + this.nHg) % 1.0f;
            }
            Interpolator interpolator = this.s7N;
            fUo = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + fFloor;
        }
        HashMap map = this.iF;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ViewSpline) it.next()).gh(view4, fUo);
            }
        }
        HashMap map2 = this.te;
        if (map2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean zXMQ = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    zXMQ |= viewTimeCycle.xMQ(view4, fUo, j2, keyCache);
                    view4 = view;
                }
            }
            zMUb = zXMQ;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            zMUb = false;
        }
        CurveFit[] curveFitArr = this.gh;
        if (curveFitArr != null) {
            double d4 = fUo;
            curveFitArr[0].nr(d4, this.f35710o);
            this.gh[0].Uo(d4, this.f35706Z);
            CurveFit curveFit = this.qie;
            if (curveFit != null) {
                double[] dArr = this.f35710o;
                if (dArr.length > 0) {
                    curveFit.nr(d4, dArr);
                    this.qie.Uo(d4, this.f35706Z);
                }
            }
            if (this.wTp) {
                view3 = view;
                f4 = 1.0f;
                f5 = 0.0f;
                d2 = d4;
            } else {
                float f8 = fUo;
                f4 = 1.0f;
                d2 = d4;
                f5 = 0.0f;
                this.Uo.Z(f8, view, this.f35711r, this.f35710o, this.f35706Z, null, this.nr);
                fUo = f8;
                view3 = view;
                this.nr = false;
            }
            if (this.f35705X != Key.J2) {
                if (this.f35704T == null) {
                    this.f35704T = ((View) view3.getParent()).findViewById(this.f35705X);
                }
                if (this.f35704T != null) {
                    float top = (r1.getTop() + this.f35704T.getBottom()) / 2.0f;
                    float left = (this.f35704T.getLeft() + this.f35704T.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top - view3.getTop());
                    }
                }
            }
            HashMap map3 = this.iF;
            if (map3 != null) {
                for (SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.f35706Z;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) splineSet).qie(view3, fUo, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.f35706Z;
                view2 = view;
                float f9 = fUo;
                fUo = f9;
                zMUb |= pathRotate.mUb(view2, keyCache, f9, j2, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i3 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.gh;
                if (i3 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i3].O(d2, this.aYN);
                CustomSupport.rl((ConstraintAttribute) this.Uo.f35770v.get(this.XQ[i3 - 1]), view2, this.aYN);
                i3++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.xMQ;
            if (motionConstrainedPoint.f35699t == 0) {
                if (fUo <= f5) {
                    view2.setVisibility(motionConstrainedPoint.f35687O);
                } else if (fUo >= f4) {
                    view2.setVisibility(this.mUb.f35687O);
                } else if (this.mUb.f35687O != motionConstrainedPoint.f35687O) {
                    view2.setVisibility(0);
                }
            }
            if (this.E2 != null) {
                int i5 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.E2;
                    if (i5 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i5].qie(fUo, view2);
                    i5++;
                }
            }
        } else {
            view2 = view;
            MotionPaths motionPaths = this.Uo;
            float f10 = motionPaths.f35768r;
            MotionPaths motionPaths2 = this.KN;
            float f11 = f10 + ((motionPaths2.f35768r - f10) * fUo);
            float f12 = motionPaths.f35767o;
            float f13 = f12 + ((motionPaths2.f35767o - f12) * fUo);
            float f14 = motionPaths.f35763Z;
            float f15 = motionPaths2.f35763Z;
            float f16 = motionPaths.f35759S;
            float f17 = motionPaths2.f35759S;
            float f18 = f11 + 0.5f;
            int i7 = (int) f18;
            float f19 = f13 + 0.5f;
            int i8 = (int) f19;
            int i9 = (int) (f18 + ((f15 - f14) * fUo) + f14);
            int i10 = (int) (f19 + ((f17 - f16) * fUo) + f16);
            int i11 = i9 - i7;
            int i12 = i10 - i8;
            if (f15 != f14 || f17 != f16 || this.nr) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                this.nr = false;
            }
            view2.layout(i7, i8, i9, i10);
        }
        HashMap map4 = this.fD;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.f35706Z;
                    ((ViewOscillator.PathRotateSet) viewOscillator).az(view2, fUo, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.qie(view2, fUo);
                }
            }
        }
        return zMUb;
    }

    public int az() {
        int iMax = this.Uo.f35769t;
        Iterator it = this.ViF.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((MotionPaths) it.next()).f35769t);
        }
        return Math.max(iMax, this.KN.f35769t);
    }

    void e(Rect rect, ConstraintSet constraintSet, int i2, int i3) {
        MotionController motionController;
        Rect rect2;
        int i5 = constraintSet.nr;
        if (i5 != 0) {
            motionController = this;
            rect2 = rect;
            motionController.g(rect2, this.f35709n, i5, i2, i3);
        } else {
            motionController = this;
            rect2 = rect;
        }
        MotionPaths motionPaths = motionController.Uo;
        motionPaths.f35758O = 0.0f;
        motionPaths.J2 = 0.0f;
        ViF(motionPaths);
        motionController.Uo.r(rect2.left, rect2.top, rect2.width(), rect2.height());
        ConstraintSet.Constraint constraintWPU = constraintSet.WPU(motionController.f35712t);
        motionController.Uo.n(constraintWPU);
        motionController.az = constraintWPU.nr.Uo;
        motionController.xMQ.mUb(rect2, constraintSet, i5, motionController.f35712t);
        motionController.f35705X = constraintWPU.J2.xMQ;
        ConstraintSet.Motion motion = constraintWPU.nr;
        motionController.f35701N = motion.gh;
        motionController.nHg = motion.mUb;
        Context context = motionController.rl.getContext();
        ConstraintSet.Motion motion2 = constraintWPU.nr;
        motionController.s7N = ck(context, motion2.az, motion2.qie, motion2.ty);
    }

    public void fD(int i2) {
        this.f35707e = i2;
    }

    public float gh() {
        return this.Ik;
    }

    void iF(Rect rect, ConstraintSet constraintSet, int i2, int i3) {
        MotionController motionController;
        int i5 = constraintSet.nr;
        if (i5 != 0) {
            motionController = this;
            motionController.g(rect, this.f35709n, i5, i2, i3);
            rect = motionController.f35709n;
        } else {
            motionController = this;
        }
        MotionPaths motionPaths = motionController.KN;
        motionPaths.f35758O = 1.0f;
        motionPaths.J2 = 1.0f;
        ViF(motionPaths);
        motionController.KN.r(rect.left, rect.top, rect.width(), rect.height());
        motionController.KN.n(constraintSet.WPU(motionController.f35712t));
        motionController.mUb.mUb(rect, constraintSet, i5, motionController.f35712t);
    }

    public float mUb() {
        return this.ck;
    }

    public void n(Key key) {
        this.f35708g.add(key);
    }

    public void nHg(MotionController motionController) {
        this.Uo.XQ(motionController, motionController.Uo);
        this.KN.XQ(motionController, motionController.KN);
    }

    void nr(float[] fArr, int i2) {
        int i3 = i2;
        float f3 = 1.0f;
        float f4 = 1.0f / (i3 - 1);
        HashMap map = this.iF;
        SplineSet splineSet = map == null ? null : (SplineSet) map.get("translationX");
        HashMap map2 = this.iF;
        SplineSet splineSet2 = map2 == null ? null : (SplineSet) map2.get("translationY");
        HashMap map3 = this.fD;
        ViewOscillator viewOscillator = map3 == null ? null : (ViewOscillator) map3.get("translationX");
        HashMap map4 = this.fD;
        ViewOscillator viewOscillator2 = map4 != null ? (ViewOscillator) map4.get("translationY") : null;
        int i5 = 0;
        while (i5 < i3) {
            float fMin = i5 * f4;
            float f5 = this.HI;
            float f6 = 0.0f;
            if (f5 != f3) {
                float f7 = this.ty;
                if (fMin < f7) {
                    fMin = 0.0f;
                }
                if (fMin > f7 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f7) * f5, f3);
                }
            }
            double dN = fMin;
            Easing easing = this.Uo.f35766n;
            float f8 = Float.NaN;
            for (MotionPaths motionPaths : this.ViF) {
                Easing easing2 = motionPaths.f35766n;
                if (easing2 != null) {
                    float f9 = motionPaths.f35758O;
                    if (f9 < fMin) {
                        f6 = f9;
                        easing = easing2;
                    } else if (Float.isNaN(f8)) {
                        f8 = motionPaths.f35758O;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                dN = (((float) easing.n((fMin - f6) / r16)) * (f8 - f6)) + f6;
            }
            this.gh[0].nr(dN, this.f35710o);
            CurveFit curveFit = this.qie;
            if (curveFit != null) {
                double[] dArr = this.f35710o;
                if (dArr.length > 0) {
                    curveFit.nr(dN, dArr);
                }
            }
            int i7 = i5 * 2;
            this.Uo.Uo(dN, this.f35711r, this.f35710o, fArr, i7);
            if (viewOscillator != null) {
                fArr[i7] = fArr[i7] + viewOscillator.n(fMin);
            } else if (splineSet != null) {
                fArr[i7] = fArr[i7] + splineSet.n(fMin);
            }
            if (viewOscillator2 != null) {
                int i8 = i7 + 1;
                fArr[i8] = fArr[i8] + viewOscillator2.n(fMin);
            } else if (splineSet2 != null) {
                int i9 = i7 + 1;
                fArr[i9] = fArr[i9] + splineSet2.n(fMin);
            }
            i5++;
            i3 = i2;
            f3 = 1.0f;
        }
    }

    void qie(float f3, float f4, float f5, float[] fArr) {
        double[] dArr;
        float fUo = Uo(f3, this.nY);
        CurveFit[] curveFitArr = this.gh;
        int i2 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.KN;
            float f6 = motionPaths.f35768r;
            MotionPaths motionPaths2 = this.Uo;
            float f7 = f6 - motionPaths2.f35768r;
            float f8 = motionPaths.f35767o - motionPaths2.f35767o;
            float f9 = (motionPaths.f35763Z - motionPaths2.f35763Z) + f7;
            float f10 = (motionPaths.f35759S - motionPaths2.f35759S) + f8;
            fArr[0] = (f7 * (1.0f - f4)) + (f9 * f4);
            fArr[1] = (f8 * (1.0f - f5)) + (f10 * f5);
            return;
        }
        double d2 = fUo;
        curveFitArr[0].Uo(d2, this.f35706Z);
        this.gh[0].nr(d2, this.f35710o);
        float f11 = this.nY[0];
        while (true) {
            dArr = this.f35706Z;
            if (i2 >= dArr.length) {
                break;
            }
            dArr[i2] = dArr[i2] * ((double) f11);
            i2++;
        }
        CurveFit curveFit = this.qie;
        if (curveFit == null) {
            this.Uo.o(f4, f5, fArr, this.f35711r, dArr, this.f35710o);
            return;
        }
        double[] dArr2 = this.f35710o;
        if (dArr2.length > 0) {
            curveFit.nr(d2, dArr2);
            this.qie.Uo(d2, this.f35706Z);
            this.Uo.o(f4, f5, fArr, this.f35711r, this.f35706Z, this.f35710o);
        }
    }

    void r(float f3, int i2, int i3, float f4, float f5, float[] fArr) {
        float fUo = Uo(f3, this.nY);
        HashMap map = this.iF;
        SplineSet splineSet = map == null ? null : (SplineSet) map.get("translationX");
        HashMap map2 = this.iF;
        SplineSet splineSet2 = map2 == null ? null : (SplineSet) map2.get("translationY");
        HashMap map3 = this.iF;
        SplineSet splineSet3 = map3 == null ? null : (SplineSet) map3.get("rotation");
        HashMap map4 = this.iF;
        SplineSet splineSet4 = map4 == null ? null : (SplineSet) map4.get("scaleX");
        HashMap map5 = this.iF;
        SplineSet splineSet5 = map5 == null ? null : (SplineSet) map5.get("scaleY");
        HashMap map6 = this.fD;
        ViewOscillator viewOscillator = map6 == null ? null : (ViewOscillator) map6.get("translationX");
        HashMap map7 = this.fD;
        ViewOscillator viewOscillator2 = map7 == null ? null : (ViewOscillator) map7.get("translationY");
        HashMap map8 = this.fD;
        ViewOscillator viewOscillator3 = map8 == null ? null : (ViewOscillator) map8.get("rotation");
        HashMap map9 = this.fD;
        ViewOscillator viewOscillator4 = map9 == null ? null : (ViewOscillator) map9.get("scaleX");
        HashMap map10 = this.fD;
        ViewOscillator viewOscillator5 = map10 != null ? (ViewOscillator) map10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.rl();
        velocityMatrix.nr(splineSet3, fUo);
        velocityMatrix.KN(splineSet, splineSet2, fUo);
        velocityMatrix.J2(splineSet4, splineSet5, fUo);
        velocityMatrix.t(viewOscillator3, fUo);
        velocityMatrix.Uo(viewOscillator, viewOscillator2, fUo);
        velocityMatrix.O(viewOscillator4, viewOscillator5, fUo);
        CurveFit curveFit = this.qie;
        if (curveFit != null) {
            double[] dArr = this.f35710o;
            if (dArr.length > 0) {
                double d2 = fUo;
                curveFit.nr(d2, dArr);
                this.qie.Uo(d2, this.f35706Z);
                this.Uo.o(f4, f5, fArr, this.f35711r, this.f35706Z, this.f35710o);
            }
            velocityMatrix.n(f4, f5, i2, i3, fArr);
            return;
        }
        int i5 = 0;
        if (this.gh == null) {
            MotionPaths motionPaths = this.KN;
            float f6 = motionPaths.f35768r;
            MotionPaths motionPaths2 = this.Uo;
            float f7 = f6 - motionPaths2.f35768r;
            float f8 = motionPaths.f35767o - motionPaths2.f35767o;
            float f9 = (motionPaths.f35763Z - motionPaths2.f35763Z) + f7;
            float f10 = f8 + (motionPaths.f35759S - motionPaths2.f35759S);
            fArr[0] = (f7 * (1.0f - f4)) + (f9 * f4);
            fArr[1] = (f8 * (1.0f - f5)) + (f10 * f5);
            velocityMatrix.rl();
            velocityMatrix.nr(splineSet3, fUo);
            velocityMatrix.KN(splineSet, splineSet2, fUo);
            velocityMatrix.J2(splineSet4, splineSet5, fUo);
            velocityMatrix.t(viewOscillator3, fUo);
            velocityMatrix.Uo(viewOscillator, viewOscillator2, fUo);
            velocityMatrix.O(viewOscillator4, viewOscillator5, fUo);
            velocityMatrix.n(f4, f5, i2, i3, fArr);
            return;
        }
        double dUo = Uo(fUo, this.nY);
        this.gh[0].Uo(dUo, this.f35706Z);
        this.gh[0].nr(dUo, this.f35710o);
        float f11 = this.nY[0];
        while (true) {
            double[] dArr2 = this.f35706Z;
            if (i5 >= dArr2.length) {
                this.Uo.o(f4, f5, fArr, this.f35711r, dArr2, this.f35710o);
                velocityMatrix.n(f4, f5, i2, i3, fArr);
                return;
            } else {
                dArr2[i5] = dArr2[i5] * ((double) f11);
                i5++;
            }
        }
    }

    void rl(ArrayList arrayList) {
        this.f35708g.addAll(arrayList);
    }

    void te(View view) {
        MotionPaths motionPaths = this.Uo;
        motionPaths.f35758O = 0.0f;
        motionPaths.J2 = 0.0f;
        this.wTp = true;
        motionPaths.r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.KN.r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.xMQ.gh(view);
        this.mUb.gh(view);
    }

    public String toString() {
        return " start: x: " + this.Uo.f35768r + " y: " + this.Uo.f35767o + " end: x: " + this.KN.f35768r + " y: " + this.KN.f35767o;
    }

    public float ty() {
        return this.KN.f35768r;
    }

    MotionController(View view) {
        int i2 = Key.J2;
        this.f35707e = i2;
        this.f35705X = i2;
        this.f35704T = null;
        this.f35701N = i2;
        this.nHg = Float.NaN;
        this.s7N = null;
        this.wTp = false;
        T(view);
    }
}
