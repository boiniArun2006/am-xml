package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class AnonymousSignInHandler extends SingleProviderSignInHandler<FlowParameters> {

    @VisibleForTesting
    public FirebaseAuth mAuth;

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    public AnonymousSignInHandler(Application application) {
        super(application, "anonymous");
    }

    private IdpResponse initResponse(boolean z2) {
        return new IdpResponse.Builder(new User.Builder("anonymous", null).build()).setNewUser(z2).build();
    }

    private FirebaseAuth getAuth() {
        return AuthUI.getInstance(getArguments().appName).getAuth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$0(AuthResult authResult) {
        setResult(Resource.forSuccess(initResponse(authResult.qm().M7())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$1(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    protected void onCreate() {
        this.mAuth = getAuth();
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        setResult(Resource.forLoading());
        this.mAuth.S().addOnSuccessListener(new OnSuccessListener() { // from class: JgN.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f4677n.lambda$startSignIn$0((AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: JgN.n
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f4678n.lambda$startSignIn$1(exc);
            }
        });
    }
}
