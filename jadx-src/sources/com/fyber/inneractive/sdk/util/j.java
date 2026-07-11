package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f57004a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f57005b;

    public j(int i2, i iVar) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f57004a.offer(iVar.a());
        }
        this.f57005b = iVar;
    }
}
