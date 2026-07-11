package com.fyber.inneractive.sdk.network;

import okhttp3.Response;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o1 extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Response f54296g;

    public o1(l lVar, Response response) {
        this.f54296g = response;
        this.f54273d = lVar.f54273d;
        this.f54272c = lVar.f54272c;
        this.f54274e = lVar.f54274e;
        this.f54270a = lVar.f54270a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        Response response = this.f54296g;
        if (response != null) {
            response.close();
        }
    }
}
