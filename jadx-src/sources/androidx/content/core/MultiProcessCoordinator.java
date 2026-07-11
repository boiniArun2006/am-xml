package androidx.content.core;

import GJW.Dsr;
import GJW.yg;
import TFv.Wre;
import androidx.content.core.SharedCounter;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001?B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ4\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\"R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u001b\u0010=\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b9\u0010:*\u0004\b;\u0010<¨\u0006@"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/io/File;", FileUploadManager.f61570h, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "", "suffix", "ck", "(Ljava/lang/String;)Ljava/io/File;", "", "ty", "(Ljava/io/File;)V", "HI", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "rl", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", c.f62177j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "LTFv/Wre;", "t", "LTFv/Wre;", "()LTFv/Wre;", "updateNotifications", "Ljava/lang/String;", "LOCK_SUFFIX", "VERSION_SUFFIX", "J2", "LOCK_ERROR_MESSAGE", "LyB/j;", "Uo", "LyB/j;", "inMemoryMutex", "KN", "Lkotlin/Lazy;", "Ik", "lockFile", "Lkotlin/Lazy;", "Landroidx/datastore/core/SharedCounter;", "xMQ", "lazySharedCounter", "r", "()Landroidx/datastore/core/SharedCounter;", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "sharedCounter", "mUb", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,205:1\n159#1,8:226\n159#1,8:234\n120#2,10:206\n32#3,10:216\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n99#1:226,8\n106#1:234,8\n43#1:206,10\n60#1:216,10\n*E\n"})
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final String LOCK_ERROR_MESSAGE;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Lazy lockFile;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String VERSION_SUFFIX;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final j inMemoryMutex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final String LOCK_SUFFIX;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Wre updateNotifications;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Lazy lazySharedCounter;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String gh = "Resource deadlock would occur";
    private static final long qie = 10;
    private static final long az = 60000;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "<init>", "()V", "Ljava/io/FileOutputStream;", "lockFileStream", "Ljava/nio/channels/FileLock;", "rl", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(FileOutputStream fileOutputStream, Continuation continuation) throws IOException {
            MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            long j2;
            MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12;
            if (continuation instanceof MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuation;
                int i2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.f37545r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.f37545r = i2 - Integer.MIN_VALUE;
                } else {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
                }
            }
            Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.f37543O;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.f37545r;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.f37546t;
                fileOutputStream = (FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.f37544n;
                ResultKt.throwOnFailure(obj);
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
                j2 *= (long) 2;
                if (j2 <= MultiProcessCoordinator.az) {
                    FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                    Intrinsics.checkNotNullExpressionValue(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                    return fileLockLock;
                }
                try {
                } catch (IOException e2) {
                    String message = e2.getMessage();
                    if (message == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) MultiProcessCoordinator.gh, false, 2, (Object) null)) {
                        throw e2;
                    }
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.f37544n = fileOutputStream;
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.f37546t = j2;
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.f37545r = 1;
                    if (yg.rl(j2, multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                Intrinsics.checkNotNullExpressionValue(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock2;
            }
            ResultKt.throwOnFailure(obj);
            j2 = MultiProcessCoordinator.qie;
            multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            if (j2 <= MultiProcessCoordinator.az) {
            }
        }
    }

    public MultiProcessCoordinator(CoroutineContext context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.O(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = CN3.rl(false, 1, null);
        this.lockFile = LazyKt.lazy(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.f37558n;
                File fileCk = multiProcessCoordinator.ck(multiProcessCoordinator.LOCK_SUFFIX);
                this.f37558n.ty(fileCk);
                return fileCk;
            }
        });
        this.lazySharedCounter = LazyKt.lazy(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final SharedCounter invoke() {
                SharedCounter.Companion companion = SharedCounter.INSTANCE;
                companion.nr();
                final MultiProcessCoordinator multiProcessCoordinator = this.f37551n;
                return companion.n(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final File invoke() throws IOException {
                        MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                        File fileCk = multiProcessCoordinator2.ck(multiProcessCoordinator2.VERSION_SUFFIX);
                        multiProcessCoordinator.ty(fileCk);
                        return fileCk;
                    }
                });
            }
        });
    }

    private final File Ik() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File ck(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter r() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public Object O(Continuation continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(r().t()) : Dsr.Uo(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public Object n(Continuation continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(r().rl()) : Dsr.Uo(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Function2 function2, Continuation continuation) throws Throwable {
        ?? multiProcessCoordinator$tryLock$1;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        j jVar;
        boolean z2;
        Closeable closeable;
        j jVar2;
        boolean z3;
        ?? r2 = function2;
        if (continuation instanceof MultiProcessCoordinator$tryLock$1) {
            MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$12 = (MultiProcessCoordinator$tryLock$1) continuation;
            int i2 = multiProcessCoordinator$tryLock$12.f37560Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$tryLock$12.f37560Z = i2 - Integer.MIN_VALUE;
                multiProcessCoordinator$tryLock$1 = multiProcessCoordinator$tryLock$12;
            } else {
                multiProcessCoordinator$tryLock$1 = new MultiProcessCoordinator$tryLock$1(this, continuation);
            }
        }
        Object objInvoke = multiProcessCoordinator$tryLock$1.f37563r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r52 = multiProcessCoordinator$tryLock$1.f37560Z;
        try {
            try {
                if (r52 != 0) {
                    if (r52 == 1) {
                        z3 = multiProcessCoordinator$tryLock$1.J2;
                        jVar2 = (j) multiProcessCoordinator$tryLock$1.f37561n;
                        ResultKt.throwOnFailure(objInvoke);
                        if (z3) {
                            jVar2.T(null);
                        }
                        return objInvoke;
                    }
                    if (r52 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = multiProcessCoordinator$tryLock$1.J2;
                    fileLock = (FileLock) multiProcessCoordinator$tryLock$1.f37559O;
                    closeable = (Closeable) multiProcessCoordinator$tryLock$1.f37564t;
                    jVar = (j) multiProcessCoordinator$tryLock$1.f37561n;
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        CloseableKt.closeFinally(closeable, null);
                        if (z2) {
                            jVar.T(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                        }
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(objInvoke);
                j jVar3 = this.inMemoryMutex;
                boolean zRl = jVar3.rl(null);
                try {
                    if (zRl) {
                        FileInputStream fileInputStream = new FileInputStream(Ik());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            String message2 = e2.getMessage();
                            if ((message2 == null || !StringsKt.startsWith$default(message2, this.LOCK_ERROR_MESSAGE, false, 2, (Object) null)) && ((message = e2.getMessage()) == null || !StringsKt.startsWith$default(message, gh, false, 2, (Object) null))) {
                                throw e2;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolBoxBoolean = Boxing.boxBoolean(fileLockTryLock != null);
                            multiProcessCoordinator$tryLock$1.f37561n = jVar3;
                            multiProcessCoordinator$tryLock$1.f37564t = fileInputStream;
                            multiProcessCoordinator$tryLock$1.f37559O = fileLockTryLock;
                            multiProcessCoordinator$tryLock$1.J2 = zRl;
                            multiProcessCoordinator$tryLock$1.f37560Z = 2;
                            objInvoke = r2.invoke(boolBoxBoolean, multiProcessCoordinator$tryLock$1);
                            if (objInvoke != coroutine_suspended) {
                                jVar = jVar3;
                                z2 = zRl;
                                closeable = fileInputStream;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                }
                                CloseableKt.closeFinally(closeable, null);
                                if (z2) {
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                            }
                            throw th;
                        }
                    } else {
                        Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                        multiProcessCoordinator$tryLock$1.f37561n = jVar3;
                        multiProcessCoordinator$tryLock$1.J2 = zRl;
                        multiProcessCoordinator$tryLock$1.f37560Z = 1;
                        objInvoke = r2.invoke(boolBoxBoolean2, multiProcessCoordinator$tryLock$1);
                        if (objInvoke != coroutine_suspended) {
                            jVar2 = jVar3;
                            z3 = zRl;
                            if (z3) {
                            }
                            return objInvoke;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    multiProcessCoordinator$tryLock$1 = jVar3;
                    r2 = zRl;
                    if (r2 != 0) {
                        multiProcessCoordinator$tryLock$1.T(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            ?? r42 = multiProcessCoordinator$tryLock$1;
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    CloseableKt.closeFinally(r52, th6);
                    throw th7;
                } catch (Throwable th8) {
                    th = th8;
                    r2 = r2;
                    multiProcessCoordinator$tryLock$1 = r42;
                    if (r2 != 0) {
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [yB.j] */
    @Override // androidx.content.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Function1 function1, Continuation continuation) throws Throwable {
        MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        MultiProcessCoordinator multiProcessCoordinator;
        FileOutputStream fileOutputStream;
        Throwable th;
        Function1 function12;
        Closeable closeable;
        ?? r2;
        ?? r10;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r102;
        ?? r02;
        if (continuation instanceof MultiProcessCoordinator$lock$1) {
            multiProcessCoordinator$lock$1 = (MultiProcessCoordinator$lock$1) continuation;
            int i2 = multiProcessCoordinator$lock$1.f37555o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$lock$1.f37555o = i2 - Integer.MIN_VALUE;
            } else {
                multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, continuation);
            }
        }
        ?? r103 = multiProcessCoordinator$lock$1.J2;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = multiProcessCoordinator$lock$1.f37555o;
        try {
            try {
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(r103);
                        j jVar = this.inMemoryMutex;
                        multiProcessCoordinator$lock$1.f37554n = this;
                        multiProcessCoordinator$lock$1.f37557t = function1;
                        multiProcessCoordinator$lock$1.f37553O = jVar;
                        multiProcessCoordinator$lock$1.f37555o = 1;
                        if (jVar.Z(null, multiProcessCoordinator$lock$1) != coroutine_suspended) {
                            multiProcessCoordinator = this;
                            r103 = jVar;
                        }
                        return coroutine_suspended;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) multiProcessCoordinator$lock$1.f37553O;
                            closeable2 = (Closeable) multiProcessCoordinator$lock$1.f37557t;
                            j jVar2 = (j) multiProcessCoordinator$lock$1.f37554n;
                            try {
                                ResultKt.throwOnFailure(r103);
                                r02 = jVar2;
                                r102 = r103;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    CloseableKt.closeFinally(closeable2, null);
                                    r02.T(null);
                                    return r102;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r103 = r02;
                                    r103.T(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) multiProcessCoordinator$lock$1.f37553O;
                        r2 = (j) multiProcessCoordinator$lock$1.f37557t;
                        function12 = (Function1) multiProcessCoordinator$lock$1.f37554n;
                        try {
                            ResultKt.throwOnFailure(r103);
                            r2 = r2;
                            r10 = r103;
                            fileLock2 = (FileLock) r10;
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = null;
                            if (fileLock != null) {
                            }
                            throw th;
                        }
                        try {
                            multiProcessCoordinator$lock$1.f37554n = r2;
                            multiProcessCoordinator$lock$1.f37557t = closeable;
                            multiProcessCoordinator$lock$1.f37553O = fileLock2;
                            multiProcessCoordinator$lock$1.f37555o = 3;
                            objInvoke = function12.invoke(multiProcessCoordinator$lock$1);
                            if (objInvoke != coroutine_suspended) {
                                closeable2 = closeable;
                                fileLock = fileLock2;
                                r102 = objInvoke;
                                r02 = r2;
                                if (fileLock != null) {
                                }
                                CloseableKt.closeFinally(closeable2, null);
                                r02.T(null);
                                return r102;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th5) {
                            fileLock = fileLock2;
                            th = th5;
                            if (fileLock != null) {
                            }
                            throw th;
                        }
                    }
                    j jVar3 = (j) multiProcessCoordinator$lock$1.f37553O;
                    Function1 function13 = (Function1) multiProcessCoordinator$lock$1.f37557t;
                    multiProcessCoordinator = (MultiProcessCoordinator) multiProcessCoordinator$lock$1.f37554n;
                    ResultKt.throwOnFailure(r103);
                    r103 = jVar3;
                    function1 = function13;
                    Companion companion = INSTANCE;
                    multiProcessCoordinator$lock$1.f37554n = function1;
                    multiProcessCoordinator$lock$1.f37557t = r103;
                    multiProcessCoordinator$lock$1.f37553O = fileOutputStream;
                    multiProcessCoordinator$lock$1.f37555o = 2;
                    Object objRl = companion.rl(fileOutputStream, multiProcessCoordinator$lock$1);
                    if (objRl != coroutine_suspended) {
                        function12 = function1;
                        closeable = fileOutputStream;
                        r2 = r103;
                        r10 = objRl;
                        fileLock2 = (FileLock) r10;
                        multiProcessCoordinator$lock$1.f37554n = r2;
                        multiProcessCoordinator$lock$1.f37557t = closeable;
                        multiProcessCoordinator$lock$1.f37553O = fileLock2;
                        multiProcessCoordinator$lock$1.f37555o = 3;
                        objInvoke = function12.invoke(multiProcessCoordinator$lock$1);
                        if (objInvoke != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream(multiProcessCoordinator.Ik());
            } catch (Throwable th7) {
                th = th7;
                r103.T(null);
                throw th;
            }
        } catch (Throwable th8) {
            r103 = multiProcessCoordinator$lock$1;
            try {
                throw th8;
            } catch (Throwable th9) {
                CloseableKt.closeFinally(coroutine_suspended, th8);
                throw th9;
            }
        }
    }

    @Override // androidx.content.core.InterProcessCoordinator
    /* JADX INFO: renamed from: t, reason: from getter */
    public Wre getUpdateNotifications() {
        return this.updateNotifications;
    }

    private final void HI(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ty(File file) throws IOException {
        HI(file);
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
