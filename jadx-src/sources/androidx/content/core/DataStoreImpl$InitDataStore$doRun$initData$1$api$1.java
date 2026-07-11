package androidx.content.core;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.j;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JC\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "t", "Lkotlin/coroutines/Continuation;", "", "transform", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n441#1:539,10\n*E\n"})
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ j f37403n;
    final /* synthetic */ DataStoreImpl nr;
    final /* synthetic */ Ref.BooleanRef rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f37404t;

    DataStoreImpl$InitDataStore$doRun$initData$1$api$1(j jVar, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, DataStoreImpl dataStoreImpl) {
        this.f37403n = jVar;
        this.rl = booleanRef;
        this.f37404t = objectRef;
        this.nr = dataStoreImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.content.core.InitializerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Function2 function2, Continuation continuation) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        j jVar;
        DataStoreImpl dataStoreImpl;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        j jVar2;
        j jVar3;
        DataStoreImpl dataStoreImpl2;
        T t3;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
            int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37406S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37406S = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
            }
        }
        Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37409o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37406S;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.f37403n;
                Ref.BooleanRef booleanRef2 = this.rl;
                Ref.ObjectRef objectRef3 = this.f37404t;
                dataStoreImpl = this.nr;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37408n = function2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37411t = jVar;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37405O = booleanRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.J2 = objectRef3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37410r = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37406S = 1;
                if (jVar.Z(null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                    booleanRef = booleanRef2;
                    objectRef = objectRef3;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t3 = (T) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37405O;
                    objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37411t;
                    jVar2 = (j) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37408n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objectRef2.element = t3;
                        objectRef = objectRef2;
                        T t4 = objectRef.element;
                        jVar2.T(null);
                        return t4;
                    } catch (Throwable th) {
                        th = th;
                        jVar2.T(null);
                        throw th;
                    }
                }
                dataStoreImpl2 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37405O;
                objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37411t;
                jVar3 = (j) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37408n;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(obj, objectRef.element)) {
                        jVar2 = jVar3;
                        T t42 = objectRef.element;
                        jVar2.T(null);
                        return t42;
                    }
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37408n = jVar3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37411t = objectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37405O = obj;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37406S = 3;
                    if (dataStoreImpl2.te(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                        t3 = (T) obj;
                        objectRef2 = objectRef;
                        jVar2 = jVar3;
                        objectRef2.element = t3;
                        objectRef = objectRef2;
                        T t422 = objectRef.element;
                        jVar2.T(null);
                        return t422;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2 = jVar3;
                    jVar2.T(null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37410r;
            objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.J2;
            booleanRef = (Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37405O;
            j jVar4 = (j) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37411t;
            Function2 function22 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37408n;
            ResultKt.throwOnFailure(obj);
            dataStoreImpl = dataStoreImpl3;
            function2 = function22;
            jVar = jVar4;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t5 = objectRef.element;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37408n = jVar;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37411t = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37405O = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.J2 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37410r = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.f37406S = 2;
            Object objInvoke = function2.invoke(t5, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != coroutine_suspended) {
                jVar3 = jVar;
                obj = objInvoke;
                dataStoreImpl2 = dataStoreImpl;
                if (!Intrinsics.areEqual(obj, objectRef.element)) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            jVar2 = jVar;
            jVar2.T(null);
            throw th;
        }
    }
}
