package androidx.content.core;

import androidx.content.core.DataStoreImpl;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, 458, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", l.f62634O, "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n1855#2,2:539\n120#3,10:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n*L\n458#1:539,2\n461#1:541,10\n*E\n"})
final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends SuspendLambda implements Function1<Continuation<? super Data<T>>, Object> {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37395O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37396S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f37397Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl.InitDataStore f37398g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37400o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f37401r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37402t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl dataStoreImpl, DataStoreImpl.InitDataStore initDataStore, Continuation continuation) {
        super(1, continuation);
        this.f37396S = dataStoreImpl;
        this.f37398g = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.f37396S, this.f37398g, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        j jVarRl;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef2;
        j jVar;
        Iterator<T> it;
        j jVar2;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref.ObjectRef objectRef4;
        Object obj2;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f37397Z;
        int iHashCode = 0;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            i2 = this.f37400o;
                            obj2 = this.f37399n;
                            ResultKt.throwOnFailure(obj);
                            return new Data(obj2, i2, ((Number) obj).intValue());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (j) this.f37395O;
                    objectRef4 = (Ref.ObjectRef) this.f37402t;
                    booleanRef2 = (Ref.BooleanRef) this.f37399n;
                    ResultKt.throwOnFailure(obj);
                    try {
                        booleanRef2.element = true;
                        Unit unit = Unit.INSTANCE;
                        jVar.T(null);
                        obj2 = objectRef4.element;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        }
                        InterProcessCoordinator interProcessCoordinatorR = this.f37396S.r();
                        this.f37399n = obj2;
                        this.f37402t = null;
                        this.f37395O = null;
                        this.f37400o = iHashCode;
                        this.f37397Z = 4;
                        obj = interProcessCoordinatorR.n(this);
                        if (obj != coroutine_suspended) {
                            i2 = iHashCode;
                            return new Data(obj2, i2, ((Number) obj).intValue());
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        jVar.T(null);
                        throw th;
                    }
                }
                it = (Iterator) this.f37401r;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.J2;
                objectRef3 = (Ref.ObjectRef) this.f37395O;
                booleanRef3 = (Ref.BooleanRef) this.f37402t;
                jVar2 = (j) this.f37399n;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    this.f37399n = jVar2;
                    this.f37402t = booleanRef3;
                    this.f37395O = objectRef3;
                    this.J2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.f37401r = it;
                    this.f37397Z = 2;
                    if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                        break;
                    }
                }
                objectRef2 = objectRef3;
                booleanRef2 = booleanRef3;
                jVar = jVar2;
                this.f37398g.initTasks = null;
                this.f37399n = booleanRef2;
                this.f37402t = objectRef2;
                this.f37395O = jVar;
                this.J2 = null;
                this.f37401r = null;
                this.f37397Z = 3;
                if (jVar.Z(null, this) != coroutine_suspended) {
                    objectRef4 = objectRef2;
                    booleanRef2.element = true;
                    Unit unit2 = Unit.INSTANCE;
                    jVar.T(null);
                    obj2 = objectRef4.element;
                    if (obj2 != null) {
                    }
                    InterProcessCoordinator interProcessCoordinatorR2 = this.f37396S.r();
                    this.f37399n = obj2;
                    this.f37402t = null;
                    this.f37395O = null;
                    this.f37400o = iHashCode;
                    this.f37397Z = 4;
                    obj = interProcessCoordinatorR2.n(this);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            objectRef = (Ref.ObjectRef) this.J2;
            objectRef2 = (Ref.ObjectRef) this.f37395O;
            booleanRef = (Ref.BooleanRef) this.f37402t;
            jVarRl = (j) this.f37399n;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            jVarRl = CN3.rl(false, 1, null);
            booleanRef = new Ref.BooleanRef();
            objectRef = new Ref.ObjectRef();
            DataStoreImpl dataStoreImpl = this.f37396S;
            this.f37399n = jVarRl;
            this.f37402t = booleanRef;
            this.f37395O = objectRef;
            this.J2 = objectRef;
            this.f37397Z = 1;
            obj = dataStoreImpl.ViF(true, this);
            if (obj != coroutine_suspended) {
                objectRef2 = objectRef;
            }
            return coroutine_suspended;
        }
        objectRef.element = (T) ((Data) obj).getValue();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$12 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(jVarRl, booleanRef, objectRef2, this.f37396S);
        List list = this.f37398g.initTasks;
        if (list != null) {
            it = list.iterator();
            jVar2 = jVarRl;
            booleanRef3 = booleanRef;
            objectRef3 = objectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$12;
            while (it.hasNext()) {
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            jVar = jVar2;
            this.f37398g.initTasks = null;
            this.f37399n = booleanRef2;
            this.f37402t = objectRef2;
            this.f37395O = jVar;
            this.J2 = null;
            this.f37401r = null;
            this.f37397Z = 3;
            if (jVar.Z(null, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        booleanRef2 = booleanRef;
        jVar = jVarRl;
        this.f37398g.initTasks = null;
        this.f37399n = booleanRef2;
        this.f37402t = objectRef2;
        this.f37395O = jVar;
        this.J2 = null;
        this.f37401r = null;
        this.f37397Z = 3;
        if (jVar.Z(null, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
