package com.vungle.ads.internal.load;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.DeviceCheckUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.util.Logger;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"com/vungle/ads/internal/load/BaseAdLoader$assetDownloadListener$1", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "partialDownloadRecorded", "", "onError", "", MRAIDPresenter.ERROR, "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "onProgress", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "onStart", "onSuccess", FileUploadManager.f61570h, "Ljava/io/File;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BaseAdLoader$assetDownloadListener$1 implements AssetDownloadListener {
    private boolean partialDownloadRecorded;
    final /* synthetic */ BaseAdLoader this$0;

    BaseAdLoader$assetDownloadListener$1(BaseAdLoader baseAdLoader) {
        this.this$0 = baseAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onError$lambda-1, reason: not valid java name */
    public static final void m242onError$lambda1(DownloadRequest downloadRequest, BaseAdLoader this$0, BaseAdLoader$assetDownloadListener$1 this$1, AssetDownloadListener.DownloadError downloadError) {
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        AdAsset asset = downloadRequest.getAsset();
        if (asset.isPrivacyIcon()) {
            File fileInjectPrivacyIcon = DefaultPrivacyIconInjector.INSTANCE.injectPrivacyIcon(this$0.getPathProvider().getVmDir());
            if (fileInjectPrivacyIcon != null && fileInjectPrivacyIcon.exists()) {
                this$1.onSuccess(fileInjectPrivacyIcon, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        asset.setStatus(AdAsset.Status.DOWNLOAD_FAILED);
        this$0.fullyDownloaded.set(false);
        if (asset.getIsRequired()) {
            this$0.requiredAssetDownloaded.set(false);
        }
        new AssetRequestError("Failed to download assets " + asset.getServerPath() + ". error: " + downloadError + " proxyEnabled=" + DeviceCheckUtils.INSTANCE.isProxyEnabled(this$0.getContext())).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (asset.getIsRequired()) {
            this$0.downloadRequiredAssets.remove(downloadRequest.getAsset().getServerPath());
            if (this$0.downloadRequiredAssets.isEmpty()) {
                this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download required assets."));
                this$0.cancel();
                return;
            }
        }
        if (this$0.downloadCount.decrementAndGet() <= 0) {
            this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onProgress$lambda-0, reason: not valid java name */
    public static final void m243onProgress$lambda0(BaseAdLoader this$0, AdAsset adAsset) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adAsset, "$adAsset");
        this$0.downloadRequiredAssets.remove(adAsset.getServerPath());
        if (this$0.downloadRequiredAssets.isEmpty()) {
            if (this$0.requiredAssetDownloaded.get()) {
                this$0.onRequiredDownloadCompleted();
            } else {
                this$0.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                this$0.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSuccess$lambda-2, reason: not valid java name */
    public static final void m244onSuccess$lambda2(File file, BaseAdLoader$assetDownloadListener$1 this$0, DownloadRequest downloadRequest, BaseAdLoader this$1) throws Throwable {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (!file.exists()) {
            this$0.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        AdAsset asset = downloadRequest.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(AdAsset.Status.DOWNLOAD_SUCCESS);
        if (asset.isHtmlTemplate()) {
            downloadRequest.stopTemplateRecord();
            this$1.templateHtmlSizeMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this$1.templateHtmlSizeMetric, this$1.getLogEntry(), asset.getServerPath());
        } else if (asset.isMainVideo()) {
            this$1.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this$1.mainVideoSizeMetric, this$1.getLogEntry(), asset.getServerPath());
        }
        AdPayload advertisement = this$1.getAdvertisement();
        if (advertisement != null) {
            advertisement.updateAdAssetPath(asset.getAdIdentifier(), file);
        }
        if (asset.isHtmlTemplate() && !this$1.processVmTemplate(asset, this$1.getAdvertisement())) {
            this$1.fullyDownloaded.set(false);
            if (asset.getIsRequired()) {
                this$1.requiredAssetDownloaded.set(false);
            }
        }
        if (asset.getIsRequired()) {
            this$1.downloadRequiredAssets.remove(asset.getServerPath());
            if (this$1.downloadRequiredAssets.isEmpty()) {
                if (!this$1.requiredAssetDownloaded.get()) {
                    this$1.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                    this$1.cancel();
                    return;
                }
                this$1.onRequiredDownloadCompleted();
            }
        }
        if (this$1.downloadCount.decrementAndGet() <= 0) {
            if (this$1.fullyDownloaded.get()) {
                this$1.onDownloadCompleted(this$1.getAdRequest());
            } else {
                this$1.onAdLoadFailed(new AssetRequestError("Failed to download assets."));
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onError(final AssetDownloadListener.DownloadError error, final DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        Logger.INSTANCE.e("BaseAdLoader", "onError called: " + error);
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.Ml
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m242onError$lambda1(downloadRequest, baseAdLoader, this, error);
            }
        });
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) throws Throwable {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        final AdAsset asset = downloadRequest.getAsset();
        Logger.Companion companion = Logger.INSTANCE;
        companion.d("BaseAdLoader", "Download progress: " + progress + " url: " + asset.getServerPath());
        if (!asset.getIsRequired() || asset.getPercentage() == null || progress.getPercent() < asset.getPercentage().intValue() || this.partialDownloadRecorded) {
            return;
        }
        this.partialDownloadRecorded = true;
        downloadRequest.stopPartialDownloadRecord();
        companion.w("BaseAdLoader", "Download progress: hit chunk percentage=" + asset.getPercentage() + " for url: " + asset.getServerPath());
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.n
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                BaseAdLoader$assetDownloadListener$1.m243onProgress$lambda0(baseAdLoader, asset);
            }
        });
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onStart(DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        Logger.INSTANCE.w("BaseAdLoader", "onStart called: " + downloadRequest.getAsset().getServerPath());
        AdAsset asset = downloadRequest.getAsset();
        if (asset.getIsRequired()) {
            Integer percentage = asset.getPercentage();
            if ((percentage != null ? percentage.intValue() : 0) > 0) {
                downloadRequest.startPartialDownloadRecord();
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onSuccess(final File file, final DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.w6
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                BaseAdLoader$assetDownloadListener$1.m244onSuccess$lambda2(file, this, downloadRequest, baseAdLoader);
            }
        });
    }
}
