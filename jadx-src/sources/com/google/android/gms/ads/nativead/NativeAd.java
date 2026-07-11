package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class NativeAd {

    public static abstract class AdChoicesInfo {
        @NonNull
        public abstract List<Image> getImages();

        @NonNull
        public abstract CharSequence getText();
    }

    public static abstract class Image {

        @Nullable
        protected Map zza;

        @Nullable
        @KeepForSdk
        private Map<String, String> getImmersiveExtras() {
            return this.zza;
        }

        @Nullable
        public abstract Drawable getDrawable();

        public abstract double getScale();

        @Nullable
        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    public interface OnNativeAdLoadedListener {
        void onNativeAdLoaded(@NonNull NativeAd nativeAd);
    }

    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(@NonNull String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @Deprecated
    public abstract void enableCustomClickGesture();

    @Nullable
    public abstract AdChoicesInfo getAdChoicesInfo();

    @Nullable
    public abstract String getAdvertiser();

    @Nullable
    public abstract String getBody();

    @Nullable
    public abstract String getCallToAction();

    @NonNull
    public abstract Bundle getExtras();

    @Nullable
    public abstract String getHeadline();

    @Nullable
    public abstract Image getIcon();

    @NonNull
    public abstract List<Image> getImages();

    @Nullable
    public abstract MediaContent getMediaContent();

    @NonNull
    public abstract List<MuteThisAdReason> getMuteThisAdReasons();

    public abstract long getPlacementId();

    @Nullable
    public abstract String getPrice();

    @Nullable
    public abstract ResponseInfo getResponseInfo();

    @Nullable
    public abstract Double getStarRating();

    @Nullable
    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(@NonNull MuteThisAdReason muteThisAdReason);

    public abstract void performClick(@NonNull Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    @KeepForSdk
    protected abstract void recordEvent(@NonNull Bundle bundle);

    public abstract boolean recordImpression(@NonNull Bundle bundle);

    public abstract void reportTouchEvent(@NonNull Bundle bundle);

    public abstract void setMuteThisAdListener(@NonNull MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j2);

    public abstract void setUnconfirmedClickListener(@NonNull UnconfirmedClickListener unconfirmedClickListener);

    @Nullable
    protected abstract Object zza();
}
