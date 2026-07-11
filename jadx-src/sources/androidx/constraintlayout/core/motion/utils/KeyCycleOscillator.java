package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class KeyCycleOscillator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CurveFit f35269n;
    private CycleOscillator rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35270t;
    private int nr = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f35268O = null;
    public int J2 = 0;
    ArrayList Uo = new ArrayList();

    private static class CoreSpline extends KeyCycleOscillator {
        String KN;
        int xMQ;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void Uo(MotionWidget motionWidget, float f3) {
            motionWidget.t(this.xMQ, n(f3));
        }

        CoreSpline(String str) {
            this.KN = str;
            this.xMQ = TypedValues.CycleType.n(str);
        }
    }

    static class CycleOscillator {
        double[] HI;
        float[] J2;
        float[] KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f35272O;
        double[] Uo;
        CurveFit az;
        float ck;
        float[] gh;
        float[] mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f35273n;
        private final int nr;
        int qie;
        Oscillator rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f35274t;
        double[] ty;
        float[] xMQ;

        public double n(float f3) {
            CurveFit curveFit = this.az;
            if (curveFit != null) {
                double d2 = f3;
                curveFit.Uo(d2, this.HI);
                this.az.nr(d2, this.ty);
            } else {
                double[] dArr = this.HI;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d4 = f3;
            double dO = this.rl.O(d4, this.ty[1]);
            double dNr = this.rl.nr(d4, this.ty[1], this.HI[1]);
            double[] dArr2 = this.HI;
            return dArr2[0] + (dO * dArr2[2]) + (dNr * this.ty[2]);
        }

        public void nr(float f3) {
            this.ck = f3;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.Uo.length, 3);
            float[] fArr = this.J2;
            this.ty = new double[fArr.length + 2];
            this.HI = new double[fArr.length + 2];
            if (this.Uo[0] > 0.0d) {
                this.rl.n(0.0d, this.KN[0]);
            }
            double[] dArr2 = this.Uo;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.rl.n(1.0d, this.KN[length]);
            }
            for (int i2 = 0; i2 < dArr.length; i2++) {
                double[] dArr3 = dArr[i2];
                dArr3[0] = this.xMQ[i2];
                dArr3[1] = this.mUb[i2];
                dArr3[2] = this.J2[i2];
                this.rl.n(this.Uo[i2], this.KN[i2]);
            }
            this.rl.J2();
            double[] dArr4 = this.Uo;
            if (dArr4.length > 1) {
                this.az = CurveFit.n(0, dArr4, dArr);
            } else {
                this.az = null;
            }
        }

        public double rl(float f3) {
            CurveFit curveFit = this.az;
            if (curveFit != null) {
                curveFit.nr(f3, this.ty);
            } else {
                double[] dArr = this.ty;
                dArr[0] = this.xMQ[0];
                dArr[1] = this.mUb[0];
                dArr[2] = this.J2[0];
            }
            double[] dArr2 = this.ty;
            return dArr2[0] + (this.rl.O(f3, dArr2[1]) * this.ty[2]);
        }

        public void t(int i2, int i3, float f3, float f4, float f5, float f6) {
            this.Uo[i2] = ((double) i3) / 100.0d;
            this.KN[i2] = f3;
            this.xMQ[i2] = f4;
            this.mUb[i2] = f5;
            this.J2[i2] = f6;
        }

        CycleOscillator(int i2, String str, int i3, int i5) {
            Oscillator oscillator = new Oscillator();
            this.rl = oscillator;
            this.f35274t = 0;
            this.nr = 1;
            this.f35272O = 2;
            this.qie = i2;
            this.f35273n = i3;
            oscillator.Uo(i2, str);
            this.J2 = new float[i5];
            this.Uo = new double[i5];
            this.KN = new float[i5];
            this.xMQ = new float[i5];
            this.mUb = new float[i5];
            this.gh = new float[i5];
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        String KN;
        int xMQ;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void Uo(MotionWidget motionWidget, float f3) {
            motionWidget.t(this.xMQ, n(f3));
        }

        public PathRotateSet(String str) {
            this.KN = str;
            this.xMQ = TypedValues.CycleType.n(str);
        }

        public void gh(MotionWidget motionWidget, float f3, double d2, double d4) {
            motionWidget.wTp(n(f3) + ((float) Math.toDegrees(Math.atan2(d4, d2))));
        }
    }

    public void Uo(MotionWidget motionWidget, float f3) {
    }

    protected void nr(Object obj) {
    }

    static class WavePoint {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        float f35275O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f35276n;
        float nr;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f35277t;

        WavePoint(int i2, float f3, float f4, float f5, float f6) {
            this.f35276n = i2;
            this.rl = f6;
            this.f35277t = f4;
            this.nr = f3;
            this.f35275O = f5;
        }
    }

    public static KeyCycleOscillator t(String str) {
        return str.equals("pathRotate") ? new PathRotateSet(str) : new CoreSpline(str);
    }

    public void J2(int i2, int i3, String str, int i5, float f3, float f4, float f5, float f6, Object obj) {
        this.Uo.add(new WavePoint(i2, f3, f4, f5, f6));
        if (i5 != -1) {
            this.J2 = i5;
        }
        this.nr = i3;
        nr(obj);
        this.f35268O = str;
    }

    public void KN(String str) {
        this.f35270t = str;
    }

    public void O(int i2, int i3, String str, int i5, float f3, float f4, float f5, float f6) {
        this.Uo.add(new WavePoint(i2, f3, f4, f5, f6));
        if (i5 != -1) {
            this.J2 = i5;
        }
        this.nr = i3;
        this.f35268O = str;
    }

    public boolean mUb() {
        return this.J2 == 1;
    }

    public float n(float f3) {
        return (float) this.rl.rl(f3);
    }

    public float rl(float f3) {
        return (float) this.rl.n(f3);
    }

    public String toString() {
        String str = this.f35270t;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.Uo.iterator();
        while (it.hasNext()) {
            str = str + "[" + ((WavePoint) it.next()).f35276n + " , " + decimalFormat.format(r3.rl) + "] ";
        }
        return str;
    }

    public void xMQ(float f3) {
        int size = this.Uo.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.Uo, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.f35276n, wavePoint2.f35276n);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.rl = new CycleOscillator(this.nr, this.f35268O, this.J2, size);
        int i2 = 0;
        for (WavePoint wavePoint : this.Uo) {
            float f4 = wavePoint.nr;
            dArr[i2] = ((double) f4) * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f5 = wavePoint.rl;
            dArr3[0] = f5;
            float f6 = wavePoint.f35277t;
            dArr3[1] = f6;
            float f7 = wavePoint.f35275O;
            dArr3[2] = f7;
            this.rl.t(i2, wavePoint.f35276n, f4, f6, f7, f5);
            i2++;
        }
        this.rl.nr(f3);
        this.f35269n = CurveFit.n(0, dArr, dArr2);
    }
}
