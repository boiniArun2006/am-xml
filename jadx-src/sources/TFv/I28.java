package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class I28 implements Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Function2 f10274O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f10275n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Function1 f10276t;

    static final class j implements CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ CN3 f10277O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f10279t;

        /* JADX INFO: renamed from: TFv.I28$j$j, reason: collision with other inner class name */
        static final class C0361j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f10280O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f10281n;

            C0361j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f10281n = obj;
                this.f10280O |= Integer.MIN_VALUE;
                return j.this.rl(null, this);
            }
        }

        j(Ref.ObjectRef objectRef, CN3 cn3) {
            this.f10279t = objectRef;
            this.f10277O = cn3;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
            C0361j c0361j;
            if (continuation instanceof C0361j) {
                c0361j = (C0361j) continuation;
                int i2 = c0361j.f10280O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0361j.f10280O = i2 - Integer.MIN_VALUE;
                } else {
                    c0361j = new C0361j(continuation);
                }
            }
            Object obj2 = c0361j.f10281n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c0361j.f10280O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                ?? Invoke = I28.this.f10276t.invoke(obj);
                T t3 = this.f10279t.element;
                if (t3 != teV.z.f73659n && ((Boolean) I28.this.f10274O.invoke(t3, Invoke)).booleanValue()) {
                    return Unit.INSTANCE;
                }
                this.f10279t.element = Invoke;
                CN3 cn3 = this.f10277O;
                c0361j.f10280O = 1;
                if (cn3.rl(obj, c0361j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, dzu.nKK] */
    @Override // TFv.Wre
    public Object n(CN3 cn3, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = teV.z.f73659n;
        Object objN = this.f10275n.n(new j(objectRef, cn3), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public I28(Wre wre, Function1 function1, Function2 function2) {
        this.f10275n = wre;
        this.f10276t = function1;
        this.f10274O = function2;
    }
}
