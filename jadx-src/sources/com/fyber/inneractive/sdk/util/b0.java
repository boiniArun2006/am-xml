package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f56983a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f56985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f56986d;

    public static void a(b0 b0Var, Context context, Intent intent) {
        boolean zIsKeyguardLocked;
        synchronized (b0Var) {
            try {
                zIsKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var));
                zIsKeyguardLocked = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.f56984b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !zIsKeyguardLocked) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.f56984b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var), Boolean.valueOf(b0Var.f56984b), Integer.valueOf(b0Var.f56983a.size()));
            for (a0 a0Var : b0Var.f56983a) {
                boolean z2 = b0Var.f56984b;
                com.fyber.inneractive.sdk.renderers.n nVar = (com.fyber.inneractive.sdk.renderers.n) a0Var;
                nVar.getClass();
                IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(nVar), Boolean.valueOf(z2));
                if (z2) {
                    nVar.d(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = nVar.f56778y;
                    if (dVar != null && dVar.f56745g) {
                        dVar.f56745g = false;
                        r.f57026b.removeCallbacks(dVar.f56748j);
                    }
                } else {
                    nVar.N();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = nVar.f56778y;
                    if (dVar2 != null && !dVar2.f56746h && !dVar2.f56745g && dVar2.f56744f != 0) {
                        dVar2.f56744f = 0L;
                        dVar2.f56745g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
