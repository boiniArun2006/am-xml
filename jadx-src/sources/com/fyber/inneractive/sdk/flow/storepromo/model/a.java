package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f53896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53898c;

    public a(String str, b bVar) {
        this.f53897b = str;
        this.f53896a = bVar;
        this.f53898c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f53898c - ((a) obj).f53898c;
    }

    public a(String str, b bVar, int i2) {
        this.f53897b = str;
        this.f53896a = bVar;
        this.f53898c = i2;
    }
}
