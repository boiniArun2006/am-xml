package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedAction;", "", "id", "", "type", "Lcom/alightcreative/app/motion/feed/FeedActionType;", "target", "<init>", "(Ljava/lang/String;Lcom/alightcreative/app/motion/feed/FeedActionType;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/alightcreative/app/motion/feed/FeedActionType;", "getTarget", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedAction {
    public static final int $stable = 0;
    private final String id;
    private final String target;
    private final FeedActionType type;

    public static /* synthetic */ FeedAction copy$default(FeedAction feedAction, String str, FeedActionType feedActionType, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedAction.id;
        }
        if ((i2 & 2) != 0) {
            feedActionType = feedAction.type;
        }
        if ((i2 & 4) != 0) {
            str2 = feedAction.target;
        }
        return feedAction.copy(str, feedActionType, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeedActionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    public final FeedAction copy(String id, FeedActionType type, String target) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(target, "target");
        return new FeedAction(id, type, target);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedAction)) {
            return false;
        }
        FeedAction feedAction = (FeedAction) other;
        return Intrinsics.areEqual(this.id, feedAction.id) && this.type == feedAction.type && Intrinsics.areEqual(this.target, feedAction.target);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        FeedActionType feedActionType = this.type;
        return ((iHashCode + (feedActionType == null ? 0 : feedActionType.hashCode())) * 31) + this.target.hashCode();
    }

    public String toString() {
        return "FeedAction(id=" + this.id + ", type=" + this.type + ", target=" + this.target + ")";
    }

    public FeedAction(String id, FeedActionType feedActionType, String target) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(target, "target");
        this.id = id;
        this.type = feedActionType;
        this.target = target;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTarget() {
        return this.target;
    }

    public final FeedActionType getType() {
        return this.type;
    }
}
