package q3M;

import GJW.yg;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {

    static final class j extends ContinuationImpl {
        /* synthetic */ Object E2;
        long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f72103O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f72104S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f72105Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72106e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f72107g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72108n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f72109o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        double f72110r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72111t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.E2 = obj;
            this.f72106e |= Integer.MIN_VALUE;
            return Ml.rl(0, 0L, 0L, 0.0d, null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(int i2, Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0105 -> B:33:0x010e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(int i2, long j2, long j3, double d2, Function2 function2, Function2 function22, Function2 function23, Continuation continuation) {
        j jVar;
        double d4;
        Function2 function24;
        Function2 function25;
        Ref.LongRef longRef;
        j jVar2;
        int i3;
        int i5;
        long j4;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        int i7;
        Ref.LongRef longRef2;
        long j5;
        double d5;
        int i8;
        Function2 function29;
        int i9;
        int i10;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f72106e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f72106e = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.E2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f72106e;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j2;
            d4 = d2;
            function24 = function22;
            function25 = function23;
            longRef = longRef3;
            jVar2 = jVar;
            i3 = 0;
            i5 = i2;
            j4 = j3;
            function26 = function2;
            if (i3 < i5) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            int i14 = jVar.f72111t;
            double d6 = jVar.f72110r;
            long j6 = jVar.J2;
            int i15 = jVar.f72108n;
            Ref.LongRef longRef4 = (Ref.LongRef) jVar.f72107g;
            Function2 function210 = (Function2) jVar.f72104S;
            Function2 function211 = (Function2) jVar.f72105Z;
            Function2 function212 = (Function2) jVar.f72109o;
            ResultKt.throwOnFailure(obj);
            i10 = 1;
            double d7 = d6;
            i5 = i15;
            longRef = longRef4;
            jVar2 = jVar;
            i8 = i14;
            function26 = function212;
            longRef.element = RangesKt.coerceAtMost((long) (longRef.element * d7), j6);
            Function2 function213 = function210;
            i3 = i8 + 1;
            j4 = j6;
            function25 = function213;
            d4 = d7;
            function24 = function211;
            i13 = i10;
            if (i3 < i5) {
                Integer numBoxInt = Boxing.boxInt(i3);
                jVar2.f72109o = function26;
                jVar2.f72105Z = function24;
                jVar2.f72104S = function25;
                jVar2.f72107g = longRef;
                jVar2.f72108n = i5;
                jVar2.J2 = j4;
                jVar2.f72110r = d4;
                jVar2.f72111t = i3;
                jVar2.f72103O = i3;
                jVar2.f72106e = i13;
                Object objInvoke = function26.invoke(numBoxInt, jVar2);
                if (objInvoke != coroutine_suspended) {
                    function27 = function24;
                    d5 = d4;
                    i8 = i3;
                    i7 = i5;
                    obj = objInvoke;
                    function28 = function25;
                    long j7 = j4;
                    function29 = function26;
                    jVar = jVar2;
                    i9 = i8;
                    longRef2 = longRef;
                    j5 = j7;
                    i10 = i13;
                    if (!((Boolean) function27.invoke(Boxing.boxInt(i9), obj)).booleanValue()) {
                        return obj;
                    }
                    function28.invoke(Boxing.boxInt(i9), obj);
                    long j9 = longRef2.element;
                    jVar.f72109o = function29;
                    jVar.f72105Z = function27;
                    jVar.f72104S = function28;
                    jVar.f72107g = longRef2;
                    jVar.f72108n = i7;
                    jVar.J2 = j5;
                    jVar.f72110r = d5;
                    jVar.f72111t = i8;
                    jVar.f72106e = 2;
                    if (yg.rl(j9, jVar) != coroutine_suspended) {
                        d7 = d5;
                        j6 = j5;
                        longRef = longRef2;
                        i5 = i7;
                        function210 = function28;
                        function211 = function27;
                        jVar2 = jVar;
                        function26 = function29;
                        longRef.element = RangesKt.coerceAtMost((long) (longRef.element * d7), j6);
                        Function2 function2132 = function210;
                        i3 = i8 + 1;
                        j4 = j6;
                        function25 = function2132;
                        d4 = d7;
                        function24 = function211;
                        i13 = i10;
                        if (i3 < i5) {
                            Integer numBoxInt2 = Boxing.boxInt(i5);
                            jVar2.f72109o = null;
                            jVar2.f72105Z = null;
                            jVar2.f72104S = null;
                            jVar2.f72107g = null;
                            jVar2.f72106e = 3;
                            Object objInvoke2 = function26.invoke(numBoxInt2, jVar2);
                            if (objInvoke2 != coroutine_suspended) {
                                return objInvoke2;
                            }
                        }
                    }
                }
            }
            return coroutine_suspended;
        }
        i9 = jVar.f72103O;
        i8 = jVar.f72111t;
        d5 = jVar.f72110r;
        j5 = jVar.J2;
        int i16 = jVar.f72108n;
        Ref.LongRef longRef5 = (Ref.LongRef) jVar.f72107g;
        function28 = (Function2) jVar.f72104S;
        function27 = (Function2) jVar.f72105Z;
        function29 = (Function2) jVar.f72109o;
        ResultKt.throwOnFailure(obj);
        i7 = i16;
        longRef2 = longRef5;
        i10 = i13;
        if (!((Boolean) function27.invoke(Boxing.boxInt(i9), obj)).booleanValue()) {
        }
    }

    public static /* synthetic */ Object t(int i2, long j2, long j3, double d2, Function2 function2, Function2 function22, Function2 function23, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 2) != 0) {
            j2 = 1000;
        }
        if ((i3 & 4) != 0) {
            j3 = 30000;
        }
        if ((i3 & 8) != 0) {
            d2 = 2.0d;
        }
        if ((i3 & 64) != 0) {
            function23 = new Function2() { // from class: q3M.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Ml.nr(((Integer) obj2).intValue(), obj3);
                }
            };
        }
        long j4 = j2;
        return rl(i2, j4, j3, d2, function2, function22, function23, continuation);
    }
}
