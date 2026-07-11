package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f56884a;

    @Override // com.fyber.inneractive.sdk.response.j
    public final void a(b bVar) {
        float f3;
        Long lValueOf;
        bVar.f56828a.f56839A = false;
        IAConfigManager.f53260M.f53297w.f53497f = false;
        ImpressionData impressionData = new ImpressionData();
        Map mapB = this.f56884a.b();
        String strA = a(mapB, n.RETURNED_AD_TYPE);
        a(mapB, n.ERROR_CODE);
        String strA2 = a(mapB, n.SESSION_ID);
        String strA3 = a(mapB, n.CONTENT_ID);
        a(mapB, n.PUBLISHER_ID);
        String strA4 = a(mapB, n.WIDTH);
        String strA5 = a(mapB, n.HEIGHT);
        String strA6 = a(mapB, n.SDK_IMPRESSION_URL);
        String strA7 = a(mapB, n.SDK_CLICK_URL);
        String strA8 = a(mapB, n.AD_TIMEOUT);
        String strA9 = a(mapB, n.AD_COMPLETION_URL);
        bVar.f56829b = a(mapB, n.AD_UNIT_ID);
        a(mapB, n.AD_UNIT_TYPE);
        String strA10 = a(mapB, n.AD_UNIT_DISPLAY_TYPE);
        String strA11 = a(mapB, n.AD_NETWORK);
        String strA12 = a(mapB, n.AD_NETWORK_ID);
        String strA13 = a(mapB, n.CREATIVE_ID);
        String strA14 = a(mapB, n.AD_DOMAIN);
        String strA15 = a(mapB, n.APP_BUNDLE);
        String strA16 = a(mapB, n.CAMPAIGN_ID);
        String strA17 = a(mapB, n.CPM_VALUE);
        String strA18 = a(mapB, n.CPM_CURRENCY);
        impressionData.setCpmValue(strA17);
        impressionData.setCurrency(strA18);
        String strA19 = a(mapB, n.BANNER_MRC_PERCENT);
        String strA20 = a(mapB, n.BANNER_MRC_DURATION);
        String strA21 = a(mapB, n.BANNER_MRC_IMPRESSION_URL);
        String strA22 = a(mapB, n.INTERSTITIAL_SKIP_MODE);
        String strA23 = a(mapB, n.IGNITE_INSTALL_URL);
        String strA24 = a(mapB, n.IGNITE_MODE);
        String strA25 = a(mapB, n.APP_BUNDLE_LAUNCHER);
        String strA26 = a(mapB, n.BRAND_BIDDER_SHOW_ENDCARD);
        String strA27 = a(mapB, n.BRAND_BIDDER_CTA_TEXT);
        String strA28 = a(mapB, n.MRAID_VIDEO_SIGNAL);
        String strA29 = a(mapB, n.CREATIVE_TYPE);
        if (bVar.b()) {
            bVar.f56828a.f56864p = mapB;
        }
        bVar.f56828a.a(strA8);
        impressionData.setImpressionId(strA2);
        impressionData.setDemandSource(strA11);
        e eVar = bVar.f56828a;
        eVar.f56852d = strA3;
        eVar.f56872x = strA15;
        if (!TextUtils.isEmpty(strA12)) {
            if (TextUtils.isEmpty(strA12)) {
                lValueOf = null;
                impressionData.setDemandId(lValueOf);
            } else {
                try {
                    lValueOf = Long.valueOf(strA12);
                } catch (NumberFormatException unused) {
                    lValueOf = null;
                }
                impressionData.setDemandId(lValueOf);
            }
        }
        if (!TextUtils.isEmpty(strA)) {
            bVar.f56828a.f56855g = Integer.valueOf(strA).intValue();
        }
        if (!TextUtils.isEmpty(strA4)) {
            bVar.f56828a.f56853e = Integer.valueOf(strA4).intValue();
        }
        if (!TextUtils.isEmpty(strA5)) {
            bVar.f56828a.f56854f = Integer.valueOf(strA5).intValue();
        }
        e eVar2 = bVar.f56828a;
        eVar2.f56859k = strA6;
        eVar2.f56860l = strA7;
        eVar2.f56863o = strA9;
        eVar2.f56861m = bVar.f56829b;
        try {
            eVar2.f56862n = UnitDisplayType.fromValue(strA10);
        } catch (IllegalArgumentException unused2) {
            bVar.f56828a.f56862n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(strA13)) {
            impressionData.setCreativeId(strA13);
        }
        if (!TextUtils.isEmpty(strA14)) {
            impressionData.setAdvertiserDomain(strA14);
        }
        if (!TextUtils.isEmpty(strA16)) {
            impressionData.setCampaignId(strA16);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        e eVar3 = bVar.f56828a;
        eVar3.f56866r = impressionData;
        eVar3.f56867s = v.a(strA19, 0);
        e eVar4 = bVar.f56828a;
        if (TextUtils.isEmpty(strA20)) {
            f3 = -1.0f;
        } else {
            try {
                f3 = Float.parseFloat(strA20);
            } catch (NumberFormatException unused3) {
                f3 = -1.0f;
            }
        }
        eVar4.f56868t = f3;
        e eVar5 = bVar.f56828a;
        eVar5.f56869u = strA21;
        eVar5.f56870v = v.a(strA22, -1);
        if (!TextUtils.isEmpty(strA23)) {
            bVar.f56828a.f56842D = strA23;
        }
        if (!TextUtils.isEmpty(strA24)) {
            e eVar6 = bVar.f56828a;
            m mVarA = m.a(strA24);
            if (mVarA == null) {
                eVar6.getClass();
                mVarA = m.NONE;
            }
            eVar6.f56843E = mVarA;
        }
        if (!TextUtils.isEmpty(strA25)) {
            bVar.f56828a.f56844F = strA25;
        }
        if (!TextUtils.isEmpty(strA26)) {
            bVar.f56828a.f56840B = strA26;
        }
        if (!TextUtils.isEmpty(strA27)) {
            bVar.f56828a.f56841C = strA27;
        }
        bVar.f56828a.f56845G = "1".equals(strA28) || Boolean.parseBoolean(strA28);
        bVar.f56828a.f56848J = CreativeType.fromValue(strA29);
    }

    public k(o oVar) {
        this.f56884a = oVar;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f56884a.a().toString();
    }

    public final String a(Map map, n nVar) {
        String lowerCase = nVar.a().toLowerCase(Locale.US);
        String str = (String) map.get(lowerCase);
        IAlog.e("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        IAlog.d("%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }
}
