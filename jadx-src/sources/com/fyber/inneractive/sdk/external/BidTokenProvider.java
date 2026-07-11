package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class BidTokenProvider {
    public static String getBidderToken() {
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.f53124h;
        bVar.getClass();
        if (IAConfigManager.c()) {
            IAlog.a("%sTCF purpose 1 disabled, returning null", IAlog.a(bVar));
            return null;
        }
        if (bVar.f53129e.get() == null) {
            synchronized (bVar.f53131g) {
                bVar.b();
            }
        } else {
            bVar.d();
        }
        String str = (String) bVar.f53129e.get();
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        String str2 = iAConfigManager.f53286l;
        o oVar = iAConfigManager.f53294t.f53466b;
        String str3 = "token_size_limit";
        int iA = oVar.a("token_size_limit", Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 1);
        if (!TextUtils.isEmpty(str2)) {
            str3 = "token_size_limit_" + str2.toLowerCase(Locale.US);
        }
        int iA2 = oVar.a(str3, iA, 1);
        if (str != null && str.getBytes().length > iA2) {
            w wVar = new w(t.TOKEN_EXCEEDS_LIMIT);
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            try {
                jSONObject.put("mediator", str2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mediator", str2);
            }
            Integer numValueOf = Integer.valueOf(str.getBytes().length);
            try {
                jSONObject.put("token_size", numValueOf);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "token_size", numValueOf);
            }
            Integer numValueOf2 = Integer.valueOf(iA2);
            try {
                jSONObject.put("token_limit", numValueOf2);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "token_limit", numValueOf2);
            }
            wVar.f54362f.put(jSONObject);
            wVar.a((String) null);
            IAlog.c("token exceeds the limit, returning null", new Object[0]);
            return null;
        }
        IAlog.c("token = %s", str);
        return str;
    }
}
