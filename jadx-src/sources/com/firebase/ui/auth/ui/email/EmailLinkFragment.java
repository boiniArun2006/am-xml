package com.firebase.ui.auth.ui.email;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
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
import com.firebase.ui.auth.ui.InvisibleFragmentBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.TextHelper;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSendEmailHandler;
import com.google.firebase.auth.ActionCodeSettings;
import ep.oxM.esLNYym;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@RestrictTo
public class EmailLinkFragment extends InvisibleFragmentBase {
    private EmailLinkSendEmailHandler mEmailLinkSendEmailHandler;
    private boolean mEmailSent;
    private TroubleSigningInListener mListener;
    private ScrollView mTopLevelView;

    /* JADX INFO: renamed from: com.firebase.ui.auth.ui.email.EmailLinkFragment$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class AnonymousClass1 extends ResourceObserver<String> {
        AnonymousClass1(FragmentBase fragmentBase, int i2) {
            super(fragmentBase, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0() {
            EmailLinkFragment.this.mTopLevelView.setVisibility(0);
        }

        @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
        protected void onFailure(@NonNull Exception exc) {
            EmailLinkFragment.this.mListener.onSendEmailFailure(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
        public void onSuccess(@NonNull String str) {
            Log.w("EmailLinkFragment", "Email for email link sign in sent successfully.");
            EmailLinkFragment.this.doAfterTimeout(new Runnable() { // from class: com.firebase.ui.auth.ui.email.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53060n.lambda$onSuccess$0();
                }
            });
            EmailLinkFragment.this.mEmailSent = true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    interface TroubleSigningInListener {
        void onSendEmailFailure(Exception exc);

        void onTroubleSigningIn(String str);
    }

    public static EmailLinkFragment newInstance(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings) {
        return newInstance(str, actionCodeSettings, null, false);
    }

    private void initHandler() {
        EmailLinkSendEmailHandler emailLinkSendEmailHandler = (EmailLinkSendEmailHandler) new ViewModelProvider(this).n(EmailLinkSendEmailHandler.class);
        this.mEmailLinkSendEmailHandler = emailLinkSendEmailHandler;
        emailLinkSendEmailHandler.init(getFlowParams());
        this.mEmailLinkSendEmailHandler.getOperation().mUb(getViewLifecycleOwner(), new AnonymousClass1(this, R$string.fui_progress_dialog_sending));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListeners$0(String str, View view) {
        this.mListener.onTroubleSigningIn(str);
    }

    public static EmailLinkFragment newInstance(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings, @Nullable IdpResponse idpResponse, boolean z2) {
        EmailLinkFragment emailLinkFragment = new EmailLinkFragment();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        bundle.putParcelable("action_code_settings", actionCodeSettings);
        bundle.putParcelable("extra_idp_response", idpResponse);
        bundle.putBoolean("force_same_device", z2);
        emailLinkFragment.setArguments(bundle);
        return emailLinkFragment;
    }

    private void setBodyText(View view, String str) {
        TextView textView = (TextView) view.findViewById(R$id.sign_in_email_sent_text);
        String string = getString(R$string.fui_email_link_email_sent, str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        TextHelper.boldAllOccurencesOfText(spannableStringBuilder, string, str);
        textView.setText(spannableStringBuilder);
    }

    private void setOnClickListeners(View view, final String str) {
        view.findViewById(R$id.trouble_signing_in).setOnClickListener(new View.OnClickListener() { // from class: Rd.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8712n.lambda$setOnClickListeners$0(str, view2);
            }
        });
    }

    private void setPrivacyFooter(View view) {
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(requireContext(), getFlowParams(), (TextView) view.findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.fui_email_link_sign_in_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        initHandler();
        String string = getArguments().getString("extra_email");
        ActionCodeSettings actionCodeSettings = (ActionCodeSettings) getArguments().getParcelable("action_code_settings");
        IdpResponse idpResponse = (IdpResponse) getArguments().getParcelable("extra_idp_response");
        boolean z2 = getArguments().getBoolean("force_same_device");
        if (!this.mEmailSent) {
            this.mEmailLinkSendEmailHandler.sendSignInLinkToEmail(string, actionCodeSettings, idpResponse, z2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof TroubleSigningInListener) {
            this.mListener = (TroubleSigningInListener) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement TroubleSigningInListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("emailSent", this.mEmailSent);
    }

    @Override // com.firebase.ui.auth.ui.InvisibleFragmentBase, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.mEmailSent = bundle.getBoolean(esLNYym.OpZf);
        }
        ScrollView scrollView = (ScrollView) view.findViewById(R$id.top_level_view);
        this.mTopLevelView = scrollView;
        if (!this.mEmailSent) {
            scrollView.setVisibility(8);
        }
        String string = getArguments().getString("extra_email");
        setBodyText(view, string);
        setOnClickListeners(view, string);
        setPrivacyFooter(view);
    }
}
