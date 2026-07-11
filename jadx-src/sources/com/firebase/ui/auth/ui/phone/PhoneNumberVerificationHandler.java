package com.firebase.ui.auth.ui.phone;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.ui.auth.data.model.PhoneNumberVerificationRequiredException;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.Pl;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class PhoneNumberVerificationHandler extends AuthViewModelBase<PhoneVerification> {
    private PhoneAuthProvider.ForceResendingToken mForceResendingToken;
    private String mVerificationId;

    private boolean isBrowserAvailable(Activity activity) {
        return new Intent("android.intent.action.VIEW", Uri.parse(d.f62221v)).resolveActivity(activity.getPackageManager()) != null;
    }

    public void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (this.mVerificationId != null || bundle == null) {
            return;
        }
        this.mVerificationId = bundle.getString("verification_id");
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putString("verification_id", this.mVerificationId);
    }

    public void submitVerificationCode(String str, String str2) {
        setResult(Resource.forSuccess(new PhoneVerification(str, PhoneAuthProvider.n(this.mVerificationId, str2), false)));
    }

    public PhoneNumberVerificationHandler(Application application) {
        super(application);
    }

    public void verifyPhoneNumber(@NonNull Activity activity, final String str, boolean z2) {
        setResult(Resource.forLoading());
        Pl.j jVarT = Pl.n(getAuth()).O(str).J2(120L, TimeUnit.SECONDS).rl(activity).t(new PhoneAuthProvider.j() { // from class: com.firebase.ui.auth.ui.phone.PhoneNumberVerificationHandler.1
            @Override // com.google.firebase.auth.PhoneAuthProvider.j
            public void onCodeSent(@NonNull String str2, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                PhoneNumberVerificationHandler.this.mVerificationId = str2;
                PhoneNumberVerificationHandler.this.mForceResendingToken = forceResendingToken;
                PhoneNumberVerificationHandler.this.setResult(Resource.forFailure(new PhoneNumberVerificationRequiredException(str)));
            }

            @Override // com.google.firebase.auth.PhoneAuthProvider.j
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                PhoneNumberVerificationHandler.this.setResult(Resource.forSuccess(new PhoneVerification(str, phoneAuthCredential, true)));
            }

            @Override // com.google.firebase.auth.PhoneAuthProvider.j
            public void onVerificationFailed(@NonNull FirebaseException firebaseException) {
                PhoneNumberVerificationHandler.this.setResult(Resource.forFailure(firebaseException));
            }
        });
        if (z2) {
            jVarT.nr(this.mForceResendingToken);
        }
        if (isBrowserAvailable(activity)) {
            PhoneAuthProvider.rl(jVarT.n());
        } else {
            setResult(Resource.forFailure(new ActivityNotFoundException("No browser was found in this device")));
        }
    }
}
