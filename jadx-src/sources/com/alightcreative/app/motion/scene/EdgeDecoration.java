package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/alightcreative/app/motion/scene/EdgeDecoration;", "", "type", "Lcom/alightcreative/app/motion/scene/EdgeDecorationType;", "direction", "Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;", "enabled", "", TtmlNode.ATTR_TTS_COLOR, "Lcom/alightcreative/app/motion/scene/SolidColor;", "alpha", "", "size", "hardness", "offset", "Lcom/alightcreative/app/motion/scene/Vector2D;", "<init>", "(Lcom/alightcreative/app/motion/scene/EdgeDecorationType;Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;ZLcom/alightcreative/app/motion/scene/SolidColor;FFFLcom/alightcreative/app/motion/scene/Vector2D;)V", "getType", "()Lcom/alightcreative/app/motion/scene/EdgeDecorationType;", "getDirection", "()Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;", "getEnabled", "()Z", "getColor", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getAlpha", "()F", "getSize", "getHardness", "getOffset", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EdgeDecoration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EdgeDecoration NONE;
    private static final EdgeDecoration NO_CENTERED_BORDER;
    private static final EdgeDecoration NO_GLOW;
    private static final EdgeDecoration NO_INNER_BORDER;
    private static final EdgeDecoration NO_OUTER_BORDER;
    private static final EdgeDecoration NO_SHADOW;
    private final float alpha;
    private final SolidColor color;
    private final EdgeDecorationDirection direction;
    private final boolean enabled;
    private final float hardness;
    private final Vector2D offset;
    private final float size;
    private final EdgeDecorationType type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/app/motion/scene/EdgeDecoration$Companion;", "", "<init>", "()V", "NONE", "Lcom/alightcreative/app/motion/scene/EdgeDecoration;", "getNONE", "()Lcom/alightcreative/app/motion/scene/EdgeDecoration;", "NO_INNER_BORDER", "getNO_INNER_BORDER", "NO_OUTER_BORDER", "getNO_OUTER_BORDER", "NO_CENTERED_BORDER", "getNO_CENTERED_BORDER", "NO_SHADOW", "getNO_SHADOW", "NO_GLOW", "getNO_GLOW", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EdgeDecoration getNONE() {
            return EdgeDecoration.NONE;
        }

        public final EdgeDecoration getNO_CENTERED_BORDER() {
            return EdgeDecoration.NO_CENTERED_BORDER;
        }

        public final EdgeDecoration getNO_GLOW() {
            return EdgeDecoration.NO_GLOW;
        }

        public final EdgeDecoration getNO_INNER_BORDER() {
            return EdgeDecoration.NO_INNER_BORDER;
        }

        public final EdgeDecoration getNO_OUTER_BORDER() {
            return EdgeDecoration.NO_OUTER_BORDER;
        }

        public final EdgeDecoration getNO_SHADOW() {
            return EdgeDecoration.NO_SHADOW;
        }
    }

    public EdgeDecoration(EdgeDecorationType type, EdgeDecorationDirection direction, boolean z2, SolidColor color, float f3, float f4, float f5, Vector2D offset) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.type = type;
        this.direction = direction;
        this.enabled = z2;
        this.color = color;
        this.alpha = f3;
        this.size = f4;
        this.hardness = f5;
        this.offset = offset;
    }

    public static /* synthetic */ EdgeDecoration copy$default(EdgeDecoration edgeDecoration, EdgeDecorationType edgeDecorationType, EdgeDecorationDirection edgeDecorationDirection, boolean z2, SolidColor solidColor, float f3, float f4, float f5, Vector2D vector2D, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            edgeDecorationType = edgeDecoration.type;
        }
        if ((i2 & 2) != 0) {
            edgeDecorationDirection = edgeDecoration.direction;
        }
        if ((i2 & 4) != 0) {
            z2 = edgeDecoration.enabled;
        }
        if ((i2 & 8) != 0) {
            solidColor = edgeDecoration.color;
        }
        if ((i2 & 16) != 0) {
            f3 = edgeDecoration.alpha;
        }
        if ((i2 & 32) != 0) {
            f4 = edgeDecoration.size;
        }
        if ((i2 & 64) != 0) {
            f5 = edgeDecoration.hardness;
        }
        if ((i2 & 128) != 0) {
            vector2D = edgeDecoration.offset;
        }
        float f6 = f5;
        Vector2D vector2D2 = vector2D;
        float f7 = f3;
        float f8 = f4;
        return edgeDecoration.copy(edgeDecorationType, edgeDecorationDirection, z2, solidColor, f7, f8, f6, vector2D2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EdgeDecorationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EdgeDecorationDirection getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SolidColor getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getHardness() {
        return this.hardness;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Vector2D getOffset() {
        return this.offset;
    }

    public final EdgeDecoration copy(EdgeDecorationType type, EdgeDecorationDirection direction, boolean enabled, SolidColor color, float alpha, float size, float hardness, Vector2D offset) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return new EdgeDecoration(type, direction, enabled, color, alpha, size, hardness, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeDecoration)) {
            return false;
        }
        EdgeDecoration edgeDecoration = (EdgeDecoration) other;
        return this.type == edgeDecoration.type && this.direction == edgeDecoration.direction && this.enabled == edgeDecoration.enabled && Intrinsics.areEqual(this.color, edgeDecoration.color) && Float.compare(this.alpha, edgeDecoration.alpha) == 0 && Float.compare(this.size, edgeDecoration.size) == 0 && Float.compare(this.hardness, edgeDecoration.hardness) == 0 && Intrinsics.areEqual(this.offset, edgeDecoration.offset);
    }

    public int hashCode() {
        return (((((((((((((this.type.hashCode() * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.color.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.size)) * 31) + Float.hashCode(this.hardness)) * 31) + this.offset.hashCode();
    }

    public String toString() {
        return "EdgeDecoration(type=" + this.type + ", direction=" + this.direction + ", enabled=" + this.enabled + ", color=" + this.color + ", alpha=" + this.alpha + ", size=" + this.size + ", hardness=" + this.hardness + ", offset=" + this.offset + ")";
    }

    static {
        float f3 = 0.0f;
        NONE = new EdgeDecoration(EdgeDecorationType.NONE, null, false, null, 0.0f, f3, 0.0f, null, 254, null);
        EdgeDecorationType edgeDecorationType = EdgeDecorationType.BORDER;
        EdgeDecorationDirection edgeDecorationDirection = EdgeDecorationDirection.INSIDE;
        SolidColor.Companion companion = SolidColor.INSTANCE;
        SolidColor white = companion.getWHITE();
        int i2 = Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z2 = false;
        float f4 = 6.0f;
        float f5 = 0.0f;
        Vector2D vector2D = null;
        NO_INNER_BORDER = new EdgeDecoration(edgeDecorationType, edgeDecorationDirection, z2, white, f3, f4, f5, vector2D, i2, defaultConstructorMarker);
        NO_OUTER_BORDER = new EdgeDecoration(edgeDecorationType, EdgeDecorationDirection.OUTSIDE, z2, companion.getWHITE(), f3, f4, f5, vector2D, i2, defaultConstructorMarker);
        EdgeDecorationDirection edgeDecorationDirection2 = EdgeDecorationDirection.CENTERED;
        NO_CENTERED_BORDER = new EdgeDecoration(edgeDecorationType, edgeDecorationDirection2, z2, companion.getWHITE(), f3, 4.0f, f5, vector2D, i2, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z3 = false;
        float f6 = 4.0f;
        float f7 = 0.0f;
        NO_SHADOW = new EdgeDecoration(EdgeDecorationType.SHADOW, edgeDecorationDirection2, z3, companion.getBLACK(), f5, f6, f7, new Vector2D(3.0f, 3.0f), 20, defaultConstructorMarker2);
        NO_GLOW = new EdgeDecoration(EdgeDecorationType.GLOW, edgeDecorationDirection2, z3, companion.getWHITE(), f5, f6, f7, null, 148, defaultConstructorMarker2);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final SolidColor getColor() {
        return this.color;
    }

    public final EdgeDecorationDirection getDirection() {
        return this.direction;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getHardness() {
        return this.hardness;
    }

    public final Vector2D getOffset() {
        return this.offset;
    }

    public final float getSize() {
        return this.size;
    }

    public final EdgeDecorationType getType() {
        return this.type;
    }

    public /* synthetic */ EdgeDecoration(EdgeDecorationType edgeDecorationType, EdgeDecorationDirection edgeDecorationDirection, boolean z2, SolidColor solidColor, float f3, float f4, float f5, Vector2D vector2D, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(edgeDecorationType, (i2 & 2) != 0 ? EdgeDecorationDirection.OUTSIDE : edgeDecorationDirection, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? 1.0f : f4, (i2 & 64) == 0 ? f5 : 1.0f, (i2 & 128) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D);
    }
}
