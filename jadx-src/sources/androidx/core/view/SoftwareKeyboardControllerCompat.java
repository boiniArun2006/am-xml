package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class SoftwareKeyboardControllerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Impl f36755n;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    static class Impl20 extends Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f36756n;

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void n() {
            View view = this.f36756n;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f36756n.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void rl() {
            final View viewFindViewById = this.f36756n;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f36756n.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.Xo
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }

        Impl20(View view) {
            this.f36756n = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    static class Impl30 extends Impl20 {
        private View rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private WindowInsetsController f36757t;

        Impl30(View view) {
            super(view);
            this.rl = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void n() {
            View view;
            WindowInsetsController windowInsetsController = this.f36757t;
            if (windowInsetsController == null) {
                View view2 = this.rl;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.n();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.s4
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i2) {
                    atomicBoolean.set((i2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.rl) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.rl.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void rl() {
            View view = this.rl;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f36757t;
            if (windowInsetsController == null) {
                View view2 = this.rl;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.rl();
        }

        Impl30(WindowInsetsController windowInsetsController) {
            super(null);
            this.f36757t = windowInsetsController;
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f36755n = new Impl30(view);
        } else {
            this.f36755n = new Impl20(view);
        }
    }

    private static class Impl {
        void n() {
        }

        void rl() {
        }

        Impl() {
        }
    }

    public void n() {
        this.f36755n.n();
    }

    public void rl() {
        this.f36755n.rl();
    }

    SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        this.f36755n = new Impl30(windowInsetsController);
    }
}
