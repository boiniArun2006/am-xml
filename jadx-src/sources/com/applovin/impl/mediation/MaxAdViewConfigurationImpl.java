package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.C1804o;
import com.applovin.mediation.MaxAdViewConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f48994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48996c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f48997a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48998b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f48999c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f48997a;
        }

        public int getAdaptiveWidth() {
            return this.f48998b;
        }

        public int getInlineMaximumHeight() {
            return this.f48999c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            C1804o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f48997a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i2) {
            C1804o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i2 + ")");
            this.f48998b = i2;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i2) {
            C1804o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i2 + ")");
            this.f48999c = i2;
            return this;
        }

        @NonNull
        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f48997a + ", adaptiveWidth=" + this.f48998b + ", inlineMaximumHeight=" + this.f48999c + "}";
        }
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f48994a = builderImpl.f48997a;
        this.f48995b = builderImpl.f48998b;
        this.f48996c = builderImpl.f48999c;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f48994a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f48995b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f48996c;
    }

    @NonNull
    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f48994a + ", adaptiveWidth=" + this.f48995b + ", inlineMaximumHeight=" + this.f48996c + "}";
    }
}
