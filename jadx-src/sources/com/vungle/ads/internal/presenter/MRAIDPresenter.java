package com.vungle.ads.internal.presenter;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import XA.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c8G.Fsz.qwlyMfUJj;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.HeartbeatMissingError;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.InvalidCTAUrl;
import com.vungle.ads.LinkError;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.JsonUtil;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.SuspendableTimer;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.Utils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.n;
import kotlinx.serialization.json.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Ð\u00012\u00020\u00012\u00020\u0002:\u0002Ð\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(J+\u0010,\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010*\u001a\u00020\u001d2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0019\u00108\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0004\b6\u00107J\u0019\u0010=\u001a\u00020\u00132\b\u0010:\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b;\u0010<J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010\u0015J\r\u0010?\u001a\u00020\u0013¢\u0006\u0004\b?\u0010\u0015J\r\u0010@\u001a\u00020\u0013¢\u0006\u0004\b@\u0010\u0015J\u0017\u0010C\u001a\u00020\u00132\b\b\u0001\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001d¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00132\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0013¢\u0006\u0004\bL\u0010\u0015J%\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00170O2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QJ\u001b\u0010T\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\bS\u0010\"J\u000f\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bV\u0010WJ\u001f\u0010[\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010_\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u001dH\u0016¢\u0006\u0004\b_\u0010`J#\u0010c\u001a\u00020\u001d2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010^\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bc\u0010dJ#\u0010h\u001a\u00020\u00132\b\u0010e\u001a\u0004\u0018\u00010a2\b\u0010g\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u0013¢\u0006\u0004\bj\u0010\u0015J\u000f\u0010m\u001a\u00020\u001dH\u0000¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010oR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010pR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010qR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010rR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010sR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010tR(\u0010u\u001a\u00020U8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bu\u0010v\u0012\u0004\b{\u0010\u0015\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR,\u0010|\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b|\u0010}\u0012\u0005\b\u0081\u0001\u0010\u0015\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u00103R\u0019\u0010\u0082\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R'\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0005\b\u0089\u0001\u0010\u0015\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R1\u0010\u008b\u0001\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u0012\u0005\b\u0090\u0001\u0010\u0015\u001a\u0005\b\u008d\u0001\u0010W\"\u0006\b\u008e\u0001\u0010\u008f\u0001R1\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0096\u0001\u0010\u0015\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0005\b\u0095\u0001\u0010\"R!\u0010\u009c\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R!\u0010¡\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0099\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¦\u0001\u001a\u00030¢\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0099\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010«\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0099\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u0019\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010¬\u0001R\u0019\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010\u00ad\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0099\u0001\u001a\u0006\b°\u0001\u0010±\u0001R#\u0010·\u0001\u001a\u0005\u0018\u00010³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010\u0099\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R.\u0010¸\u0001\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\b¸\u0001\u0010\u0083\u0001\u0012\u0005\b»\u0001\u0010\u0015\u001a\u0005\b¹\u0001\u0010l\"\u0005\bº\u0001\u0010GR(\u0010Á\u0001\u001a\u00030¼\u00018@X\u0081\u0084\u0002¢\u0006\u0017\n\u0006\b½\u0001\u0010\u0099\u0001\u0012\u0005\bÀ\u0001\u0010\u0015\u001a\u0006\b¾\u0001\u0010¿\u0001R.\u0010Â\u0001\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\bÂ\u0001\u0010\u0083\u0001\u0012\u0005\bÅ\u0001\u0010\u0015\u001a\u0005\bÃ\u0001\u0010l\"\u0005\bÄ\u0001\u0010GR(\u0010Ë\u0001\u001a\u00030Æ\u00018@X\u0081\u0084\u0002¢\u0006\u0017\n\u0006\bÇ\u0001\u0010\u0099\u0001\u0012\u0005\bÊ\u0001\u0010\u0015\u001a\u0006\bÈ\u0001\u0010É\u0001R-\u0010Ì\u0001\u001a\u00020U8\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\bÌ\u0001\u0010v\u0012\u0005\bÏ\u0001\u0010\u0015\u001a\u0005\bÍ\u0001\u0010x\"\u0005\bÎ\u0001\u0010z¨\u0006Ñ\u0001"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "adWidget", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "vungleWebClient", "Ljava/util/concurrent/Executor;", "executor", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "omTracker", "Lcom/vungle/ads/internal/platform/Platform;", AppLovinBridge.f61288f, "<init>", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/ui/VungleWebClient;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/omsdk/OMTracker;Lcom/vungle/ads/internal/platform/Platform;)V", "", "sendAdCloseEvent", "()V", "closeView", "", "deeplinkUrl", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "createDeeplinkCallback", "(Ljava/lang/String;)Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "url", "", "launchInlineInstall", "(Ljava/lang/String;)Z", "message", "logInlineInstallFailure", "(Ljava/lang/String;)V", "key", "triggerEventMetricForTpat", "Lcom/vungle/ads/VungleError;", JavetError.PARAMETER_REASON, "makeBusError", "(Lcom/vungle/ads/VungleError;)V", "reportErrorAndCloseAd", "fatal", "errorMessage", "handleWebViewException", "(Lcom/vungle/ads/VungleError;ZLjava/lang/String;)V", "loadMraidAd", "()Lcom/vungle/ads/VungleError;", "Lcom/vungle/ads/internal/presenter/AdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setEventListener", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "presenterDelegate", "setPresenterDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/PresenterDelegate;)V", "setPresenterDelegate", "Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "appStoreDelegate", "setOpenActivityDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;)V", "setOpenActivityDelegate", "onViewConfigurationChanged", TtmlNode.START, "stop", "", "stopReason", "detach", "(I)V", "isViewable", "setAdVisibility", "(Z)V", "Landroid/view/MotionEvent;", a.f62811a, "onViewTouched", "(Landroid/view/MotionEvent;)V", "handleExit", "Landroid/content/Intent;", "intent", "Lkotlin/Pair;", "checkInlineInstallIntent$vungle_ads_release", "(Landroid/content/Intent;)Lkotlin/Pair;", "checkInlineInstallIntent", "logInlineInstallSuccess$vungle_ads_release", "logInlineInstallSuccess", "", "getViewStatus", "()Ljava/lang/Long;", "command", "Lkotlinx/serialization/json/nKK;", "arguments", "processCommand", "(Ljava/lang/String;Lkotlinx/serialization/json/nKK;)Z", "errorDesc", "didCrash", "onReceivedError", "(Ljava/lang/String;Z)V", "Landroid/webkit/WebView;", "view", "onWebRenderingProcessGone", "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "webView", "Landroid/webkit/WebViewRenderProcess;", "webViewRenderProcess", "onRenderProcessUnresponsive", "(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcess;)V", "prepare", "shouldBlockAutoRedirect$vungle_ads_release", "()Z", "shouldBlockAutoRedirect", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "Lcom/vungle/ads/internal/model/AdPayload;", "Lcom/vungle/ads/internal/model/Placement;", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "Ljava/util/concurrent/Executor;", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "Lcom/vungle/ads/internal/platform/Platform;", "lastUserInteractionTimestamp", "J", "getLastUserInteractionTimestamp$vungle_ads_release", "()J", "setLastUserInteractionTimestamp$vungle_ads_release", "(J)V", "getLastUserInteractionTimestamp$vungle_ads_release$annotations", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getBus", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setBus", "getBus$annotations", "cp0Fired", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release$annotations", "sendReportIncentivized", "adStartTime", "Ljava/lang/Long;", "getAdStartTime$vungle_ads_release", "setAdStartTime$vungle_ads_release", "(Ljava/lang/Long;)V", "getAdStartTime$vungle_ads_release$annotations", "userId", "Ljava/lang/String;", "getUserId$vungle_ads_release", "()Ljava/lang/String;", "setUserId$vungle_ads_release", "getUserId$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "Lkotlin/Lazy;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider$delegate", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler$delegate", "getScheduler", "()Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "heartbeatEnabled", "getHeartbeatEnabled$vungle_ads_release", "setHeartbeatEnabled$vungle_ads_release", "getHeartbeatEnabled$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/util/SuspendableTimer;", "suspendableTimer$delegate", "getSuspendableTimer$vungle_ads_release", "()Lcom/vungle/ads/internal/util/SuspendableTimer;", "getSuspendableTimer$vungle_ads_release$annotations", "suspendableTimer", "backEnabled", "getBackEnabled$vungle_ads_release", "setBackEnabled$vungle_ads_release", "getBackEnabled$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "clickCoordinateTracker$delegate", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "clickCoordinateTracker", MRAIDPresenter.VIDEO_LENGTH, "getVideoLength$vungle_ads_release", "setVideoLength$vungle_ads_release", "getVideoLength$vungle_ads_release$annotations", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final String DETECT_BLACK_SCREEN = "detectBlackScreen";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_APP_STORE = "openAppStore";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private OpenActivityDelegate appStoreDelegate;
    private boolean backEnabled;
    private AdEventListener bus;

    /* JADX INFO: renamed from: clickCoordinateTracker$delegate, reason: from kotlin metadata */
    private final Lazy clickCoordinateTracker;
    private boolean cp0Fired;
    private Executor executor;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;

    /* JADX INFO: renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final Lazy logEntry;
    private final OMTracker omTracker;

    /* JADX INFO: renamed from: pathProvider$delegate, reason: from kotlin metadata */
    private final Lazy pathProvider;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;

    /* JADX INFO: renamed from: scheduler$delegate, reason: from kotlin metadata */
    private final Lazy scheduler;
    private final AtomicBoolean sendReportIncentivized;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;

    /* JADX INFO: renamed from: suspendableTimer$delegate, reason: from kotlin metadata */
    private final Lazy suspendableTimer;

    /* JADX INFO: renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final Lazy tpatSender;
    private String userId;
    private long videoLength;

    /* JADX INFO: renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final Lazy vungleApiClient;
    private final VungleWebClient vungleWebClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = MapsKt.mapOf(TuplesKt.to(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), TuplesKt.to(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0016\u0010\u0011\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0002R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0002R\u0016\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0002R\u0016\u0010\u001d\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0002R\u0016\u0010\u001f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0002R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u0002R\u0016\u0010$\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0002R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b)\u0010\u0002R(\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,0+8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter$Companion;", "", "()V", "ACTION", "", "ACTION_WITH_VALUE", "getACTION_WITH_VALUE$vungle_ads_release$annotations", "CLOSE", "getCLOSE$vungle_ads_release$annotations", "CONSENT_ACTION", "getCONSENT_ACTION$vungle_ads_release$annotations", "CREATIVE_HEARTBEAT", "getCREATIVE_HEARTBEAT$vungle_ads_release$annotations", "DETECT_BLACK_SCREEN", "getDETECT_BLACK_SCREEN$vungle_ads_release$annotations", "ERROR", "getERROR$vungle_ads_release$annotations", "GET_AVAILABLE_DISK_SPACE", "getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations", "HEARTBEAT_INTERVAL", "", "OPEN", "getOPEN$vungle_ads_release$annotations", "OPEN_APP_STORE", "OPEN_NON_MRAID", "OPEN_PRIVACY", "getOPEN_PRIVACY$vungle_ads_release$annotations", "PING_URL", "getPING_URL$vungle_ads_release$annotations", "SET_ORIENTATION_PROPERTIES", "getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations", "SUCCESSFUL_VIEW", "getSUCCESSFUL_VIEW$vungle_ads_release$annotations", "TAG", "TPAT", "getTPAT$vungle_ads_release$annotations", "UPDATE_SIGNALS", "getUPDATE_SIGNALS$vungle_ads_release$annotations", "USE_CUSTOM_CLOSE", "USE_CUSTOM_PRIVACY", "VIDEO_LENGTH", "getVIDEO_LENGTH$vungle_ads_release$annotations", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDETECT_BLACK_SCREEN$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        private Companion() {
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBus$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView view, Boolean didCrash) {
        boolean zBooleanValue = didCrash != null ? didCrash.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025f, code lost:
    
        if (r26.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0263, code lost:
    
        r0 = r25.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0269, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026b, code lost:
    
        r12 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026f, code lost:
    
        r0 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r27, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027b, code lost:
    
        if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(r0) != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x027d, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r0 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a7, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02a9, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c4, code lost:
    
        r25.lastUserInteractionTimestamp = 0;
        r19 = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
        r2 = r25.adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "adWidget.context");
        r0 = r19.launch$vungle_ads_release(r12, r0, r2, getLogEntry(), createDeeplinkCallback(r12));
        r2 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e7, code lost:
    
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e9, code lost:
    
        r2.onNext("open", "adClick", r25.placement.getReferenceId());
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02f4, code lost:
    
        if (r0 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f6, code lost:
    
        r0 = r25.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f8, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02fa, code lost:
    
        r0.onNext("open", "adLeftApplication", r25.placement.getReferenceId());
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024a, code lost:
    
        if (r26.equals("open") == false) goto L253;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0695  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean processCommand(String command, nKK arguments) throws Throwable {
        int iIntValue;
        Integer intOrNull;
        Object objM313constructorimpl;
        String upperCase;
        boolean z2;
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        String deeplinkUrl = null;
        switch (command.hashCode()) {
            case -1988620632:
                if (command.equals(DETECT_BLACK_SCREEN)) {
                    String contentStringValue = JsonUtil.INSTANCE.getContentStringValue(arguments, "samplingFactor");
                    if (contentStringValue == null || (intOrNull = StringsKt.toIntOrNull(contentStringValue)) == null) {
                        iIntValue = 100;
                    } else {
                        Integer num = intOrNull.intValue() > 0 ? intOrNull : null;
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                    }
                    this.vungleWebClient.handleBlackScreenDetection(iIntValue);
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1912374177:
                if (command.equals(SUCCESSFUL_VIEW)) {
                    AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext(SUCCESSFUL_VIEW, null, this.placement.getReferenceId());
                        Unit unit = Unit.INSTANCE;
                    }
                    if (this.placement.isRewardedVideo() && ConfigManager.INSTANCE.isReportIncentivizedEnabled() && !this.sendReportIncentivized.getAndSet(true)) {
                        this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                MRAIDPresenter.m258processCommand$lambda11(this.f63302n);
                            }
                        });
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1422950858:
                if (command.equals("action")) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -735200587:
                if (command.equals(ACTION_WITH_VALUE)) {
                    JsonUtil jsonUtil = JsonUtil.INSTANCE;
                    String contentStringValue2 = jsonUtil.getContentStringValue(arguments, a.f62811a);
                    String contentStringValue3 = jsonUtil.getContentStringValue(arguments, "value");
                    if (StringsKt.equals(VIDEO_LENGTH, contentStringValue2, true)) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM313constructorimpl = Result.m313constructorimpl(contentStringValue3 != null ? Long.valueOf(Long.parseLong(contentStringValue3)) : null);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                        }
                        Long l2 = (Long) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
                        this.videoLength = l2 != null ? l2.longValue() : 0L;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -660787472:
                if (command.equals(CONSENT_ACTION)) {
                    String contentStringValue4 = JsonUtil.INSTANCE.getContentStringValue(arguments, a.f62811a);
                    PrivacyConsent privacyConsent = PrivacyConsent.OPT_OUT;
                    PrivacyManager.INSTANCE.updateGdprConsent(Intrinsics.areEqual(contentStringValue4, privacyConsent.getValue()) ? privacyConsent.getValue() : PrivacyConsent.OPT_IN.getValue(), "vungle_modal", null);
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -649897046:
                if (command.equals(OPEN_APP_STORE)) {
                    AdPayload.AdUnit adUnit = this.advertisement.adUnit();
                    String deeplinkUrl2 = adUnit != null ? adUnit.getDeeplinkUrl() : null;
                    String contentStringValue5 = JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                    if (!FileUtility.INSTANCE.isValidUrl(contentStringValue5)) {
                        new InvalidCTAUrl("Invalid InlineInstall Url (" + contentStringValue5 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    this.lastUserInteractionTimestamp = System.currentTimeMillis();
                    ExternalRouter externalRouter = ExternalRouter.INSTANCE;
                    Context context = this.adWidget.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
                    boolean zLaunch$vungle_ads_release = externalRouter.launch$vungle_ads_release(deeplinkUrl2, null, context, getLogEntry(), createDeeplinkCallback(deeplinkUrl2));
                    if (!zLaunch$vungle_ads_release) {
                        zLaunch$vungle_ads_release = launchInlineInstall(contentStringValue5);
                    }
                    if (zLaunch$vungle_ads_release) {
                        AdEventListener adEventListener2 = this.bus;
                        if (adEventListener2 != null) {
                            adEventListener2.onNext("open", "adClick", this.placement.getReferenceId());
                            Unit unit2 = Unit.INSTANCE;
                        }
                        AdEventListener adEventListener3 = this.bus;
                        if (adEventListener3 != null) {
                            adEventListener3.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -568000867:
                if (command.equals(PING_URL)) {
                    JsonUtil jsonUtil2 = JsonUtil.INSTANCE;
                    String contentStringValue6 = jsonUtil2.getContentStringValue(arguments, "requestType");
                    if (contentStringValue6 != null) {
                        upperCase = contentStringValue6.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    } else {
                        upperCase = null;
                    }
                    if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"GET", "POST"}), upperCase)) {
                        new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, "Invalid request type: " + upperCase + ". Only 'GET' and 'POST' are supported").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    } else {
                        String contentStringValue7 = jsonUtil2.getContentStringValue(arguments, "url");
                        String contentStringValue8 = jsonUtil2.getContentStringValue(arguments, "requestData");
                        boolean z3 = Boolean.parseBoolean(jsonUtil2.getContentStringValue(arguments, "retry"));
                        String contentStringValue9 = jsonUtil2.getContentStringValue(arguments, "headers");
                        if (contentStringValue9 != null) {
                            try {
                                n.j jVar = kotlinx.serialization.json.n.nr;
                                DGv.Ml mlN = jVar.n();
                                z2 = true;
                                try {
                                    KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
                                    XA.Ml mlRl = r.rl(mlN, Reflection.typeOf(Map.class, companion3.invariant(Reflection.typeOf(String.class)), companion3.invariant(Reflection.typeOf(String.class))));
                                    Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                                    map = (Map) jVar.t(mlRl, contentStringValue9);
                                } catch (Exception unused) {
                                    new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, "Failed to decode header: " + contentStringValue9).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                    return z2;
                                }
                            } catch (Exception unused2) {
                                z2 = true;
                            }
                        } else {
                            z2 = true;
                            map = null;
                        }
                        if (!Utils.INSTANCE.isUrlValid(contentStringValue7)) {
                            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        } else if (contentStringValue7 != null) {
                            TpatRequest.Builder builderWithLogEntry = new TpatRequest.Builder(contentStringValue7).headers(map).body(contentStringValue8).regularRetry(z3).tpatKey(PING_URL).withLogEntry(getLogEntry());
                            if (Intrinsics.areEqual(upperCase, "GET")) {
                                builderWithLogEntry.get();
                            } else {
                                builderWithLogEntry.post();
                            }
                            Unit unit4 = Unit.INSTANCE;
                            TpatSender.sendTpat$default(getTpatSender(), builderWithLogEntry.build(), false, 2, null);
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -511324706:
                if (command.equals("openPrivacy")) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
                    String contentStringValue10 = JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                    if (contentStringValue10 == null || contentStringValue10.length() == 0 || !FileUtility.INSTANCE.isValidUrl(contentStringValue10)) {
                        String str = contentStringValue10;
                        if (str == null) {
                            str = "nonePrivacyUrl";
                        }
                        new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    } else {
                        ExternalRouter externalRouter2 = ExternalRouter.INSTANCE;
                        Context context2 = this.adWidget.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
                        if (!ExternalRouter.launch$vungle_ads_release$default(externalRouter2, null, contentStringValue10, context2, getLogEntry(), null, 16, null)) {
                            new PrivacyUrlError(contentStringValue10).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        } else {
                            AdEventListener adEventListener4 = this.bus;
                            if (adEventListener4 != null) {
                                adEventListener4.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                                Unit unit5 = Unit.INSTANCE;
                            }
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -418575596:
                break;
            case -348095344:
                if (command.equals(USE_CUSTOM_PRIVACY)) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 3417674:
                break;
            case 3566511:
                if (command.equals("tpat")) {
                    String contentStringValue11 = JsonUtil.INSTANCE.getContentStringValue(arguments, a.f62811a);
                    if (contentStringValue11 == null || contentStringValue11.length() == 0) {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    } else {
                        triggerEventMetricForTpat(contentStringValue11);
                        List<String> tpatUrls = Intrinsics.areEqual(contentStringValue11, Constants.CHECKPOINT_0) ? this.advertisement.getTpatUrls(contentStringValue11, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel())) : Intrinsics.areEqual(contentStringValue11, Constants.VIDEO_LENGTH_TPAT) ? AdPayload.getTpatUrls$default(this.advertisement, contentStringValue11, String.valueOf(this.videoLength), null, 4, null) : AdPayload.getTpatUrls$default(this.advertisement, contentStringValue11, null, null, 6, null);
                        if (tpatUrls != null) {
                            Iterator<T> it = tpatUrls.iterator();
                            while (it.hasNext()) {
                                TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(contentStringValue11).withLogEntry(getLogEntry()).build(), false, 2, null);
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(contentStringValue11, Constants.CHECKPOINT_0) && !this.cp0Fired) {
                            this.cp0Fired = true;
                            AdEventListener adEventListener5 = this.bus;
                            if (adEventListener5 != null) {
                                adEventListener5.onNext("adViewed", null, this.placement.getReferenceId());
                                Unit unit7 = Unit.INSTANCE;
                            }
                            ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand.3
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
                                    MRAIDPresenter.this.adWidget.setVisibility(0);
                                }
                            });
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 94756344:
                if (command.equals(CLOSE)) {
                    closeView();
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 96784904:
                if (command.equals(ERROR)) {
                    JsonUtil jsonUtil3 = JsonUtil.INSTANCE;
                    String contentStringValue12 = jsonUtil3.getContentStringValue(arguments, "code");
                    final boolean z4 = Boolean.parseBoolean(jsonUtil3.getContentStringValue(arguments, "fatal"));
                    String contentStringValue13 = jsonUtil3.getContentStringValue(arguments, "errorMessage");
                    final String str2 = contentStringValue12 + " : " + contentStringValue13;
                    final MraidTemplateError mraidTemplateError = new MraidTemplateError(z4 ? Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR : Sdk.SDKError.Reason.MRAID_ERROR, str2);
                    ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand.7
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
                            MRAIDPresenter.this.handleWebViewException(mraidTemplateError, z4, str2);
                        }
                    });
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 133423073:
                if (command.equals(SET_ORIENTATION_PROPERTIES)) {
                    String contentStringValue14 = JsonUtil.INSTANCE.getContentStringValue(arguments, "forceOrientation");
                    if (contentStringValue14 != null && contentStringValue14.length() != 0) {
                        Locale ENGLISH = Locale.ENGLISH;
                        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        String lowerCase = contentStringValue14.toLowerCase(ENGLISH);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (Intrinsics.areEqual(lowerCase, "landscape")) {
                            this.adWidget.setOrientation(6);
                        } else if (Intrinsics.areEqual(lowerCase, "portrait")) {
                            this.adWidget.setOrientation(7);
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 592314818:
                if (command.equals(UPDATE_SIGNALS)) {
                    String contentStringValue15 = JsonUtil.INSTANCE.getContentStringValue(arguments, "signals");
                    if (contentStringValue15 != null && contentStringValue15.length() != 0) {
                        getSignalManager().updateTemplateSignals(contentStringValue15);
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1496446614:
                if (command.equals(GET_AVAILABLE_DISK_SPACE)) {
                    try {
                        Context context3 = this.adWidget.getContext();
                        File noBackupFilesDir = context3.getNoBackupFilesDir();
                        PathProvider pathProvider = getPathProvider();
                        String path = noBackupFilesDir.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "dir.path");
                        final long availableBytes = pathProvider.getAvailableBytes(path);
                        Utils utils = Utils.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        final long webViewDataSize = utils.getWebViewDataSize(context3);
                        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand.9
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
                                MRAIDPresenter.this.vungleWebClient.notifyDiskAvailableSize(availableBytes, webViewDataSize);
                            }
                        });
                    } catch (Exception e2) {
                        Logger.INSTANCE.e(TAG, "Failed to get available disk space: " + e2.getMessage());
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1614272768:
                if (command.equals(USE_CUSTOM_CLOSE)) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1850430989:
                if (command.equals(CREATIVE_HEARTBEAT)) {
                    if (this.heartbeatEnabled) {
                        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand.8
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
                                MRAIDPresenter.this.getSuspendableTimer$vungle_ads_release().reset();
                            }
                        });
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            default:
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
        }
        return true;
        return true;
    }

    public MRAIDPresenter(MRAIDAdWidget adWidget, AdPayload advertisement, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker omTracker, Platform platform) {
        Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.vungleApiClient = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        final Context context2 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.pathProvider = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PathProvider>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(PathProvider.class);
            }
        });
        final Context context3 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.signalManager = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(SignalManager.class);
            }
        });
        final Context context4 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.tpatSender = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TpatSender>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(TpatSender.class);
            }
        });
        this.scheduler = LazyKt.lazy(new Function0<HandlerScheduler>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final HandlerScheduler invoke() {
                return new HandlerScheduler();
            }
        });
        this.logEntry = LazyKt.lazy(new Function0<LogEntry>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LogEntry invoke() {
                return this.this$0.advertisement.getLogEntry();
            }
        });
        this.suspendableTimer = LazyKt.lazy(new Function0<SuspendableTimer>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SuspendableTimer invoke() {
                final MRAIDPresenter mRAIDPresenter = this.this$0;
                return new SuspendableTimer(6.0d, true, null, new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2.1
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
                        mRAIDPresenter.reportErrorAndCloseAd(new HeartbeatMissingError());
                    }
                }, 4, null);
            }
        });
        this.clickCoordinateTracker = LazyKt.lazy(new Function0<ClickCoordinateTracker>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ClickCoordinateTracker invoke() {
                Context context5 = this.this$0.adWidget.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "adWidget.context");
                return new ClickCoordinateTracker(context5, this.this$0.advertisement);
            }
        });
    }

    private final void closeView() {
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        if (threadUtil.isMainThread()) {
            this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.j
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m256closeView$lambda3(this.f63301n);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.closeView.2
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
                MRAIDPresenter.this.adWidget.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m256closeView$lambda3(MRAIDPresenter mRAIDPresenter) {
        Intrinsics.checkNotNullParameter(mRAIDPresenter, pTYaLzzmJSGAPQ.bRdD);
        mRAIDPresenter.sendAdCloseEvent();
    }

    private final PresenterAdOpenCallback createDeeplinkCallback(final String deeplinkUrl) {
        return new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.createDeeplinkCallback.1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean opened) {
                if (!opened) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                List tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, Constants.DEEPLINK_CLICK, String.valueOf(opened), null, 4, null);
                if (tpatUrls$default != null) {
                    MRAIDPresenter mRAIDPresenter = this;
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(mRAIDPresenter.getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(mRAIDPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getValue();
    }

    private final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider.getValue();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getValue();
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError reason, boolean fatal, String errorMessage) {
        Logger.INSTANCE.e(TAG, "handleWebViewException: " + reason.getLocalizedMessage() + ", fatal: " + fatal + ", errorMsg: " + errorMessage);
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (fatal) {
            makeBusError(reason);
            closeView();
        }
    }

    static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z2, str);
    }

    private final boolean launchInlineInstall(String url) throws Throwable {
        Pair<Boolean, String> pair;
        ExternalRouter externalRouter = ExternalRouter.INSTANCE;
        Context context = this.adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        Intent intentFromUrl$vungle_ads_release = externalRouter.getIntentFromUrl$vungle_ads_release(context, url);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + url + ", message: intent is null");
            return false;
        }
        Pair<Boolean, String> pairCheckInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean zBooleanValue = pairCheckInlineInstallIntent$vungle_ads_release.component1().booleanValue();
        String strComponent2 = pairCheckInlineInstallIntent$vungle_ads_release.component2();
        if (!zBooleanValue) {
            logInlineInstallFailure("url: " + url + qwlyMfUJj.XuqN + strComponent2);
            return false;
        }
        OpenActivityDelegate openActivityDelegate = this.appStoreDelegate;
        if (openActivityDelegate == null || (pair = openActivityDelegate.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            pair = new Pair<>(Boolean.FALSE, null);
        }
        boolean zBooleanValue2 = pair.component1().booleanValue();
        String strComponent22 = pair.component2();
        if (zBooleanValue2) {
            logInlineInstallSuccess$vungle_ads_release("url: " + url);
            return true;
        }
        logInlineInstallFailure("url: " + url + ", message: " + strComponent22);
        return false;
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb = new StringBuilder();
            sb.append(YjqZUJsVmhcjko.mjKTboGN);
            sb.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(reason, sb.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void logInlineInstallFailure(String message) throws Throwable {
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.logInlineInstallFailure.1
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
                MRAIDPresenter.this.vungleWebClient.notifyPresentAppStoreFailed();
            }
        });
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(2L);
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
        analyticsClient.logError$vungle_ads_release(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(message), getLogEntry());
    }

    static /* synthetic */ void logInlineInstallFailure$default(MRAIDPresenter mRAIDPresenter, String str, int i2, Object obj) throws Throwable {
        if ((i2 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallFailure(str);
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(MRAIDPresenter mRAIDPresenter, String str, int i2, Object obj) throws Throwable {
        if ((i2 & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release(str);
    }

    private final void makeBusError(VungleError reason) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(reason, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-15, reason: not valid java name */
    public static final void m257prepare$lambda15(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m258processCommand$lambda11(final MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam adSizeParam = null;
        Call<Void> callRi = this$0.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, adSizeParam, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, 3, (DefaultConstructorMarker) null));
        if (callRi != null) {
            callRi.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable t3) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI Failure");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error RI API calls: ");
                    sb.append(t3 != null ? t3.getLocalizedMessage() : null);
                    new NetworkUnreachable(sb.toString()).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI success");
                }
            });
            return;
        }
        Logger.INSTANCE.e(TAG, "Invalid ri call.");
        new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final void sendAdCloseEvent() {
        Long l2 = this.adStartTime;
        if (l2 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l2.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    private final void triggerEventMetricForTpat(String key) throws Throwable {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(key);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    @VisibleForTesting
    public final Pair<Boolean, String> checkInlineInstallIntent$vungle_ads_release(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        return new Pair<>(Boolean.valueOf(Intrinsics.areEqual(packageName, "com.android.vending")), packageName);
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int stopReason) {
        AdEventListener adEventListener;
        Logger.INSTANCE.d(TAG, "detach()");
        boolean z2 = (stopReason & 1) != 0;
        boolean z3 = (stopReason & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z2 && z3 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop(), this.platform.isProblematicMaliDevice());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    /* JADX INFO: renamed from: getAdStartTime$vungle_ads_release, reason: from getter */
    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    /* JADX INFO: renamed from: getBackEnabled$vungle_ads_release, reason: from getter */
    public final boolean getBackEnabled() {
        return this.backEnabled;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker.getValue();
    }

    /* JADX INFO: renamed from: getHeartbeatEnabled$vungle_ads_release, reason: from getter */
    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    /* JADX INFO: renamed from: getLastUserInteractionTimestamp$vungle_ads_release, reason: from getter */
    public final long getLastUserInteractionTimestamp() {
        return this.lastUserInteractionTimestamp;
    }

    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer.getValue();
    }

    /* JADX INFO: renamed from: getUserId$vungle_ads_release, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: getVideoLength$vungle_ads_release, reason: from getter */
    public final long getVideoLength() {
        return this.videoLength;
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    /* JADX INFO: renamed from: isDestroying$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsDestroying() {
        return this.isDestroying;
    }

    public final void logInlineInstallSuccess$vungle_ads_release(String message) throws Throwable {
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(1L);
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String errorDesc, boolean didCrash) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (didCrash) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent event) {
        if (event != null) {
            Logger.INSTANCE.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(event);
        }
    }

    public final void prepare() {
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        this.adWidget.setOrientation((numValueOf != null && numValueOf.intValue() == 0) ? 7 : (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (alertTitleText = presenterDelegate2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (alertBodyText = presenterDelegate3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (alertContinueButtonText = presenterDelegate4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (alertCloseButtonText = presenterDelegate5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        ConfigManager configManager = ConfigManager.INSTANCE;
        boolean z2 = configManager.getGDPRIsCountryDataProtected() && Intrinsics.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z2, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
        if (z2) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.w6
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m257prepare$lambda15(this.f63303n);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(TtmlNode.START, null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
    }

    public final void setAdStartTime$vungle_ads_release(Long l2) {
        this.adStartTime = l2;
    }

    public final void setAdVisibility(boolean isViewable) {
        this.vungleWebClient.setAdVisibility(isViewable);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z2) {
        this.backEnabled = z2;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setEventListener(AdEventListener listener) {
        this.bus = listener;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z2) {
        this.heartbeatEnabled = z2;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j2) {
        this.lastUserInteractionTimestamp = j2;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(OpenActivityDelegate appStoreDelegate) {
        this.appStoreDelegate = appStoreDelegate;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j2) {
        this.videoLength = j2;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        ConfigManager configManager = ConfigManager.INSTANCE;
        if (configManager.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > configManager.afterClickDuration();
    }

    public final void start() {
        Logger.INSTANCE.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        Logger.INSTANCE.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(VungleError reason) {
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(reason);
        closeView();
    }
}
