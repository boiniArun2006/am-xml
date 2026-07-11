package com.firebase.ui.auth.viewmodel.email;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.remote.ProfileMerger;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.EmailLinkParser;
import com.firebase.ui.auth.util.data.EmailLinkPersistenceManager;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.util.data.TaskFailureLogger;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class EmailLinkSignInHandler extends SignInViewModelBase {
    public void finishSignIn(String str) {
        setResult(Resource.forLoading());
        finishSignIn(str, null);
    }

    private boolean isDifferentDeviceFlow(EmailLinkPersistenceManager.SessionRecord sessionRecord, String str) {
        return sessionRecord == null || TextUtils.isEmpty(sessionRecord.getSessionId()) || TextUtils.isEmpty(str) || !str.equals(sessionRecord.getSessionId());
    }

    public EmailLinkSignInHandler(Application application) {
        super(application);
    }

    private void determineDifferentDeviceErrorFlowAndFinish(@NonNull String str, @Nullable final String str2) {
        getAuth().O(str).addOnCompleteListener(new OnCompleteListener() { // from class: CB.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f819n.lambda$determineDifferentDeviceErrorFlowAndFinish$0(str2, task);
            }
        });
    }

    private void finishSignIn(EmailLinkPersistenceManager.SessionRecord sessionRecord) {
        finishSignIn(sessionRecord.getEmail(), sessionRecord.getIdpResponseForLinking());
    }

    private void handleLinkingFlow(AuthOperationManager authOperationManager, final EmailLinkPersistenceManager emailLinkPersistenceManager, final IdpResponse idpResponse, String str) {
        final AuthCredential authCredential = ProviderUtils.getAuthCredential(idpResponse);
        AuthCredential authCredentialRl = I28.rl(idpResponse.getEmail(), str);
        if (authOperationManager.canUpgradeAnonymous(getAuth(), getArguments())) {
            authOperationManager.safeLink(authCredentialRl, authCredential, getArguments()).addOnCompleteListener(new OnCompleteListener() { // from class: CB.I28
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f804n.lambda$handleLinkingFlow$1(emailLinkPersistenceManager, authCredential, task);
                }
            });
        } else {
            getAuth().WPU(authCredentialRl).continueWithTask(new Continuation() { // from class: CB.Wre
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.f810n.lambda$handleLinkingFlow$2(emailLinkPersistenceManager, authCredential, idpResponse, task);
                }
            }).addOnSuccessListener(new OnSuccessListener() { // from class: CB.CN3
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f802n.lambda$handleLinkingFlow$3((AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: CB.fuX
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f816n.lambda$handleLinkingFlow$4(exc);
                }
            });
        }
    }

    private void handleNormalFlow(AuthOperationManager authOperationManager, final EmailLinkPersistenceManager emailLinkPersistenceManager, String str, String str2) {
        AuthCredential authCredentialRl = I28.rl(str, str2);
        final AuthCredential authCredentialRl2 = I28.rl(str, str2);
        authOperationManager.signInAndLinkWithCredential(getAuth(), getArguments(), authCredentialRl).addOnSuccessListener(new OnSuccessListener() { // from class: CB.w6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f822n.lambda$handleNormalFlow$5(emailLinkPersistenceManager, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: CB.Ml
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f806n.lambda$handleNormalFlow$6(emailLinkPersistenceManager, authCredentialRl2, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$determineDifferentDeviceErrorFlowAndFinish$0(String str, Task task) {
        if (task.isSuccessful()) {
            if (!TextUtils.isEmpty(str)) {
                setResult(Resource.forFailure(new FirebaseUiException(10)));
                return;
            } else {
                setResult(Resource.forFailure(new FirebaseUiException(9)));
                return;
            }
        }
        setResult(Resource.forFailure(new FirebaseUiException(7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleLinkingFlow$1(EmailLinkPersistenceManager emailLinkPersistenceManager, AuthCredential authCredential, Task task) {
        emailLinkPersistenceManager.clearAllData(getApplication());
        if (task.isSuccessful()) {
            handleMergeFailure(authCredential);
        } else {
            setResult(Resource.forFailure(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$handleLinkingFlow$2(EmailLinkPersistenceManager emailLinkPersistenceManager, AuthCredential authCredential, IdpResponse idpResponse, Task task) throws Exception {
        emailLinkPersistenceManager.clearAllData(getApplication());
        if (!task.isSuccessful()) {
            return task;
        }
        return ((AuthResult) task.getResult()).U().Qu(authCredential).continueWithTask(new ProfileMerger(idpResponse)).addOnFailureListener(new TaskFailureLogger("EmailLinkSignInHandler", "linkWithCredential+merge failed."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleLinkingFlow$3(AuthResult authResult) {
        FirebaseUser firebaseUserU = authResult.U();
        handleSuccess(new IdpResponse.Builder(new User.Builder("emailLink", firebaseUserU.getEmail()).setName(firebaseUserU.getDisplayName()).setPhotoUri(firebaseUserU.getPhotoUrl()).build()).build(), authResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleLinkingFlow$4(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNormalFlow$5(EmailLinkPersistenceManager emailLinkPersistenceManager, AuthResult authResult) {
        emailLinkPersistenceManager.clearAllData(getApplication());
        FirebaseUser firebaseUserU = authResult.U();
        handleSuccess(new IdpResponse.Builder(new User.Builder("emailLink", firebaseUserU.getEmail()).setName(firebaseUserU.getDisplayName()).setPhotoUri(firebaseUserU.getPhotoUrl()).build()).build(), authResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNormalFlow$6(EmailLinkPersistenceManager emailLinkPersistenceManager, AuthCredential authCredential, Exception exc) {
        emailLinkPersistenceManager.clearAllData(getApplication());
        if (exc instanceof FirebaseAuthUserCollisionException) {
            handleMergeFailure(authCredential);
        } else {
            setResult(Resource.forFailure(exc));
        }
    }

    public void startSignIn() {
        setResult(Resource.forLoading());
        String str = getArguments().emailLink;
        if (!getAuth().HI(str)) {
            setResult(Resource.forFailure(new FirebaseUiException(7)));
            return;
        }
        EmailLinkPersistenceManager.SessionRecord sessionRecordRetrieveSessionRecord = EmailLinkPersistenceManager.getInstance().retrieveSessionRecord(getApplication());
        EmailLinkParser emailLinkParser = new EmailLinkParser(str);
        String sessionId = emailLinkParser.getSessionId();
        String anonymousUserId = emailLinkParser.getAnonymousUserId();
        String oobCode = emailLinkParser.getOobCode();
        String providerId = emailLinkParser.getProviderId();
        boolean forceSameDeviceBit = emailLinkParser.getForceSameDeviceBit();
        if (isDifferentDeviceFlow(sessionRecordRetrieveSessionRecord, sessionId)) {
            if (TextUtils.isEmpty(sessionId)) {
                setResult(Resource.forFailure(new FirebaseUiException(7)));
                return;
            } else if (!forceSameDeviceBit && TextUtils.isEmpty(anonymousUserId)) {
                determineDifferentDeviceErrorFlowAndFinish(oobCode, providerId);
                return;
            } else {
                setResult(Resource.forFailure(new FirebaseUiException(8)));
                return;
            }
        }
        if (anonymousUserId != null && (getAuth().xMQ() == null || (getAuth().xMQ().ub() && !anonymousUserId.equals(getAuth().xMQ().f())))) {
            setResult(Resource.forFailure(new FirebaseUiException(11)));
        } else {
            finishSignIn(sessionRecordRetrieveSessionRecord);
        }
    }

    private void finishSignIn(@NonNull String str, @Nullable IdpResponse idpResponse) {
        if (TextUtils.isEmpty(str)) {
            setResult(Resource.forFailure(new FirebaseUiException(6)));
            return;
        }
        AuthOperationManager authOperationManager = AuthOperationManager.getInstance();
        EmailLinkPersistenceManager emailLinkPersistenceManager = EmailLinkPersistenceManager.getInstance();
        String str2 = getArguments().emailLink;
        if (idpResponse == null) {
            handleNormalFlow(authOperationManager, emailLinkPersistenceManager, str, str2);
        } else {
            handleLinkingFlow(authOperationManager, emailLinkPersistenceManager, idpResponse, str2);
        }
    }
}
