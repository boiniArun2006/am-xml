package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/alightcreative/app/motion/scene/Stroke;", "", "points", "", "Lcom/alightcreative/app/motion/scene/StrokePoint;", TtmlNode.ATTR_TTS_COLOR, "Lcom/alightcreative/app/motion/scene/SolidColor;", "tool", "Lcom/alightcreative/app/motion/scene/DrawingTool;", "width", "", "<init>", "(Ljava/util/List;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/DrawingTool;F)V", "getPoints", "()Ljava/util/List;", "getColor", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getTool", "()Lcom/alightcreative/app/motion/scene/DrawingTool;", "getWidth", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Stroke {
    private final SolidColor color;
    private final List<StrokePoint> points;
    private final DrawingTool tool;
    private final float width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Stroke EMPTY = new Stroke(CollectionsKt.emptyList(), SolidColor.INSTANCE.getWHITE(), DrawingTool.PEN, 10.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/Stroke$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/alightcreative/app/motion/scene/Stroke;", "getEMPTY", "()Lcom/alightcreative/app/motion/scene/Stroke;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Stroke getEMPTY() {
            return Stroke.EMPTY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Stroke copy$default(Stroke stroke, List list, SolidColor solidColor, DrawingTool drawingTool, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = stroke.points;
        }
        if ((i2 & 2) != 0) {
            solidColor = stroke.color;
        }
        if ((i2 & 4) != 0) {
            drawingTool = stroke.tool;
        }
        if ((i2 & 8) != 0) {
            f3 = stroke.width;
        }
        return stroke.copy(list, solidColor, drawingTool, f3);
    }

    public final List<StrokePoint> component1() {
        return this.points;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SolidColor getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DrawingTool getTool() {
        return this.tool;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final Stroke copy(List<StrokePoint> points, SolidColor color, DrawingTool tool, float width) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(tool, "tool");
        return new Stroke(points, color, tool, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return Intrinsics.areEqual(this.points, stroke.points) && Intrinsics.areEqual(this.color, stroke.color) && this.tool == stroke.tool && Float.compare(this.width, stroke.width) == 0;
    }

    public int hashCode() {
        return (((((this.points.hashCode() * 31) + this.color.hashCode()) * 31) + this.tool.hashCode()) * 31) + Float.hashCode(this.width);
    }

    public String toString() {
        return "Stroke(points=" + this.points + ", color=" + this.color + ", tool=" + this.tool + ", width=" + this.width + ")";
    }

    public Stroke(List<StrokePoint> points, SolidColor color, DrawingTool tool, float f3) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(tool, "tool");
        this.points = points;
        this.color = color;
        this.tool = tool;
        this.width = f3;
    }

    public final SolidColor getColor() {
        return this.color;
    }

    public final List<StrokePoint> getPoints() {
        return this.points;
    }

    public final DrawingTool getTool() {
        return this.tool;
    }

    public final float getWidth() {
        return this.width;
    }
}
