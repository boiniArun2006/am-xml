package com.android.installreferrer.api;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class ReferrerDetails {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bundle f47660n;

    public ReferrerDetails(Bundle bundle) {
        this.f47660n = bundle;
    }

    public long J2() {
        return this.f47660n.getLong("referrer_click_timestamp_seconds");
    }

    public String O() {
        return this.f47660n.getString("install_version");
    }

    public long Uo() {
        return this.f47660n.getLong("referrer_click_timestamp_server_seconds");
    }

    public boolean n() {
        return this.f47660n.getBoolean("google_play_instant");
    }

    public String nr() {
        return this.f47660n.getString("install_referrer");
    }

    public long rl() {
        return this.f47660n.getLong("install_begin_timestamp_seconds");
    }

    public long t() {
        return this.f47660n.getLong("install_begin_timestamp_server_seconds");
    }
}
