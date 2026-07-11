package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.omsdk.NativeOMTracker;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\u0018\u0000 M2\u00020\u0001:\u0001MB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u00105\u001a\u000206J\u0016\u00107\u001a\u0002062\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001fJ\b\u0010;\u001a\u00020\u001dH\u0002J\u0012\u0010<\u001a\u0002062\b\u0010=\u001a\u0004\u0018\u00010\u001fH\u0002J&\u0010>\u001a\u0002062\u0006\u0010?\u001a\u00020\u001c2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010'J\u0012\u0010A\u001a\u0002062\b\u0010B\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010C\u001a\u0002062\b\u0010?\u001a\u0004\u0018\u00010DJ\u0006\u0010E\u001a\u000206J&\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020\u001f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010I\u001a\u0002062\b\u0010J\u001a\u0004\u0018\u00010\u000fJ\b\u0010K\u001a\u000206H\u0002J\b\u0010L\u001a\u000206H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0'X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010)\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b2\u00103¨\u0006N²\u0006\n\u0010O\u001a\u00020PX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "", "context", "Landroid/content/Context;", "delegate", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", AppLovinBridge.f61288f, "Lcom/vungle/ads/internal/platform/Platform;", "(Landroid/content/Context;Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "Ljava/lang/Long;", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "clickCoordinateTracker", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "()V", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "setClickCoordinateTracker$vungle_ads_release", "(Lcom/vungle/ads/internal/ClickCoordinateTracker;)V", "currentDialog", "Landroid/app/Dialog;", "firedOMEventMap", "", "", "", "firedTpatMap", "", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "Lkotlin/Lazy;", "multipleOMEventEnabledMap", "", "multipleTpatEnabledMap", "omTracker", "Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "getOmTracker$vungle_ads_release$annotations", "getOmTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "setOmTracker$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/NativeOMTracker;)V", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "detach", "", "initAndStartOMTracker", "view", "Landroid/view/View;", "omSdkData", "needShowGdpr", "onDownload", "ctaUrl", "onOMEvent", a.f62811a, "args", "onPrivacy", "privacyUrl", "onViewTouched", "Landroid/view/MotionEvent;", "prepare", "processCommand", FileUploadManager.f61572j, "value", "setEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showGdpr", TtmlNode.START, "Companion", "vungle-ads_release", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAdPresenter {
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    private Long adStartTime;
    private final AdPayload advertisement;
    private AdEventListener bus;
    private ClickCoordinateTracker clickCoordinateTracker;
    private final Context context;
    private Dialog currentDialog;
    private final NativePresenterDelegate delegate;
    private final Map<Integer, Boolean> firedOMEventMap;
    private final Map<String, Boolean> firedTpatMap;

    /* JADX INFO: renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final Lazy logEntry;
    private final Map<Integer, Boolean> multipleOMEventEnabledMap;
    private final Map<String, Boolean> multipleTpatEnabledMap;
    private NativeOMTracker omTracker;
    private final Platform platform;

    /* JADX INFO: renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final Lazy tpatSender;

    @VisibleForTesting
    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOmTracker$vungle_ads_release$annotations() {
    }

    private final void onDownload(String ctaUrl) throws Throwable {
        AdEventListener adEventListener;
        processCommand$default(this, "tpat", Constants.CLICK_URL, null, 4, null);
        processCommand("tpat", Constants.CTA_URL, ctaUrl);
        AdPayload.AdUnit adUnit = this.advertisement.adUnit();
        final String deeplinkUrl = adUnit != null ? adUnit.getDeeplinkUrl() : null;
        boolean zLaunch$vungle_ads_release = ExternalRouter.INSTANCE.launch$vungle_ads_release(deeplinkUrl, ctaUrl, this.context, getLogEntry(), new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$launched$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean opened) {
                if (!opened) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                List tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, Constants.DEEPLINK_CLICK, String.valueOf(opened), null, 4, null);
                if (tpatUrls$default != null) {
                    NativeAdPresenter nativeAdPresenter = this;
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(nativeAdPresenter.getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(nativeAdPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        });
        AdEventListener adEventListener2 = this.bus;
        if (adEventListener2 != null) {
            adEventListener2.onNext("open", "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch$vungle_ads_release || (adEventListener = this.bus) == null) {
            return;
        }
        adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
    }

    public NativeAdPresenter(final Context context, NativePresenterDelegate delegate, AdPayload advertisement, Platform platform) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = advertisement;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.tpatSender = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<TpatSender>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        });
        this.logEntry = LazyKt.lazy(new Function0<LogEntry>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LogEntry invoke() {
                return this.this$0.advertisement.getLogEntry();
            }
        });
        this.firedTpatMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        this.multipleTpatEnabledMap = MapsKt.mapOf(TuplesKt.to(Constants.TPAT_VIDEO_MUTE, bool), TuplesKt.to(Constants.TPAT_VIDEO_UNMUTE, bool));
        this.firedOMEventMap = new LinkedHashMap();
        this.multipleOMEventEnabledMap = MapsKt.mapOf(TuplesKt.to(8, bool), TuplesKt.to(9, bool), TuplesKt.to(10, bool));
        this.clickCoordinateTracker = new ClickCoordinateTracker(context, advertisement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getValue();
    }

    private final boolean needShowGdpr() {
        return ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && Intrinsics.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onOMEvent$default(NativeAdPresenter nativeAdPresenter, int i2, Map map, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            map = null;
        }
        nativeAdPresenter.onOMEvent(i2, map);
    }

    private final void onPrivacy(String privacyUrl) throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (privacyUrl != null) {
            if (!FileUtility.INSTANCE.isValidUrl(privacyUrl)) {
                new PrivacyUrlError(privacyUrl).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!ExternalRouter.launch$vungle_ads_release$default(ExternalRouter.INSTANCE, null, privacyUrl, this.context, getLogEntry(), null, 16, null)) {
                new PrivacyUrlError(privacyUrl).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            AdEventListener adEventListener = this.bus;
            if (adEventListener != null) {
                adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, String str3, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        nativeAdPresenter.processCommand(str, str2, str3);
    }

    private final void showGdpr() {
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            Logger.INSTANCE.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.Ml
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                NativeAdPresenter.m260showGdpr$lambda7(this.f63300n, dialogInterface, i2);
            }
        };
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.I28
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NativeAdPresenter.m261showGdpr$lambda8(this.f63299n, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-7, reason: not valid java name */
    public static final void m260showGdpr$lambda7(NativeAdPresenter this$0, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PrivacyManager.INSTANCE.updateGdprConsent(i2 != -2 ? i2 != -1 ? "opted_out_by_timeout" : PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m261showGdpr$lambda8(NativeAdPresenter this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.currentDialog = null;
    }

    public final void detach() {
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
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
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(TtmlNode.END, null, this.delegate.getPlacementRefId());
        }
    }

    /* JADX INFO: renamed from: getClickCoordinateTracker$vungle_ads_release, reason: from getter */
    public final ClickCoordinateTracker getClickCoordinateTracker() {
        return this.clickCoordinateTracker;
    }

    /* JADX INFO: renamed from: getOmTracker$vungle_ads_release, reason: from getter */
    public final NativeOMTracker getOmTracker() {
        return this.omTracker;
    }

    public final void initAndStartOMTracker(View view, String omSdkData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        boolean zOmEnabled = this.advertisement.omEnabled();
        if (omSdkData.length() <= 0 || !zOmEnabled) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        String oMSDKJS$vungle_ads_release = m259initAndStartOMTracker$lambda9(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OMInjector>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$initAndStartOMTracker$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final OMInjector invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(OMInjector.class);
            }
        })).getOMSDKJS$vungle_ads_release();
        if (oMSDKJS$vungle_ads_release != null) {
            NativeOMTracker nativeOMTracker = new NativeOMTracker(omSdkData, oMSDKJS$vungle_ads_release, this.delegate.isNativeVideo());
            nativeOMTracker.start(view);
            this.omTracker = nativeOMTracker;
        }
    }

    public final void onOMEvent(int event, Map<String, ? extends Object> args) {
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(TAG, "onOMEvent: event=" + event + " value=" + args);
        Boolean bool = this.multipleOMEventEnabledMap.get(Integer.valueOf(event));
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool, bool2) && Intrinsics.areEqual(this.firedOMEventMap.get(Integer.valueOf(event)), bool2)) {
            companion.d(TAG, "Ignore this already fired om event: " + event);
        }
        this.firedOMEventMap.put(Integer.valueOf(event), bool2);
        switch (event) {
            case 1:
                NativeOMTracker nativeOMTracker = this.omTracker;
                if (nativeOMTracker != null) {
                    nativeOMTracker.onStatePlay();
                }
                break;
            case 2:
                NativeOMTracker nativeOMTracker2 = this.omTracker;
                if (nativeOMTracker2 != null) {
                    nativeOMTracker2.onStatePaused();
                }
                break;
            case 3:
                NativeOMTracker nativeOMTracker3 = this.omTracker;
                if (nativeOMTracker3 != null) {
                    nativeOMTracker3.onStateCompleted();
                }
                break;
            case 4:
                Object obj = args != null ? args.get(NativeAdInternal.QUARTILE_START_KEY_DURATION) : null;
                Number number = obj instanceof Number ? (Number) obj : null;
                float fFloatValue = number != null ? number.floatValue() : 0.0f;
                Object obj2 = args != null ? args.get(NativeAdInternal.QUARTILE_START_KEY_VOLUME) : null;
                Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
                float fFloatValue2 = number2 != null ? number2.floatValue() : 0.0f;
                NativeOMTracker nativeOMTracker4 = this.omTracker;
                if (nativeOMTracker4 != null) {
                    nativeOMTracker4.onQuartileStart(fFloatValue, fFloatValue2);
                }
                break;
            case 5:
            case 6:
            case 7:
                NativeOMTracker nativeOMTracker5 = this.omTracker;
                if (nativeOMTracker5 != null) {
                    nativeOMTracker5.onQuartileChanged(event);
                }
                break;
            case 8:
                NativeOMTracker nativeOMTracker6 = this.omTracker;
                if (nativeOMTracker6 != null) {
                    nativeOMTracker6.onUserInteraction();
                }
                break;
            case 9:
                NativeOMTracker nativeOMTracker7 = this.omTracker;
                if (nativeOMTracker7 != null) {
                    nativeOMTracker7.onMuteChanged(true);
                }
                break;
            case 10:
                NativeOMTracker nativeOMTracker8 = this.omTracker;
                if (nativeOMTracker8 != null) {
                    nativeOMTracker8.onMuteChanged(false);
                }
                break;
            case 11:
                NativeOMTracker nativeOMTracker9 = this.omTracker;
                if (nativeOMTracker9 != null) {
                    nativeOMTracker9.impressionOccurred();
                }
                break;
        }
    }

    public final void onViewTouched(MotionEvent event) {
        if (event != null) {
            Logger.INSTANCE.d(TAG, "user interaction on Native ad");
            this.clickCoordinateTracker.trackCoordinate(event);
        }
    }

    public final void processCommand(String action, String event, String value) throws Throwable {
        String str;
        String str2;
        List<String> tpatUrls$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(TAG, "processCommand: action=" + action + " event=" + event + " value=" + value);
        int iHashCode = action.hashCode();
        if (iHashCode != -511324706) {
            if (iHashCode != 3566511) {
                if (iHashCode == 1427818632 && action.equals(DOWNLOAD)) {
                    onDownload(value);
                    return;
                }
            } else if (action.equals("tpat")) {
                if (event == null || event.length() == 0) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                Boolean bool = this.multipleTpatEnabledMap.get(event);
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.areEqual(bool, bool2) && Intrinsics.areEqual(this.firedTpatMap.get(event), bool2)) {
                    companion.d(TAG, "Ignore this already fired TPAT: " + event);
                    return;
                }
                this.firedTpatMap.put(event, bool2);
                int iHashCode2 = event.hashCode();
                if (iHashCode2 != -2125915830) {
                    if (iHashCode2 != -747709511) {
                        if (iHashCode2 == 1082060480 && event.equals(Constants.CTA_URL)) {
                            if (value != null) {
                                tpatUrls$default = CollectionsKt.listOf(value);
                                str = event;
                                str2 = value;
                            } else {
                                str = event;
                                str2 = value;
                                tpatUrls$default = null;
                            }
                        }
                        str = event;
                        str2 = value;
                    } else {
                        if (event.equals(Constants.VIDEO_LENGTH_TPAT)) {
                            str = event;
                            tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, str, value, null, 4, null);
                            str2 = value;
                        }
                        str = event;
                        str2 = value;
                    }
                } else {
                    str = event;
                    str2 = value;
                    tpatUrls$default = !str.equals(Constants.CHECKPOINT_0) ? AdPayload.getTpatUrls$default(this.advertisement, str, null, null, 6, null) : this.advertisement.getTpatUrls(str, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel()));
                }
                if (tpatUrls$default == null || tpatUrls$default.isEmpty()) {
                    new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Empty urls for tpat: " + str + " value=" + str2).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    Iterator<T> it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(str).withLogEntry(getLogEntry()).build(), false, 2, null);
                    }
                }
                if (Intrinsics.areEqual(str, Constants.CHECKPOINT_0)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), getLogEntry(), (String) null, 4, (Object) null);
                    AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext("adViewed", null, this.delegate.getPlacementRefId());
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (action.equals("openPrivacy")) {
            onPrivacy(value);
            return;
        }
        companion.w(TAG, "Unknown native ad action: " + action);
    }

    public final void setClickCoordinateTracker$vungle_ads_release(ClickCoordinateTracker clickCoordinateTracker) {
        Intrinsics.checkNotNullParameter(clickCoordinateTracker, "<set-?>");
        this.clickCoordinateTracker = clickCoordinateTracker;
    }

    public final void setEventListener(AdEventListener listener) {
        this.bus = listener;
    }

    public final void setOmTracker$vungle_ads_release(NativeOMTracker nativeOMTracker) {
        this.omTracker = nativeOMTracker;
    }

    /* JADX INFO: renamed from: initAndStartOMTracker$lambda-9, reason: not valid java name */
    private static final OMInjector m259initAndStartOMTracker$lambda9(Lazy<OMInjector> lazy) {
        return lazy.getValue();
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void prepare() {
        start();
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(TtmlNode.START, null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }
}
