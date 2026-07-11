package R5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    public static final class I28 extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f8673n = new I28();

        private I28() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public String toString() {
            return "WatchAd";
        }

        public int hashCode() {
            return 308880544;
        }
    }

    public static final class Ml extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f8674n = new Ml();

        private Ml() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        public String toString() {
            return "ShowPendingPurchaseDialog";
        }

        public int hashCode() {
            return 1951868913;
        }
    }

    public static final class j extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f8675n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "CancelAndClose";
        }

        public int hashCode() {
            return 424867821;
        }
    }

    /* JADX INFO: renamed from: R5.n$n, reason: collision with other inner class name */
    public static final class C0299n extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f8676n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0299n) && Intrinsics.areEqual(this.f8676n, ((C0299n) obj).f8676n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0299n(String sku) {
            super(null);
            Intrinsics.checkNotNullParameter(sku, "sku");
            this.f8676n = sku;
        }

        public int hashCode() {
            return this.f8676n.hashCode();
        }

        public final String n() {
            return this.f8676n;
        }

        public String toString() {
            return "OpenSubscriptionManagement(sku=" + this.f8676n + ")";
        }
    }

    public static final class w6 extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f8677n;

        public w6(long j2) {
            super(null);
            this.f8677n = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && this.f8677n == ((w6) obj).f8677n;
        }

        public int hashCode() {
            return Long.hashCode(this.f8677n);
        }

        public final long n() {
            return this.f8677n;
        }

        public String toString() {
            return "SetResult(benefits=" + this.f8677n + ")";
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
