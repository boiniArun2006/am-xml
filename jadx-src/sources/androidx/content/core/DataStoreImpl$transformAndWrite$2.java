package androidx.content.core;

import GJW.Dsr;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {330, 331, 337}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"})
final class DataStoreImpl$transformAndWrite$2<T> extends SuspendLambda implements Function1<Continuation<? super T>, Object> {
    final /* synthetic */ CoroutineContext J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37484O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37485n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f37486r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37487t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$transformAndWrite$2(DataStoreImpl dataStoreImpl, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f37484O = dataStoreImpl;
        this.J2 = coroutineContext;
        this.f37486r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$transformAndWrite$2(this.f37484O, this.J2, this.f37486r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$transformAndWrite$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        Data data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37487t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Object obj2 = this.f37485n;
                        ResultKt.throwOnFailure(obj);
                        return obj2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                data = (Data) this.f37485n;
                ResultKt.throwOnFailure(obj);
                data.rl();
                if (!Intrinsics.areEqual(data.getValue(), obj)) {
                    DataStoreImpl dataStoreImpl = this.f37484O;
                    this.f37485n = obj;
                    this.f37487t = 3;
                    if (dataStoreImpl.te(obj, true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return obj;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            DataStoreImpl dataStoreImpl2 = this.f37484O;
            this.f37487t = 1;
            obj = dataStoreImpl2.ViF(true, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        data = (Data) obj;
        CoroutineContext coroutineContext = this.J2;
        DataStoreImpl$transformAndWrite$2$newData$1 dataStoreImpl$transformAndWrite$2$newData$1 = new DataStoreImpl$transformAndWrite$2$newData$1(this.f37486r, data, null);
        this.f37485n = data;
        this.f37487t = 2;
        obj = Dsr.Uo(coroutineContext, dataStoreImpl$transformAndWrite$2$newData$1, this);
        if (obj != coroutine_suspended) {
            data.rl();
            if (!Intrinsics.areEqual(data.getValue(), obj)) {
            }
            return obj;
        }
        return coroutine_suspended;
    }
}
