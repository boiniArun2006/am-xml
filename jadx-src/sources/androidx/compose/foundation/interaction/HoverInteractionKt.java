package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/runtime/State;", "", c.f62177j, "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHoverInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,78:1\n1247#2,6:79\n1247#2,6:85\n*S KotlinDebug\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n*L\n65#1:79,6\n66#1:85,6\n*E\n"})
public final class HoverInteractionKt {
    public static final State n(InteractionSource interactionSource, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(1206586544, i2, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:63)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        int i3 = i2 & 14;
        if (((i3 ^ 6) > 4 && composer.p5(interactionSource)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object objIF2 = composer.iF();
        if (z2 || objIF2 == companion.n()) {
            objIF2 = new HoverInteractionKt$collectIsHoveredAsState$1$1(interactionSource, mutableState, null);
            composer.o(objIF2);
        }
        EffectsKt.O(interactionSource, (Function2) objIF2, composer, i3);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableState;
    }
}
