package com.firebase.ui.auth.ui.email;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.ImeHelper;
import com.firebase.ui.auth.util.ui.fieldvalidators.EmailFieldValidator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class CheckEmailFragment extends FragmentBase implements View.OnClickListener, ImeHelper.DonePressedListener {
    private EditText mEmailEditText;
    private EmailFieldValidator mEmailFieldValidator;
    private TextInputLayout mEmailLayout;
    private CheckEmailHandler mHandler;
    private CheckEmailListener mListener;
    private ProgressBar mProgressBar;
    private Button mSignInButton;
    private Button mSignUpButton;

    interface CheckEmailListener {
        void onExistingEmailUser(User user);

        void onNewUser(User user);
    }

    public static CheckEmailFragment newInstance(@Nullable String str) {
        CheckEmailFragment checkEmailFragment = new CheckEmailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        checkEmailFragment.setArguments(bundle);
        return checkEmailFragment;
    }

    private void signIn() {
        String string = this.mEmailEditText.getText().toString();
        if (this.mEmailFieldValidator.validate(string)) {
            this.mListener.onExistingEmailUser(new User.Builder(getEmailProvider(), string).build());
        }
    }

    private void signUp() {
        String string = this.mEmailEditText.getText().toString();
        if (this.mEmailFieldValidator.validate(string)) {
            this.mListener.onNewUser(new User.Builder(getEmailProvider(), string).build());
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mSignInButton.setEnabled(true);
        this.mSignUpButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.mHandler.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_check_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mSignInButton = (Button) view.findViewById(R$id.button_sign_in);
        this.mSignUpButton = (Button) view.findViewById(R$id.button_sign_up);
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.mEmailLayout = (TextInputLayout) view.findViewById(R$id.email_layout);
        this.mEmailEditText = (EditText) view.findViewById(R$id.email);
        this.mEmailFieldValidator = new EmailFieldValidator(this.mEmailLayout);
        this.mEmailLayout.setOnClickListener(this);
        this.mEmailEditText.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R$id.header_text);
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImeHelper.setImeOnDoneListener(this.mEmailEditText, this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.mEmailEditText.setImportantForAutofill(2);
        }
        this.mSignInButton.setOnClickListener(this);
        this.mSignUpButton.setOnClickListener(this);
        if (getEmailProvider().equals("emailLink")) {
            this.mSignUpButton.setVisibility(8);
        }
        TextView textView2 = (TextView) view.findViewById(R$id.email_tos_and_pp_text);
        TextView textView3 = (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text);
        FlowParameters flowParams = getFlowParams();
        if (!flowParams.shouldShowProviderChoice()) {
            PrivacyDisclosureUtils.setupTermsOfServiceAndPrivacyPolicyText(requireContext(), flowParams, textView2);
        } else {
            textView2.setVisibility(8);
            PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), flowParams, textView3);
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mSignInButton.setEnabled(false);
        this.mSignUpButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    private String getEmailProvider() {
        Iterator<AuthUI.IdpConfig> it = getFlowParams().providers.iterator();
        while (it.hasNext()) {
            if ("emailLink".equals(it.next().getProviderId())) {
                return "emailLink";
            }
        }
        return "password";
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        CheckEmailHandler checkEmailHandler = (CheckEmailHandler) new ViewModelProvider(this).n(CheckEmailHandler.class);
        this.mHandler = checkEmailHandler;
        checkEmailHandler.init(getFlowParams());
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof CheckEmailListener) {
            this.mListener = (CheckEmailListener) activity;
            if (bundle == null) {
                String string = getArguments().getString("extra_email");
                if (!TextUtils.isEmpty(string)) {
                    this.mEmailEditText.setText(string);
                    return;
                } else {
                    if (getFlowParams().enableCredentials) {
                        this.mHandler.fetchCredential();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Activity must implement CheckEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.button_sign_in) {
            signIn();
            return;
        }
        if (id == R$id.button_sign_up) {
            signUp();
        } else {
            if (id != R$id.email_layout && id != R$id.email) {
                return;
            }
            this.mEmailLayout.setError(null);
        }
    }

    @Override // com.firebase.ui.auth.util.ui.ImeHelper.DonePressedListener
    public void onDonePressed() {
        signIn();
    }
}
