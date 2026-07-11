package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/alightcreative/account/RankingProgram;", "", "status", "", "rank", "", "downloads", "socials", "Lcom/alightcreative/account/SocialsData;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ILcom/alightcreative/account/SocialsData;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getRank", "()Ljava/lang/Integer;", "setRank", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDownloads", "()I", "setDownloads", "(I)V", "getSocials", "()Lcom/alightcreative/account/SocialsData;", "setSocials", "(Lcom/alightcreative/account/SocialsData;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ILcom/alightcreative/account/SocialsData;)Lcom/alightcreative/account/RankingProgram;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RankingProgram {
    public static final int $stable = 8;
    private int downloads;
    private Integer rank;
    private SocialsData socials;
    private String status;

    public RankingProgram() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ RankingProgram copy$default(RankingProgram rankingProgram, String str, Integer num, int i2, SocialsData socialsData, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rankingProgram.status;
        }
        if ((i3 & 2) != 0) {
            num = rankingProgram.rank;
        }
        if ((i3 & 4) != 0) {
            i2 = rankingProgram.downloads;
        }
        if ((i3 & 8) != 0) {
            socialsData = rankingProgram.socials;
        }
        return rankingProgram.copy(str, num, i2, socialsData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDownloads() {
        return this.downloads;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SocialsData getSocials() {
        return this.socials;
    }

    public final RankingProgram copy(String status, Integer rank, int downloads, SocialsData socials) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new RankingProgram(status, rank, downloads, socials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingProgram)) {
            return false;
        }
        RankingProgram rankingProgram = (RankingProgram) other;
        return Intrinsics.areEqual(this.status, rankingProgram.status) && Intrinsics.areEqual(this.rank, rankingProgram.rank) && this.downloads == rankingProgram.downloads && Intrinsics.areEqual(this.socials, rankingProgram.socials);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Integer num = this.rank;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.downloads)) * 31;
        SocialsData socialsData = this.socials;
        return iHashCode2 + (socialsData != null ? socialsData.hashCode() : 0);
    }

    public String toString() {
        return "RankingProgram(status=" + this.status + ", rank=" + this.rank + ", downloads=" + this.downloads + ", socials=" + this.socials + ")";
    }

    public RankingProgram(String status, Integer num, int i2, SocialsData socialsData) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.rank = num;
        this.downloads = i2;
        this.socials = socialsData;
    }

    public final int getDownloads() {
        return this.downloads;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final SocialsData getSocials() {
        return this.socials;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setDownloads(int i2) {
        this.downloads = i2;
    }

    public final void setRank(Integer num) {
        this.rank = num;
    }

    public final void setSocials(SocialsData socialsData) {
        this.socials = socialsData;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public /* synthetic */ RankingProgram(String str, Integer num, int i2, SocialsData socialsData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "declined" : str, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : socialsData);
    }
}
