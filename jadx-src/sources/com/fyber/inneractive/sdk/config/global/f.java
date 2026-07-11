package com.fyber.inneractive.sdk.config.global;

import com.safedk.android.analytics.AppLovinBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53358b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f53357a;
        if (str != null) {
            return str.equalsIgnoreCase(AppLovinBridge.f61290h) ? !this.f53358b : this.f53358b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f53357a + " include: " + this.f53358b;
    }

    public f(boolean z2, String str) {
        this.f53357a = str;
        this.f53358b = z2;
    }
}
