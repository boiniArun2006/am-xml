package androidx.media3.ui.compose.state;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.Player;
import androidx.media3.common.PlayerExtensionsKt;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006\u0017"}, d2 = {"Landroidx/media3/ui/compose/state/PlayPauseButtonState;", "", "player", "Landroidx/media3/common/Player;", "<init>", "(Landroidx/media3/common/Player;)V", "<set-?>", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "isEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "showPlay", "getShowPlay", "setShowPlay", "showPlay$delegate", "onClick", "", "observe", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-ui-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
@SourceDebugExtension({"SMAP\nPlayPauseButtonState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayPauseButtonState.kt\nandroidx/media3/ui/compose/state/PlayPauseButtonState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,98:1\n81#2:99\n107#2,2:100\n81#2:102\n107#2,2:103\n*S KotlinDebug\n*F\n+ 1 PlayPauseButtonState.kt\nandroidx/media3/ui/compose/state/PlayPauseButtonState\n*L\n55#1:99\n55#1:100,2\n58#1:102\n58#1:103,2\n*E\n"})
public final class PlayPauseButtonState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isEnabled$delegate, reason: from kotlin metadata */
    private final MutableState isEnabled;
    private final Player player;

    /* JADX INFO: renamed from: showPlay$delegate, reason: from kotlin metadata */
    private final MutableState showPlay;

    /* JADX INFO: renamed from: androidx.media3.ui.compose.state.PlayPauseButtonState$observe$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.media3.ui.compose.state.PlayPauseButtonState", f = "PlayPauseButtonState.kt", i = {}, l = {85}, m = "observe", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlayPauseButtonState.this.observe(this);
        }
    }

    public PlayPauseButtonState(Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.player = player;
        this.isEnabled = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(Util.shouldEnablePlayPauseButton(player)), null, 2, null);
        this.showPlay = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(Util.shouldShowPlayButton(player)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$0(PlayPauseButtonState playPauseButtonState, Player listen, Player.Events events) {
        Intrinsics.checkNotNullParameter(listen, "$this$listen");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.containsAny(4, 5, 13)) {
            playPauseButtonState.setShowPlay(Util.shouldShowPlayButton(listen));
            playPauseButtonState.setEnabled(Util.shouldEnablePlayPauseButton(listen));
        }
        return Unit.INSTANCE;
    }

    private final void setEnabled(boolean z2) {
        this.isEnabled.setValue(Boolean.valueOf(z2));
    }

    private final void setShowPlay(boolean z2) {
        this.showPlay.setValue(Boolean.valueOf(z2));
    }

    public final boolean getShowPlay() {
        return ((Boolean) this.showPlay.getValue()).booleanValue();
    }

    public final boolean isEnabled() {
        return ((Boolean) this.isEnabled.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object observe(Continuation<?> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Player player = this.player;
            Function2 function2 = new Function2() { // from class: androidx.media3.ui.compose.state.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PlayPauseButtonState.observe$lambda$0(this.f39949n, (Player) obj2, (Player.Events) obj3);
                }
            };
            anonymousClass1.label = 1;
            if (PlayerExtensionsKt.listen(player, function2, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void onClick() {
        Util.handlePlayPauseButtonAction(this.player);
    }
}
