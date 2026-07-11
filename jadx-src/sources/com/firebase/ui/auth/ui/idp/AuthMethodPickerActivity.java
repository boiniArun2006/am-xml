package com.firebase.ui.auth.ui.idp;

import GJW.C;
import GJW.vd;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialOption;
import androidx.credentials.CustomCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.AuthMethodPickerLayout;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.data.remote.AnonymousSignInHandler;
import com.firebase.ui.auth.data.remote.EmailSignInHandler;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.data.remote.GoogleSignInHandler;
import com.firebase.ui.auth.data.remote.PhoneSignInHandler;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.util.GoogleApiUtils;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.aC;
import com.vungle.ads.internal.protos.Sdk;
import jS.j;
import jS.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u001d\u0010$\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001dH\u0002¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\"2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000303028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/firebase/ui/auth/ui/idp/AuthMethodPickerActivity;", "Lcom/firebase/ui/auth/ui/AppCompatBase;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "message", "showProgress", "(I)V", "hideProgress", "attemptCredentialSignIn", "Landroidx/credentials/Credential;", "credential", "handleCredentialManagerResult", "(Landroidx/credentials/Credential;)V", "Landroidx/credentials/exceptions/GetCredentialException;", "e", "handleCredentialManagerFailure", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "", "", "getCredentialAccountTypes", "()Ljava/util/List;", "showAuthMethodPicker", "Lcom/firebase/ui/auth/AuthUI$IdpConfig;", "providerConfigs", "populateIdpList", "(Ljava/util/List;)V", "populateIdpListCustomLayout", "providerId", "providerOrEmailLinkProvider", "(Ljava/lang/String;)Ljava/lang/String;", "idpConfig", "Landroid/view/View;", "view", "handleSignInOperation", "(Lcom/firebase/ui/auth/AuthUI$IdpConfig;Landroid/view/View;)V", "Lcom/firebase/ui/auth/viewmodel/idp/SocialProviderResponseHandler;", "mHandler", "Lcom/firebase/ui/auth/viewmodel/idp/SocialProviderResponseHandler;", "", "Lcom/firebase/ui/auth/viewmodel/ProviderSignInBase;", "mProviders", "Ljava/util/List;", "Landroid/widget/ProgressBar;", "mProgressBar", "Landroid/widget/ProgressBar;", "Landroid/view/ViewGroup;", "mProviderHolder", "Landroid/view/ViewGroup;", "Lcom/firebase/ui/auth/AuthMethodPickerLayout;", "customLayout", "Lcom/firebase/ui/auth/AuthMethodPickerLayout;", "Landroidx/credentials/CredentialManager;", "credentialManager$delegate", "Lkotlin/Lazy;", "getCredentialManager", "()Landroidx/credentials/CredentialManager;", "credentialManager", "Companion", "auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo
public final class AuthMethodPickerActivity extends AppCompatBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AuthMethodPickerLayout customLayout;
    private SocialProviderResponseHandler mHandler;
    private ProgressBar mProgressBar;
    private ViewGroup mProviderHolder;
    private final List<ProviderSignInBase<?>> mProviders = new ArrayList();

    /* JADX INFO: renamed from: credentialManager$delegate, reason: from kotlin metadata */
    private final Lazy credentialManager = LazyKt.lazy(new Function0() { // from class: Sor.CN3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GoogleApiUtils.getCredentialManager(this.f9930n);
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/firebase/ui/auth/ui/idp/AuthMethodPickerActivity$Companion;", "", "<init>", "()V", "TAG", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "flowParams", "Lcom/firebase/ui/auth/data/model/FlowParameters;", "auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent createIntent(Context context, FlowParameters flowParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(flowParams, "flowParams");
            Intent intentCreateBaseIntent = HelperActivityBase.createBaseIntent(context, AuthMethodPickerActivity.class, flowParams);
            Intrinsics.checkNotNullExpressionValue(intentCreateBaseIntent, "access$createBaseIntent$s1435643476(...)");
            return intentCreateBaseIntent;
        }
    }

    /* JADX INFO: renamed from: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity$attemptCredentialSignIn$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity$attemptCredentialSignIn$1", f = "AuthMethodPickerActivity.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ GetCredentialRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GetCredentialRequest getCredentialRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = getCredentialRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthMethodPickerActivity.this.new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CredentialManager credentialManager = AuthMethodPickerActivity.this.getCredentialManager();
                    AuthMethodPickerActivity authMethodPickerActivity = AuthMethodPickerActivity.this;
                    GetCredentialRequest getCredentialRequest = this.$request;
                    this.label = 1;
                    obj = credentialManager.t(authMethodPickerActivity, getCredentialRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                AuthMethodPickerActivity.this.handleCredentialManagerResult(((GetCredentialResponse) obj).getCredential());
            } catch (GetCredentialException e2) {
                AuthMethodPickerActivity.this.handleCredentialManagerFailure(e2);
                AuthMethodPickerActivity.this.showAuthMethodPicker();
            }
            return Unit.INSTANCE;
        }
    }

    private final List<String> getCredentialAccountTypes() {
        ArrayList arrayList = new ArrayList();
        for (AuthUI.IdpConfig idpConfig : getFlowParams().providers) {
            if (Intrinsics.areEqual(idpConfig.getProviderId(), "google.com")) {
                String strProviderIdToAccountType = ProviderUtils.providerIdToAccountType(idpConfig.getProviderId());
                Intrinsics.checkNotNullExpressionValue(strProviderIdToAccountType, "providerIdToAccountType(...)");
                arrayList.add(strProviderIdToAccountType);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CredentialManager getCredentialManager() {
        return (CredentialManager) this.credentialManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCredentialManagerFailure(GetCredentialException e2) {
        Log.e("AuthMethodPickerActivity", "Credential Manager sign in failed", e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCredentialManagerResult(Credential credential) {
        if (credential instanceof PasswordCredential) {
            PasswordCredential passwordCredential = (PasswordCredential) credential;
            String id = passwordCredential.getId();
            String password = passwordCredential.getPassword();
            final IdpResponse idpResponseBuild = new IdpResponse.Builder(new User.Builder("password", id).build()).build();
            KickoffActivity.mKickstarter.setResult(Resource.forLoading());
            Task taskAYN = getAuth().aYN(id, password);
            final Function1 function1 = new Function1() { // from class: Sor.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AuthMethodPickerActivity.handleCredentialManagerResult$lambda$1(idpResponseBuild, this, (AuthResult) obj);
                }
            };
            Intrinsics.checkNotNull(taskAYN.addOnSuccessListener(new OnSuccessListener() { // from class: Sor.n
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: Sor.w6
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    AuthMethodPickerActivity.handleCredentialManagerResult$lambda$3(this.f9942n, exc);
                }
            }));
            return;
        }
        if (!(credential instanceof CustomCredential)) {
            Log.e("AuthMethodPickerActivity", "Unexpected type of credential");
            return;
        }
        if (!Intrinsics.areEqual(credential.getType(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            Log.e("AuthMethodPickerActivity", "Unexpected type of credential");
            return;
        }
        try {
            final n nVarN = n.gh.n(credential.getData());
            Task taskWPU = getAuth().WPU(aC.n(nVarN.t(), null));
            final Function1 function12 = new Function1() { // from class: Sor.Ml
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AuthMethodPickerActivity.handleCredentialManagerResult$lambda$4(nVarN, this, (AuthResult) obj);
                }
            };
            Intrinsics.checkNotNull(taskWPU.addOnSuccessListener(new OnSuccessListener() { // from class: Sor.I28
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function12.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: Sor.Wre
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    AuthMethodPickerActivity.handleCredentialManagerResult$lambda$6(exc);
                }
            }));
        } catch (GoogleIdTokenParsingException e2) {
            Log.e("AuthMethodPickerActivity", "Received an invalid google id token response", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCredentialManagerResult$lambda$1(IdpResponse idpResponse, AuthMethodPickerActivity authMethodPickerActivity, AuthResult authResult) {
        KickoffActivity.mKickstarter.handleSuccess(idpResponse, authResult);
        authMethodPickerActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCredentialManagerResult$lambda$3(AuthMethodPickerActivity authMethodPickerActivity, Exception e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        if ((e2 instanceof FirebaseAuthInvalidUserException) || (e2 instanceof FirebaseAuthInvalidCredentialsException)) {
            Identity.getSignInClient(authMethodPickerActivity.getApplication()).signOut();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCredentialManagerResult$lambda$4(n nVar, AuthMethodPickerActivity authMethodPickerActivity, AuthResult authResult) {
        KickoffActivity.mKickstarter.handleSuccess(new IdpResponse.Builder(new User.Builder("google.com", nVar.getData().getString(Scopes.EMAIL)).build()).setToken(nVar.t()).build(), authResult);
        authMethodPickerActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCredentialManagerResult$lambda$6(Exception e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        Log.e("AuthMethodPickerActivity", "Failed to sign in with Google ID token", e2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void populateIdpList(List<AuthUI.IdpConfig> providerConfigs) {
        int i2;
        ViewGroup viewGroup;
        this.mProviders.clear();
        for (AuthUI.IdpConfig idpConfig : providerConfigs) {
            String providerId = idpConfig.getProviderId();
            switch (providerId.hashCode()) {
                case -2095811475:
                    if (providerId.equals("anonymous")) {
                        i2 = R$layout.fui_provider_button_anonymous;
                    } else {
                        if (TextUtils.isEmpty(idpConfig.getParams().getString("generic_oauth_provider_id"))) {
                            throw new IllegalStateException("Unknown provider: " + idpConfig.getProviderId());
                        }
                        i2 = idpConfig.getParams().getInt("generic_oauth_button_id");
                    }
                    View viewInflate = getLayoutInflater().inflate(i2, this.mProviderHolder, false);
                    Intrinsics.checkNotNull(viewInflate);
                    handleSignInOperation(idpConfig, viewInflate);
                    viewGroup = this.mProviderHolder;
                    if (viewGroup == null) {
                        viewGroup.addView(viewInflate);
                    }
                    break;
                case -1536293812:
                    if (providerId.equals("google.com")) {
                        i2 = R$layout.fui_idp_button_google;
                    }
                    View viewInflate2 = getLayoutInflater().inflate(i2, this.mProviderHolder, false);
                    Intrinsics.checkNotNull(viewInflate2);
                    handleSignInOperation(idpConfig, viewInflate2);
                    viewGroup = this.mProviderHolder;
                    if (viewGroup == null) {
                    }
                    break;
                case -364826023:
                    if (providerId.equals("facebook.com")) {
                        i2 = R$layout.fui_idp_button_facebook;
                    }
                    View viewInflate22 = getLayoutInflater().inflate(i2, this.mProviderHolder, false);
                    Intrinsics.checkNotNull(viewInflate22);
                    handleSignInOperation(idpConfig, viewInflate22);
                    viewGroup = this.mProviderHolder;
                    if (viewGroup == null) {
                    }
                    break;
                case 106642798:
                    if (providerId.equals("phone")) {
                        i2 = R$layout.fui_provider_button_phone;
                    }
                    View viewInflate222 = getLayoutInflater().inflate(i2, this.mProviderHolder, false);
                    Intrinsics.checkNotNull(viewInflate222);
                    handleSignInOperation(idpConfig, viewInflate222);
                    viewGroup = this.mProviderHolder;
                    if (viewGroup == null) {
                    }
                    break;
                case 1216985755:
                    if (providerId.equals("password")) {
                        i2 = R$layout.fui_provider_button_email;
                    }
                    View viewInflate2222 = getLayoutInflater().inflate(i2, this.mProviderHolder, false);
                    Intrinsics.checkNotNull(viewInflate2222);
                    handleSignInOperation(idpConfig, viewInflate2222);
                    viewGroup = this.mProviderHolder;
                    if (viewGroup == null) {
                    }
                    break;
                case 2120171958:
                    if (!providerId.equals("emailLink")) {
                    }
                    View viewInflate22222 = getLayoutInflater().inflate(i2, this.mProviderHolder, false);
                    Intrinsics.checkNotNull(viewInflate22222);
                    handleSignInOperation(idpConfig, viewInflate22222);
                    viewGroup = this.mProviderHolder;
                    if (viewGroup == null) {
                    }
                    break;
            }
        }
    }

    private final void populateIdpListCustomLayout(List<AuthUI.IdpConfig> providerConfigs) {
        Map<String, Integer> providersButton;
        AuthMethodPickerLayout authMethodPickerLayout = this.customLayout;
        if (authMethodPickerLayout == null || (providersButton = authMethodPickerLayout.getProvidersButton()) == null) {
            return;
        }
        for (AuthUI.IdpConfig idpConfig : providerConfigs) {
            String providerId = idpConfig.getProviderId();
            Intrinsics.checkNotNullExpressionValue(providerId, "getProviderId(...)");
            Integer num = providersButton.get(providerOrEmailLinkProvider(providerId));
            if (num == null) {
                throw new IllegalStateException("No button found for auth provider: " + idpConfig.getProviderId());
            }
            View viewFindViewById = findViewById(num.intValue());
            Intrinsics.checkNotNull(viewFindViewById);
            handleSignInOperation(idpConfig, viewFindViewById);
        }
        for (Map.Entry<String, Integer> entry : providersButton.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key != null) {
                Iterator<AuthUI.IdpConfig> it = providerConfigs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String providerId2 = it.next().getProviderId();
                        Intrinsics.checkNotNullExpressionValue(providerId2, "getProviderId(...)");
                        if (Intrinsics.areEqual(providerOrEmailLinkProvider(providerId2), key)) {
                            break;
                        }
                    } else {
                        Intrinsics.checkNotNull(value);
                        View viewFindViewById2 = findViewById(value.intValue());
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    private final String providerOrEmailLinkProvider(String providerId) {
        return Intrinsics.areEqual(providerId, "emailLink") ? "password" : providerId;
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        if (this.customLayout == null) {
            ProgressBar progressBar = this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            ViewGroup viewGroup = this.mProviderHolder;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setEnabled(true);
                    childAt.setAlpha(1.0f);
                }
            }
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int message) {
        if (this.customLayout == null) {
            ProgressBar progressBar = this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            ViewGroup viewGroup = this.mProviderHolder;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setEnabled(false);
                    childAt.setAlpha(0.75f);
                }
            }
        }
    }

    private final void attemptCredentialSignIn() {
        boolean z2;
        boolean z3;
        FlowParameters flowParams = getFlowParams();
        if (ProviderUtils.getConfigFromIdps(flowParams.providers, "password") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<String> credentialAccountTypes = getCredentialAccountTypes();
        if (!z2 && credentialAccountTypes.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (flowParams.enableCredentials && z3) {
            GetPasswordOption getPasswordOption = new GetPasswordOption(null, false, null, 7, null);
            j.C0986j c0986jRl = new j.C0986j().rl(true);
            String string = getString(R$string.default_web_client_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C.nr(LifecycleOwnerKt.n(this), null, null, new AnonymousClass1(new GetCredentialRequest(CollectionsKt.listOf((Object[]) new CredentialOption[]{getPasswordOption, c0986jRl.t(string).n()}), null, false, null, false, 30, null), null), 3, null);
            return;
        }
        showAuthMethodPicker();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleSignInOperation(final AuthUI.IdpConfig idpConfig, View view) {
        final ProviderSignInBase<AuthUI.IdpConfig> providerSignInBaseInitWith;
        final String providerId = idpConfig.getProviderId();
        Intrinsics.checkNotNullExpressionValue(providerId, "getProviderId(...)");
        final AuthUI authUI = getAuthUI();
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        switch (providerId.hashCode()) {
            case -2095811475:
                if (!providerId.equals("anonymous")) {
                    if (!TextUtils.isEmpty(idpConfig.getParams().getString("generic_oauth_provider_id"))) {
                        providerSignInBaseInitWith = ((GenericIdpSignInHandler) viewModelProvider.n(GenericIdpSignInHandler.class)).initWith(idpConfig);
                        Intrinsics.checkNotNull(providerSignInBaseInitWith);
                    } else {
                        throw new IllegalStateException("Unknown provider: " + providerId);
                    }
                } else {
                    providerSignInBaseInitWith = ((AnonymousSignInHandler) viewModelProvider.n(AnonymousSignInHandler.class)).initWith(getFlowParams());
                    Intrinsics.checkNotNullExpressionValue(providerSignInBaseInitWith, "initWith(...)");
                }
                this.mProviders.add(providerSignInBaseInitWith);
                providerSignInBaseInitWith.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.handleSignInOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(AuthMethodPickerActivity.this);
                    }

                    private final void handleResponse(IdpResponse response) {
                        boolean z2 = AuthUI.SOCIAL_PROVIDERS.contains(providerId) && !authUI.isUseEmulator();
                        SocialProviderResponseHandler socialProviderResponseHandler = null;
                        if (!response.isSuccessful()) {
                            SocialProviderResponseHandler socialProviderResponseHandler2 = AuthMethodPickerActivity.this.mHandler;
                            if (socialProviderResponseHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                            } else {
                                socialProviderResponseHandler = socialProviderResponseHandler2;
                            }
                            socialProviderResponseHandler.startSignIn(response);
                            return;
                        }
                        if (!z2) {
                            AuthMethodPickerActivity.this.finish(response.isSuccessful() ? -1 : 0, response.toIntent());
                            return;
                        }
                        SocialProviderResponseHandler socialProviderResponseHandler3 = AuthMethodPickerActivity.this.mHandler;
                        if (socialProviderResponseHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        } else {
                            socialProviderResponseHandler = socialProviderResponseHandler3;
                        }
                        socialProviderResponseHandler.startSignIn(response);
                    }

                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    protected void onFailure(Exception e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                            AuthMethodPickerActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(e2)));
                            return;
                        }
                        IdpResponse idpResponseFrom = IdpResponse.from(e2);
                        Intrinsics.checkNotNullExpressionValue(idpResponseFrom, "from(...)");
                        handleResponse(idpResponseFrom);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    public void onSuccess(IdpResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        handleResponse(response);
                    }
                });
                view.setOnClickListener(new View.OnClickListener() { // from class: Sor.fuX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AuthMethodPickerActivity.handleSignInOperation$lambda$7(this.f9937n, providerSignInBaseInitWith, idpConfig, view2);
                    }
                });
                return;
            case -1536293812:
                if (providerId.equals("google.com")) {
                    if (authUI.isUseEmulator()) {
                        providerSignInBaseInitWith = ((GenericIdpSignInHandler) viewModelProvider.n(GenericIdpSignInHandler.class)).initWith(GenericIdpSignInHandler.getGenericGoogleConfig());
                    } else {
                        providerSignInBaseInitWith = ((GoogleSignInHandler) viewModelProvider.n(GoogleSignInHandler.class)).initWith(new GoogleSignInHandler.Params(idpConfig));
                    }
                    Intrinsics.checkNotNull(providerSignInBaseInitWith);
                }
                this.mProviders.add(providerSignInBaseInitWith);
                providerSignInBaseInitWith.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.handleSignInOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(AuthMethodPickerActivity.this);
                    }

                    private final void handleResponse(IdpResponse response) {
                        boolean z2 = AuthUI.SOCIAL_PROVIDERS.contains(providerId) && !authUI.isUseEmulator();
                        SocialProviderResponseHandler socialProviderResponseHandler = null;
                        if (!response.isSuccessful()) {
                            SocialProviderResponseHandler socialProviderResponseHandler2 = AuthMethodPickerActivity.this.mHandler;
                            if (socialProviderResponseHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                            } else {
                                socialProviderResponseHandler = socialProviderResponseHandler2;
                            }
                            socialProviderResponseHandler.startSignIn(response);
                            return;
                        }
                        if (!z2) {
                            AuthMethodPickerActivity.this.finish(response.isSuccessful() ? -1 : 0, response.toIntent());
                            return;
                        }
                        SocialProviderResponseHandler socialProviderResponseHandler3 = AuthMethodPickerActivity.this.mHandler;
                        if (socialProviderResponseHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        } else {
                            socialProviderResponseHandler = socialProviderResponseHandler3;
                        }
                        socialProviderResponseHandler.startSignIn(response);
                    }

                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    protected void onFailure(Exception e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                            AuthMethodPickerActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(e2)));
                            return;
                        }
                        IdpResponse idpResponseFrom = IdpResponse.from(e2);
                        Intrinsics.checkNotNullExpressionValue(idpResponseFrom, "from(...)");
                        handleResponse(idpResponseFrom);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    public void onSuccess(IdpResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        handleResponse(response);
                    }
                });
                view.setOnClickListener(new View.OnClickListener() { // from class: Sor.fuX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AuthMethodPickerActivity.handleSignInOperation$lambda$7(this.f9937n, providerSignInBaseInitWith, idpConfig, view2);
                    }
                });
                return;
            case -364826023:
                if (providerId.equals("facebook.com")) {
                    if (authUI.isUseEmulator()) {
                        providerSignInBaseInitWith = ((GenericIdpSignInHandler) viewModelProvider.n(GenericIdpSignInHandler.class)).initWith(GenericIdpSignInHandler.getGenericFacebookConfig());
                    } else {
                        providerSignInBaseInitWith = ((FacebookSignInHandler) viewModelProvider.n(FacebookSignInHandler.class)).initWith(idpConfig);
                    }
                    Intrinsics.checkNotNull(providerSignInBaseInitWith);
                }
                this.mProviders.add(providerSignInBaseInitWith);
                providerSignInBaseInitWith.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.handleSignInOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(AuthMethodPickerActivity.this);
                    }

                    private final void handleResponse(IdpResponse response) {
                        boolean z2 = AuthUI.SOCIAL_PROVIDERS.contains(providerId) && !authUI.isUseEmulator();
                        SocialProviderResponseHandler socialProviderResponseHandler = null;
                        if (!response.isSuccessful()) {
                            SocialProviderResponseHandler socialProviderResponseHandler2 = AuthMethodPickerActivity.this.mHandler;
                            if (socialProviderResponseHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                            } else {
                                socialProviderResponseHandler = socialProviderResponseHandler2;
                            }
                            socialProviderResponseHandler.startSignIn(response);
                            return;
                        }
                        if (!z2) {
                            AuthMethodPickerActivity.this.finish(response.isSuccessful() ? -1 : 0, response.toIntent());
                            return;
                        }
                        SocialProviderResponseHandler socialProviderResponseHandler3 = AuthMethodPickerActivity.this.mHandler;
                        if (socialProviderResponseHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        } else {
                            socialProviderResponseHandler = socialProviderResponseHandler3;
                        }
                        socialProviderResponseHandler.startSignIn(response);
                    }

                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    protected void onFailure(Exception e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                            AuthMethodPickerActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(e2)));
                            return;
                        }
                        IdpResponse idpResponseFrom = IdpResponse.from(e2);
                        Intrinsics.checkNotNullExpressionValue(idpResponseFrom, "from(...)");
                        handleResponse(idpResponseFrom);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    public void onSuccess(IdpResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        handleResponse(response);
                    }
                });
                view.setOnClickListener(new View.OnClickListener() { // from class: Sor.fuX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AuthMethodPickerActivity.handleSignInOperation$lambda$7(this.f9937n, providerSignInBaseInitWith, idpConfig, view2);
                    }
                });
                return;
            case 106642798:
                if (providerId.equals("phone")) {
                    providerSignInBaseInitWith = ((PhoneSignInHandler) viewModelProvider.n(PhoneSignInHandler.class)).initWith(idpConfig);
                    Intrinsics.checkNotNullExpressionValue(providerSignInBaseInitWith, "initWith(...)");
                }
                this.mProviders.add(providerSignInBaseInitWith);
                providerSignInBaseInitWith.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.handleSignInOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(AuthMethodPickerActivity.this);
                    }

                    private final void handleResponse(IdpResponse response) {
                        boolean z2 = AuthUI.SOCIAL_PROVIDERS.contains(providerId) && !authUI.isUseEmulator();
                        SocialProviderResponseHandler socialProviderResponseHandler = null;
                        if (!response.isSuccessful()) {
                            SocialProviderResponseHandler socialProviderResponseHandler2 = AuthMethodPickerActivity.this.mHandler;
                            if (socialProviderResponseHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                            } else {
                                socialProviderResponseHandler = socialProviderResponseHandler2;
                            }
                            socialProviderResponseHandler.startSignIn(response);
                            return;
                        }
                        if (!z2) {
                            AuthMethodPickerActivity.this.finish(response.isSuccessful() ? -1 : 0, response.toIntent());
                            return;
                        }
                        SocialProviderResponseHandler socialProviderResponseHandler3 = AuthMethodPickerActivity.this.mHandler;
                        if (socialProviderResponseHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        } else {
                            socialProviderResponseHandler = socialProviderResponseHandler3;
                        }
                        socialProviderResponseHandler.startSignIn(response);
                    }

                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    protected void onFailure(Exception e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                            AuthMethodPickerActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(e2)));
                            return;
                        }
                        IdpResponse idpResponseFrom = IdpResponse.from(e2);
                        Intrinsics.checkNotNullExpressionValue(idpResponseFrom, "from(...)");
                        handleResponse(idpResponseFrom);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    public void onSuccess(IdpResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        handleResponse(response);
                    }
                });
                view.setOnClickListener(new View.OnClickListener() { // from class: Sor.fuX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AuthMethodPickerActivity.handleSignInOperation$lambda$7(this.f9937n, providerSignInBaseInitWith, idpConfig, view2);
                    }
                });
                return;
            case 1216985755:
                if (providerId.equals("password")) {
                    providerSignInBaseInitWith = ((EmailSignInHandler) viewModelProvider.n(EmailSignInHandler.class)).initWith(null);
                    Intrinsics.checkNotNullExpressionValue(providerSignInBaseInitWith, "initWith(...)");
                }
                this.mProviders.add(providerSignInBaseInitWith);
                providerSignInBaseInitWith.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.handleSignInOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(AuthMethodPickerActivity.this);
                    }

                    private final void handleResponse(IdpResponse response) {
                        boolean z2 = AuthUI.SOCIAL_PROVIDERS.contains(providerId) && !authUI.isUseEmulator();
                        SocialProviderResponseHandler socialProviderResponseHandler = null;
                        if (!response.isSuccessful()) {
                            SocialProviderResponseHandler socialProviderResponseHandler2 = AuthMethodPickerActivity.this.mHandler;
                            if (socialProviderResponseHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                            } else {
                                socialProviderResponseHandler = socialProviderResponseHandler2;
                            }
                            socialProviderResponseHandler.startSignIn(response);
                            return;
                        }
                        if (!z2) {
                            AuthMethodPickerActivity.this.finish(response.isSuccessful() ? -1 : 0, response.toIntent());
                            return;
                        }
                        SocialProviderResponseHandler socialProviderResponseHandler3 = AuthMethodPickerActivity.this.mHandler;
                        if (socialProviderResponseHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        } else {
                            socialProviderResponseHandler = socialProviderResponseHandler3;
                        }
                        socialProviderResponseHandler.startSignIn(response);
                    }

                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    protected void onFailure(Exception e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                            AuthMethodPickerActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(e2)));
                            return;
                        }
                        IdpResponse idpResponseFrom = IdpResponse.from(e2);
                        Intrinsics.checkNotNullExpressionValue(idpResponseFrom, "from(...)");
                        handleResponse(idpResponseFrom);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    public void onSuccess(IdpResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        handleResponse(response);
                    }
                });
                view.setOnClickListener(new View.OnClickListener() { // from class: Sor.fuX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AuthMethodPickerActivity.handleSignInOperation$lambda$7(this.f9937n, providerSignInBaseInitWith, idpConfig, view2);
                    }
                });
                return;
            case 2120171958:
                if (!providerId.equals("emailLink")) {
                }
                this.mProviders.add(providerSignInBaseInitWith);
                providerSignInBaseInitWith.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.handleSignInOperation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(AuthMethodPickerActivity.this);
                    }

                    private final void handleResponse(IdpResponse response) {
                        boolean z2 = AuthUI.SOCIAL_PROVIDERS.contains(providerId) && !authUI.isUseEmulator();
                        SocialProviderResponseHandler socialProviderResponseHandler = null;
                        if (!response.isSuccessful()) {
                            SocialProviderResponseHandler socialProviderResponseHandler2 = AuthMethodPickerActivity.this.mHandler;
                            if (socialProviderResponseHandler2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                            } else {
                                socialProviderResponseHandler = socialProviderResponseHandler2;
                            }
                            socialProviderResponseHandler.startSignIn(response);
                            return;
                        }
                        if (!z2) {
                            AuthMethodPickerActivity.this.finish(response.isSuccessful() ? -1 : 0, response.toIntent());
                            return;
                        }
                        SocialProviderResponseHandler socialProviderResponseHandler3 = AuthMethodPickerActivity.this.mHandler;
                        if (socialProviderResponseHandler3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        } else {
                            socialProviderResponseHandler = socialProviderResponseHandler3;
                        }
                        socialProviderResponseHandler.startSignIn(response);
                    }

                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    protected void onFailure(Exception e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                            AuthMethodPickerActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(e2)));
                            return;
                        }
                        IdpResponse idpResponseFrom = IdpResponse.from(e2);
                        Intrinsics.checkNotNullExpressionValue(idpResponseFrom, "from(...)");
                        handleResponse(idpResponseFrom);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
                    public void onSuccess(IdpResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        handleResponse(response);
                    }
                });
                view.setOnClickListener(new View.OnClickListener() { // from class: Sor.fuX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AuthMethodPickerActivity.handleSignInOperation$lambda$7(this.f9937n, providerSignInBaseInitWith, idpConfig, view2);
                    }
                });
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSignInOperation$lambda$7(AuthMethodPickerActivity authMethodPickerActivity, ProviderSignInBase providerSignInBase, AuthUI.IdpConfig idpConfig, View view) {
        if (authMethodPickerActivity.isOffline()) {
            Snackbar.k(authMethodPickerActivity.findViewById(R.id.content), authMethodPickerActivity.getString(R$string.fui_no_internet), -1).eF();
        } else {
            providerSignInBase.startSignIn(authMethodPickerActivity.getAuth(), authMethodPickerActivity, idpConfig.getProviderId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAuthMethodPicker() {
        hideProgress();
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SocialProviderResponseHandler socialProviderResponseHandler = this.mHandler;
        if (socialProviderResponseHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            socialProviderResponseHandler = null;
        }
        socialProviderResponseHandler.onActivityResult(requestCode, resultCode, data);
        Iterator<ProviderSignInBase<?>> it = this.mProviders.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(requestCode, resultCode, data);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        boolean z2;
        int tosPpView;
        super.onCreate(savedInstanceState);
        FlowParameters flowParams = getFlowParams();
        this.customLayout = flowParams.authMethodPickerLayout;
        SocialProviderResponseHandler socialProviderResponseHandler = (SocialProviderResponseHandler) new ViewModelProvider(this).n(SocialProviderResponseHandler.class);
        this.mHandler = socialProviderResponseHandler;
        SocialProviderResponseHandler socialProviderResponseHandler2 = null;
        if (socialProviderResponseHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            socialProviderResponseHandler = null;
        }
        socialProviderResponseHandler.init(flowParams);
        AuthMethodPickerLayout authMethodPickerLayout = this.customLayout;
        if (authMethodPickerLayout != null) {
            Intrinsics.checkNotNull(authMethodPickerLayout);
            setContentView(authMethodPickerLayout.getMainLayout());
            List<AuthUI.IdpConfig> providers = flowParams.providers;
            Intrinsics.checkNotNullExpressionValue(providers, "providers");
            populateIdpListCustomLayout(providers);
        } else {
            setContentView(R$layout.fui_auth_method_picker_layout);
            this.mProgressBar = (ProgressBar) findViewById(R$id.top_progress_bar);
            this.mProviderHolder = (ViewGroup) findViewById(R$id.btn_holder);
            List<AuthUI.IdpConfig> providers2 = flowParams.providers;
            Intrinsics.checkNotNullExpressionValue(providers2, "providers");
            populateIdpList(providers2);
            int i2 = flowParams.logoId;
            if (i2 == -1) {
                findViewById(R$id.logo).setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R$id.root);
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.ty(constraintLayout);
                int i3 = R$id.container;
                constraintSet.bzg(i3, 0.5f);
                constraintSet.Xw(i3, 0.5f);
                constraintSet.xMQ(constraintLayout);
            } else {
                ((ImageView) findViewById(R$id.logo)).setImageResource(i2);
            }
        }
        if (getFlowParams().isPrivacyPolicyUrlProvided() && getFlowParams().isTermsOfServiceUrlProvided()) {
            z2 = true;
        } else {
            z2 = false;
        }
        AuthMethodPickerLayout authMethodPickerLayout2 = this.customLayout;
        if (authMethodPickerLayout2 == null) {
            tosPpView = R$id.main_tos_and_pp;
        } else {
            Intrinsics.checkNotNull(authMethodPickerLayout2);
            tosPpView = authMethodPickerLayout2.getTosPpView();
        }
        if (tosPpView >= 0) {
            TextView textView = (TextView) findViewById(tosPpView);
            if (!z2) {
                textView.setVisibility(8);
            } else {
                PrivacyDisclosureUtils.setupTermsOfServiceAndPrivacyPolicyText(this, getFlowParams(), textView);
            }
        }
        SocialProviderResponseHandler socialProviderResponseHandler3 = this.mHandler;
        if (socialProviderResponseHandler3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
        } else {
            socialProviderResponseHandler2 = socialProviderResponseHandler3;
        }
        socialProviderResponseHandler2.getOperation().mUb(this, new ResourceObserver<IdpResponse>(R$string.fui_progress_dialog_signing_in) { // from class: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.onCreate.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                if (e2 instanceof UserCancellationException) {
                    return;
                }
                if (e2 instanceof FirebaseAuthAnonymousUpgradeException) {
                    AuthMethodPickerActivity.this.finish(5, ((FirebaseAuthAnonymousUpgradeException) e2).getResponse().toIntent());
                } else {
                    if (e2 instanceof FirebaseUiException) {
                        AuthMethodPickerActivity.this.finish(0, IdpResponse.from(e2).toIntent());
                        return;
                    }
                    String string = AuthMethodPickerActivity.this.getString(R$string.fui_error_unknown);
                    Intrinsics.checkNotNullExpressionValue(string, LHbnkhI.GcPXrPrtAYiaxD);
                    Toast.makeText(AuthMethodPickerActivity.this, string, 0).show();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(IdpResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                AuthMethodPickerActivity authMethodPickerActivity = AuthMethodPickerActivity.this;
                SocialProviderResponseHandler socialProviderResponseHandler4 = authMethodPickerActivity.mHandler;
                if (socialProviderResponseHandler4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                    socialProviderResponseHandler4 = null;
                }
                authMethodPickerActivity.startSaveCredentials(socialProviderResponseHandler4.getCurrentUser(), response, null);
            }
        });
        attemptCredentialSignIn();
    }
}
