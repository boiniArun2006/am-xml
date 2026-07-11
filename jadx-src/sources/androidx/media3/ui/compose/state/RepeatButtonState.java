package androidx.media3.ui.compose.state;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.Player;
import androidx.media3.common.PlayerExtensionsKt;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Landroidx/media3/ui/compose/state/RepeatButtonState;", "", "player", "Landroidx/media3/common/Player;", "toggleModeSequence", "", "", "<init>", "(Landroidx/media3/common/Player;Ljava/util/List;)V", "<set-?>", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "isEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "repeatModeState", "getRepeatModeState", "()I", "setRepeatModeState", "(I)V", "repeatModeState$delegate", "Landroidx/compose/runtime/MutableIntState;", "onClick", "", "observe", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextRepeatModeInSequence", "lib-ui-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
@SourceDebugExtension({"SMAP\nRepeatButtonState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatButtonState.kt\nandroidx/media3/ui/compose/state/RepeatButtonState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n78#3:112\n111#3,2:113\n*S KotlinDebug\n*F\n+ 1 RepeatButtonState.kt\nandroidx/media3/ui/compose/state/RepeatButtonState\n*L\n67#1:109\n67#1:110,2\n72#1:112\n72#1:113,2\n*E\n"})
public final class RepeatButtonState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isEnabled$delegate, reason: from kotlin metadata */
    private final MutableState isEnabled;
    private final Player player;

    /* JADX INFO: renamed from: repeatModeState$delegate, reason: from kotlin metadata */
    private final MutableIntState repeatModeState;
    private final List<Integer> toggleModeSequence;

    /* JADX INFO: renamed from: androidx.media3.ui.compose.state.RepeatButtonState$observe$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.media3.ui.compose.state.RepeatButtonState", f = "RepeatButtonState.kt", i = {}, l = {90}, m = "observe", n = {}, s = {})
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
            return RepeatButtonState.this.observe(this);
        }
    }

    public RepeatButtonState(Player player, List<Integer> toggleModeSequence) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(toggleModeSequence, "toggleModeSequence");
        this.player = player;
        this.toggleModeSequence = toggleModeSequence;
        this.isEnabled = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(player.isCommandAvailable(15) && !toggleModeSequence.isEmpty()), null, 2, null);
        this.repeatModeState = SnapshotIntStateKt.n(player.getRepeatMode());
    }

    private final int getNextRepeatModeInSequence() {
        int iIndexOf = this.toggleModeSequence.indexOf(Integer.valueOf(this.player.getRepeatMode()));
        List<Integer> list = this.toggleModeSequence;
        return list.get((iIndexOf + 1) % list.size()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$0(RepeatButtonState repeatButtonState, Player listen, Player.Events events) {
        Intrinsics.checkNotNullParameter(listen, "$this$listen");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.containsAny(8, 13)) {
            repeatButtonState.setRepeatModeState(listen.getRepeatMode());
            repeatButtonState.setEnabled(listen.isCommandAvailable(15));
        }
        return Unit.INSTANCE;
    }

    private final void setEnabled(boolean z2) {
        this.isEnabled.setValue(Boolean.valueOf(z2));
    }

    private final void setRepeatModeState(int i2) {
        this.repeatModeState.KN(i2);
    }

    public final int getRepeatModeState() {
        return this.repeatModeState.J2();
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
            Function2 function2 = new Function2() { // from class: androidx.media3.ui.compose.state.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RepeatButtonState.observe$lambda$0(this.f39947n, (Player) obj2, (Player.Events) obj3);
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
        this.player.setRepeatMode(getNextRepeatModeInSequence());
    }

    public /* synthetic */ RepeatButtonState(Player player, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(player, (i2 & 2) != 0 ? CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2}) : list);
    }
}
