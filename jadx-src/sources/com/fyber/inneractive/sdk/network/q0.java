package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q0 extends t0 implements o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InneractiveAdRequest f54300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f54301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public StringBuffer f54302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.d f54303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f54304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f54305u;

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return this.f54302r;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.f54301q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public q0(q qVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(rVar);
        super(qVar, g0.f54259c.a(), rVar);
        this.f54304t = false;
        this.f54329o = true;
        this.f54300p = inneractiveAdRequest;
        this.f54303s = cVar;
        if (inneractiveAdRequest != null) {
            String strA = com.fyber.inneractive.sdk.util.n1.a(inneractiveAdRequest.getSpotId());
            String mediationName = inneractiveAdRequest.getMediationName();
            com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
            this.f54305u = TextUtils.isEmpty(mediationName) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(kVar, strA) : new com.fyber.inneractive.sdk.network.timeouts.request.d(strA, kVar, mediationName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    @Override // com.fyber.inneractive.sdk.network.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 a(l lVar, Map map, int i2) throws n0 {
        StringBuffer stringBufferB;
        String str;
        List list;
        if (map != null) {
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                if (str2 != null && (list = (List) map.get(str2)) != null && list.size() > 0) {
                    map2.put(str2.toLowerCase(Locale.US), (String) list.get(0));
                }
            }
            this.f54301q = map2;
        }
        InputStream inputStream = lVar == null ? null : lVar.f54272c;
        super.d(System.currentTimeMillis());
        IAlog.a("%s : NetworkRequestAd : set start read timestamp", IAlog.a(this));
        if (inputStream != null) {
            try {
                stringBufferB = com.fyber.inneractive.sdk.util.v.b(inputStream);
            } catch (Exception e2) {
                IAlog.a("failed create response builder in network request ad for url: %s msg: %s", r(), e2.getMessage());
                stringBufferB = null;
            }
            this.f54302r = stringBufferB;
        }
        b(System.currentTimeMillis());
        o0 o0Var = new o0();
        try {
            HashMap map3 = this.f54301q;
            if (map3 != null) {
                str = (String) map3.get(n.RETURNED_AD_TYPE.key.toLowerCase(Locale.US));
                if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
                    str = null;
                }
            }
            o0Var.f54294a = a(str != null ? Integer.parseInt(str) : 6, this, (com.fyber.inneractive.sdk.response.j) null);
            return o0Var;
        } catch (Exception e3) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e3.getMessage());
            throw new n0(e3);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j2) {
        super.b(j2);
        IAlog.a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        JSONArray jSONArrayA;
        byte[] bytes = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.r rVar = ((com.fyber.inneractive.sdk.serverapi.c) this.f54303s).f56915a;
            if (rVar != null) {
                jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f53380b, true);
                IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
            } else {
                jSONArrayA = null;
            }
            if (jSONArrayA != null && jSONArrayA.length() > 0) {
                jSONObject2.put("experiments", jSONArrayA);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            JSONArray jSONArrayA2 = IAConfigManager.f53260M.f53297w.a(com.fyber.inneractive.sdk.serverapi.b.a(this.f54300p.getSpotId()));
            if (jSONArrayA2 != null && jSONArrayA2.length() > 0) {
                jSONObject.put("user_sessions", jSONArrayA2);
            }
            try {
                Object objB = IAConfigManager.b();
                if (objB != null) {
                    jSONObject.put("pub_extra_data", objB);
                }
            } catch (JSONException e2) {
                IAlog.a("Failed to add extra data to ad request body!", e2, new Object[0]);
            }
            String string = jSONObject.toString();
            bytes = string.getBytes(StandardCharsets.UTF_8);
            IAlog.a("request json body - %s", string);
            IAlog.d("request json body - %s", string);
            return bytes;
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
            return bytes;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final Map l() {
        int i2 = com.fyber.inneractive.sdk.config.k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return map;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f54305u;
        return new l1(aVar.f54339i, aVar.f54338h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        String str;
        String str2;
        int i2 = com.fyber.inneractive.sdk.config.k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String strA = TextUtils.isEmpty(property) ? com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u + IAConfigManager.f53260M.f53283i.f53397e : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        if (this.f54300p.getFloorPrice() != null) {
            String property2 = System.getProperty("ia.testEnvironmentConfiguration.name");
            strA = TextUtils.isEmpty(property2) ? com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u + IAConfigManager.f53260M.f53283i.f53399g : com.fyber.inneractive.sdk.config.a.a(property2, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f54300p;
        com.fyber.inneractive.sdk.serverapi.d dVar = this.f54303s;
        r0 r0Var = new r0(inneractiveAdRequest, dVar);
        r0Var.f54308b = new HashMap();
        r0Var.a("fromSDK", Boolean.toString(true));
        r0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        r0Var.a("secure", !com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.f53260M.f53291q ? "1" : "0");
        r0Var.a("spotid", inneractiveAdRequest.getSpotId());
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property3 == null) {
            property3 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f53415a;
        }
        r0Var.a("uid", property3);
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        if (TextUtils.isEmpty(iAConfigManager.f53288n)) {
            r0Var.a(com.safedk.android.analytics.brandsafety.l.f62645Z, iAConfigManager.f53286l);
        } else {
            r0Var.a(com.safedk.android.analytics.brandsafety.l.f62645Z, iAConfigManager.f53286l + "_" + iAConfigManager.f53288n);
        }
        dVar.getClass();
        r0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.c cVar = (com.fyber.inneractive.sdk.serverapi.c) dVar;
        List list = com.fyber.inneractive.sdk.serverapi.c.f56914d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
            r0Var.a("protocols", com.fyber.inneractive.sdk.util.o.a(arrayList));
        }
        List list2 = com.fyber.inneractive.sdk.serverapi.c.f56913c;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf((Integer) it2.next()));
            }
            r0Var.a(com.safedk.android.analytics.brandsafety.l.f62634O, com.fyber.inneractive.sdk.util.o.a(arrayList2));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("zip", iAConfigManager.f53284j.getZipCode());
        }
        r0Var.a(CmcdData.OBJECT_TYPE_AUDIO_ONLY, Integer.toString(iAConfigManager.f53284j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f53284j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            r0Var.a("g", "m");
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            r0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        r0Var.a("t", Long.toString(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.3");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        r0Var.a("v", sb.toString());
        Boolean boolD = iAConfigManager.f53265C.d();
        if (boolD != null) {
            r0Var.a("gdpr_privacy_consent", boolD.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.f53265C;
        if (gVar != null) {
            Boolean bool = com.fyber.inneractive.sdk.util.o.f57018a == null ? null : gVar.f53341i;
            if (bool != null) {
                r0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.f53265C.f53342j;
            if (bool2 != null && bool2.booleanValue()) {
                r0Var.a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property4 = System.getProperty("ia.testEnvironmentConfiguration.device");
            com.fyber.inneractive.sdk.config.w wVar = com.fyber.inneractive.sdk.config.u.f53482a;
            com.fyber.inneractive.sdk.config.v vVar = wVar.f53490b;
            String str3 = vVar != null ? vVar.f53488c : false ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property4)) {
                com.fyber.inneractive.sdk.config.v vVar2 = wVar.f53490b;
                property4 = vVar2 != null ? vVar2.f53486a : null;
            }
            r0Var.a(str3, property4);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.config.v vVar3 = com.fyber.inneractive.sdk.config.u.f53482a.f53490b;
            r0Var.a("dnt", Boolean.toString(vVar3 != null ? vVar3.f53487b : false));
        }
        r0Var.a("dml", com.fyber.inneractive.sdk.util.k.j());
        int iC = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        int iC2 = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        if (iC > 0 && iC2 > 0) {
            r0Var.a("w", Integer.toString(iC));
            r0Var.a(CmcdData.STREAMING_FORMAT_HLS, Integer.toString(iC2));
        }
        int iC3 = com.fyber.inneractive.sdk.util.o.c();
        r0Var.a("o", iC3 == 1 ? TtmlNode.TAG_P : iC3 == 2 ? CmcdData.STREAM_TYPE_LIVE : "u");
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("ciso", com.fyber.inneractive.sdk.util.k.i());
            String str4 = cVar.f56916b;
            r0Var.a("mcc", str4 == null ? "" : str4.substring(0, Math.min(3, str4.length())));
            String str5 = cVar.f56916b;
            r0Var.a("mnc", str5 == null ? "" : str5.substring(Math.min(3, str5.length())));
            com.fyber.inneractive.sdk.util.a1 a1VarA = com.fyber.inneractive.sdk.util.a1.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a1VarA, a1VarA.b());
            r0Var.a("nt", a1VarA.b());
            r0Var.a("crn", cVar.a());
        }
        r0Var.a("os", "Android");
        r0Var.a("lng", iAConfigManager.f53289o);
        ArrayList arrayList3 = iAConfigManager.f53290p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r0Var.a("in_lng", com.fyber.inneractive.sdk.util.o.a(arrayList3));
        }
        r0Var.a("bid", com.fyber.inneractive.sdk.util.o.f57018a.getPackageName());
        r0Var.a("appv", com.fyber.inneractive.sdk.util.k.l());
        com.fyber.inneractive.sdk.config.g gVar2 = iAConfigManager.f53265C;
        if (gVar2.f53336d == null) {
            gVar2.f53337e = gVar2.i();
        }
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            str = null;
        } else {
            str = gVar2.f53336d;
            if (str == null) {
                str = gVar2.f53337e;
            }
        }
        r0Var.a("gdpr_consent_data", str);
        com.fyber.inneractive.sdk.config.g gVar3 = iAConfigManager.f53265C;
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            gVar3.getClass();
            str2 = null;
        } else {
            str2 = gVar3.f53340h;
        }
        r0Var.a("us_privacy", str2);
        r0Var.a("mute_video", Boolean.toString(iAConfigManager.f53285k));
        r0Var.a("osv", Build.VERSION.RELEASE);
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.f53266D.f54026p;
        r0Var.a("ignitep", lVar != null ? lVar.f74139a.d() : null);
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.f53266D.f54026p;
        r0Var.a("ignitev", lVar2 != null ? lVar2.f74139a.i() : null);
        HashMap map = new HashMap();
        cVar.a(inneractiveAdRequest.getSpotId(), map);
        for (Map.Entry entry : map.entrySet()) {
            r0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("childMode", "1");
        }
        com.fyber.inneractive.sdk.ignite.l lVar3 = IAConfigManager.f53260M.f53266D.f54026p;
        r0Var.a("odt", lVar3 != null ? lVar3.getOdt() : "");
        Double floorPrice = r0Var.f54307a.getFloorPrice();
        r0Var.a("floorprice", floorPrice != null ? w6.n(new BigDecimal(Double.toString(floorPrice.doubleValue())).setScale(5, RoundingMode.CEILING)).toPlainString() : null);
        String strA2 = com.fyber.inneractive.sdk.util.f1.a(strA, r0Var.f54308b);
        if (!this.f54304t) {
            IAlog.d("%s %s", "AD_REQUEST", strA2);
            this.f54304t = true;
        }
        return strA2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f54305u.f54335f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j2) {
        super.c(j2);
        IAlog.a("%s : NetworkRequestAd : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", IAlog.a(this));
        this.f54315a = true;
        a((Object) null, (Exception) new k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        return q();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(p().f54283a), Integer.valueOf(p().f54284b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j2) {
        super.a(j2);
        IAlog.a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }
}
