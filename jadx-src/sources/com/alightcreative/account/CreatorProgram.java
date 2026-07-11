package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.firestore.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/account/CreatorProgram;", "", "tokenCount", "", "downloadCount", "", "<init>", "(DJ)V", "value", "getTokenCount", "()D", "setTokenCount", "(D)V", "getDownloadCount", "()J", "setDownloadCount", "(J)V", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreatorProgram {
    public static final int $stable = 8;
    private long downloadCount;
    private double tokenCount;

    public CreatorProgram() {
        this(0.0d, 0L, 3, null);
    }

    public static /* synthetic */ CreatorProgram copy$default(CreatorProgram creatorProgram, double d2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = creatorProgram.tokenCount;
        }
        if ((i2 & 2) != 0) {
            j2 = creatorProgram.downloadCount;
        }
        return creatorProgram.copy(d2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTokenCount() {
        return this.tokenCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDownloadCount() {
        return this.downloadCount;
    }

    public final CreatorProgram copy(double tokenCount, long downloadCount) {
        return new CreatorProgram(tokenCount, downloadCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatorProgram)) {
            return false;
        }
        CreatorProgram creatorProgram = (CreatorProgram) other;
        return Double.compare(this.tokenCount, creatorProgram.tokenCount) == 0 && this.downloadCount == creatorProgram.downloadCount;
    }

    public int hashCode() {
        return (Double.hashCode(this.tokenCount) * 31) + Long.hashCode(this.downloadCount);
    }

    public String toString() {
        return "CreatorProgram(tokenCount=" + this.tokenCount + ", downloadCount=" + this.downloadCount + ")";
    }

    public CreatorProgram(double d2, long j2) {
        this.tokenCount = d2;
        this.downloadCount = j2;
    }

    @r("downloads")
    public final long getDownloadCount() {
        return this.downloadCount;
    }

    @r("tokens")
    public final double getTokenCount() {
        return this.tokenCount;
    }

    @r("downloads")
    public final void setDownloadCount(long j2) {
        this.downloadCount = j2;
    }

    @r("tokens")
    public final void setTokenCount(double d2) {
        this.tokenCount = d2;
    }

    public /* synthetic */ CreatorProgram(double d2, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0d : d2, (i2 & 2) != 0 ? 0L : j2);
    }
}
