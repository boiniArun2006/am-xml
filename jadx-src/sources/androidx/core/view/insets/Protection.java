package androidx.core.view.insets;

import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Protection {
    private float J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f36882O;
    private float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f36883n;
    private Insets nr;
    private final Attributes rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Insets f36884t;
    private Object xMQ;
    private static final Interpolator mUb = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    private static final Interpolator gh = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    private static final Interpolator qie = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    private static final Interpolator az = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    static class Attributes {
        private float J2;
        private float KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Drawable f36885O;
        private float Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f36886n;
        private boolean nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Insets f36887t;
        private Callback xMQ;

        interface Callback {
            default void J2(float f3) {
            }

            default void KN(Drawable drawable) {
            }

            default void O(int i2) {
            }

            default void Uo(float f3) {
            }

            default void n(int i2) {
            }

            default void nr(float f3) {
            }

            default void rl(boolean z2) {
            }

            default void t(Insets insets) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S(int i2) {
            if (this.rl != i2) {
                this.rl = i2;
                Callback callback = this.xMQ;
                if (callback != null) {
                    callback.n(i2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ViF(float f3) {
            if (this.Uo != f3) {
                this.Uo = f3;
                Callback callback = this.xMQ;
                if (callback != null) {
                    callback.Uo(f3);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void WPU(Insets insets) {
            if (this.f36887t.equals(insets)) {
                return;
            }
            this.f36887t = insets;
            Callback callback = this.xMQ;
            if (callback != null) {
                callback.t(insets);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void XQ(Drawable drawable) {
            this.f36885O = drawable;
            Callback callback = this.xMQ;
            if (callback != null) {
                callback.KN(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void aYN(float f3) {
            if (this.J2 != f3) {
                this.J2 = f3;
                Callback callback = this.xMQ;
                if (callback != null) {
                    callback.J2(f3);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i2) {
            if (this.f36886n != i2) {
                this.f36886n = i2;
                Callback callback = this.xMQ;
                if (callback != null) {
                    callback.O(i2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nY(boolean z2) {
            if (this.nr != z2) {
                this.nr = z2;
                Callback callback = this.xMQ;
                if (callback != null) {
                    callback.rl(z2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f3) {
            if (this.KN != f3) {
                this.KN = f3;
                Callback callback = this.xMQ;
                if (callback != null) {
                    callback.nr(f3);
                }
            }
        }

        float HI() {
            return this.J2;
        }

        int Ik() {
            return this.f36886n;
        }

        void Z(Callback callback) {
            if (this.xMQ != null && callback != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.xMQ = callback;
        }

        int az() {
            return this.rl;
        }

        float ck() {
            return this.Uo;
        }

        float gh() {
            return this.KN;
        }

        Drawable qie() {
            return this.f36885O;
        }

        boolean r() {
            return this.nr;
        }

        Insets ty() {
            return this.f36887t;
        }
    }

    int J2(int i2) {
        return i2;
    }

    boolean Uo() {
        return false;
    }

    void n(int i2) {
    }

    private void az() {
        this.rl.o(this.f36882O * this.J2);
    }

    private void ty() {
        float f3 = this.KN * this.Uo;
        int i2 = this.f36883n;
        if (i2 == 1) {
            this.rl.aYN((-(1.0f - f3)) * r1.f36886n);
            return;
        }
        if (i2 == 2) {
            this.rl.ViF((-(1.0f - f3)) * r1.rl);
        } else if (i2 == 4) {
            this.rl.aYN((1.0f - f3) * r1.f36886n);
        } else {
            if (i2 != 8) {
                return;
            }
            this.rl.ViF((1.0f - f3) * r1.rl);
        }
    }

    Insets HI() {
        int i2;
        Insets insetsT = Insets.f36409O;
        int i3 = this.f36883n;
        if (i3 == 1) {
            i2 = this.f36884t.f36410n;
            this.rl.g(J2(this.nr.f36410n));
            if (Uo()) {
                insetsT = Insets.t(J2(i2), 0, 0, 0);
            }
        } else if (i3 == 2) {
            i2 = this.f36884t.rl;
            this.rl.S(J2(this.nr.rl));
            if (Uo()) {
                insetsT = Insets.t(0, J2(i2), 0, 0);
            }
        } else if (i3 == 4) {
            i2 = this.f36884t.f36411t;
            this.rl.g(J2(this.nr.f36411t));
            if (Uo()) {
                insetsT = Insets.t(0, 0, J2(i2), 0);
            }
        } else if (i3 != 8) {
            i2 = 0;
        } else {
            i2 = this.f36884t.nr;
            this.rl.S(J2(this.nr.nr));
            if (Uo()) {
                insetsT = Insets.t(0, 0, 0, J2(i2));
            }
        }
        qie(i2 > 0);
        mUb(i2 > 0 ? 1.0f : 0.0f);
        gh(i2 > 0 ? 1.0f : 0.0f);
        return insetsT;
    }

    void KN(Object obj) {
        this.xMQ = obj;
    }

    public int O() {
        return this.f36883n;
    }

    void gh(float f3) {
        this.Uo = f3;
        ty();
    }

    void mUb(float f3) {
        this.f36882O = f3;
        az();
    }

    Object nr() {
        return this.xMQ;
    }

    void qie(boolean z2) {
        this.rl.nY(z2);
    }

    Insets rl(Insets insets, Insets insets2, Insets insets3) {
        this.f36884t = insets;
        this.nr = insets2;
        this.rl.WPU(insets3);
        return HI();
    }

    Attributes t() {
        return this.rl;
    }

    void xMQ(Drawable drawable) {
        this.rl.XQ(drawable);
    }
}
