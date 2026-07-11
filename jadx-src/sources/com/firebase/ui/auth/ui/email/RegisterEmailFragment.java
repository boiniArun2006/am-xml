package com.firebase.ui.auth.ui.email;

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
import androidx.fragment.app.FragmentActivity;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$integer;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$plurals;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.util.ui.ImeHelper;
import com.firebase.ui.auth.util.ui.fieldvalidators.BaseValidator;
import com.firebase.ui.auth.util.ui.fieldvalidators.EmailFieldValidator;
import com.firebase.ui.auth.util.ui.fieldvalidators.NoOpValidator;
import com.firebase.ui.auth.util.ui.fieldvalidators.PasswordFieldValidator;
import com.firebase.ui.auth.util.ui.fieldvalidators.RequiredFieldValidator;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.email.EmailProviderResponseHandler;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class RegisterEmailFragment extends FragmentBase implements View.OnClickListener, View.OnFocusChangeListener, ImeHelper.DonePressedListener {
    private EditText mEmailEditText;
    private EmailFieldValidator mEmailFieldValidator;
    private TextInputLayout mEmailInput;
    private EmailProviderResponseHandler mHandler;
    private AnonymousUpgradeListener mListener;
    private EditText mNameEditText;
    private BaseValidator mNameValidator;
    private Button mNextButton;
    private EditText mPasswordEditText;
    private PasswordFieldValidator mPasswordFieldValidator;
    private TextInputLayout mPasswordInput;
    private ProgressBar mProgressBar;
    private User mUser;

    interface AnonymousUpgradeListener {
        void onMergeFailure(IdpResponse idpResponse);
    }

    public static RegisterEmailFragment newInstance(User user) {
        RegisterEmailFragment registerEmailFragment = new RegisterEmailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_user", user);
        registerEmailFragment.setArguments(bundle);
        return registerEmailFragment;
    }

    private void safeRequestFocus(final View view) {
        view.post(new Runnable() { // from class: Rd.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                view.requestFocus();
            }
        });
    }

    private void validateAndRegisterUser() {
        String string = this.mEmailEditText.getText().toString();
        String string2 = this.mPasswordEditText.getText().toString();
        String string3 = this.mNameEditText.getText().toString();
        boolean zValidate = this.mEmailFieldValidator.validate(string);
        boolean zValidate2 = this.mPasswordFieldValidator.validate(string2);
        boolean zValidate3 = this.mNameValidator.validate(string3);
        if (zValidate && zValidate2 && zValidate3) {
            this.mHandler.startSignIn(new IdpResponse.Builder(new User.Builder("password", string).setName(string3).setPhotoUri(this.mUser.getPhotoUri()).build()).build(), string2);
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mNextButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_register_email_layout, viewGroup, false);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        if (z2) {
            return;
        }
        int id = view.getId();
        if (id == R$id.email) {
            this.mEmailFieldValidator.validate(this.mEmailEditText.getText());
        } else if (id == R$id.name) {
            this.mNameValidator.validate(this.mNameEditText.getText());
        } else if (id == R$id.password) {
            this.mPasswordFieldValidator.validate(this.mPasswordEditText.getText());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putParcelable("extra_user", new User.Builder("password", this.mEmailEditText.getText().toString()).setName(this.mNameEditText.getText().toString()).setPhotoUri(this.mUser.getPhotoUri()).build());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mNextButton = (Button) view.findViewById(R$id.button_create);
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.mEmailEditText = (EditText) view.findViewById(R$id.email);
        this.mNameEditText = (EditText) view.findViewById(R$id.name);
        this.mPasswordEditText = (EditText) view.findViewById(R$id.password);
        this.mEmailInput = (TextInputLayout) view.findViewById(R$id.email_layout);
        this.mPasswordInput = (TextInputLayout) view.findViewById(R$id.password_layout);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R$id.name_layout);
        boolean z2 = ProviderUtils.getConfigFromIdpsOrThrow(getFlowParams().providers, "password").getParams().getBoolean("extra_require_name", true);
        this.mPasswordFieldValidator = new PasswordFieldValidator(this.mPasswordInput, getResources().getInteger(R$integer.fui_min_password_length));
        this.mNameValidator = z2 ? new RequiredFieldValidator(textInputLayout, getResources().getString(R$string.fui_missing_first_and_last_name)) : new NoOpValidator(textInputLayout);
        this.mEmailFieldValidator = new EmailFieldValidator(this.mEmailInput);
        ImeHelper.setImeOnDoneListener(this.mPasswordEditText, this);
        this.mEmailEditText.setOnFocusChangeListener(this);
        this.mNameEditText.setOnFocusChangeListener(this);
        this.mPasswordEditText.setOnFocusChangeListener(this);
        this.mNextButton.setOnClickListener(this);
        textInputLayout.setVisibility(z2 ? 0 : 8);
        if (Build.VERSION.SDK_INT >= 26 && getFlowParams().enableCredentials) {
            this.mEmailEditText.setImportantForAutofill(2);
        }
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), getFlowParams(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
        if (bundle != null) {
            return;
        }
        String email = this.mUser.getEmail();
        if (!TextUtils.isEmpty(email)) {
            this.mEmailEditText.setText(email);
        }
        String name = this.mUser.getName();
        if (!TextUtils.isEmpty(name)) {
            this.mNameEditText.setText(name);
        }
        if (!z2 || !TextUtils.isEmpty(this.mNameEditText.getText())) {
            safeRequestFocus(this.mPasswordEditText);
        } else if (TextUtils.isEmpty(this.mEmailEditText.getText())) {
            safeRequestFocus(this.mEmailEditText);
        } else {
            safeRequestFocus(this.mNameEditText);
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mNextButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setTitle(R$string.fui_title_register_email);
        if (fragmentActivityRequireActivity instanceof AnonymousUpgradeListener) {
            this.mListener = (AnonymousUpgradeListener) fragmentActivityRequireActivity;
            return;
        }
        throw new IllegalStateException("Activity must implement CheckEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.button_create) {
            validateAndRegisterUser();
        }
    }

    @Override // com.firebase.ui.auth.ui.FragmentBase, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.mUser = User.getUser(getArguments());
        } else {
            this.mUser = User.getUser(bundle);
        }
        EmailProviderResponseHandler emailProviderResponseHandler = (EmailProviderResponseHandler) new ViewModelProvider(this).n(EmailProviderResponseHandler.class);
        this.mHandler = emailProviderResponseHandler;
        emailProviderResponseHandler.init(getFlowParams());
        this.mHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this, R$string.fui_progress_dialog_signing_up) { // from class: com.firebase.ui.auth.ui.email.RegisterEmailFragment.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (exc instanceof FirebaseAuthWeakPasswordException) {
                    RegisterEmailFragment.this.mPasswordInput.setError(RegisterEmailFragment.this.getResources().getQuantityString(R$plurals.fui_error_weak_password, R$integer.fui_min_password_length));
                    return;
                }
                if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                    RegisterEmailFragment.this.mEmailInput.setError(RegisterEmailFragment.this.getString(R$string.fui_invalid_email_address));
                } else if (!(exc instanceof FirebaseAuthAnonymousUpgradeException)) {
                    RegisterEmailFragment.this.mEmailInput.setError(RegisterEmailFragment.this.getString(R$string.fui_email_account_creation_error));
                } else {
                    RegisterEmailFragment.this.mListener.onMergeFailure(((FirebaseAuthAnonymousUpgradeException) exc).getResponse());
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                RegisterEmailFragment registerEmailFragment = RegisterEmailFragment.this;
                registerEmailFragment.startSaveCredentials(registerEmailFragment.mHandler.getCurrentUser(), idpResponse, RegisterEmailFragment.this.mPasswordEditText.getText().toString());
            }
        });
    }

    @Override // com.firebase.ui.auth.util.ui.ImeHelper.DonePressedListener
    public void onDonePressed() {
        validateAndRegisterUser();
    }
}
