package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f56876K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.b f56877L;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList f56880O = new ArrayList();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final LinkedHashMap f56878M = new LinkedHashMap();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ArrayList f56879N = new ArrayList();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final LinkedHashMap f56881P = new LinkedHashMap();

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode b() {
        return a(null, null);
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return com.fyber.inneractive.sdk.flow.vast.j.a(inneractiveAdRequest, this, rVar);
    }
}
