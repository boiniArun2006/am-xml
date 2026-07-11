package qHw;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceFragmentCompat;
import androidx.view.ViewModelProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class K extends PreferenceFragmentCompat implements j9J.w6 {
    private ContextWrapper E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private volatile BGJ.Wre f72383X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f72384e;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Object f72382T = new Object();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f72381N = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Xw();
        jB();
    }

    private void Xw() {
        if (this.E2 == null) {
            this.E2 = BGJ.Wre.rl(super.getContext(), this);
            this.f72384e = Z7.j.n(super.getContext());
        }
    }

    protected BGJ.Wre bzg() {
        return new BGJ.Wre(this);
    }

    protected void jB() {
        if (this.f72381N) {
            return;
        }
        this.f72381N = true;
        ((Lu) Z()).X((vd) j9J.I28.n(this));
    }

    public final BGJ.Wre rV9() {
        if (this.f72383X == null) {
            synchronized (this.f72382T) {
                try {
                    if (this.f72383X == null) {
                        this.f72383X = bzg();
                    }
                } finally {
                }
            }
        }
        return this.f72383X;
    }

    @Override // j9J.n
    public final Object Z() {
        return rV9().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f72384e) {
            return null;
        }
        Xw();
        return this.E2;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return Dj9.j.rl(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(BGJ.Wre.t(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.E2;
        j9J.Ml.t(contextWrapper == null || BGJ.Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Xw();
        jB();
    }
}
