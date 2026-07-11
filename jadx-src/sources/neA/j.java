package neA;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class j {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private static final /* synthetic */ j[] f71186GR;
    private static final /* synthetic */ EnumEntries Nxk;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71203n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f71204t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f71191O = new j("Unknown", 0, 1000, "Unknown error");
    public static final j J2 = new j("NoNetwork", 1, 1002, "No Internet Connection");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f71201r = new j("IAPVerifyPurchaseError", 2, 1007, "License Server Connection Fail");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f71200o = new j("ElementSaveFailParseError", 3, 1015, "Save element failed");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final j f71196Z = new j("ElementSaveFailDownloadError", 4, 1016, "Save download failed");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final j f71192S = new j("CodecInitFail", 5, 1037, "Codec init failed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f71199g = new j("VideoDecodeFail", 6, 1038, "Video decoding failed");
    public static final j E2 = new j("AudioCodecInitFail", 7, 1039, "Audio codec init failed");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f71198e = new j("IAPPlayServiceNoConnection", 8, 1201, "No Google Play Services Connection");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final j f71195X = new j(YmsTEL.PKkK, 9, 1202, "Google Play Services Unavailable");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final j f71193T = new j("IAPPlayServiceDeveloperError", 10, 1203, "Google Play Services Interface Error");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final j f71190N = new j("IAPPlayServiceAPIError", 11, 1204, "Google Play Services API Error");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f71202v = new j("IAPPlayServiceFeatureNotSupported", 12, 1205, "Google Play Services Missing Feature");
    public static final j Xw = new j("IAPPlayServiceAlreadyOwned", 13, 1206, "Google Play Services Unexpected Ownership State");
    public static final j jB = new j("IAPPlayServiceNotOwned", 14, 1207, "Google Play Services Unexpected Ownership State");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final j f71194U = new j("IAPPlayServiceItemUnavailable", 15, 1208, "Google Play Services Item Unavailable");
    public static final j P5 = new j("IAPPlayServiceUnexpectedNoConnection", 16, 1209, "No Google Play Services Connection");
    public static final j M7 = new j("IAPPlayServiceNoNetwork", 17, 1211, "Google Play cannot connect to the Internet");
    public static final j p5 = new j("IAPPlayServiceUserCancel", 18, 1212, "Google Play Services Unexpected State");
    public static final j eF = new j("IAPPlayServiceUnknownCode", 19, 1213, "Google Play Services Unknown Response");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final j f71184E = new j("IAPPlayServiceUnexpectedCode", 20, 1214, "Google Play Services Unexpected Code");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final j f71189M = new j("IAPException", 21, 1215, "Unknown exception");

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public static final j f71185FX = new j("IAPPlayServiceUnexpectedPurchaseState", 22, 1216, "Google Play Services Unexpected Purchase State");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final j f71182B = new j("IAPPlayServiceAcknowledgeFailed", 23, 1217, "Google Play Services Acknowledge Failure");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final j f71188J = new j("IAPAccountDocTransientError", 24, 1218, "Could not update account status (transient error)");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final j f71183D = new j("IAPAccountDocError", 25, 1219, "Could not update account status");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f71197a = new j("IAPAccountDocLogicError", 26, 1220, "Could not update account status (logic error)");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final j f71187I = new j("IAPAccountDocThrottled", 27, 1221, "Could not update account status (throttled)");

    static {
        j[] jVarArrN = n();
        f71186GR = jVarArrN;
        Nxk = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f71191O, J2, f71201r, f71200o, f71196Z, f71192S, f71199g, E2, f71198e, f71195X, f71193T, f71190N, f71202v, Xw, jB, f71194U, P5, M7, p5, eF, f71184E, f71189M, f71185FX, f71182B, f71188J, f71183D, f71197a, f71187I};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f71186GR.clone();
    }

    public final int rl() {
        return this.f71203n;
    }

    public final String t() {
        return this.f71204t;
    }

    private j(String str, int i2, int i3, String str2) {
        this.f71203n = i3;
        this.f71204t = str2;
    }
}
