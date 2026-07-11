package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AdRequest {

    @NonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final zzek zza;

    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public Builder self() {
            return this;
        }

        @NonNull
        public AdRequest build() {
            return new AdRequest(this);
        }
    }

    @Nullable
    public String getAdString() {
        return this.zza.zzn();
    }

    @NonNull
    public String getContentUrl() {
        return this.zza.zza();
    }

    @NonNull
    public Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    @NonNull
    public Set<String> getKeywords() {
        return this.zza.zzc();
    }

    public long getPlacementId() {
        return this.zza.zzr();
    }

    @NonNull
    public String getRequestAgent() {
        return this.zza.zzg();
    }

    public final zzek zza() {
        return this.zza;
    }

    @Nullable
    @Deprecated
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@NonNull Class<T> cls) {
        return this.zza.zze(cls);
    }

    @NonNull
    public List<String> getNeighboringContentUrls() {
        return this.zza.zzb();
    }

    @Nullable
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@NonNull Class<T> cls) {
        return this.zza.zzd(cls);
    }

    public boolean isTestDevice(@NonNull Context context) {
        return this.zza.zzh(context);
    }

    protected AdRequest(@NonNull AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.zza = new zzek(abstractAdRequestBuilder.zza, null);
    }
}
