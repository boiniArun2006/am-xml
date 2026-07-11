package sJa;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f73200n = n.f73201n;

    public interface j {
        Object n(Continuation continuation);
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ n f73201n = new n();

        public final I28 n(q3M.n delayProvider, Ml dispatcherProvider, j codeBlock) {
            Intrinsics.checkNotNullParameter(delayProvider, "delayProvider");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(codeBlock, "codeBlock");
            return Wre.f73205n.n(dispatcherProvider).n(delayProvider, codeBlock);
        }

        private n() {
        }
    }

    public static abstract class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f73202n = new j(null);

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }
        }

        public static final class n extends w6 {
            public static final n rl = new n();

            private n() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: sJa.I28$w6$w6, reason: collision with other inner class name */
        public static final class C1165w6 extends w6 {
            private final Object rl;

            public C1165w6(Object obj) {
                super(null);
                this.rl = obj;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1165w6) && Intrinsics.areEqual(this.rl, ((C1165w6) obj).rl);
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
                return "Repeat(delayConditioner=" + this.rl + ")";
            }
        }

        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }
    }

    Object n(Continuation continuation);

    void start();
}
