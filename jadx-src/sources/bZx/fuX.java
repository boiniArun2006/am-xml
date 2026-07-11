package bZx;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f43348n = new fuX();

    public static final class j implements View.OnTouchListener {
        private final View.OnTouchListener J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final WeakReference f43349O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Zfb.j f43350n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f43351r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final WeakReference f43352t;

        public j(Zfb.j mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f43350n = mapping;
            this.f43352t = new WeakReference(hostView);
            this.f43349O = new WeakReference(rootView);
            this.J2 = Zfb.Wre.KN(hostView);
            this.f43351r = true;
        }

        public final boolean n() {
            return this.f43351r;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = (View) this.f43349O.get();
            View view3 = (View) this.f43352t.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                n.nr(this.f43350n, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.J2;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    public static final j n(Zfb.j mapping, View rootView, View hostView) {
        if (VmF.j.nr(fuX.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new j(mapping, rootView, hostView);
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
            return null;
        }
    }

    private fuX() {
    }
}
