package jEU;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.ViewModelProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Pl extends Xo implements j9J.w6 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private volatile BGJ.Wre f69347N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f69348T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private ContextWrapper f69349X;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f69350v = new Object();
    private boolean Xw = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        M7();
        p5();
    }

    private void M7() {
        if (this.f69349X == null) {
            this.f69349X = BGJ.Wre.rl(super.getContext(), this);
            this.f69348T = Z7.j.n(super.getContext());
        }
    }

    protected BGJ.Wre P5() {
        return new BGJ.Wre(this);
    }

    public final BGJ.Wre U() {
        if (this.f69347N == null) {
            synchronized (this.f69350v) {
                try {
                    if (this.f69347N == null) {
                        this.f69347N = P5();
                    }
                } finally {
                }
            }
        }
        return this.f69347N;
    }

    protected void p5() {
        if (this.Xw) {
            return;
        }
        this.Xw = true;
        ((C) Z()).HI((Dsr) j9J.I28.n(this));
    }

    @Override // j9J.n
    public final Object Z() {
        return U().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f69348T) {
            return null;
        }
        M7();
        return this.f69349X;
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
        ContextWrapper contextWrapper = this.f69349X;
        j9J.Ml.t(contextWrapper == null || BGJ.Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        M7();
        p5();
    }
}
