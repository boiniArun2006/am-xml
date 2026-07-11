package com.firebase.ui.auth.ui.phone;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.ui.auth.data.model.PhoneNumber;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.util.data.PhoneNumberUtils;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class CheckPhoneHandler extends AuthViewModelBase<PhoneNumber> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchCredential$1(Exception exc) {
        Log.e("CheckPhoneHandler", "Phone Number Hint failed", exc);
        setResult(Resource.forFailure(exc));
    }

    public void onActivityResult(Activity activity, int i2, int i3, @Nullable Intent intent) {
        if (i2 == 101 && i3 == -1) {
            try {
                String usingCurrentCountry = PhoneNumberUtils.formatUsingCurrentCountry(Identity.getSignInClient(activity).getPhoneNumberFromIntent(intent), getApplication());
                if (usingCurrentCountry != null) {
                    setResult(Resource.forSuccess(PhoneNumberUtils.getPhoneNumber(usingCurrentCountry)));
                } else {
                    setResult(Resource.forFailure(new Exception("Failed to format phone number")));
                }
            } catch (Exception e2) {
                Log.e("CheckPhoneHandler", "Phone Number Hint failed", e2);
                setResult(Resource.forFailure(e2));
            }
        }
    }

    public CheckPhoneHandler(Application application) {
        super(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchCredential$0(PendingIntent pendingIntent) {
        try {
            setResult(Resource.forFailure(new PendingIntentRequiredException(pendingIntent.getIntentSender(), 101)));
        } catch (Exception e2) {
            Log.e("CheckPhoneHandler", "Launching the IntentSender failed", e2);
            setResult(Resource.forFailure(e2));
        }
    }

    public void fetchCredential(Activity activity) {
        Identity.getSignInClient(activity).getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest.builder().build()).addOnSuccessListener(new OnSuccessListener() { // from class: LFd.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f5936n.lambda$fetchCredential$0((PendingIntent) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: LFd.n
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f5937n.lambda$fetchCredential$1(exc);
            }
        });
    }
}
