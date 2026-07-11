package androidx.compose.animation.core;

import GJW.Lu;
import GJW.xuv;
import androidx.compose.runtime.Stable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Stable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/animation/core/MutatorMutex$Mutator;", "mutator", "", "J2", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)V", "R", "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "nr", "(Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", c.f62177j, "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LyB/j;", "rl", "LyB/j;", "mutex", "Mutator", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutatorMutex {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference currentMutator = new AtomicReference(null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final yB.j mutex = yB.CN3.rl(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex$Mutator;", "", "Landroidx/compose/animation/core/MutatePriority;", "priority", "LGJW/xuv;", "job", "<init>", "(Landroidx/compose/animation/core/MutatePriority;LGJW/xuv;)V", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)Z", "", "rl", "()V", "Landroidx/compose/animation/core/MutatePriority;", "getPriority", "()Landroidx/compose/animation/core/MutatePriority;", "LGJW/xuv;", "getJob", "()LGJW/xuv;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Mutator {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final MutatePriority priority;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final xuv job;

        public final boolean n(Mutator other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void rl() {
            this.job.cancel((CancellationException) new MutationInterruptedException());
        }

        public Mutator(MutatePriority mutatePriority, xuv xuvVar) {
            this.priority = mutatePriority;
            this.job = xuvVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = (Mutator) this.currentMutator.get();
            if (mutator2 != null && !mutator.n(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!fuX.n(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.rl();
        }
    }

    public static /* synthetic */ Object O(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.f15544n;
        }
        return mutatorMutex.nr(mutatePriority, function1, continuation);
    }

    public final Object nr(MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        return Lu.J2(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }
}
