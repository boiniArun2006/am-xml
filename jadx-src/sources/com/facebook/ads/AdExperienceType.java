package com.facebook.ads;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
public enum AdExperienceType {
    AD_EXPERIENCE_TYPE_REWARDED("ad_experience_config_rewarded"),
    AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL("ad_experience_config_rewarded_interstitial"),
    AD_EXPERIENCE_TYPE_INTERSTITIAL("ad_experience_config_interstitial");

    private String adExperienceType;

    public String getAdExperienceType() {
        return this.adExperienceType;
    }

    AdExperienceType(String str) {
        this.adExperienceType = str;
    }
}
