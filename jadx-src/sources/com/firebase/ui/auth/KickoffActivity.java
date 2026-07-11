package com.firebase.ui.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.data.remote.SignInKickstarter;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.InvisibleActivityBase;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class KickoffActivity extends InvisibleActivityBase {
    public static SignInKickstarter mKickstarter;

    public static Intent createIntent(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.createBaseIntent(context, KickoffActivity.class, flowParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(Exception exc) {
        finish(0, IdpResponse.getErrorIntent(new FirebaseUiException(2, exc)));
    }

    public static /* synthetic */ void m(Bundle bundle, Void r12) {
        if (bundle != null) {
            return;
        }
        mKickstarter.start();
    }

    public void invalidateEmailLink() {
        FlowParameters flowParams = getFlowParams();
        flowParams.emailLink = null;
        setIntent(getIntent().putExtra("extra_flow_params", flowParams));
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 106 && (i3 == 113 || i3 == 114)) {
            invalidateEmailLink();
        }
        mKickstarter.onActivityResult(i2, i3, intent);
    }

    @Override // com.firebase.ui.auth.ui.InvisibleActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable final Bundle bundle) {
        Task<Void> taskForResult;
        super.onCreate(bundle);
        SignInKickstarter signInKickstarter = (SignInKickstarter) new ViewModelProvider(this).n(SignInKickstarter.class);
        mKickstarter = signInKickstarter;
        signInKickstarter.init(getFlowParams());
        mKickstarter.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.KickoffActivity.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (exc instanceof UserCancellationException) {
                    KickoffActivity.this.finish(0, null);
                } else if (!(exc instanceof FirebaseAuthAnonymousUpgradeException)) {
                    KickoffActivity.this.finish(0, IdpResponse.getErrorIntent(exc));
                } else {
                    KickoffActivity.this.finish(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).getResponse()));
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                KickoffActivity.this.finish(-1, idpResponse.toIntent());
            }
        });
        if (getFlowParams().isPlayServicesRequired()) {
            taskForResult = GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(this);
        } else {
            taskForResult = Tasks.forResult(null);
        }
        taskForResult.addOnSuccessListener(this, new OnSuccessListener() { // from class: yYM.Ml
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                KickoffActivity.m(bundle, (Void) obj);
            }
        }).addOnFailureListener(this, new OnFailureListener() { // from class: yYM.I28
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f75683n.lambda$onCreate$1(exc);
            }
        });
    }
}
