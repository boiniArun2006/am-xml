package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableSolidColor;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0001HB¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\t\u0010>\u001a\u00020\u0016HÆ\u0003J\t\u0010?\u001a\u00020\u0016HÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\u001aHÆ\u0003J³\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\u0013\u0010C\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u001aHÖ\u0001J\t\u0010F\u001a\u00020GHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006I"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "", "type", "Lcom/alightcreative/app/motion/scene/EdgeDecorationType;", "direction", "Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;", "enabled", "", TtmlNode.ATTR_TTS_COLOR, "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "alpha", "", "size", "hardness", "offset", "Lcom/alightcreative/app/motion/scene/Vector2D;", "cap", "Lcom/alightcreative/app/motion/scene/StrokeCap;", "join", "Lcom/alightcreative/app/motion/scene/StrokeJoin;", "startStyle", "Lcom/alightcreative/app/motion/scene/StrokeEnd;", "endStyle", "endSize", "borderId", "", "<init>", "(Lcom/alightcreative/app/motion/scene/EdgeDecorationType;Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;ZLcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/StrokeCap;Lcom/alightcreative/app/motion/scene/StrokeJoin;Lcom/alightcreative/app/motion/scene/StrokeEnd;Lcom/alightcreative/app/motion/scene/StrokeEnd;FI)V", "getType", "()Lcom/alightcreative/app/motion/scene/EdgeDecorationType;", "getDirection", "()Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;", "getEnabled", "()Z", "getColor", "()Lcom/alightcreative/app/motion/scene/Keyable;", "getAlpha", "getSize", "getHardness", "getOffset", "getCap", "()Lcom/alightcreative/app/motion/scene/StrokeCap;", "getJoin", "()Lcom/alightcreative/app/motion/scene/StrokeJoin;", "getStartStyle", "()Lcom/alightcreative/app/motion/scene/StrokeEnd;", "getEndStyle", "getEndSize", "()F", "getBorderId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableEdgeDecoration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyableEdgeDecoration NONE;
    private static final KeyableEdgeDecoration NO_CENTERED_BORDER;
    private static final KeyableEdgeDecoration NO_GLOW;
    private static final KeyableEdgeDecoration NO_INNER_BORDER;
    private static final KeyableEdgeDecoration NO_OUTER_BORDER;
    private static final KeyableEdgeDecoration NO_SHADOW;
    private static final KeyableEdgeDecoration NO_STROKE;
    private final Keyable<Float> alpha;
    private final int borderId;
    private final StrokeCap cap;
    private final Keyable<SolidColor> color;
    private final EdgeDecorationDirection direction;
    private final boolean enabled;
    private final float endSize;
    private final StrokeEnd endStyle;
    private final Keyable<Float> hardness;
    private final StrokeJoin join;
    private final Keyable<Vector2D> offset;
    private final Keyable<Float> size;
    private final StrokeEnd startStyle;
    private final EdgeDecorationType type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration$Companion;", "", "<init>", "()V", "NONE", "Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "getNONE", "()Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "NO_INNER_BORDER", "getNO_INNER_BORDER", "NO_OUTER_BORDER", "getNO_OUTER_BORDER", "NO_CENTERED_BORDER", "getNO_CENTERED_BORDER", "NO_STROKE", "getNO_STROKE", "NO_SHADOW", "getNO_SHADOW", "NO_GLOW", "getNO_GLOW", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyableEdgeDecoration getNONE() {
            return KeyableEdgeDecoration.NONE;
        }

        public final KeyableEdgeDecoration getNO_CENTERED_BORDER() {
            return KeyableEdgeDecoration.NO_CENTERED_BORDER;
        }

        public final KeyableEdgeDecoration getNO_GLOW() {
            return KeyableEdgeDecoration.NO_GLOW;
        }

        public final KeyableEdgeDecoration getNO_INNER_BORDER() {
            return KeyableEdgeDecoration.NO_INNER_BORDER;
        }

        public final KeyableEdgeDecoration getNO_OUTER_BORDER() {
            return KeyableEdgeDecoration.NO_OUTER_BORDER;
        }

        public final KeyableEdgeDecoration getNO_SHADOW() {
            return KeyableEdgeDecoration.NO_SHADOW;
        }

        public final KeyableEdgeDecoration getNO_STROKE() {
            return KeyableEdgeDecoration.NO_STROKE;
        }
    }

    public KeyableEdgeDecoration(EdgeDecorationType type, EdgeDecorationDirection direction, boolean z2, Keyable<SolidColor> color, Keyable<Float> alpha, Keyable<Float> size, Keyable<Float> hardness, Keyable<Vector2D> offset, StrokeCap cap, StrokeJoin join, StrokeEnd startStyle, StrokeEnd endStyle, float f3, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(hardness, "hardness");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(cap, "cap");
        Intrinsics.checkNotNullParameter(join, "join");
        Intrinsics.checkNotNullParameter(startStyle, "startStyle");
        Intrinsics.checkNotNullParameter(endStyle, "endStyle");
        this.type = type;
        this.direction = direction;
        this.enabled = z2;
        this.color = color;
        this.alpha = alpha;
        this.size = size;
        this.hardness = hardness;
        this.offset = offset;
        this.cap = cap;
        this.join = join;
        this.startStyle = startStyle;
        this.endStyle = endStyle;
        this.endSize = f3;
        this.borderId = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EdgeDecorationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final StrokeJoin getJoin() {
        return this.join;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final StrokeEnd getStartStyle() {
        return this.startStyle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final StrokeEnd getEndStyle() {
        return this.endStyle;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getEndSize() {
        return this.endSize;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getBorderId() {
        return this.borderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EdgeDecorationDirection getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Keyable<SolidColor> component4() {
        return this.color;
    }

    public final Keyable<Float> component5() {
        return this.alpha;
    }

    public final Keyable<Float> component6() {
        return this.size;
    }

    public final Keyable<Float> component7() {
        return this.hardness;
    }

    public final Keyable<Vector2D> component8() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final StrokeCap getCap() {
        return this.cap;
    }

    public final KeyableEdgeDecoration copy(EdgeDecorationType type, EdgeDecorationDirection direction, boolean enabled, Keyable<SolidColor> color, Keyable<Float> alpha, Keyable<Float> size, Keyable<Float> hardness, Keyable<Vector2D> offset, StrokeCap cap, StrokeJoin join, StrokeEnd startStyle, StrokeEnd endStyle, float endSize, int borderId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(hardness, "hardness");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(cap, "cap");
        Intrinsics.checkNotNullParameter(join, "join");
        Intrinsics.checkNotNullParameter(startStyle, "startStyle");
        Intrinsics.checkNotNullParameter(endStyle, "endStyle");
        return new KeyableEdgeDecoration(type, direction, enabled, color, alpha, size, hardness, offset, cap, join, startStyle, endStyle, endSize, borderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableEdgeDecoration)) {
            return false;
        }
        KeyableEdgeDecoration keyableEdgeDecoration = (KeyableEdgeDecoration) other;
        return this.type == keyableEdgeDecoration.type && this.direction == keyableEdgeDecoration.direction && this.enabled == keyableEdgeDecoration.enabled && Intrinsics.areEqual(this.color, keyableEdgeDecoration.color) && Intrinsics.areEqual(this.alpha, keyableEdgeDecoration.alpha) && Intrinsics.areEqual(this.size, keyableEdgeDecoration.size) && Intrinsics.areEqual(this.hardness, keyableEdgeDecoration.hardness) && Intrinsics.areEqual(this.offset, keyableEdgeDecoration.offset) && this.cap == keyableEdgeDecoration.cap && this.join == keyableEdgeDecoration.join && this.startStyle == keyableEdgeDecoration.startStyle && this.endStyle == keyableEdgeDecoration.endStyle && Float.compare(this.endSize, keyableEdgeDecoration.endSize) == 0 && this.borderId == keyableEdgeDecoration.borderId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.type.hashCode() * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.color.hashCode()) * 31) + this.alpha.hashCode()) * 31) + this.size.hashCode()) * 31) + this.hardness.hashCode()) * 31) + this.offset.hashCode()) * 31) + this.cap.hashCode()) * 31) + this.join.hashCode()) * 31) + this.startStyle.hashCode()) * 31) + this.endStyle.hashCode()) * 31) + Float.hashCode(this.endSize)) * 31) + Integer.hashCode(this.borderId);
    }

    public String toString() {
        return "KeyableEdgeDecoration(type=" + this.type + ", direction=" + this.direction + ", enabled=" + this.enabled + ", color=" + this.color + ", alpha=" + this.alpha + ", size=" + this.size + ", hardness=" + this.hardness + ", offset=" + this.offset + ", cap=" + this.cap + ", join=" + this.join + ", startStyle=" + this.startStyle + ", endStyle=" + this.endStyle + ", endSize=" + this.endSize + ", borderId=" + this.borderId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Keyable keyable = null;
        Keyable keyable2 = null;
        NONE = new KeyableEdgeDecoration(EdgeDecorationType.NONE, null, false, null, null, keyable, null, keyable2, null, null, null, null, 0.0f, 0, 16382, null);
        EdgeDecorationType edgeDecorationType = EdgeDecorationType.BORDER;
        EdgeDecorationDirection edgeDecorationDirection = EdgeDecorationDirection.INSIDE;
        KeyableFloat keyableFloatKeyable = KeyableKt.keyable(6.0f);
        KeyableSolidColor.Companion companion = KeyableSolidColor.INSTANCE;
        int i2 = 16340;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z2 = false;
        float f3 = 0.0f;
        int i3 = 0;
        NO_INNER_BORDER = new KeyableEdgeDecoration(edgeDecorationType, edgeDecorationDirection, z2, companion.getWHITE(), keyable, keyableFloatKeyable, keyable2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, f3, i3, i2, defaultConstructorMarker);
        EdgeDecorationDirection edgeDecorationDirection2 = EdgeDecorationDirection.OUTSIDE;
        NO_OUTER_BORDER = new KeyableEdgeDecoration(edgeDecorationType, edgeDecorationDirection2, z2, companion.getWHITE(), keyable, KeyableKt.keyable(6.0f), keyable2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f3, i3, i2, defaultConstructorMarker);
        EdgeDecorationDirection edgeDecorationDirection3 = EdgeDecorationDirection.CENTERED;
        NO_CENTERED_BORDER = new KeyableEdgeDecoration(edgeDecorationType, edgeDecorationDirection3, z2, companion.getWHITE(), keyable, KeyableKt.keyable(4.0f), keyable2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f3, i3, i2, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z3 = false;
        StrokeEnd strokeEnd = null;
        StrokeEnd strokeEnd2 = null;
        float f4 = 0.0f;
        int i5 = 0;
        NO_STROKE = new KeyableEdgeDecoration(EdgeDecorationType.STROKE, edgeDecorationDirection3, z3, companion.getBLACK(), keyable2, KeyableKt.keyable(4.0f), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, strokeEnd, strokeEnd2, f4, i5, 16340, defaultConstructorMarker2);
        EdgeDecorationType edgeDecorationType2 = EdgeDecorationType.SHADOW;
        KeyableFloat keyableFloatKeyable2 = KeyableKt.keyable(4.0f);
        KeyableSolidColor black = companion.getBLACK();
        KeyableVector2D keyableVector2DKeyable = KeyableKt.keyable(new Vector2D(3.0f, 3.0f));
        KeyableFloat.Companion companion2 = KeyableFloat.INSTANCE;
        NO_SHADOW = new KeyableEdgeDecoration(edgeDecorationType2, edgeDecorationDirection2, z3, black, keyable2, keyableFloatKeyable2, companion2.getZERO(), keyableVector2DKeyable, 0 == true ? 1 : 0, 0 == true ? 1 : 0, strokeEnd, strokeEnd2, f4, i5, 16148, defaultConstructorMarker2);
        NO_GLOW = new KeyableEdgeDecoration(EdgeDecorationType.GLOW, edgeDecorationDirection3, z3, companion.getWHITE(), keyable2, KeyableKt.keyable(4.0f), companion2.getZERO(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, strokeEnd, strokeEnd2, f4, i5, 16276, defaultConstructorMarker2);
    }

    public final Keyable<Float> getAlpha() {
        return this.alpha;
    }

    public final int getBorderId() {
        return this.borderId;
    }

    public final StrokeCap getCap() {
        return this.cap;
    }

    public final Keyable<SolidColor> getColor() {
        return this.color;
    }

    public final EdgeDecorationDirection getDirection() {
        return this.direction;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getEndSize() {
        return this.endSize;
    }

    public final StrokeEnd getEndStyle() {
        return this.endStyle;
    }

    public final Keyable<Float> getHardness() {
        return this.hardness;
    }

    public final StrokeJoin getJoin() {
        return this.join;
    }

    public final Keyable<Vector2D> getOffset() {
        return this.offset;
    }

    public final Keyable<Float> getSize() {
        return this.size;
    }

    public final StrokeEnd getStartStyle() {
        return this.startStyle;
    }

    public final EdgeDecorationType getType() {
        return this.type;
    }

    public /* synthetic */ KeyableEdgeDecoration(EdgeDecorationType edgeDecorationType, EdgeDecorationDirection edgeDecorationDirection, boolean z2, Keyable keyable, Keyable keyable2, Keyable keyable3, Keyable keyable4, Keyable keyable5, StrokeCap strokeCap, StrokeJoin strokeJoin, StrokeEnd strokeEnd, StrokeEnd strokeEnd2, float f3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(edgeDecorationType, (i3 & 2) != 0 ? EdgeDecorationDirection.OUTSIDE : edgeDecorationDirection, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? KeyableSolidColor.INSTANCE.getBLACK() : keyable, (i3 & 16) != 0 ? KeyableFloat.INSTANCE.getONE() : keyable2, (i3 & 32) != 0 ? KeyableFloat.INSTANCE.getONE() : keyable3, (i3 & 64) != 0 ? KeyableFloat.INSTANCE.getONE() : keyable4, (i3 & 128) != 0 ? KeyableVector2D.INSTANCE.getZERO() : keyable5, (i3 & 256) != 0 ? StrokeCap.Round : strokeCap, (i3 & 512) != 0 ? StrokeJoin.Bevel : strokeJoin, (i3 & 1024) != 0 ? StrokeEnd.None : strokeEnd, (i3 & 2048) != 0 ? StrokeEnd.None : strokeEnd2, (i3 & 4096) != 0 ? 1.5f : f3, (i3 & 8192) != 0 ? 0 : i2);
    }
}
