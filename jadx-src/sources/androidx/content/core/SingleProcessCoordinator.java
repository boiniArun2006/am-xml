package androidx.content.core;

import TFv.Wre;
import TFv.fuX;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "", "filePath", "<init>", "(Ljava/lang/String;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "rl", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", c.f62177j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O", "Ljava/lang/String;", "LyB/j;", "LyB/j;", "mutex", "Landroidx/datastore/core/AtomicInt;", "t", "Landroidx/datastore/core/AtomicInt;", NodeModuleProcess.PROPERTY_VERSION, "LTFv/Wre;", "", "LTFv/Wre;", "()LTFv/Wre;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,60:1\n120#2,10:61\n32#3,10:71\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:61,10\n49#1:71,10\n*E\n"})
public final class SingleProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String filePath;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Wre updateNotifications;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final j mutex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AtomicInt version;

    public SingleProcessCoordinator(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = CN3.rl(false, 1, null);
        this.version = new AtomicInt(0);
        this.updateNotifications = fuX.iF(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public Object O(Continuation continuation) {
        return Boxing.boxInt(this.version.nr());
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public Object n(Continuation continuation) {
        return Boxing.boxInt(this.version.rl());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Function2 function2, Continuation continuation) throws Throwable {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        j jVar;
        Throwable th;
        boolean z2;
        if (continuation instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) continuation;
            int i2 = singleProcessCoordinator$tryLock$1.f37602r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.f37602r = i2 - Integer.MIN_VALUE;
            } else {
                singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, continuation);
            }
        }
        Object obj = singleProcessCoordinator$tryLock$1.f37600O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = singleProcessCoordinator$tryLock$1.f37602r;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = singleProcessCoordinator$tryLock$1.f37603t;
            jVar = (j) singleProcessCoordinator$tryLock$1.f37601n;
            try {
                ResultKt.throwOnFailure(obj);
                if (z2) {
                    jVar.T(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z2) {
                    jVar.T(null);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        j jVar2 = this.mutex;
        boolean zRl = jVar2.rl(null);
        try {
            Boolean boolBoxBoolean = Boxing.boxBoolean(zRl);
            singleProcessCoordinator$tryLock$1.f37601n = jVar2;
            singleProcessCoordinator$tryLock$1.f37603t = zRl;
            singleProcessCoordinator$tryLock$1.f37602r = 1;
            Object objInvoke = function2.invoke(boolBoxBoolean, singleProcessCoordinator$tryLock$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = jVar2;
            obj = objInvoke;
            z2 = zRl;
            if (z2) {
            }
            return obj;
        } catch (Throwable th3) {
            jVar = jVar2;
            th = th3;
            z2 = zRl;
            if (z2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Function1 function1, Continuation continuation) throws Throwable {
        SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        j jVar;
        Throwable th;
        j jVar2;
        if (continuation instanceof SingleProcessCoordinator$lock$1) {
            singleProcessCoordinator$lock$1 = (SingleProcessCoordinator$lock$1) continuation;
            int i2 = singleProcessCoordinator$lock$1.f37598r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$lock$1.f37598r = i2 - Integer.MIN_VALUE;
            } else {
                singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, continuation);
            }
        }
        Object obj = singleProcessCoordinator$lock$1.f37596O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = singleProcessCoordinator$lock$1.f37598r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.mutex;
                singleProcessCoordinator$lock$1.f37597n = function1;
                singleProcessCoordinator$lock$1.f37599t = jVar;
                singleProcessCoordinator$lock$1.f37598r = 1;
                if (jVar.Z(null, singleProcessCoordinator$lock$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (j) singleProcessCoordinator$lock$1.f37597n;
                try {
                    ResultKt.throwOnFailure(obj);
                    jVar2.T(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            j jVar3 = (j) singleProcessCoordinator$lock$1.f37599t;
            Function1 function12 = (Function1) singleProcessCoordinator$lock$1.f37597n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            function1 = function12;
            singleProcessCoordinator$lock$1.f37597n = jVar;
            singleProcessCoordinator$lock$1.f37599t = null;
            singleProcessCoordinator$lock$1.f37598r = 2;
            Object objInvoke = function1.invoke(singleProcessCoordinator$lock$1);
            if (objInvoke != coroutine_suspended) {
                j jVar4 = jVar;
                obj = objInvoke;
                jVar2 = jVar4;
                jVar2.T(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            j jVar5 = jVar;
            th = th3;
            jVar2 = jVar5;
            jVar2.T(null);
            throw th;
        }
    }

    @Override // androidx.content.core.InterProcessCoordinator
    /* JADX INFO: renamed from: t, reason: from getter */
    public Wre getUpdateNotifications() {
        return this.updateNotifications;
    }
}
