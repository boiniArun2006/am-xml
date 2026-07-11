package com.firebase.ui.auth.util.data;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Wre;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.I28;
import com.google.firebase.auth.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class AuthOperationManager {
    private static String firebaseAppName = "FUIScratchApp";
    private static AuthOperationManager mAuthManager;

    @VisibleForTesting
    public FirebaseAuth mScratchAuth;

    public static synchronized AuthOperationManager getInstance() {
        try {
            if (mAuthManager == null) {
                mAuthManager = new AuthOperationManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return mAuthManager;
    }

    private Wre getScratchApp(Wre wre) {
        try {
            return Wre.ty(firebaseAppName);
        } catch (IllegalStateException unused) {
            return Wre.XQ(wre.qie(), wre.ck(), firebaseAppName);
        }
    }

    private FirebaseAuth getScratchAuth(FlowParameters flowParameters) {
        if (this.mScratchAuth == null) {
            AuthUI authUI = AuthUI.getInstance(flowParameters.appName);
            this.mScratchAuth = FirebaseAuth.getInstance(getScratchApp(authUI.getApp()));
            if (authUI.isUseEmulator()) {
                this.mScratchAuth.te(authUI.getEmulatorHost(), authUI.getEmulatorPort());
            }
        }
        return this.mScratchAuth;
    }

    private AuthOperationManager() {
    }

    public static /* synthetic */ Task n(AuthCredential authCredential, Task task) {
        if (task.isSuccessful()) {
            return ((AuthResult) task.getResult()).U().Qu(authCredential);
        }
        return task;
    }

    public boolean canUpgradeAnonymous(FirebaseAuth firebaseAuth, FlowParameters flowParameters) {
        if (flowParameters.isAnonymousUpgradeEnabled() && firebaseAuth.xMQ() != null && firebaseAuth.xMQ().ub()) {
            return true;
        }
        return false;
    }

    public Task<AuthResult> createOrLinkUserWithEmailAndPassword(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull String str, @NonNull String str2) {
        if (canUpgradeAnonymous(firebaseAuth, flowParameters)) {
            return firebaseAuth.xMQ().Qu(I28.n(str, str2));
        }
        return firebaseAuth.J2(str, str2);
    }

    @NonNull
    public Task<AuthResult> safeGenericIdpSignIn(@NonNull HelperActivityBase helperActivityBase, @NonNull qz qzVar, @NonNull FlowParameters flowParameters) {
        return getScratchAuth(flowParameters).nY(helperActivityBase, qzVar);
    }

    public Task<AuthResult> safeLink(AuthCredential authCredential, final AuthCredential authCredential2, FlowParameters flowParameters) {
        return getScratchAuth(flowParameters).WPU(authCredential).continueWithTask(new Continuation() { // from class: ou.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return AuthOperationManager.n(authCredential2, task);
            }
        });
    }

    public Task<AuthResult> signInAndLinkWithCredential(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull AuthCredential authCredential) {
        if (canUpgradeAnonymous(firebaseAuth, flowParameters)) {
            return firebaseAuth.xMQ().Qu(authCredential);
        }
        return firebaseAuth.WPU(authCredential);
    }

    @NonNull
    public Task<AuthResult> validateCredential(AuthCredential authCredential, FlowParameters flowParameters) {
        return getScratchAuth(flowParameters).WPU(authCredential);
    }
}
