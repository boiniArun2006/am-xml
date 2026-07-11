package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0087\u0001\u0010\u0016\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,131:1\n149#2:132\n149#2:133\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n63#1:132\n114#1:133\n*E\n"})
public final class CardKt {
    public static final void n(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f3, Function2 function2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            shape = MaterialTheme.f22169n.rl(composer, 6).getMedium();
        }
        Shape shape2 = shape;
        long jTy = (i3 & 4) != 0 ? MaterialTheme.f22169n.n(composer, 6).ty() : j2;
        long jRl = (i3 & 8) != 0 ? ColorsKt.rl(jTy, composer, (i2 >> 6) & 14) : j3;
        BorderStroke borderStroke2 = (i3 & 16) != 0 ? null : borderStroke;
        float fKN = (i3 & 32) != 0 ? Dp.KN(1) : f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(1956755640, i2, -1, "androidx.compose.material.Card (Card.kt:64)");
        }
        SurfaceKt.n(modifier, shape2, jTy, jRl, borderStroke2, fKN, function2, composer, i2 & 4194302, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void rl(Function0 function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, BorderStroke borderStroke, float f3, MutableInteractionSource mutableInteractionSource, Function2 function2, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z3 = (i3 & 4) != 0 ? true : z2;
        Shape medium = (i3 & 8) != 0 ? MaterialTheme.f22169n.rl(composer, 6).getMedium() : shape;
        long jTy = (i3 & 16) != 0 ? MaterialTheme.f22169n.n(composer, 6).ty() : j2;
        long jRl = (i3 & 32) != 0 ? ColorsKt.rl(jTy, composer, (i2 >> 12) & 14) : j3;
        BorderStroke borderStroke2 = (i3 & 64) != 0 ? null : borderStroke;
        float fKN = (i3 & 128) != 0 ? Dp.KN(1) : f3;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 256) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.v()) {
            ComposerKt.p5(778538979, i2, -1, "androidx.compose.material.Card (Card.kt:116)");
        }
        float f4 = fKN;
        SurfaceKt.rl(function0, modifier2, z3, medium, jTy, jRl, borderStroke2, f4, mutableInteractionSource2, function2, composer, i2 & 2147483646, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
