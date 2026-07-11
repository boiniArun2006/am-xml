package com.google.firebase.functions;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f60489n;
    private final Map rl;

    public interface j {
        n create(String str);
    }

    public final synchronized n n(String regionOrCustomDomain) {
        n nVarCreate;
        Intrinsics.checkNotNullParameter(regionOrCustomDomain, "regionOrCustomDomain");
        nVarCreate = (n) this.rl.get(regionOrCustomDomain);
        if (nVarCreate == null) {
            nVarCreate = this.f60489n.create(regionOrCustomDomain);
            this.rl.put(regionOrCustomDomain, nVarCreate);
        }
        return nVarCreate;
    }

    public I28(j functionsFactory) {
        Intrinsics.checkNotNullParameter(functionsFactory, "functionsFactory");
        this.f60489n = functionsFactory;
        this.rl = new HashMap();
    }
}
