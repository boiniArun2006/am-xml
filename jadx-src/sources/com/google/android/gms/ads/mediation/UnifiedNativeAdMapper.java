package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class UnifiedNativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd.Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private VideoController zzj;
    private boolean zzk;
    private View zzl;
    private View zzm;
    private Object zzn;
    private Bundle zzo = new Bundle();
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    public void destroy() {
    }

    @NonNull
    public View getAdChoicesContent() {
        return this.zzl;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.zzf;
    }

    @NonNull
    public final String getBody() {
        return this.zzc;
    }

    @NonNull
    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    @NonNull
    public final Bundle getExtras() {
        return this.zzo;
    }

    @NonNull
    public final String getHeadline() {
        return this.zza;
    }

    @NonNull
    public final NativeAd.Image getIcon() {
        return this.zzd;
    }

    @NonNull
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    @NonNull
    public final String getPrice() {
        return this.zzi;
    }

    @NonNull
    public final Double getStarRating() {
        return this.zzg;
    }

    @NonNull
    public final String getStore() {
        return this.zzh;
    }

    public void handleClick(@NonNull View view) {
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.zzl = view;
    }

    public final void setAdvertiser(@NonNull String str) {
        this.zzf = str;
    }

    public final void setBody(@NonNull String str) {
        this.zzc = str;
    }

    public final void setCallToAction(@NonNull String str) {
        this.zze = str;
    }

    public final void setExtras(@NonNull Bundle bundle) {
        this.zzo = bundle;
    }

    public void setHasVideoContent(boolean z2) {
        this.zzk = z2;
    }

    public final void setHeadline(@NonNull String str) {
        this.zza = str;
    }

    public final void setIcon(@NonNull NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(@NonNull List<NativeAd.Image> list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f3) {
        this.zzr = f3;
    }

    public void setMediaView(@NonNull View view) {
        this.zzm = view;
    }

    public final void setOverrideClickHandling(boolean z2) {
        this.zzq = z2;
    }

    public final void setOverrideImpressionRecording(boolean z2) {
        this.zzp = z2;
    }

    public final void setPrice(@NonNull String str) {
        this.zzi = str;
    }

    public final void setStarRating(@NonNull Double d2) {
        this.zzg = d2;
    }

    public final void setStore(@NonNull String str) {
        this.zzh = str;
    }

    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
    }

    public void untrackView(@NonNull View view) {
    }

    public final void zza(@NonNull VideoController videoController) {
        this.zzj = videoController;
    }

    public final void zzb(@NonNull Object obj) {
        this.zzn = obj;
    }

    @NonNull
    public final VideoController zzc() {
        return this.zzj;
    }

    @NonNull
    public final View zzd() {
        return this.zzm;
    }

    @NonNull
    public final Object zze() {
        return this.zzn;
    }
}
