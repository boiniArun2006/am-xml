package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f51067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f51068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f51069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f51070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f51071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f51072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f51073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f51074h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f51075i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f51076j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f51077k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Double f51078l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f51067a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f51069c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f51070d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f51071e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f51072f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f51073g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f51076j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f3) {
            this.f51077k = f3;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f51075i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f51074h = view;
            return this;
        }

        public Builder setStarRating(Double d2) {
            this.f51078l = d2;
            return this;
        }

        public Builder setTitle(String str) {
            this.f51068b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f51079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f51080b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f51079a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f51079a;
        }

        @Nullable
        public Uri getUri() {
            return this.f51080b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f51080b = uri;
        }
    }

    public boolean isContainerClickable() {
        return false;
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @UiThread
    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f51067a;
        this.title = builder.f51068b;
        this.advertiser = builder.f51069c;
        this.body = builder.f51070d;
        this.callToAction = builder.f51071e;
        this.icon = builder.f51072f;
        this.iconView = builder.f51073g;
        this.optionsView = builder.f51074h;
        this.mediaView = builder.f51075i;
        this.mainImage = builder.f51076j;
        this.mediaContentAspectRatio = builder.f51077k;
        Double d2 = builder.f51078l;
        this.starRating = (d2 == null || d2.doubleValue() < 3.0d) ? null : d2;
    }
}
