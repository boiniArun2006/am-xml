package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedNotice;", "", "id", "", "icon", "Lcom/alightcreative/app/motion/feed/FeedNoticeIcon;", "customIconUrl", FileUploadManager.f61572j, "Lcom/alightcreative/app/motion/feed/FeedAction;", "text", "appDay", "", "<init>", "(Ljava/lang/String;Lcom/alightcreative/app/motion/feed/FeedNoticeIcon;Ljava/lang/String;Lcom/alightcreative/app/motion/feed/FeedAction;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getIcon", "()Lcom/alightcreative/app/motion/feed/FeedNoticeIcon;", "getCustomIconUrl", "getAction", "()Lcom/alightcreative/app/motion/feed/FeedAction;", "getText", "getAppDay", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedNotice {
    public static final int $stable = 0;
    private final FeedAction action;
    private final int appDay;
    private final String customIconUrl;
    private final FeedNoticeIcon icon;
    private final String id;
    private final String text;

    public static /* synthetic */ FeedNotice copy$default(FeedNotice feedNotice, String str, FeedNoticeIcon feedNoticeIcon, String str2, FeedAction feedAction, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = feedNotice.id;
        }
        if ((i3 & 2) != 0) {
            feedNoticeIcon = feedNotice.icon;
        }
        if ((i3 & 4) != 0) {
            str2 = feedNotice.customIconUrl;
        }
        if ((i3 & 8) != 0) {
            feedAction = feedNotice.action;
        }
        if ((i3 & 16) != 0) {
            str3 = feedNotice.text;
        }
        if ((i3 & 32) != 0) {
            i2 = feedNotice.appDay;
        }
        String str4 = str3;
        int i5 = i2;
        return feedNotice.copy(str, feedNoticeIcon, str2, feedAction, str4, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeedNoticeIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCustomIconUrl() {
        return this.customIconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FeedAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAppDay() {
        return this.appDay;
    }

    public final FeedNotice copy(String id, FeedNoticeIcon icon, String customIconUrl, FeedAction action, String text, int appDay) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new FeedNotice(id, icon, customIconUrl, action, text, appDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedNotice)) {
            return false;
        }
        FeedNotice feedNotice = (FeedNotice) other;
        return Intrinsics.areEqual(this.id, feedNotice.id) && this.icon == feedNotice.icon && Intrinsics.areEqual(this.customIconUrl, feedNotice.customIconUrl) && Intrinsics.areEqual(this.action, feedNotice.action) && Intrinsics.areEqual(this.text, feedNotice.text) && this.appDay == feedNotice.appDay;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        FeedNoticeIcon feedNoticeIcon = this.icon;
        int iHashCode2 = (iHashCode + (feedNoticeIcon == null ? 0 : feedNoticeIcon.hashCode())) * 31;
        String str = this.customIconUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        FeedAction feedAction = this.action;
        return ((((iHashCode3 + (feedAction != null ? feedAction.hashCode() : 0)) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.appDay);
    }

    public String toString() {
        return "FeedNotice(id=" + this.id + ", icon=" + this.icon + ", customIconUrl=" + this.customIconUrl + ", action=" + this.action + ", text=" + this.text + ", appDay=" + this.appDay + ")";
    }

    public FeedNotice(String id, FeedNoticeIcon feedNoticeIcon, String str, FeedAction feedAction, String text, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = id;
        this.icon = feedNoticeIcon;
        this.customIconUrl = str;
        this.action = feedAction;
        this.text = text;
        this.appDay = i2;
    }

    public final FeedAction getAction() {
        return this.action;
    }

    public final int getAppDay() {
        return this.appDay;
    }

    public final String getCustomIconUrl() {
        return this.customIconUrl;
    }

    public final FeedNoticeIcon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }
}
