package com.firebase.ui.auth;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.view.result.contract.ActivityResultContract;
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebaseAuthUIActivityResultContract extends ActivityResultContract<Intent, FirebaseAuthUIAuthenticationResult> {
    @Override // androidx.view.result.contract.ActivityResultContract
    @NonNull
    public Intent createIntent(@NonNull Context context, Intent intent) {
        return intent;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    @NonNull
    public FirebaseAuthUIAuthenticationResult parseResult(int i2, @Nullable Intent intent) {
        return new FirebaseAuthUIAuthenticationResult(Integer.valueOf(i2), IdpResponse.fromResultIntent(intent));
    }
}
