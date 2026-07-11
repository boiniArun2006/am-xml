package x0X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f75185n = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr() {
            return "Value must not be null";
        }

        public static /* synthetic */ n t(j jVar, Object obj, Function0 function0, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                function0 = new Function0() { // from class: x0X.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.j.nr();
                    }
                };
            }
            return jVar.rl(obj, function0);
        }

        public final n rl(Object obj, Function0 lazyMessage) {
            Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
            return obj != null ? new w6(obj) : new C1266n(new IllegalStateException((String) lazyMessage.invoke()));
        }
    }

    /* JADX INFO: renamed from: x0X.n$n, reason: collision with other inner class name */
    public static final class C1266n extends n {
        private final Object rl;

        public C1266n(Object obj) {
            super(null);
            this.rl = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1266n) && Intrinsics.areEqual(this.rl, ((C1266n) obj).rl);
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
            return "Error(error=" + this.rl + ")";
        }
    }

    public static final class w6 extends n {
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
            return "Success(value=" + this.rl + ")";
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
