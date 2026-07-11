package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.network.f1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class y implements com.fyber.inneractive.sdk.response.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdmParametersOuterClass$AdmParameters f53120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53123d;

    public final void a(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        try {
            AdmParametersOuterClass$AdmParameters from = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.f53121b, 0));
            this.f53120a = from;
            if (from != null) {
                c0Var.a();
            }
            b(c0Var, rVar);
        } catch (Exception e2) {
            IAlog.f("failed to parse ad markup payload %s", e2.getMessage());
            com.fyber.inneractive.sdk.util.r.f57026b.post(new u(c0Var, e2));
        }
    }

    public final void b(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f53120a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.f53120a.getMarkupUrl();
        if (TextUtils.isEmpty(markupUrl)) {
            com.fyber.inneractive.sdk.util.r.f57026b.post(new x(c0Var));
            return;
        }
        try {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f53120a;
            int iA = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().a() : c.OTHER.a();
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(iA);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.e eVar2 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f53553a.f53554a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar2 != null ? eVar2.b() : null;
            if (bVarB != null) {
                bVarB.f56828a = bVarB.a();
                a(bVarB);
                eVar = bVarB.f56828a;
            } else {
                IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(iA));
            }
        } catch (Exception e2) {
            IAlog.a("failed parse adm network request with no input stream", e2, new Object[0]);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = eVar;
        f1 f1Var = new f1(new v(this, c0Var, eVar3), markupUrl, this, rVar, eVar3);
        f1Var.f54318d = new w(this);
        IAConfigManager.f53260M.f53292r.a(f1Var);
    }

    public y(String str, String str2) {
        this.f53121b = str;
        this.f53123d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.response.b bVar) {
        String str;
        String str2;
        String str3;
        int i2;
        com.fyber.inneractive.sdk.ignite.m mVar;
        bVar.f56828a.f56839A = true;
        IAConfigManager.f53260M.f53297w.f53497f = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f53120a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int iA = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.f53120a.hasErrorMessage()) {
            this.f53120a.getErrorMessage();
        }
        String sessionId = this.f53120a.hasSessionId() ? this.f53120a.getSessionId() : null;
        Long lValueOf = this.f53120a.hasContentId() ? Long.valueOf(this.f53120a.getContentId()) : null;
        if (this.f53120a.hasPublisherId()) {
            this.f53120a.getPublisherId();
        }
        Integer numValueOf = this.f53120a.hasAdWidth() ? Integer.valueOf(this.f53120a.getAdWidth()) : null;
        Integer numValueOf2 = this.f53120a.hasAdHeight() ? Integer.valueOf(this.f53120a.getAdHeight()) : null;
        String sdkImpressionUrl = this.f53120a.hasSdkImpressionUrl() ? this.f53120a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.f53120a.hasSdkClickUrl() ? this.f53120a.getSdkClickUrl() : null;
        Integer numValueOf3 = this.f53120a.hasAdExpirationInterval() ? Integer.valueOf(this.f53120a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.f53120a.hasAdCompletionUrl() ? this.f53120a.getAdCompletionUrl() : null;
        bVar.f56829b = this.f53120a.hasAdUnitId() ? this.f53120a.getAdUnitId() : null;
        String strName = this.f53120a.getAdUnitType().name();
        Locale locale = Locale.US;
        strName.toLowerCase(locale);
        String lowerCase = this.f53120a.hasAdUnitId() ? this.f53120a.getAdUnitDisplayType().name().toLowerCase(locale) : null;
        String adNetworkName = this.f53120a.hasAdNetworkName() ? this.f53120a.getAdNetworkName() : null;
        Long lValueOf2 = this.f53120a.hasAdNetworkId() ? Long.valueOf(this.f53120a.getAdNetworkId()) : null;
        String creativeId = this.f53120a.hasCreativeId() ? this.f53120a.getCreativeId() : null;
        Long l2 = lValueOf;
        String adDomain = this.f53120a.hasAdDomain() ? this.f53120a.getAdDomain() : null;
        Integer num = numValueOf;
        String appBundleId = this.f53120a.hasAppBundleId() ? this.f53120a.getAppBundleId() : null;
        Integer num2 = numValueOf2;
        String campaignId = this.f53120a.hasCampaignId() ? this.f53120a.getCampaignId() : null;
        Integer num3 = numValueOf3;
        String string = this.f53120a.hasPricingValue() ? Double.toString(this.f53120a.getPricingValue()) : null;
        String str4 = lowerCase;
        String strValueOf = this.f53120a.hasSpotId() ? String.valueOf(this.f53120a.getSpotId()) : null;
        impressionData.setCpmValue(string);
        impressionData.setCurrency("USD");
        if (this.f53120a.hasMrcData()) {
            int pixelPercent = this.f53120a.getMrcData().hasPixelPercent() ? this.f53120a.getMrcData().getPixelPercent() : 0;
            str3 = campaignId;
            int pixelDuration = this.f53120a.getMrcData().hasPixelDuration() ? this.f53120a.getMrcData().getPixelDuration() : -1;
            str2 = adDomain;
            String pixelImpressionUrl = this.f53120a.getMrcData().hasPixelImpressionUrl() ? this.f53120a.getMrcData().getPixelImpressionUrl() : null;
            str = creativeId;
            com.fyber.inneractive.sdk.response.e eVar = bVar.f56828a;
            eVar.f56867s = pixelPercent;
            eVar.f56868t = pixelDuration;
            eVar.f56869u = pixelImpressionUrl;
        } else {
            str = creativeId;
            str2 = adDomain;
            str3 = campaignId;
        }
        Boolean boolValueOf = this.f53120a.hasSkipMode() ? Boolean.valueOf(this.f53120a.getSkipMode()) : null;
        if (bVar.b()) {
            bVar.f56828a.f56865q = this.f53120a.toString();
        }
        bVar.f56828a.a(num3 != null ? num3.toString() : "");
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.f56828a.f56852d = l2 != null ? l2.toString() : "";
        bVar.f56828a.getClass();
        bVar.f56828a.getClass();
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.f56828a;
        eVar2.f56872x = appBundleId;
        eVar2.f56873y = this.f53123d;
        eVar2.f56874z = strValueOf;
        if (lValueOf2 != null) {
            impressionData.setDemandId(lValueOf2);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.f56828a;
        eVar3.f56855g = iA;
        if (num != null) {
            eVar3.f56853e = num.intValue();
        }
        if (num2 != null) {
            bVar.f56828a.f56854f = num2.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.f56828a;
        eVar4.f56859k = sdkImpressionUrl;
        eVar4.f56860l = sdkClickUrl;
        eVar4.f56863o = adCompletionUrl;
        eVar4.f56861m = bVar.f56829b;
        try {
            eVar4.f56862n = UnitDisplayType.fromValue(str4);
        } catch (IllegalArgumentException unused) {
            bVar.f56828a.f56862n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(str)) {
            impressionData.setCreativeId(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            impressionData.setAdvertiserDomain(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            impressionData.setCampaignId(str3);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        bVar.f56828a.f56866r = impressionData;
        if (boolValueOf == null) {
            i2 = -1;
        } else {
            i2 = boolValueOf.booleanValue() ? 1 : 0;
        }
        bVar.f56828a.f56870v = i2;
        String igniteInstallUrl = this.f53120a.hasIgniteInstallUrl() ? this.f53120a.getIgniteInstallUrl() : null;
        if (!TextUtils.isEmpty(igniteInstallUrl)) {
            bVar.f56828a.f56842D = igniteInstallUrl;
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.f56828a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f53120a;
        if (admParametersOuterClass$AdmParameters2 == null) {
            mVar = mVar2;
        } else {
            n igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.f53120a.getIgniteMode() : null;
            if (igniteMode != null && !igniteMode.equals(n.NONE)) {
                mVar = igniteMode.equals(n.SINGLETAP) ? com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP;
            }
        }
        if (mVar != null) {
            mVar2 = mVar;
        } else {
            eVar5.getClass();
        }
        eVar5.f56843E = mVar2;
        String igniteLauncherActivity = this.f53120a.hasIgniteLauncherActivity() ? this.f53120a.getIgniteLauncherActivity() : null;
        if (!TextUtils.isEmpty(igniteLauncherActivity)) {
            bVar.f56828a.f56844F = igniteLauncherActivity;
        }
        Boolean boolValueOf2 = this.f53120a.hasBrandBidderDontShowEndcard() ? Boolean.valueOf(this.f53120a.getBrandBidderDontShowEndcard()) : null;
        if (boolValueOf2 != null) {
            bVar.f56828a.f56840B = boolValueOf2.booleanValue() ? "1" : "0";
        }
        String brandBidderCtaText = this.f53120a.getBrandBidderCtaText();
        if (!TextUtils.isEmpty(brandBidderCtaText)) {
            bVar.f56828a.f56841C = brandBidderCtaText;
        }
        Boolean boolValueOf3 = this.f53120a.hasMraidVideoOMSignal() ? Boolean.valueOf(this.f53120a.getMraidVideoOMSignal()) : null;
        if (boolValueOf3 != null) {
            bVar.f56828a.f56845G = boolValueOf3.booleanValue();
        }
        bVar.f56828a.f56848J = CreativeType.fromValue(this.f53120a.getCreativeType());
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f53122c;
    }
}
