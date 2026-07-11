package fE;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Pl {

    public static final class j extends Pl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f66642n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f66642n, ((j) obj).f66642n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String purchaseToken) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
            this.f66642n = purchaseToken;
        }

        public int hashCode() {
            return this.f66642n.hashCode();
        }

        public final String n() {
            return this.f66642n;
        }

        public String toString() {
            return "Pending(purchaseToken=" + this.f66642n + ")";
        }
    }

    public static final class n extends Pl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f66643n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f66643n, ((n) obj).f66643n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String purchaseToken) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
            this.f66643n = purchaseToken;
        }

        public int hashCode() {
            return this.f66643n.hashCode();
        }

        public final String n() {
            return this.f66643n;
        }

        public String toString() {
            return "Purchased(purchaseToken=" + this.f66643n + ")";
        }
    }

    public static final class w6 extends Pl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f66644n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "UserCancelled";
        }

        public int hashCode() {
            return 1676781860;
        }
    }

    public /* synthetic */ Pl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Pl() {
    }
}
