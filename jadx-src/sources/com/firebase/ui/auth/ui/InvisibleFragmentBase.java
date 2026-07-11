package com.firebase.ui.auth.ui;

import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.R$id;
import com.google.android.material.progressindicator.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class InvisibleFragmentBase extends FragmentBase {
    protected FrameLayout mFrameLayout;
    private Handler mHandler = new Handler();
    private long mLastShownTime = 0;
    private I28 mProgressBar;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideProgress$0() {
        this.mLastShownTime = 0L;
        this.mProgressBar.setVisibility(8);
        this.mFrameLayout.setVisibility(8);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        doAfterTimeout(new Runnable() { // from class: tUd.Ml
            @Override // java.lang.Runnable
            public final void run() {
                this.f73468n.lambda$hideProgress$0();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        I28 i28 = new I28(new ContextThemeWrapper(getContext(), getFlowParams().themeId));
        this.mProgressBar = i28;
        i28.setIndeterminate(true);
        this.mProgressBar.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.invisible_frame);
        this.mFrameLayout = frameLayout;
        frameLayout.addView(this.mProgressBar, layoutParams);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        if (this.mProgressBar.getVisibility() == 0) {
            this.mHandler.removeCallbacksAndMessages(null);
        } else {
            this.mLastShownTime = System.currentTimeMillis();
            this.mProgressBar.setVisibility(0);
        }
    }

    protected void doAfterTimeout(Runnable runnable) {
        this.mHandler.postDelayed(runnable, Math.max(750 - (System.currentTimeMillis() - this.mLastShownTime), 0L));
    }
}
