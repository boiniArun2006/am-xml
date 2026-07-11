package com.applovin.impl;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f50622a = new StringBuilder();

    public v2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public v2 b(String str) {
        this.f50622a.append(str);
        return this;
    }

    public v2 a(String str, Object obj, String str2) {
        StringBuilder sb = this.f50622a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public v2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.W()).a("close_style", bVar.p()).a("close_delay_graphic", Long.valueOf(bVar.r()), CmcdData.STREAMING_FORMAT_SS);
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.g1().substring(0, Math.min(aVar.g1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.d0()), CmcdData.STREAMING_FORMAT_SS).a("skip_style", bVar.U()).a("Streaming", Boolean.valueOf(bVar.C0())).a("Video Location", bVar.I()).a("video_button_properties", bVar.b0());
        }
        return this;
    }

    public String toString() {
        return this.f50622a.toString();
    }

    public v2 a(String str) {
        StringBuilder sb = this.f50622a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public v2 a() {
        this.f50622a.append("\n========================================");
        return this;
    }

    public v2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z2 = bVar instanceof o7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z2 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z2) {
            a("VAST DSP", ((o7) bVar).n1());
        }
        return this;
    }

    public v2 a(y2 y2Var) {
        return a("Network", y2Var.c()).a("Adapter Version", y2Var.z()).a("Format", y2Var.getFormat().getLabel()).a("Ad Unit ID", y2Var.getAdUnitId()).a("Placement", y2Var.getPlacement()).a("Network Placement", y2Var.R()).a("Serve ID", y2Var.Q()).a("Creative ID", StringUtils.isValidString(y2Var.getCreativeId()) ? y2Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(y2Var.v()) ? y2Var.v() : "None").a("DSP Name", StringUtils.isValidString(y2Var.getDspName()) ? y2Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(y2Var.getDspId()) ? y2Var.getDspId() : "None").a("Server Parameters", y2Var.l());
    }

    public v2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", e8.a(appLovinAdView.getVisibility()));
    }

    public v2 a(C1802k c1802k) {
        return a("Muted", Boolean.valueOf(c1802k.n0().isMuted()));
    }

    public v2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
