package com.firebase.ui.auth.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class FragmentBase extends Fragment implements ProgressView {
    private HelperActivityBase mActivity;

    public FlowParameters getFlowParams() {
        return this.mActivity.getFlowParams();
    }

    public void startSaveCredentials(FirebaseUser firebaseUser, IdpResponse idpResponse, @Nullable String str) {
        this.mActivity.startSaveCredentials(firebaseUser, idpResponse, str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof HelperActivityBase) {
            this.mActivity = (HelperActivityBase) activity;
            return;
        }
        throw new IllegalStateException("Cannot use this fragment without the helper activity");
    }
}
