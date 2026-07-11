package androidx.compose.material3;

import GJW.Pl;
import GJW.eO;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR/\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "<init>", "()V", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "Landroidx/compose/material3/SnackbarResult;", "nr", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LyB/j;", c.f62177j, "LyB/j;", "mutex", "Landroidx/compose/material3/SnackbarData;", "<set-?>", "rl", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/material3/SnackbarData;", "t", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "SnackbarDataImpl", "SnackbarVisualsImpl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,440:1\n81#2:441\n107#2,2:442\n120#3,8:444\n129#3:463\n314#4,11:452\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n71#1:441\n71#1:442,2\n126#1:444,8\n126#1:463\n128#1:452,11\n*E\n"})
public final class SnackbarHostState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final yB.j mutex = CN3.rl(false, 1, null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState currentSnackbarData = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "LGJW/Pl;", "Landroidx/compose/material3/SnackbarResult;", "continuation", "<init>", "(Landroidx/compose/material3/SnackbarVisuals;LGJW/Pl;)V", "", "rl", "()V", "dismiss", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "Landroidx/compose/material3/SnackbarVisuals;", "()Landroidx/compose/material3/SnackbarVisuals;", "LGJW/Pl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SnackbarDataImpl implements SnackbarData {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final SnackbarVisuals visuals;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Pl continuation;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || SnackbarDataImpl.class != other.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) other;
            return Intrinsics.areEqual(getVisuals(), snackbarDataImpl.getVisuals()) && Intrinsics.areEqual(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                Pl pl = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(SnackbarResult.Dismissed));
            }
        }

        @Override // androidx.compose.material3.SnackbarData
        /* JADX INFO: renamed from: n, reason: from getter */
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void rl() {
            if (this.continuation.isActive()) {
                Pl pl = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(SnackbarResult.ActionPerformed));
            }
        }

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, Pl pl) {
            this.visuals = snackbarVisuals;
            this.continuation = pl;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", c.f62177j, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "rl", "actionLabel", "t", "Z", "()Z", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "nr", "Landroidx/compose/material3/SnackbarDuration;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "duration", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SnackbarVisualsImpl implements SnackbarVisuals {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final SnackbarDuration duration;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final String actionLabel;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final boolean withDismissAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || SnackbarVisualsImpl.class != other.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) other;
            return Intrinsics.areEqual(getMessage(), snackbarVisualsImpl.getMessage()) && Intrinsics.areEqual(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        /* JADX INFO: renamed from: n, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        /* JADX INFO: renamed from: rl, reason: from getter */
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2 = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            if (actionLabel != null) {
                iHashCode = actionLabel.hashCode();
            } else {
                iHashCode = 0;
            }
            return ((((iHashCode2 + iHashCode) * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nr(SnackbarVisuals snackbarVisuals, Continuation continuation) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        yB.j jVar;
        SnackbarHostState snackbarHostState;
        SnackbarVisuals snackbarVisuals2;
        Throwable th;
        SnackbarHostState snackbarHostState2;
        yB.j jVar2;
        if (continuation instanceof SnackbarHostState$showSnackbar$2) {
            snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) continuation;
            int i2 = snackbarHostState$showSnackbar$2.f27860Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snackbarHostState$showSnackbar$2.f27860Z = i2 - Integer.MIN_VALUE;
            } else {
                snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuation);
            }
        }
        Object obj = snackbarHostState$showSnackbar$2.f27863r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = snackbarHostState$showSnackbar$2.f27860Z;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = this.mutex;
                    snackbarHostState$showSnackbar$2.f27861n = this;
                    snackbarHostState$showSnackbar$2.f27864t = snackbarVisuals;
                    snackbarHostState$showSnackbar$2.f27859O = jVar;
                    snackbarHostState$showSnackbar$2.f27860Z = 1;
                    if (jVar.Z(null, snackbarHostState$showSnackbar$2) != coroutine_suspended) {
                        snackbarHostState = this;
                        snackbarVisuals2 = snackbarVisuals;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (yB.j) snackbarHostState$showSnackbar$2.f27859O;
                    snackbarHostState2 = (SnackbarHostState) snackbarHostState$showSnackbar$2.f27861n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        snackbarHostState2.t(null);
                        jVar2.T(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        snackbarHostState2.t(null);
                        throw th;
                    }
                }
                yB.j jVar3 = (yB.j) snackbarHostState$showSnackbar$2.f27859O;
                SnackbarVisuals snackbarVisuals3 = (SnackbarVisuals) snackbarHostState$showSnackbar$2.f27864t;
                snackbarHostState = (SnackbarHostState) snackbarHostState$showSnackbar$2.f27861n;
                ResultKt.throwOnFailure(obj);
                jVar = jVar3;
                snackbarVisuals2 = snackbarVisuals3;
                snackbarHostState$showSnackbar$2.f27861n = snackbarHostState;
                snackbarHostState$showSnackbar$2.f27864t = snackbarVisuals2;
                snackbarHostState$showSnackbar$2.f27859O = jVar;
                snackbarHostState$showSnackbar$2.J2 = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.f27860Z = 2;
                eO eOVar = new eO(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$2), 1);
                eOVar.e();
                snackbarHostState.t(new SnackbarDataImpl(snackbarVisuals2, eOVar));
                Object objWPU = eOVar.WPU();
                if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$2);
                }
                if (objWPU != coroutine_suspended) {
                    yB.j jVar4 = jVar;
                    obj = objWPU;
                    jVar2 = jVar4;
                    snackbarHostState2 = snackbarHostState;
                    snackbarHostState2.t(null);
                    jVar2.T(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                snackbarHostState2 = snackbarHostState;
                snackbarHostState2.t(null);
                throw th;
            }
        } catch (Throwable th4) {
            snackbarVisuals.T(null);
            throw th4;
        }
    }

    public final SnackbarData rl() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }
}
