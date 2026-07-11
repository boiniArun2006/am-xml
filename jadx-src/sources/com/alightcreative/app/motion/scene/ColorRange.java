package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/alightcreative/app/motion/scene/ColorRange;", "", "startColor", "Lcom/alightcreative/app/motion/scene/SolidColor;", "endColor", "<init>", "(Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;)V", "getStartColor", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getEndColor", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ColorRange {
    public static final int $stable = 0;
    private final SolidColor endColor;
    private final SolidColor startColor;

    public static /* synthetic */ ColorRange copy$default(ColorRange colorRange, SolidColor solidColor, SolidColor solidColor2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            solidColor = colorRange.startColor;
        }
        if ((i2 & 2) != 0) {
            solidColor2 = colorRange.endColor;
        }
        return colorRange.copy(solidColor, solidColor2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SolidColor getStartColor() {
        return this.startColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SolidColor getEndColor() {
        return this.endColor;
    }

    public final ColorRange copy(SolidColor startColor, SolidColor endColor) {
        Intrinsics.checkNotNullParameter(startColor, "startColor");
        Intrinsics.checkNotNullParameter(endColor, "endColor");
        return new ColorRange(startColor, endColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorRange)) {
            return false;
        }
        ColorRange colorRange = (ColorRange) other;
        return Intrinsics.areEqual(this.startColor, colorRange.startColor) && Intrinsics.areEqual(this.endColor, colorRange.endColor);
    }

    public int hashCode() {
        return (this.startColor.hashCode() * 31) + this.endColor.hashCode();
    }

    public String toString() {
        return "ColorRange(startColor=" + this.startColor + ", endColor=" + this.endColor + ")";
    }

    public ColorRange(SolidColor startColor, SolidColor endColor) {
        Intrinsics.checkNotNullParameter(startColor, "startColor");
        Intrinsics.checkNotNullParameter(endColor, "endColor");
        this.startColor = startColor;
        this.endColor = endColor;
    }

    public final SolidColor getEndColor() {
        return this.endColor;
    }

    public final SolidColor getStartColor() {
        return this.startColor;
    }
}
