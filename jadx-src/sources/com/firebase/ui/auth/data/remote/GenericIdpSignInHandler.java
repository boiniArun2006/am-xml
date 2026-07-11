package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.FirebaseUiUserCollisionException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.FirebaseAuthError;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.OAuthCredential;
import com.google.firebase.auth.qz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class GenericIdpSignInHandler extends ProviderSignInBase<AuthUI.IdpConfig> {
    protected void handleSuccess(boolean z2, @NonNull String str, @NonNull FirebaseUser firebaseUser, @NonNull OAuthCredential oAuthCredential, boolean z3, boolean z4) {
        String accessToken = oAuthCredential.getAccessToken();
        if (accessToken == null && z2) {
            accessToken = "fake_access_token";
        }
        String strUf = oAuthCredential.Uf();
        if (strUf == null && z2) {
            strUf = "fake_secret";
        }
        IdpResponse.Builder secret = new IdpResponse.Builder(new User.Builder(str, firebaseUser.getEmail()).setName(firebaseUser.getDisplayName()).setPhotoUri(firebaseUser.getPhotoUrl()).build()).setToken(accessToken).setSecret(strUf);
        if (z4) {
            secret.setPendingCredential(oAuthCredential);
        }
        secret.setNewUser(z3);
        setResult(Resource.forSuccess(secret.build()));
    }

    @NonNull
    public static AuthUI.IdpConfig getGenericFacebookConfig() {
        return new AuthUI.IdpConfig.GenericOAuthProviderBuilder("facebook.com", "Facebook", R$layout.fui_idp_button_facebook).build();
    }

    @NonNull
    public static AuthUI.IdpConfig getGenericGoogleConfig() {
        return new AuthUI.IdpConfig.GenericOAuthProviderBuilder("google.com", "Google", R$layout.fui_idp_button_google).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAnonymousUpgradeFlow$4(FirebaseAuth firebaseAuth, FlowParameters flowParameters, final qz qzVar, Exception exc) {
        if (!(exc instanceof FirebaseAuthUserCollisionException)) {
            setResult(Resource.forFailure(exc));
            return;
        }
        FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
        final AuthCredential authCredentialT = firebaseAuthUserCollisionException.t();
        final String strRl = firebaseAuthUserCollisionException.rl();
        ProviderUtils.fetchSortedProviders(firebaseAuth, flowParameters, strRl).addOnSuccessListener(new OnSuccessListener() { // from class: JgN.aC
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f4673n.lambda$handleAnonymousUpgradeFlow$3(qzVar, authCredentialT, strRl, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNormalSignInFlow$1(qz qzVar, Exception exc) {
        if (!(exc instanceof FirebaseAuthException)) {
            setResult(Resource.forFailure(exc));
            return;
        }
        FirebaseAuthError firebaseAuthErrorFromException = FirebaseAuthError.fromException((FirebaseAuthException) exc);
        if (exc instanceof FirebaseAuthUserCollisionException) {
            FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
            setResult(Resource.forFailure(new FirebaseUiUserCollisionException(13, "Recoverable error.", qzVar.t(), firebaseAuthUserCollisionException.rl(), firebaseAuthUserCollisionException.t())));
        } else if (firebaseAuthErrorFromException == FirebaseAuthError.ERROR_WEB_CONTEXT_CANCELED) {
            setResult(Resource.forFailure(new UserCancellationException()));
        } else {
            setResult(Resource.forFailure(exc));
        }
    }

    protected void handleMergeFailure(@NonNull AuthCredential authCredential) {
        setResult(Resource.forFailure(new FirebaseAuthAnonymousUpgradeException(5, new IdpResponse.Builder().setPendingCredential(authCredential).build())));
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (i2 == 117) {
            IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(intent);
            if (idpResponseFromResultIntent == null) {
                setResult(Resource.forFailure(new UserCancellationException()));
            } else {
                setResult(Resource.forSuccess(idpResponseFromResultIntent));
            }
        }
    }

    public GenericIdpSignInHandler(Application application) {
        super(application);
    }

    private void handleAnonymousUpgradeFlow(final FirebaseAuth firebaseAuth, HelperActivityBase helperActivityBase, final qz qzVar, final FlowParameters flowParameters) {
        final boolean zIsUseEmulator = helperActivityBase.getAuthUI().isUseEmulator();
        firebaseAuth.xMQ().Zmq(helperActivityBase, qzVar).addOnSuccessListener(new OnSuccessListener() { // from class: JgN.Wre
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f4671n.lambda$handleAnonymousUpgradeFlow$2(zIsUseEmulator, qzVar, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: JgN.CN3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f4665n.lambda$handleAnonymousUpgradeFlow$4(firebaseAuth, flowParameters, qzVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAnonymousUpgradeFlow$2(boolean z2, qz qzVar, AuthResult authResult) {
        handleSuccess(z2, qzVar.t(), authResult.U(), (OAuthCredential) authResult.Org(), authResult.qm().M7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAnonymousUpgradeFlow$3(qz qzVar, AuthCredential authCredential, String str, List list) {
        if (list.isEmpty()) {
            setResult(Resource.forFailure(new FirebaseUiException(3, "Unable to complete the linkingflow - the user is using unsupported providers.")));
        } else if (list.contains(qzVar.t())) {
            handleMergeFailure(authCredential);
        } else {
            setResult(Resource.forFailure(new FirebaseUiUserCollisionException(13, "Recoverable error.", qzVar.t(), str, authCredential)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNormalSignInFlow$0(boolean z2, qz qzVar, AuthResult authResult) {
        handleSuccess(z2, qzVar.t(), authResult.U(), (OAuthCredential) authResult.Org(), authResult.qm().M7());
    }

    public qz buildOAuthProvider(String str, FirebaseAuth firebaseAuth) {
        qz.j jVarNr = qz.nr(str, firebaseAuth);
        ArrayList<String> stringArrayList = getArguments().getParams().getStringArrayList("generic_oauth_scopes");
        HashMap map = (HashMap) getArguments().getParams().getSerializable("generic_oauth_custom_parameters");
        if (stringArrayList != null) {
            jVarNr.t(stringArrayList);
        }
        if (map != null) {
            jVarNr.n(map);
        }
        return jVarNr.rl();
    }

    protected void handleNormalSignInFlow(FirebaseAuth firebaseAuth, HelperActivityBase helperActivityBase, final qz qzVar) {
        final boolean zIsUseEmulator = helperActivityBase.getAuthUI().isUseEmulator();
        firebaseAuth.nY(helperActivityBase, qzVar).addOnSuccessListener(new OnSuccessListener() { // from class: JgN.fuX
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f4675n.lambda$handleNormalSignInFlow$0(zIsUseEmulator, qzVar, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: JgN.Dsr
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f4667n.lambda$handleNormalSignInFlow$1(qzVar, exc);
            }
        });
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        setResult(Resource.forLoading());
        FlowParameters flowParams = helperActivityBase.getFlowParams();
        qz qzVarBuildOAuthProvider = buildOAuthProvider(str, firebaseAuth);
        if (flowParams != null && AuthOperationManager.getInstance().canUpgradeAnonymous(firebaseAuth, flowParams)) {
            handleAnonymousUpgradeFlow(firebaseAuth, helperActivityBase, qzVarBuildOAuthProvider, flowParams);
        } else {
            handleNormalSignInFlow(firebaseAuth, helperActivityBase, qzVarBuildOAuthProvider);
        }
    }

    protected void handleSuccess(boolean z2, @NonNull String str, @NonNull FirebaseUser firebaseUser, @NonNull OAuthCredential oAuthCredential, boolean z3) {
        handleSuccess(z2, str, firebaseUser, oAuthCredential, z3, true);
    }
}
