package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f49000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f49003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a3 f49005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f49006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f49007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f49008i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j2, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j2, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.f49008i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f49004e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f49000a;
    }

    public String getMCode() {
        return this.f49007h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f49001b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f49003d;
    }

    public List<String> getPostbackUrls() {
        return this.f49006g;
    }

    public a3 getRequestParameters() {
        return this.f49005f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f49002c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f49001b + ", testName=" + this.f49002c + ", networkResponses=" + this.f49003d + ", latencyMillis=" + this.f49004e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable y2 y2Var, String str, String str2, long j2, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f49000a = y2Var;
        this.f49001b = str;
        this.f49002c = str2;
        this.f49004e = j2;
        this.f49003d = list;
        this.f49005f = a3Var;
        this.f49006g = list2;
        this.f49007h = str3;
        this.f49008i = str4;
    }
}
