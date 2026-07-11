package com.fyber.inneractive.sdk.flow.endcard;

import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f53640a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53641b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53642c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f53643d = new g();

    public final b a() {
        int i2 = this.f53642c;
        if (i2 >= 0) {
            return (b) this.f53640a.get(i2);
        }
        return null;
    }

    public final b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        for (b bVar : this.f53641b) {
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(b bVar) {
        if (((bVar instanceof o) || (bVar instanceof d)) && this.f53640a.contains(bVar)) {
            return;
        }
        this.f53640a.add(bVar);
        this.f53640a.sort(this.f53643d);
    }
}
