package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/feed/Feed;", "", "cards", "", "Lcom/alightcreative/app/motion/feed/FeedCard;", "notices", "Lcom/alightcreative/app/motion/feed/FeedNotice;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "getNotices", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Feed {
    public static final int $stable = 8;
    private final List<FeedCard> cards;
    private final List<FeedNotice> notices;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Feed copy$default(Feed feed, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = feed.cards;
        }
        if ((i2 & 2) != 0) {
            list2 = feed.notices;
        }
        return feed.copy(list, list2);
    }

    public final List<FeedCard> component1() {
        return this.cards;
    }

    public final List<FeedNotice> component2() {
        return this.notices;
    }

    public final Feed copy(List<FeedCard> cards, List<FeedNotice> notices) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(notices, "notices");
        return new Feed(cards, notices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feed)) {
            return false;
        }
        Feed feed = (Feed) other;
        return Intrinsics.areEqual(this.cards, feed.cards) && Intrinsics.areEqual(this.notices, feed.notices);
    }

    public int hashCode() {
        return (this.cards.hashCode() * 31) + this.notices.hashCode();
    }

    public String toString() {
        return "Feed(cards=" + this.cards + ", notices=" + this.notices + ")";
    }

    public Feed(List<FeedCard> cards, List<FeedNotice> notices) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(notices, "notices");
        this.cards = cards;
        this.notices = notices;
    }

    public final List<FeedCard> getCards() {
        return this.cards;
    }

    public final List<FeedNotice> getNotices() {
        return this.notices;
    }
}
