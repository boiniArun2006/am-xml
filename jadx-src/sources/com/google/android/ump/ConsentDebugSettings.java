package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ConsentDebugSettings {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f59588n;
    private final int rl;

    public static class Builder {
        private boolean nr;
        private final Context rl;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f59589n = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59590t = 0;

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z2 = true;
            if (!zzcu.zza(true) && !this.f59589n.contains(zzcm.zza(this.rl)) && !this.nr) {
                z2 = false;
            }
            return new ConsentDebugSettings(z2, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i2) {
            this.f59590t = i2;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z2) {
            this.nr = z2;
            return this;
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f59589n.add(str);
            return this;
        }

        public Builder(@RecentlyNonNull Context context) {
            this.rl = context.getApplicationContext();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    /* synthetic */ ConsentDebugSettings(boolean z2, Builder builder, zza zzaVar) {
        this.f59588n = z2;
        this.rl = builder.f59590t;
    }

    public int getDebugGeography() {
        return this.rl;
    }

    public boolean isTestDevice() {
        return this.f59588n;
    }
}
