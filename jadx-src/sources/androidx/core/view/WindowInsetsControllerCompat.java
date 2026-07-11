package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class WindowInsetsControllerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Impl f36833n;

    @RequiresApi
    private static class Impl20 extends Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final Window f36834n;
        private final SoftwareKeyboardControllerCompat rl;

        private void J2(int i2) {
            if (i2 == 1) {
                Uo(4);
            } else if (i2 == 2) {
                Uo(2);
            } else {
                if (i2 != 8) {
                    return;
                }
                this.rl.n();
            }
        }

        private void xMQ(int i2) {
            if (i2 == 1) {
                mUb(4);
                gh(1024);
            } else if (i2 == 2) {
                mUb(2);
            } else {
                if (i2 != 8) {
                    return;
                }
                this.rl.rl();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void O(int i2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    xMQ(i3);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void n(int i2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    J2(i3);
                }
            }
        }

        protected void KN(int i2) {
            this.f36834n.addFlags(i2);
        }

        protected void Uo(int i2) {
            View decorView = this.f36834n.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        protected void gh(int i2) {
            this.f36834n.clearFlags(i2);
        }

        protected void mUb(int i2) {
            View decorView = this.f36834n.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void nr(int i2) {
            this.f36834n.getDecorView().setTag(356039078, Integer.valueOf(i2));
            if (i2 == 0) {
                mUb(6144);
                return;
            }
            if (i2 == 1) {
                mUb(4096);
                Uo(2048);
            } else {
                if (i2 != 2) {
                    return;
                }
                mUb(2048);
                Uo(4096);
            }
        }

        Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f36834n = window;
            this.rl = softwareKeyboardControllerCompat;
        }
    }

    @RequiresApi
    private static class Impl23 extends Impl20 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void t(boolean z2) {
            if (!z2) {
                mUb(8192);
                return;
            }
            gh(androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON);
            KN(Integer.MIN_VALUE);
            Uo(8192);
        }

        Impl23(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }
    }

    @RequiresApi
    private static class Impl26 extends Impl23 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void rl(boolean z2) {
            if (!z2) {
                mUb(16);
                return;
            }
            gh(134217728);
            KN(Integer.MIN_VALUE);
            Uo(16);
        }

        Impl26(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }
    }

    @RequiresApi
    private static class Impl30 extends Impl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        protected Window f36835O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final WindowInsetsControllerCompat f36836n;
        private final SimpleArrayMap nr;
        final WindowInsetsController rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final SoftwareKeyboardControllerCompat f36837t;

        /* JADX INFO: renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1, reason: invalid class name */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private WindowInsetsAnimationControllerCompat f36838n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ WindowInsetsAnimationControlListenerCompat f36839t;

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f36839t.n(windowInsetsAnimationController == null ? null : this.f36838n);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f36839t.t(this.f36838n);
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                this.f36838n = windowInsetsAnimationControllerCompat;
                this.f36839t.rl(windowInsetsAnimationControllerCompat, i2);
            }
        }

        Impl30(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(window.getInsetsController(), windowInsetsControllerCompat, softwareKeyboardControllerCompat);
            this.f36835O = window;
        }

        protected void J2(int i2) {
            View decorView = this.f36835O.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void O(int i2) {
            if ((i2 & 8) != 0) {
                this.f36837t.rl();
            }
            this.rl.show(i2 & (-9));
        }

        protected void Uo(int i2) {
            View decorView = this.f36835O.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void n(int i2) {
            if ((i2 & 8) != 0) {
                this.f36837t.n();
            }
            this.rl.hide(i2 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void nr(int i2) {
            Window window = this.f36835O;
            if (window == null) {
                this.rl.setSystemBarsBehavior(i2);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i2));
            if (i2 == 0) {
                Uo(6144);
                return;
            }
            if (i2 == 1) {
                Uo(4096);
                J2(2048);
            } else {
                if (i2 != 2) {
                    return;
                }
                Uo(2048);
                J2(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void rl(boolean z2) {
            if (z2) {
                if (this.f36835O != null) {
                    J2(16);
                }
                this.rl.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f36835O != null) {
                    Uo(16);
                }
                this.rl.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void t(boolean z2) {
            if (z2) {
                if (this.f36835O != null) {
                    J2(8192);
                }
                this.rl.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f36835O != null) {
                    Uo(8192);
                }
                this.rl.setSystemBarsAppearance(0, 8);
            }
        }

        Impl30(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.nr = new SimpleArrayMap();
            this.rl = windowInsetsController;
            this.f36836n = windowInsetsControllerCompat;
            this.f36837t = softwareKeyboardControllerCompat;
        }
    }

    @RequiresApi
    private static class Impl31 extends Impl30 {
        Impl31(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        Impl31(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(windowInsetsController, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        void nr(int i2) {
            this.rl.setSystemBarsBehavior(i2);
        }
    }

    @RequiresApi
    private static class Impl35 extends Impl31 {
        Impl35(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        Impl35(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(windowInsetsController, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }
    }

    public interface OnControllableInsetsChangedListener {
    }

    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f36833n = new Impl35(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
        } else {
            this.f36833n = new Impl30(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
        }
    }

    private static class Impl {
        void O(int i2) {
        }

        void n(int i2) {
        }

        void nr(int i2) {
        }

        public void rl(boolean z2) {
        }

        public void t(boolean z2) {
        }

        Impl() {
        }
    }

    public static WindowInsetsControllerCompat J2(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void O(int i2) {
        this.f36833n.O(i2);
    }

    public void n(int i2) {
        this.f36833n.n(i2);
    }

    public void nr(int i2) {
        this.f36833n.nr(i2);
    }

    public void rl(boolean z2) {
        this.f36833n.rl(z2);
    }

    public void t(boolean z2) {
        this.f36833n.t(z2);
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.f36833n = new Impl35(window, this, softwareKeyboardControllerCompat);
            return;
        }
        if (i2 >= 30) {
            this.f36833n = new Impl30(window, this, softwareKeyboardControllerCompat);
        } else if (i2 >= 26) {
            this.f36833n = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.f36833n = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }
}
