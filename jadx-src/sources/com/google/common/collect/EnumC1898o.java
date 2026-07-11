package com.google.common.collect;

/* JADX INFO: renamed from: com.google.common.collect.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum EnumC1898o {
    OPEN(false),
    CLOSED(true);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f59741n;

    static EnumC1898o rl(boolean z2) {
        return z2 ? CLOSED : OPEN;
    }

    EnumC1898o(boolean z2) {
        this.f59741n = z2;
    }
}
