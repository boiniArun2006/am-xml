package com.firebase.ui.auth.ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ComponentActivity;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.TextHelper;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class WelcomeBackEmailLinkPrompt extends AppCompatBase implements View.OnClickListener {
    private IdpResponse mIdpResponseForLinking;
    private ProgressBar mProgressBar;
    private Button mSignInButton;

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters, IdpResponse idpResponse) {
        return HelperActivityBase.createBaseIntent(context, WelcomeBackEmailLinkPrompt.class, flowParameters).putExtra("extra_idp_response", idpResponse);
    }

    private void initializeViewObjects() {
        this.mSignInButton = (Button) findViewById(R$id.button_sign_in);
        this.mProgressBar = (ProgressBar) findViewById(R$id.top_progress_bar);
    }

    private void setBodyText() {
        TextView textView = (TextView) findViewById(R$id.welcome_back_email_link_body);
        String string = getString(R$string.fui_welcome_back_email_link_prompt_body, this.mIdpResponseForLinking.getEmail(), this.mIdpResponseForLinking.getProviderType());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        TextHelper.boldAllOccurencesOfText(spannableStringBuilder, string, this.mIdpResponseForLinking.getEmail());
        TextHelper.boldAllOccurencesOfText(spannableStringBuilder, string, this.mIdpResponseForLinking.getProviderType());
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
    }

    private void setOnClickListeners() {
        this.mSignInButton.setOnClickListener(this);
    }

    private void setPrivacyFooter() {
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(this, getFlowParams(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mProgressBar.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mSignInButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    private void startEmailLinkFlow() {
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, EmailActivity.createIntentForLinking(this, getFlowParams(), this.mIdpResponseForLinking), 112);
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        finish(i3, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.button_sign_in) {
            startEmailLinkFlow();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_welcome_back_email_link_prompt_layout);
        this.mIdpResponseForLinking = IdpResponse.fromResultIntent(getIntent());
        initializeViewObjects();
        setBodyText();
        setOnClickListeners();
        setPrivacyFooter();
    }
}
