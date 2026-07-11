package com.alightcreative.app.motion.easing;

import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/easing/HandleStyle;", "", "handleColor", "", "lineColor", "isDashed", "", "<init>", "(IIZ)V", "getHandleColor", "()I", "getLineColor", "()Z", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HandleStyle {
    public static final int $stable = 0;
    private final int handleColor;
    private final boolean isDashed;
    private final int lineColor;

    public static /* synthetic */ HandleStyle copy$default(HandleStyle handleStyle, int i2, int i3, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = handleStyle.handleColor;
        }
        if ((i5 & 2) != 0) {
            i3 = handleStyle.lineColor;
        }
        if ((i5 & 4) != 0) {
            z2 = handleStyle.isDashed;
        }
        return handleStyle.copy(i2, i3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHandleColor() {
        return this.handleColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDashed() {
        return this.isDashed;
    }

    public final HandleStyle copy(@ColorRes int handleColor, @ColorRes int lineColor, boolean isDashed) {
        return new HandleStyle(handleColor, lineColor, isDashed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandleStyle)) {
            return false;
        }
        HandleStyle handleStyle = (HandleStyle) other;
        return this.handleColor == handleStyle.handleColor && this.lineColor == handleStyle.lineColor && this.isDashed == handleStyle.isDashed;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.handleColor) * 31) + Integer.hashCode(this.lineColor)) * 31) + Boolean.hashCode(this.isDashed);
    }

    public String toString() {
        return "HandleStyle(handleColor=" + this.handleColor + ", lineColor=" + this.lineColor + ", isDashed=" + this.isDashed + ")";
    }

    public final int getHandleColor() {
        return this.handleColor;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final boolean isDashed() {
        return this.isDashed;
    }

    public HandleStyle(@ColorRes int i2, @ColorRes int i3, boolean z2) {
        this.handleColor = i2;
        this.lineColor = i3;
        this.isDashed = z2;
    }
}
