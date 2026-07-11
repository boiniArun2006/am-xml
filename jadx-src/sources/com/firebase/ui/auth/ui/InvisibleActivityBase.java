package com.firebase.ui.auth.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.google.android.material.progressindicator.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class InvisibleActivityBase extends HelperActivityBase {
    private Handler mHandler = new Handler();
    private long mLastShownTime = 0;
    private I28 mProgressBar;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideProgress$0() {
        this.mLastShownTime = 0L;
        this.mProgressBar.setVisibility(8);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        doAfterTimeout(new Runnable() { // from class: tUd.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f73469n.lambda$hideProgress$0();
            }
        });
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

    private void doAfterTimeout(Runnable runnable) {
        this.mHandler.postDelayed(runnable, Math.max(750 - (System.currentTimeMillis() - this.mLastShownTime), 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$1() {
        finish();
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase
    public void finish(int i2, @Nullable Intent intent) {
        setResult(i2, intent);
        doAfterTimeout(new Runnable() { // from class: tUd.w6
            @Override // java.lang.Runnable
            public final void run() {
                this.f73470n.lambda$finish$1();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_invisible);
        I28 i28 = new I28(new ContextThemeWrapper(this, getFlowParams().themeId));
        this.mProgressBar = i28;
        i28.setIndeterminate(true);
        this.mProgressBar.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ((FrameLayout) findViewById(R$id.invisible_frame)).addView(this.mProgressBar, layoutParams);
    }
}
