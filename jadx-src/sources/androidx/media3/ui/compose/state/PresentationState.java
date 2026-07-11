package androidx.media3.ui.compose.state;

import androidx.annotation.Nullable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.media3.common.Player;
import androidx.media3.common.PlayerExtensionsKt;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010#\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/media3/ui/compose/state/PresentationState;", "", "player", "Landroidx/media3/common/Player;", "<init>", "(Landroidx/media3/common/Player;)V", "<set-?>", "Landroidx/compose/ui/geometry/Size;", "videoSizeDp", "getVideoSizeDp-VsRJwc0", "()Landroidx/compose/ui/geometry/Size;", "setVideoSizeDp-iaC8Vc4", "(Landroidx/compose/ui/geometry/Size;)V", "videoSizeDp$delegate", "Landroidx/compose/runtime/MutableState;", "", "coverSurface", "getCoverSurface", "()Z", "setCoverSurface", "(Z)V", "coverSurface$delegate", "value", "keepContentOnReset", "getKeepContentOnReset", "setKeepContentOnReset", "lastPeriodUidWithTracks", "observe", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoSizeDp", "getVideoSizeDp-hgXytuQ", "maybeHideSurface", "", "shouldKeepSurfaceVisible", "hasSelectedVideoTrack", "lib-ui-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@UnstableApi
@SourceDebugExtension({"SMAP\nPresentationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationState.kt\nandroidx/media3/ui/compose/state/PresentationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,167:1\n81#2:168\n107#2,2:169\n81#2:171\n107#2,2:172\n*S KotlinDebug\n*F\n+ 1 PresentationState.kt\nandroidx/media3/ui/compose/state/PresentationState\n*L\n66#1:168\n66#1:169,2\n69#1:171\n69#1:172,2\n*E\n"})
public final class PresentationState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: coverSurface$delegate, reason: from kotlin metadata */
    private final MutableState coverSurface;
    private boolean keepContentOnReset;
    private Object lastPeriodUidWithTracks;
    private final Player player;

    /* JADX INFO: renamed from: videoSizeDp$delegate, reason: from kotlin metadata */
    private final MutableState videoSizeDp;

    /* JADX INFO: renamed from: androidx.media3.ui.compose.state.PresentationState$observe$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.media3.ui.compose.state.PresentationState", f = "PresentationState.kt", i = {}, l = {87}, m = "observe", n = {}, s = {})
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
            return PresentationState.this.observe(this);
        }
    }

    public PresentationState(Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.player = player;
        this.videoSizeDp = SnapshotStateKt__SnapshotStateKt.O(m13getVideoSizeDphgXytuQ(player), null, 2, null);
        this.coverSurface = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
    }

    private final boolean hasSelectedVideoTrack() {
        return this.player.isCommandAvailable(30) && this.player.getCurrentTracks().isTypeSelected(2);
    }

    private final void maybeHideSurface(Player player) {
        boolean z2 = player.isCommandAvailable(30) && !player.getCurrentTracks().isEmpty();
        if (shouldKeepSurfaceVisible(player)) {
            return;
        }
        if (!this.keepContentOnReset && !z2) {
            setCoverSurface(true);
        }
        if (!z2 || hasSelectedVideoTrack()) {
            return;
        }
        setCoverSurface(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$0(PresentationState presentationState, Player listen, Player.Events events) {
        Intrinsics.checkNotNullParameter(listen, "$this$listen");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.contains(25) && !Intrinsics.areEqual(listen.getVideoSize(), VideoSize.UNKNOWN) && listen.getPlaybackState() != 1) {
            presentationState.m14setVideoSizeDpiaC8Vc4(presentationState.m13getVideoSizeDphgXytuQ(presentationState.player));
        }
        if (events.contains(26)) {
            presentationState.setCoverSurface(false);
        }
        if (events.contains(2)) {
            presentationState.maybeHideSurface(presentationState.player);
        }
        return Unit.INSTANCE;
    }

    private final void setCoverSurface(boolean z2) {
        this.coverSurface.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: setVideoSizeDp-iaC8Vc4, reason: not valid java name */
    private final void m14setVideoSizeDpiaC8Vc4(Size size) {
        this.videoSizeDp.setValue(size);
    }

    private final boolean shouldKeepSurfaceVisible(Player player) {
        Timeline currentTimeline = player.isCommandAvailable(17) ? player.getCurrentTimeline() : Timeline.EMPTY;
        Intrinsics.checkNotNull(currentTimeline);
        if (currentTimeline.isEmpty()) {
            this.lastPeriodUidWithTracks = null;
            return false;
        }
        Timeline.Period period = new Timeline.Period();
        if (!player.isCommandAvailable(30) || player.getCurrentTracks().isEmpty()) {
            Object obj = this.lastPeriodUidWithTracks;
            if (obj != null) {
                int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                if (indexOfPeriod != -1) {
                    if (player.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, period).windowIndex) {
                        return true;
                    }
                }
                this.lastPeriodUidWithTracks = null;
            }
        } else {
            this.lastPeriodUidWithTracks = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), period, true).uid;
        }
        return false;
    }

    public final boolean getCoverSurface() {
        return ((Boolean) this.coverSurface.getValue()).booleanValue();
    }

    public final boolean getKeepContentOnReset() {
        return this.keepContentOnReset;
    }

    /* JADX INFO: renamed from: getVideoSizeDp-VsRJwc0, reason: not valid java name */
    public final Size m15getVideoSizeDpVsRJwc0() {
        return (Size) this.videoSizeDp.getValue();
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
            Function2 function2 = new Function2() { // from class: androidx.media3.ui.compose.state.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PresentationState.observe$lambda$0(this.f39946n, (Player) obj2, (Player.Events) obj3);
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

    public final void setKeepContentOnReset(boolean z2) {
        this.keepContentOnReset = z2;
        maybeHideSurface(this.player);
    }

    @Nullable
    /* JADX INFO: renamed from: getVideoSizeDp-hgXytuQ, reason: not valid java name */
    private final Size m13getVideoSizeDphgXytuQ(Player player) {
        long jN = SizeKt.n(player.getVideoSize().width, player.getVideoSize().height);
        if (Size.gh(jN) == 0.0f || Size.xMQ(jN) == 0.0f) {
            return null;
        }
        float f3 = player.getVideoSize().pixelWidthHeightRatio;
        double d2 = f3;
        if (d2 < 1.0d) {
            jN = Size.J2(jN, Size.gh(jN) * f3, 0.0f, 2, null);
        } else if (d2 > 1.0d) {
            jN = Size.J2(jN, 0.0f, Size.xMQ(jN) / f3, 1, null);
        }
        return Size.t(jN);
    }
}
