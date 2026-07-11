package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", TtmlNode.ATTR_TTS_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/ui/node/DelegatableNode;", "t", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/Indication;", "J2", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Landroidx/compose/animation/core/AnimationSpec;", "", "nr", "(Landroidx/compose/foundation/interaction/Interaction;)Landroidx/compose/animation/core/AnimationSpec;", "O", "Landroidx/compose/animation/core/TweenSpec;", c.f62177j, "Landroidx/compose/animation/core/TweenSpec;", "DefaultTweenSpec", "material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,530:1\n1247#2,6:531\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n147#1:531,6\n*E\n"})
public final class RippleKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TweenSpec f24044n = new TweenSpec(15, 0, EasingKt.O(), 2, null);

    public static final Indication J2(boolean z2, float f3, long j2, Composer composer, int i2, int i3) {
        boolean z3 = true;
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        if ((i3 & 2) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i3 & 4) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1635163520, i2, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, (i2 >> 6) & 14);
        boolean z4 = (((i2 & 14) ^ 6) > 4 && composer.n(z2)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.rl(f3)) && (i2 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object objIF = composer.iF();
        if (z5 || objIF == Composer.INSTANCE.n()) {
            objIF = new PlatformRipple(z2, f3, stateCk, null);
            composer.o(objIF);
        }
        PlatformRipple platformRipple = (PlatformRipple) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return platformRipple;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec O(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? f24044n : interaction instanceof FocusInteraction.Focus ? f24044n : interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.O(), 2, null) : f24044n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec nr(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? f24044n : interaction instanceof FocusInteraction.Focus ? new TweenSpec(45, 0, EasingKt.O(), 2, null) : interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.O(), 2, null) : f24044n;
    }

    public static final DelegatableNode t(InteractionSource interactionSource, boolean z2, float f3, ColorProducer colorProducer, Function0 function0) {
        return Ripple_androidKt.nr(interactionSource, z2, f3, colorProducer, function0);
    }
}
