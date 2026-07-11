package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Impl f36799n;

    public static final class BoundsCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Insets f36800n;
        private final Insets rl;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.f36800n = insets;
            this.rl = insets2;
        }

        public static BoundsCompat O(WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }

        public Insets n() {
            return this.f36800n;
        }

        public Insets rl() {
            return this.rl;
        }

        public BoundsCompat t(Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.Ik(this.f36800n, insets.f36410n, insets.rl, insets.f36411t, insets.nr), WindowInsetsCompat.Ik(this.rl, insets.f36410n, insets.rl, insets.f36411t, insets.nr));
        }

        public String toString() {
            return "Bounds{lower=" + this.f36800n + " upper=" + this.rl + "}";
        }

        public WindowInsetsAnimation.Bounds nr() {
            return Impl30.J2(this);
        }

        private BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.f36800n = Impl30.KN(bounds);
            this.rl = Impl30.Uo(bounds);
        }
    }

    public static abstract class Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        WindowInsetsCompat f36801n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36802t;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface DispatchMode {
        }

        public BoundsCompat J2(WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            return boundsCompat;
        }

        public abstract WindowInsetsCompat O(WindowInsetsCompat windowInsetsCompat, List list);

        public void nr(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void t(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public final int rl() {
            return this.f36802t;
        }

        public Callback(int i2) {
            this.f36802t = i2;
        }
    }

    private static class Impl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f36803O = 1.0f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f36804n;
        private final long nr;
        private float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Interpolator f36805t;

        public void O(float f3) {
            this.rl = f3;
        }

        public float n() {
            return this.f36803O;
        }

        public int nr() {
            return this.f36804n;
        }

        public long rl() {
            return this.nr;
        }

        public float t() {
            Interpolator interpolator = this.f36805t;
            return interpolator != null ? interpolator.getInterpolation(this.rl) : this.rl;
        }

        Impl(int i2, Interpolator interpolator, long j2) {
            this.f36804n = i2;
            this.f36805t = interpolator;
            this.nr = j2;
        }
    }

    @RequiresApi
    private static class Impl21 extends Impl {
        private static final Interpolator J2 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator Uo = new FastOutLinearInInterpolator();
        private static final Interpolator KN = new DecelerateInterpolator(1.5f);
        private static final Interpolator xMQ = new AccelerateInterpolator(1.5f);

        static void J2(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int[] iArr, int[] iArr2) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                Insets insetsJ2 = windowInsetsCompat.J2(i2);
                Insets insetsJ22 = windowInsetsCompat2.J2(i2);
                int i3 = insetsJ2.f36410n;
                int i5 = insetsJ22.f36410n;
                boolean z2 = i3 > i5 || insetsJ2.rl > insetsJ22.rl || insetsJ2.f36411t > insetsJ22.f36411t || insetsJ2.nr > insetsJ22.nr;
                if (z2 != (i3 < i5 || insetsJ2.rl < insetsJ22.rl || insetsJ2.f36411t < insetsJ22.f36411t || insetsJ2.nr < insetsJ22.nr)) {
                    if (z2) {
                        iArr[0] = iArr[0] | i2;
                    } else {
                        iArr2[0] = iArr2[0] | i2;
                    }
                }
            }
        }

        @RequiresApi
        private static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final Callback f36806n;
            private WindowInsetsCompat rl;

            Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                WindowInsetsCompat windowInsetsCompatN;
                this.f36806n = callback;
                WindowInsetsCompat windowInsetsCompatX = ViewCompat.X(view);
                if (windowInsetsCompatX != null) {
                    windowInsetsCompatN = new WindowInsetsCompat.Builder(windowInsetsCompatX).n();
                } else {
                    windowInsetsCompatN = null;
                }
                this.rl = windowInsetsCompatN;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                long j2;
                if (!view.isLaidOut()) {
                    this.rl = WindowInsetsCompat.te(windowInsets, view);
                    return Impl21.ty(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompatTe = WindowInsetsCompat.te(windowInsets, view);
                if (this.rl == null) {
                    this.rl = ViewCompat.X(view);
                }
                if (this.rl == null) {
                    this.rl = windowInsetsCompatTe;
                    return Impl21.ty(view, windowInsets);
                }
                Callback callbackHI = Impl21.HI(view);
                if (callbackHI != null && Objects.equals(callbackHI.f36801n, windowInsetsCompatTe)) {
                    return Impl21.ty(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                Impl21.J2(windowInsetsCompatTe, this.rl, iArr, iArr2);
                int i2 = iArr[0];
                int i3 = iArr2[0];
                final int i5 = i2 | i3;
                if (i5 == 0) {
                    this.rl = windowInsetsCompatTe;
                    return Impl21.ty(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat = this.rl;
                Interpolator interpolatorKN = Impl21.KN(i2, i3);
                if ((WindowInsetsCompat.Type.nr() & i5) != 0) {
                    j2 = 160;
                } else {
                    j2 = 250;
                }
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i5, interpolatorKN, j2);
                windowInsetsAnimationCompat.J2(0.0f);
                final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.rl());
                final BoundsCompat boundsCompatUo = Impl21.Uo(windowInsetsCompatTe, windowInsetsCompat, i5);
                Impl21.gh(view, windowInsetsAnimationCompat, windowInsetsCompatTe, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        windowInsetsAnimationCompat.J2(valueAnimator.getAnimatedFraction());
                        Impl21.qie(view, Impl21.ck(windowInsetsCompatTe, windowInsetsCompat, windowInsetsAnimationCompat.t(), i5), Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        windowInsetsAnimationCompat.J2(1.0f);
                        Impl21.mUb(view, windowInsetsAnimationCompat);
                    }
                });
                OneShotPreDrawListener.n(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Impl21.az(view, windowInsetsAnimationCompat, boundsCompatUo);
                        duration.start();
                    }
                });
                this.rl = windowInsetsCompatTe;
                return Impl21.ty(view, windowInsets);
            }
        }

        static Callback HI(View view) {
            Object tag = view.getTag(R.id.f36153I);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).f36806n;
            }
            return null;
        }

        static void Ik(View view, Callback callback) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerXMQ = callback != null ? xMQ(view, callback) : null;
            view.setTag(R.id.f36153I, onApplyWindowInsetsListenerXMQ);
            if (view.getTag(R.id.p5) == null && view.getTag(R.id.eF) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerXMQ);
            }
        }

        static WindowInsetsCompat ck(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f3, int i2) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) == 0) {
                    builder.rl(i3, windowInsetsCompat.J2(i3));
                } else {
                    Insets insetsJ2 = windowInsetsCompat.J2(i3);
                    Insets insetsJ22 = windowInsetsCompat2.J2(i3);
                    float f4 = 1.0f - f3;
                    builder.rl(i3, WindowInsetsCompat.Ik(insetsJ2, (int) (((double) ((insetsJ2.f36410n - insetsJ22.f36410n) * f4)) + 0.5d), (int) (((double) ((insetsJ2.rl - insetsJ22.rl) * f4)) + 0.5d), (int) (((double) ((insetsJ2.f36411t - insetsJ22.f36411t) * f4)) + 0.5d), (int) (((double) ((insetsJ2.nr - insetsJ22.nr) * f4)) + 0.5d)));
                }
            }
            return builder.n();
        }

        static WindowInsets ty(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.eF) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        private static View.OnApplyWindowInsetsListener xMQ(View view, Callback callback) {
            return new Impl21OnApplyWindowInsetsListener(view, callback);
        }

        Impl21(int i2, Interpolator interpolator, long j2) {
            super(i2, interpolator, j2);
        }

        static Interpolator KN(int i2, int i3) {
            if ((WindowInsetsCompat.Type.nr() & i2) != 0) {
                return J2;
            }
            if ((WindowInsetsCompat.Type.nr() & i3) != 0) {
                return Uo;
            }
            if ((i2 & WindowInsetsCompat.Type.xMQ()) != 0) {
                return KN;
            }
            if ((WindowInsetsCompat.Type.xMQ() & i3) != 0) {
                return xMQ;
            }
            return null;
        }

        static BoundsCompat Uo(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i2) {
            Insets insetsJ2 = windowInsetsCompat.J2(i2);
            Insets insetsJ22 = windowInsetsCompat2.J2(i2);
            return new BoundsCompat(Insets.t(Math.min(insetsJ2.f36410n, insetsJ22.f36410n), Math.min(insetsJ2.rl, insetsJ22.rl), Math.min(insetsJ2.f36411t, insetsJ22.f36411t), Math.min(insetsJ2.nr, insetsJ22.nr)), Insets.t(Math.max(insetsJ2.f36410n, insetsJ22.f36410n), Math.max(insetsJ2.rl, insetsJ22.rl), Math.max(insetsJ2.f36411t, insetsJ22.f36411t), Math.max(insetsJ2.nr, insetsJ22.nr)));
        }

        static void az(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callbackHI = HI(view);
            if (callbackHI != null) {
                callbackHI.J2(windowInsetsAnimationCompat, boundsCompat);
                if (callbackHI.rl() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    az(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        static void gh(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, boolean z2) {
            Callback callbackHI = HI(view);
            if (callbackHI != null) {
                callbackHI.f36801n = windowInsetsCompat;
                if (!z2) {
                    callbackHI.nr(windowInsetsAnimationCompat);
                    if (callbackHI.rl() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    gh(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, windowInsetsCompat, z2);
                }
            }
        }

        static void mUb(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackHI = HI(view);
            if (callbackHI != null) {
                callbackHI.t(windowInsetsAnimationCompat);
                if (callbackHI.rl() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    mUb(viewGroup.getChildAt(i2), windowInsetsAnimationCompat);
                }
            }
        }

        static void qie(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback callbackHI = HI(view);
            if (callbackHI != null) {
                windowInsetsCompat = callbackHI.O(windowInsetsCompat, list);
                if (callbackHI.rl() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    qie(viewGroup.getChildAt(i2), windowInsetsCompat, list);
                }
            }
        }
    }

    @RequiresApi
    private static class Impl30 extends Impl {
        private final WindowInsetsAnimation J2;

        @RequiresApi
        private static class ProxyCallback extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Callback f36816n;
            private final HashMap nr;
            private List rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private ArrayList f36817t;

            private WindowInsetsAnimationCompat n(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.nr.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompatUo = WindowInsetsAnimationCompat.Uo(windowInsetsAnimation);
                this.nr.put(windowInsetsAnimation, windowInsetsAnimationCompatUo);
                return windowInsetsAnimationCompatUo;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f36816n.t(n(windowInsetsAnimation));
                this.nr.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f36816n.nr(n(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f36817t;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f36817t = arrayList2;
                    this.rl = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationN = M.n(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatN = n(windowInsetsAnimationN);
                    windowInsetsAnimationCompatN.J2(windowInsetsAnimationN.getFraction());
                    this.f36817t.add(windowInsetsAnimationCompatN);
                }
                return this.f36816n.O(WindowInsetsCompat.g(windowInsets), this.rl).nY();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f36816n.J2(n(windowInsetsAnimation), BoundsCompat.O(bounds)).nr();
            }

            ProxyCallback(Callback callback) {
                super(callback.rl());
                this.nr = new HashMap();
                this.f36816n = callback;
            }
        }

        Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.J2 = windowInsetsAnimation;
        }

        public static void xMQ(View view, Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new ProxyCallback(callback) : null);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void O(float f3) {
            this.J2.setFraction(f3);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float n() {
            return this.J2.getAlpha();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int nr() {
            return this.J2.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long rl() {
            return this.J2.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float t() {
            return this.J2.getInterpolatedFraction();
        }

        Impl30(int i2, Interpolator interpolator, long j2) {
            this(lej.n(i2, interpolator, j2));
        }

        public static WindowInsetsAnimation.Bounds J2(BoundsCompat boundsCompat) {
            afx.n();
            return iwV.n(boundsCompat.n().J2(), boundsCompat.rl().J2());
        }

        public static Insets KN(WindowInsetsAnimation.Bounds bounds) {
            return Insets.O(bounds.getLowerBound());
        }

        public static Insets Uo(WindowInsetsAnimation.Bounds bounds) {
            return Insets.O(bounds.getUpperBound());
        }
    }

    public WindowInsetsAnimationCompat(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f36799n = new Impl30(i2, interpolator, j2);
        } else {
            this.f36799n = new Impl21(i2, interpolator, j2);
        }
    }

    static void O(View view, Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            Impl30.xMQ(view, callback);
        } else {
            Impl21.Ik(view, callback);
        }
    }

    static WindowInsetsAnimationCompat Uo(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public void J2(float f3) {
        this.f36799n.O(f3);
    }

    public float n() {
        return this.f36799n.n();
    }

    public int nr() {
        return this.f36799n.nr();
    }

    public long rl() {
        return this.f36799n.rl();
    }

    public float t() {
        return this.f36799n.t();
    }

    private WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f36799n = new Impl30(windowInsetsAnimation);
        }
    }
}
