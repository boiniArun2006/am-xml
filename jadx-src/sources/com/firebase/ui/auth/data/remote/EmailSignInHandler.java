package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ComponentActivity;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class EmailSignInHandler extends SingleProviderSignInHandler<Void> {
    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (i3 != 5 && i2 == 106) {
            IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(intent);
            if (idpResponseFromResultIntent == null) {
                setResult(Resource.forFailure(new UserCancellationException()));
            } else {
                setResult(Resource.forSuccess(idpResponseFromResultIntent));
            }
        }
    }

    public EmailSignInHandler(Application application) {
        super(application, "password");
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(helperActivityBase, EmailActivity.createIntent(helperActivityBase, helperActivityBase.getFlowParams()), 106);
    }
}
