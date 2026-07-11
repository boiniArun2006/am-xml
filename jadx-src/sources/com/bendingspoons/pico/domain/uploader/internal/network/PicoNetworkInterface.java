package com.bendingspoons.pico.domain.uploader.internal.network;

import La.Ml;
import com.bendingspoons.pico.domain.uploader.internal.network.entities.PicoNetworkPacket;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import eu.C1971j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nLb.n;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface PicoNetworkInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f51504n = j.f51505n;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bendingspoons/pico/domain/uploader/internal/network/PicoNetworkInterface$ErrorResponse;", "", "message", "", "errorCode", "", "<init>", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getErrorCode", "()I", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorResponse {

        @Json(name = "error_code")
        private final int errorCode;

        @Json(name = "message")
        private final String message;

        public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = errorResponse.message;
            }
            if ((i3 & 2) != 0) {
                i2 = errorResponse.errorCode;
            }
            return errorResponse.copy(str, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public final ErrorResponse copy(String message, int errorCode) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorResponse(message, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorResponse)) {
                return false;
            }
            ErrorResponse errorResponse = (ErrorResponse) other;
            return Intrinsics.areEqual(this.message, errorResponse.message) && this.errorCode == errorResponse.errorCode;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + Integer.hashCode(this.errorCode);
        }

        public String toString() {
            return "ErrorResponse(message=" + this.message + ", errorCode=" + this.errorCode + ")";
        }

        public ErrorResponse(String message, int i2) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.errorCode = i2;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bendingspoons/pico/domain/uploader/internal/network/PicoNetworkInterface$SuccessResponse;", "", "delta", "", "lastEventTimestamp", "", "<init>", "(ID)V", "getDelta", "()I", "getLastEventTimestamp", "()D", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuccessResponse {

        @Json(name = "delta")
        private final int delta;

        @Json(name = "last_event_timestamp")
        private final double lastEventTimestamp;

        public final int getDelta() {
            return this.delta;
        }

        public final double getLastEventTimestamp() {
            return this.lastEventTimestamp;
        }

        public SuccessResponse(int i2, double d2) {
            this.delta = i2;
            this.lastEventTimestamp = d2;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f51505n = new j();

        public final PicoNetworkInterface n(Ml.n.InterfaceC0214n.j idsConfig, Ml.n.j backendConfig, rB.Ml spiderSense, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(idsConfig, "idsConfig");
            Intrinsics.checkNotNullParameter(backendConfig, "backendConfig");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return new C1971j(n.INSTANCE.rl(idsConfig, backendConfig, spiderSense, okHttpClient));
        }

        private j() {
        }
    }

    Object n(PicoNetworkPacket picoNetworkPacket, Continuation continuation);
}
