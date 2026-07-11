package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\u001a\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b\"\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/TextUnit;", "size", "padding", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/ui/graphics/Shape;", "O", "()Landroidx/compose/ui/graphics/Shape;", "rl", "J", "J2", "()J", "t", "nr", "Landroidx/compose/ui/graphics/Brush;", "()Landroidx/compose/ui/graphics/Brush;", "F", "()F", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Bullet implements AnnotatedString.Annotation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final DrawStyle drawStyle;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shape shape;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final Brush brush;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long padding;

    public /* synthetic */ Bullet(Shape shape, long j2, long j3, Brush brush, float f3, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j2, j3, brush, f3, drawStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Bullet)) {
            Bullet bullet = (Bullet) other;
            return Intrinsics.areEqual(this.shape, bullet.shape) && TextUnit.O(this.size, bullet.size) && TextUnit.O(this.padding, bullet.padding) && Intrinsics.areEqual(this.brush, bullet.brush) && this.alpha == bullet.alpha && Intrinsics.areEqual(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    private Bullet(Shape shape, long j2, long j3, Brush brush, float f3, DrawStyle drawStyle) {
        this.shape = shape;
        this.size = j2;
        this.padding = j3;
        this.brush = brush;
        this.alpha = f3;
        this.drawStyle = drawStyle;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = ((((this.shape.hashCode() * 31) + TextUnit.xMQ(this.size)) * 31) + TextUnit.xMQ(this.padding)) * 31;
        Brush brush = this.brush;
        return ((((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.drawStyle.hashCode();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Brush getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + ((Object) TextUnit.gh(this.size)) + ", padding=" + ((Object) TextUnit.gh(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }
}
