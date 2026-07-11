package com.fyber.inneractive.sdk.network;

import android.util.Base64;
import androidx.media3.common.MimeTypes;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class c1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f54233p;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public c1(f0 f0Var, String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(f0Var, g0.f54259c.a(), rVar);
        this.f54233p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public o0 a(l lVar, Map map, int i2) {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f54272c;
            List list = map != null ? (List) map.get("Content-Type") : null;
            String str = list != null ? (String) list.get(0) : null;
            String strEncodeToString = Base64.encodeToString(com.fyber.inneractive.sdk.util.v.a(inputStream), 0);
            if (str == null) {
                str = MimeTypes.IMAGE_PNG;
            }
            o0Var.f54294a = "data:" + str + ";base64, " + strEncodeToString;
            return o0Var;
        } catch (Exception unused) {
            IAlog.a("failed to fetch and encode the image.", new Object[0]);
            return o0Var;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f54233p;
    }
}
