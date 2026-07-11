package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f61184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f61185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f61186e;

    public a(b.InterfaceC0827b interfaceC0827b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0827b);
        this.f61184c = new HashSet<>(hashSet);
        this.f61185d = jSONObject;
        this.f61186e = j2;
    }
}
