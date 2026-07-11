package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {748, 751, 754}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    final /* synthetic */ ScrollingLogic J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ long f17081O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f17082n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f17083t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.J2 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.J2, continuation);
        scrollingLogic$onScrollStopped$performFling$1.f17081O = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return n(velocity.getPackedValue(), continuation);
    }

    public final Object n(long j2, Continuation continuation) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.rl(j2), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objT;
        long j2;
        Object objCk;
        long j3;
        long j4;
        long j5;
        Object objN;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17083t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        long j6 = this.f17082n;
                        long j7 = this.f17081O;
                        ResultKt.throwOnFailure(obj);
                        j3 = j7;
                        j5 = j6;
                        objN = obj;
                        return Velocity.rl(Velocity.gh(j3, Velocity.gh(j5, ((Velocity) objN).getPackedValue())));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j4 = this.f17082n;
                j3 = this.f17081O;
                ResultKt.throwOnFailure(obj);
                objCk = obj;
                long packedValue = ((Velocity) objCk).getPackedValue();
                NestedScrollDispatcher nestedScrollDispatcher = this.J2.nestedScrollDispatcher;
                long jGh = Velocity.gh(j4, packedValue);
                this.f17081O = j3;
                this.f17082n = packedValue;
                this.f17083t = 3;
                j5 = packedValue;
                objN = nestedScrollDispatcher.n(jGh, j5, this);
            } else {
                j2 = this.f17081O;
                ResultKt.throwOnFailure(obj);
                objT = obj;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            long j9 = this.f17081O;
            NestedScrollDispatcher nestedScrollDispatcher2 = this.J2.nestedScrollDispatcher;
            this.f17081O = j9;
            this.f17083t = 1;
            objT = nestedScrollDispatcher2.t(j9, this);
            if (objT != coroutine_suspended) {
                j2 = j9;
            }
            return coroutine_suspended;
        }
        long jGh2 = Velocity.gh(j2, ((Velocity) objT).getPackedValue());
        ScrollingLogic scrollingLogic = this.J2;
        this.f17081O = j2;
        this.f17082n = jGh2;
        this.f17083t = 2;
        objCk = scrollingLogic.ck(jGh2, this);
        if (objCk != coroutine_suspended) {
            j3 = j2;
            j4 = jGh2;
            long packedValue2 = ((Velocity) objCk).getPackedValue();
            NestedScrollDispatcher nestedScrollDispatcher3 = this.J2.nestedScrollDispatcher;
            long jGh3 = Velocity.gh(j4, packedValue2);
            this.f17081O = j3;
            this.f17082n = packedValue2;
            this.f17083t = 3;
            j5 = packedValue2;
            objN = nestedScrollDispatcher3.n(jGh3, j5, this);
        }
        return coroutine_suspended;
    }
}
