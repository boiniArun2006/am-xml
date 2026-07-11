package androidx.media3.ui.compose.state;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberPlaybackSpeedState", "Landroidx/media3/ui/compose/state/PlaybackSpeedState;", "player", "Landroidx/media3/common/Player;", "(Landroidx/media3/common/Player;Landroidx/compose/runtime/Composer;I)Landroidx/media3/ui/compose/state/PlaybackSpeedState;", "lib-ui-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlaybackSpeedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaybackSpeedState.kt\nandroidx/media3/ui/compose/state/PlaybackSpeedStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,86:1\n1225#2,6:87\n1225#2,6:93\n*S KotlinDebug\n*F\n+ 1 PlaybackSpeedState.kt\nandroidx/media3/ui/compose/state/PlaybackSpeedStateKt\n*L\n38#1:87,6\n39#1:93,6\n*E\n"})
public final class PlaybackSpeedStateKt {
    @Composable
    @UnstableApi
    public static final PlaybackSpeedState rememberPlaybackSpeedState(Player player, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(player, "player");
        composer.eF(-552324560);
        if (ComposerKt.v()) {
            ComposerKt.p5(-552324560, i2, -1, "androidx.media3.ui.compose.state.rememberPlaybackSpeedState (PlaybackSpeedState.kt:36)");
        }
        composer.eF(-959432454);
        boolean zP5 = composer.p5(player);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new PlaybackSpeedState(player);
            composer.o(objIF);
        }
        PlaybackSpeedState playbackSpeedState = (PlaybackSpeedState) objIF;
        composer.Xw();
        composer.eF(-959430133);
        boolean zE2 = composer.E2(playbackSpeedState);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new PlaybackSpeedStateKt$rememberPlaybackSpeedState$1$1(playbackSpeedState, null);
            composer.o(objIF2);
        }
        composer.Xw();
        EffectsKt.O(player, (Function2) objIF2, composer, i2 & 14);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return playbackSpeedState;
    }
}
