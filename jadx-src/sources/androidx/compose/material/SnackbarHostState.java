package androidx.compose.material;

import GJW.Pl;
import GJW.eO;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "Landroidx/compose/material/SnackbarDuration;", "duration", "Landroidx/compose/material/SnackbarResult;", "nr", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LyB/j;", c.f62177j, "LyB/j;", "mutex", "Landroidx/compose/material/SnackbarData;", "<set-?>", "rl", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/material/SnackbarData;", "t", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData", "SnackbarDataImpl", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,362:1\n85#2:363\n113#2,2:364\n120#3,8:366\n129#3:385\n314#4,11:374\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n73#1:363\n73#1:364,2\n103#1:366,8\n103#1:385\n105#1:374,11\n*E\n"})
public final class SnackbarHostState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j mutex = CN3.rl(false, 1, null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState currentSnackbarData = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    @Stable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "", "message", "actionLabel", "Landroidx/compose/material/SnackbarDuration;", "duration", "LGJW/Pl;", "Landroidx/compose/material/SnackbarResult;", "continuation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;LGJW/Pl;)V", "", "rl", "()V", "dismiss", c.f62177j, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "t", "Landroidx/compose/material/SnackbarDuration;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "nr", "LGJW/Pl;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SnackbarDataImpl implements SnackbarData {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final Pl continuation;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final String actionLabel;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final SnackbarDuration duration;

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                Pl pl = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(SnackbarResult.f23100n));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        /* JADX INFO: renamed from: n, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public void rl() {
            if (this.continuation.isActive()) {
                Pl pl = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(SnackbarResult.f23101t));
            }
        }

        public SnackbarDataImpl(String str, String str2, SnackbarDuration snackbarDuration, Pl pl) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = snackbarDuration;
            this.continuation = pl;
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
    public final Object nr(String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation) {
        SnackbarHostState$showSnackbar$1 snackbarHostState$showSnackbar$1;
        j jVar;
        SnackbarDuration snackbarDuration2;
        String str3;
        SnackbarHostState snackbarHostState;
        String str4;
        j jVar2;
        if (continuation instanceof SnackbarHostState$showSnackbar$1) {
            snackbarHostState$showSnackbar$1 = (SnackbarHostState$showSnackbar$1) continuation;
            int i2 = snackbarHostState$showSnackbar$1.f23044g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snackbarHostState$showSnackbar$1.f23044g = i2 - Integer.MIN_VALUE;
            } else {
                snackbarHostState$showSnackbar$1 = new SnackbarHostState$showSnackbar$1(this, continuation);
            }
        }
        Object obj = snackbarHostState$showSnackbar$1.f23043Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = snackbarHostState$showSnackbar$1.f23044g;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = this.mutex;
                    snackbarHostState$showSnackbar$1.f23045n = this;
                    snackbarHostState$showSnackbar$1.f23048t = str;
                    snackbarHostState$showSnackbar$1.f23041O = str2;
                    snackbarHostState$showSnackbar$1.J2 = snackbarDuration;
                    snackbarHostState$showSnackbar$1.f23047r = jVar;
                    snackbarHostState$showSnackbar$1.f23044g = 1;
                    if (jVar.Z(null, snackbarHostState$showSnackbar$1) != coroutine_suspended) {
                        snackbarDuration2 = snackbarDuration;
                        str3 = str2;
                        snackbarHostState = this;
                        str4 = str;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (j) snackbarHostState$showSnackbar$1.f23047r;
                    snackbarHostState = (SnackbarHostState) snackbarHostState$showSnackbar$1.f23045n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        snackbarHostState.t(null);
                        jVar2.T(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        snackbarHostState.t(null);
                        throw th;
                    }
                }
                j jVar3 = (j) snackbarHostState$showSnackbar$1.f23047r;
                SnackbarDuration snackbarDuration3 = (SnackbarDuration) snackbarHostState$showSnackbar$1.J2;
                String str5 = (String) snackbarHostState$showSnackbar$1.f23041O;
                String str6 = (String) snackbarHostState$showSnackbar$1.f23048t;
                SnackbarHostState snackbarHostState2 = (SnackbarHostState) snackbarHostState$showSnackbar$1.f23045n;
                ResultKt.throwOnFailure(obj);
                jVar = jVar3;
                str4 = str6;
                snackbarDuration2 = snackbarDuration3;
                str3 = str5;
                snackbarHostState = snackbarHostState2;
                snackbarHostState$showSnackbar$1.f23045n = snackbarHostState;
                snackbarHostState$showSnackbar$1.f23048t = str4;
                snackbarHostState$showSnackbar$1.f23041O = str3;
                snackbarHostState$showSnackbar$1.J2 = snackbarDuration2;
                snackbarHostState$showSnackbar$1.f23047r = jVar;
                snackbarHostState$showSnackbar$1.f23046o = snackbarHostState$showSnackbar$1;
                snackbarHostState$showSnackbar$1.f23044g = 2;
                eO eOVar = new eO(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                eOVar.e();
                snackbarHostState.t(new SnackbarDataImpl(str4, str3, snackbarDuration2, eOVar));
                Object objWPU = eOVar.WPU();
                if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$1);
                }
                if (objWPU != coroutine_suspended) {
                    j jVar4 = jVar;
                    obj = objWPU;
                    jVar2 = jVar4;
                    snackbarHostState.t(null);
                    jVar2.T(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                snackbarHostState.t(null);
                throw th;
            }
        } catch (Throwable th3) {
            str.T(null);
            throw th3;
        }
    }

    public final SnackbarData rl() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }
}
