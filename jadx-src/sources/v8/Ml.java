package v8;

import GJW.C;
import GJW.Lu;
import GJW.nSC;
import GJW.vd;
import android.util.Log;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import v8.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements v8.j {
    private static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f74655n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f74656t;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f74657O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ j.EnumC1241j f74658S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f74659Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74660n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f74661o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74663t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, String str, j.EnumC1241j enumC1241j, Continuation continuation) {
            super(2, continuation);
            this.f74661o = function1;
            this.f74659Z = str;
            this.f74658S = enumC1241j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new n(this.f74661o, this.f74659Z, this.f74658S, continuation);
        }

        /* JADX WARN: Type inference failed for: r10v13, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            Ref.ObjectRef objectRef;
            long j2;
            Ref.ObjectRef objectRef2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = this.f74657O;
                        objectRef = (Ref.ObjectRef) this.f74663t;
                        objectRef2 = (Ref.ObjectRef) this.f74660n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function1 function1 = this.f74661o;
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    long jM1761markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
                    this.f74660n = objectRef3;
                    this.f74663t = objectRef3;
                    this.f74657O = jM1761markNowz9LOYto;
                    this.J2 = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    j2 = jM1761markNowz9LOYto;
                    objectRef2 = objectRef;
                }
                objectRef.element = (String) obj;
                pair = new Pair(objectRef2.element, Duration.m1650boximpl(TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(j2)));
            } catch (Exception e2) {
                Log.e(Ml.this.rl, "Exception while evaluating the message to log!", e2);
                pair = null;
            }
            if (pair != null) {
                String str = this.f74659Z;
                j.EnumC1241j enumC1241j = this.f74658S;
                String str2 = (String) pair.component1();
                long rawValue = ((Duration) pair.component2()).getRawValue();
                if (Duration.m1663getInWholeMillisecondsimpl(rawValue) > 500) {
                    Log.v(str, "Message below evaluated in " + Duration.m1663getInWholeMillisecondsimpl(rawValue) + qUrazMnwDskFs.VvtzjSDrXYdM);
                }
                I28.rl(str, enumC1241j, str2);
            }
            return Unit.INSTANCE;
        }
    }

    public Ml(boolean z2, String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f74655n = z2;
        this.rl = tag;
        this.f74656t = LazyKt.lazy(new Function0() { // from class: v8.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.O();
            }
        });
    }

    private final vd J2() {
        return (vd) this.f74656t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vd O() {
        return Lu.n(nSC.rl("LogcatLogger"));
    }

    @Override // v8.j
    public void n(j.EnumC1241j level, Function1 lazyMessage) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (this.f74655n) {
            C.nr(J2(), null, null, new n(lazyMessage, this.rl + "(async)", level, null), 3, null);
        }
    }

    @Override // v8.j
    public void rl(j.EnumC1241j level, Function0 lazyMessage) {
        Pair pair;
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (this.f74655n) {
            try {
                pair = new Pair((String) lazyMessage.invoke(), Duration.m1650boximpl(TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto())));
            } catch (Exception e2) {
                Log.e(this.rl, "Exception while evaluating the message to log!", e2);
                pair = null;
            }
            if (pair != null) {
                String str = (String) pair.component1();
                long rawValue = ((Duration) pair.component2()).getRawValue();
                if (Duration.m1663getInWholeMillisecondsimpl(rawValue) > 5) {
                    Log.w(this.rl, "Message below evaluated in " + Duration.m1663getInWholeMillisecondsimpl(rawValue) + " ms. Consider using logAsync to avoid blocking the caller.");
                }
                I28.rl(this.rl, level, str);
            }
        }
    }
}
