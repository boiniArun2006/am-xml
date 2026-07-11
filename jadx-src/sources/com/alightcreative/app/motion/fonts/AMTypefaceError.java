package com.alightcreative.app.motion.fonts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0002\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/fonts/AMTypefaceError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", c.f62177j, "j", "AMMissingTypefaceError", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AMTypefaceError extends Exception {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AMTypefaceError f45778t = new AMTypefaceError("Null typeface");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final AMTypefaceError f45768O = new AMTypefaceError("Network error");
    private static final AMTypefaceError J2 = new AMTypefaceError("Imported font missing");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final AMTypefaceError f45777r = new AMTypefaceError("Imported font not valid TTF or OTF file");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AMTypefaceError f45776o = new AMTypefaceError("Google API returned null");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final AMTypefaceError f45772Z = new AMTypefaceError("Google API returned PROVIDER_NOT_FOUND");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final AMTypefaceError f45769S = new AMTypefaceError("Google API returned FONT_NOT_FOUND");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AMTypefaceError f45774g = new AMTypefaceError("Google API returned FONT_LOAD_ERROR");
    private static final AMTypefaceError E2 = new AMTypefaceError("Google API returned FONT_UNAVAILABLE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AMTypefaceError f45773e = new AMTypefaceError("Google API returned MALFORMED_QUERY");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final AMTypefaceError f45771X = new AMTypefaceError("Google API returned WRONG_CERTIFICATES");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final AMTypefaceError f45770T = new AMTypefaceError("Null request");

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/fonts/AMTypefaceError$AMMissingTypefaceError;", "Lcom/alightcreative/app/motion/fonts/AMTypefaceError;", "", "missingTypefaceDisplayName", "<init>", "(Ljava/lang/String;)V", "N", "Ljava/lang/String;", "az", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AMMissingTypefaceError extends AMTypefaceError {

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private final String missingTypefaceDisplayName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AMMissingTypefaceError(String missingTypefaceDisplayName) {
            super("Missing typeface: " + missingTypefaceDisplayName, null);
            Intrinsics.checkNotNullParameter(missingTypefaceDisplayName, "missingTypefaceDisplayName");
            this.missingTypefaceDisplayName = missingTypefaceDisplayName;
        }

        /* JADX INFO: renamed from: az, reason: from getter */
        public final String getMissingTypefaceDisplayName() {
            return this.missingTypefaceDisplayName;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.fonts.AMTypefaceError$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AMTypefaceError az(int i2) {
            return new AMTypefaceError("Google API returned: " + i2, null);
        }

        public final AMTypefaceError J2() {
            return AMTypefaceError.f45771X;
        }

        public final AMTypefaceError KN() {
            return AMTypefaceError.f45777r;
        }

        public final AMTypefaceError O() {
            return AMTypefaceError.f45772Z;
        }

        public final AMTypefaceError Uo() {
            return AMTypefaceError.f45776o;
        }

        public final AMTypefaceError gh() {
            return AMTypefaceError.f45770T;
        }

        public final AMTypefaceError mUb() {
            return AMTypefaceError.f45768O;
        }

        public final AMTypefaceError n() {
            return AMTypefaceError.f45774g;
        }

        public final AMTypefaceError nr() {
            return AMTypefaceError.f45773e;
        }

        public final AMTypefaceError qie() {
            return AMTypefaceError.f45778t;
        }

        public final AMTypefaceError rl() {
            return AMTypefaceError.f45769S;
        }

        public final AMTypefaceError t() {
            return AMTypefaceError.E2;
        }

        public final AMTypefaceError xMQ() {
            return AMTypefaceError.J2;
        }
    }

    public /* synthetic */ AMTypefaceError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AMTypefaceError(String str) {
        super(str);
    }
}
