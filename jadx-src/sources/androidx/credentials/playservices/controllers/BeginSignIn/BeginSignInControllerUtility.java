package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", c.f62177j, "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BeginSignInControllerUtility {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "t", "(Landroid/content/Context;)J", "curAuthVersion", "", "nr", "(J)Z", "LjS/j;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "rl", "(LjS/j;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Landroidx/credentials/GetCredentialRequest;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", c.f62177j, "(Landroidx/credentials/GetCredentialRequest;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean nr(long curAuthVersion) {
            return curAuthVersion < 231815000;
        }

        private Companion() {
        }

        public final BeginSignInRequest n(GetCredentialRequest request, Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
            long jT2 = t(context);
            boolean z2 = false;
            boolean z3 = false;
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
                if (credentialOption instanceof GetPasswordOption) {
                    builder.setPasswordRequestOptions(new BeginSignInRequest.PasswordRequestOptions.Builder().setSupported(true).build());
                    z2 = z2 || credentialOption.getIsAutoSelectAllowed();
                } else if ((credentialOption instanceof GetPublicKeyCredentialOption) && !z3) {
                    if (nr(jT2)) {
                        builder.setPasskeysSignInRequestOptions(PublicKeyCredentialControllerUtility.INSTANCE.Uo((GetPublicKeyCredentialOption) credentialOption));
                    } else {
                        builder.setPasskeyJsonSignInRequestOptions(PublicKeyCredentialControllerUtility.INSTANCE.J2((GetPublicKeyCredentialOption) credentialOption));
                    }
                    z3 = true;
                } else if (credentialOption instanceof jS.j) {
                    jS.j jVar = (jS.j) credentialOption;
                    builder.setGoogleIdTokenRequestOptions(rl(jVar));
                    if (z2 || jVar.Uo()) {
                    }
                }
            }
            if (jT2 > 241217000) {
                builder.setPreferImmediatelyAvailableCredentials(request.getPreferImmediatelyAvailableCredentials());
            }
            BeginSignInRequest beginSignInRequestBuild = builder.setAutoSelectEnabled(z2).build();
            Intrinsics.checkNotNullExpressionValue(beginSignInRequestBuild, "requestBuilder.setAutoSe…abled(autoSelect).build()");
            return beginSignInRequestBuild;
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions rl(jS.j option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.Builder supported = BeginSignInRequest.GoogleIdTokenRequestOptions.builder().setFilterByAuthorizedAccounts(option.KN()).setNonce(option.gh()).setRequestVerifiedPhoneNumber(option.qie()).setServerClientId(option.az()).setSupported(true);
            Intrinsics.checkNotNullExpressionValue(supported, "builder()\n              …      .setSupported(true)");
            if (option.mUb() != null) {
                String strMUb = option.mUb();
                Intrinsics.checkNotNull(strMUb);
                supported.associateLinkedAccounts(strMUb, option.xMQ());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsBuild = supported.build();
            Intrinsics.checkNotNullExpressionValue(googleIdTokenRequestOptionsBuild, "idTokenOption.build()");
            return googleIdTokenRequestOptionsBuild;
        }

        private final long t(Context context) {
            Intrinsics.checkNotNullExpressionValue(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }
    }
}
