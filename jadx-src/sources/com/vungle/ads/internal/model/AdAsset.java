package com.vungle.ads.internal.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001@B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010:\u001a\u00020\tH\u0016J\u0006\u0010;\u001a\u00020\u0007J\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020\u0003H\u0016J\u0006\u0010?\u001a\u00020=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\fR\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset;", "", "adIdentifier", "", "serverPath", "localPath", "isRequired", "", "percentage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getAdIdentifier", "()Ljava/lang/String;", "contentLength", "", "getContentLength", "()J", "setContentLength", "(J)V", "fileSize", "getFileSize", "setFileSize", "isDownloaded", "()Z", "isHtmlTemplate", "isMainAssets", "isMainVideo", "isPrivacyIcon", "getLocalPath", "mimeType", "getMimeType", "setMimeType", "(Ljava/lang/String;)V", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rangeEnd", "getRangeEnd", "()Ljava/lang/Long;", "setRangeEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "rangeStart", "getRangeStart", "setRangeStart", "getServerPath", "status", "Lcom/vungle/ads/internal/model/AdAsset$Status;", "getStatus", "()Lcom/vungle/ads/internal/model/AdAsset$Status;", "setStatus", "(Lcom/vungle/ads/internal/model/AdAsset$Status;)V", "waitLock", "Ljava/lang/Object;", "waitingForDownload", "Ljava/util/concurrent/atomic/AtomicBoolean;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "isWaitingForDownload", "notifyDownloadEnough", "", "toString", "waitForDownload", "Status", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdAsset {
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;
    private final String localPath;
    private String mimeType;
    private final Integer percentage;
    private Long rangeEnd;
    private long rangeStart;
    private final String serverPath;
    private Status status;
    private final Object waitLock;
    private final AtomicBoolean waitingForDownload;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset$Status;", "", "(Ljava/lang/String;I)V", "NEW", "DOWNLOAD_RUNNING", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "PROCESSED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(String adIdentifier, String serverPath, String localPath, boolean z2, Integer num) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(serverPath, "serverPath");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z2;
        this.percentage = num;
        this.status = Status.NEW;
        this.mimeType = "application/octet-stream";
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(AdAsset.class, other.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) other;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && Intrinsics.areEqual(this.adIdentifier, adAsset.adIdentifier) && Intrinsics.areEqual(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && Intrinsics.areEqual(this.percentage, adAsset.percentage)) {
            return Intrinsics.areEqual(this.localPath, adAsset.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j2 = this.fileSize;
        int iHashCode2 = (((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Boolean.hashCode(this.isRequired)) * 31;
        long j3 = this.contentLength;
        int i2 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isDownloaded() {
        return this.status == Status.DOWNLOAD_SUCCESS;
    }

    public final boolean isHtmlTemplate() {
        return Intrinsics.areEqual(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isMainAssets() {
        return Intrinsics.areEqual(this.adIdentifier, NativeAdInternal.TOKEN_MAIN_IMAGE) || Intrinsics.areEqual(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isMainVideo() {
        return Intrinsics.areEqual(this.adIdentifier, "MAIN_VIDEO");
    }

    public final boolean isPrivacyIcon() {
        return Intrinsics.areEqual(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void setContentLength(long j2) {
        this.contentLength = j2;
    }

    public final void setFileSize(long j2) {
        this.fileSize = j2;
    }

    public final void setMimeType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setRangeEnd(Long l2) {
        this.rangeEnd = l2;
    }

    public final void setRangeStart(long j2) {
        this.rangeStart = j2;
    }

    public final void setStatus(Status status) {
        Intrinsics.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    public final void waitForDownload() {
        Object objM313constructorimpl;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.waitLock.wait();
                objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
            } finally {
            }
            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
            if (thM316exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("AdAsset", "Interrupted while waiting for file download: " + this, thM316exceptionOrNullimpl);
            }
        }
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z2, (i2 & 16) != 0 ? null : num);
    }
}
