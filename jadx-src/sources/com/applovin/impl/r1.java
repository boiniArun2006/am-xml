package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class r1 extends e2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f49830i;

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void b() {
        this.f49830i = JsonUtils.deserialize((String) this.f48417a.a(x4.f50768K));
    }

    public r1(C1802k c1802k) {
        super(c1802k, d2.b.ERROR);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void b(final String str, final String str2, final Throwable th) {
        this.f48417a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f48417a, "reportCaughtException", new Runnable() { // from class: com.applovin.impl.op
            @Override // java.lang.Runnable
            public final void run() {
                this.f49633n.a(str, str2, th);
            }
        }), d6.b.OTHER);
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        a(d2.N0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(f2.a((AppLovinAdImpl) bVar));
            map.putAll(f2.a(bVar));
            boolean zC0 = bVar.C0();
            map.put("is_video_stream", String.valueOf(zC0));
            if (zC0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).i1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.I(), map);
            }
        }
        d(d2.T0, map);
    }

    public void a(String str, String str2, int i2, String str3) {
        List listA = a(str2);
        boolean z2 = listA != null;
        if (z2 && listA.contains(Integer.valueOf(i2))) {
            return;
        }
        if (z2 || i2 >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put(dpcnwfoVOnrtRA.knTdrMrguZL, StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i2));
            map.put("error_message", f2.a(str3));
            d(d2.W0, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f49830i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f49830i, "default", null) : integerList;
    }
}
