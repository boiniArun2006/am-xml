package com.bendingspoons.secretmenu.ui.overlay.view;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface j {

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final DSG.j f51565n;
        private final Function0 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function1 f51566t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f51565n, nVar.f51565n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f51566t, nVar.f51566t);
        }

        public int hashCode() {
            return (((this.f51565n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f51566t.hashCode();
        }

        public String toString() {
            return "Visible(initialPosition=" + this.f51565n + ", onClick=" + this.rl + ", onDragCompleted=" + this.f51566t + ")";
        }

        public n(DSG.j initialPosition, Function0 onClick, Function1 onDragCompleted) {
            Intrinsics.checkNotNullParameter(initialPosition, "initialPosition");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            Intrinsics.checkNotNullParameter(onDragCompleted, "onDragCompleted");
            this.f51565n = initialPosition;
            this.rl = onClick;
            this.f51566t = onDragCompleted;
        }

        public final DSG.j n() {
            return this.f51565n;
        }

        public final Function0 rl() {
            return this.rl;
        }

        public final Function1 t() {
            return this.f51566t;
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.secretmenu.ui.overlay.view.j$j, reason: collision with other inner class name */
    public static final class C0737j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0737j f51564n = new C0737j();

        private C0737j() {
        }
    }
}
