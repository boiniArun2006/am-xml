package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {

    static class CustomSet extends ViewOscillator {
        float[] KN = new float[1];
        protected ConstraintAttribute xMQ;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        protected void nr(Object obj) {
            this.xMQ = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            this.KN[0] = n(f3);
            CustomSupport.rl(this.xMQ, view, this.KN);
        }

        CustomSet() {
        }
    }

    static class ProgressSet extends ViewOscillator {
        boolean KN = false;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(n(f3));
                return;
            }
            if (this.KN) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.KN = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(n(f3)));
                } catch (IllegalAccessException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                } catch (InvocationTargetException e3) {
                    Log.e("ViewOscillator", "unable to setProgress", e3);
                }
            }
        }

        ProgressSet() {
        }
    }

    public abstract void qie(View view, float f3);

    static class AlphaSet extends ViewOscillator {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setAlpha(n(f3));
        }
    }

    static class ElevationSet extends ViewOscillator {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setElevation(n(f3));
        }
    }

    public static class PathRotateSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
        }

        public void az(View view, float f3, double d2, double d4) {
            view.setRotation(n(f3) + ((float) Math.toDegrees(Math.atan2(d4, d2))));
        }
    }

    static class RotationSet extends ViewOscillator {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setRotation(n(f3));
        }
    }

    static class RotationXset extends ViewOscillator {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setRotationX(n(f3));
        }
    }

    static class RotationYset extends ViewOscillator {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setRotationY(n(f3));
        }
    }

    static class ScaleXset extends ViewOscillator {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setScaleX(n(f3));
        }
    }

    static class ScaleYset extends ViewOscillator {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setScaleY(n(f3));
        }
    }

    static class TranslationXset extends ViewOscillator {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setTranslationX(n(f3));
        }
    }

    static class TranslationYset extends ViewOscillator {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setTranslationY(n(f3));
        }
    }

    static class TranslationZset extends ViewOscillator {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void qie(View view, float f3) {
            view.setTranslationZ(n(f3));
        }
    }

    public static ViewOscillator gh(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
        switch (str) {
            case "rotationX":
                return new RotationXset();
            case "rotationY":
                return new RotationYset();
            case "translationX":
                return new TranslationXset();
            case "translationY":
                return new TranslationYset();
            case "translationZ":
                return new TranslationZset();
            case "progress":
                return new ProgressSet();
            case "scaleX":
                return new ScaleXset();
            case "scaleY":
                return new ScaleYset();
            case "waveVariesBy":
                return new AlphaSet();
            case "rotation":
                return new RotationSet();
            case "elevation":
                return new ElevationSet();
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new AlphaSet();
            case "waveOffset":
                return new AlphaSet();
            default:
                return null;
        }
    }
}
