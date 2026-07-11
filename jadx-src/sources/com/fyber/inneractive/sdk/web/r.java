package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f57192a;

    public r(i0 i0Var) {
        this.f57192a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.f57192a;
        if (i0Var.f57140V == null) {
            try {
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f57192a.f57140V = new e0(this.f57192a);
                if (com.fyber.inneractive.sdk.util.o.a(this.f57192a.f57113b) != null) {
                    i0 i0Var2 = this.f57192a;
                    e0 e0Var = i0Var2.f57140V;
                    Context contextA = com.fyber.inneractive.sdk.util.o.a(i0Var2.f57113b);
                    i0 i0Var3 = e0Var.f57102c;
                    i0Var3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(i0Var3));
                    e0Var.f57100a = contextA;
                    contextA.registerReceiver(e0Var, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e2) {
                i0 i0Var4 = this.f57192a;
                i0Var4.getClass();
                IAlog.f("%sfailed registering orientation broadcast recevier", IAlog.a(i0Var4));
                if (IAlog.f56974a >= 3) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
