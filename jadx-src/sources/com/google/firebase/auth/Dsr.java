package com.google.firebase.auth;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60088n;
    private Map rl;

    public Dsr(String str, Map map) {
        this.f60088n = str;
        this.rl = map;
    }

    public Map n() {
        return this.rl;
    }

    public String t() {
        return this.f60088n;
    }

    public String rl() {
        Map map = (Map) this.rl.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }
}
