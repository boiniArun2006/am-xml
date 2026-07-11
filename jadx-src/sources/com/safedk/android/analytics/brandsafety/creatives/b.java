package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f62061a = new Bundle();

    public boolean a(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f62061a.containsKey(adNetworkConfiguration.name());
    }

    public boolean b(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f62061a.getBoolean(adNetworkConfiguration.name());
    }

    public boolean a(AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        return this.f62061a.getBoolean(adNetworkConfiguration.name(), z2);
    }

    public String c(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f62061a.getString(adNetworkConfiguration.name());
    }

    public String a(AdNetworkConfiguration adNetworkConfiguration, String str) {
        return this.f62061a.getString(adNetworkConfiguration.name(), str);
    }

    public float d(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f62061a.getFloat(adNetworkConfiguration.name());
    }

    public long e(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f62061a.getLong(adNetworkConfiguration.name());
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        this.f62061a.putBoolean(adNetworkConfiguration.name(), z2);
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, String str) {
        this.f62061a.putString(adNetworkConfiguration.name(), str);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, float f3) {
        this.f62061a.putFloat(adNetworkConfiguration.name(), f3);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, long j2) {
        this.f62061a.putLong(adNetworkConfiguration.name(), j2);
    }

    public String toString() {
        return this.f62061a.toString();
    }
}
