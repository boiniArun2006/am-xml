package com.firebase.ui.auth.ui.phone;

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
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.PhoneNumber;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.PhoneNumberUtils;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.ImeHelper;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class CheckPhoneNumberFragment extends FragmentBase implements View.OnClickListener {
    private boolean mCalled;
    private CheckPhoneHandler mCheckPhoneHandler;
    private View mCountryListAnchor;
    private CountryListSpinner mCountryListSpinner;
    private TextView mFooterText;
    private EditText mPhoneEditText;
    private TextInputLayout mPhoneInputLayout;
    private ProgressBar mProgressBar;
    private TextView mSmsTermsText;
    private Button mSubmitButton;
    private PhoneNumberVerificationHandler mVerificationHandler;

    @Nullable
    private String getPseudoValidPhoneNumber() {
        String string = this.mPhoneEditText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return PhoneNumberUtils.format(string, this.mCountryListSpinner.getSelectedCountryInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupCountrySpinner$0(View view) {
        this.mPhoneInputLayout.setError(null);
    }

    public static CheckPhoneNumberFragment newInstance(Bundle bundle) {
        CheckPhoneNumberFragment checkPhoneNumberFragment = new CheckPhoneNumberFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra_params", bundle);
        checkPhoneNumberFragment.setArguments(bundle2);
        return checkPhoneNumberFragment;
    }

    private void setCountryCode(PhoneNumber phoneNumber) {
        this.mCountryListSpinner.setSelectedForCountry(new Locale("", phoneNumber.getCountryIso()), phoneNumber.getCountryCode());
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mSubmitButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        this.mCheckPhoneHandler.onActivityResult(requireActivity(), i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_phone_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.mSubmitButton = (Button) view.findViewById(R$id.send_code);
        this.mCountryListSpinner = (CountryListSpinner) view.findViewById(R$id.country_list);
        this.mCountryListAnchor = view.findViewById(R$id.country_list_popup_anchor);
        this.mPhoneInputLayout = (TextInputLayout) view.findViewById(R$id.phone_layout);
        this.mPhoneEditText = (EditText) view.findViewById(R$id.phone_number);
        this.mSmsTermsText = (TextView) view.findViewById(R$id.send_sms_tos);
        this.mFooterText = (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text);
        this.mSmsTermsText.setText(getString(R$string.fui_sms_terms_of_service, getString(R$string.fui_verify_phone_number)));
        if (Build.VERSION.SDK_INT >= 26) {
            this.mPhoneEditText.setImportantForAutofill(2);
        }
        requireActivity().setTitle(getString(R$string.fui_verify_phone_number_title));
        ImeHelper.setImeOnDoneListener(this.mPhoneEditText, new ImeHelper.DonePressedListener() { // from class: LFd.w6
            @Override // com.firebase.ui.auth.util.ui.ImeHelper.DonePressedListener
            public final void onDonePressed() {
                this.f5938n.onNext();
            }
        });
        this.mSubmitButton.setOnClickListener(this);
        setupPrivacyDisclosures();
        setupCountrySpinner();
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mSubmitButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNext() {
        String pseudoValidPhoneNumber = getPseudoValidPhoneNumber();
        if (pseudoValidPhoneNumber == null) {
            this.mPhoneInputLayout.setError(getString(R$string.fui_invalid_phone_number));
        } else {
            this.mVerificationHandler.verifyPhoneNumber(requireActivity(), pseudoValidPhoneNumber, false);
        }
    }

    private void setDefaultCountryForSpinner() {
        String string;
        String string2;
        String string3;
        Bundle bundle = getArguments().getBundle("extra_params");
        if (bundle != null) {
            string = bundle.getString("extra_phone_number");
            string3 = bundle.getString("extra_country_iso");
            string2 = bundle.getString("extra_national_number");
        } else {
            string = null;
            string2 = null;
            string3 = null;
        }
        if (!TextUtils.isEmpty(string)) {
            start(PhoneNumberUtils.getPhoneNumber(string));
            return;
        }
        if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string2)) {
            start(PhoneNumberUtils.getPhoneNumber(string3, string2));
        } else if (!TextUtils.isEmpty(string3)) {
            setCountryCode(new PhoneNumber("", string3, String.valueOf(PhoneNumberUtils.getCountryCode(string3))));
        } else if (getFlowParams().enableCredentials) {
            this.mCheckPhoneHandler.fetchCredential(requireActivity());
        }
    }

    private void setupCountrySpinner() {
        this.mCountryListSpinner.init(getArguments().getBundle("extra_params"), this.mCountryListAnchor);
        this.mCountryListSpinner.setOnClickListener(new View.OnClickListener() { // from class: LFd.Ml
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5933n.lambda$setupCountrySpinner$0(view);
            }
        });
    }

    private void setupPrivacyDisclosures() {
        boolean z2;
        FlowParameters flowParams = getFlowParams();
        if (flowParams.isTermsOfServiceUrlProvided() && flowParams.isPrivacyPolicyUrlProvided()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!flowParams.shouldShowProviderChoice() && z2) {
            PrivacyDisclosureUtils.setupTermsOfServiceAndPrivacyPolicySmsText(requireContext(), flowParams, this.mSmsTermsText);
            return;
        }
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), flowParams, this.mFooterText);
        this.mSmsTermsText.setText(getString(R$string.fui_sms_terms_of_service, getString(R$string.fui_verify_phone_number)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start(PhoneNumber phoneNumber) {
        if (!PhoneNumber.isValid(phoneNumber)) {
            this.mPhoneInputLayout.setError(getString(R$string.fui_invalid_phone_number));
            return;
        }
        this.mPhoneEditText.setText(phoneNumber.getPhoneNumber());
        this.mPhoneEditText.setSelection(phoneNumber.getPhoneNumber().length());
        String countryIso = phoneNumber.getCountryIso();
        if (PhoneNumber.isCountryValid(phoneNumber) && this.mCountryListSpinner.isValidIso(countryIso)) {
            setCountryCode(phoneNumber);
            onNext();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mCheckPhoneHandler.getOperation().mUb(getViewLifecycleOwner(), new ResourceObserver<PhoneNumber>(this) { // from class: com.firebase.ui.auth.ui.phone.CheckPhoneNumberFragment.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull PhoneNumber phoneNumber) {
                CheckPhoneNumberFragment.this.start(phoneNumber);
            }
        });
        if (bundle != null || this.mCalled) {
            return;
        }
        this.mCalled = true;
        setDefaultCountryForSpinner();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        onNext();
    }

    @Override // com.firebase.ui.auth.ui.FragmentBase, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mVerificationHandler = (PhoneNumberVerificationHandler) new ViewModelProvider(requireActivity()).n(PhoneNumberVerificationHandler.class);
        this.mCheckPhoneHandler = (CheckPhoneHandler) new ViewModelProvider(this).n(CheckPhoneHandler.class);
    }
}
