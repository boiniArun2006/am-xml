package com.firebase.ui.auth.data.remote;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OAuthCredential;
import com.google.firebase.auth.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class GenericIdpAnonymousUpgradeLinkingHandler extends GenericIdpSignInHandler {
    public GenericIdpAnonymousUpgradeLinkingHandler(Application application) {
        super(application);
    }

    private void handleAnonymousUpgradeLinkingFlow(HelperActivityBase helperActivityBase, final qz qzVar, FlowParameters flowParameters) {
        final boolean zIsUseEmulator = helperActivityBase.getAuthUI().isUseEmulator();
        AuthOperationManager.getInstance().safeGenericIdpSignIn(helperActivityBase, qzVar, flowParameters).addOnSuccessListener(new OnSuccessListener() { // from class: JgN.Ml
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f4669n.lambda$handleAnonymousUpgradeLinkingFlow$0(zIsUseEmulator, qzVar, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: JgN.I28
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f4668n.lambda$handleAnonymousUpgradeLinkingFlow$1(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAnonymousUpgradeLinkingFlow$0(boolean z2, qz qzVar, AuthResult authResult) {
        handleSuccess(z2, qzVar.t(), authResult.U(), (OAuthCredential) authResult.Org(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAnonymousUpgradeLinkingFlow$1(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    @Override // com.firebase.ui.auth.data.remote.GenericIdpSignInHandler, com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        setResult(Resource.forLoading());
        FlowParameters flowParams = helperActivityBase.getFlowParams();
        qz qzVarBuildOAuthProvider = buildOAuthProvider(str, firebaseAuth);
        if (flowParams != null && AuthOperationManager.getInstance().canUpgradeAnonymous(firebaseAuth, flowParams)) {
            handleAnonymousUpgradeLinkingFlow(helperActivityBase, qzVarBuildOAuthProvider, flowParams);
        } else {
            handleNormalSignInFlow(firebaseAuth, helperActivityBase, qzVarBuildOAuthProvider);
        }
    }
}
