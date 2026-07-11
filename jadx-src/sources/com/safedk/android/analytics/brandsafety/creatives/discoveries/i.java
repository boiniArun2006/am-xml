package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62249a = "eventname";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62250b = "adId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f62251c;

    i(String str, String str2) {
        HashMap<String, String> map = new HashMap<>();
        this.f62251c = map;
        map.put(f62249a, str);
        this.f62251c.put(f62250b, str2);
    }

    void a(String str, String str2) {
        this.f62251c.put(str, str2);
    }

    String a(String str) {
        return this.f62251c.get(str);
    }

    String a() {
        return this.f62251c.get(f62249a);
    }

    String b() {
        return this.f62251c.get(f62250b);
    }
}
