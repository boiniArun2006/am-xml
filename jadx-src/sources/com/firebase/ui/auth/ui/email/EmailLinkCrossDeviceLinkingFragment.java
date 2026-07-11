package com.firebase.ui.auth.ui.email;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.KeyEventDispatcher;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.util.data.EmailLinkParser;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.util.ui.TextHelper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class EmailLinkCrossDeviceLinkingFragment extends FragmentBase implements View.OnClickListener {
    private Button mContinueButton;
    private FinishEmailLinkSignInListener mListener;
    private ProgressBar mProgressBar;

    interface FinishEmailLinkSignInListener {
        void completeCrossDeviceEmailLinkFlow();
    }

    public static EmailLinkCrossDeviceLinkingFragment newInstance() {
        return new EmailLinkCrossDeviceLinkingFragment();
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mProgressBar.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_email_link_cross_device_linking, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.mProgressBar = (ProgressBar) view.findViewById(R$id.top_progress_bar);
        Button button = (Button) view.findViewById(R$id.button_continue);
        this.mContinueButton = button;
        button.setOnClickListener(this);
        String strProviderIdToProviderName = ProviderUtils.providerIdToProviderName(new EmailLinkParser(getFlowParams().emailLink).getProviderId());
        TextView textView = (TextView) view.findViewById(R$id.cross_device_linking_body);
        String string = getString(R$string.fui_email_link_cross_device_linking_text, strProviderIdToProviderName);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        TextHelper.boldAllOccurencesOfText(spannableStringBuilder, string, strProviderIdToProviderName);
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), getFlowParams(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mProgressBar.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof FinishEmailLinkSignInListener) {
            this.mListener = (FinishEmailLinkSignInListener) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.button_continue) {
            this.mListener.completeCrossDeviceEmailLinkFlow();
        }
    }
}
