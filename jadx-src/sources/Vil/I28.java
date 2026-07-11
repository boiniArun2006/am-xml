package Vil;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewPropertyAnimator f11054n;

    public static abstract class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f11055n;
        private final long nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f11056t;

        /* JADX INFO: renamed from: Vil.I28$j$j, reason: collision with other inner class name */
        public static final class C0396j extends j {
            private final long J2;
            private final long KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final long f11057O;
            private final long Uo;

            public /* synthetic */ C0396j(long j2, long j3, long j4, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3, (i2 & 4) != 0 ? 0L : j4, (i2 & 8) != 0 ? 0L : j5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0396j)) {
                    return false;
                }
                C0396j c0396j = (C0396j) obj;
                return this.f11057O == c0396j.f11057O && this.J2 == c0396j.J2 && this.Uo == c0396j.Uo && this.KN == c0396j.KN;
            }

            public C0396j(long j2, long j3, long j4, long j5) {
                super(j2, j3, j4, j5, null);
                this.f11057O = j2;
                this.J2 = j3;
                this.Uo = j4;
                this.KN = j5;
            }

            public int hashCode() {
                return (((((Long.hashCode(this.f11057O) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Long.hashCode(this.KN);
            }

            @Override // Vil.I28.j
            public long n() {
                return this.Uo;
            }

            @Override // Vil.I28.j
            public long nr() {
                return this.f11057O;
            }

            @Override // Vil.I28.j
            public long rl() {
                return this.J2;
            }

            @Override // Vil.I28.j
            public long t() {
                return this.KN;
            }

            public String toString() {
                return "Fading(startDelay=" + this.f11057O + ", inDuration=" + this.J2 + ", duration=" + this.Uo + ", outDuration=" + this.KN + ")";
            }
        }

        public static final class n extends j {
            private final long J2;
            private final long KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final long f11058O;
            private final long Uo;
            private final float mUb;
            private final float xMQ;

            public /* synthetic */ n(long j2, long j3, long j4, long j5, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3, (i2 & 4) != 0 ? 0L : j4, (i2 & 8) != 0 ? 0L : j5, (i2 & 16) != 0 ? 0.0f : f3, (i2 & 32) != 0 ? 0.0f : f4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return this.f11058O == nVar.f11058O && this.J2 == nVar.J2 && this.Uo == nVar.Uo && this.KN == nVar.KN && Float.compare(this.xMQ, nVar.xMQ) == 0 && Float.compare(this.mUb, nVar.mUb) == 0;
            }

            public n(long j2, long j3, long j4, long j5, float f3, float f4) {
                super(j2, j3, j4, j5, null);
                this.f11058O = j2;
                this.J2 = j3;
                this.Uo = j4;
                this.KN = j5;
                this.xMQ = f3;
                this.mUb = f4;
            }

            public final float J2() {
                return this.mUb;
            }

            public final float O() {
                return this.xMQ;
            }

            public int hashCode() {
                return (((((((((Long.hashCode(this.f11058O) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Long.hashCode(this.KN)) * 31) + Float.hashCode(this.xMQ)) * 31) + Float.hashCode(this.mUb);
            }

            @Override // Vil.I28.j
            public long n() {
                return this.Uo;
            }

            @Override // Vil.I28.j
            public long nr() {
                return this.f11058O;
            }

            @Override // Vil.I28.j
            public long rl() {
                return this.J2;
            }

            @Override // Vil.I28.j
            public long t() {
                return this.KN;
            }

            public String toString() {
                return "Sliding(startDelay=" + this.f11058O + ", inDuration=" + this.J2 + ", duration=" + this.Uo + ", outDuration=" + this.KN + ", xOffset=" + this.xMQ + ", yOffset=" + this.mUb + ")";
            }
        }

        public /* synthetic */ j(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, j4, j5);
        }

        public abstract long n();

        public abstract long nr();

        public abstract long rl();

        public abstract long t();

        private j(long j2, long j3, long j4, long j5) {
            this.f11055n = j2;
            this.rl = j3;
            this.f11056t = j4;
            this.nr = j5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(View view, I28 i28) {
        view.setVisibility(4);
        i28.f11054n = null;
    }

    public final void t(String string, TextView textView, final View containerView, final j transition) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        ViewPropertyAnimator viewPropertyAnimator = this.f11054n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        textView.setText(string);
        containerView.setVisibility(0);
        if (transition instanceof j.n) {
            j.n nVar = (j.n) transition;
            containerView.setTranslationX(nVar.O());
            containerView.setTranslationY(nVar.J2());
        } else {
            containerView.setAlpha(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = containerView.animate();
        viewPropertyAnimatorAnimate.setStartDelay(transition.nr());
        viewPropertyAnimatorAnimate.setDuration(transition.rl());
        if (transition instanceof j.n) {
            j.n nVar2 = (j.n) transition;
            viewPropertyAnimatorAnimate.xBy(-nVar2.O());
            viewPropertyAnimatorAnimate.yBy(-nVar2.J2());
        } else {
            viewPropertyAnimatorAnimate.alpha(1.0f);
        }
        viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: Vil.w6
            @Override // java.lang.Runnable
            public final void run() {
                I28.nr(viewPropertyAnimatorAnimate, transition, containerView, this);
            }
        });
        viewPropertyAnimatorAnimate.start();
        this.f11054n = viewPropertyAnimatorAnimate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(ViewPropertyAnimator viewPropertyAnimator, j jVar, final View view, final I28 i28) {
        viewPropertyAnimator.setStartDelay(jVar.n());
        viewPropertyAnimator.setDuration(jVar.t());
        if (jVar instanceof j.n) {
            j.n nVar = (j.n) jVar;
            viewPropertyAnimator.xBy(nVar.O());
            viewPropertyAnimator.yBy(nVar.J2());
        } else {
            viewPropertyAnimator.alpha(0.0f);
        }
        viewPropertyAnimator.withEndAction(new Runnable() { // from class: Vil.Ml
            @Override // java.lang.Runnable
            public final void run() {
                I28.O(view, i28);
            }
        });
        viewPropertyAnimator.start();
    }
}
