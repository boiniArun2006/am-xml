package com.alightcreative.app.motion.activities.edit.widgets;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    public static final class j extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Set f45189n;
        private final Set rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f45189n, jVar.f45189n) && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public int hashCode() {
            return (this.f45189n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "FrameChangeMarker(oldFrames=" + this.f45189n + ", newFrames=" + this.rl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Set oldFrames, Set newFrames) {
            super(null);
            Intrinsics.checkNotNullParameter(oldFrames, "oldFrames");
            Intrinsics.checkNotNullParameter(newFrames, "newFrames");
            this.f45189n = oldFrames;
            this.rl = newFrames;
        }

        public final Set n() {
            return this.rl;
        }

        public final Set rl() {
            return this.f45189n;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.edit.widgets.n$n, reason: collision with other inner class name */
    public static final class C0633n extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f45190n;

        public C0633n(int i2) {
            super(null);
            this.f45190n = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0633n) && this.f45190n == ((C0633n) obj).f45190n;
        }

        public int hashCode() {
            return Integer.hashCode(this.f45190n);
        }

        public String toString() {
            return "KeyframeMarker(frame=" + this.f45190n + ")";
        }

        public final int n() {
            return this.f45190n;
        }
    }

    public static final class w6 extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f45191n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public int hashCode() {
            return 51497106;
        }

        public String toString() {
            return "PlayheadAndCurrentTime";
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
