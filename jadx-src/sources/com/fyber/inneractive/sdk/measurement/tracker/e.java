package com.fyber.inneractive.sdk.measurement.tracker;

import a88.Ml;
import a88.j;
import a88.n;
import a88.o;
import a88.w6;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f54062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f54063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54064c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f54065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f54066e;

    public abstract void a();

    public void a(m mVar) {
        Ml mlN;
        try {
            w6 w6VarB = b();
            try {
                mlN = Ml.n(this.f54065d, mVar, "", "");
            } catch (Throwable unused) {
                mlN = null;
            }
            n nVarRl = n.rl(w6VarB, mlN);
            this.f54062a = nVarRl;
            nVarRl.nr(mVar);
            this.f54062a.J2();
        } catch (Throwable unused2) {
        }
    }

    public abstract w6 b();

    public abstract void c();

    public e(o oVar, m mVar) {
        this.f54065d = oVar;
        this.f54066e = mVar;
    }
}
