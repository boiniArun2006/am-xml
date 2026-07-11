package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f57200a;

    public s(i0 i0Var) {
        this.f57200a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i0 i0Var = this.f57200a;
            if (i0Var.f57140V != null) {
                IAlog.a("%sunregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f57200a.f57140V.a();
            }
        } catch (IllegalArgumentException e2) {
            if (e2.getMessage() != null && !e2.getMessage().contains("Receiver not registered")) {
                throw e2;
            }
        }
        this.f57200a.f57140V = null;
    }
}
