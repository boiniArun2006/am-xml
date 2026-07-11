package SL;

import com.applovin.mediation.adapter.MaxAdapterError;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f9703n;
    private final String rl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f9705FX;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final /* synthetic */ j[] f9706M;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f9719n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f9720t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f9708O = new j("UNSPECIFIED", 0, -1, "unspecified");
        public static final j J2 = new j("NO_FILL", 1, 204, "noFill");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final j f9717r = new j("AD_LOAD_FAILED", 2, -5001, "adLoadFailed");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final j f9716o = new j("NETWORK_ERROR", 3, -1000, "networkError");

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final j f9713Z = new j("NETWORK_TIMEOUT", 4, -1001, "networkTimeout");

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final j f9709S = new j("NO_NETWORK", 5, -1009, "noNetwork");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final j f9715g = new j("INVALID_LOAD_STATE", 6, -5201, "invalidLoadState");
        public static final j E2 = new j("TIMEOUT", 7, MaxAdapterError.TIMEOUT.getCode(), "timeout");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f9714e = new j("NO_CONNECTION", 8, MaxAdapterError.NO_CONNECTION.getCode(), "noConnection");

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final j f9712X = new j("SERVER_ERROR", 9, MaxAdapterError.SERVER_ERROR.getCode(), "serverError");

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final j f9710T = new j("INTERNAL_ERROR", 10, MaxAdapterError.INTERNAL_ERROR.getCode(), "internalError");

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final j f9707N = new j("SIGNAL_COLLECTION_TIMEOUT", 11, MaxAdapterError.SIGNAL_COLLECTION_TIMEOUT.getCode(), "signalCollectionTimeout");

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final j f9718v = new j("SIGNAL_COLLECTION_NOT_SUPPORTED", 12, MaxAdapterError.SIGNAL_COLLECTION_NOT_SUPPORTED.getCode(), "signalCollectionNotSupported");
        public static final j Xw = new j("WEBVIEW_ERROR", 13, MaxAdapterError.WEBVIEW_ERROR.getCode(), "webviewError");
        public static final j jB = new j("AD_EXPIRED", 14, MaxAdapterError.AD_EXPIRED.getCode(), "adExpired");

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final j f9711U = new j("AD_FREQUENCY_CAPPED", 15, MaxAdapterError.AD_FREQUENCY_CAPPED.getCode(), "adFrequencyCapped");
        public static final j P5 = new j("REWARD_ERROR", 16, MaxAdapterError.REWARD_ERROR.getCode(), "rewardError");
        public static final j M7 = new j("MISSING_REQUIRED_NATIVE_AD_ASSETS", 17, MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS.getCode(), "missingRequiredNativeAdAssets");
        public static final j p5 = new j("MISSING_ACTIVITY", 18, MaxAdapterError.MISSING_ACTIVITY.getCode(), "missingActivity");
        public static final j eF = new j("AD_DISPLAY_FAILED", 19, MaxAdapterError.AD_DISPLAY_FAILED.getCode(), "adDisplayFailed");

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final j f9704E = new j("UNKNOWN", 20, 0, "unknown");

        public static EnumEntries t() {
            return f9705FX;
        }

        static {
            j[] jVarArrN = n();
            f9706M = jVarArrN;
            f9705FX = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f9708O, J2, f9717r, f9716o, f9713Z, f9709S, f9715g, E2, f9714e, f9712X, f9710T, f9707N, f9718v, Xw, jB, f9711U, P5, M7, p5, eF, f9704E};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f9706M.clone();
        }

        public final String nr() {
            return this.f9720t;
        }

        public final int rl() {
            return this.f9719n;
        }

        private j(String str, int i2, int i3, String str2) {
            this.f9719n = i3;
            this.f9720t = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return this.f9703n == ml.f9703n && Intrinsics.areEqual(this.rl, ml.rl);
    }

    public Ml(j type, String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f9703n = type;
        this.rl = message;
    }

    public int hashCode() {
        return (this.f9703n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final j rl() {
        return this.f9703n;
    }

    public String toString() {
        return "MaxLoadError(type=" + this.f9703n + ", message=" + this.rl + ")";
    }
}
