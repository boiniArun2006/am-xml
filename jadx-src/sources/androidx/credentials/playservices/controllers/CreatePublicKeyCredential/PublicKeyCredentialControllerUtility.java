package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;", "", c.f62177j, "Companion", "GetGMSVersion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicKeyCredentialControllerUtility {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String rl = "clientDataJSON";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f37167t = "attestationObject";
    private static final String nr = "authenticatorData";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f37157O = "signature";
    private static final String J2 = "userHandle";
    private static final String Uo = "response";
    private static final String KN = "id";
    private static final String xMQ = "rawId";
    private static final String mUb = "type";
    private static final String gh = "rpId";
    private static final String qie = ClientData.KEY_CHALLENGE;
    private static final String az = "appid";
    private static final String ty = "thirdPartyPayment";
    private static final String HI = "authenticatorSelection";
    private static final String ck = "requireResidentKey";
    private static final String Ik = "residentKey";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f37166r = "authenticatorAttachment";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f37165o = "timeout";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f37161Z = "excludeCredentials";
    private static final String XQ = "transports";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f37158S = "rp";
    private static final String WPU = AppMeasurementSdk.ConditionalUserProperty.NAME;
    private static final String aYN = "icon";
    private static final String ViF = "alg";
    private static final String nY = "user";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f37163g = "displayName";
    private static final String te = "userVerificationMethod";
    private static final String iF = "keyProtectionType";
    private static final String fD = "matcherProtectionType";
    private static final String E2 = "extensions";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f37162e = "attestation";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f37160X = "pubKeyCredParams";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f37159T = "clientExtensionResults";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f37156N = "rk";
    private static final String nHg = "credProps";
    private static final LinkedHashMap s7N = MapsKt.linkedMapOf(TuplesKt.to(ErrorCode.UNKNOWN_ERR, new UnknownError()), TuplesKt.to(ErrorCode.ABORT_ERR, new AbortError()), TuplesKt.to(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new NotReadableError()), TuplesKt.to(ErrorCode.CONSTRAINT_ERR, new ConstraintError()), TuplesKt.to(ErrorCode.DATA_ERR, new DataError()), TuplesKt.to(ErrorCode.INVALID_STATE_ERR, new InvalidStateError()), TuplesKt.to(ErrorCode.ENCODING_ERR, new EncodingError()), TuplesKt.to(ErrorCode.NETWORK_ERR, new NetworkError()), TuplesKt.to(ErrorCode.NOT_ALLOWED_ERR, new NotAllowedError()), TuplesKt.to(ErrorCode.NOT_SUPPORTED_ERR, new NotSupportedError()), TuplesKt.to(ErrorCode.SECURITY_ERR, new SecurityError()), TuplesKt.to(ErrorCode.TIMEOUT_ERR, new TimeoutError()));

    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0018\u001a\u00020$¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b3\u00102J\u001f\u00104\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b4\u00102J\u001f\u00105\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b5\u00102J\u001f\u00106\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b6\u00102J\u001f\u00107\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b7\u00102J\u0015\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0019¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001a\u0010E\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u001a\u0010G\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001a\u0010I\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u001a\u0010K\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010BR\u001a\u0010M\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010BR\u001a\u0010O\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010BR\u001a\u0010Q\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010BR\u001a\u0010S\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010BR\u001a\u0010U\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010@\u001a\u0004\bV\u0010BR\u001a\u0010W\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010@\u001a\u0004\bX\u0010BR\u001a\u0010Y\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010BR\u001a\u0010[\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010@\u001a\u0004\b\\\u0010BR\u001a\u0010]\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010@\u001a\u0004\b^\u0010BR\u001a\u0010_\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010@\u001a\u0004\b`\u0010BR\u001a\u0010a\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010@\u001a\u0004\bb\u0010BR\u001a\u0010c\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010@\u001a\u0004\bd\u0010BR\u001a\u0010e\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010@\u001a\u0004\bf\u0010BR\u001a\u0010g\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010@\u001a\u0004\bh\u0010BR\u001a\u0010i\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010@\u001a\u0004\bj\u0010BR\u001a\u0010k\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010@\u001a\u0004\bl\u0010BR6\u0010p\u001a\u001e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020n0mj\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020n`o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010@¨\u0006y"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", NodeModuleProcess.PROPERTY_VERSION, "", "e", "(Landroid/content/Context;J)Z", "Lorg/json/JSONObject;", "json", "", "KN", "(Lorg/json/JSONObject;)[B", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "nr", "(Landroidx/credentials/CreatePublicKeyCredentialRequest;Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "O", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "", "rV9", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Landroidx/credentials/GetPublicKeyCredentialOption;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "J2", "(Landroidx/credentials/GetPublicKeyCredentialOption;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Uo", "(Landroidx/credentials/GetPublicKeyCredentialOption;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/exceptions/CreateCredentialException;", "v", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "rl", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;", "builder", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V", "X", "N", "nHg", "wTp", "s7N", "str", c.f62177j, "(Ljava/lang/String;)[B", "", "alg", "t", "(I)Z", "JSON_KEY_ID", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "JSON_KEY_TYPE", "iF", "JSON_KEY_RPID", "ViF", "JSON_KEY_CHALLENGE", "ty", "JSON_KEY_APPID", "mUb", "JSON_KEY_THIRD_PARTY_PAYMENT", "nY", "JSON_KEY_AUTH_SELECTION", "az", "JSON_KEY_REQUIRE_RES_KEY", "S", "JSON_KEY_RES_KEY", "WPU", "JSON_KEY_AUTH_ATTACHMENT", "qie", "JSON_KEY_TIMEOUT", "g", "JSON_KEY_EXCLUDE_CREDENTIALS", "ck", "JSON_KEY_TRANSPORTS", "te", "JSON_KEY_RP", "aYN", "JSON_KEY_NAME", "Z", "JSON_KEY_ICON", "r", "JSON_KEY_ALG", "xMQ", "JSON_KEY_USER", "fD", "JSON_KEY_DISPLAY_NAME", "HI", "JSON_KEY_EXTENSTIONS", "Ik", "JSON_KEY_ATTESTATION", "gh", "JSON_KEY_PUB_KEY_CRED_PARAMS", "XQ", "Ljava/util/LinkedHashMap;", "Landroidx/credentials/exceptions/domerrors/DomError;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "E2", "()Ljava/util/LinkedHashMap;", "AUTH_MIN_VERSION_JSON_CREATE", "J", "FLAGS", "I", "TAG", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions J2(GetPublicKeyCredentialOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsBuild = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.getRequestJson()).build();
            Intrinsics.checkNotNullExpressionValue(passkeyJsonRequestOptionsBuild, "Builder()\n              …\n                .build()");
            return passkeyJsonRequestOptionsBuild;
        }

        public final void N(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(g())) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong(g()) / ((double) 1000)));
            }
        }

        public final PublicKeyCredentialCreationOptions O(JSONObject json) throws JSONException, CreatePublicKeyCredentialDomException {
            Intrinsics.checkNotNullParameter(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            s7N(json, builder);
            wTp(json, builder);
            nHg(json, builder);
            N(json, builder);
            X(json, builder);
            T(json, builder);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialCreationOptionsBuild, "builder.build()");
            return publicKeyCredentialCreationOptionsBuild;
        }

        public final void T(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(Ik())) {
                JSONObject jSONObject = json.getJSONObject(Ik());
                AuthenticationExtensions.Builder builder2 = new AuthenticationExtensions.Builder();
                String appIdExtension = jSONObject.optString(mUb(), "");
                Intrinsics.checkNotNullExpressionValue(appIdExtension, "appIdExtension");
                if (appIdExtension.length() > 0) {
                    builder2.setFido2Extension(new FidoAppIdExtension(appIdExtension));
                }
                if (jSONObject.optBoolean(nY(), false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final BeginSignInRequest.PasskeysRequestOptions Uo(GetPublicKeyCredentialOption option) throws JSONException {
            Intrinsics.checkNotNullParameter(option, "option");
            JSONObject jSONObject = new JSONObject(option.getRequestJson());
            String rpId = jSONObject.optString(ViF(), "");
            Intrinsics.checkNotNullExpressionValue(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsBuild = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(rpId).setChallenge(KN(jSONObject)).build();
            Intrinsics.checkNotNullExpressionValue(passkeysRequestOptionsBuild, "Builder()\n              …\n                .build()");
            return passkeysRequestOptionsBuild;
        }

        public final void X(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(az())) {
                JSONObject jSONObject = json.getJSONObject(az());
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean zOptBoolean = jSONObject.optBoolean(S(), false);
                String residentKey = jSONObject.optString(WPU(), "");
                Intrinsics.checkNotNullExpressionValue(residentKey, "residentKey");
                builder2.setRequireResidentKey(Boolean.valueOf(zOptBoolean)).setResidentKeyRequirement(residentKey.length() > 0 ? ResidentKeyRequirement.fromString(residentKey) : null);
                String authenticatorAttachmentString = jSONObject.optString(qie(), "");
                Intrinsics.checkNotNullExpressionValue(authenticatorAttachmentString, "authenticatorAttachmentString");
                if (authenticatorAttachmentString.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(authenticatorAttachmentString));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final byte[] n(String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(str, FLAGS)");
            return bArrDecode;
        }

        public final void nHg(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(ck())) {
                JSONArray jSONArray = json.getJSONArray(ck());
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string = jSONObject.getString(o());
                    Intrinsics.checkNotNullExpressionValue(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] bArrN = n(string);
                    String descriptorType = jSONObject.getString(iF());
                    Intrinsics.checkNotNullExpressionValue(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrN.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(te())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(te());
                        int length2 = jSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            try {
                                Transport transportFromString = Transport.fromString(jSONArray2.getString(i3));
                                Intrinsics.checkNotNullExpressionValue(transportFromString, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(transportFromString);
                            } catch (Transport.UnsupportedTransportException e2) {
                                throw new CreatePublicKeyCredentialDomException(new EncodingError(), e2.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(descriptorType, bArrN, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            String attestationString = json.optString(gh(), "none");
            Intrinsics.checkNotNullExpressionValue(attestationString, "attestationString");
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(attestationString.length() != 0 ? attestationString : "none"));
        }

        public final PublicKeyCredentialCreationOptions nr(CreatePublicKeyCredentialRequest request, Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            return e(context, 241217000L) ? new PublicKeyCredentialCreationOptions(request.getRequestJson()) : O(new JSONObject(request.getRequestJson()));
        }

        public final String rV9(SignInCredential cred) throws GetCredentialException {
            Intrinsics.checkNotNullParameter(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            Intrinsics.checkNotNull(response);
            if (response instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                Intrinsics.checkNotNullExpressionValue(errorCode, "authenticatorResponse.errorCode");
                throw rl(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (!(response instanceof AuthenticatorAssertionResponse)) {
                Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: " + response.getClass().getName());
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
                return string;
            }
            try {
                String json = publicKeyCredential.toJson();
                Intrinsics.checkNotNullExpressionValue(json, "publicKeyCred.toJson()");
                return json;
            } catch (Throwable th) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
            }
        }

        public final GetCredentialException rl(ErrorCode code, String msg) {
            Intrinsics.checkNotNullParameter(code, "code");
            DomError domError = (DomError) E2().get(code);
            if (domError != null) {
                return (code == ErrorCode.NOT_ALLOWED_ERR && msg != null && StringsKt.contains$default((CharSequence) msg, (CharSequence) "Unable to get sync account", false, 2, (Object) null)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(domError, msg);
            }
            return new GetPublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - " + msg);
        }

        public final void s7N(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setChallenge(KN(json));
            JSONObject jSONObject = json.getJSONObject(fD());
            String string = jSONObject.getString(o());
            Intrinsics.checkNotNullExpressionValue(string, "user.getString(JSON_KEY_ID)");
            byte[] bArrN = n(string);
            String userName = jSONObject.getString(Z());
            String displayName = jSONObject.getString(HI());
            String strOptString = jSONObject.optString(r(), "");
            Intrinsics.checkNotNullExpressionValue(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrN.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(bArrN, userName, strOptString, displayName));
        }

        public final CreateCredentialException v(PublicKeyCredential cred) {
            Intrinsics.checkNotNullParameter(cred, "cred");
            AuthenticatorResponse response = cred.getResponse();
            Intrinsics.checkNotNullExpressionValue(response, "cred.response");
            if (!(response instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "authenticatorResponse.errorCode");
            DomError domError = (DomError) E2().get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            if (domError != null) {
                return (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) "Unable to get sync account", false, 2, (Object) null)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(domError, errorMessage);
            }
            return new CreatePublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - " + errorMessage);
        }

        public final void wTp(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(aYN());
            String rpId = jSONObject.getString(o());
            String rpName = jSONObject.optString(Z(), "");
            String strOptString = jSONObject.optString(r(), "");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() == 0) {
                strOptString = null;
            }
            Intrinsics.checkNotNullExpressionValue(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(rpId, rpName, strOptString));
            JSONArray jSONArray = json.getJSONArray(XQ());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                int i3 = (int) jSONObject2.getLong(xMQ());
                String typeParam = jSONObject2.optString(iF(), "");
                Intrinsics.checkNotNullExpressionValue(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (t(i3)) {
                    arrayList.add(new PublicKeyCredentialParameters(typeParam, i3));
                }
            }
            builder.setParameters(arrayList);
        }

        private final byte[] KN(JSONObject json) throws JSONException {
            String challengeB64 = json.optString(ty(), "");
            Intrinsics.checkNotNullExpressionValue(challengeB64, "challengeB64");
            if (challengeB64.length() != 0) {
                return n(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean e(Context context, long version) throws PackageManager.NameNotFoundException {
            long jN;
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                jN = GetGMSVersion.n(packageInfo);
            } else {
                jN = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (jN <= version) {
                return false;
            }
            return true;
        }

        public final LinkedHashMap E2() {
            return PublicKeyCredentialControllerUtility.s7N;
        }

        public final String HI() {
            return PublicKeyCredentialControllerUtility.f37163g;
        }

        public final String Ik() {
            return PublicKeyCredentialControllerUtility.E2;
        }

        public final String S() {
            return PublicKeyCredentialControllerUtility.ck;
        }

        public final String ViF() {
            return PublicKeyCredentialControllerUtility.gh;
        }

        public final String WPU() {
            return PublicKeyCredentialControllerUtility.Ik;
        }

        public final String XQ() {
            return PublicKeyCredentialControllerUtility.f37160X;
        }

        public final String Z() {
            return PublicKeyCredentialControllerUtility.WPU;
        }

        public final String aYN() {
            return PublicKeyCredentialControllerUtility.f37158S;
        }

        public final String az() {
            return PublicKeyCredentialControllerUtility.HI;
        }

        public final String ck() {
            return PublicKeyCredentialControllerUtility.f37161Z;
        }

        public final String fD() {
            return PublicKeyCredentialControllerUtility.nY;
        }

        public final String g() {
            return PublicKeyCredentialControllerUtility.f37165o;
        }

        public final String gh() {
            return PublicKeyCredentialControllerUtility.f37162e;
        }

        public final String iF() {
            return PublicKeyCredentialControllerUtility.mUb;
        }

        public final String mUb() {
            return PublicKeyCredentialControllerUtility.az;
        }

        public final String nY() {
            return PublicKeyCredentialControllerUtility.ty;
        }

        public final String o() {
            return PublicKeyCredentialControllerUtility.KN;
        }

        public final String qie() {
            return PublicKeyCredentialControllerUtility.f37166r;
        }

        public final String r() {
            return PublicKeyCredentialControllerUtility.aYN;
        }

        public final boolean t(int alg) {
            try {
                COSEAlgorithmIdentifier.fromCoseValue(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final String te() {
            return PublicKeyCredentialControllerUtility.XQ;
        }

        public final String ty() {
            return PublicKeyCredentialControllerUtility.qie;
        }

        public final String xMQ() {
            return PublicKeyCredentialControllerUtility.ViF;
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$GetGMSVersion;", "", "<init>", "()V", "Landroid/content/pm/PackageInfo;", "info", "", c.f62177j, "(Landroid/content/pm/PackageInfo;)J", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class GetGMSVersion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final GetGMSVersion f37168n = new GetGMSVersion();

        @JvmStatic
        @DoNotInline
        public static final long n(PackageInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return info.getLongVersionCode();
        }

        private GetGMSVersion() {
        }
    }
}
