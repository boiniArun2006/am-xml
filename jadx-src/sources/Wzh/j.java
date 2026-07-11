package Wzh;

import GJW.Dsr;
import GJW.P;
import GJW.h;
import GJW.vd;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements Map, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f11705n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final vd f11706t;

    /* JADX INFO: renamed from: Wzh.j$j, reason: collision with other inner class name */
    public enum EnumC0421j {
        ACCESS,
        INSERTION
    }

    public static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f11710O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11711n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f11712r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f11713t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2, Object obj) {
            super(2, continuation);
            this.f11710O = objectRef;
            this.J2 = function2;
            this.f11712r = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f11710O, continuation, this.J2, this.f11712r);
            nVar.f11713t = obj;
            return nVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.Result] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM313constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11711n;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Function2 function2 = this.J2;
                    Object obj2 = this.f11712r;
                    this.f11711n = 1;
                    InlineMarker.mark(6);
                    obj = function2.invoke(obj2, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM313constructorimpl = Result.m313constructorimpl(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            this.f11710O.element = Result.m312boximpl(objM313constructorimpl);
            ResultKt.throwOnFailure(objM313constructorimpl);
            return objM313constructorimpl;
        }
    }

    public static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f11714O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11715n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Ml f11716r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f11717t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2, Ml ml) {
            super(2, continuation);
            this.f11714O = objectRef;
            this.J2 = function2;
            this.f11716r = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(this.f11714O, continuation, this.J2, this.f11716r);
            w6Var.f11717t = obj;
            return w6Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.Result] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM313constructorimpl;
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11715n;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        objM313constructorimpl = Result.m313constructorimpl(obj);
                        this.f11714O.element = Result.m312boximpl(objM313constructorimpl);
                        ResultKt.throwOnFailure(objM313constructorimpl);
                        return objM313constructorimpl;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = (Function2) this.f11717t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion2 = Result.INSTANCE;
                function2 = this.J2;
                Ml ml = this.f11716r;
                this.f11717t = function2;
                this.f11715n = 1;
                obj = ml.await(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.f11717t = null;
            this.f11715n = 2;
            InlineMarker.mark(6);
            obj = function2.invoke(obj, this);
            InlineMarker.mark(7);
        }
    }

    private j(vd vdVar, Map map) {
        this.f11705n = map;
        this.f11706t = Wzh.w6.rl(vdVar);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public P get(Object obj) {
        return (P) this.f11705n.get(obj);
    }

    public Set KN() {
        return this.f11705n.keySet();
    }

    public boolean O(P value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f11705n.containsValue(value);
    }

    public Set Uo() {
        return this.f11705n.entrySet();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public final P remove(Object obj) {
        return (P) this.f11705n.remove(obj);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f11705n.containsKey(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof P) {
            return O((P) obj);
        }
        return false;
    }

    public int gh() {
        return this.f11705n.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f11705n.isEmpty();
    }

    public final P mUb(Object obj, Function2 generator) {
        Intrinsics.checkNotNullParameter(generator, "generator");
        Ml ml = (Ml) this.f11705n.get(obj);
        if (ml != null) {
            return ml;
        }
        vd vdVar = this.f11706t;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        h hVar = h.f3486n;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Wzh.n nVar = new Wzh.n(Dsr.n(vdVar, emptyCoroutineContext, hVar, new n(objectRef, null, generator, obj)), objectRef);
        this.f11705n.put(obj, nVar);
        return nVar;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection qie() {
        return this.f11705n.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List t() {
        List list = CollectionsKt.toList(this.f11705n.values());
        this.f11705n.clear();
        return list;
    }

    public final P ty(Object obj, Function2 replace) {
        Intrinsics.checkNotNullParameter(replace, "replace");
        Ml ml = (Ml) this.f11705n.get(obj);
        if (ml == null) {
            return null;
        }
        vd vdVar = this.f11706t;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        h hVar = h.f3486n;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Wzh.n nVar = new Wzh.n(Dsr.n(vdVar, emptyCoroutineContext, hVar, new w6(objectRef, null, replace, ml)), objectRef);
        this.f11705n.put(obj, nVar);
        return nVar;
    }

    public final Object xMQ(Object obj) {
        Result resultM;
        Ml ml = (Ml) this.f11705n.get(obj);
        if (ml == null || (resultM = ml.M()) == null) {
            return null;
        }
        Object value = resultM.getValue();
        ResultKt.throwOnFailure(value);
        return value;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return Uo();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return KN();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return gh();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return qie();
    }

    public /* synthetic */ j(vd vdVar, EnumC0421j enumC0421j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vdVar, (i2 & 2) != 0 ? EnumC0421j.INSERTION : enumC0421j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(vd scope, EnumC0421j orderingMode) {
        this(scope, new LinkedHashMap(0, 0.75f, orderingMode == EnumC0421j.ACCESS));
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orderingMode, "orderingMode");
    }
}
