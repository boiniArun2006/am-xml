package uPp;

import androidx.core.database.sqlite.cL.PtsLKY;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface I28 extends uPp.n, o, uPp.j {

    /* JADX INFO: renamed from: uPp.I28$I28, reason: collision with other inner class name */
    public static final class C1226I28 extends t2.fuX implements I28 {
        private final Throwable rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1226I28) && Intrinsics.areEqual(this.rl, ((C1226I28) obj).rl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1226I28(Throwable cause) {
            super(cause);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.rl = cause;
        }

        public int hashCode() {
            return this.rl.hashCode();
        }
    }

    public static final class Ml implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SecurityException f74411n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f74411n, ((Ml) obj).f74411n);
        }

        public Ml(SecurityException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74411n = cause;
        }

        public int hashCode() {
            return this.f74411n.hashCode();
        }

        public String toString() {
            return "SecurityError(cause=" + this.f74411n + ')';
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FileNotFoundException f74412n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f74412n, ((j) obj).f74412n);
        }

        public j(FileNotFoundException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74412n = cause;
        }

        public int hashCode() {
            return this.f74412n.hashCode();
        }

        public String toString() {
            return PtsLKY.amzyrCbIWo + this.f74412n + ')';
        }
    }

    public static final class n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final IOException f74413n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f74413n, ((n) obj).f74413n);
        }

        public n(IOException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74413n = cause;
        }

        public int hashCode() {
            return this.f74413n.hashCode();
        }

        public String toString() {
            return "GenericIO(cause=" + this.f74413n + ')';
        }
    }

    public static final class w6 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f74414n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f74414n, ((w6) obj).f74414n);
        }

        public w6(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74414n = cause;
        }

        public int hashCode() {
            return this.f74414n.hashCode();
        }

        public String toString() {
            return "MalformedFile(cause=" + this.f74414n + ')';
        }
    }
}
