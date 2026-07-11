package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class b implements b.InterfaceC0827b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f61193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f61194b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f61194b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0827b
    @VisibleForTesting
    public JSONObject a() {
        return this.f61193a;
    }

    public void b() {
        this.f61194b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0827b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f61193a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f61194b.b(new f(this, hashSet, jSONObject, j2));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f61194b.b(new e(this, hashSet, jSONObject, j2));
    }
}
