package com.firebase.ui.auth.ui.email;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.KeyEventDispatcher;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class TroubleSigningInFragment extends FragmentBase implements View.OnClickListener {
    private String mEmail;
    private ResendEmailListener mListener;
    private ProgressBar mProgressBar;

    interface ResendEmailListener {
        void onClickResendEmail(String str);
    }

    public static TroubleSigningInFragment newInstance(@NonNull String str) {
        TroubleSigningInFragment troubleSigningInFragment = new TroubleSigningInFragment();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        troubleSigningInFragment.setArguments(bundle);
        return troubleSigningInFragment;
    }

    private void setOnClickListeners(View view) {
        view.findViewById(R$id.button_resend_email).setOnClickListener(this);
    }

    private void setPrivacyFooter(View view) {
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), getFlowParams(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_email_link_trouble_signing_in_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        this.mEmail = getArguments().getString("extra_email");
        setOnClickListeners(view);
        setPrivacyFooter(view);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mProgressBar.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof ResendEmailListener) {
            this.mListener = (ResendEmailListener) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement ResendEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.button_resend_email) {
            this.mListener.onClickResendEmail(this.mEmail);
        }
    }
}
