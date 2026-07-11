package com.firebase.ui.auth.ui.idp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.data.remote.GoogleSignInHandler;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.InvisibleActivityBase;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class SingleSignInActivity extends InvisibleActivityBase {
    private SocialProviderResponseHandler mHandler;
    private ProviderSignInBase<?> mProvider;

    public static Intent createIntent(Context context, FlowParameters flowParameters, User user) {
        return HelperActivityBase.createBaseIntent(context, SingleSignInActivity.class, flowParameters).putExtra("extra_user", user);
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.mHandler.onActivityResult(i2, i3, intent);
        this.mProvider.onActivityResult(i2, i3, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.InvisibleActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        User user = User.getUser(getIntent());
        final String providerId = user.getProviderId();
        AuthUI.IdpConfig configFromIdps = ProviderUtils.getConfigFromIdps(getFlowParams().providers, providerId);
        if (configFromIdps == null) {
            finish(0, IdpResponse.getErrorIntent(new FirebaseUiException(3, "Provider not enabled: " + providerId)));
            return;
        }
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        SocialProviderResponseHandler socialProviderResponseHandler = (SocialProviderResponseHandler) viewModelProvider.n(SocialProviderResponseHandler.class);
        this.mHandler = socialProviderResponseHandler;
        socialProviderResponseHandler.init(getFlowParams());
        boolean zIsUseEmulator = getAuthUI().isUseEmulator();
        providerId.getClass();
        if (!providerId.equals("google.com")) {
            if (!providerId.equals("facebook.com")) {
                if (!TextUtils.isEmpty(configFromIdps.getParams().getString("generic_oauth_provider_id"))) {
                    this.mProvider = ((GenericIdpSignInHandler) viewModelProvider.n(GenericIdpSignInHandler.class)).initWith(configFromIdps);
                } else {
                    throw new IllegalStateException("Invalid provider id: " + providerId);
                }
            } else if (zIsUseEmulator) {
                this.mProvider = ((GenericIdpSignInHandler) viewModelProvider.n(GenericIdpSignInHandler.class)).initWith(GenericIdpSignInHandler.getGenericFacebookConfig());
            } else {
                this.mProvider = ((FacebookSignInHandler) viewModelProvider.n(FacebookSignInHandler.class)).initWith(configFromIdps);
            }
        } else if (zIsUseEmulator) {
            this.mProvider = ((GenericIdpSignInHandler) viewModelProvider.n(GenericIdpSignInHandler.class)).initWith(GenericIdpSignInHandler.getGenericGoogleConfig());
        } else {
            this.mProvider = ((GoogleSignInHandler) viewModelProvider.n(GoogleSignInHandler.class)).initWith(new GoogleSignInHandler.Params(configFromIdps, user.getEmail()));
        }
        this.mProvider.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.ui.idp.SingleSignInActivity.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    SingleSignInActivity.this.finish(0, new Intent().putExtra("extra_idp_response", IdpResponse.from(exc)));
                } else {
                    SingleSignInActivity.this.mHandler.startSignIn(IdpResponse.from(exc));
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                if ((!AuthUI.SOCIAL_PROVIDERS.contains(providerId) || SingleSignInActivity.this.getAuthUI().isUseEmulator()) && idpResponse.isSuccessful()) {
                    SingleSignInActivity.this.finish(idpResponse.isSuccessful() ? -1 : 0, idpResponse.toIntent());
                } else {
                    SingleSignInActivity.this.mHandler.startSignIn(idpResponse);
                }
            }
        });
        this.mHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.ui.idp.SingleSignInActivity.2
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (!(exc instanceof FirebaseAuthAnonymousUpgradeException)) {
                    SingleSignInActivity.this.finish(0, IdpResponse.getErrorIntent(exc));
                } else {
                    SingleSignInActivity.this.finish(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).getResponse()));
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                SingleSignInActivity singleSignInActivity = SingleSignInActivity.this;
                singleSignInActivity.startSaveCredentials(singleSignInActivity.mHandler.getCurrentUser(), idpResponse, null);
            }
        });
        if (this.mHandler.getOperation().J2() == null) {
            this.mProvider.startSignIn(getAuth(), this, providerId);
        }
    }
}
