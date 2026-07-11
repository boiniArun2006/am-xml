package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b&\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b*\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010.R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00101R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00101R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010!R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u00101R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u00101R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bA\u00101R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "Ljava/lang/String;", "J2", "()Ljava/lang/String;", "t", "Ljava/util/List;", "Uo", "()Ljava/util/List;", "O", "I", "KN", "Landroidx/compose/ui/graphics/Brush;", "()Landroidx/compose/ui/graphics/Brush;", "r", "F", "()F", "o", "xMQ", "Z", "mUb", "S", "ty", "g", "gh", "E2", "qie", "e", "az", "X", "Ik", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "HI", "N", "ck", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorPath extends VectorNode {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final int strokeLineJoin;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Brush fill;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final float trimPathOffset;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int pathFillType;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineWidth;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float trimPathEnd;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final float trimPathStart;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final float strokeAlpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineMiter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineCap;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Brush stroke;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final float fillAlpha;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List pathData;

    public /* synthetic */ VectorPath(String str, List list, int i2, Brush brush, float f3, Brush brush2, float f4, float f5, int i3, int i5, float f6, float f7, float f8, float f9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i2, brush, f3, brush2, f4, f5, i3, i5, f6, f7, f8, f9);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && VectorPath.class == other.getClass()) {
            VectorPath vectorPath = (VectorPath) other;
            return Intrinsics.areEqual(this.name, vectorPath.name) && Intrinsics.areEqual(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && Intrinsics.areEqual(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.Uo(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.Uo(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.J2(this.pathFillType, vectorPath.pathFillType) && Intrinsics.areEqual(this.pathData, vectorPath.pathData);
        }
        return false;
    }

    private VectorPath(String str, List list, int i2, Brush brush, float f3, Brush brush2, float f4, float f5, int i3, int i5, float f6, float f7, float f8, float f9) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i2;
        this.fill = brush;
        this.fillAlpha = f3;
        this.stroke = brush2;
        this.strokeAlpha = f4;
        this.strokeLineWidth = f5;
        this.strokeLineCap = i3;
        this.strokeLineJoin = i5;
        this.strokeLineMiter = f6;
        this.trimPathStart = f7;
        this.trimPathEnd = f8;
        this.trimPathOffset = f9;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final List getPathData() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        Brush brush = this.fill;
        int iHashCode2 = (((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (brush2 != null ? brush2.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + StrokeCap.KN(this.strokeLineCap)) * 31) + StrokeJoin.KN(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.Uo(this.pathFillType);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Brush getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Brush getStroke() {
        return this.stroke;
    }
}
