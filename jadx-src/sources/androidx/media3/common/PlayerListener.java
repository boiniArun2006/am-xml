package androidx.media3.common;

import androidx.media3.common.Player;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B4\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u000fR+\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/media3/common/PlayerListener;", "Landroidx/media3/common/Player$Listener;", "Lkotlin/Function2;", "Landroidx/media3/common/Player;", "Landroidx/media3/common/Player$Events;", "", "Lkotlin/ExtensionFunctionType;", "onEvents", "LGJW/Pl;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function2;LGJW/Pl;)V", "player", CrashEvent.f62787f, "(Landroidx/media3/common/Player;Landroidx/media3/common/Player$Events;)V", "Lkotlin/jvm/functions/Function2;", "LGJW/Pl;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "lib-common-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PlayerListener implements Player.Listener {
    private final GJW.Pl continuation;
    private final AtomicBoolean isCancelled;
    private final Function2<Player, Player.Events, Unit> onEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerListener(Function2<? super Player, ? super Player.Events, Unit> onEvents, GJW.Pl continuation) {
        Intrinsics.checkNotNullParameter(onEvents, "onEvents");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.onEvents = onEvents;
        this.continuation = continuation;
        this.isCancelled = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: isCancelled, reason: from getter */
    public final AtomicBoolean getIsCancelled() {
        return this.isCancelled;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        try {
            if (this.isCancelled.get()) {
                return;
            }
            this.onEvents.invoke(player, events);
        } catch (Throwable th) {
            this.isCancelled.set(true);
            GJW.Pl pl = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
        }
    }
}
