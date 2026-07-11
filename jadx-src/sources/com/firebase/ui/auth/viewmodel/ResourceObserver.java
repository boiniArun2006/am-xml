package com.firebase.ui.auth.viewmodel;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.view.Observer;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.State;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.ProgressView;
import com.firebase.ui.auth.util.ui.FlowUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public abstract class ResourceObserver<T> implements Observer<Resource<T>> {
    private final HelperActivityBase mActivity;
    private final FragmentBase mFragment;
    private final int mLoadingMessage;
    private final ProgressView mProgressView;

    protected ResourceObserver(@NonNull HelperActivityBase helperActivityBase) {
        this(helperActivityBase, null, helperActivityBase, R$string.fui_progress_dialog_loading);
    }

    protected abstract void onFailure(@NonNull Exception exc);

    protected abstract void onSuccess(@NonNull T t3);

    protected ResourceObserver(@NonNull HelperActivityBase helperActivityBase, @StringRes int i2) {
        this(helperActivityBase, null, helperActivityBase, i2);
    }

    @Override // androidx.view.Observer
    public final void onChanged(Resource<T> resource) {
        if (resource.getState() == State.LOADING) {
            this.mProgressView.showProgress(this.mLoadingMessage);
            return;
        }
        this.mProgressView.hideProgress();
        if (resource.isUsed()) {
            return;
        }
        if (resource.getState() == State.SUCCESS) {
            onSuccess(resource.getValue());
            return;
        }
        if (resource.getState() == State.FAILURE) {
            Exception exception = resource.getException();
            FragmentBase fragmentBase = this.mFragment;
            if (fragmentBase == null ? FlowUtils.unhandled(this.mActivity, exception) : FlowUtils.unhandled(fragmentBase, exception)) {
                Log.e("AuthUI", "A sign-in error occurred.", exception);
                onFailure(exception);
            }
        }
    }

    protected ResourceObserver(@NonNull FragmentBase fragmentBase) {
        this(null, fragmentBase, fragmentBase, R$string.fui_progress_dialog_loading);
    }

    protected ResourceObserver(@NonNull FragmentBase fragmentBase, @StringRes int i2) {
        this(null, fragmentBase, fragmentBase, i2);
    }

    private ResourceObserver(HelperActivityBase helperActivityBase, FragmentBase fragmentBase, ProgressView progressView, int i2) {
        this.mActivity = helperActivityBase;
        this.mFragment = fragmentBase;
        if (helperActivityBase == null && fragmentBase == null) {
            throw new IllegalStateException("ResourceObserver must be attached to an Activity or a Fragment");
        }
        this.mProgressView = progressView;
        this.mLoadingMessage = i2;
    }
}
