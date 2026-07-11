package com.firebase.ui.auth.ui.idp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.firebase.ui.auth.data.remote.GenericIdpAnonymousUpgradeLinkingHandler;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.data.remote.GoogleSignInHandler;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class WelcomeBackIdpPrompt extends AppCompatBase {
    private Button mDoneButton;
    private ProgressBar mProgressBar;
    private TextView mPromptText;
    private ProviderSignInBase<?> mProvider;

    public static Intent createIntent(Context context, FlowParameters flowParameters, User user) {
        return createIntent(context, flowParameters, user, null);
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters, User user, @Nullable IdpResponse idpResponse) {
        return HelperActivityBase.createBaseIntent(context, WelcomeBackIdpPrompt.class, flowParameters).putExtra("extra_idp_response", idpResponse).putExtra("extra_user", user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(String str, View view) {
        this.mProvider.startSignIn(getAuth(), this, str);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mDoneButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mDoneButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.mProvider.onActivityResult(i2, i3, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R$layout.fui_welcome_back_idp_prompt_layout);
        this.mDoneButton = (Button) findViewById(R$id.welcome_back_idp_button);
        this.mProgressBar = (ProgressBar) findViewById(R$id.top_progress_bar);
        this.mPromptText = (TextView) findViewById(R$id.welcome_back_idp_prompt);
        User user = User.getUser(getIntent());
        IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(getIntent());
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        final LinkingSocialProviderResponseHandler linkingSocialProviderResponseHandler = (LinkingSocialProviderResponseHandler) viewModelProvider.n(LinkingSocialProviderResponseHandler.class);
        linkingSocialProviderResponseHandler.init(getFlowParams());
        if (idpResponseFromResultIntent != null) {
            linkingSocialProviderResponseHandler.setRequestedSignInCredentialForEmail(ProviderUtils.getAuthCredential(idpResponseFromResultIntent), user.getEmail());
        }
        final String providerId = user.getProviderId();
        AuthUI.IdpConfig configFromIdps = ProviderUtils.getConfigFromIdps(getFlowParams().providers, providerId);
        if (configFromIdps == null) {
            finish(0, IdpResponse.getErrorIntent(new FirebaseUiException(3, "Firebase login unsuccessful. Account linking failed due to provider not enabled by application: " + providerId)));
            return;
        }
        String string2 = configFromIdps.getParams().getString("generic_oauth_provider_id");
        boolean zIsUseEmulator = getAuthUI().isUseEmulator();
        providerId.getClass();
        if (!providerId.equals("google.com")) {
            if (!providerId.equals("facebook.com")) {
                if (TextUtils.equals(providerId, string2)) {
                    this.mProvider = ((GenericIdpAnonymousUpgradeLinkingHandler) viewModelProvider.n(GenericIdpAnonymousUpgradeLinkingHandler.class)).initWith(configFromIdps);
                    string = configFromIdps.getParams().getString("generic_oauth_provider_name");
                } else {
                    throw new IllegalStateException("Invalid provider id: " + providerId);
                }
            } else {
                if (zIsUseEmulator) {
                    this.mProvider = ((GenericIdpAnonymousUpgradeLinkingHandler) viewModelProvider.n(GenericIdpAnonymousUpgradeLinkingHandler.class)).initWith(GenericIdpSignInHandler.getGenericFacebookConfig());
                } else {
                    this.mProvider = ((FacebookSignInHandler) viewModelProvider.n(FacebookSignInHandler.class)).initWith(configFromIdps);
                }
                string = getString(R$string.fui_idp_name_facebook);
            }
        } else {
            if (zIsUseEmulator) {
                this.mProvider = ((GenericIdpAnonymousUpgradeLinkingHandler) viewModelProvider.n(GenericIdpAnonymousUpgradeLinkingHandler.class)).initWith(GenericIdpSignInHandler.getGenericGoogleConfig());
            } else {
                this.mProvider = ((GoogleSignInHandler) viewModelProvider.n(GoogleSignInHandler.class)).initWith(new GoogleSignInHandler.Params(configFromIdps, user.getEmail()));
            }
            string = getString(R$string.fui_idp_name_google);
        }
        this.mProvider.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                linkingSocialProviderResponseHandler.startSignIn(IdpResponse.from(exc));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                if ((!WelcomeBackIdpPrompt.this.getAuthUI().isUseEmulator() && AuthUI.SOCIAL_PROVIDERS.contains(idpResponse.getProviderType())) || idpResponse.hasCredentialForLinking() || linkingSocialProviderResponseHandler.hasCredentialForLinking()) {
                    linkingSocialProviderResponseHandler.startSignIn(idpResponse);
                } else {
                    WelcomeBackIdpPrompt.this.finish(-1, idpResponse.toIntent());
                }
            }
        });
        this.mPromptText.setText(getString(R$string.fui_welcome_back_idp_prompt, user.getEmail(), string));
        this.mDoneButton.setOnClickListener(new View.OnClickListener() { // from class: Sor.Dsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9931n.lambda$onCreate$0(providerId, view);
            }
        });
        linkingSocialProviderResponseHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt.2
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (!(exc instanceof FirebaseAuthAnonymousUpgradeException)) {
                    WelcomeBackIdpPrompt.this.finish(0, IdpResponse.getErrorIntent(exc));
                } else {
                    WelcomeBackIdpPrompt.this.finish(5, ((FirebaseAuthAnonymousUpgradeException) exc).getResponse().toIntent());
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                WelcomeBackIdpPrompt.this.finish(-1, idpResponse.toIntent());
            }
        });
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(this, getFlowParams(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
