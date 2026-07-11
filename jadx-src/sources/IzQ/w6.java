package IzQ;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.view.BackEventCompat;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f4408n;
    private final IzQ.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View f4409t;

    private interface Ml {
        void n(View view);

        void rl(IzQ.n nVar, View view, boolean z2);
    }

    private static class n implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private OnBackInvokedCallback f4410n;

        private n() {
        }

        boolean nr() {
            return this.f4410n != null;
        }

        @Override // IzQ.w6.Ml
        @DoNotInline
        public void rl(@NonNull IzQ.n nVar, @NonNull View view, boolean z2) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f4410n == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackT = t(nVar);
                this.f4410n = onBackInvokedCallbackT;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z2 ? 1000000 : 0, onBackInvokedCallbackT);
            }
        }

        @Override // IzQ.w6.Ml
        @DoNotInline
        public void n(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4410n);
                this.f4410n = null;
            }
        }

        OnBackInvokedCallback t(final IzQ.n nVar) {
            Objects.requireNonNull(nVar);
            return new OnBackInvokedCallback() { // from class: IzQ.I28
                public final void onBackInvoked() {
                    nVar.O();
                }
            };
        }
    }

    /* JADX INFO: renamed from: IzQ.w6$w6, reason: collision with other inner class name */
    private static class C0150w6 extends n {

        /* JADX INFO: renamed from: IzQ.w6$w6$j */
        class j implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ IzQ.n f4411n;

            j(IzQ.n nVar) {
                this.f4411n = nVar;
            }

            public void onBackCancelled() {
                if (C0150w6.this.nr()) {
                    this.f4411n.rl();
                }
            }

            public void onBackInvoked() {
                this.f4411n.O();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0150w6.this.nr()) {
                    this.f4411n.nr(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0150w6.this.nr()) {
                    this.f4411n.t(new BackEventCompat(backEvent));
                }
            }
        }

        private C0150w6() {
            super();
        }

        @Override // IzQ.w6.n
        OnBackInvokedCallback t(IzQ.n nVar) {
            return new j(nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w6(View view) {
        this((IzQ.n) view, view);
    }

    public void nr() {
        t(true);
    }

    public w6(IzQ.n nVar, View view) {
        this.f4408n = n();
        this.rl = nVar;
        this.f4409t = view;
    }

    private static Ml n() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            return new C0150w6();
        }
        if (i2 >= 33) {
            return new n();
        }
        return null;
    }

    private void t(boolean z2) {
        Ml ml = this.f4408n;
        if (ml != null) {
            ml.rl(this.rl, this.f4409t, z2);
        }
    }

    public void O() {
        Ml ml = this.f4408n;
        if (ml != null) {
            ml.n(this.f4409t);
        }
    }

    public boolean rl() {
        return this.f4408n != null;
    }
}
