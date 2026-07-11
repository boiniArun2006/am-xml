package com.vungle.ads.internal.downloader;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010$\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010%\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\"\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "transitioning", "", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "cancel", "", AdActivity.REQUEST_KEY_EXTRA, "cancelAll", "checkSpaceAvailable", "", "downloadRequest", "decodeGzipIfNeeded", "Lokhttp3/ResponseBody;", "networkResponse", "Lokhttp3/Response;", "deliverError", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadError", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "deliverSuccess", FileUploadManager.f61570h, "Ljava/io/File;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, NativeAdPresenter.DOWNLOAD, "launchRequest", "onProgressChanged", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "Companion", "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final Lazy okHttpClient;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static OkHttpClient client;

        public final OkHttpClient createOkHttpClient(PathProvider pathProvider) {
            Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderFollowSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
                if (jMin > 0) {
                    builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    Logger.INSTANCE.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            OkHttpClient okHttpClientBuild = builderFollowSslRedirects.build();
            client = okHttpClientBuild;
            return okHttpClientBuild;
        }

        private OkHttpSingleton() {
        }
    }

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final OkHttpClient invoke() {
                return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= 20971520) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener downloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener listener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m233download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(14:286|26|(1:28)|36|282|37|258|38|256|39|(28:41|(5:278|43|44|291|45)(1:55)|280|56|(1:58)|(1:60)(1:62)|259|63|64|261|65|(3:272|67|68)(1:73)|274|74|75|266|76|77|(4:(3:79|276|80)(1:87)|88|89|(3:284|91|(2:93|(1:297)(12:97|(1:99)(1:101)|100|102|(1:126)(7:106|107|268|108|109|288|110)|111|127|(1:129)(1:130)|301|(4:133|(2:135|299)(1:300)|136|131)|298|137))(3:296|138|139))(1:295))|96|289|140|(1:142)|143|(1:147)|(1:149)|150|(2:158|(2:160|161)(2:162|163))(3:152|156|157))(4:198|293|199|200)|191|192|193)|264|215|(1:217)(1:218)|(1:222)|(1:224)|225|(2:231|(2:233|303)(2:234|235))(2:230|302)) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x054f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0262, code lost:
    
        r7.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171 A[Catch: all -> 0x0471, Exception -> 0x0476, TRY_LEAVE, TryCatch #4 {Exception -> 0x0476, blocks: (B:39:0x016b, B:41:0x0171), top: B:256:0x016b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void launchRequest(DownloadRequest downloadRequest, AssetDownloadListener downloadListener) throws Throwable {
        String str;
        String str2;
        BufferedSink bufferedSink;
        Response responseExecute;
        Call call;
        int status;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion;
        ResponseBody responseBodyOkhttp3Response_body;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion2;
        int status2;
        ResponseBody responseBodyOkhttp3Response_body2;
        File parentFile;
        Call callNewCall;
        BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source;
        BufferedSink bufferedSinkBuffer;
        long contentLength;
        AdAsset adAsset;
        long j2;
        long j3;
        String str3;
        Response response;
        ResponseBody responseBodyOkhttp3Response_body3;
        String str4;
        StringBuilder sb;
        AdAsset asset = downloadRequest.getAsset();
        Logger.Companion companion3 = Logger.INSTANCE;
        companion3.d(TAG, "launch request in thread: " + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        if (downloadRequest.isCancelled()) {
            companion3.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new AssetDownloadListener.Progress().setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
            return;
        }
        AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int iCode = -1;
        if (serverPath.length() == 0 || !FileUtility.INSTANCE.isValidUrl(serverPath)) {
            deliverError(downloadRequest, downloadListener, new AssetDownloadListener.DownloadError(-1, new InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
            return;
        }
        if (localPath.length() == 0) {
            deliverError(downloadRequest, downloadListener, new AssetDownloadListener.DownloadError(-1, new AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()));
            return;
        }
        BufferedSource bufferedSource = null;
        if (!checkSpaceAvailable(downloadRequest)) {
            deliverError(downloadRequest, downloadListener, new AssetDownloadListener.DownloadError(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR()));
            return;
        }
        File file = new File(localPath);
        if (downloadListener != null) {
            downloadListener.onStart(downloadRequest);
            Unit unit = Unit.INSTANCE;
        }
        try {
            parentFile = file.getParentFile();
        } catch (Exception e2) {
            e = e2;
            str = "download status: ";
            str2 = "On cancel ";
            bufferedSink = null;
            bufferedSource = null;
            responseExecute = null;
            call = null;
        } catch (Throwable th) {
            th = th;
            str = "download status: ";
            str2 = "On cancel ";
            bufferedSink = null;
            bufferedSource = null;
            responseExecute = null;
            call = null;
        }
        if (parentFile == null) {
            callNewCall = getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
            responseExecute = FirebasePerfOkHttpClient.execute(callNewCall);
            iCode = responseExecute.code();
            if (!responseExecute.isSuccessful()) {
            }
            str2 = "On cancel ";
            bufferedSink = null;
            bufferedSource = null;
            Logger.Companion companion4 = Logger.INSTANCE;
            companion4.e(TAG, String.valueOf(e));
            companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
            progress.setStatus(companion2.getERROR());
            AssetDownloadListener.DownloadError downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
            if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                responseBodyOkhttp3Response_body2.close();
                Unit unit2 = Unit.INSTANCE;
            }
            if (call != null) {
            }
            FileUtility fileUtility = FileUtility.INSTANCE;
            fileUtility.closeQuietly(bufferedSink);
            fileUtility.closeQuietly(bufferedSource);
            companion4.d(TAG, str + progress.getStatus());
            status2 = progress.getStatus();
            if (status2 == companion2.getERROR()) {
                if (status2 == companion2.getCANCELLED()) {
                }
            }
            deliverError(downloadRequest, downloadListener, downloadError);
            return;
        }
        try {
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            callNewCall = getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
            try {
                responseExecute = FirebasePerfOkHttpClient.execute(callNewCall);
                try {
                    try {
                        iCode = responseExecute.code();
                        try {
                            if (!responseExecute.isSuccessful()) {
                                if (responseExecute.cacheResponse() != null) {
                                    try {
                                        call = callNewCall;
                                    } catch (Exception e3) {
                                        e = e3;
                                        call = callNewCall;
                                        str = "download status: ";
                                        bufferedSink = null;
                                        bufferedSource = null;
                                        str2 = "On cancel ";
                                        Logger.Companion companion42 = Logger.INSTANCE;
                                        companion42.e(TAG, String.valueOf(e));
                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        progress.setStatus(companion2.getERROR());
                                        AssetDownloadListener.DownloadError downloadError2 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        FileUtility fileUtility2 = FileUtility.INSTANCE;
                                        fileUtility2.closeQuietly(bufferedSink);
                                        fileUtility2.closeQuietly(bufferedSource);
                                        companion42.d(TAG, str + progress.getStatus());
                                        status2 = progress.getStatus();
                                        if (status2 == companion2.getERROR()) {
                                        }
                                        deliverError(downloadRequest, downloadListener, downloadError2);
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        call = callNewCall;
                                        str = "download status: ";
                                        bufferedSink = null;
                                        bufferedSource = null;
                                        str2 = "On cancel ";
                                        if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        FileUtility fileUtility3 = FileUtility.INSTANCE;
                                        fileUtility3.closeQuietly(bufferedSink);
                                        fileUtility3.closeQuietly(bufferedSource);
                                        Logger.Companion companion5 = Logger.INSTANCE;
                                        companion5.d(TAG, str + progress.getStatus());
                                        status = progress.getStatus();
                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        if (status != companion.getERROR()) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                                        Unit unit3 = Unit.INSTANCE;
                                    } catch (Exception e4) {
                                        e = e4;
                                        str = "download status: ";
                                        bufferedSink = null;
                                        bufferedSource = null;
                                        str2 = "On cancel ";
                                        Logger.Companion companion422 = Logger.INSTANCE;
                                        companion422.e(TAG, String.valueOf(e));
                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        progress.setStatus(companion2.getERROR());
                                        AssetDownloadListener.DownloadError downloadError22 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        FileUtility fileUtility22 = FileUtility.INSTANCE;
                                        fileUtility22.closeQuietly(bufferedSink);
                                        fileUtility22.closeQuietly(bufferedSource);
                                        companion422.d(TAG, str + progress.getStatus());
                                        status2 = progress.getStatus();
                                        if (status2 == companion2.getERROR()) {
                                        }
                                        deliverError(downloadRequest, downloadListener, downloadError22);
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = "download status: ";
                                        bufferedSink = null;
                                        bufferedSource = null;
                                        str2 = "On cancel ";
                                        if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        FileUtility fileUtility32 = FileUtility.INSTANCE;
                                        fileUtility32.closeQuietly(bufferedSink);
                                        fileUtility32.closeQuietly(bufferedSource);
                                        Logger.Companion companion52 = Logger.INSTANCE;
                                        companion52.d(TAG, str + progress.getStatus());
                                        status = progress.getStatus();
                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        if (status != companion.getERROR()) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    call = callNewCall;
                                }
                                try {
                                    ResponseBody responseBodyDecodeGzipIfNeeded = decodeGzipIfNeeded(responseExecute);
                                    String strHeader$default = Response.header$default(responseExecute, "Content-Type", null, 2, null);
                                    if (strHeader$default != null) {
                                        downloadRequest.getAsset().setMimeType(strHeader$default);
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    bufferedSourceRetrofitExceptionCatchingRequestBody_source = responseBodyDecodeGzipIfNeeded != null ? LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyDecodeGzipIfNeeded) : null;
                                    try {
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            try {
                                                sb2.append("Start download from url: ");
                                                sb2.append(serverPath);
                                                sb2.append(" mimeType=");
                                                sb2.append(strHeader$default);
                                                companion3.d(TAG, sb2.toString());
                                                bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file, false, 1, null));
                                                if (responseBodyDecodeGzipIfNeeded != null) {
                                                    try {
                                                        contentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        str = "download status: ";
                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                        bufferedSink = bufferedSinkBuffer;
                                                        iCode = iCode;
                                                        str2 = "On cancel ";
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        str = "download status: ";
                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                        bufferedSink = bufferedSinkBuffer;
                                                        str2 = "On cancel ";
                                                    }
                                                } else {
                                                    contentLength = 0;
                                                }
                                                try {
                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                                                    progress.setSizeBytes(contentLength);
                                                    String str5 = "On cancel ";
                                                    try {
                                                        progress.setReadBytes(0L);
                                                        progress.setProgressPercent(0);
                                                        asset.setContentLength(contentLength);
                                                        onProgressChanged(downloadRequest, progress, downloadListener);
                                                        int i2 = 0;
                                                        long j4 = 0;
                                                        while (true) {
                                                            if (bufferedSourceRetrofitExceptionCatchingRequestBody_source != null) {
                                                                adAsset = asset;
                                                                try {
                                                                    j2 = j4;
                                                                    j3 = bufferedSourceRetrofitExceptionCatchingRequestBody_source.read(bufferedSinkBuffer.getBuffer(), 2048L);
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    str2 = str5;
                                                                    bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                    bufferedSink = bufferedSinkBuffer;
                                                                    str = "download status: ";
                                                                    iCode = iCode;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    str2 = str5;
                                                                    bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                    bufferedSink = bufferedSinkBuffer;
                                                                    str = "download status: ";
                                                                }
                                                            } else {
                                                                adAsset = asset;
                                                                j2 = j4;
                                                                j3 = -1;
                                                            }
                                                            Unit unit5 = Unit.INSTANCE;
                                                            if (j3 <= 0) {
                                                                break;
                                                            }
                                                            try {
                                                                if (!file.exists()) {
                                                                    new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                                    throw new Downloader.RequestException("File is not existing");
                                                                }
                                                                if (downloadRequest.isCancelled()) {
                                                                    break;
                                                                }
                                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                                                bufferedSinkBuffer.emit();
                                                                bufferedSinkBuffer.flush();
                                                                j4 = j2 + j3;
                                                                progress.setReadBytes(j4);
                                                                Long rangeEnd = adAsset.getRangeEnd();
                                                                long j5 = contentLength;
                                                                long jLongValue = rangeEnd != null ? rangeEnd.longValue() : adAsset.getRangeStart();
                                                                if (!adAsset.isWaitingForDownload() || j4 < jLongValue) {
                                                                    str4 = str5;
                                                                    response = responseExecute;
                                                                } else {
                                                                    Logger.Companion companion6 = Logger.INSTANCE;
                                                                    str4 = str5;
                                                                    try {
                                                                        sb = new StringBuilder();
                                                                        response = responseExecute;
                                                                    } catch (Exception e7) {
                                                                        e = e7;
                                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                        bufferedSink = bufferedSinkBuffer;
                                                                        str = "download status: ";
                                                                        iCode = iCode;
                                                                        str2 = str4;
                                                                        Logger.Companion companion4222 = Logger.INSTANCE;
                                                                        companion4222.e(TAG, String.valueOf(e));
                                                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        progress.setStatus(companion2.getERROR());
                                                                        AssetDownloadListener.DownloadError downloadError222 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                        if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                                                        }
                                                                        if (call != null) {
                                                                        }
                                                                        FileUtility fileUtility222 = FileUtility.INSTANCE;
                                                                        fileUtility222.closeQuietly(bufferedSink);
                                                                        fileUtility222.closeQuietly(bufferedSource);
                                                                        companion4222.d(TAG, str + progress.getStatus());
                                                                        status2 = progress.getStatus();
                                                                        if (status2 == companion2.getERROR()) {
                                                                        }
                                                                        deliverError(downloadRequest, downloadListener, downloadError222);
                                                                        return;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                        bufferedSink = bufferedSinkBuffer;
                                                                        str = "download status: ";
                                                                        str2 = str4;
                                                                        if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                                                            responseBodyOkhttp3Response_body.close();
                                                                            Unit unit6 = Unit.INSTANCE;
                                                                        }
                                                                        if (call != null) {
                                                                        }
                                                                        FileUtility fileUtility322 = FileUtility.INSTANCE;
                                                                        fileUtility322.closeQuietly(bufferedSink);
                                                                        fileUtility322.closeQuietly(bufferedSource);
                                                                        Logger.Companion companion522 = Logger.INSTANCE;
                                                                        companion522.d(TAG, str + progress.getStatus());
                                                                        status = progress.getStatus();
                                                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        if (status != companion.getERROR()) {
                                                                            deliverError(downloadRequest, downloadListener, null);
                                                                        }
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        sb.append("Downloader totalRead=");
                                                                        sb.append(j4);
                                                                        sb.append(" requiredBytes=");
                                                                        sb.append(jLongValue);
                                                                        companion6.e(TAG, sb.toString());
                                                                        adAsset.notifyDownloadEnough();
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                        bufferedSink = bufferedSinkBuffer;
                                                                        str = "download status: ";
                                                                        iCode = iCode;
                                                                        str2 = str4;
                                                                        responseExecute = response;
                                                                        Logger.Companion companion42222 = Logger.INSTANCE;
                                                                        companion42222.e(TAG, String.valueOf(e));
                                                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        progress.setStatus(companion2.getERROR());
                                                                        AssetDownloadListener.DownloadError downloadError2222 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                        if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                                                        }
                                                                        if (call != null) {
                                                                        }
                                                                        FileUtility fileUtility2222 = FileUtility.INSTANCE;
                                                                        fileUtility2222.closeQuietly(bufferedSink);
                                                                        fileUtility2222.closeQuietly(bufferedSource);
                                                                        companion42222.d(TAG, str + progress.getStatus());
                                                                        status2 = progress.getStatus();
                                                                        if (status2 == companion2.getERROR()) {
                                                                        }
                                                                        deliverError(downloadRequest, downloadListener, downloadError2222);
                                                                        return;
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                                        bufferedSink = bufferedSinkBuffer;
                                                                        str = "download status: ";
                                                                        str2 = str4;
                                                                        responseExecute = response;
                                                                        if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                                                        }
                                                                        if (call != null) {
                                                                        }
                                                                        FileUtility fileUtility3222 = FileUtility.INSTANCE;
                                                                        fileUtility3222.closeQuietly(bufferedSink);
                                                                        fileUtility3222.closeQuietly(bufferedSource);
                                                                        Logger.Companion companion5222 = Logger.INSTANCE;
                                                                        companion5222.d(TAG, str + progress.getStatus());
                                                                        status = progress.getStatus();
                                                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        if (status != companion.getERROR()) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                int i3 = j5 > 0 ? (int) ((((long) 100) * j4) / j5) : i2;
                                                                while (progress.getPercent() + 1 <= Math.min(i3, 100)) {
                                                                    AssetDownloadListener.Progress.ProgressStatus.Companion companion7 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                    progress.setStatus(companion7.getIN_PROGRESS());
                                                                    progress.setProgressPercent(progress.getPercent() + 1);
                                                                    if (progress.getPercent() >= 100) {
                                                                        progress.setStatus(companion7.getDONE());
                                                                    }
                                                                    onProgressChanged(downloadRequest, progress, downloadListener);
                                                                }
                                                                i2 = i3;
                                                                asset = adAsset;
                                                                str5 = str4;
                                                                responseExecute = response;
                                                                contentLength = j5;
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                str4 = str5;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                str4 = str5;
                                                            }
                                                        }
                                                        str3 = str5;
                                                        response = responseExecute;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        str2 = str5;
                                                        str = "download status: ";
                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                        bufferedSink = bufferedSinkBuffer;
                                                        iCode = iCode;
                                                        Logger.Companion companion422222 = Logger.INSTANCE;
                                                        companion422222.e(TAG, String.valueOf(e));
                                                        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                        progress.setStatus(companion2.getERROR());
                                                        AssetDownloadListener.DownloadError downloadError22222 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                        if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                                        }
                                                        if (call != null) {
                                                        }
                                                        FileUtility fileUtility22222 = FileUtility.INSTANCE;
                                                        fileUtility22222.closeQuietly(bufferedSink);
                                                        fileUtility22222.closeQuietly(bufferedSource);
                                                        companion422222.d(TAG, str + progress.getStatus());
                                                        status2 = progress.getStatus();
                                                        if (status2 == companion2.getERROR()) {
                                                        }
                                                        deliverError(downloadRequest, downloadListener, downloadError22222);
                                                        return;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        str2 = str5;
                                                        str = "download status: ";
                                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                        bufferedSink = bufferedSinkBuffer;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    str = "download status: ";
                                                    str2 = "On cancel ";
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str = "download status: ";
                                                    str2 = "On cancel ";
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                str = "download status: ";
                                                str2 = "On cancel ";
                                                bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                                iCode = iCode;
                                                bufferedSink = null;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            str = "download status: ";
                                            str2 = "On cancel ";
                                            bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                            bufferedSink = null;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str = "download status: ";
                                        str2 = "On cancel ";
                                        bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    str = "download status: ";
                                    str2 = "On cancel ";
                                    bufferedSink = null;
                                    bufferedSource = null;
                                } catch (Throwable th12) {
                                    th = th12;
                                    str = "download status: ";
                                    str2 = "On cancel ";
                                    bufferedSink = null;
                                    bufferedSource = null;
                                }
                                try {
                                    bufferedSinkBuffer.flush();
                                    int status3 = progress.getStatus();
                                    AssetDownloadListener.Progress.ProgressStatus.Companion companion8 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                    if (status3 == companion8.getIN_PROGRESS()) {
                                        progress.setStatus(companion8.getDONE());
                                        onProgressChanged(downloadRequest, progress, downloadListener);
                                    }
                                    if (LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) != null && (responseBodyOkhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response)) != null) {
                                        responseBodyOkhttp3Response_body3.close();
                                    }
                                    if (call != null) {
                                        call.cancel();
                                    }
                                    FileUtility fileUtility4 = FileUtility.INSTANCE;
                                    fileUtility4.closeQuietly(bufferedSinkBuffer);
                                    fileUtility4.closeQuietly(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                                    Logger.Companion companion9 = Logger.INSTANCE;
                                    companion9.d(TAG, "download status: " + progress.getStatus());
                                    int status4 = progress.getStatus();
                                    if (status4 == companion8.getERROR() || status4 == companion8.getSTARTED()) {
                                        deliverError(downloadRequest, downloadListener, null);
                                        return;
                                    }
                                    if (status4 != companion8.getCANCELLED()) {
                                        deliverSuccess(file, downloadRequest, downloadListener);
                                        return;
                                    }
                                    companion9.d(TAG, str3 + downloadRequest);
                                    onProgressChanged(downloadRequest, progress, downloadListener);
                                    return;
                                } catch (Exception e15) {
                                    e = e15;
                                    str = "download status: ";
                                    str2 = str3;
                                    bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                    bufferedSink = bufferedSinkBuffer;
                                    iCode = iCode;
                                    responseExecute = response;
                                    Logger.Companion companion4222222 = Logger.INSTANCE;
                                    companion4222222.e(TAG, String.valueOf(e));
                                    companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                    progress.setStatus(companion2.getERROR());
                                    AssetDownloadListener.DownloadError downloadError222222 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                    if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                    }
                                    if (call != null) {
                                    }
                                    FileUtility fileUtility222222 = FileUtility.INSTANCE;
                                    fileUtility222222.closeQuietly(bufferedSink);
                                    fileUtility222222.closeQuietly(bufferedSource);
                                    companion4222222.d(TAG, str + progress.getStatus());
                                    status2 = progress.getStatus();
                                    if (status2 == companion2.getERROR()) {
                                    }
                                    deliverError(downloadRequest, downloadListener, downloadError222222);
                                    return;
                                } catch (Throwable th13) {
                                    th = th13;
                                    str = "download status: ";
                                    str2 = str3;
                                    bufferedSource = bufferedSourceRetrofitExceptionCatchingRequestBody_source;
                                    bufferedSink = bufferedSinkBuffer;
                                    responseExecute = response;
                                    if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                    }
                                    if (call != null) {
                                    }
                                    FileUtility fileUtility32222 = FileUtility.INSTANCE;
                                    fileUtility32222.closeQuietly(bufferedSink);
                                    fileUtility32222.closeQuietly(bufferedSource);
                                    Logger.Companion companion52222 = Logger.INSTANCE;
                                    companion52222.d(TAG, str + progress.getStatus());
                                    status = progress.getStatus();
                                    companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                    if (status != companion.getERROR()) {
                                    }
                                    throw th;
                                }
                            }
                            str = "download status: ";
                            call = callNewCall;
                            str2 = "On cancel ";
                            try {
                                throw new Downloader.RequestException(responseExecute.message());
                            } catch (Exception e16) {
                                e = e16;
                                iCode = iCode;
                                responseExecute = responseExecute;
                            } catch (Throwable th14) {
                                th = th14;
                                responseExecute = responseExecute;
                                bufferedSink = null;
                                bufferedSource = null;
                                if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
                                }
                                if (call != null) {
                                }
                                FileUtility fileUtility322222 = FileUtility.INSTANCE;
                                fileUtility322222.closeQuietly(bufferedSink);
                                fileUtility322222.closeQuietly(bufferedSource);
                                Logger.Companion companion522222 = Logger.INSTANCE;
                                companion522222.d(TAG, str + progress.getStatus());
                                status = progress.getStatus();
                                companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                if (status != companion.getERROR()) {
                                }
                                throw th;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            str = "download status: ";
                            call = callNewCall;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        str = "download status: ";
                        call = callNewCall;
                    }
                } catch (Exception e18) {
                    e = e18;
                    str = "download status: ";
                    call = callNewCall;
                }
                str2 = "On cancel ";
                bufferedSink = null;
                bufferedSource = null;
            } catch (Exception e19) {
                e = e19;
                str = "download status: ";
                call = callNewCall;
                str2 = "On cancel ";
                bufferedSink = null;
                bufferedSource = null;
                responseExecute = null;
            } catch (Throwable th16) {
                th = th16;
                str = "download status: ";
                call = callNewCall;
                str2 = "On cancel ";
                bufferedSink = null;
                bufferedSource = null;
                responseExecute = null;
            }
        } catch (Exception e20) {
            e = e20;
            str = "download status: ";
            bufferedSink = null;
            responseExecute = null;
            call = null;
            str2 = "On cancel ";
            Logger.Companion companion42222222 = Logger.INSTANCE;
            companion42222222.e(TAG, String.valueOf(e));
            companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
            progress.setStatus(companion2.getERROR());
            AssetDownloadListener.DownloadError downloadError2222222 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
            if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
            }
            if (call != null) {
            }
            FileUtility fileUtility2222222 = FileUtility.INSTANCE;
            fileUtility2222222.closeQuietly(bufferedSink);
            fileUtility2222222.closeQuietly(bufferedSource);
            companion42222222.d(TAG, str + progress.getStatus());
            status2 = progress.getStatus();
            if (status2 == companion2.getERROR()) {
            }
            deliverError(downloadRequest, downloadListener, downloadError2222222);
            return;
        } catch (Throwable th17) {
            th = th17;
            str = "download status: ";
            bufferedSink = null;
            responseExecute = null;
            call = null;
            str2 = "On cancel ";
            if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null) {
            }
            if (call != null) {
            }
            FileUtility fileUtility3222222 = FileUtility.INSTANCE;
            fileUtility3222222.closeQuietly(bufferedSink);
            fileUtility3222222.closeQuietly(bufferedSource);
            Logger.Companion companion5222222 = Logger.INSTANCE;
            companion5222222.d(TAG, str + progress.getStatus());
            status = progress.getStatus();
            companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
            if (status != companion.getERROR()) {
            }
            throw th;
        }
        Logger.Companion companion422222222 = Logger.INSTANCE;
        companion422222222.e(TAG, String.valueOf(e));
        companion2 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
        progress.setStatus(companion2.getERROR());
        AssetDownloadListener.DownloadError downloadError22222222 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
        if ((responseExecute != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null && (responseBodyOkhttp3Response_body2 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute)) != null) {
            responseBodyOkhttp3Response_body2.close();
            Unit unit22 = Unit.INSTANCE;
        }
        if (call != null) {
            call.cancel();
            Unit unit7 = Unit.INSTANCE;
        }
        FileUtility fileUtility22222222 = FileUtility.INSTANCE;
        fileUtility22222222.closeQuietly(bufferedSink);
        fileUtility22222222.closeQuietly(bufferedSource);
        companion422222222.d(TAG, str + progress.getStatus());
        status2 = progress.getStatus();
        if (status2 == companion2.getERROR() || status2 == companion2.getSTARTED()) {
            deliverError(downloadRequest, downloadListener, downloadError22222222);
            return;
        }
        if (status2 == companion2.getCANCELLED()) {
            deliverSuccess(file, downloadRequest, downloadListener);
            return;
        }
        companion422222222.d(TAG, str2 + downloadRequest);
        onProgressChanged(downloadRequest, progress, downloadListener);
        return;
        if ((responseExecute == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute) : null) != null && (responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(responseExecute)) != null) {
            responseBodyOkhttp3Response_body.close();
            Unit unit62 = Unit.INSTANCE;
        }
        if (call != null) {
            call.cancel();
            Unit unit8 = Unit.INSTANCE;
        }
        FileUtility fileUtility32222222 = FileUtility.INSTANCE;
        fileUtility32222222.closeQuietly(bufferedSink);
        fileUtility32222222.closeQuietly(bufferedSource);
        Logger.Companion companion52222222 = Logger.INSTANCE;
        companion52222222.d(TAG, str + progress.getStatus());
        status = progress.getStatus();
        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
        if (status != companion.getERROR() || status == companion.getSTARTED()) {
            deliverError(downloadRequest, downloadListener, null);
        } else if (status == companion.getCANCELLED()) {
            companion52222222.d(TAG, str2 + downloadRequest);
            onProgressChanged(downloadRequest, progress, downloadListener);
        } else {
            deliverSuccess(file, downloadRequest, downloadListener);
        }
        throw th;
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, downloadListener);
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.j
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m233download$lambda0(downloadRequest, this, downloadListener);
            }
        });
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(networkResponse);
        if (StringsKt.equals(GZIP, Response.header$default(networkResponse, CONTENT_ENCODING, null, 2, null), true) && responseBodyOkhttp3Response_body != null) {
            return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyOkhttp3Response_body))));
        }
        return responseBodyOkhttp3Response_body;
    }
}
