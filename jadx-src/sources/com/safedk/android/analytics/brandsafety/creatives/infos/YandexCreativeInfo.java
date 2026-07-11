package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@AdNetworkIdentifier(packageName = h.f63185y)
public class YandexCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Set<String> f62514E;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final Set<String> f62515Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f62516Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f62517a;

    public YandexCreativeInfo() {
        this.f62517a = new HashSet();
        this.f62514E = new HashSet();
        this.f62515Y = new HashSet();
        this.f62516Z = null;
    }

    public YandexCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String placementId, String packageName, String sdkVersion, String downstreamStruct) {
        super(adType == null ? BrandSafetyUtils.AdType.INTERSTITIAL : adType, h.f63185y, id, creativeId, clickUrl, null, downstreamStruct, sdkVersion);
        this.f62517a = new HashSet();
        this.f62514E = new HashSet();
        this.f62515Y = new HashSet();
        this.f62516Z = null;
        this.f62470M = packageName;
        j(placementId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }

    public Set<String> ar() {
        return this.f62517a;
    }

    public void a(String str) {
        this.f62517a.add(str);
    }

    public Set<String> as() {
        return this.f62514E;
    }

    public void I(String str) {
        this.f62514E.add(str);
    }

    public void J(String str) {
        this.f62515Y.add(str);
    }

    public Set<String> at() {
        return this.f62515Y;
    }

    public String au() {
        return this.f62516Z;
    }

    public void K(String str) {
        this.f62516Z = str;
    }
}
