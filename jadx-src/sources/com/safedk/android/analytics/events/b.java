package com.safedk.android.analytics.events;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class b implements Comparator<a> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        if (aVar.c() > aVar2.c()) {
            return 1;
        }
        if (aVar.c() < aVar2.c()) {
            return -1;
        }
        return 0;
    }
}
