package androidx.compose.ui.autofill;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated(message = "Use the new semantics-based API and androidx.compose.ui.autofill.ContentType instead.")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b'\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Landroidx/compose/ui/autofill/AutofillType;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "O", "J2", "r", "o", "Z", "S", "g", "E2", "e", "X", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "N", "v", "Xw", "jB", "U", "P5", "M7", "p5", "eF", "E", "M", "FX", "B", "J", "D", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "I", "GR", "Nxk", "Y", "k", "dR0", "z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AutofillType {
    private static final /* synthetic */ EnumEntries ijL;
    private static final /* synthetic */ AutofillType[] piY;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AutofillType f31150n = new AutofillType("EmailAddress", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AutofillType f31153t = new AutofillType("Username", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final AutofillType f31139O = new AutofillType("Password", 2);
    public static final AutofillType J2 = new AutofillType("NewUsername", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AutofillType f31152r = new AutofillType("NewPassword", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AutofillType f31151o = new AutofillType("PostalAddress", 5);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final AutofillType f31145Z = new AutofillType("PostalCode", 6);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final AutofillType f31140S = new AutofillType("CreditCardNumber", 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AutofillType f31148g = new AutofillType("CreditCardSecurityCode", 8);
    public static final AutofillType E2 = new AutofillType("CreditCardExpirationDate", 9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AutofillType f31147e = new AutofillType("CreditCardExpirationMonth", 10);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final AutofillType f31143X = new AutofillType("CreditCardExpirationYear", 11);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final AutofillType f31141T = new AutofillType("CreditCardExpirationDay", 12);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final AutofillType f31138N = new AutofillType("AddressCountry", 13);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AutofillType f31154v = new AutofillType("AddressRegion", 14);
    public static final AutofillType Xw = new AutofillType("AddressLocality", 15);
    public static final AutofillType jB = new AutofillType("AddressStreet", 16);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final AutofillType f31142U = new AutofillType("AddressAuxiliaryDetails", 17);
    public static final AutofillType P5 = new AutofillType("PostalCodeExtended", 18);
    public static final AutofillType M7 = new AutofillType("PersonFullName", 19);
    public static final AutofillType p5 = new AutofillType("PersonFirstName", 20);
    public static final AutofillType eF = new AutofillType("PersonLastName", 21);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final AutofillType f31132E = new AutofillType("PersonMiddleName", 22);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final AutofillType f31137M = new AutofillType("PersonMiddleInitial", 23);

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public static final AutofillType f31133FX = new AutofillType("PersonNamePrefix", 24);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AutofillType f31130B = new AutofillType("PersonNameSuffix", 25);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final AutofillType f31136J = new AutofillType("PhoneNumber", 26);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final AutofillType f31131D = new AutofillType("PhoneNumberDevice", 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutofillType f31146a = new AutofillType("PhoneCountryCode", 28);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final AutofillType f31135I = new AutofillType("PhoneNumberNational", 29);

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    public static final AutofillType f31134GR = new AutofillType("Gender", 30);
    public static final AutofillType Nxk = new AutofillType("BirthDateFull", 31);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AutofillType f31144Y = new AutofillType("BirthDateDay", 32);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AutofillType f31149k = new AutofillType("BirthDateMonth", 33);
    public static final AutofillType dR0 = new AutofillType("BirthDateYear", 34);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AutofillType f31155z = new AutofillType("SmsOtpCode", 35);

    private static final /* synthetic */ AutofillType[] n() {
        return new AutofillType[]{f31150n, f31153t, f31139O, J2, f31152r, f31151o, f31145Z, f31140S, f31148g, E2, f31147e, f31143X, f31141T, f31138N, f31154v, Xw, jB, f31142U, P5, M7, p5, eF, f31132E, f31137M, f31133FX, f31130B, f31136J, f31131D, f31146a, f31135I, f31134GR, Nxk, f31144Y, f31149k, dR0, f31155z};
    }

    public static AutofillType valueOf(String str) {
        return (AutofillType) Enum.valueOf(AutofillType.class, str);
    }

    public static AutofillType[] values() {
        return (AutofillType[]) piY.clone();
    }

    static {
        AutofillType[] autofillTypeArrN = n();
        piY = autofillTypeArrN;
        ijL = EnumEntriesKt.enumEntries(autofillTypeArrN);
    }

    private AutofillType(String str, int i2) {
    }
}
