package com.alightcreative.app.motion.activities.edit.fragments;

import BGJ.Wre;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import f0P.H5j;
import f0P.NO;
import f0P.oC;
import j9J.I28;
import j9J.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 extends NO {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f45106E = false;
    private boolean eF;
    private ContextWrapper p5;

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ViF();
        nY();
    }

    private void ViF() {
        if (this.p5 == null) {
            this.p5 = Wre.rl(super.getContext(), this);
            this.eF = Z7.j.n(super.getContext());
        }
    }

    @Override // f0P.sK
    protected void nY() {
        if (this.f45106E) {
            return;
        }
        this.f45106E = true;
        ((H5j) ((j9J.w6) I28.n(this)).Z()).te((oC) I28.n(this));
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.eF) {
            return null;
        }
        ViF();
        return this.p5;
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(Wre.t(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.p5;
        Ml.t(contextWrapper == null || Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ViF();
        nY();
    }
}
