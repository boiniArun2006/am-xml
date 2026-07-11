package com.vungle.ads.internal.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.safedk.android.utils.h;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.BlackScreenDetector;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.OnSilentModeChangeListener;
import com.vungle.ads.internal.util.ThreadUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.DAz;
import kotlinx.serialization.json.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u009b\u0001\u009c\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fJ \u0010g\u001a\u00020d2\u0006\u0010h\u001a\u00020'2\u0006\u0010i\u001a\u00020'2\u0006\u0010j\u001a\u00020\u0018H\u0002J\u0010\u0010k\u001a\u00020\u00182\u0006\u0010i\u001a\u00020'H\u0002J\u0018\u0010l\u001a\u00020d2\u0006\u0010m\u001a\u00020f2\b\b\u0002\u0010n\u001a\u00020'J\u0016\u0010o\u001a\u00020d2\u0006\u0010p\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020\u000fJ\u0006\u0010r\u001a\u00020dJ\u0010\u0010s\u001a\u00020d2\u0006\u0010t\u001a\u00020\u0018H\u0016J\u0010\u0010u\u001a\u00020d2\u0006\u0010v\u001a\u00020\u0018H\u0016J\u001c\u0010w\u001a\u00020d2\b\u0010x\u001a\u0004\u0018\u00010F2\b\u0010i\u001a\u0004\u0018\u00010'H\u0016J&\u0010y\u001a\u00020d2\b\u0010x\u001a\u0004\u0018\u00010F2\b\u0010z\u001a\u0004\u0018\u00010{2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J+\u0010y\u001a\u00020d2\b\u0010x\u001a\u0004\u0018\u00010F2\u0006\u0010~\u001a\u00020f2\u0006\u0010\u007f\u001a\u00020'2\u0007\u0010\u0080\u0001\u001a\u00020'H\u0017J)\u0010\u0081\u0001\u001a\u00020d2\b\u0010x\u001a\u0004\u0018\u00010F2\b\u0010z\u001a\u0004\u0018\u00010{2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0016J\u001f\u0010\u0084\u0001\u001a\u00020\u00182\b\u0010x\u001a\u0004\u0018\u00010F2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0016J2\u0010\u0087\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0088\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010'2\u0007\u0010\u008a\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b\u008b\u0001J\u001d\u0010\u008c\u0001\u001a\u00020d2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010F2\u0007\u0010\u008e\u0001\u001a\u00020'H\u0002J\u0011\u0010\u008f\u0001\u001a\u00020d2\u0006\u0010=\u001a\u00020\u0018H\u0016J>\u0010\u0090\u0001\u001a\u00020d2\u0007\u0010\u0091\u0001\u001a\u00020\u00182\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010'H\u0016J\u0011\u0010\u0096\u0001\u001a\u00020d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010\u0097\u0001\u001a\u00020d2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0013\u0010\u0098\u0001\u001a\u00020d2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J \u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0083\u00012\b\u0010x\u001a\u0004\u0018\u00010F2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\u001d\u0010\u009a\u0001\u001a\u00020\u00182\b\u0010x\u001a\u0004\u0018\u00010F2\b\u0010i\u001a\u0004\u0018\u00010'H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R&\u00101\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R&\u00105\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u0014\u00109\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R(\u0010=\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010C\u0012\u0004\b>\u0010\u001a\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010DR&\u0010E\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u001a\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR&\u0010L\u001a\u0004\u0018\u00010M8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bN\u0010\u001a\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010V\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bW\u0010\u001a\u001a\u0004\bX\u0010\u001c\"\u0004\bY\u0010\u001eR\u000e\u0010Z\u001a\u00020[X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\\\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b^\u0010\u001a\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006\u009d\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", AppLovinBridge.f61288f, "Lcom/vungle/ads/internal/platform/Platform;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "blackScreenDetector", "Lcom/vungle/ads/internal/util/BlackScreenDetector;", "getBlackScreenDetector", "()Lcom/vungle/ads/internal/util/BlackScreenDetector;", "blackScreenDetector$delegate", "Lkotlin/Lazy;", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", "handler", "Landroid/os/Handler;", "getHandler$vungle_ads_release", "()Landroid/os/Handler;", "isViewable", "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "partialDownloadErrorMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", "ready", "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleBlackScreenDetection", "", "samplingFactor", "", "handleWebViewError", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyBlackScreenResult", "percentage", "errorMessage", "notifyDiskAvailableSize", "availableDiskSize", "appFolderSize", "notifyPresentAppStoreFailed", "notifyPropertiesChange", "skipCmdQueue", "notifySilentModeChange", "silentModeEnabled", "onPageFinished", "view", "onReceivedError", AdActivity.REQUEST_KEY_EXTRA, "Landroid/webkit/WebResourceRequest;", MRAIDPresenter.ERROR, "Landroid/webkit/WebResourceError;", "errorCode", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "parseRange", "Lkotlin/Pair;", "rangeHeader", "contentLength", "parseRange$vungle_ads_release", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", "message", "accept", "deny", "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldInterceptRequest", "shouldOverrideUrlLoading", "Companion", "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleWebClient extends WebViewClient implements WebViewAPI, OnSilentModeChangeListener {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;

    /* JADX INFO: renamed from: blackScreenDetector$delegate, reason: from kotlin metadata */
    private final Lazy blackScreenDetector;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private final Handler handler;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    @RequiresApi
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
        }

        public void onRenderProcessUnresponsive(final WebView webView, final WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Logger.INSTANCE.w(VungleWebClient.TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderProcessUnresponsive(Title = ");
                    sb.append(webView.getTitle());
                    sb.append(", URL = ");
                    sb.append(webView.getOriginalUrl());
                    sb.append(", (webViewRenderProcess != null) = ");
                    sb.append(webViewRenderProcess != null);
                    return sb.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i2 & 8) != 0 ? null : platform, (i2 & 16) != 0 ? null : preloadDelegate, (i2 & 32) != 0 ? null : l2);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.f63164d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63164d, view, url);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63164d, view, errorCode, description, failingUrl);
        safedk_VungleWebClient_onReceivedError_b75d46f59d3c255bf15d937c49583423(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63164d, view, request, error);
        safedk_VungleWebClient_onReceivedError_a84058a98d6f31e02ab86ec168a4c161(view, request, error);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(final WebView view, final RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderProcessGone url: ");
                    WebView webView = view;
                    sb.append(webView != null ? webView.getUrl() : null);
                    return sb.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, Boolean.TRUE);
            }
            return true;
        }
        Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("onRenderProcessGone url: ");
                WebView webView = view;
                sb.append(webView != null ? webView.getUrl() : null);
                sb.append(", did crash: ");
                RenderProcessGoneDetail renderProcessGoneDetail = detail;
                sb.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                return sb.toString();
            }
        });
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Deprecated(message = "Deprecated in Java")
    public void safedk_VungleWebClient_onReceivedError_b75d46f59d3c255bf15d937c49583423(WebView p0, int p1, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(p0, p1, description, failingUrl);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.f63164d, view, request, safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(view, request));
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb = safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63164d, view, url, zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb);
        return zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb;
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, Platform platform, PreloadDelegate preloadDelegate, Long l2) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l2;
        this.blackScreenDetector = LazyKt.lazy(new Function0<BlackScreenDetector>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$blackScreenDetector$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BlackScreenDetector invoke() {
                return new BlackScreenDetector();
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    private final BlackScreenDetector getBlackScreenDetector() {
        return (BlackScreenDetector) this.blackScreenDetector.getValue();
    }

    private final void handleWebViewError(String errorMsg, String url, boolean didCrash) {
        String str = url + ' ' + errorMsg;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(VungleWebClient vungleWebClient, int i2, String str, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            str = "";
        }
        vungleWebClient.notifyBlackScreenResult(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m277notifyPropertiesChange$lambda25(boolean z2, final VungleWebClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DAz dAz = new DAz();
        kotlinx.serialization.json.aC.t(dAz, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            kotlinx.serialization.json.aC.n(dAz, "isViewable", bool);
        }
        kotlinx.serialization.json.aC.t(dAz, "os", AppLovinBridge.f61290h);
        kotlinx.serialization.json.aC.t(dAz, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        kotlinx.serialization.json.aC.n(dAz, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            kotlinx.serialization.json.aC.n(dAz, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        if (this$0.loadDuration != null) {
            kotlinx.serialization.json.aC.rl(dAz, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            kotlinx.serialization.json.aC.n(dAz, "consentRequired", Boolean.TRUE);
            kotlinx.serialization.json.aC.t(dAz, "consentTitleText", this$0.gdprTitle);
            kotlinx.serialization.json.aC.t(dAz, "consentBodyText", this$0.gdprBody);
            kotlinx.serialization.json.aC.t(dAz, "consentAcceptButtonText", this$0.gdprAccept);
            kotlinx.serialization.json.aC.t(dAz, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            kotlinx.serialization.json.aC.n(dAz, "consentRequired", Boolean.FALSE);
        }
        kotlinx.serialization.json.aC.t(dAz, "sdkVersion", BuildConfig.VERSION_NAME);
        final String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + dAz.n() + ',' + z2 + ')';
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.CN3
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m278notifyPropertiesChange$lambda25$lambda24(this.f63310n, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m278notifyPropertiesChange$lambda25$lambda24(VungleWebClient this$0, String injectJs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(injectJs, "$injectJs");
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, injectJs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runJavascriptOnWebView(WebView webView, final String injectJs) {
        try {
            Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.runJavascriptOnWebView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "mraid Injecting JS " + injectJs;
                }
            });
            if (webView != null) {
                LiftoffMonetizeNetworkBridge.webViewEvaluateJavaScript(webView, injectJs, null);
            }
        } catch (Throwable th) {
            new EvaluateJsError("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m279shouldOverrideUrlLoading$lambda16$lambda10(final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.Wre
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m280shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f63320n, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m280shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m281shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m282shouldOverrideUrlLoading$lambda16$lambda15$lambda14(WebViewAPI.MraidDelegate it, String command, nKK args, final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.aC
                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m283shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f63322n, webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m283shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m284shouldOverrideUrlLoading$lambda16$lambda6(final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final String str = "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')';
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.fuX
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m285shouldOverrideUrlLoading$lambda16$lambda6$lambda5(this.f63325n, webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m285shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient this$0, WebView webView, String injectJs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(injectJs, "$injectJs");
        this$0.runJavascriptOnWebView(webView, injectJs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m286shouldOverrideUrlLoading$lambda16$lambda8(final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.I28
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m287shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f63314n, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m287shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    /* JADX INFO: renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    /* JADX INFO: renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    /* JADX INFO: renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    /* JADX INFO: renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    /* JADX INFO: renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    /* JADX INFO: renamed from: getHandler$vungle_ads_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    /* JADX INFO: renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    /* JADX INFO: renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    /* JADX INFO: renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    /* JADX INFO: renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void notifyBlackScreenResult(final int percentage, String errorMessage) throws Throwable {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.notifyBlackScreenResult.1
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
                WebView loadedWebView = VungleWebClient.this.getLoadedWebView();
                if (loadedWebView != null) {
                    int i2 = percentage;
                    VungleWebClient.this.runJavascriptOnWebView(loadedWebView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i2 + ')');
                }
            }
        });
        Logger.INSTANCE.d(TAG, "Returning black screen result: " + percentage + '%');
        if (percentage >= 0) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, percentage, this.advertisement.getLogEntry(), null, 8, null);
        } else {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry());
        }
    }

    public final void notifyDiskAvailableSize(long availableDiskSize, long appFolderSize) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + availableDiskSize + '-' + appFolderSize + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean skipCmdQueue) {
        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m277notifyPropertiesChange$lambda25(skipCmdQueue, this);
            }
        });
    }

    @Override // com.vungle.ads.internal.util.OnSilentModeChangeListener
    public void notifySilentModeChange(boolean silentModeEnabled) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            DAz dAz = new DAz();
            kotlinx.serialization.json.aC.n(dAz, "isSilent", Boolean.valueOf(silentModeEnabled));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + dAz.n() + ')');
        }
    }

    public final Pair<Long, Long> parseRange$vungle_ads_release(String rangeHeader, long contentLength) {
        Object objM313constructorimpl;
        Pair pair;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (rangeHeader == null || !StringsKt.startsWith$default(rangeHeader, "bytes=", false, 2, (Object) null)) {
                pair = new Pair(0L, null);
            } else {
                List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(rangeHeader, (CharSequence) "bytes="), new String[]{"-"}, false, 0, 6, (Object) null);
                String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
                Long longOrNull = str != null ? StringsKt.toLongOrNull(str) : null;
                String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
                Long longOrNull2 = str2 != null ? StringsKt.toLongOrNull(str2) : null;
                if (longOrNull == null) {
                    if (longOrNull2 == null) {
                        longOrNull = 0L;
                    } else {
                        longOrNull = Long.valueOf(contentLength - longOrNull2.longValue());
                        longOrNull2 = null;
                    }
                }
                pair = new Pair(longOrNull, longOrNull2);
            }
            objM313constructorimpl = Result.m313constructorimpl(pair);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null) {
            objM313constructorimpl = new Pair(0L, null);
        }
        return (Pair) objM313constructorimpl;
    }

    public void safedk_VungleWebClient_onReceivedError_a84058a98d6f31e02ab86ec168a4c161(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        String strValueOf = String.valueOf(p2 != null ? p2.getDescription() : null);
        String strValueOf2 = String.valueOf(p1 != null ? p1.getUrl() : null);
        boolean z2 = false;
        boolean z3 = p1 != null && p1.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Error desc " + strValueOf + ' ' + z3 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z3) {
            z2 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z2);
    }

    public WebResourceResponse safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(WebView p0, WebResourceRequest p1) {
        Uri url = p1 != null ? p1.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!Intrinsics.areEqual(lowerCase, g.f62375e) && !Intrinsics.areEqual(lowerCase, "https")) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "shouldInterceptRequest called but partial download is disabled.";
                        }
                    });
                    return null;
                }
                String string = url.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                if (localPath == null || localPath.length() == 0) {
                    return null;
                }
                File file = new File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length = file.length();
                final String str = p1.getRequestHeaders().get("Range");
                this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
                localPartialDownloadAssets.setRangeStart(range$vungle_ads_release.getFirst().longValue());
                localPartialDownloadAssets.setRangeEnd(range$vungle_ads_release.getSecond());
                long jLongValue = range$vungle_ads_release.component1().longValue();
                Long lComponent2 = range$vungle_ads_release.component2();
                long j2 = length - jLongValue;
                Logger.Companion companion = Logger.INSTANCE;
                companion.i(TAG, ">>request: " + url + " rangeStart=" + jLongValue + " rangeEnd=" + lComponent2 + " cachedFileLength=" + length + " availableBytes=" + j2 + " contentLength=" + contentLength + ' ');
                if (j2 <= 0) {
                    companion.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Requested range exceeds cached file: " + str;
                        }
                    });
                    localPartialDownloadAssets.waitForDownload();
                    length = file.length();
                }
                long jLongValue2 = lComponent2 != null ? lComponent2.longValue() : length - 1;
                long j3 = (jLongValue2 - jLongValue) + 1;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    FileInputStream fileInputStream = new FileInputStream(file);
                    WebResourceResponse webResourceResponse = new WebResourceResponse(localPartialDownloadAssets.getMimeType(), com.google.android.exoplayer2.C.UTF8_NAME, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", localPartialDownloadAssets.getMimeType()), TuplesKt.to("Accept-Ranges", "bytes"), TuplesKt.to("Content-Length", String.valueOf(j3)), TuplesKt.to("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(fileInputStream, 1024));
                    StringBuilder sb = new StringBuilder();
                    sb.append("<<Return:");
                    sb.append(webResourceResponse.getResponseHeaders());
                    companion.i(TAG, sb.toString());
                    return webResourceResponse;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(Result.m313constructorimpl(ResultKt.createFailure(th)));
                    if (thM316exceptionOrNullimpl == null) {
                        return null;
                    }
                    Logger.INSTANCE.e(TAG, "Error serving local range video: " + thM316exceptionOrNullimpl.getMessage(), thM316exceptionOrNullimpl);
                    this.partialDownloadErrorMetric.setMeta(string + ' ' + thM316exceptionOrNullimpl.getMessage());
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f7, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0024, B:10:0x0033, B:13:0x003c, B:15:0x0049, B:17:0x004f, B:43:0x00ab, B:48:0x00bc, B:49:0x00c9, B:53:0x00e2, B:37:0x0092), top: B:81:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:25:0x0063, B:28:0x006c, B:45:0x00af, B:51:0x00cf, B:32:0x007e, B:35:0x0087, B:39:0x009a, B:41:0x009e), top: B:83:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    @Deprecated(message = "Deprecated in Java")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(final WebView p0, final String p1) {
        WebView p02;
        VungleWebClient vungleWebClient;
        final WebViewAPI.MraidDelegate mraidDelegate;
        try {
            Logger.Companion companion = Logger.INSTANCE;
            companion.d(TAG, "MRAID Command " + p1);
            try {
                if (p1 == null || p1.length() == 0) {
                    companion.e(TAG, "Invalid URL ");
                    return false;
                }
                Uri uri = Uri.parse(p1);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
                String scheme = uri.getScheme();
                if (scheme == null || scheme.length() == 0) {
                    return false;
                }
                String scheme2 = uri.getScheme();
                if (!Intrinsics.areEqual(scheme2, CreativeInfo.f62459w)) {
                    vungleWebClient = this;
                    if (!StringsKt.equals(g.f62375e, scheme2, true)) {
                        if (StringsKt.equals("https", scheme2, true)) {
                        }
                    }
                    companion.d(TAG, "Open URL" + p1);
                    WebViewAPI.MraidDelegate mraidDelegate2 = vungleWebClient.mraidDelegate;
                    if (mraidDelegate2 != null) {
                        DAz dAz = new DAz();
                        kotlinx.serialization.json.aC.t(dAz, "url", p1);
                        mraidDelegate2.processCommand("openNonMraid", dAz.n());
                    }
                    return true;
                }
                final String host = uri.getHost();
                if (host != null) {
                    int iHashCode = host.hashCode();
                    try {
                        if (iHashCode != -1943542072) {
                            if (iHashCode != 88409791) {
                                if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                                    this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.o
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VungleWebClient.m286shouldOverrideUrlLoading$lambda16$lambda8(this.f63328n, p0);
                                        }
                                    });
                                } else {
                                    mraidDelegate = this.mraidDelegate;
                                    if (mraidDelegate != null) {
                                        this.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.w6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                VungleWebClient.m281shouldOverrideUrlLoading$lambda16$lambda11(this.f63344n, p0);
                                            }
                                        });
                                        return true;
                                    }
                                    if (mraidDelegate != null) {
                                        DAz dAz2 = new DAz();
                                        for (String param : uri.getQueryParameterNames()) {
                                            Intrinsics.checkNotNullExpressionValue(param, "param");
                                            kotlinx.serialization.json.aC.t(dAz2, param, uri.getQueryParameter(param));
                                        }
                                        final nKK nkkN = dAz2.n();
                                        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.Ml
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                VungleWebClient.m282shouldOverrideUrlLoading$lambda16$lambda15$lambda14(mraidDelegate, host, nkkN, this, p0);
                                            }
                                        });
                                    }
                                }
                            } else if (host.equals("failToLoad")) {
                                this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.qz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m279shouldOverrideUrlLoading$lambda16$lambda10(this.f63330n, p0);
                                    }
                                });
                            } else {
                                mraidDelegate = this.mraidDelegate;
                                if (mraidDelegate != null) {
                                }
                            }
                        } else if (host.equals("propertiesChangeCompleted")) {
                            if (!this.ready) {
                                this.ready = true;
                                this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.C
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m284shouldOverrideUrlLoading$lambda16$lambda6(this.f63308n, p0);
                                    }
                                });
                            }
                        }
                        return true;
                    } catch (Throwable th) {
                        p02 = th;
                    }
                } else {
                    vungleWebClient = this;
                }
                vungleWebClient.skippedUrlMetric.setMeta("url: " + p1);
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, vungleWebClient.skippedUrlMetric, vungleWebClient.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                companion.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldOverrideUrlLoading.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "skipped url: " + p1;
                    }
                });
                return false;
            } catch (Throwable th2) {
                th = th2;
                p02 = th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        p02 = th;
        if (p02 instanceof OutOfMemoryError) {
            new OutOfMemory("mraid:" + p1).logErrorNoReturnValue$vungle_ads_release();
        }
        return false;
    }

    public final void setCollectConsent$vungle_ads_release(boolean z2) {
        this.collectConsent = z2;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, String title, String message, String accept, String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z2) {
        this.ready = z2;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    public final void handleBlackScreenDetection(int samplingFactor) {
        getBlackScreenDetector().start(this.loadedWebView, samplingFactor, new Function2<Integer, String, Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.handleBlackScreenDetection.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) throws Throwable {
                invoke(num.intValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, String errorMessage) throws Throwable {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                VungleWebClient.this.notifyBlackScreenResult(i2, errorMessage);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Logger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onPageFinished.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "onPageFinished.";
            }
        });
        if (view != null) {
            this.loadedWebView = view;
            view.setVisibility(0);
            notifyPropertiesChange(true);
            if (Build.VERSION.SDK_INT >= 29) {
                view.setWebViewRenderProcessClient(n.n(new VungleWebViewRenderProcessClient(this.errorHandler)));
            }
            WebViewObserver webViewObserver = this.webViewObserver;
            if (webViewObserver != null) {
                webViewObserver.onPageFinished(view);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Integer numValueOf;
        boolean z2;
        super.onReceivedHttpError(view, request, errorResponse);
        Uri url = null;
        if (errorResponse != null) {
            numValueOf = Integer.valueOf(errorResponse.getStatusCode());
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        if (request != null) {
            url = request.getUrl();
        }
        String strValueOf2 = String.valueOf(url);
        boolean z3 = false;
        if (request != null && request.isForMainFrame()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Logger.INSTANCE.e(TAG, "Http Error desc " + strValueOf + ' ' + z2 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z2) {
            z3 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z3);
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = Boolean.valueOf(isViewable);
        notifyPropertiesChange(false);
    }
}
