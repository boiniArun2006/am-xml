package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {

    public static class CustomSet extends ViewTimeCycle {
        float[] HI;
        SparseArray az;
        String qie;
        SparseArray ty = new SparseArray();

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void O(int i2) {
            int size = this.az.size();
            int iKN = ((ConstraintAttribute) this.az.valueAt(0)).KN();
            double[] dArr = new double[size];
            int i3 = iKN + 2;
            this.HI = new float[i3];
            this.Uo = new float[iKN];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i3);
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.az.keyAt(i5);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.az.valueAt(i5);
                float[] fArr = (float[]) this.ty.valueAt(i5);
                dArr[i5] = ((double) iKeyAt) * 0.01d;
                constraintAttribute.J2(this.HI);
                int i7 = 0;
                while (true) {
                    if (i7 < this.HI.length) {
                        dArr2[i5][i7] = r8[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i5];
                dArr3[iKN] = fArr[0];
                dArr3[iKN + 1] = fArr[1];
            }
            this.f35307n = CurveFit.n(i2, dArr, dArr2);
        }

        public void mUb(int i2, ConstraintAttribute constraintAttribute, float f3, int i3, float f4) {
            this.az.append(i2, constraintAttribute);
            this.ty.append(i2, new float[]{f3, f4});
            this.rl = Math.max(this.rl, i3);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void rl(int i2, float f3, float f4, int i3, float f5) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            this.f35307n.O(f3, this.HI);
            float[] fArr = this.HI;
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            long j3 = j2 - this.xMQ;
            if (Float.isNaN(this.mUb)) {
                float fN = keyCache.n(view, this.qie, 0);
                this.mUb = fN;
                if (Float.isNaN(fN)) {
                    this.mUb = 0.0f;
                }
            }
            float f6 = (float) ((((double) this.mUb) + ((j3 * 1.0E-9d) * ((double) f4))) % 1.0d);
            this.mUb = f6;
            this.xMQ = j2;
            float fN2 = n(f6);
            this.KN = false;
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.Uo;
                if (i2 >= fArr2.length) {
                    break;
                }
                boolean z2 = this.KN;
                float f7 = this.HI[i2];
                this.KN = z2 | (((double) f7) != 0.0d);
                fArr2[i2] = (f7 * fN2) + f5;
                i2++;
            }
            CustomSupport.rl((ConstraintAttribute) this.az.valueAt(0), view, this.Uo);
            if (f4 != 0.0f) {
                this.KN = true;
            }
            return this.KN;
        }

        public CustomSet(String str, SparseArray sparseArray) {
            this.qie = str.split(",")[1];
            this.az = sparseArray;
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        public boolean mUb(View view, KeyCache keyCache, float f3, long j2, double d2, double d4) {
            view.setRotation(J2(f3, j2, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d4, d2))));
            return this.KN;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            return this.KN;
        }
    }

    static class ProgressSet extends ViewTimeCycle {
        boolean qie = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            ProgressSet progressSet;
            Method method;
            if (view instanceof MotionLayout) {
                progressSet = this;
                ((MotionLayout) view).setProgress(J2(f3, j2, view, keyCache));
            } else {
                progressSet = this;
                if (progressSet.qie) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    progressSet.qie = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(progressSet.J2(f3, j2, view, keyCache)));
                    } catch (IllegalAccessException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    } catch (InvocationTargetException e3) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e3);
                    }
                }
            }
            return progressSet.KN;
        }

        ProgressSet() {
        }
    }

    public abstract boolean xMQ(View view, float f3, long j2, KeyCache keyCache);

    static class AlphaSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setAlpha(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        AlphaSet() {
        }
    }

    static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setElevation(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        ElevationSet() {
        }
    }

    static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setRotation(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        RotationSet() {
        }
    }

    static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setRotationX(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        RotationXset() {
        }
    }

    static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setRotationY(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        RotationYset() {
        }
    }

    static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setScaleX(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        ScaleXset() {
        }
    }

    static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setScaleY(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        ScaleYset() {
        }
    }

    static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setTranslationX(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        TranslationXset() {
        }
    }

    static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setTranslationY(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        TranslationYset() {
        }
    }

    static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean xMQ(View view, float f3, long j2, KeyCache keyCache) {
            view.setTranslationZ(J2(f3, j2, view, keyCache));
            return this.KN;
        }

        TranslationZset() {
        }
    }

    public static ViewTimeCycle Uo(String str, SparseArray sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public float J2(float f3, long j2, View view, KeyCache keyCache) {
        this.f35307n.O(f3, this.Uo);
        float[] fArr = this.Uo;
        float f4 = fArr[1];
        if (f4 == 0.0f) {
            this.KN = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mUb)) {
            float fN = keyCache.n(view, this.J2, 0);
            this.mUb = fN;
            if (Float.isNaN(fN)) {
                this.mUb = 0.0f;
            }
        }
        float f5 = (float) ((((double) this.mUb) + (((j2 - this.xMQ) * 1.0E-9d) * ((double) f4))) % 1.0d);
        this.mUb = f5;
        keyCache.rl(view, this.J2, 0, f5);
        this.xMQ = j2;
        float f6 = this.Uo[0];
        float fN2 = (n(this.mUb) * f6) + this.Uo[2];
        this.KN = (f6 == 0.0f && f4 == 0.0f) ? false : true;
        return fN2;
    }

    public static ViewTimeCycle KN(String str, long j2) {
        ViewTimeCycle rotationXset;
        str.getClass();
        switch (str) {
            case "rotationX":
                rotationXset = new RotationXset();
                break;
            case "rotationY":
                rotationXset = new RotationYset();
                break;
            case "translationX":
                rotationXset = new TranslationXset();
                break;
            case "translationY":
                rotationXset = new TranslationYset();
                break;
            case "translationZ":
                rotationXset = new TranslationZset();
                break;
            case "progress":
                rotationXset = new ProgressSet();
                break;
            case "scaleX":
                rotationXset = new ScaleXset();
                break;
            case "scaleY":
                rotationXset = new ScaleYset();
                break;
            case "rotation":
                rotationXset = new RotationSet();
                break;
            case "elevation":
                rotationXset = new ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new PathRotate();
                break;
            case "alpha":
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.t(j2);
        return rotationXset;
    }
}
