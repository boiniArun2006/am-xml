package androidx.media3.ui.compose.state;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberRepeatButtonState", "Landroidx/media3/ui/compose/state/RepeatButtonState;", "player", "Landroidx/media3/common/Player;", "toggleModeSequence", "", "", "(Landroidx/media3/common/Player;Ljava/util/List;Landroidx/compose/runtime/Composer;II)Landroidx/media3/ui/compose/state/RepeatButtonState;", "lib-ui-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRepeatButtonState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatButtonState.kt\nandroidx/media3/ui/compose/state/RepeatButtonStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n1225#2,6:109\n1225#2,6:115\n*S KotlinDebug\n*F\n+ 1 RepeatButtonState.kt\nandroidx/media3/ui/compose/state/RepeatButtonStateKt\n*L\n42#1:109,6\n43#1:115,6\n*E\n"})
public final class RepeatButtonStateKt {
    @Composable
    @UnstableApi
    public static final RepeatButtonState rememberRepeatButtonState(Player player, List<Integer> list, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(player, "player");
        composer.eF(-1136736939);
        if ((i3 & 2) != 0) {
            list = CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2});
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1136736939, i2, -1, "androidx.media3.ui.compose.state.rememberRepeatButtonState (RepeatButtonState.kt:40)");
        }
        composer.eF(-1518557024);
        boolean zP5 = composer.p5(player);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new RepeatButtonState(player, list);
            composer.o(objIF);
        }
        RepeatButtonState repeatButtonState = (RepeatButtonState) objIF;
        composer.Xw();
        composer.eF(-1518554115);
        boolean zE2 = composer.E2(repeatButtonState);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new RepeatButtonStateKt$rememberRepeatButtonState$1$1(repeatButtonState, null);
            composer.o(objIF2);
        }
        composer.Xw();
        EffectsKt.O(player, (Function2) objIF2, composer, i2 & 14);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return repeatButtonState;
    }
}
