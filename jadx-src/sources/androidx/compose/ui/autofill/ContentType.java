package androidx.compose.ui.autofill;

import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentType;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Companion", "Landroidx/compose/ui/autofill/AndroidContentType;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentType {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31169n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bo\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bp\u0010\u0006\u001a\u0004\bq\u0010\b¨\u0006s"}, d2 = {"Landroidx/compose/ui/autofill/ContentType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/ContentType;", "rl", "Landroidx/compose/ui/autofill/ContentType;", "getUsername", "()Landroidx/compose/ui/autofill/ContentType;", "Username", "t", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Password", "nr", "getEmailAddress", "EmailAddress", "O", "getNewUsername", "NewUsername", "J2", "getNewPassword", "NewPassword", "Uo", "getPostalAddress", "PostalAddress", "KN", "getPostalCode", "PostalCode", "xMQ", "getCreditCardNumber", "CreditCardNumber", "mUb", "getCreditCardSecurityCode", "CreditCardSecurityCode", "gh", "getCreditCardExpirationDate", "CreditCardExpirationDate", "qie", "getCreditCardExpirationMonth", "CreditCardExpirationMonth", "az", "getCreditCardExpirationYear", "CreditCardExpirationYear", "ty", "getCreditCardExpirationDay", "CreditCardExpirationDay", "HI", "getAddressCountry", "AddressCountry", "ck", "getAddressRegion", "AddressRegion", "Ik", "getAddressLocality", "AddressLocality", "r", "getAddressStreet", "AddressStreet", "o", "getAddressAuxiliaryDetails", "AddressAuxiliaryDetails", "Z", "getPostalCodeExtended", "PostalCodeExtended", "XQ", "getPersonFullName", "PersonFullName", "S", "getPersonFirstName", "PersonFirstName", "WPU", "getPersonLastName", "PersonLastName", "aYN", "getPersonMiddleName", "PersonMiddleName", "ViF", "getPersonMiddleInitial", "PersonMiddleInitial", "nY", "getPersonNamePrefix", "PersonNamePrefix", "g", "getPersonNameSuffix", "PersonNameSuffix", "te", "getPhoneNumber", "PhoneNumber", "iF", "getPhoneNumberDevice", "PhoneNumberDevice", "fD", "getPhoneCountryCode", "PhoneCountryCode", "E2", "getPhoneNumberNational", "PhoneNumberNational", "e", "getGender", "Gender", "X", "getBirthDateFull", "BirthDateFull", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getBirthDateDay", "BirthDateDay", "N", "getBirthDateMonth", "BirthDateMonth", "nHg", "getBirthDateYear", "BirthDateYear", "s7N", "getSmsOtpCode", "SmsOtpCode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31169n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final ContentType Username = ContentType_androidKt.n(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final ContentType Password = ContentType_androidKt.n("password");

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final ContentType EmailAddress = ContentType_androidKt.n("emailAddress");

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final ContentType NewUsername = ContentType_androidKt.n("newUsername");

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final ContentType NewPassword = ContentType_androidKt.n("newPassword");

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private static final ContentType PostalAddress = ContentType_androidKt.n("postalAddress");

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private static final ContentType PostalCode = ContentType_androidKt.n("postalCode");

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private static final ContentType CreditCardNumber = ContentType_androidKt.n("creditCardNumber");

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private static final ContentType CreditCardSecurityCode = ContentType_androidKt.n("creditCardSecurityCode");

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private static final ContentType CreditCardExpirationDate = ContentType_androidKt.n("creditCardExpirationDate");

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private static final ContentType CreditCardExpirationMonth = ContentType_androidKt.n("creditCardExpirationMonth");

        /* JADX INFO: renamed from: az, reason: from kotlin metadata */
        private static final ContentType CreditCardExpirationYear = ContentType_androidKt.n("creditCardExpirationYear");

        /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
        private static final ContentType CreditCardExpirationDay = ContentType_androidKt.n("creditCardExpirationDay");

        /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
        private static final ContentType AddressCountry = ContentType_androidKt.n("addressCountry");

        /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
        private static final ContentType AddressRegion = ContentType_androidKt.n("addressRegion");

        /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
        private static final ContentType AddressLocality = ContentType_androidKt.n("addressLocality");

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private static final ContentType AddressStreet = ContentType_androidKt.n("streetAddress");

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private static final ContentType AddressAuxiliaryDetails = ContentType_androidKt.n("extendedAddress");

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private static final ContentType PostalCodeExtended = ContentType_androidKt.n("extendedPostalCode");

        /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
        private static final ContentType PersonFullName = ContentType_androidKt.n("personName");

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private static final ContentType PersonFirstName = ContentType_androidKt.n("personGivenName");

        /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
        private static final ContentType PersonLastName = ContentType_androidKt.n("personFamilyName");

        /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
        private static final ContentType PersonMiddleName = ContentType_androidKt.n("personMiddleName");

        /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
        private static final ContentType PersonMiddleInitial = ContentType_androidKt.n("personMiddleInitial");

        /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
        private static final ContentType PersonNamePrefix = ContentType_androidKt.n("personNamePrefix");

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final ContentType PersonNameSuffix = ContentType_androidKt.n("personNameSuffix");

        /* JADX INFO: renamed from: te, reason: from kotlin metadata */
        private static final ContentType PhoneNumber = ContentType_androidKt.n("phoneNumber");

        /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
        private static final ContentType PhoneNumberDevice = ContentType_androidKt.n("phoneNumberDevice");

        /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
        private static final ContentType PhoneCountryCode = ContentType_androidKt.n("phoneCountryCode");

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private static final ContentType PhoneNumberNational = ContentType_androidKt.n("phoneNational");

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final ContentType Gender = ContentType_androidKt.n(InneractiveMediationDefs.KEY_GENDER);

        /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
        private static final ContentType BirthDateFull = ContentType_androidKt.n("birthDateFull");

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private static final ContentType BirthDateDay = ContentType_androidKt.n("birthDateDay");

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private static final ContentType BirthDateMonth = ContentType_androidKt.n("birthDateMonth");

        /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
        private static final ContentType BirthDateYear = ContentType_androidKt.n("birthDateYear");

        /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
        private static final ContentType SmsOtpCode = ContentType_androidKt.n("smsOTPCode");

        public final ContentType n() {
            return Password;
        }

        private Companion() {
        }
    }
}
