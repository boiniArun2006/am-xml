package com.alightcreative.maineditor.presetpreview.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f46742n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f46743t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f46741O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.maineditor.presetpreview.ui.j$j, reason: collision with other inner class name */
    class C0668j implements OnContextAvailableListener {
        C0668j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new C0668j());
    }

    public final BGJ.j ijL() {
        if (this.f46743t == null) {
            synchronized (this.f46741O) {
                try {
                    if (this.f46743t == null) {
                        this.f46743t = m();
                    }
                } finally {
                }
            }
        }
        return this.f46743t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((yvM.Wre) Z()).e((PresetPreviewActivity) j9J.I28.n(this));
    }

    j() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f46742n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f46742n.t(getDefaultViewModelCreationExtras());
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
        BGJ.CN3 cn3 = this.f46742n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
