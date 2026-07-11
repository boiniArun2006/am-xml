package f0P;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.ViewModelProvider;

/* JADX INFO: renamed from: f0P.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2033dC extends Fragment implements j9J.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile BGJ.Wre f65480O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ContextWrapper f65481n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f65483t;
    private final Object J2 = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f65482r = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ViF();
        nY();
    }

    private void ViF() {
        if (this.f65481n == null) {
            this.f65481n = BGJ.Wre.rl(super.getContext(), this);
            this.f65483t = Z7.j.n(super.getContext());
        }
    }

    public final BGJ.Wre WPU() {
        if (this.f65480O == null) {
            synchronized (this.J2) {
                try {
                    if (this.f65480O == null) {
                        this.f65480O = aYN();
                    }
                } finally {
                }
            }
        }
        return this.f65480O;
    }

    protected BGJ.Wre aYN() {
        return new BGJ.Wre(this);
    }

    protected void nY() {
        if (this.f65482r) {
            return;
        }
        this.f65482r = true;
        ((Yn) Z()).KN((mAi) j9J.I28.n(this));
    }

    AbstractC2033dC() {
    }

    @Override // j9J.n
    public final Object Z() {
        return WPU().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f65483t) {
            return null;
        }
        ViF();
        return this.f65481n;
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
        ContextWrapper contextWrapper = this.f65481n;
        j9J.Ml.t(contextWrapper == null || BGJ.Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ViF();
        nY();
    }
}
