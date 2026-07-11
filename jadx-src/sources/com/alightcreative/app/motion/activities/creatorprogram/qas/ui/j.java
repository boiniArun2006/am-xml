package com.alightcreative.app.motion.activities.creatorprogram.qas.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f44955n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f44956t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f44954O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.qas.ui.j$j, reason: collision with other inner class name */
    class C0626j implements OnContextAvailableListener {
        C0626j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new C0626j());
    }

    public final BGJ.j ijL() {
        if (this.f44956t == null) {
            synchronized (this.f44954O) {
                try {
                    if (this.f44956t == null) {
                        this.f44956t = m();
                    }
                } finally {
                }
            }
        }
        return this.f44956t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((yUp.Ml) Z()).Ik((QAsActivity) j9J.I28.n(this));
    }

    j() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f44955n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f44955n.t(getDefaultViewModelCreationExtras());
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
        BGJ.CN3 cn3 = this.f44955n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
