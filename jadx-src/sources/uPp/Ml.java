package uPp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Ml extends w6 {

    public static final class j extends t2.fuX implements Ml {
        private final Throwable rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.rl, ((j) obj).rl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Throwable cause) {
            super(cause);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.rl = cause;
        }

        public int hashCode() {
            return this.rl.hashCode();
        }
    }

    public static final class n extends t2.fuX implements Ml {
        private final Throwable rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.rl, ((n) obj).rl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Throwable cause) {
            super(cause);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.rl = cause;
        }

        public int hashCode() {
            return this.rl.hashCode();
        }
    }
}
