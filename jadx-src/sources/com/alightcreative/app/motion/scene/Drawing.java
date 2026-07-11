package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/app/motion/scene/Drawing;", "", "strokes", "", "Lcom/alightcreative/app/motion/scene/Stroke;", "<init>", "(Ljava/util/List;)V", "getStrokes", "()Ljava/util/List;", "toString", "", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Drawing {
    private final List<Stroke> strokes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Drawing EMPTY = new Drawing(CollectionsKt.emptyList());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/Drawing$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/alightcreative/app/motion/scene/Drawing;", "getEMPTY", "()Lcom/alightcreative/app/motion/scene/Drawing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Drawing getEMPTY() {
            return Drawing.EMPTY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Drawing copy$default(Drawing drawing, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = drawing.strokes;
        }
        return drawing.copy(list);
    }

    public final List<Stroke> component1() {
        return this.strokes;
    }

    public final Drawing copy(List<Stroke> strokes) {
        Intrinsics.checkNotNullParameter(strokes, "strokes");
        return new Drawing(strokes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Drawing) && Intrinsics.areEqual(this.strokes, ((Drawing) other).strokes);
    }

    public int hashCode() {
        return this.strokes.hashCode();
    }

    public Drawing(List<Stroke> strokes) {
        Intrinsics.checkNotNullParameter(strokes, "strokes");
        this.strokes = strokes;
    }

    public final List<Stroke> getStrokes() {
        return this.strokes;
    }

    public String toString() {
        return "[Drawing: " + this.strokes.size() + " strokes]";
    }
}
