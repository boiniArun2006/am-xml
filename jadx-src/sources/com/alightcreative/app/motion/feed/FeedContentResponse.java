package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedContentResponse;", "", "result", "", "serverTimestamp", "", "feed", "Lcom/alightcreative/app/motion/feed/Feed;", "feedHash", "<init>", "(Ljava/lang/String;JLcom/alightcreative/app/motion/feed/Feed;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getServerTimestamp", "()J", "getFeed", "()Lcom/alightcreative/app/motion/feed/Feed;", "getFeedHash", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedContentResponse {
    public static final int $stable = 8;
    private final Feed feed;
    private final String feedHash;
    private final String result;
    private final long serverTimestamp;

    public FeedContentResponse(String result, long j2, Feed feed, String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(feed, "feed");
        this.result = result;
        this.serverTimestamp = j2;
        this.feed = feed;
        this.feedHash = str;
    }

    public static /* synthetic */ FeedContentResponse copy$default(FeedContentResponse feedContentResponse, String str, long j2, Feed feed, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedContentResponse.result;
        }
        if ((i2 & 2) != 0) {
            j2 = feedContentResponse.serverTimestamp;
        }
        if ((i2 & 4) != 0) {
            feed = feedContentResponse.feed;
        }
        if ((i2 & 8) != 0) {
            str2 = feedContentResponse.feedHash;
        }
        return feedContentResponse.copy(str, j2, feed, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getServerTimestamp() {
        return this.serverTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Feed getFeed() {
        return this.feed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeedHash() {
        return this.feedHash;
    }

    public final FeedContentResponse copy(String result, long serverTimestamp, Feed feed, String feedHash) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(feed, "feed");
        return new FeedContentResponse(result, serverTimestamp, feed, feedHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedContentResponse)) {
            return false;
        }
        FeedContentResponse feedContentResponse = (FeedContentResponse) other;
        return Intrinsics.areEqual(this.result, feedContentResponse.result) && this.serverTimestamp == feedContentResponse.serverTimestamp && Intrinsics.areEqual(this.feed, feedContentResponse.feed) && Intrinsics.areEqual(this.feedHash, feedContentResponse.feedHash);
    }

    public int hashCode() {
        int iHashCode = ((((this.result.hashCode() * 31) + Long.hashCode(this.serverTimestamp)) * 31) + this.feed.hashCode()) * 31;
        String str = this.feedHash;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FeedContentResponse(result=" + this.result + ", serverTimestamp=" + this.serverTimestamp + ", feed=" + this.feed + ", feedHash=" + this.feedHash + ")";
    }

    public final Feed getFeed() {
        return this.feed;
    }

    public final String getFeedHash() {
        return this.feedHash;
    }

    public final String getResult() {
        return this.result;
    }

    public final long getServerTimestamp() {
        return this.serverTimestamp;
    }

    public /* synthetic */ FeedContentResponse(String str, long j2, Feed feed, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, feed, (i2 & 8) != 0 ? null : str2);
    }
}
