package androidx.compose.runtime;

import GJW.AbstractC1363t;
import GJW.g9s;
import GJW.vd;
import GJW.xuv;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope;", "LGJW/vd;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "overlayContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "", c.f62177j, "()V", "t", "O", "nr", "Lkotlin/coroutines/CoroutineContext;", "", "Ljava/lang/Object;", "lock", "J2", "_coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "r", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,561:1\n27#2:562\n33#2,2:563\n33#2,2:565\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n*L\n431#1:562\n451#1:563,2\n478#1:565,2\n*E\n"})
public final class RememberedCoroutineScope implements vd, RememberObserver {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private volatile CoroutineContext _coroutineContext;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Object lock = this;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext parentContext;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext overlayContext;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f30367o = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final CoroutineContext f30366Z = new CancelledCoroutineContext();

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
    }

    @Override // GJW.vd
    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this._coroutineContext;
        if (coroutineContext == null || coroutineContext == f30366Z) {
            synchronized (this.lock) {
                try {
                    coroutineContextPlus = this._coroutineContext;
                    if (coroutineContextPlus == null) {
                        CoroutineContext coroutineContext2 = this.parentContext;
                        coroutineContextPlus = coroutineContext2.plus(AbstractC1363t.n((xuv) coroutineContext2.get(xuv.nr))).plus(this.overlayContext);
                    } else if (coroutineContextPlus == f30366Z) {
                        CoroutineContext coroutineContext3 = this.parentContext;
                        g9s g9sVarN = AbstractC1363t.n((xuv) coroutineContext3.get(xuv.nr));
                        g9sVarN.cancel((CancellationException) new ForgottenCoroutineScopeException());
                        coroutineContextPlus = coroutineContext3.plus(g9sVarN).plus(this.overlayContext);
                    }
                    this._coroutineContext = coroutineContextPlus;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public final void n() {
        synchronized (this.lock) {
            try {
                CoroutineContext coroutineContext = this._coroutineContext;
                if (coroutineContext == null) {
                    this._coroutineContext = f30366Z;
                } else {
                    AbstractC1363t.nr(coroutineContext, new ForgottenCoroutineScopeException());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RememberedCoroutineScope(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.parentContext = coroutineContext;
        this.overlayContext = coroutineContext2;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        n();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        n();
    }
}
