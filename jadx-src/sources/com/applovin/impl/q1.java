package com.applovin.impl;

import com.bendingspoons.legal.privacy.Tracker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f49784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y2 f49786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f49787d;

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f49787d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f49786c = (y2) obj;
        }
    }

    public long b() {
        return this.f49784a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f49787d;
    }

    public String d() {
        String str = this.f49785b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f49786c;
    }

    public String f() {
        if (this.f49787d != null) {
            return Tracker.AppLovin.NAME;
        }
        y2 y2Var = this.f49786c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public q1(Object obj, long j2) {
        String label;
        this.f49784a = j2;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f49787d = bVar;
            if (bVar.getAdZone().d() != null) {
                label = this.f49787d.getAdZone().d().getLabel();
            } else {
                label = null;
            }
            this.f49785b = label;
            return;
        }
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f49786c = y2Var;
            this.f49785b = y2Var.getFormat().getLabel();
        }
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f49787d;
        return bVar != null ? bVar : this.f49786c;
    }
}
