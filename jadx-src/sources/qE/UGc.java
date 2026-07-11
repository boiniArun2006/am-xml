package qE;

import GJW.Qik;
import GJW.vd;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.OracleResponse;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
import rB.Ml;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class UGc {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f72249O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72250n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72251t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72249O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return UGc.nr(0L, 0, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72252O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f72253S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ int f72254Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f72255g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72256n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f72257o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72258r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72259t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i2, Ref.ObjectRef objectRef, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f72254Z = i2;
            this.f72253S = objectRef;
            this.f72255g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f72254Z, this.f72253S, this.f72255g, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:14:0x004c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            int i2;
            Function1 function1;
            int i3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f72257o;
            if (i5 != 0) {
                if (i5 == 1) {
                    i2 = this.f72259t;
                    i3 = this.f72256n;
                    objectRef = (Ref.ObjectRef) this.f72258r;
                    function1 = (Function1) this.J2;
                    Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.f72252O;
                    ResultKt.throwOnFailure(obj);
                    T t3 = obj;
                    objectRef.element = t3;
                    if (!(objectRef2.element instanceof n.w6)) {
                        return Unit.INSTANCE;
                    }
                    i2++;
                    objectRef = objectRef2;
                    if (i2 >= i3) {
                        this.f72252O = objectRef;
                        this.J2 = function1;
                        this.f72258r = objectRef;
                        this.f72256n = i3;
                        this.f72259t = i2;
                        this.f72257o = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                        t3 = objInvoke;
                        objectRef.element = t3;
                        if (!(objectRef2.element instanceof n.w6)) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                int i7 = this.f72254Z;
                objectRef = this.f72253S;
                i2 = 0;
                function1 = this.f72255g;
                i3 = i7;
                if (i2 >= i3) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, x0X.n$n] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, x0X.n$n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(long j2, int i2, Function1 function1, Function1 function12, Continuation continuation) {
        j jVar;
        Ref.ObjectRef objectRef;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f72249O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = jVar.J2;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new n.C1266n(new NetworkError.I28(new Throwable("Uninitialized error.")));
            try {
                n nVar = new n(i2, objectRef2, function12, null);
                jVar.f72250n = function1;
                jVar.f72251t = objectRef2;
                jVar.J2 = 1;
                if (Qik.nr(j2, nVar, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (TimeoutCancellationException e2) {
                e = e2;
                objectRef = objectRef2;
                function1.invoke(e);
                objectRef.element = new n.C1266n(new NetworkError.Ml(new SocketTimeoutException()));
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) jVar.f72251t;
            function1 = (Function1) jVar.f72250n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (TimeoutCancellationException e3) {
                e = e3;
                function1.invoke(e);
                objectRef.element = new n.C1266n(new NetworkError.Ml(new SocketTimeoutException()));
            }
        }
        return objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t(OracleResponse oracleResponse) {
        Map<String, Integer> experiments = oracleResponse.getSettings().getExperiments();
        ArrayList arrayList = new ArrayList(experiments.size());
        for (Map.Entry<String, Integer> entry : experiments.entrySet()) {
            arrayList.add(new Ml.w6(entry.getKey(), entry.getValue().intValue()));
        }
        return arrayList;
    }
}
