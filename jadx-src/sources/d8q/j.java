package d8q;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: d8q.j$j, reason: collision with other inner class name */
    public static final class C0835j extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f63459n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0835j) && Intrinsics.areEqual(this.f63459n, ((C0835j) obj).f63459n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0835j(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f63459n = throwable;
        }

        public int hashCode() {
            return this.f63459n.hashCode();
        }

        public String toString() {
            return "IOError(throwable=" + this.f63459n + ")";
        }
    }

    public static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f63460n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f63460n, ((n) obj).f63460n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f63460n = throwable;
        }

        public int hashCode() {
            return this.f63460n.hashCode();
        }

        public String toString() {
            return "NetworkError(throwable=" + this.f63460n + ")";
        }
    }

    public static final class w6 extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f63461n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f63461n, ((w6) obj).f63461n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f63461n = throwable;
        }

        public int hashCode() {
            return this.f63461n.hashCode();
        }

        public String toString() {
            return "RemoteError(throwable=" + this.f63461n + ")";
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
