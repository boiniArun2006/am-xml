package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {
    boolean J2;
    float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final FloatPropertyCompat f38296O;
    float Uo;
    private final ArrayList gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f38297n;
    final Object nr;
    private final ArrayList qie;
    float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f38298t;
    private long xMQ;
    public static final ViewProperty az = new ViewProperty("translationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setTranslationX(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getTranslationX();
        }
    };
    public static final ViewProperty ty = new ViewProperty("translationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.2
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setTranslationY(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getTranslationY();
        }
    };
    public static final ViewProperty HI = new ViewProperty("translationZ") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.3
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            ViewCompat.i(view, f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return ViewCompat.nHg(view);
        }
    };
    public static final ViewProperty ck = new ViewProperty("scaleX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.4
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setScaleX(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getScaleX();
        }
    };
    public static final ViewProperty Ik = new ViewProperty("scaleY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.5
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setScaleY(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getScaleY();
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ViewProperty f38295r = new ViewProperty("rotation") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.6
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setRotation(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getRotation();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ViewProperty f38294o = new ViewProperty("rotationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.7
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setRotationX(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getRotationX();
        }
    };

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final ViewProperty f38293Z = new ViewProperty("rotationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.8
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setRotationY(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getRotationY();
        }
    };
    public static final ViewProperty XQ = new ViewProperty("x") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.9
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setX(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getX();
        }
    };

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final ViewProperty f38292S = new ViewProperty("y") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.10
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setY(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getY();
        }
    };
    public static final ViewProperty WPU = new ViewProperty("z") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.11
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            ViewCompat.How(view, f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return ViewCompat.v(view);
        }
    };
    public static final ViewProperty aYN = new ViewProperty("alpha") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.12
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setAlpha(f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getAlpha();
        }
    };
    public static final ViewProperty ViF = new ViewProperty("scrollX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.13
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setScrollX((int) f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getScrollX();
        }
    };
    public static final ViewProperty nY = new ViewProperty("scrollY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.14
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(View view, float f3) {
            view.setScrollY((int) f3);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(View view) {
            return view.getScrollY();
        }
    };

    public interface OnAnimationEndListener {
        void n(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4);
    }

    public interface OnAnimationUpdateListener {
        void t(DynamicAnimation dynamicAnimation, float f3, float f4);
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        private ViewProperty(String str) {
            super(str);
        }
    }

    DynamicAnimation(final FloatValueHolder floatValueHolder) {
        this.f38297n = 0.0f;
        this.rl = Float.MAX_VALUE;
        this.f38298t = false;
        this.J2 = false;
        this.Uo = Float.MAX_VALUE;
        this.KN = -Float.MAX_VALUE;
        this.xMQ = 0L;
        this.gh = new ArrayList();
        this.qie = new ArrayList();
        this.nr = null;
        this.f38296O = new FloatPropertyCompat("FloatValueHolder") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.15
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float n(Object obj) {
                return floatValueHolder.n();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void rl(Object obj, float f3) {
                floatValueHolder.rl(f3);
            }
        };
        this.mUb = 1.0f;
    }

    private void nr(boolean z2) {
        this.J2 = false;
        AnimationHandler.nr().Uo(this);
        this.xMQ = 0L;
        this.f38298t = false;
        for (int i2 = 0; i2 < this.gh.size(); i2++) {
            if (this.gh.get(i2) != null) {
                ((OnAnimationEndListener) this.gh.get(i2)).n(this, z2, this.rl, this.f38297n);
            }
        }
        KN(this.gh);
    }

    abstract void HI(float f3);

    public DynamicAnimation gh(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.mUb = f3;
        HI(f3 * 0.75f);
        return this;
    }

    abstract boolean r(long j2);

    static class MassState {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f38300n;
        float rl;

        MassState() {
        }
    }

    private void Ik() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        if (!this.f38298t) {
            this.rl = O();
        }
        float f3 = this.rl;
        if (f3 > this.Uo || f3 < this.KN) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        AnimationHandler.nr().n(this, 0L);
    }

    private float O() {
        return this.f38296O.n(this.nr);
    }

    float J2() {
        return this.mUb * 0.75f;
    }

    public boolean Uo() {
        return this.J2;
    }

    public DynamicAnimation az(float f3) {
        this.rl = f3;
        this.f38298t = true;
        return this;
    }

    public DynamicAnimation mUb(float f3) {
        this.KN = f3;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public boolean n(long j2) {
        long j3 = this.xMQ;
        if (j3 == 0) {
            this.xMQ = j2;
            qie(this.rl);
            return false;
        }
        this.xMQ = j2;
        boolean zR = r(j2 - j3);
        float fMin = Math.min(this.rl, this.Uo);
        this.rl = fMin;
        float fMax = Math.max(fMin, this.KN);
        this.rl = fMax;
        qie(fMax);
        if (zR) {
            nr(false);
        }
        return zR;
    }

    void qie(float f3) {
        this.f38296O.rl(this.nr, f3);
        for (int i2 = 0; i2 < this.qie.size(); i2++) {
            if (this.qie.get(i2) != null) {
                ((OnAnimationUpdateListener) this.qie.get(i2)).t(this, this.rl, this.f38297n);
            }
        }
        KN(this.qie);
    }

    public DynamicAnimation rl(OnAnimationEndListener onAnimationEndListener) {
        if (!this.gh.contains(onAnimationEndListener)) {
            this.gh.add(onAnimationEndListener);
        }
        return this;
    }

    public DynamicAnimation ty(float f3) {
        this.f38297n = f3;
        return this;
    }

    public DynamicAnimation xMQ(float f3) {
        this.Uo = f3;
        return this;
    }

    private static void KN(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void ck() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.J2) {
                Ik();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public DynamicAnimation t(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!Uo()) {
            if (!this.qie.contains(onAnimationUpdateListener)) {
                this.qie.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    DynamicAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        this.f38297n = 0.0f;
        this.rl = Float.MAX_VALUE;
        this.f38298t = false;
        this.J2 = false;
        this.Uo = Float.MAX_VALUE;
        this.KN = -Float.MAX_VALUE;
        this.xMQ = 0L;
        this.gh = new ArrayList();
        this.qie = new ArrayList();
        this.nr = obj;
        this.f38296O = floatPropertyCompat;
        if (floatPropertyCompat != f38295r && floatPropertyCompat != f38294o && floatPropertyCompat != f38293Z) {
            if (floatPropertyCompat == aYN) {
                this.mUb = 0.00390625f;
                return;
            } else if (floatPropertyCompat != ck && floatPropertyCompat != Ik) {
                this.mUb = 1.0f;
                return;
            } else {
                this.mUb = 0.00390625f;
                return;
            }
        }
        this.mUb = 0.1f;
    }
}
