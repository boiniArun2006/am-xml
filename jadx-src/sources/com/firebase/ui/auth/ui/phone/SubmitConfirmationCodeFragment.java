package com.firebase.ui.auth.ui.phone;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.view.Observer;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.State;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.BucketedTextChangeListener;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class SubmitConfirmationCodeFragment extends FragmentBase {
    private SpacedEditText mConfirmationCodeEditText;
    private TextView mCountDownTextView;
    private PhoneNumberVerificationHandler mHandler;
    private boolean mHasResumed;
    private String mPhoneNumber;
    private TextView mPhoneTextView;
    private ProgressBar mProgressBar;
    private TextView mResendCodeTextView;
    private final Handler mLooper = new Handler();
    private final Runnable mCountdown = new Runnable() { // from class: LFd.I28
        @Override // java.lang.Runnable
        public final void run() {
            this.f5932n.lambda$new$0();
        }
    };
    private long mMillisUntilFinished = 60000;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupResendConfirmationCodeTextView$3(View view) {
        this.mHandler.verifyPhoneNumber(requireActivity(), this.mPhoneNumber, true);
        this.mResendCodeTextView.setVisibility(8);
        this.mCountDownTextView.setVisibility(0);
        this.mCountDownTextView.setText(String.format(getString(R$string.fui_resend_code_in), 60L));
        this.mMillisUntilFinished = 60000L;
        this.mLooper.postDelayed(this.mCountdown, 500L);
    }

    public static SubmitConfirmationCodeFragment newInstance(String str) {
        SubmitConfirmationCodeFragment submitConfirmationCodeFragment = new SubmitConfirmationCodeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("extra_phone_number", str);
        submitConfirmationCodeFragment.setArguments(bundle);
        return submitConfirmationCodeFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCountdownTick, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        long j2 = this.mMillisUntilFinished - 500;
        this.mMillisUntilFinished = j2;
        if (j2 > 0) {
            this.mCountDownTextView.setText(String.format(getString(R$string.fui_resend_code_in), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.mMillisUntilFinished) + 1)));
            this.mLooper.postDelayed(this.mCountdown, 500L);
        } else {
            this.mCountDownTextView.setText("");
            this.mCountDownTextView.setVisibility(8);
            this.mResendCodeTextView.setVisibility(0);
        }
    }

    private void setupConfirmationCodeEditText() {
        this.mConfirmationCodeEditText.setText("------");
        SpacedEditText spacedEditText = this.mConfirmationCodeEditText;
        spacedEditText.addTextChangedListener(new BucketedTextChangeListener(spacedEditText, 6, "-", new BucketedTextChangeListener.ContentChangeCallback() { // from class: com.firebase.ui.auth.ui.phone.SubmitConfirmationCodeFragment.1
            @Override // com.firebase.ui.auth.util.ui.BucketedTextChangeListener.ContentChangeCallback
            public void whileIncomplete() {
            }

            @Override // com.firebase.ui.auth.util.ui.BucketedTextChangeListener.ContentChangeCallback
            public void whenComplete() {
                SubmitConfirmationCodeFragment.this.submitCode();
            }
        }));
    }

    private void setupEditPhoneNumberTextView() {
        this.mPhoneTextView.setText(this.mPhoneNumber);
        this.mPhoneTextView.setOnClickListener(new View.OnClickListener() { // from class: LFd.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5931n.lambda$setupEditPhoneNumberTextView$2(view);
            }
        });
    }

    private void setupResendConfirmationCodeTextView() {
        this.mResendCodeTextView.setOnClickListener(new View.OnClickListener() { // from class: LFd.Wre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5934n.lambda$setupResendConfirmationCodeTextView$3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void submitCode() {
        this.mHandler.submitVerificationCode(this.mPhoneNumber, this.mConfirmationCodeEditText.getUnspacedText().toString());
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_confirmation_code_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.mLooper.removeCallbacks(this.mCountdown);
        bundle.putLong("millis_until_finished", this.mMillisUntilFinished);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.mPhoneTextView = (TextView) view.findViewById(R$id.edit_phone_number);
        this.mCountDownTextView = (TextView) view.findViewById(R$id.ticker);
        this.mResendCodeTextView = (TextView) view.findViewById(R$id.resend_code);
        this.mConfirmationCodeEditText = (SpacedEditText) view.findViewById(R$id.confirmation_code);
        requireActivity().setTitle(getString(R$string.fui_verify_your_phone_title));
        lambda$new$0();
        setupConfirmationCodeEditText();
        setupEditPhoneNumberTextView();
        setupResendConfirmationCodeTextView();
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), getFlowParams(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mProgressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$1(Resource resource) {
        if (resource.getState() == State.FAILURE) {
            this.mConfirmationCodeEditText.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupEditPhoneNumberTextView$2(View view) {
        requireActivity().getSupportFragmentManager().Zmq();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((PhoneProviderResponseHandler) new ViewModelProvider(requireActivity()).n(PhoneProviderResponseHandler.class)).getOperation().mUb(getViewLifecycleOwner(), new Observer() { // from class: LFd.fuX
            @Override // androidx.view.Observer
            public final void onChanged(Object obj) {
                this.f5935n.lambda$onActivityCreated$1((Resource) obj);
            }
        });
    }

    @Override // com.firebase.ui.auth.ui.FragmentBase, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = (PhoneNumberVerificationHandler) new ViewModelProvider(requireActivity()).n(PhoneNumberVerificationHandler.class);
        this.mPhoneNumber = getArguments().getString("extra_phone_number");
        if (bundle != null) {
            this.mMillisUntilFinished = bundle.getLong("millis_until_finished");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mLooper.removeCallbacks(this.mCountdown);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        CharSequence text;
        super.onResume();
        if (!this.mHasResumed) {
            this.mHasResumed = true;
            return;
        }
        ClipData primaryClip = ((ClipboardManager) ContextCompat.getSystemService(requireContext(), ClipboardManager.class)).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() == 1 && (text = primaryClip.getItemAt(0).getText()) != null && text.length() == 6) {
            try {
                Integer.parseInt(text.toString());
                this.mConfirmationCodeEditText.setText(text);
            } catch (NumberFormatException unused) {
            }
        }
        this.mLooper.removeCallbacks(this.mCountdown);
        this.mLooper.postDelayed(this.mCountdown, 500L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mConfirmationCodeEditText.requestFocus();
        ((InputMethodManager) requireActivity().getSystemService("input_method")).showSoftInput(this.mConfirmationCodeEditText, 0);
    }
}
