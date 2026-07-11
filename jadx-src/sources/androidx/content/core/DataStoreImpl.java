package androidx.content.core;

import GJW.C;
import GJW.Dsr;
import GJW.ci;
import GJW.r;
import GJW.vd;
import GJW.xuv;
import TFv.Wre;
import TFv.fuX;
import androidx.content.core.Message;
import androidx.content.core.UpdatingDataContextElement;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002jkBp\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012?\b\u0002\u0010\u000e\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001a\u00028\u000021\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010 J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\"\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b$\u0010%J\u001e\u0010(\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0082@¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fH\u0082@¢\u0006\u0004\b*\u0010 J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\"\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b,\u0010 JK\u0010/\u001a\u00028\u000021\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b/\u00100J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000022\u0006\u00101\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b3\u0010%JI\u00107\u001a\u00028\u0001\"\u0004\b\u0001\u001042\u0006\u00101\u001a\u00020\u001a2\u001c\u00106\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r05H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010<R \u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010U\u001a\f0RR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010^R \u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR!\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000W8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bd\u0010e*\u0004\bf\u0010g¨\u0006l"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, l.f62634O, "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "LGJW/vd;", "scope", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;LGJW/vd;)V", "t", "transform", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "", "updateCache", "", "te", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "XQ", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ck", "requireLock", "Landroidx/datastore/core/State;", "nY", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Message$Update;", "update", "Z", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S", "WPU", "aYN", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "Landroidx/datastore/core/Data;", "ViF", "R", "Lkotlin/Function1;", "block", "Ik", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Storage;", "rl", "Landroidx/datastore/core/CorruptionHandler;", "LGJW/vd;", "LTFv/Wre;", "nr", "LTFv/Wre;", "getData", "()LTFv/Wre;", "data", "LyB/j;", "O", "LyB/j;", "collectorMutex", "J2", "I", "collectorCounter", "LGJW/xuv;", "Uo", "LGJW/xuv;", "collectorJob", "Landroidx/datastore/core/DataStoreInMemoryCache;", "KN", "Landroidx/datastore/core/DataStoreInMemoryCache;", "inMemoryCache", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "xMQ", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "readAndInit", "Lkotlin/Lazy;", "Landroidx/datastore/core/StorageConnection;", "mUb", "Lkotlin/Lazy;", "storageConnectionDelegate", "Landroidx/datastore/core/InterProcessCoordinator;", "gh", "r", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Landroidx/datastore/core/SimpleActor;", "qie", "Landroidx/datastore/core/SimpleActor;", "writeActor", "o", "()Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", "az", "Companion", "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n120#2,10:549\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n*L\n130#1:539,10\n148#1:549,10\n*E\n"})
public final class DataStoreImpl<T> implements DataStore<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int collectorCounter;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final DataStoreInMemoryCache inMemoryCache;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final j collectorMutex;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private xuv collectorJob;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Lazy coordinator;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Lazy storageConnectionDelegate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Storage storage;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Wre data;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final SimpleActor writeActor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CorruptionHandler corruptionHandler;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final vd scope;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final InitDataStore readAndInit;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001BF\u0012=\u0010\u000b\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0094@¢\u0006\u0004\b\u000e\u0010\u000fRO\u0010\u0012\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, l.f62634O, "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "<init>", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "rl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class InitDataStore extends RunOnce {
        final /* synthetic */ DataStoreImpl nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private List initTasks;

