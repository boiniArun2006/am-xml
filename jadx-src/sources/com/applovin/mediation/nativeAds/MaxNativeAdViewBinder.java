package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    protected final int advertiserTextViewId;

    @IdRes
    protected final int bodyTextViewId;

    @IdRes
    protected final int callToActionButtonId;

    @IdRes
    protected final int iconContentViewId;

    @IdRes
    protected final int iconImageViewId;

    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;

    @IdRes
    protected final int mediaContentFrameLayoutId;

    @IdRes
    protected final int mediaContentViewGroupId;

    @IdRes
    protected final int optionsContentFrameLayoutId;

    @IdRes
    protected final int optionsContentViewGroupId;

    @IdRes
    protected final int starRatingContentViewGroupId;
    protected final String templateType;

    @IdRes
    protected final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f51098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f51099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f51104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f51105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f51106i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f51107j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f51108k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f51109l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f51110m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f51111n;

        public Builder(View view) {
            this(-1, view);
        }

        public Builder(@LayoutRes int i2) {
            this(i2, null);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f51098a, this.f51099b, this.f51100c, this.f51101d, this.f51102e, this.f51103f, this.f51104g, this.f51107j, this.f51105h, this.f51106i, this.f51108k, this.f51109l, this.f51110m, this.f51111n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i2) {
            this.f51101d = i2;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i2) {
            this.f51102e = i2;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i2) {
            this.f51110m = i2;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(@IdRes int i2) {
            this.f51104g = i2;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i2) {
            this.f51103f = i2;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(@IdRes int i2) {
            this.f51109l = i2;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i2) {
            this.f51108k = i2;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(@IdRes int i2) {
            this.f51106i = i2;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i2) {
            this.f51105h = i2;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i2) {
            this.f51107j = i2;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.f51111n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i2) {
            this.f51100c = i2;
            return this;
        }

        private Builder(int i2, View view) {
            this.f51100c = -1;
            this.f51101d = -1;
            this.f51102e = -1;
            this.f51103f = -1;
            this.f51104g = -1;
            this.f51105h = -1;
            this.f51106i = -1;
            this.f51107j = -1;
            this.f51108k = -1;
            this.f51109l = -1;
            this.f51110m = -1;
            this.f51099b = i2;
            this.f51098a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str) {
        this.mainView = view;
        this.layoutResourceId = i2;
        this.titleTextViewId = i3;
        this.advertiserTextViewId = i5;
        this.bodyTextViewId = i7;
        this.iconImageViewId = i8;
        this.iconContentViewId = i9;
        this.starRatingContentViewGroupId = i10;
        this.optionsContentViewGroupId = i11;
        this.optionsContentFrameLayoutId = i12;
        this.mediaContentViewGroupId = i13;
        this.mediaContentFrameLayoutId = i14;
        this.callToActionButtonId = i15;
        this.templateType = str;
    }
}
