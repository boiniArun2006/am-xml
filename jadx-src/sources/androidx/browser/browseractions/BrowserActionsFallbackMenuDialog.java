package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
class BrowserActionsFallbackMenuDialog extends Dialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f14507n;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        rl(false);
    }

    private void rl(final boolean z2) {
        float f3 = z2 ? 0.0f : 1.0f;
        float f4 = z2 ? 1.0f : 0.0f;
        long j2 = z2 ? 250L : 150L;
        this.f14507n.setScaleX(f3);
        this.f14507n.setScaleY(f3);
        this.f14507n.animate().scaleX(f4).scaleY(f4).setDuration(j2).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z2) {
                    return;
                }
                BrowserActionsFallbackMenuDialog.super.dismiss();
            }
        }).start();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        rl(true);
        super.show();
    }
}
