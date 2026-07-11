package com.vungle.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.util.ImageLoader;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0002\u0080\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000107J\u001a\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u001c2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0010\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u000107J\u0010\u0010<\u001a\u0002042\b\u0010=\u001a\u0004\u0018\u000107J\u0006\u0010>\u001a\u00020\u001cJ\u0006\u0010?\u001a\u00020\u001cJ\n\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0006\u0010B\u001a\u00020\u001cJ\r\u0010C\u001a\u0004\u0018\u00010D¢\u0006\u0002\u0010EJ\u0006\u0010F\u001a\u00020\u001cJ\u0006\u0010G\u001a\u00020\u001cJ\b\u0010H\u001a\u00020\u001cH\u0002J\b\u0010I\u001a\u00020\u001cH\u0002J\r\u0010J\u001a\u00020\u001cH\u0000¢\u0006\u0002\bKJ\u0006\u0010L\u001a\u00020\u0007J\b\u0010M\u001a\u00020\u001cH\u0002J\r\u0010N\u001a\u00020\u001cH\u0000¢\u0006\u0002\bOJ\n\u0010P\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010Q\u001a\u00020\u001cH\u0002J\b\u0010R\u001a\u00020\u001cH\u0002J\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020TJ\u0018\u0010V\u001a\u0002042\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZJ\n\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020TH\u0016J\r\u0010^\u001a\u00020TH\u0000¢\u0006\u0002\b_J\r\u0010`\u001a\u00020TH\u0000¢\u0006\u0002\baJ\u0012\u0010b\u001a\u00020T2\b\u0010c\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010d\u001a\u00020T2\u0006\u0010e\u001a\u00020fH\u0016J\b\u0010g\u001a\u000204H\u0002J\u0015\u0010h\u001a\u0002042\u0006\u0010i\u001a\u00020jH\u0011¢\u0006\u0002\bkJ\r\u0010l\u001a\u000204H\u0001¢\u0006\u0002\bmJ\u0006\u0010n\u001a\u000204J\u0006\u0010o\u001a\u000204J\u0006\u0010p\u001a\u000204J\b\u0010q\u001a\u000204H\u0002J\b\u0010r\u001a\u000204H\u0003J\u0018\u0010s\u001a\u0002042\u0006\u0010W\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u001cJ&\u0010v\u001a\u0002042\u0006\u0010w\u001a\u00020x2\u0016\b\u0002\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020{\u0018\u00010zJ\u001a\u0010|\u001a\u0002042\u0006\u0010w\u001a\u00020\u001c2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010~\u001a\u0002042\u0006\u0010\u007f\u001a\u00020XR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R&\u0010$\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b.\u0010/R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lcom/vungle/ads/internal/NativeAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "aspectRatio", "", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "executors$delegate", "Lkotlin/Lazy;", "imageLoader", "Lcom/vungle/ads/internal/util/ImageLoader;", "getImageLoader", "()Lcom/vungle/ads/internal/util/ImageLoader;", "imageLoader$delegate", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "isInvisibleLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeAdAssetMap", "", "", "onTouchListener", "Landroid/view/View$OnTouchListener;", AppLovinBridge.f61288f, "Lcom/vungle/ads/internal/platform/Platform;", "getPlatform", "()Lcom/vungle/ads/internal/platform/Platform;", "platform$delegate", "presenter", "Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "getPresenter$vungle_ads_release$annotations", "()V", "getPresenter$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "setPresenter$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/NativeAdPresenter;)V", "videoOptions", "Lcom/vungle/ads/nativead/NativeVideoOptions;", "getVideoOptions$vungle_ads_release", "()Lcom/vungle/ads/nativead/NativeVideoOptions;", "videoOptions$delegate", "waterMarkView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "destroy", "", "displayAppIcon", "imageView", "Landroid/widget/ImageView;", "displayImage", JavetError.PARAMETER_PATH, "displayMainImage", "mainImage", "displayPrivacyIcon", "privacyIcon", "getAdBodyText", "getAdCallToActionText", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "getAdSponsoredText", "getAdStarRating", "", "()Ljava/lang/Double;", "getAdTitle", "getAppIcon", "getCtaUrl", "getMainImagePath", "getMainVideoPath", "getMainVideoPath$vungle_ads_release", "getMediaAspectRatio", "getOMSDKData", "getOriginalVideoUrl", "getOriginalVideoUrl$vungle_ads_release", "getPlacementRefId", "getPrivacyIconUrl", "getPrivacyUrl", "hasCallToAction", "", "hasVideoContent", "initPresenter", "rootView", "Landroid/view/View;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "isAdStateValidOnCanPlay", "Lcom/vungle/ads/VungleError;", "isNativeVideo", "isStartMuted", "isStartMuted$vungle_ads_release", "isStartMutedByServer", "isStartMutedByServer$vungle_ads_release", "isValidAdSize", "adSize", "isValidAdTypeForPlacement", "placement", "Lcom/vungle/ads/internal/model/Placement;", "logViewVisibleOnPlay", "onAdLoaded", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "onImpression", "onImpression$vungle_ads_release", "onPrivacyIconClicked", "openCallToActionUrl", "openCallToActionUrlByUser", "retrieveImageRatio", "retrieveVideoRatio", "showWatermark", "Landroid/view/ViewGroup;", "watermark", "trackOMEvent", a.f62811a, "", "args", "", "", "trackTpatEvent", "value", "trySetTouchListener", "view", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAdInternal extends AdInternal implements NativePresenterDelegate {
    public static final int PLAYBACK_EVENT_CLICK = 8;
    public static final int PLAYBACK_EVENT_COMPLETE = 3;
    public static final int PLAYBACK_EVENT_IMPRESSION = 11;
    public static final int PLAYBACK_EVENT_MUTE = 9;
    public static final int PLAYBACK_EVENT_PAUSE = 2;
    public static final int PLAYBACK_EVENT_PLAY = 1;
    public static final int PLAYBACK_EVENT_QUARTILE_FIRST = 5;
    public static final int PLAYBACK_EVENT_QUARTILE_SECOND = 6;
    public static final int PLAYBACK_EVENT_QUARTILE_START = 4;
    public static final int PLAYBACK_EVENT_QUARTILE_THIRD = 7;
    public static final int PLAYBACK_EVENT_UNMUTE = 10;
    public static final String QUARTILE_START_KEY_DURATION = "OM_KEY_DURATION";
    public static final String QUARTILE_START_KEY_VOLUME = "OM_KEY_VOLUME";
    private static final String TAG = "NativeAdInternal";
    private static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    private static final String TOKEN_APP_ICON = "APP_ICON";
    private static final String TOKEN_APP_NAME = "APP_NAME";
    private static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    private static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    private static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_MAIN_VIDEO = "MAIN_VIDEO";
    private static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    private static final String TOKEN_ORIGINAL_VIDEO_URL = "ORIGINAL_VIDEO_URL";
    private static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    private static final String TOKEN_START_MUTED = "START_MUTED";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    private static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";
    private float aspectRatio;

    /* JADX INFO: renamed from: executors$delegate, reason: from kotlin metadata */
    private final Lazy executors;

    /* JADX INFO: renamed from: imageLoader$delegate, reason: from kotlin metadata */
    private final Lazy imageLoader;

    /* JADX INFO: renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final Lazy impressionTracker;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private final View.OnTouchListener onTouchListener;

    /* JADX INFO: renamed from: platform$delegate, reason: from kotlin metadata */
    private final Lazy platform;
    private NativeAdPresenter presenter;

    /* JADX INFO: renamed from: videoOptions$delegate, reason: from kotlin metadata */
    private final Lazy videoOptions;
    private WatermarkView waterMarkView;

    @VisibleForTesting
    public static /* synthetic */ void getPresenter$vungle_ads_release$annotations() {
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize adSize) {
        return true;
    }

    public final void openCallToActionUrlByUser() {
        trackOMEvent$default(this, 8, null, 2, null);
        openCallToActionUrl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdInternal(final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.impressionTracker = LazyKt.lazy(new Function0<ImpressionTracker>() { // from class: com.vungle.ads.internal.NativeAdInternal$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImpressionTracker invoke() {
                return new ImpressionTracker(context);
            }
        });
        this.isInvisibleLogged = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.platform = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Platform>() { // from class: com.vungle.ads.internal.NativeAdInternal$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Platform invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Platform.class);
            }
        });
        this.executors = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.NativeAdInternal$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Executors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
            }
        });
        this.imageLoader = LazyKt.lazy(new Function0<ImageLoader>() { // from class: com.vungle.ads.internal.NativeAdInternal$imageLoader$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageLoader invoke() {
                ImageLoader companion2 = ImageLoader.INSTANCE.getInstance();
                companion2.init(this.this$0.getExecutors().getIO_EXECUTOR());
                return companion2;
            }
        });
        this.videoOptions = LazyKt.lazy(new Function0<NativeVideoOptions>() { // from class: com.vungle.ads.internal.NativeAdInternal$videoOptions$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NativeVideoOptions invoke() {
                return new NativeVideoOptions();
            }
        });
        this.onTouchListener = new View.OnTouchListener() { // from class: com.vungle.ads.internal.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NativeAdInternal.m222onTouchListener$lambda0(this.f63288n, view, motionEvent);
            }
        };
    }

    private final String getCtaUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Executors getExecutors() {
        return (Executors) this.executors.getValue();
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader.getValue();
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    private final String getOMSDKData() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_OM_SDK_DATA)) == null) ? "" : str;
    }

    private final Platform getPlatform() {
        return (Platform) this.platform.getValue();
    }

    private final String getPrivacyIconUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    private final String getPrivacyUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j2 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j2));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry(), (String) null, 4, (Object) null);
        Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTouchListener$lambda-0, reason: not valid java name */
    public static final boolean m222onTouchListener$lambda0(NativeAdInternal this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter == null) {
            return false;
        }
        nativeAdPresenter.onViewTouched(motionEvent);
        return false;
    }

    @WorkerThread
    private final void retrieveVideoRatio() {
        Object objM313constructorimpl;
        Throwable thM316exceptionOrNullimpl;
        Object objM313constructorimpl2;
        Integer intOrNull;
        Integer intOrNull2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            Context context = getContext();
            Uri uri = Uri.parse(getMainVideoPath$vungle_ads_release());
            Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            int iIntValue = 0;
            int iIntValue2 = (strExtractMetadata == null || (intOrNull2 = StringsKt.toIntOrNull(strExtractMetadata)) == null) ? 0 : intOrNull2.intValue();
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (strExtractMetadata2 != null && (intOrNull = StringsKt.toIntOrNull(strExtractMetadata2)) != null) {
                iIntValue = intOrNull.intValue();
            }
            if (iIntValue2 > 0 && iIntValue > 0) {
                this.aspectRatio = iIntValue2 / iIntValue;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                mediaMetadataRetriever.release();
                objM313constructorimpl2 = Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl2);
            if (thM316exceptionOrNullimpl == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                Logger.INSTANCE.e("NativeAd", "Failed to retrieve video metadata: " + th2.getLocalizedMessage());
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    mediaMetadataRetriever.release();
                    objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th3));
                }
                thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
                if (thM316exceptionOrNullimpl == null) {
                    return;
                }
            } finally {
            }
        }
        Logger.INSTANCE.e(TAG, "Failed to release metadata retriever", thM316exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOMEvent$default(NativeAdInternal nativeAdInternal, int i2, Map map, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            map = null;
        }
        nativeAdInternal.trackOMEvent(i2, map);
    }

    public static /* synthetic */ void trackTpatEvent$default(NativeAdInternal nativeAdInternal, String str, String str2, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        nativeAdInternal.trackTpatEvent(str, str2);
    }

    public final void destroy() {
        WatermarkView watermarkView = this.waterMarkView;
        if (watermarkView != null) {
            ViewParent parent = watermarkView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(watermarkView);
            }
        }
        this.waterMarkView = null;
        getImpressionTracker().destroy();
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_APP_RATING_VALUE)) == null) {
            return null;
        }
        return StringsKt.toDoubleOrNull(str);
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getMainVideoPath$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: getMediaAspectRatio, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getOriginalVideoUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_ORIGINAL_VIDEO_URL)) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: getPresenter$vungle_ads_release, reason: from getter */
    public final NativeAdPresenter getPresenter() {
        return this.presenter;
    }

    public final NativeVideoOptions getVideoOptions$vungle_ads_release() {
        return (NativeVideoOptions) this.videoOptions.getValue();
    }

    public final void initPresenter(View rootView, AdPlayCallback adPlayCallback) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        AdPayload advertisement = getAdvertisement();
        if (advertisement == null) {
            VungleError vungleErrorLogError$vungle_ads_release = new AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release();
            if (adPlayCallback != null) {
                adPlayCallback.onFailure(vungleErrorLogError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.presenter == null) {
            NativeAdPresenter nativeAdPresenter = new NativeAdPresenter(getContext(), this, advertisement, getPlatform());
            this.presenter = nativeAdPresenter;
            nativeAdPresenter.setEventListener(new AdEventListener(adPlayCallback, getPlacement()));
        }
        NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.initAndStartOMTracker(rootView, getOMSDKData());
        }
        getImpressionTracker().addView(rootView, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.internal.NativeAdInternal.initPresenter.1
            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onImpression(View view) throws Throwable {
                Logger.INSTANCE.d(NativeAdInternal.TAG, "ImpressionTracker checked the native ad view become visible.");
                NativeAdInternal.this.onImpression$vungle_ads_release();
                NativeAdInternal.this.logViewVisibleOnPlay();
            }

            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onViewInvisible(View view) throws Throwable {
                if (NativeAdInternal.this.isInvisibleLogged.getAndSet(true)) {
                    return;
                }
                Logger.INSTANCE.d(NativeAdInternal.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, NativeAdInternal.this.getLogEntry(), (String) null, 4, (Object) null);
            }
        });
        NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.prepare();
        }
    }

    public final boolean isStartMutedByServer$vungle_ads_release() {
        String str;
        Boolean booleanStrictOrNull;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_START_MUTED)) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str)) == null) {
            return true;
        }
        return booleanStrictOrNull.booleanValue();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isNative();
    }

    @Override // com.vungle.ads.internal.AdInternal
    @WorkerThread
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        if (hasVideoContent()) {
            retrieveVideoRatio();
        } else {
            retrieveImageRatio();
        }
    }

    @VisibleForTesting
    public final void onImpression$vungle_ads_release() throws Throwable {
        trackTpatEvent$default(this, Constants.CHECKPOINT_0, null, 2, null);
        trackOMEvent$default(this, 11, null, 2, null);
    }

    public final void onPrivacyIconClicked() {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            NativeAdPresenter.processCommand$default(nativeAdPresenter, "openPrivacy", null, getPrivacyUrl(), 2, null);
        }
    }

    public final void openCallToActionUrl() {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            NativeAdPresenter.processCommand$default(nativeAdPresenter, NativeAdPresenter.DOWNLOAD, null, getCtaUrl(), 2, null);
        }
    }

    public final void setPresenter$vungle_ads_release(NativeAdPresenter nativeAdPresenter) {
        this.presenter = nativeAdPresenter;
    }

    public final void showWatermark(ViewGroup rootView, String watermark) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (watermark == null) {
            return;
        }
        if (this.waterMarkView == null) {
            Context context = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "rootView.context");
            this.waterMarkView = new WatermarkView(context, watermark);
        }
        WatermarkView watermarkView = this.waterMarkView;
        if (watermarkView == null || Intrinsics.areEqual(watermarkView.getParent(), rootView)) {
            return;
        }
        ViewParent parent = watermarkView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(watermarkView);
        }
        rootView.addView(watermarkView);
        watermarkView.bringToFront();
    }

    public final void trackOMEvent(int event, Map<String, ? extends Object> args) {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.onOMEvent(event, args);
        }
    }

    public final void trackTpatEvent(String event, String value) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("tpat", event, value);
        }
    }

    public final void trySetTouchListener(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AdPayload advertisement = getAdvertisement();
        if (advertisement == null || !advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        view.setOnTouchListener(this.onTouchListener);
    }

    private final void displayImage(String path, final ImageView imageView) {
        getImageLoader().displayImage(path, new Function1<Bitmap, Unit>() { // from class: com.vungle.ads.internal.NativeAdInternal.displayImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Bitmap it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final ImageView imageView2 = imageView;
                if (imageView2 != null) {
                    ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.NativeAdInternal.displayImage.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            imageView2.setImageBitmap(it);
                        }
                    });
                }
            }
        });
    }

    private final void retrieveImageRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new Function2<Integer, Integer, Unit>() { // from class: com.vungle.ads.internal.NativeAdInternal.retrieveImageRatio.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, int i3) {
                if (i2 <= 0 || i3 <= 0) {
                    return;
                }
                NativeAdInternal.this.aspectRatio = i2 / i3;
            }
        });
    }

    public final void displayAppIcon(ImageView imageView) {
        displayImage(getAppIcon(), imageView);
    }

    public final void displayMainImage(ImageView mainImage) {
        displayImage(getMainImagePath(), mainImage);
    }

    public final void displayPrivacyIcon(ImageView privacyIcon) {
        displayImage(getPrivacyIconUrl(), privacyIcon);
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public String getPlacementRefId() {
        Placement placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    public final boolean hasCallToAction() {
        if (getCtaUrl().length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean hasVideoContent() {
        if (getMainVideoPath$vungle_ads_release().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleError isAdStateValidOnCanPlay() {
        if (getAdState() != AdInternal.AdState.READY && !isAdPlaying$vungle_ads_release()) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, getAdState() + " can not play native ad.");
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public boolean isNativeVideo() {
        return hasVideoContent();
    }

    public final boolean isStartMuted$vungle_ads_release() {
        boolean zIsStartMutedByServer$vungle_ads_release;
        if (!getPlatform().isSilentModeEnabled()) {
            Boolean startMuted = getVideoOptions$vungle_ads_release().getStartMuted();
            if (startMuted != null) {
                zIsStartMutedByServer$vungle_ads_release = startMuted.booleanValue();
            } else {
                zIsStartMutedByServer$vungle_ads_release = isStartMutedByServer$vungle_ads_release();
            }
            if (!zIsStartMutedByServer$vungle_ads_release) {
                return false;
            }
            return true;
        }
        return true;
    }
}
