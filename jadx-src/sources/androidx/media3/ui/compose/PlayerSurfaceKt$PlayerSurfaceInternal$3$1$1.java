package androidx.media3.ui.compose;

import GJW.vd;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.Player;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1", f = "PlayerSurface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Player, T, Unit> $clearViewFromPlayer;
    final /* synthetic */ Player $player;
    final /* synthetic */ MutableState<Player> $registeredPlayer$delegate;
    final /* synthetic */ Function2<Player, T, Unit> $setViewOnPlayer;

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/media3/common/Player;Lkotlin/jvm/functions/Function2<-Landroidx/media3/common/Player;-TT;Lkotlin/Unit;>;TT;Landroidx/compose/runtime/MutableState<Landroidx/media3/common/Player;>;Lkotlin/jvm/functions/Function2<-Landroidx/media3/common/Player;-TT;Lkotlin/Unit;>;Lkotlin/coroutines/Continuation<-Landroidx/media3/ui/compose/PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1;>;)V */
    PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1(Player player, Function2 function2, View view, MutableState mutableState, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.$player = player;
        this.$setViewOnPlayer = function2;
        this.$view = view;
        this.$registeredPlayer$delegate = mutableState;
        this.$clearViewFromPlayer = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1(this.$player, this.$setViewOnPlayer, this.$view, this.$registeredPlayer$delegate, this.$clearViewFromPlayer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return ((PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Player playerPlayerSurfaceInternal$lambda$17 = PlayerSurfaceKt.PlayerSurfaceInternal$lambda$17(this.$registeredPlayer$delegate);
            if (playerPlayerSurfaceInternal$lambda$17 != null) {
                Function2<Player, T, Unit> function2 = this.$clearViewFromPlayer;
                View view = this.$view;
                MutableState<Player> mutableState = this.$registeredPlayer$delegate;
                if (playerPlayerSurfaceInternal$lambda$17.isCommandAvailable(27)) {
                    function2.invoke(playerPlayerSurfaceInternal$lambda$17, (T) view);
                }
                mutableState.setValue(null);
            }
            if (this.$player.isCommandAvailable(27)) {
                this.$setViewOnPlayer.invoke(this.$player, (T) this.$view);
                this.$registeredPlayer$delegate.setValue(this.$player);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
