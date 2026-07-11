package androidx.content.core;

import GJW.O;
import ILs.Pl;
import ILs.s4;
import androidx.content.core.MulticastFileObserver;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LILs/s4;", "", "<anonymous>", "(LILs/s4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"})
final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements Function2<s4, Continuation<? super Unit>, Object> {
    final /* synthetic */ File J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f37573O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37574n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37575t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastFileObserver$Companion$observe$1(File file, Continuation continuation) {
        super(2, continuation);
        this.J2 = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.J2, continuation);
        multicastFileObserver$Companion$observe$1.f37573O = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (ILs.l3D.rl(r3, r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final O oNr;
        s4 s4Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37575t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oNr = (O) this.f37574n;
            s4Var = (s4) this.f37573O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            final s4 s4Var2 = (s4) this.f37573O;
            final File file = this.J2;
            Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    n(str);
                    return Unit.INSTANCE;
                }

                public final void n(String str) {
                    if (Intrinsics.areEqual(str, file.getName())) {
                        Pl.rl(s4Var2, Unit.INSTANCE);
                    }
                }
            };
            MulticastFileObserver.Companion companion = MulticastFileObserver.INSTANCE;
            File parentFile = this.J2.getParentFile();
            Intrinsics.checkNotNull(parentFile);
            oNr = companion.nr(parentFile, function1);
            Unit unit = Unit.INSTANCE;
            this.f37573O = s4Var2;
            this.f37574n = oNr;
            this.f37575t = 1;
            if (s4Var2.mUb(unit, this) != coroutine_suspended) {
                s4Var = s4Var2;
            }
            return coroutine_suspended;
        }
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                oNr.n();
            }
        };
        this.f37573O = null;
        this.f37574n = null;
        this.f37575t = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s4 s4Var, Continuation continuation) {
        return ((MulticastFileObserver$Companion$observe$1) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
