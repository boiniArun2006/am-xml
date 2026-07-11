package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,55:1\n121#2,6:56\n128#2,4:71\n132#2:81\n134#2:84\n272#3,9:62\n281#3,2:82\n4206#4,6:75\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n39#1:56,6\n39#1:71,4\n39#1:81\n39#1:84\n39#1:62,9\n39#1:82,2\n39#1:75,6\n*E\n"})
public final class SpacerKt {
    public static final void n(Modifier modifier, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-72882467, i2, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f17822n;
        int iN = ComposablesKt.n(composer, 0);
        Modifier modifierO = ComposedModifierKt.O(composer, modifier);
        CompositionLocalMap compositionLocalMapIk = composer.Ik();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0 function0N = companion.n();
        if (composer.getApplier() == null) {
            ComposablesKt.t();
        }
        composer.T();
        if (composer.getInserting()) {
            composer.s7N(function0N);
        } else {
            composer.r();
        }
        Composer composerN = Updater.n(composer);
        Updater.O(composerN, spacerMeasurePolicy, companion.t());
        Updater.O(composerN, compositionLocalMapIk, companion.O());
        Updater.O(composerN, modifierO, companion.nr());
        Function2 function2Rl = companion.rl();
        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
            composerN.o(Integer.valueOf(iN));
            composerN.az(Integer.valueOf(iN), function2Rl);
        }
        composer.XQ();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
