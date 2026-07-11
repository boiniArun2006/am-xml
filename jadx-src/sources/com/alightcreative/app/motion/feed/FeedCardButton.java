package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedCardButton;", "", "label", "", "icon", "Lcom/alightcreative/app/motion/feed/FeedCardButtonIcon;", FileUploadManager.f61572j, "Lcom/alightcreative/app/motion/feed/FeedAction;", "<init>", "(Ljava/lang/String;Lcom/alightcreative/app/motion/feed/FeedCardButtonIcon;Lcom/alightcreative/app/motion/feed/FeedAction;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lcom/alightcreative/app/motion/feed/FeedCardButtonIcon;", "getAction", "()Lcom/alightcreative/app/motion/feed/FeedAction;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedCardButton {
    public static final int $stable = 0;
    private final FeedAction action;
    private final FeedCardButtonIcon icon;
    private final String label;

    public static /* synthetic */ FeedCardButton copy$default(FeedCardButton feedCardButton, String str, FeedCardButtonIcon feedCardButtonIcon, FeedAction feedAction, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedCardButton.label;
        }
        if ((i2 & 2) != 0) {
            feedCardButtonIcon = feedCardButton.icon;
        }
        if ((i2 & 4) != 0) {
            feedAction = feedCardButton.action;
        }
        return feedCardButton.copy(str, feedCardButtonIcon, feedAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeedCardButtonIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FeedAction getAction() {
        return this.action;
    }

    public final FeedCardButton copy(String label, FeedCardButtonIcon icon, FeedAction action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        return new FeedCardButton(label, icon, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedCardButton)) {
            return false;
        }
        FeedCardButton feedCardButton = (FeedCardButton) other;
        return Intrinsics.areEqual(this.label, feedCardButton.label) && this.icon == feedCardButton.icon && Intrinsics.areEqual(this.action, feedCardButton.action);
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        FeedCardButtonIcon feedCardButtonIcon = this.icon;
        return ((iHashCode + (feedCardButtonIcon == null ? 0 : feedCardButtonIcon.hashCode())) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "FeedCardButton(label=" + this.label + ", icon=" + this.icon + ", action=" + this.action + ")";
    }

    public FeedCardButton(String label, FeedCardButtonIcon feedCardButtonIcon, FeedAction action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.label = label;
        this.icon = feedCardButtonIcon;
        this.action = action;
    }

    public final FeedAction getAction() {
        return this.action;
    }

    public final FeedCardButtonIcon getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }
}
