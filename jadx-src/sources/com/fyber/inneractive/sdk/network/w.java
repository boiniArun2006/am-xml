package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f54356h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f54357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f54358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f54359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f54360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f54361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f54362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54363g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f54358b = tVar;
        this.f54357a = null;
        this.f54360d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < objArr.length - 1; i2 += 2) {
                String string = objArr[i2].toString();
                Object obj = objArr[i2 + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f54362f.put(jSONObject);
        }
        return this;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f54358b = tVar;
        this.f54357a = inneractiveAdRequest;
        this.f54360d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        String str2;
        String str3;
        Long l2;
        String str4;
        String str5;
        String campaignId;
        String str6;
        String spotId;
        UnitDisplayType unitDisplayTypeA;
        InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.response.e eVar;
        boolean zIsDeprecated;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        if (IAConfigManager.c() && !u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.f54359c)) {
            String strA = IAlog.a(this);
            Object obj = this.f54359c;
            if (obj == null) {
                obj = this.f54358b;
            }
            IAlog.a("%sSdk event dispatcher - aborting dispatch: %s", strA, obj);
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar2 = this.f54361e;
        if (eVar2 != null) {
            ImpressionData impressionData = eVar2.f56866r;
            String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
            ImpressionData impressionData2 = this.f54361e.f56866r;
            String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f54361e.f56866r;
            Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
            ImpressionData impressionData4 = this.f54361e.f56866r;
            String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
            ImpressionData impressionData5 = this.f54361e.f56866r;
            String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
            ImpressionData impressionData6 = this.f54361e.f56866r;
            if (impressionData6 != null) {
                str2 = impressionId;
                str3 = demandSource;
                l2 = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
                campaignId = impressionData6.getCampaignId();
            } else {
                str2 = impressionId;
                campaignId = null;
                str3 = demandSource;
                l2 = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
            }
        } else {
            str2 = null;
            str3 = null;
            l2 = null;
            str4 = null;
            str5 = null;
            campaignId = null;
        }
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        y yVar = new y(iAConfigManager.f53277c, str2, str3, l2, str4, str5, campaignId, str);
        InneractiveAdRequest inneractiveAdRequest2 = this.f54357a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) selectedUnitConfig;
            com.fyber.inneractive.sdk.config.o0 o0Var = r0Var.f53418d;
            Track track = Track.ERRORS;
            Set set = o0Var.f53410a;
            if (!(set == null ? false : set.contains(track))) {
                return;
            }
            com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.f53417c;
            if (l0Var != null && (unitDisplayType2 = l0Var.f53402b) != null) {
                zIsDeprecated = unitDisplayType2.isDeprecated();
            } else {
                com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f53420f;
                zIsDeprecated = (t0Var == null || (unitDisplayType = t0Var.f53480j) == null) ? false : unitDisplayType.isDeprecated();
            }
            if (zIsDeprecated) {
                return;
            }
        }
        if (selectedUnitConfig == null && (eVar = this.f54361e) != null) {
            com.fyber.inneractive.sdk.config.a.a(eVar.f56861m);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = this.f54361e;
        String str7 = eVar3 == null ? null : eVar3.f56852d;
        String str8 = TextUtils.isEmpty(iAConfigManager.f53293s) ? null : iAConfigManager.f53293s;
        if (this.f54358b == null && this.f54359c == null) {
            IAlog.a(qUrazMnwDskFs.jDbicVahCzhG, new Object[0]);
            return;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.f54357a;
        if (inneractiveAdRequest3 != null) {
            spotId = inneractiveAdRequest3.getSpotId();
        } else {
            com.fyber.inneractive.sdk.response.e eVar4 = this.f54361e;
            if (eVar4 != null) {
                spotId = eVar4.f56874z;
            } else {
                str6 = null;
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(iAConfigManager.f53286l)) {
                    sb.append(iAConfigManager.f53286l);
                    sb.append("_");
                }
                com.fyber.inneractive.sdk.response.e eVar5 = this.f54361e;
                unitDisplayTypeA = eVar5 != null ? null : eVar5.f56862n;
                if (unitDisplayTypeA == null && (inneractiveAdRequest = this.f54357a) != null && inneractiveAdRequest.getSpotId() != null) {
                    unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f54357a.getSpotId());
                }
                sb.append(unitDisplayTypeA == null ? unitDisplayTypeA.name().toLowerCase(Locale.US) : "unknown");
                String string = sb.toString();
                com.fyber.inneractive.sdk.response.e eVar6 = this.f54361e;
                Integer numValueOf = eVar6 != null ? Integer.valueOf(eVar6.f56855g) : null;
                com.fyber.inneractive.sdk.response.e eVar7 = this.f54361e;
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new v(this, yVar, str7, str8, string, str6, numValueOf, eVar7 != null ? "" : eVar7.f56856h));
            }
        }
        str6 = spotId;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(iAConfigManager.f53286l)) {
        }
        com.fyber.inneractive.sdk.response.e eVar52 = this.f54361e;
        if (eVar52 != null) {
        }
        if (unitDisplayTypeA == null) {
            unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f54357a.getSpotId());
        }
        sb2.append(unitDisplayTypeA == null ? unitDisplayTypeA.name().toLowerCase(Locale.US) : "unknown");
        String string2 = sb2.toString();
        com.fyber.inneractive.sdk.response.e eVar62 = this.f54361e;
        Integer numValueOf2 = eVar62 != null ? Integer.valueOf(eVar62.f56855g) : null;
        com.fyber.inneractive.sdk.response.e eVar72 = this.f54361e;
        com.fyber.inneractive.sdk.util.r.f57025a.execute(new v(this, yVar, str7, str8, string2, str6, numValueOf2, eVar72 != null ? "" : eVar72.f56856h));
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f54359c = uVar;
        this.f54357a = null;
        this.f54360d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f54359c = uVar;
        this.f54357a = inneractiveAdRequest;
        this.f54360d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.f54363g = false;
        this.f54361e = eVar;
        this.f54362f = new JSONArray();
    }
}
