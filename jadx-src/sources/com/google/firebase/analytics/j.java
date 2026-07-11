package com.google.firebase.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private FirebaseAnalytics.j f60073n;
    private FirebaseAnalytics.j nr;
    private FirebaseAnalytics.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FirebaseAnalytics.j f60074t;

    public final void O(FirebaseAnalytics.j jVar) {
        this.rl = jVar;
    }

    public final void nr(FirebaseAnalytics.j jVar) {
        this.f60074t = jVar;
    }

    public final void rl(FirebaseAnalytics.j jVar) {
        this.nr = jVar;
    }

    public final void t(FirebaseAnalytics.j jVar) {
        this.f60073n = jVar;
    }

    public final Map n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.j jVar = this.f60073n;
        if (jVar != null) {
            linkedHashMap.put(FirebaseAnalytics.n.AD_STORAGE, jVar);
        }
        FirebaseAnalytics.j jVar2 = this.rl;
        if (jVar2 != null) {
            linkedHashMap.put(FirebaseAnalytics.n.ANALYTICS_STORAGE, jVar2);
        }
        FirebaseAnalytics.j jVar3 = this.f60074t;
        if (jVar3 != null) {
            linkedHashMap.put(FirebaseAnalytics.n.AD_USER_DATA, jVar3);
        }
        FirebaseAnalytics.j jVar4 = this.nr;
        if (jVar4 != null) {
            linkedHashMap.put(FirebaseAnalytics.n.AD_PERSONALIZATION, jVar4);
        }
        return linkedHashMap;
    }
}
