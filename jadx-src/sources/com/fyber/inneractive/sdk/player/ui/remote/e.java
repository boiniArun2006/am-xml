package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f56487a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56489c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f56488b = new ConcurrentHashMap();

    public final void a(String str, String str2, boolean z2) {
        if (!z2) {
            this.f56488b.put(str, str2);
            return;
        }
        d dVar = this.f56487a;
        if (dVar != null) {
            dVar.f56474b.a(str2);
        }
    }

    public e(d dVar) {
        this.f56487a = dVar;
    }

    public final void a(int i2, g1 g1Var) {
        n nVar;
        d dVar = this.f56487a;
        if (dVar == null || (nVar = dVar.f56477e) == null) {
            return;
        }
        ((z) nVar).a(i2, g1Var);
    }
}
