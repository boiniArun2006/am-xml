package YV;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f12097t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12098n;
    private final String rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final CN3 J2(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new CN3("PURCHASE_FAILED", "The purchase failed with an error: " + message);
        }

        public final CN3 KN() {
            return new CN3("VERIFICATION_FAILED", "Verification with external purchase verifier failed.");
        }

        public final CN3 O() {
            return new CN3("PRODUCT_FETCH_FAILED", "The requested product could not be found.");
        }

        public final CN3 Uo() {
            return new CN3("UNSPECIFIED_PURCHASE_STATE", "Received a purchase with unspecified state.");
        }

        public final CN3 n() {
            return new CN3("PRODUCT_FETCH_FAILED_BATCH", "None of the requested products were found.");
        }

        public final CN3 nr(String productId, Throwable error) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(error, "error");
            return new CN3("PRODUCT_CONVERSION_FAILED", "Fetched product details for " + productId + " but failed to convert to a SubscriptionProduct: " + error);
        }

        public final CN3 rl() {
            return new CN3("BILLING_CLIENT_DISCONNECTED", "Operation failed because Monopoly was not connected to the billing client.");
        }

        public final CN3 t() {
            return new CN3("NO_PURCHASES_TO_VERIFY", "Failed to verify purchases because there were none to verify.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f12098n, cn3.f12098n) && Intrinsics.areEqual(this.rl, cn3.rl);
    }

    public CN3(String code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f12098n = code;
        this.rl = message;
    }

    public int hashCode() {
        return (this.f12098n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f12098n;
    }

    public final String rl() {
        return this.rl;
    }

    public String toString() {
        return "MonopolyError(code=" + this.f12098n + ", message=" + this.rl + ")";
    }
}
