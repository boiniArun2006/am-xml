package androidx.compose.ui.autofill;

import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class AndroidAutofillType_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HashMap f31120n = MapsKt.hashMapOf(TuplesKt.to(AutofillType.f31150n, "emailAddress"), TuplesKt.to(AutofillType.f31153t, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER), TuplesKt.to(AutofillType.f31139O, "password"), TuplesKt.to(AutofillType.J2, "newUsername"), TuplesKt.to(AutofillType.f31152r, "newPassword"), TuplesKt.to(AutofillType.f31151o, "postalAddress"), TuplesKt.to(AutofillType.f31145Z, "postalCode"), TuplesKt.to(AutofillType.f31140S, "creditCardNumber"), TuplesKt.to(AutofillType.f31148g, "creditCardSecurityCode"), TuplesKt.to(AutofillType.E2, "creditCardExpirationDate"), TuplesKt.to(AutofillType.f31147e, "creditCardExpirationMonth"), TuplesKt.to(AutofillType.f31143X, "creditCardExpirationYear"), TuplesKt.to(AutofillType.f31141T, "creditCardExpirationDay"), TuplesKt.to(AutofillType.f31138N, "addressCountry"), TuplesKt.to(AutofillType.f31154v, "addressRegion"), TuplesKt.to(AutofillType.Xw, "addressLocality"), TuplesKt.to(AutofillType.jB, "streetAddress"), TuplesKt.to(AutofillType.f31142U, "extendedAddress"), TuplesKt.to(AutofillType.P5, "extendedPostalCode"), TuplesKt.to(AutofillType.M7, "personName"), TuplesKt.to(AutofillType.p5, "personGivenName"), TuplesKt.to(AutofillType.eF, "personFamilyName"), TuplesKt.to(AutofillType.f31132E, "personMiddleName"), TuplesKt.to(AutofillType.f31137M, "personMiddleInitial"), TuplesKt.to(AutofillType.f31133FX, "personNamePrefix"), TuplesKt.to(AutofillType.f31130B, "personNameSuffix"), TuplesKt.to(AutofillType.f31136J, "phoneNumber"), TuplesKt.to(AutofillType.f31131D, "phoneNumberDevice"), TuplesKt.to(AutofillType.f31146a, "phoneCountryCode"), TuplesKt.to(AutofillType.f31135I, "phoneNational"), TuplesKt.to(AutofillType.f31134GR, InneractiveMediationDefs.KEY_GENDER), TuplesKt.to(AutofillType.Nxk, "birthDateFull"), TuplesKt.to(AutofillType.f31144Y, "birthDateDay"), TuplesKt.to(AutofillType.f31149k, "birthDateMonth"), TuplesKt.to(AutofillType.dR0, "birthDateYear"), TuplesKt.to(AutofillType.f31155z, "smsOTPCode"));

    public static final String n(AutofillType autofillType) {
        String str = (String) f31120n.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
