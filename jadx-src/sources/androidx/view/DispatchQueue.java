package androidx.view;

import GJW.DC;
import GJW.OU;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "", "J2", "(Ljava/lang/Runnable;)V", "KN", "xMQ", "Uo", "O", "", "rl", "()Z", "Lkotlin/coroutines/CoroutineContext;", "context", "t", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", c.f62177j, "Z", SafeDKWebAppInterface.f62918d, "finished", "isDraining", "Ljava/util/Queue;", "nr", "Ljava/util/Queue;", "queue", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDispatchQueue.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchQueue.jvm.kt\nandroidx/lifecycle/DispatchQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class DispatchQueue {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean paused = true;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Queue queue = new ArrayDeque();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean finished;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isDraining;

    public final void KN() {
        this.paused = true;
    }

    public final void Uo() {
        this.finished = true;
        O();
    }

    private final void J2(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        O();
    }

    public final void O() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && rl()) {
                Runnable runnable = (Runnable) this.queue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final boolean rl() {
        return this.finished || !this.paused;
    }

    public final void t(CoroutineContext context, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        DC dcP0N = OU.t().p0N();
        if (dcP0N.Org(context) || rl()) {
            dcP0N.n1(context, new Runnable() { // from class: androidx.lifecycle.n
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.nr(this.f39062n, runnable);
                }
            });
        } else {
            J2(runnable);
        }
    }

    public final void xMQ() {
        if (this.paused) {
            if (this.finished) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(DispatchQueue dispatchQueue, Runnable runnable) {
        dispatchQueue.J2(runnable);
    }
}
