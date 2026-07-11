package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, d2 = {"Lcom/alightcreative/app/motion/scene/GradientFill;", "", "type", "Lcom/alightcreative/app/motion/scene/GradientType;", "startColor", "Lcom/alightcreative/app/motion/scene/SolidColor;", "endColor", "startLocation", "Lcom/alightcreative/app/motion/scene/Vector2D;", "endLocation", "<init>", "(Lcom/alightcreative/app/motion/scene/GradientType;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "getType", "()Lcom/alightcreative/app/motion/scene/GradientType;", "getStartColor", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getEndColor", "getStartLocation", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getEndLocation", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GradientFill {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final GradientFill DEFAULT;
    private final SolidColor endColor;
    private final Vector2D endLocation;
    private final SolidColor startColor;
    private final Vector2D startLocation;
    private final GradientType type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/GradientFill$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/scene/GradientFill;", "getDEFAULT", "()Lcom/alightcreative/app/motion/scene/GradientFill;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GradientFill getDEFAULT() {
            return GradientFill.DEFAULT;
        }
    }

    public static /* synthetic */ GradientFill copy$default(GradientFill gradientFill, GradientType gradientType, SolidColor solidColor, SolidColor solidColor2, Vector2D vector2D, Vector2D vector2D2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gradientType = gradientFill.type;
        }
        if ((i2 & 2) != 0) {
            solidColor = gradientFill.startColor;
        }
        if ((i2 & 4) != 0) {
            solidColor2 = gradientFill.endColor;
        }
        if ((i2 & 8) != 0) {
            vector2D = gradientFill.startLocation;
        }
        if ((i2 & 16) != 0) {
            vector2D2 = gradientFill.endLocation;
        }
        Vector2D vector2D3 = vector2D2;
        SolidColor solidColor3 = solidColor2;
        return gradientFill.copy(gradientType, solidColor, solidColor3, vector2D, vector2D3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GradientType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SolidColor getStartColor() {
        return this.startColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SolidColor getEndColor() {
        return this.endColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Vector2D getStartLocation() {
        return this.startLocation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Vector2D getEndLocation() {
        return this.endLocation;
    }

    public final GradientFill copy(GradientType type, SolidColor startColor, SolidColor endColor, Vector2D startLocation, Vector2D endLocation) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startColor, "startColor");
        Intrinsics.checkNotNullParameter(endColor, "endColor");
        Intrinsics.checkNotNullParameter(startLocation, "startLocation");
        Intrinsics.checkNotNullParameter(endLocation, "endLocation");
        return new GradientFill(type, startColor, endColor, startLocation, endLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientFill)) {
            return false;
        }
        GradientFill gradientFill = (GradientFill) other;
        return this.type == gradientFill.type && Intrinsics.areEqual(this.startColor, gradientFill.startColor) && Intrinsics.areEqual(this.endColor, gradientFill.endColor) && Intrinsics.areEqual(this.startLocation, gradientFill.startLocation) && Intrinsics.areEqual(this.endLocation, gradientFill.endLocation);
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.startColor.hashCode()) * 31) + this.endColor.hashCode()) * 31) + this.startLocation.hashCode()) * 31) + this.endLocation.hashCode();
    }

    public String toString() {
        return "GradientFill(type=" + this.type + ", startColor=" + this.startColor + ", endColor=" + this.endColor + ", startLocation=" + this.startLocation + ", endLocation=" + this.endLocation + ")";
    }

    static {
        GradientType gradientType = GradientType.LINEAR;
        SolidColor.Companion companion = SolidColor.INSTANCE;
        SolidColor black = companion.getBLACK();
        SolidColor white = companion.getWHITE();
        Vector2D.Companion companion2 = Vector2D.INSTANCE;
        DEFAULT = new GradientFill(gradientType, black, white, companion2.getZERO(), companion2.getONE());
    }

    public GradientFill(GradientType type, SolidColor startColor, SolidColor endColor, Vector2D startLocation, Vector2D endLocation) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startColor, "startColor");
        Intrinsics.checkNotNullParameter(endColor, "endColor");
        Intrinsics.checkNotNullParameter(startLocation, "startLocation");
        Intrinsics.checkNotNullParameter(endLocation, "endLocation");
        this.type = type;
        this.startColor = startColor;
        this.endColor = endColor;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public final SolidColor getEndColor() {
        return this.endColor;
    }

    public final Vector2D getEndLocation() {
        return this.endLocation;
    }

    public final SolidColor getStartColor() {
        return this.startColor;
    }

    public final Vector2D getStartLocation() {
        return this.startLocation;
    }

    public final GradientType getType() {
        return this.type;
    }
}
