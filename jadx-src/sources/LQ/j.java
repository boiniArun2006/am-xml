package LQ;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0208j f6082n = new C0208j(null);

    /* JADX INFO: renamed from: LQ.j$j, reason: collision with other inner class name */
    public static final class C0208j {
        public /* synthetic */ C0208j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0208j() {
        }
    }

    public static final class n extends j {
        private final Object rl;

        public n(Object obj) {
            super(null);
            this.rl = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.rl, ((n) obj).rl);
        }

        public int hashCode() {
            Object obj = this.rl;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final Object n() {
            return this.rl;
        }

        public String toString() {
            return "Failure(failure=" + this.rl + ')';
        }
    }

    public static final class w6 extends j {
        private final Object rl;

        public w6(Object obj) {
            super(null);
            this.rl = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.rl, ((w6) obj).rl);
        }

        public int hashCode() {
            Object obj = this.rl;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final Object n() {
            return this.rl;
        }

        public String toString() {
            return "Success(value=" + this.rl + ')';
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
