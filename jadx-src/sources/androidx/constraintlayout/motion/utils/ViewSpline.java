package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class ViewSpline extends SplineSet {

    public static class CustomSet extends ViewSpline {
        String J2;
        float[] KN;
        SparseArray Uo;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void KN(int i2) {
            int size = this.Uo.size();
            int iKN = ((ConstraintAttribute) this.Uo.valueAt(0)).KN();
            double[] dArr = new double[size];
            this.KN = new float[iKN];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iKN);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.Uo.keyAt(i3);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.Uo.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttribute.J2(this.KN);
                int i5 = 0;
                while (true) {
                    if (i5 < this.KN.length) {
                        dArr2[i3][i5] = r6[i5];
                        i5++;
                    }
                }
            }
            this.f35295n = CurveFit.n(i2, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void O(int i2, float f3) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            this.f35295n.O(f3, this.KN);
            CustomSupport.rl((ConstraintAttribute) this.Uo.valueAt(0), view, this.KN);
        }

        public void qie(int i2, ConstraintAttribute constraintAttribute) {
            this.Uo.append(i2, constraintAttribute);
        }

        public CustomSet(String str, SparseArray sparseArray) {
            this.J2 = str.split(",")[1];
            this.Uo = sparseArray;
        }
    }

    static class ProgressSet extends ViewSpline {
        boolean J2 = false;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(n(f3));
                return;
            }
            if (this.J2) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.J2 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(n(f3)));
                } catch (IllegalAccessException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                } catch (InvocationTargetException e3) {
                    Log.e("ViewSpline", "unable to setProgress", e3);
                }
            }
        }

        ProgressSet() {
        }
    }

    public abstract void gh(View view, float f3);

    static class AlphaSet extends ViewSpline {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setAlpha(n(f3));
        }
    }

    static class ElevationSet extends ViewSpline {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setElevation(n(f3));
        }
    }

    public static class PathRotate extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
        }

        public void qie(View view, float f3, double d2, double d4) {
            view.setRotation(n(f3) + ((float) Math.toDegrees(Math.atan2(d4, d2))));
        }
    }

    static class PivotXset extends ViewSpline {
        PivotXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setPivotX(n(f3));
        }
    }

    static class PivotYset extends ViewSpline {
        PivotYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setPivotY(n(f3));
        }
    }

    static class RotationSet extends ViewSpline {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setRotation(n(f3));
        }
    }

    static class RotationXset extends ViewSpline {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setRotationX(n(f3));
        }
    }

    static class RotationYset extends ViewSpline {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setRotationY(n(f3));
        }
    }

    static class ScaleXset extends ViewSpline {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setScaleX(n(f3));
        }
    }

    static class ScaleYset extends ViewSpline {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setScaleY(n(f3));
        }
    }

    static class TranslationXset extends ViewSpline {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setTranslationX(n(f3));
        }
    }

    static class TranslationYset extends ViewSpline {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setTranslationY(n(f3));
        }
    }

    static class TranslationZset extends ViewSpline {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void gh(View view, float f3) {
            view.setTranslationZ(n(f3));
        }
    }

    public static ViewSpline xMQ(String str, SparseArray sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewSpline mUb(String str) {
        str.getClass();
        switch (str) {
        }
        return new AlphaSet();
    }
}
