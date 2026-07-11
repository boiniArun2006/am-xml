package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.i1;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b0 implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f53304a;

    public b0(IAConfigManager iAConfigManager) {
        this.f53304a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        int i2;
        h0 h0Var = (h0) obj;
        if (h0Var != null) {
            if (z2) {
                IAConfigManager iAConfigManager = this.f53304a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f53260M;
                iAConfigManager.getClass();
                iAConfigManager.f53279e = h0Var.f53385c;
                iAConfigManager.f53278d = h0Var.f53384b;
                iAConfigManager.f53275a = h0Var.f53386d;
                iAConfigManager.f53276b = h0Var.f53387e;
            } else {
                IAConfigManager.f53261N = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f53304a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f53279e = h0Var.f53385c;
                iAConfigManager3.f53278d = h0Var.f53384b;
                iAConfigManager3.f53275a = h0Var.f53386d;
                iAConfigManager3.f53276b = h0Var.f53387e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            IAConfigManager.f53261N = System.currentTimeMillis();
        }
        if (z2) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f53304a;
        IAConfigManager iAConfigManager5 = IAConfigManager.f53260M;
        if (iAConfigManager5.f53279e != null) {
            iAConfigManager4.a(null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof k1) ? !TextUtils.isEmpty(iAConfigManager4.f53277c.trim()) : (i2 = ((k1) exc).f54269a) < 400 || i2 >= 500)) {
                iAConfigManager4.a(new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(exc);
            } else {
                iAConfigManager4.a(new i0());
            }
        }
        if (iAConfigManager5.f53279e != null) {
            IAConfigManager iAConfigManager6 = this.f53304a;
            if (iAConfigManager6.f53264B == null) {
                iAConfigManager6.f53264B = new com.fyber.inneractive.sdk.network.v0(new e0(iAConfigManager6), iAConfigManager6.f53280f, new com.fyber.inneractive.sdk.config.global.m());
            }
            i1 i1Var = iAConfigManager6.f53264B.f54320f;
            if (i1Var == i1.RUNNING || i1Var == i1.QUEUED) {
                return;
            }
            iAConfigManager5.f53292r.a(iAConfigManager6.f53264B);
        }
    }
}
