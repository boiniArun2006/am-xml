package com.vungle.ads.internal.downloader;

import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "", "onError", "", MRAIDPresenter.ERROR, "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "onProgress", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "onStart", "onSuccess", FileUploadManager.f61570h, "Ljava/io/File;", "DownloadError", "Progress", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AssetDownloadListener {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "", "serverCode", "", "cause", "", JavetError.PARAMETER_REASON, "(ILjava/lang/Throwable;I)V", "getCause", "()Ljava/lang/Throwable;", "getReason", "()I", "getServerCode", "toString", "", "Companion", "ErrorReason", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DownloadError {
        public static final int DEFAULT_SERVER_CODE = -1;
        private final Throwable cause;

        @ErrorReason
        private final int reason;
        private final int serverCode;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError$ErrorReason;", "", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ErrorReason {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError$ErrorReason$Companion;", "", "()V", "CONNECTION_ERROR", "", "getCONNECTION_ERROR", "()I", "setCONNECTION_ERROR", "(I)V", "DISK_ERROR", "getDISK_ERROR", "setDISK_ERROR", "FILE_NOT_FOUND_ERROR", "getFILE_NOT_FOUND_ERROR", "setFILE_NOT_FOUND_ERROR", "INTERNAL_ERROR", "getINTERNAL_ERROR", "setINTERNAL_ERROR", "REQUEST_ERROR", "getREQUEST_ERROR", "setREQUEST_ERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                private static int CONNECTION_ERROR;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                public final int getCONNECTION_ERROR() {
                    return CONNECTION_ERROR;
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setCONNECTION_ERROR(int i2) {
                    CONNECTION_ERROR = i2;
                }

                public final void setDISK_ERROR(int i2) {
                    DISK_ERROR = i2;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i2) {
                    FILE_NOT_FOUND_ERROR = i2;
                }

                public final void setINTERNAL_ERROR(int i2) {
                    INTERNAL_ERROR = i2;
                }

                public final void setREQUEST_ERROR(int i2) {
                    REQUEST_ERROR = i2;
                }

                private Companion() {
                }
            }
        }

        public DownloadError(int i2, Throwable cause, int i3) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.serverCode = i2;
            this.cause = cause;
            this.reason = i3;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }

        public String toString() {
            return "DownloadError(serverCode=" + this.serverCode + ", reason=" + this.reason + ", cause=" + this.cause + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "", "()V", "progressPercent", "", "getProgressPercent", "()I", "setProgressPercent", "(I)V", "readBytes", "", "getReadBytes", "()J", "setReadBytes", "(J)V", "sizeBytes", "getSizeBytes", "setSizeBytes", "status", "getStatus$annotations", "getStatus", "setStatus", "timestampDownloadStart", "getTimestampDownloadStart", "setTimestampDownloadStart", "toString", "", "ProgressStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Progress {

        /* JADX INFO: renamed from: progressPercent, reason: from kotlin metadata and from toString */
        private int percent;

        /* JADX INFO: renamed from: readBytes, reason: from kotlin metadata and from toString */
        private long readed;

        /* JADX INFO: renamed from: sizeBytes, reason: from kotlin metadata and from toString */
        private long total;
        private int status;

        /* JADX INFO: renamed from: timestampDownloadStart, reason: from kotlin metadata and from toString */
        private long startAt;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress$ProgressStatus;", "", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ProgressStatus {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress$ProgressStatus$Companion;", "", "()V", "CANCELLED", "", "getCANCELLED", "()I", "setCANCELLED", "(I)V", "DONE", "getDONE", "setDONE", "ERROR", "getERROR", "setERROR", "IN_PROGRESS", "getIN_PROGRESS", "setIN_PROGRESS", "LOST_CONNECTION", "getLOST_CONNECTION", "setLOST_CONNECTION", "PAUSED", "getPAUSED", "setPAUSED", "STARTED", "getSTARTED", "setSTARTED", "STATE_CHANGED", "getSTATE_CHANGED", "setSTATE_CHANGED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                private static int STARTED;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int IN_PROGRESS = 1;
                private static int PAUSED = 2;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int LOST_CONNECTION = 5;
                private static int STATE_CHANGED = 6;
                private static int ERROR = 7;

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getLOST_CONNECTION() {
                    return LOST_CONNECTION;
                }

                public final int getPAUSED() {
                    return PAUSED;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final int getSTATE_CHANGED() {
                    return STATE_CHANGED;
                }

                public final void setCANCELLED(int i2) {
                    CANCELLED = i2;
                }

                public final void setDONE(int i2) {
                    DONE = i2;
                }

                public final void setERROR(int i2) {
                    ERROR = i2;
                }

                public final void setIN_PROGRESS(int i2) {
                    IN_PROGRESS = i2;
                }

                public final void setLOST_CONNECTION(int i2) {
                    LOST_CONNECTION = i2;
                }

                public final void setPAUSED(int i2) {
                    PAUSED = i2;
                }

                public final void setSTARTED(int i2) {
                    STARTED = i2;
                }

                public final void setSTATE_CHANGED(int i2) {
                    STATE_CHANGED = i2;
                }

                private Companion() {
                }
            }
        }

        @ProgressStatus
        public static /* synthetic */ void getStatus$annotations() {
        }

        /* JADX INFO: renamed from: getProgressPercent, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* JADX INFO: renamed from: getReadBytes, reason: from getter */
        public final long getReaded() {
            return this.readed;
        }

        /* JADX INFO: renamed from: getSizeBytes, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: getTimestampDownloadStart, reason: from getter */
        public final long getStartAt() {
            return this.startAt;
        }

        public final void setProgressPercent(int i2) {
            this.percent = i2;
        }

        public final void setReadBytes(long j2) {
            this.readed = j2;
        }

        public final void setSizeBytes(long j2) {
            this.total = j2;
        }

        public final void setStatus(int i2) {
            this.status = i2;
        }

        public final void setTimestampDownloadStart(long j2) {
            this.startAt = j2;
        }

        public String toString() {
            return "Progress(status=" + this.status + ", percent=" + this.percent + ", startAt=" + this.startAt + ", readed=" + this.readed + ", total=" + this.total + ')';
        }
    }

    void onError(DownloadError error, DownloadRequest downloadRequest);

    void onProgress(Progress progress, DownloadRequest downloadRequest);

    void onStart(DownloadRequest downloadRequest);

    void onSuccess(File file, DownloadRequest downloadRequest);
}
