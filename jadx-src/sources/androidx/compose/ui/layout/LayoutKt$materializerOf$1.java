package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "", c.f62177j, "(Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,415:1\n4305#2,2:416\n4307#2,2:424\n4206#3,6:418\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n199#1:416,2\n199#1:424,2\n201#1:418,6\n*E\n"})
final class LayoutKt$materializerOf$1 extends Lambda implements Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Modifier f32245n;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
        n(skippableUpdater.getComposer(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Composer composer, Composer composer2, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1586257396, i2, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:196)");
        }
        int iN = ComposablesKt.n(composer2, 0);
        Modifier modifierO = ComposedModifierKt.O(composer2, this.f32245n);
        composer.te(509942095);
        Composer composerN = Updater.n(composer);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.O(composerN, modifierO, companion.nr());
        Function2 function2Rl = companion.rl();
        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
            composerN.o(Integer.valueOf(iN));
            composerN.az(Integer.valueOf(iN), function2Rl);
        }
        composer.M7();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
