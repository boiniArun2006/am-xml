package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f59592n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConsentDebugSettings f59593t;

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f59594n;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ConsentDebugSettings f59595t;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.rl = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f59595t = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z2) {
            this.f59594n = z2;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f59592n = builder.f59594n;
        this.rl = builder.rl;
        this.f59593t = builder.f59595t;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f59593t;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f59592n;
    }

    @RecentlyNullable
    public final String zza() {
        return this.rl;
    }
}
