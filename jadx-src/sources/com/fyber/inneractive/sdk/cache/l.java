package com.fyber.inneractive.sdk.cache;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53191b;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return this.f53191b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f53191b;
    }

    public l(String str) {
        this.f53190a = str;
        this.f53191b = String.format("template_%d.html", Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f53190a;
    }
}
