package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {387, 388, 390}, m = "invokeSuspend", n = {}, s = {})
final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ DataStoreImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f37476O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37477n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f37478r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37479t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$3(Ref.ObjectRef objectRef, DataStoreImpl dataStoreImpl, Ref.IntRef intRef, Continuation continuation) {
        super(1, continuation);
        this.f37476O = objectRef;
        this.J2 = dataStoreImpl;
        this.f37478r = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.f37476O, this.J2, this.f37478r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.IntRef intRef;
        Object obj2;
        Ref.ObjectRef objectRef;
        T t3;
        Ref.IntRef intRef2;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37479t;
        try {
        } catch (CorruptionException unused) {
            Ref.IntRef intRef3 = this.f37478r;
            DataStoreImpl dataStoreImpl = this.J2;
            Object obj4 = this.f37476O.element;
            this.f37477n = intRef3;
            this.f37479t = 3;
            Object objTe = dataStoreImpl.te(obj4, true, this);
            if (objTe != coroutine_suspended) {
                intRef = intRef3;
                obj2 = objTe;
            }
            return coroutine_suspended;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        intRef = (Ref.IntRef) this.f37477n;
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj;
                        intRef.element = ((Number) obj2).intValue();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef2 = (Ref.IntRef) this.f37477n;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                intRef2.element = ((Number) obj3).intValue();
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.f37477n;
            ResultKt.throwOnFailure(obj);
            t3 = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            objectRef = this.f37476O;
            DataStoreImpl dataStoreImpl2 = this.J2;
            this.f37477n = objectRef;
            this.f37479t = 1;
            Object objAYN = dataStoreImpl2.aYN(this);
            t3 = objAYN;
            if (objAYN == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        objectRef.element = t3;
        intRef2 = this.f37478r;
        InterProcessCoordinator interProcessCoordinatorR = this.J2.r();
        this.f37477n = intRef2;
        this.f37479t = 2;
        Object objN = interProcessCoordinatorR.n(this);
        obj3 = objN;
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        intRef2.element = ((Number) obj3).intValue();
        return Unit.INSTANCE;
    }
}
