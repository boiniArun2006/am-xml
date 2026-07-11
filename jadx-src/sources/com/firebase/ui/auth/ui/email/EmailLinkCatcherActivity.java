package com.firebase.ui.auth.ui.email;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ComponentActivity;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.InvisibleActivityBase;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class EmailLinkCatcherActivity extends InvisibleActivityBase {
    private EmailLinkSignInHandler mHandler;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildAlertDialog$0(int i2, DialogInterface dialogInterface, int i3) {
        finish(i2, null);
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AlertDialog buildAlertDialog(final int i2) {
        String string;
        String string2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (i2 == 11) {
            string = getString(R$string.fui_email_link_different_anonymous_user_header);
            string2 = getString(R$string.fui_email_link_different_anonymous_user_message);
        } else if (i2 == 7) {
            string = getString(R$string.fui_email_link_invalid_link_header);
            string2 = getString(R$string.fui_email_link_invalid_link_message);
        } else {
            string = getString(R$string.fui_email_link_wrong_device_header);
            string2 = getString(R$string.fui_email_link_wrong_device_message);
        }
        return builder.setTitle(string).setMessage(string2).setPositiveButton(R$string.fui_email_link_dismiss_button, new DialogInterface.OnClickListener() { // from class: Rd.I28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f8715n.lambda$buildAlertDialog$0(i2, dialogInterface, i3);
            }
        }).create();
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.createBaseIntent(context, EmailLinkCatcherActivity.class, flowParameters);
    }

    private void initHandler() {
        EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) new ViewModelProvider(this).n(EmailLinkSignInHandler.class);
        this.mHandler = emailLinkSignInHandler;
        emailLinkSignInHandler.init(getFlowParams());
        this.mHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (exc instanceof UserCancellationException) {
                    EmailLinkCatcherActivity.this.finish(0, null);
                    return;
                }
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    EmailLinkCatcherActivity.this.finish(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).getResponse()));
                    return;
                }
                if (!(exc instanceof FirebaseUiException)) {
                    if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                        EmailLinkCatcherActivity.this.startErrorRecoveryFlow(115);
                        return;
                    } else {
                        EmailLinkCatcherActivity.this.finish(0, IdpResponse.getErrorIntent(exc));
                        return;
                    }
                }
                int errorCode = ((FirebaseUiException) exc).getErrorCode();
                if (errorCode == 8 || errorCode == 7 || errorCode == 11) {
                    EmailLinkCatcherActivity.this.buildAlertDialog(errorCode).show();
                    return;
                }
                if (errorCode == 9 || errorCode == 6) {
                    EmailLinkCatcherActivity.this.startErrorRecoveryFlow(115);
                } else if (errorCode == 10) {
                    EmailLinkCatcherActivity.this.startErrorRecoveryFlow(116);
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                EmailLinkCatcherActivity.this.finish(-1, idpResponse.toIntent());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startErrorRecoveryFlow(int i2) {
        if (i2 != 116 && i2 != 115) {
            throw new IllegalStateException("Invalid flow param. It must be either RequestCodes.EMAIL_LINK_CROSS_DEVICE_LINKING_FLOW or RequestCodes.EMAIL_LINK_PROMPT_FOR_EMAIL_FLOW");
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, EmailLinkErrorRecoveryActivity.createIntent(getApplicationContext(), getFlowParams(), i2), i2);
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 115 && i2 != 116) {
            return;
        }
        IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(intent);
        if (i3 == -1) {
            finish(-1, idpResponseFromResultIntent.toIntent());
        } else {
            finish(0, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.InvisibleActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        initHandler();
        if (getFlowParams().emailLink != null) {
            this.mHandler.startSignIn();
        }
    }
}
