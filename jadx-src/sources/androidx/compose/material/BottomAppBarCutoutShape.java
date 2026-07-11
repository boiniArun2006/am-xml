package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0015\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "Landroidx/compose/material/FabPlacement;", "fabPlacement", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "", "rl", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "", "cutoutStartPosition", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "t", "(Landroidx/compose/ui/graphics/Path;FFFFF)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Outline;", c.f62177j, "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Shape;", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material/FabPlacement;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,741:1\n1#2:742\n615#3:743\n590#3:744\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n546#1:743\n546#1:744\n*E\n"})
final /* data */ class BottomAppBarCutoutShape implements Shape {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shape cutoutShape;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final FabPlacement fabPlacement;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) other;
        return Intrinsics.areEqual(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && Intrinsics.areEqual(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }

    private final void t(Path path, float f3, float f4, float f5, float f6, float f7) {
        float f8 = -((float) Math.sqrt((f5 * f5) - (f7 * f7)));
        float f9 = f5 + f8;
        float f10 = f3 + f9;
        float f11 = f4 - f9;
        Pair pairHI = AppBarKt.HI(f8 - 1.0f, f7, f5);
        float fFloatValue = ((Number) pairHI.component1()).floatValue() + f5;
        float fFloatValue2 = ((Number) pairHI.component2()).floatValue() - f7;
        path.Ik(f10 - f6, 0.0f);
        path.xMQ(f10 - 1.0f, 0.0f, f3 + fFloatValue, fFloatValue2);
        path.S(f4 - fFloatValue, fFloatValue2);
        path.xMQ(f11 + 1.0f, 0.0f, f6 + f11, 0.0f);
        path.close();
    }

    public BottomAppBarCutoutShape(Shape shape, FabPlacement fabPlacement) {
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement;
    }

    private final void rl(Path path, LayoutDirection layoutDirection, Density density) {
        float fL = density.l(AppBarKt.f21184O);
        float f3 = 2 * fL;
        long jN = SizeKt.n(this.fabPlacement.getWidth() + f3, this.fabPlacement.getHeight() + f3);
        float f4 = this.fabPlacement.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String() - fL;
        float fGh = f4 + Size.gh(jN);
        float fXMQ = Size.xMQ(jN) / 2.0f;
        OutlineKt.n(path, this.cutoutShape.n(jN, layoutDirection, density));
        path.qie(OffsetKt.n(f4, -fXMQ));
        if (Intrinsics.areEqual(this.cutoutShape, RoundedCornerShapeKt.J2())) {
            t(path, f4, fGh, fXMQ, density.l(AppBarKt.J2), 0.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.Shape
    public Outline n(long size, LayoutDirection layoutDirection, Density density) {
        Path pathN = AndroidPath_androidKt.n();
        Path.n(pathN, new Rect(0.0f, 0.0f, Size.gh(size), Size.xMQ(size)), null, 2, null);
        Path pathN2 = AndroidPath_androidKt.n();
        rl(pathN2, layoutDirection, density);
        pathN2.o(pathN, pathN2, PathOperation.INSTANCE.n());
        return new Outline.Generic(pathN2);
    }
}
