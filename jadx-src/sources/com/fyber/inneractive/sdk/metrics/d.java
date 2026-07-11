package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f54080d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f54081a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f54082b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f54083c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.f54083c;
            }
            g gVar = (g) this.f54081a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f54081a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.f54083c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.f54082b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.f54082b.put(str, iVar);
        return iVar;
    }
}
