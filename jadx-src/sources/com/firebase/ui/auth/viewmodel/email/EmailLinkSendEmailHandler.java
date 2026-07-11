package com.firebase.ui.auth.viewmodel.email;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.ContinueUrlBuilder;
import com.firebase.ui.auth.util.data.EmailLinkPersistenceManager;
import com.firebase.ui.auth.util.data.SessionUtils;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class EmailLinkSendEmailHandler extends AuthViewModelBase<String> {
    public EmailLinkSendEmailHandler(Application application) {
        super(application);
    }

    private ActionCodeSettings addSessionInfoToActionCodeSettings(@NonNull ActionCodeSettings actionCodeSettings, @NonNull String str, @NonNull String str2, @Nullable IdpResponse idpResponse, boolean z2) {
        ContinueUrlBuilder continueUrlBuilder = new ContinueUrlBuilder(actionCodeSettings.Qu());
        continueUrlBuilder.appendSessionId(str);
        continueUrlBuilder.appendAnonymousUserId(str2);
        continueUrlBuilder.appendForceSameDeviceBit(z2);
        if (idpResponse != null) {
            continueUrlBuilder.appendProviderId(idpResponse.getProviderType());
        }
        return ActionCodeSettings.HBN().O(continueUrlBuilder.build()).t(true).rl(actionCodeSettings.Uf(), actionCodeSettings.Bu(), actionCodeSettings.p0N()).nr(actionCodeSettings.f()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSignInLinkToEmail$0(String str, String str2, String str3, Task task) {
        if (task.isSuccessful()) {
            EmailLinkPersistenceManager.getInstance().saveEmail(getApplication(), str, str2, str3);
            setResult(Resource.forSuccess(str));
        } else {
            setResult(Resource.forFailure(task.getException()));
        }
    }

    public void sendSignInLinkToEmail(@NonNull final String str, @NonNull ActionCodeSettings actionCodeSettings, @Nullable IdpResponse idpResponse, boolean z2) {
        String strF;
        if (getAuth() == null) {
            return;
        }
        setResult(Resource.forLoading());
        if (AuthOperationManager.getInstance().canUpgradeAnonymous(getAuth(), getArguments())) {
            strF = getAuth().xMQ().f();
        } else {
            strF = null;
        }
        final String str2 = strF;
        final String strGenerateRandomAlphaNumericString = SessionUtils.generateRandomAlphaNumericString(10);
        getAuth().o(str, addSessionInfoToActionCodeSettings(actionCodeSettings, strGenerateRandomAlphaNumericString, str2, idpResponse, z2)).addOnCompleteListener(new OnCompleteListener() { // from class: CB.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f817n.lambda$sendSignInLinkToEmail$0(str, strGenerateRandomAlphaNumericString, str2, task);
            }
        });
    }
}
