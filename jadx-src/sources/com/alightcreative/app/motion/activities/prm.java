package com.alightcreative.app.motion.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class prm extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f45590n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f45591t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f45589O = new Object();
    private boolean J2 = false;

    class j implements OnContextAvailableListener {
        j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            prm.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new j());
    }

    public final BGJ.j ijL() {
        if (this.f45591t == null) {
            synchronized (this.f45589O) {
                try {
                    if (this.f45591t == null) {
                        this.f45591t = m();
                    }
                } finally {
                }
            }
        }
        return this.f45591t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((Bu) Z()).fD((EditActivity) j9J.I28.n(this));
    }

    prm() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f45590n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f45590n.t(getDefaultViewModelCreationExtras());
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eTf();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BGJ.CN3 cn3 = this.f45590n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
