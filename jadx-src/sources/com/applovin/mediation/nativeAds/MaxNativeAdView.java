package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.impl.d3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f51082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f51083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f51084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f51085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f51086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f51087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f51088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f51089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f51090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f51091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f51092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f51093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f51094m;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f51095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f51096b;

        a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f51095a = weakReference;
            this.f51096b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f51095a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                C1802k.C0.O();
                if (C1804o.a()) {
                    C1802k.C0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f51095a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f51096b.getLayoutParams();
            layoutParams.height = ((View) this.f51096b.getParent()).getWidth();
            this.f51096b.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p1, Activity p2, StatsEvent p3) {
        this(p1, (String) null, p2);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V" == 0) {
        } else {
            this(p1, (String) null, p2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAd, maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        this(maxNativeAd, str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f51083b.setText(maxNativeAd.getTitle());
        } else {
            this.f51083b.setVisibility(8);
        }
        if (this.f51084c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f51084c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f51084c.setVisibility(8);
            }
        }
        if (this.f51085d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f51085d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f51085d.setVisibility(8);
            } else {
                this.f51085d.setVisibility(4);
            }
        }
        if (this.f51086e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f51086e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f51086e.setVisibility(8);
            } else {
                this.f51086e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f51088g;
        if (frameLayout != null) {
            if (icon == null || this.f51087f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f51088g.removeAllViews();
                    this.f51088g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f51087f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f51088g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f51087f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f51090i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f51090i.addView(optionsView);
            this.f51090i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f51093l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f51093l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f51093l.setVisibility(8);
            }
        }
        if (this.f51091j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f51091j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f51091j.addView(appLovinStarRatingView);
            } else {
                this.f51091j.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f51141n.a();
            }
        }, 2000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f51094m;
        if (bVar != null) {
            bVar.a();
            this.f51094m = null;
        }
        View view = this.f51082a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f51082a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f51082a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p1, String p2, Activity p3, StatsEvent p4) {
        this(p1, p2, p3.getApplicationContext());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V" == 0) {
        } else {
            this(p1, p2, p3.getApplicationContext());
        }
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid template: " + str);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    @Nullable
    public b getAdViewTracker() {
        return this.f51094m;
    }

    public TextView getAdvertiserTextView() {
        return this.f51084c;
    }

    public TextView getBodyTextView() {
        return this.f51085d;
    }

    public Button getCallToActionButton() {
        return this.f51086e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f51083b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f51084c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f51085d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f51086e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f51087f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f51088g;
    }

    public ImageView getIconImageView() {
        return this.f51087f;
    }

    public View getMainView() {
        return this.f51082a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f51093l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f51092k;
        return viewGroup != null ? viewGroup : this.f51093l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f51090i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f51089h;
        return viewGroup != null ? viewGroup : this.f51090i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f51091j;
    }

    public TextView getTitleTextView() {
        return this.f51083b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private MaxNativeAdView(MaxNativeAd p1, String p2, Context p3, StatsEvent p4) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V" == 0) {
            MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(p2).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
            int i2 = R.id.applovin_native_options_view;
            MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i2).setOptionsContentFrameLayoutId(i2).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
            int i3 = R.id.applovin_native_media_content_view;
            this(p1, starRatingContentViewGroupId.setMediaContentViewGroupId(i3).setMediaContentFrameLayoutId(i3).build(), p3);
            return;
        }
        MaxNativeAdViewBinder.Builder iconContentViewId2 = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(p2).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i5 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId2 = iconContentViewId2.setOptionsContentViewGroupId(i5).setOptionsContentFrameLayoutId(i5).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i7 = R.id.applovin_native_media_content_view;
        this(p1, starRatingContentViewGroupId2.setMediaContentViewGroupId(i7).setMediaContentFrameLayoutId(i7).build(), p3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f51094m;
        if (bVar != null) {
            bVar.c();
        }
        if (!isHardwareAccelerated()) {
            C1804o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void render(d3 d3Var, a.InterfaceC0704a interfaceC0704a, C1802k c1802k) {
        recycle();
        if (!d3Var.v0().get() || !d3Var.u0().get()) {
            this.f51094m = new b(d3Var, this, interfaceC0704a, c1802k);
        }
        final MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (d3Var.w0() && nativeAd.isContainerClickable()) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAdViewBinder p1, Context p2, StatsEvent p3) {
        this((MaxNativeAd) null, p1, p2);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
        } else {
            this((MaxNativeAd) null, p1, p2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p1, MaxNativeAdViewBinder p2, Context p3, StatsEvent p4) {
        int iA;
        super(p3);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(p3);
        boolean z2 = p2.templateType != null;
        MaxAdFormat format = p1 != null ? p1.getFormat() : MaxAdFormat.NATIVE;
        View view = p2.mainView;
        if (view != null) {
            this.f51082a = view;
        } else {
            if (z2) {
                iA = a(p2.templateType, format);
            } else {
                iA = p2.layoutResourceId;
            }
            this.f51082a = LayoutInflater.from(p3).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f51082a);
        this.f51083b = (TextView) findViewById(p2.titleTextViewId);
        this.f51084c = (TextView) findViewById(p2.advertiserTextViewId);
        this.f51085d = (TextView) findViewById(p2.bodyTextViewId);
        this.f51086e = (Button) findViewById(p2.callToActionButtonId);
        this.f51087f = (ImageView) findViewById(p2.iconImageViewId);
        this.f51088g = (FrameLayout) findViewById(p2.iconContentViewId);
        this.f51089h = (ViewGroup) findViewById(p2.optionsContentViewGroupId);
        this.f51090i = (FrameLayout) findViewById(p2.optionsContentFrameLayoutId);
        this.f51091j = (ViewGroup) findViewById(p2.starRatingContentViewGroupId);
        this.f51092k = (ViewGroup) findViewById(p2.mediaContentViewGroupId);
        this.f51093l = (FrameLayout) findViewById(p2.mediaContentFrameLayoutId);
        if (p1 != null) {
            b(p1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f51083b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f51085d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f51084c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f51086e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f51087f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f51087f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f51087f, icon.getUri());
                } else {
                    this.f51087f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f51092k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f51092k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f51089h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f51089h.addView(optionsView);
                this.f51089h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f51091j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f51091j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}