        public InitDataStore(DataStoreImpl dataStoreImpl, List initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.nr = dataStoreImpl;
            this.initTasks = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.content.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected Object rl(Continuation continuation) throws CorruptionException {
            DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            InitDataStore initDataStore;
            Data data;
            if (continuation instanceof DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuation;
                int i2 = dataStoreImpl$InitDataStore$doRun$1.J2;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.J2 = i2 - Integer.MIN_VALUE;
                } else {
                    dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuation);
                }
            }
            Object objViF = dataStoreImpl$InitDataStore$doRun$1.f37394t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = dataStoreImpl$InitDataStore$doRun$1.J2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objViF);
                List list = this.initTasks;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        DataStoreImpl dataStoreImpl = this.nr;
                        dataStoreImpl$InitDataStore$doRun$1.f37393n = this;
                        dataStoreImpl$InitDataStore$doRun$1.J2 = 1;
                        objViF = dataStoreImpl.ViF(false, dataStoreImpl$InitDataStore$doRun$1);
                        if (objViF != coroutine_suspended) {
                            initDataStore = this;
                            data = (Data) objViF;
                        }
                    } else {
                        InterProcessCoordinator interProcessCoordinatorR = this.nr.r();
                        DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(this.nr, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.f37393n = this;
                        dataStoreImpl$InitDataStore$doRun$1.J2 = 2;
                        objViF = interProcessCoordinatorR.rl(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                        if (objViF != coroutine_suspended) {
                            initDataStore = this;
                            data = (Data) objViF;
                        }
                    }
                    return coroutine_suspended;
                }
            } else if (i3 == 1) {
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.f37393n;
                ResultKt.throwOnFailure(objViF);
                data = (Data) objViF;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.f37393n;
                ResultKt.throwOnFailure(objViF);
                data = (Data) objViF;
            }
            initDataStore.nr.inMemoryCache.t(data);
            return Unit.INSTANCE;
        }
    }

    public DataStoreImpl(Storage storage, List initTasksList, CorruptionHandler corruptionHandler, vd scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = fuX.iF(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = CN3.rl(false, 1, null);
        this.inMemoryCache = new DataStoreInMemoryCache();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = LazyKt.lazy(new Function0<StorageConnection<T>>() { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final StorageConnection invoke() {
                return this.f37483n.storage.n();
            }
        });
        this.coordinator = LazyKt.lazy(new Function0<InterProcessCoordinator>() { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final InterProcessCoordinator invoke() {
                return this.f37412n.o().getCoordinator();
            }
        });
        this.writeActor = new SimpleActor(scope, new Function1<Throwable, Unit>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th != null) {
                    this.f37494n.inMemoryCache.t(new Final(th));
                }
                if (this.f37494n.storageConnectionDelegate.isInitialized()) {
                    this.f37494n.o().close();
                }
            }
        }, new Function2<Message.Update<T>, Throwable, Unit>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                n((Message.Update) obj, th);
                return Unit.INSTANCE;
            }

            public final void n(Message.Update msg, Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                r ack = msg.getAck();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.n(th);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    private final Object Ik(boolean z2, Function1 function1, Continuation continuation) {
        return z2 ? function1.invoke(continuation) : r().rl(new DataStoreImpl$doWithWriteFileLock$3(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.t(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(Continuation continuation) throws Throwable {
        DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1;
        DataStoreImpl<T> dataStoreImpl;
        int iIntValue;
        int i2;
        Throwable th;
        DataStoreImpl<T> dataStoreImpl2;
        if (continuation instanceof DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) {
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = (DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) continuation;
            int i3 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37450r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37450r = i3 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = new DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
            }
        }
        Object objN = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37448O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37450r;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(objN);
                InterProcessCoordinator interProcessCoordinatorR = r();
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37449n = this;
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37450r = 1;
                objN = interProcessCoordinatorR.n(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1);
                if (objN != coroutine_suspended) {
                    dataStoreImpl = this;
                }
                return coroutine_suspended;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37451t;
                dataStoreImpl2 = (DataStoreImpl) dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37449n;
                try {
                    ResultKt.throwOnFailure(objN);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    dataStoreImpl2.inMemoryCache.t(new ReadException(th, i2));
                    throw th;
                }
            }
            dataStoreImpl = (DataStoreImpl) dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37449n;
            ResultKt.throwOnFailure(objN);
            InitDataStore initDataStore = dataStoreImpl.readAndInit;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37449n = dataStoreImpl;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37451t = iIntValue;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.f37450r = 2;
        } catch (Throwable th3) {
            i2 = iIntValue;
            th = th3;
            dataStoreImpl2 = dataStoreImpl;
            dataStoreImpl2.inMemoryCache.t(new ReadException(th, i2));
            throw th;
        }
        iIntValue = ((Number) objN).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ViF(boolean z2, Continuation continuation) throws CorruptionException {
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        DataStoreImpl dataStoreImpl;
        Ref.ObjectRef objectRef;
        Object objN;
        CorruptionException corruptionException;
        Ref.ObjectRef objectRef2;
        DataStoreImpl dataStoreImpl2;
        CorruptionException corruptionException2;
        Function1 dataStoreImpl$readDataOrHandleCorruption$3;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef3;
        DataStoreImpl<T> dataStoreImpl3;
        DataStoreImpl<T> dataStoreImpl4;
        int iHashCode;
        Object objN2;
        boolean z3;
        int i2;
        Object obj;
        if (continuation instanceof DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (DataStoreImpl$readDataOrHandleCorruption$1) continuation;
            int i3 = dataStoreImpl$readDataOrHandleCorruption$1.f37467g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.f37467g = i3 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(this, continuation);
            }
        }
        Object obj2 = (T) dataStoreImpl$readDataOrHandleCorruption$1.f37466Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = dataStoreImpl$readDataOrHandleCorruption$1.f37467g;
        try {
        } catch (CorruptionException e2) {
            e = e2;
            dataStoreImpl = r2;
        }
        switch (r2) {
            case 0:
                ResultKt.throwOnFailure(obj2);
                try {
                    if (z2) {
                        dataStoreImpl$readDataOrHandleCorruption$1.f37468n = this;
                        dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                        dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 1;
                        obj2 = (T) aYN(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (obj2 != coroutine_suspended) {
                            dataStoreImpl4 = this;
                            if (obj2 == null) {
                                try {
                                    iHashCode = obj2.hashCode();
                                } catch (CorruptionException e3) {
                                    e = e3;
                                    dataStoreImpl = dataStoreImpl4;
                                    objectRef = new Ref.ObjectRef();
                                    CorruptionHandler corruptionHandler = dataStoreImpl.corruptionHandler;
                                    dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl;
                                    dataStoreImpl$readDataOrHandleCorruption$1.f37471t = e;
                                    dataStoreImpl$readDataOrHandleCorruption$1.f37464O = objectRef;
                                    dataStoreImpl$readDataOrHandleCorruption$1.J2 = objectRef;
                                    dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                                    dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 5;
                                    objN = corruptionHandler.n(e, dataStoreImpl$readDataOrHandleCorruption$1);
                                    if (objN != coroutine_suspended) {
                                    }
                                }
                            } else {
                                iHashCode = 0;
                            }
                            InterProcessCoordinator interProcessCoordinatorR = dataStoreImpl4.r();
                            dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl4;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37471t = obj2;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37469o = iHashCode;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 2;
                            objN2 = interProcessCoordinatorR.n(dataStoreImpl$readDataOrHandleCorruption$1);
                            if (objN2 != coroutine_suspended) {
                                int i5 = iHashCode;
                                z3 = z2;
                                i2 = i5;
                                obj = obj2;
                                obj2 = (T) objN2;
                                return new Data(obj, i2, ((Number) obj2).intValue());
                            }
                        }
                    } else {
                        InterProcessCoordinator interProcessCoordinatorR2 = r();
                        dataStoreImpl$readDataOrHandleCorruption$1.f37468n = this;
                        dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                        dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 3;
                        obj2 = (T) interProcessCoordinatorR2.n(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (obj2 != coroutine_suspended) {
                            dataStoreImpl3 = this;
                            int iIntValue = ((Number) obj2).intValue();
                            InterProcessCoordinator interProcessCoordinatorR3 = dataStoreImpl3.r();
                            DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(dataStoreImpl3, iIntValue, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl3;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 4;
                            obj2 = (T) interProcessCoordinatorR3.nr(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                            if (obj2 == coroutine_suspended) {
                            }
                            return (Data) obj2;
                        }
                    }
                } catch (CorruptionException e4) {
                    e = e4;
                    dataStoreImpl = this;
                    objectRef = new Ref.ObjectRef();
                    CorruptionHandler corruptionHandler2 = dataStoreImpl.corruptionHandler;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37471t = e;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37464O = objectRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.J2 = objectRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 5;
                    objN = corruptionHandler2.n(e, dataStoreImpl$readDataOrHandleCorruption$1);
                    if (objN != coroutine_suspended) {
                        corruptionException = e;
                        obj2 = (T) objN;
                        objectRef2 = objectRef;
                        dataStoreImpl2 = dataStoreImpl;
                        objectRef2.element = (T) obj2;
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        try {
                            dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, dataStoreImpl2, intRef2, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.f37468n = corruptionException;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37471t = objectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37464O = intRef2;
                            dataStoreImpl$readDataOrHandleCorruption$1.J2 = null;
                            dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 6;
                            if (dataStoreImpl2.Ik(z2, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            corruptionException2 = corruptionException;
                            ExceptionsKt.addSuppressed(corruptionException2, th);
                            throw corruptionException2;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                z2 = dataStoreImpl$readDataOrHandleCorruption$1.f37470r;
                DataStoreImpl<T> dataStoreImpl5 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.f37468n;
                ResultKt.throwOnFailure(obj2);
                dataStoreImpl4 = dataStoreImpl5;
                if (obj2 == null) {
                }
                InterProcessCoordinator interProcessCoordinatorR4 = dataStoreImpl4.r();
                dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl4;
                dataStoreImpl$readDataOrHandleCorruption$1.f37471t = obj2;
                dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                dataStoreImpl$readDataOrHandleCorruption$1.f37469o = iHashCode;
                dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 2;
                objN2 = interProcessCoordinatorR4.n(dataStoreImpl$readDataOrHandleCorruption$1);
                if (objN2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                i2 = dataStoreImpl$readDataOrHandleCorruption$1.f37469o;
                z3 = dataStoreImpl$readDataOrHandleCorruption$1.f37470r;
                obj = dataStoreImpl$readDataOrHandleCorruption$1.f37471t;
                dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.f37468n;
                try {
                    ResultKt.throwOnFailure(obj2);
                    return new Data(obj, i2, ((Number) obj2).intValue());
                } catch (CorruptionException e5) {
                    e = e5;
                    z2 = z3;
                    dataStoreImpl = dataStoreImpl4;
                    objectRef = new Ref.ObjectRef();
                    CorruptionHandler corruptionHandler22 = dataStoreImpl.corruptionHandler;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37471t = e;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37464O = objectRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.J2 = objectRef;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                    dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 5;
                    objN = corruptionHandler22.n(e, dataStoreImpl$readDataOrHandleCorruption$1);
                    if (objN != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            case 3:
                z2 = dataStoreImpl$readDataOrHandleCorruption$1.f37470r;
                dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.f37468n;
                ResultKt.throwOnFailure(obj2);
                int iIntValue2 = ((Number) obj2).intValue();
                InterProcessCoordinator interProcessCoordinatorR32 = dataStoreImpl3.r();
                DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$22 = new DataStoreImpl$readDataOrHandleCorruption$2(dataStoreImpl3, iIntValue2, null);
                dataStoreImpl$readDataOrHandleCorruption$1.f37468n = dataStoreImpl3;
                dataStoreImpl$readDataOrHandleCorruption$1.f37470r = z2;
                dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 4;
                obj2 = (T) interProcessCoordinatorR32.nr(dataStoreImpl$readDataOrHandleCorruption$22, dataStoreImpl$readDataOrHandleCorruption$1);
                if (obj2 == coroutine_suspended) {
                }
                return (Data) obj2;
            case 4:
                boolean z4 = dataStoreImpl$readDataOrHandleCorruption$1.f37470r;
                ResultKt.throwOnFailure(obj2);
                return (Data) obj2;
            case 5:
                z2 = dataStoreImpl$readDataOrHandleCorruption$1.f37470r;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.J2;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.f37464O;
                corruptionException = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.f37471t;
                DataStoreImpl dataStoreImpl6 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$1.f37468n;
                ResultKt.throwOnFailure(obj2);
                objectRef2 = objectRef4;
                objectRef = objectRef5;
                dataStoreImpl2 = dataStoreImpl6;
                objectRef2.element = (T) obj2;
                Ref.IntRef intRef22 = new Ref.IntRef();
                dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(objectRef, dataStoreImpl2, intRef22, null);
                dataStoreImpl$readDataOrHandleCorruption$1.f37468n = corruptionException;
                dataStoreImpl$readDataOrHandleCorruption$1.f37471t = objectRef;
                dataStoreImpl$readDataOrHandleCorruption$1.f37464O = intRef22;
                dataStoreImpl$readDataOrHandleCorruption$1.J2 = null;
                dataStoreImpl$readDataOrHandleCorruption$1.f37467g = 6;
                if (dataStoreImpl2.Ik(z2, dataStoreImpl$readDataOrHandleCorruption$3, dataStoreImpl$readDataOrHandleCorruption$1) != coroutine_suspended) {
                    intRef = intRef22;
                    objectRef3 = objectRef;
                    T t3 = objectRef3.element;
                    return new Data(t3, t3 != null ? t3.hashCode() : 0, intRef.element);
                }
                return coroutine_suspended;
            case 6:
                intRef = (Ref.IntRef) dataStoreImpl$readDataOrHandleCorruption$1.f37464O;
                objectRef3 = (Ref.ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.f37471t;
                corruptionException2 = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.f37468n;
                try {
                    ResultKt.throwOnFailure(obj2);
                    T t32 = objectRef3.element;
                    return new Data(t32, t32 != null ? t32.hashCode() : 0, intRef.element);
                } catch (Throwable th2) {
                    th = th2;
                    ExceptionsKt.addSuppressed(corruptionException2, th);
                    throw corruptionException2;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WPU(boolean z2, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        State state;
        Object obj;
        boolean z3;
        DataStoreImpl<T> dataStoreImpl;
        Pair pair;
        if (continuation instanceof DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (DataStoreImpl$readDataAndUpdateCache$1) continuation;
            int i2 = dataStoreImpl$readDataAndUpdateCache$1.f37454o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.f37454o = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$readDataAndUpdateCache$1 = new DataStoreImpl$readDataAndUpdateCache$1(this, continuation);
            }
        }
        Object objNr = dataStoreImpl$readDataAndUpdateCache$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dataStoreImpl$readDataAndUpdateCache$1.f37454o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objNr);
            State stateN = this.inMemoryCache.n();
            if (stateN instanceof UnInitialized) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            InterProcessCoordinator interProcessCoordinatorR = r();
            dataStoreImpl$readDataAndUpdateCache$1.f37453n = this;
            dataStoreImpl$readDataAndUpdateCache$1.f37456t = stateN;
            dataStoreImpl$readDataAndUpdateCache$1.f37452O = z2;
            dataStoreImpl$readDataAndUpdateCache$1.f37454o = 1;
            Object objN = interProcessCoordinatorR.n(dataStoreImpl$readDataAndUpdateCache$1);
            if (objN != coroutine_suspended) {
                state = stateN;
                obj = objN;
                z3 = z2;
                dataStoreImpl = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                dataStoreImpl = (DataStoreImpl) dataStoreImpl$readDataAndUpdateCache$1.f37453n;
                ResultKt.throwOnFailure(objNr);
                pair = (Pair) objNr;
                State state2 = (State) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                }
                return state2;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataStoreImpl = (DataStoreImpl) dataStoreImpl$readDataAndUpdateCache$1.f37453n;
            ResultKt.throwOnFailure(objNr);
            pair = (Pair) objNr;
            State state22 = (State) pair.component1();
            if (((Boolean) pair.component2()).booleanValue()) {
                dataStoreImpl.inMemoryCache.t(state22);
            }
            return state22;
        }
        boolean z4 = dataStoreImpl$readDataAndUpdateCache$1.f37452O;
        State state3 = (State) dataStoreImpl$readDataAndUpdateCache$1.f37456t;
        DataStoreImpl<T> dataStoreImpl2 = (DataStoreImpl) dataStoreImpl$readDataAndUpdateCache$1.f37453n;
        ResultKt.throwOnFailure(objNr);
        z3 = z4;
        dataStoreImpl = dataStoreImpl2;
        state = state3;
        obj = objNr;
        int iIntValue = ((Number) obj).intValue();
        boolean z5 = state instanceof Data;
        int version = z5 ? state.getVersion() : -1;
        if (z5 && iIntValue == version) {
            return state;
        }
        if (z3) {
            InterProcessCoordinator interProcessCoordinatorR2 = dataStoreImpl.r();
            DataStoreImpl$readDataAndUpdateCache$3 dataStoreImpl$readDataAndUpdateCache$3 = new DataStoreImpl$readDataAndUpdateCache$3(dataStoreImpl, null);
            dataStoreImpl$readDataAndUpdateCache$1.f37453n = dataStoreImpl;
            dataStoreImpl$readDataAndUpdateCache$1.f37456t = null;
            dataStoreImpl$readDataAndUpdateCache$1.f37454o = 2;
            objNr = interProcessCoordinatorR2.rl(dataStoreImpl$readDataAndUpdateCache$3, dataStoreImpl$readDataAndUpdateCache$1);
        } else {
            InterProcessCoordinator interProcessCoordinatorR3 = dataStoreImpl.r();
            DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl, version, null);
            dataStoreImpl$readDataAndUpdateCache$1.f37453n = dataStoreImpl;
            dataStoreImpl$readDataAndUpdateCache$1.f37456t = null;
            dataStoreImpl$readDataAndUpdateCache$1.f37454o = 3;
            objNr = interProcessCoordinatorR3.nr(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object XQ(Continuation continuation) {
        DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        DataStoreImpl<T> dataStoreImpl;
        j jVar;
        if (continuation instanceof DataStoreImpl$incrementCollector$1) {
            dataStoreImpl$incrementCollector$1 = (DataStoreImpl$incrementCollector$1) continuation;
            int i2 = dataStoreImpl$incrementCollector$1.f37443r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$incrementCollector$1.f37443r = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(this, continuation);
            }
        }
        Object obj = dataStoreImpl$incrementCollector$1.f37441O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dataStoreImpl$incrementCollector$1.f37443r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar2 = this.collectorMutex;
            dataStoreImpl$incrementCollector$1.f37442n = this;
            dataStoreImpl$incrementCollector$1.f37444t = jVar2;
            dataStoreImpl$incrementCollector$1.f37443r = 1;
            if (jVar2.Z(null, dataStoreImpl$incrementCollector$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dataStoreImpl = this;
            jVar = jVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) dataStoreImpl$incrementCollector$1.f37444t;
            dataStoreImpl = (DataStoreImpl) dataStoreImpl$incrementCollector$1.f37442n;
            ResultKt.throwOnFailure(obj);
        }
        try {
            int i5 = dataStoreImpl.collectorCounter + 1;
            dataStoreImpl.collectorCounter = i5;
            if (i5 == 1) {
                dataStoreImpl.collectorJob = C.nr(dataStoreImpl.scope, null, null, new DataStoreImpl$incrementCollector$2$1(dataStoreImpl, null), 3, null);
            }
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.Message$Update, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.datastore.core.Message$Update] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3, types: [GJW.r] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(Message.Update update, Continuation continuation) {
        DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        Object objM313constructorimpl;
        ?? r9;
        r ack;
        State stateN;
        DataStoreImpl<T> dataStoreImpl;
        Object objG;
        ?? r92;
        r rVar;
        if (continuation instanceof DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (DataStoreImpl$handleUpdate$1) continuation;
            int i2 = dataStoreImpl$handleUpdate$1.f37438o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$handleUpdate$1.f37438o = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$handleUpdate$1 = new DataStoreImpl$handleUpdate$1(this, continuation);
            }
        }
        Object obj = dataStoreImpl$handleUpdate$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dataStoreImpl$handleUpdate$1.f37438o;
        boolean z2 = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                rVar = (r) dataStoreImpl$handleUpdate$1.f37437n;
            } else if (i3 == 2) {
                r rVar2 = (r) dataStoreImpl$handleUpdate$1.f37436O;
                dataStoreImpl = (DataStoreImpl) dataStoreImpl$handleUpdate$1.f37440t;
                Message.Update update2 = (Message.Update) dataStoreImpl$handleUpdate$1.f37437n;
                ResultKt.throwOnFailure(obj);
                ack = rVar2;
                r92 = update2;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) dataStoreImpl$handleUpdate$1.f37437n;
            }
            ResultKt.throwOnFailure(obj);
            update = rVar;
            objM313constructorimpl = Result.m313constructorimpl(obj);
            r9 = update;
            ci.nr(r9, objM313constructorimpl);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        ack = update.getAck();
        try {
            Result.Companion companion = Result.INSTANCE;
            stateN = this.inMemoryCache.n();
        } catch (Throwable th2) {
            th = th2;
            update = ack;
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            r9 = update;
        }
        if (stateN instanceof Data) {
            Function2 transform = update.getTransform();
            CoroutineContext callerContext = update.getCallerContext();
            dataStoreImpl$handleUpdate$1.f37437n = ack;
            dataStoreImpl$handleUpdate$1.f37438o = 1;
            objG = g(transform, callerContext, dataStoreImpl$handleUpdate$1);
            if (objG == coroutine_suspended) {
            }
            r rVar3 = ack;
            obj = objG;
            update = rVar3;
            objM313constructorimpl = Result.m313constructorimpl(obj);
            r9 = update;
            ci.nr(r9, objM313constructorimpl);
            return Unit.INSTANCE;
        }
        if (!(stateN instanceof ReadException)) {
            z2 = stateN instanceof UnInitialized;
        }
        if (!z2) {
            if (stateN instanceof Final) {
                throw ((Final) stateN).getFinalException();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (stateN != update.getLastState()) {
            Intrinsics.checkNotNull(stateN, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
            throw ((ReadException) stateN).getReadException();
        }
        dataStoreImpl$handleUpdate$1.f37437n = update;
        dataStoreImpl$handleUpdate$1.f37440t = this;
        dataStoreImpl$handleUpdate$1.f37436O = ack;
        dataStoreImpl$handleUpdate$1.f37438o = 2;
        if (S(dataStoreImpl$handleUpdate$1) != coroutine_suspended) {
            dataStoreImpl = this;
            r92 = update;
        }
        return coroutine_suspended;
        Function2 transform2 = r92.getTransform();
        CoroutineContext callerContext2 = r92.getCallerContext();
        dataStoreImpl$handleUpdate$1.f37437n = ack;
        dataStoreImpl$handleUpdate$1.f37440t = null;
        dataStoreImpl$handleUpdate$1.f37436O = null;
        dataStoreImpl$handleUpdate$1.f37438o = 3;
        objG = dataStoreImpl.g(transform2, callerContext2, dataStoreImpl$handleUpdate$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ck(Continuation continuation) {
        DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        DataStoreImpl<T> dataStoreImpl;
        j jVar;
        if (continuation instanceof DataStoreImpl$decrementCollector$1) {
            dataStoreImpl$decrementCollector$1 = (DataStoreImpl$decrementCollector$1) continuation;
            int i2 = dataStoreImpl$decrementCollector$1.f37432r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$decrementCollector$1.f37432r = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(this, continuation);
            }
        }
        Object obj = dataStoreImpl$decrementCollector$1.f37430O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dataStoreImpl$decrementCollector$1.f37432r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar2 = this.collectorMutex;
            dataStoreImpl$decrementCollector$1.f37431n = this;
            dataStoreImpl$decrementCollector$1.f37433t = jVar2;
            dataStoreImpl$decrementCollector$1.f37432r = 1;
            if (jVar2.Z(null, dataStoreImpl$decrementCollector$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dataStoreImpl = this;
            jVar = jVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) dataStoreImpl$decrementCollector$1.f37433t;
            dataStoreImpl = (DataStoreImpl) dataStoreImpl$decrementCollector$1.f37431n;
            ResultKt.throwOnFailure(obj);
        }
        try {
            int i5 = dataStoreImpl.collectorCounter - 1;
            dataStoreImpl.collectorCounter = i5;
            if (i5 == 0) {
                xuv xuvVar = dataStoreImpl.collectorJob;
                if (xuvVar != null) {
                    xuv.j.rl(xuvVar, null, 1, null);
                }
                dataStoreImpl.collectorJob = null;
            }
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nY(boolean z2, Continuation continuation) {
        return Dsr.Uo(this.scope.getCoroutineContext(), new DataStoreImpl$readState$2(this, z2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator r() {
        return (InterProcessCoordinator) this.coordinator.getValue();
    }

    @Override // androidx.content.core.DataStore
    public Wre getData() {
        return this.data;
    }

    public final StorageConnection o() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object te(Object obj, boolean z2, Continuation continuation) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        Ref.IntRef intRef;
        if (continuation instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuation;
            int i2 = dataStoreImpl$writeData$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuation);
            }
        }
        Object obj2 = dataStoreImpl$writeData$1.f37501t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dataStoreImpl$writeData$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            Ref.IntRef intRef2 = new Ref.IntRef();
            StorageConnection storageConnectionO = o();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(intRef2, this, obj, z2, null);
            dataStoreImpl$writeData$1.f37500n = intRef2;
            dataStoreImpl$writeData$1.J2 = 1;
            if (storageConnectionO.rl(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) dataStoreImpl$writeData$1.f37500n;
            ResultKt.throwOnFailure(obj2);
        }
        return Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object aYN(Continuation continuation) {
        return StorageConnectionKt.n(o(), continuation);
    }

    private final Object g(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        return r().rl(new DataStoreImpl$transformAndWrite$2(this, coroutineContext, function2, null), continuation);
    }

    @Override // androidx.content.core.DataStore
    public Object n(Function2 function2, Continuation continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getContext().get(UpdatingDataContextElement.Companion.Key.f37615n);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.t(this);
        }
        return Dsr.Uo(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, function2, null), continuation);
    }
}
