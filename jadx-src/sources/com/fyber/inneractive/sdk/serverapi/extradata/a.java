package com.fyber.inneractive.sdk.serverapi.extradata;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.bidder.c0;
import com.fyber.inneractive.sdk.bidder.k;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a implements c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final boolean a(Object obj) {
        return ((TokenParametersOuterClass$TokenParameters) ((k) obj).f56666b).getPubExtraDataCount() == 0;
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final void a(String str, String str2, Object obj) {
        k kVar = (k) obj;
        c0 c0VarNewBuilder = TokenParametersOuterClass$TokenParameters.PubExtraData.newBuilder();
        c0VarNewBuilder.c();
        ((TokenParametersOuterClass$TokenParameters.PubExtraData) c0VarNewBuilder.f56666b).setKey(str);
        c0VarNewBuilder.c();
        ((TokenParametersOuterClass$TokenParameters.PubExtraData) c0VarNewBuilder.f56666b).setValue(str2);
        TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData = (TokenParametersOuterClass$TokenParameters.PubExtraData) c0VarNewBuilder.a();
        kVar.c();
        ((TokenParametersOuterClass$TokenParameters) kVar.f56666b).addPubExtraData(pubExtraData);
    }
}
