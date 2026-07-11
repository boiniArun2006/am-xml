package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f57084a;

    public d(i1 i1Var) {
        this.f57084a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f57084a;
        if (iVar.f57122k) {
            IAlog.a("No user web action detected for : %s blocking.", iVar.f57123l);
            i iVar2 = this.f57084a;
            String strC = iVar2.f57123l.c();
            String strA = this.f57084a.f57123l.a();
            j1 j1Var = iVar2.f57118g;
            if (j1Var != null) {
                j1Var.a(strC, strA);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.f57084a.f57123l.b();
            this.f57084a.i();
        } else {
            IAlog.a("User web action detected for: %s", iVar.f57123l);
            this.f57084a.f57123l.d();
        }
        this.f57084a.f57123l = null;
    }
}
