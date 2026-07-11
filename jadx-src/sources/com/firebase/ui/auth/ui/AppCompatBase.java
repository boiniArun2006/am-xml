package com.firebase.ui.auth.ui;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.firebase.ui.auth.R$anim;
import com.firebase.ui.auth.R$style;
import com.firebase.ui.auth.ui.AppCompatBase;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class AppCompatBase extends HelperActivityBase {
    private void lockOrientation() {
        setRequestedOrientation(1);
    }

    protected void switchFragment(@NonNull Fragment fragment, int i2, @NonNull String str, boolean z2, boolean z3) {
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        if (z2) {
            fragmentTransactionO.S(R$anim.fui_slide_in_right, R$anim.fui_slide_out_left);
        }
        fragmentTransactionO.Z(i2, fragment, str);
        if (z3) {
            fragmentTransactionO.KN(null).mUb();
        } else {
            fragmentTransactionO.HI().mUb();
        }
    }

    public static /* synthetic */ WindowInsetsCompat piY(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ()).rl, view.getPaddingRight(), view.getPaddingBottom());
        return windowInsetsCompat;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 34) {
            ViewCompat.Org(findViewById(R.id.content), new OnApplyWindowInsetsListener() { // from class: tUd.j
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                    return AppCompatBase.piY(view, windowInsetsCompat);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R$style.FirebaseUI);
        setTheme(getFlowParams().themeId);
        WindowCompat.rl(getWindow(), false);
        if (getFlowParams().lockOrientation) {
            lockOrientation();
        }
    }

    protected void switchFragment(@NonNull Fragment fragment, int i2, @NonNull String str) {
        switchFragment(fragment, i2, str, false, false);
    }
}
