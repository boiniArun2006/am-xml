package com.firebase.ui.auth.viewmodel.email;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.remote.ProfileMerger;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.TaskFailureLogger;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.firebase.ui.auth.viewmodel.email.WelcomeBackPasswordHandler;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class WelcomeBackPasswordHandler extends SignInViewModelBase {
    private String mPendingPassword;

    public static /* synthetic */ Task O(AuthCredential authCredential, IdpResponse idpResponse, Task task) {
        AuthResult authResult = (AuthResult) task.getResult(Exception.class);
        return authCredential == null ? Tasks.forResult(authResult) : authResult.U().Qu(authCredential).continueWithTask(new ProfileMerger(idpResponse)).addOnFailureListener(new TaskFailureLogger("WBPasswordHandler", "linkWithCredential+merge failed."));
    }

    public String getPendingPassword() {
        return this.mPendingPassword;
    }

    public WelcomeBackPasswordHandler(Application application) {
        super(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$0(AuthCredential authCredential, AuthResult authResult) {
        handleMergeFailure(authCredential);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$1(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$2(AuthCredential authCredential, Task task) {
        if (task.isSuccessful()) {
            handleMergeFailure(authCredential);
        } else {
            setResult(Resource.forFailure(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$4(IdpResponse idpResponse, AuthResult authResult) {
        handleSuccess(idpResponse, authResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$5(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    public void startSignIn(@NonNull String str, @NonNull String str2, @NonNull IdpResponse idpResponse, @Nullable final AuthCredential authCredential) {
        final IdpResponse idpResponseBuild;
        setResult(Resource.forLoading());
        this.mPendingPassword = str2;
        if (authCredential == null) {
            idpResponseBuild = new IdpResponse.Builder(new User.Builder("password", str).build()).build();
        } else {
            idpResponseBuild = new IdpResponse.Builder(idpResponse.getUser()).setPendingCredential(idpResponse.getCredentialForLinking()).setToken(idpResponse.getIdpToken()).setSecret(idpResponse.getIdpSecret()).build();
        }
        AuthOperationManager authOperationManager = AuthOperationManager.getInstance();
        if (authOperationManager.canUpgradeAnonymous(getAuth(), getArguments())) {
            final AuthCredential authCredentialN = I28.n(str, str2);
            if (AuthUI.SOCIAL_PROVIDERS.contains(idpResponse.getProviderType())) {
                authOperationManager.safeLink(authCredentialN, authCredential, getArguments()).addOnSuccessListener(new OnSuccessListener() { // from class: CB.qz
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.f821n.lambda$startSignIn$0(authCredentialN, (AuthResult) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: CB.Pl
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        this.f808n.lambda$startSignIn$1(exc);
                    }
                });
                return;
            } else {
                authOperationManager.validateCredential(authCredentialN, getArguments()).addOnCompleteListener(new OnCompleteListener() { // from class: CB.Xo
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        this.f812n.lambda$startSignIn$2(authCredentialN, task);
                    }
                });
                return;
            }
        }
        getAuth().aYN(str, str2).continueWithTask(new Continuation() { // from class: CB.eO
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return WelcomeBackPasswordHandler.O(authCredential, idpResponseBuild, task);
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: CB.z
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f823n.lambda$startSignIn$4(idpResponseBuild, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: CB.QJ
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f809n.lambda$startSignIn$5(exc);
            }
        }).addOnFailureListener(new TaskFailureLogger("WBPasswordHandler", "signInWithEmailAndPassword failed."));
    }
}
