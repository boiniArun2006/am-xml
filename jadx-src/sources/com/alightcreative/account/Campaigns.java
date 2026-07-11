package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.firestore.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00058G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/account/Campaigns;", "", "creatorProgram", "Lcom/alightcreative/account/CreatorProgram;", "creatorRankingProgram", "Lcom/alightcreative/account/RankingProgram;", "<init>", "(Lcom/alightcreative/account/CreatorProgram;Lcom/alightcreative/account/RankingProgram;)V", "value", "getCreatorProgram", "()Lcom/alightcreative/account/CreatorProgram;", "setCreatorProgram", "(Lcom/alightcreative/account/CreatorProgram;)V", "getCreatorRankingProgram", "()Lcom/alightcreative/account/RankingProgram;", "setCreatorRankingProgram", "(Lcom/alightcreative/account/RankingProgram;)V", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Campaigns {
    public static final int $stable = 8;
    private CreatorProgram creatorProgram;
    private RankingProgram creatorRankingProgram;

    /* JADX WARN: Multi-variable type inference failed */
    public Campaigns() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Campaigns copy$default(Campaigns campaigns, CreatorProgram creatorProgram, RankingProgram rankingProgram, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            creatorProgram = campaigns.creatorProgram;
        }
        if ((i2 & 2) != 0) {
            rankingProgram = campaigns.creatorRankingProgram;
        }
        return campaigns.copy(creatorProgram, rankingProgram);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CreatorProgram getCreatorProgram() {
        return this.creatorProgram;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RankingProgram getCreatorRankingProgram() {
        return this.creatorRankingProgram;
    }

    public final Campaigns copy(CreatorProgram creatorProgram, RankingProgram creatorRankingProgram) {
        return new Campaigns(creatorProgram, creatorRankingProgram);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Campaigns)) {
            return false;
        }
        Campaigns campaigns = (Campaigns) other;
        return Intrinsics.areEqual(this.creatorProgram, campaigns.creatorProgram) && Intrinsics.areEqual(this.creatorRankingProgram, campaigns.creatorRankingProgram);
    }

    public int hashCode() {
        CreatorProgram creatorProgram = this.creatorProgram;
        int iHashCode = (creatorProgram == null ? 0 : creatorProgram.hashCode()) * 31;
        RankingProgram rankingProgram = this.creatorRankingProgram;
        return iHashCode + (rankingProgram != null ? rankingProgram.hashCode() : 0);
    }

    public String toString() {
        return "Campaigns(creatorProgram=" + this.creatorProgram + ", creatorRankingProgram=" + this.creatorRankingProgram + ")";
    }

    public Campaigns(CreatorProgram creatorProgram, RankingProgram rankingProgram) {
        this.creatorProgram = creatorProgram;
        this.creatorRankingProgram = rankingProgram;
    }

    @r("ccip_2023")
    public final CreatorProgram getCreatorProgram() {
        return this.creatorProgram;
    }

    @r("iar_2023")
    public final RankingProgram getCreatorRankingProgram() {
        return this.creatorRankingProgram;
    }

    @r("ccip_2023")
    public final void setCreatorProgram(CreatorProgram creatorProgram) {
        this.creatorProgram = creatorProgram;
    }

    @r("iar_2023")
    public final void setCreatorRankingProgram(RankingProgram rankingProgram) {
        this.creatorRankingProgram = rankingProgram;
    }

    public /* synthetic */ Campaigns(CreatorProgram creatorProgram, RankingProgram rankingProgram, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : creatorProgram, (i2 & 2) != 0 ? null : rankingProgram);
    }
}
