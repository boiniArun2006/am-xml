package androidx.media3.ui.compose.modifiers;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.ui.compose.modifiers.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"resizeWithContentScale", "Landroidx/compose/ui/Modifier;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "sourceSizeDp", "Landroidx/compose/ui/geometry/Size;", "density", "Landroidx/compose/ui/unit/Density;", "resizeWithContentScale-XrYQPog", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/geometry/Size;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "lib-ui-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/media3/ui/compose/modifiers/ExtensionsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n77#2:66\n1225#3,6:67\n1#4:73\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/media3/ui/compose/modifiers/ExtensionsKt\n*L\n41#1:66\n48#1:67,6\n*E\n"})
public final class ExtensionsKt {
    @Composable
    @UnstableApi
    /* JADX INFO: renamed from: resizeWithContentScale-XrYQPog, reason: not valid java name */
    public static final Modifier m12resizeWithContentScaleXrYQPog(Modifier resizeWithContentScale, final ContentScale contentScale, Size size, final Density density, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(resizeWithContentScale, "$this$resizeWithContentScale");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        composer.eF(-363477779);
        if ((i3 & 4) != 0) {
            density = (Density) composer.ty(CompositionLocalsKt.J2());
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-363477779, i2, -1, "androidx.media3.ui.compose.modifiers.resizeWithContentScale (extensions.kt:42)");
        }
        Modifier modifier = Modifier.INSTANCE;
        boolean z2 = true;
        Modifier modifierN = null;
        Modifier modifierE2 = SizeKt.E2(SizeKt.J2(modifier, 0.0f, 1, null), null, false, 3, null);
        if (size != null) {
            final long packedValue = size.getPackedValue();
            composer.eF(-1859173560);
            boolean zNr = ((((i2 & 7168) ^ 3072) > 2048 && composer.p5(density)) || (i2 & 3072) == 2048) | composer.nr(packedValue);
            if ((((i2 & 112) ^ 48) <= 32 || !composer.p5(contentScale)) && (i2 & 48) != 32) {
                z2 = false;
            }
            boolean z3 = zNr | z2;
            Object objIF = composer.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function3() { // from class: bfg.j
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ExtensionsKt.resizeWithContentScale_XrYQPog$lambda$4$lambda$3$lambda$2(density, contentScale, packedValue, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            modifierN = LayoutModifierKt.n(modifier, (Function3) objIF);
        }
        if (modifierN != null) {
            modifier = modifierN;
        }
        Modifier modifierZmq = resizeWithContentScale.Zmq(modifierE2.Zmq(modifier));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierZmq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult resizeWithContentScale_XrYQPog$lambda$4$lambda$3$lambda$2(Density density, ContentScale contentScale, long j2, MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jN = androidx.compose.ui.geometry.SizeKt.n(density.l(Dp.KN(Size.gh(j2))), density.l(Dp.KN(Size.xMQ(j2))));
        long jN2 = contentScale.n(jN, androidx.compose.ui.geometry.SizeKt.n(Constraints.qie(constraints.getValue()), Constraints.gh(constraints.getValue())));
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(constraints.getValue(), 0, MathKt.roundToInt(Size.gh(jN) * ScaleFactor.t(jN2)), 0, MathKt.roundToInt(Size.xMQ(jN) * ScaleFactor.nr(jN2)), 5, null));
        return MeasureScope.ER(layout, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1() { // from class: bfg.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExtensionsKt.resizeWithContentScale_XrYQPog$lambda$4$lambda$3$lambda$2$lambda$1(placeableDR0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resizeWithContentScale_XrYQPog$lambda$4$lambda$3$lambda$2$lambda$1(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.xMQ(layout, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
