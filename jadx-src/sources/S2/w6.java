package S2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 {

    public static final class Ml extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f8922n;

        public Ml(int i2) {
            super(null);
            this.f8922n = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && this.f8922n == ((Ml) obj).f8922n;
        }

        public int hashCode() {
            return Integer.hashCode(this.f8922n);
        }

        public final int n() {
            return this.f8922n;
        }

        public String toString() {
            return "SetupError(responseCode=" + this.f8922n + ")";
        }
    }

    public static final class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f8923n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "MissingDetails";
        }

        public int hashCode() {
            return -1911195357;
        }
    }

    public static final class n extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f8924n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f8924n, ((n) obj).f8924n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Throwable cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f8924n = cause;
        }

        public int hashCode() {
            return this.f8924n.hashCode();
        }

        public final Throwable n() {
            return this.f8924n;
        }

        public String toString() {
            return "RetrievalError(cause=" + this.f8924n + ")";
        }
    }

    /* JADX INFO: renamed from: S2.w6$w6, reason: collision with other inner class name */
    public static final class C0302w6 extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0302w6 f8925n = new C0302w6();

        private C0302w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0302w6);
        }

        public String toString() {
            return "ServiceDisconnected";
        }

        public int hashCode() {
            return -1921510711;
        }
    }

    public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w6() {
    }
}
