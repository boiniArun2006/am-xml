package com.vungle.ads.internal;

import XA.r;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010)J\u000f\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010)J\r\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u0010)J\r\u00100\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\r¢\u0006\u0004\b5\u00101J\r\u00106\u001a\u00020\r¢\u0006\u0004\b6\u00101J\r\u00107\u001a\u00020\u0004¢\u0006\u0004\b7\u0010)J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0004¢\u0006\u0004\b;\u0010)J\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010)J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u00101J\r\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u000208¢\u0006\u0004\bA\u0010:J\r\u0010B\u001a\u000208¢\u0006\u0004\bB\u0010:J\r\u0010C\u001a\u00020\r¢\u0006\u0004\bC\u00101J\r\u0010D\u001a\u00020\r¢\u0006\u0004\bD\u00101J\r\u0010E\u001a\u00020\r¢\u0006\u0004\bE\u00101J\r\u0010F\u001a\u00020\r¢\u0006\u0004\bF\u00101J\r\u0010G\u001a\u00020\r¢\u0006\u0004\bG\u00101J\r\u0010H\u001a\u00020\r¢\u0006\u0004\bH\u00101J\r\u0010I\u001a\u000208¢\u0006\u0004\bI\u0010:J\u0019\u0010M\u001a\u00020>2\b\u0010J\u001a\u0004\u0018\u00010\u0019H\u0001¢\u0006\u0004\bK\u0010LJ\u0019\u0010P\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010\u0019H\u0001¢\u0006\u0004\bN\u0010OJ\u001b\u0010U\u001a\u00020\r2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010QH\u0001¢\u0006\u0004\bS\u0010TJ\r\u0010V\u001a\u00020\r¢\u0006\u0004\bV\u00101J\r\u0010W\u001a\u000208¢\u0006\u0004\bW\u0010:J\r\u0010X\u001a\u00020>¢\u0006\u0004\bX\u0010@J\u001f\u0010\\\u001a\u0004\u0018\u00010\u00192\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0004¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020\u0006H\u0001¢\u0006\u0004\b`\u0010\u0003R\u0014\u0010b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u0002088\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010gR\u0014\u0010i\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010gR\u0014\u0010j\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010gR\u0014\u0010k\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010gR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010lR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010mR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010cR\u001b\u0010u\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010c¨\u0006z²\u0006\f\u0010w\u001a\u00020v8\nX\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u00020Y8\nX\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u00020Y8\nX\u008a\u0084\u0002²\u0006\f\u0010w\u001a\u00020v8\nX\u008a\u0084\u0002²\u0006\f\u0010y\u001a\u00020x8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "<init>", "()V", "", "applicationId", "", "setAppId$vungle_ads_release", "(Ljava/lang/String;)V", "setAppId", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "result", "onComplete", "fetchConfigAsync$vungle_ads_release", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "fetchConfigAsync", "ext", "updateConfigExtension$vungle_ads_release", "(Landroid/content/Context;Ljava/lang/String;)V", "updateConfigExtension", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "fromCachedConfig", "Lcom/vungle/ads/SingleValueMetric;", "metric", "initWithConfig$vungle_ads_release", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/ConfigPayload;ZLcom/vungle/ads/SingleValueMetric;)V", "initWithConfig", "", "Lcom/vungle/ads/internal/model/Placement;", "placements", "()Ljava/util/List;", "id", "getPlacement", "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/Placement;", "getAdsEndpoint", "()Ljava/lang/String;", "getRiEndpoint", "getGDPRConsentMessage", "getGDPRConsentTitle", "getGDPRButtonAccept", "getGDPRButtonDeny", "getGDPRConsentMessageVersion", "getGDPRIsCountryDataProtected", "()Z", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "getTcfStatus", "()Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "shouldDisableAdId", "isReportIncentivizedEnabled", "getConfigExtension", "", "configLastValidatedTimestamp", "()J", "getMetricsEndpoint", "getErrorLoggingEndpoint", "getMetricsEnabled", "", "getLogLevel", "()I", "getSessionTimeout", "getSignalsSessionTimeout", "rtaDebuggingEnabled", "otEnabled", "signalsDisabled", "fpdEnabled", "retryPriorityTPATs", "allowAutoRedirects", "afterClickDuration", "configPayload", "checkConfigPayload$vungle_ads_release", "(Lcom/vungle/ads/internal/model/ConfigPayload;)I", "checkConfigPayload", "validateConfig$vungle_ads_release", "(Lcom/vungle/ads/internal/model/ConfigPayload;)Z", "validateConfig", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "endpoints", "validateEndpoints$vungle_ads_release", "(Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;)Z", "validateEndpoints", "isCleverCacheEnabled", "getCleverCacheDiskSize", "getCleverCacheDiskPercentage", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "appId", "getCachedConfig", "(Lcom/vungle/ads/internal/persistence/FilePreferences;Ljava/lang/String;)Lcom/vungle/ads/internal/model/ConfigPayload;", "updateCachedConfig", "(Lcom/vungle/ads/internal/model/ConfigPayload;Lcom/vungle/ads/internal/persistence/FilePreferences;)V", "clearConfig$vungle_ads_release", "clearConfig", "TAG", "Ljava/lang/String;", "CONFIG_LAST_VALIDATE_TS_DEFAULT", "J", "DEFAULT_SESSION_TIMEOUT_SECONDS", "I", "DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS", "CONFIG_NOT_AVAILABLE", "CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY", "CONFIG_ALL_DATA", "Lcom/vungle/ads/internal/model/ConfigPayload;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "Ljava/util/List;", "configExt", "Lkotlinx/serialization/json/n;", "json$delegate", "Lkotlin/Lazy;", "getJson", "()Lkotlinx/serialization/json/n;", "json", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/Executors;", "sdkExecutors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static ConfigPayload config;
    private static String configExt;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;
    public static final ConfigManager INSTANCE = new ConfigManager();

    /* JADX INFO: renamed from: json$delegate, reason: from kotlin metadata */
    private static final Lazy json = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<kotlinx.serialization.json.n>() { // from class: com.vungle.ads.internal.ConfigManager$json$2
        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.json.n invoke() {
            return Q.rl(null, new Function1<kotlinx.serialization.json.I28, Unit>() { // from class: com.vungle.ads.internal.ConfigManager$json$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(kotlinx.serialization.json.I28 i28) {
                    invoke2(i28);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(kotlinx.serialization.json.I28 Json) {
                    Intrinsics.checkNotNullParameter(Json, "$this$Json");
                    Json.J2(true);
                    Json.nr(true);
                    Json.O(false);
                }
            }, 1, null);
        }
    });

    @VisibleForTesting
    public final int checkConfigPayload$vungle_ads_release(ConfigPayload configPayload) {
        Long configLastValidatedTimestamp;
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null || ((configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) != null && configLastValidatedTimestamp.longValue() == -1)) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    @VisibleForTesting
    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final synchronized void initWithConfig$vungle_ads_release(final Context context, ConfigPayload config2, boolean fromCachedConfig, SingleValueMetric metric) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final FilePreferences invoke() {
                        return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                    }
                });
                int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(config2);
                if (iCheckConfigPayload$vungle_ads_release == 0) {
                    Logger.INSTANCE.e(TAG, "Config is not available.");
                    return;
                }
                if (iCheckConfigPayload$vungle_ads_release == 1) {
                    if (!fromCachedConfig && config2 != null) {
                        Long configLastValidatedTimestamp = config2.getConfigLastValidatedTimestamp();
                        long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                        ConfigPayload configPayload = config;
                        if (configPayload != null) {
                            configPayload.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                        }
                        ConfigPayload configPayload2 = config;
                        if (configPayload2 != null) {
                            INSTANCE.updateCachedConfig(configPayload2, m217initWithConfig$lambda2(lazy));
                        }
                    }
                    return;
                }
                config = config2;
                endpoints = config2 != null ? config2.getEndpoints() : null;
                placements = config2 != null ? config2.getPlacements() : null;
                int logLevel = getLogLevel();
                boolean metricsEnabled = getMetricsEnabled();
                Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$2
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
                Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$3
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
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                analyticsClient.initOrUpdate$vungle_ads_release(m218initWithConfig$lambda4(lazy2), m219initWithConfig$lambda5(lazy3).getLOGGER_EXECUTOR(), logLevel, metricsEnabled);
                if (!fromCachedConfig && config2 != null) {
                    updateCachedConfig(config2, m217initWithConfig$lambda2(lazy));
                    String configExtension = config2.getConfigExtension();
                    if (configExtension != null) {
                        INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                    }
                }
                if (metric != null) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, metric, (LogEntry) null, (String) null, 6, (Object) null);
                }
                PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
            } catch (Exception e2) {
                Logger.INSTANCE.e(TAG, "Error while validating config: " + e2.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public final boolean validateEndpoints$vungle_ads_release(ConfigPayload.Endpoints endpoints2) {
        boolean z2;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z2 = false;
        } else {
            z2 = true;
        }
        String riEndpoint = endpoints2 != null ? endpoints2.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            return z2;
        }
        Logger.INSTANCE.e(TAG, "The error logging endpoint was not provided in the config.");
        return z2;
    }

    private final kotlinx.serialization.json.n getJson() {
        return (kotlinx.serialization.json.n) json.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(ConfigManager configManager, Context context, ConfigPayload configPayload, boolean z2, SingleValueMetric singleValueMetric, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            singleValueMetric = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z2, singleValueMetric);
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(ConfigManager configManager, ConfigPayload.Endpoints endpoints2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            endpoints2 = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(endpoints2);
    }

    public final long afterClickDuration() {
        ConfigPayload.AutoRedirect autoRedirect;
        Long afterClickDuration;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        ConfigPayload.AutoRedirect autoRedirect;
        Boolean allowAutoRedirect;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(final Context context, final Function1<? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        try {
            Call<ConfigPayload> callConfig = m216fetchConfigAsync$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            })).config();
            if (callConfig != null) {
                callConfig.enqueue(new Callback<ConfigPayload>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$1
                    @Override // com.vungle.ads.internal.network.Callback
                    public void onFailure(Call<ConfigPayload> call, Throwable t3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while fetching config: ");
                        sb.append(t3 != null ? t3.getMessage() : null);
                        new NetworkUnreachable(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }

                    @Override // com.vungle.ads.internal.network.Callback
                    public void onResponse(Call<ConfigPayload> call, Response<ConfigPayload> response) {
                        if (response != null && response.isSuccessful() && response.body() != null) {
                            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(context, response.body(), false, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                            onComplete.invoke(Boolean.TRUE);
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("config API: ");
                        sb.append(response != null ? Integer.valueOf(response.code()) : null);
                        new APIFailedStatusCodeError(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }
                });
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable("Config unknown: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable("Config: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final ConfigPayload getCachedConfig(FilePreferences filePreferences, String appId) {
        Long refreshTime;
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        Intrinsics.checkNotNullParameter(appId, "appId");
        try {
            String string = filePreferences.getString(Cookie.CONFIG_APP_ID);
            if (string != null && string.length() != 0 && StringsKt.equals(string, appId, true)) {
                String string2 = filePreferences.getString(Cookie.CONFIG_RESPONSE);
                if (string2 == null) {
                    return null;
                }
                long j2 = filePreferences.getLong(Cookie.CONFIG_UPDATE_TIME, 0L);
                kotlinx.serialization.json.n json2 = INSTANCE.getJson();
                XA.Ml mlRl = r.rl(json2.n(), Reflection.typeOf(ConfigPayload.class));
                Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                ConfigPayload configPayload = (ConfigPayload) json2.t(mlRl, string2);
                ConfigPayload.ConfigSettings configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j2 < System.currentTimeMillis()) {
                    Logger.INSTANCE.w(TAG, "cache config expired. re-config");
                    return null;
                }
                Logger.INSTANCE.w(TAG, "use cache config.");
                return configPayload;
            }
            Logger.INSTANCE.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "Error while parsing cached config: " + e2.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        ConfigPayload.CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        ConfigPayload.CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j2 = 1024;
        return diskSize.longValue() * j2 * j2;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? Constants.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        Boolean boolIsCountryDataProtected;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Integer errorLogLevel;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Boolean metricsEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? Constants.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final Placement getPlacement(String id) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Placement) next).getReferenceId(), id)) {
                obj = next;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : sessionTimeout.intValue())) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue())) * 1000;
    }

    public final ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.IABSettings iab;
        ConfigPayload.IABSettings.TcfStatus.Companion companion = ConfigPayload.IABSettings.TcfStatus.INSTANCE;
        ConfigPayload configPayload = config;
        return companion.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final boolean isCleverCacheEnabled() {
        ConfigPayload.CleverCache cleverCache;
        Boolean enabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean retryPriorityTPATs() {
        Boolean retryPriorityTPATs;
        ConfigPayload configPayload = config;
        if (configPayload == null || (retryPriorityTPATs = configPayload.getRetryPriorityTPATs()) == null) {
            return false;
        }
        return retryPriorityTPATs.booleanValue();
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(ConfigPayload config2, FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationId");
                str = null;
            }
            filePreferences.put(Cookie.CONFIG_APP_ID, str);
            filePreferences.put(Cookie.CONFIG_UPDATE_TIME, System.currentTimeMillis());
            kotlinx.serialization.json.n json2 = getJson();
            XA.Ml mlRl = r.rl(json2.n(), Reflection.typeOf(ConfigPayload.class));
            Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(Cookie.CONFIG_RESPONSE, json2.rl(mlRl, config2));
            filePreferences.apply();
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "Exception: " + e2.getMessage() + " for updating cached config");
        }
    }

    @VisibleForTesting
    public final void updateConfigExtension$vungle_ads_release(final Context context, String ext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        m220updateConfigExtension$lambda1(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$updateConfigExtension$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        })).put(Cookie.CONFIG_EXTENSION, ext).apply();
    }

    @VisibleForTesting
    public final boolean validateConfig$vungle_ads_release(ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    private ConfigManager() {
    }

    /* JADX INFO: renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m216fetchConfigAsync$lambda0(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final FilePreferences m217initWithConfig$lambda2(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final VungleApiClient m218initWithConfig$lambda4(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final Executors m219initWithConfig$lambda5(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final FilePreferences m220updateConfigExtension$lambda1(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }
}
