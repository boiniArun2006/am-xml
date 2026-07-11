package com.firebase.ui.auth.ui.email;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.KeyEventDispatcher;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.fieldvalidators.EmailFieldValidator;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class EmailLinkPromptEmailFragment extends FragmentBase implements View.OnClickListener {
    private EditText mEmailEditText;
    private EmailFieldValidator mEmailFieldValidator;
    private TextInputLayout mEmailLayout;
    private EmailLinkSignInHandler mHandler;
    private EmailLinkPromptEmailListener mListener;
    private Button mNextButton;
    private ProgressBar mProgressBar;
    private Button mSignUpButton;

    interface EmailLinkPromptEmailListener {
        void onEmailPromptSuccess(IdpResponse idpResponse);
    }

    private void initHandler() {
        EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) new ViewModelProvider(this).n(EmailLinkSignInHandler.class);
        this.mHandler = emailLinkSignInHandler;
        emailLinkSignInHandler.init(getFlowParams());
        this.mHandler.getOperation().mUb(getViewLifecycleOwner(), new ResourceObserver<IdpResponse>(this) { // from class: com.firebase.ui.auth.ui.email.EmailLinkPromptEmailFragment.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                EmailLinkPromptEmailFragment.this.mEmailLayout.setError(exc.getMessage());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                EmailLinkPromptEmailFragment.this.mListener.onEmailPromptSuccess(idpResponse);
            }
        });
    }

    public static EmailLinkPromptEmailFragment newInstance() {
        return new EmailLinkPromptEmailFragment();
    }

    private void validateEmailAndFinishSignIn() {
        String string = this.mEmailEditText.getText().toString();
        if (this.mEmailFieldValidator.validate(string)) {
            this.mHandler.finishSignIn(string);
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mNextButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_check_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mNextButton = (Button) view.findViewById(R$id.button_sign_in);
        this.mSignUpButton = (Button) view.findViewById(R$id.button_sign_up);
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.mNextButton.setOnClickListener(this);
        this.mEmailLayout = (TextInputLayout) view.findViewById(R$id.email_layout);
        this.mEmailEditText = (EditText) view.findViewById(R$id.email);
        this.mEmailFieldValidator = new EmailFieldValidator(this.mEmailLayout);
        this.mEmailLayout.setOnClickListener(this);
        this.mEmailEditText.setOnClickListener(this);
        getActivity().setTitle(R$string.fui_email_link_confirm_email_header);
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), getFlowParams(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mNextButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof EmailLinkPromptEmailListener) {
            this.mListener = (EmailLinkPromptEmailListener) activity;
            initHandler();
            return;
        }
        throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.button_sign_in) {
            validateEmailAndFinishSignIn();
        } else {
            if (id != R$id.email_layout && id != R$id.email) {
                return;
            }
            this.mEmailLayout.setError(null);
        }
    }
}
