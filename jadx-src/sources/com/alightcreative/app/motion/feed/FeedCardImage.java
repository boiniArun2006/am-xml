package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedCardImage;", "", "src", "", "width", "", "height", "crop", "gravity", FileUploadManager.f61572j, "Lcom/alightcreative/app/motion/feed/FeedAction;", "overlay", "Lcom/alightcreative/app/motion/feed/FeedCardOverlay;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/alightcreative/app/motion/feed/FeedAction;Lcom/alightcreative/app/motion/feed/FeedCardOverlay;)V", "getSrc", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getCrop", "getGravity", "getAction", "()Lcom/alightcreative/app/motion/feed/FeedAction;", "getOverlay", "()Lcom/alightcreative/app/motion/feed/FeedCardOverlay;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedCardImage {
    public static final int $stable = 0;
    private final FeedAction action;
    private final String crop;
    private final String gravity;
    private final int height;
    private final FeedCardOverlay overlay;
    private final String src;
    private final int width;

    public static /* synthetic */ FeedCardImage copy$default(FeedCardImage feedCardImage, String str, int i2, int i3, String str2, String str3, FeedAction feedAction, FeedCardOverlay feedCardOverlay, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = feedCardImage.src;
        }
        if ((i5 & 2) != 0) {
            i2 = feedCardImage.width;
        }
        if ((i5 & 4) != 0) {
            i3 = feedCardImage.height;
        }
        if ((i5 & 8) != 0) {
            str2 = feedCardImage.crop;
        }
        if ((i5 & 16) != 0) {
            str3 = feedCardImage.gravity;
        }
        if ((i5 & 32) != 0) {
            feedAction = feedCardImage.action;
        }
        if ((i5 & 64) != 0) {
            feedCardOverlay = feedCardImage.overlay;
        }
        FeedAction feedAction2 = feedAction;
        FeedCardOverlay feedCardOverlay2 = feedCardOverlay;
        String str4 = str3;
        int i7 = i3;
        return feedCardImage.copy(str, i2, i7, str2, str4, feedAction2, feedCardOverlay2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCrop() {
        return this.crop;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGravity() {
        return this.gravity;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FeedAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FeedCardOverlay getOverlay() {
        return this.overlay;
    }

    public final FeedCardImage copy(String src, int width, int height, String crop, String gravity, FeedAction action, FeedCardOverlay overlay) {
        Intrinsics.checkNotNullParameter(src, "src");
        return new FeedCardImage(src, width, height, crop, gravity, action, overlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedCardImage)) {
            return false;
        }
        FeedCardImage feedCardImage = (FeedCardImage) other;
        return Intrinsics.areEqual(this.src, feedCardImage.src) && this.width == feedCardImage.width && this.height == feedCardImage.height && Intrinsics.areEqual(this.crop, feedCardImage.crop) && Intrinsics.areEqual(this.gravity, feedCardImage.gravity) && Intrinsics.areEqual(this.action, feedCardImage.action) && this.overlay == feedCardImage.overlay;
    }

    public int hashCode() {
        int iHashCode = ((((this.src.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31;
        String str = this.crop;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gravity;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FeedAction feedAction = this.action;
        int iHashCode4 = (iHashCode3 + (feedAction == null ? 0 : feedAction.hashCode())) * 31;
        FeedCardOverlay feedCardOverlay = this.overlay;
        return iHashCode4 + (feedCardOverlay != null ? feedCardOverlay.hashCode() : 0);
    }

    public String toString() {
        return "FeedCardImage(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", crop=" + this.crop + ", gravity=" + this.gravity + ", action=" + this.action + ", overlay=" + this.overlay + ")";
    }

    public FeedCardImage(String src, int i2, int i3, String str, String str2, FeedAction feedAction, FeedCardOverlay feedCardOverlay) {
        Intrinsics.checkNotNullParameter(src, "src");
        this.src = src;
        this.width = i2;
        this.height = i3;
        this.crop = str;
        this.gravity = str2;
        this.action = feedAction;
        this.overlay = feedCardOverlay;
    }

    public final FeedAction getAction() {
        return this.action;
    }

    public final String getCrop() {
        return this.crop;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final FeedCardOverlay getOverlay() {
        return this.overlay;
    }

    public final String getSrc() {
        return this.src;
    }

    public final int getWidth() {
        return this.width;
    }
}
