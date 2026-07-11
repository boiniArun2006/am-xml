package com.alightcreative.app.motion.activities.creatorprogram.redeem;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f45005n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f45006t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f45004O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.redeem.j$j, reason: collision with other inner class name */
    class C0628j implements OnContextAvailableListener {
        C0628j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new C0628j());
    }

    public final BGJ.j ijL() {
        if (this.f45006t == null) {
            synchronized (this.f45004O) {
                try {
                    if (this.f45006t == null) {
                        this.f45006t = m();
                    }
                } finally {
                }
            }
        }
        return this.f45006t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((MO.w6) Z()).iF((RedeemTokensActivity) j9J.I28.n(this));
    }

    j() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f45005n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f45005n.t(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // j9J.n
    public final Object Z() {
        return ijL().Z();
    }

    @Override // androidx.view.ComponentActivity, androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return Dj9.j.n(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eTf();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BGJ.CN3 cn3 = this.f45005n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
