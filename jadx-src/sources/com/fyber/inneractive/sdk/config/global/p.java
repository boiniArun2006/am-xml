package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f53376a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer a(String str) {
        n nVar = this.f53376a;
        if (nVar == null || nVar.a() == null || this.f53376a.a().size() <= 0) {
            return null;
        }
        return this.f53376a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String b(String str) {
        n nVar = this.f53376a;
        if (nVar == null || nVar.a() == null || this.f53376a.a().size() <= 0) {
            return null;
        }
        return this.f53376a.b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean c(String str) {
        n nVar = this.f53376a;
        if (nVar == null || nVar.a() == null || this.f53376a.a().size() <= 0) {
            return null;
        }
        return this.f53376a.c(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        n nVar = this.f53376a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        n nVar = this.f53376a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
