package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class eO {
    private final Wre J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final s9b.I28 f60748O;
    private final Context Uo;
    private final ScheduledExecutorService mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f60749n;
    private final com.google.firebase.Wre nr;
    private final l3D rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz f60750t;
    private final C1916c xMQ;

    private synchronized void n() {
        if (!this.f60749n.isEmpty()) {
            this.rl.iF();
        }
    }

    public synchronized void rl(boolean z2) {
        this.rl.nY(z2);
        if (!z2) {
            n();
        }
    }

    public eO(com.google.firebase.Wre wre, s9b.I28 i28, qz qzVar, Wre wre2, Context context, String str, C1916c c1916c, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f60749n = linkedHashSet;
        this.rl = new l3D(wre, i28, qzVar, wre2, context, str, linkedHashSet, c1916c, scheduledExecutorService);
        this.nr = wre;
        this.f60750t = qzVar;
        this.f60748O = i28;
        this.J2 = wre2;
        this.Uo = context;
        this.KN = str;
        this.xMQ = c1916c;
        this.mUb = scheduledExecutorService;
    }
}
