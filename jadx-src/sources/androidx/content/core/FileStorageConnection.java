package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\n2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100¨\u00062"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "Ljava/io/File;", FileUploadManager.f61570h, "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "J2", "()V", "Uo", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "nr", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "rl", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MRAIDPresenter.CLOSE, c.f62177j, "Ljava/io/File;", "Landroidx/datastore/core/Serializer;", "t", "Landroidx/datastore/core/InterProcessCoordinator;", "O", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "LyB/j;", "LyB/j;", "transactionMutex", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n38#2,23:209\n38#2,23:240\n120#3,8:232\n129#3:263\n1#4:264\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n100#1:209,23\n117#1:240,23\n114#1:232,8\n114#1:263\n*E\n"})
public final class FileStorageConnection<T> implements StorageConnection<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final j transactionMutex;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function0 onClose;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Serializer serializer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterProcessCoordinator coordinator;

    public FileStorageConnection(File file, Serializer serializer, InterProcessCoordinator coordinator, Function0 onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = CN3.rl(false, 1, null);
    }

    private final void J2() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // androidx.content.core.StorageConnection
    /* JADX INFO: renamed from: O, reason: from getter */
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.content.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Function3 function3, Continuation continuation) throws Throwable {
        ?? fileStorageConnection$readScope$1;
        Throwable th;
        Closeable closeable;
        ?? r8;
        ?? r02;
        if (continuation instanceof FileStorageConnection$readScope$1) {
            FileStorageConnection$readScope$1 fileStorageConnection$readScope$12 = (FileStorageConnection$readScope$1) continuation;
            int i2 = fileStorageConnection$readScope$12.f37525o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileStorageConnection$readScope$12.f37525o = i2 - Integer.MIN_VALUE;
                fileStorageConnection$readScope$1 = fileStorageConnection$readScope$12;
            } else {
                fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, continuation);
            }
        }
        Object obj = fileStorageConnection$readScope$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fileStorageConnection$readScope$1.f37525o;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = fileStorageConnection$readScope$1.f37523O;
                closeable = (Closeable) fileStorageConnection$readScope$1.f37527t;
                fileStorageConnection$readScope$1 = (FileStorageConnection) fileStorageConnection$readScope$1.f37524n;
                try {
                    ResultKt.throwOnFailure(obj);
                    r02 = fileStorageConnection$readScope$1;
                    r8 = function3;
                    try {
                        closeable.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        j.C1281j.t(r02.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        closeable.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th, th4);
                    }
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            J2();
            boolean zRl = j.C1281j.rl(this.transactionMutex, null, 1, null);
            try {
                FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                try {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zRl);
                    fileStorageConnection$readScope$1.f37524n = this;
                    fileStorageConnection$readScope$1.f37527t = fileReadScope;
                    fileStorageConnection$readScope$1.f37523O = zRl;
                    fileStorageConnection$readScope$1.f37525o = 1;
                    Object objInvoke = function3.invoke(fileReadScope, boolBoxBoolean, fileStorageConnection$readScope$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    r8 = zRl;
                    r02 = this;
                    closeable = fileReadScope;
                    closeable.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    function3 = zRl;
                    fileStorageConnection$readScope$1 = this;
                    closeable = fileReadScope;
                    closeable.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                function3 = zRl;
                fileStorageConnection$readScope$1 = this;
                if (function3 != 0) {
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (function3 != 0) {
                j.C1281j.t(fileStorageConnection$readScope$1.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, yB.j] */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Function2 function2, Continuation continuation) throws IOException {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        File file;
        FileStorageConnection<T> fileStorageConnection;
        j jVar;
        FileWriteScope fileWriteScope;
        Throwable th;
        Closeable closeable;
        File file2;
        FileStorageConnection<T> fileStorageConnection2;
        if (continuation instanceof FileStorageConnection$writeScope$1) {
            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) continuation;
            int i2 = fileStorageConnection$writeScope$1.f37529Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileStorageConnection$writeScope$1.f37529Z = i2 - Integer.MIN_VALUE;
            } else {
                fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, continuation);
            }
        }
        Object obj = fileStorageConnection$writeScope$1.f37532r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = fileStorageConnection$writeScope$1.f37529Z;
        try {
            try {
            } catch (Throwable th2) {
                r2.T(null);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
            file = coroutine_suspended;
        }
        try {
            try {
                if (r2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    J2();
                    Uo(this.file);
                    j jVar2 = this.transactionMutex;
                    fileStorageConnection$writeScope$1.f37530n = this;
                    fileStorageConnection$writeScope$1.f37533t = function2;
                    fileStorageConnection$writeScope$1.f37528O = jVar2;
                    fileStorageConnection$writeScope$1.f37529Z = 1;
                    if (jVar2.Z(null, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                        fileStorageConnection = this;
                        jVar = jVar2;
                    }
                    return coroutine_suspended;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) fileStorageConnection$writeScope$1.J2;
                    File file3 = (File) fileStorageConnection$writeScope$1.f37528O;
                    jVar = (j) fileStorageConnection$writeScope$1.f37533t;
                    fileStorageConnection2 = (FileStorageConnection) fileStorageConnection$writeScope$1.f37530n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        file2 = file3;
                        Unit unit = Unit.INSTANCE;
                        try {
                            closeable.close();
                            th = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        if (th == null) {
                            throw th;
                        }
                        if (file2.exists() && !FileMoves_androidKt.n(file2, fileStorageConnection2.file)) {
                            throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                        }
                        Unit unit2 = Unit.INSTANCE;
                        jVar.T(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            closeable.close();
                        } catch (Throwable th5) {
                            ExceptionsKt.addSuppressed(th, th5);
                        }
                        throw th;
                    }
                }
                j jVar3 = (j) fileStorageConnection$writeScope$1.f37528O;
                Function2 function22 = (Function2) fileStorageConnection$writeScope$1.f37533t;
                fileStorageConnection = (FileStorageConnection) fileStorageConnection$writeScope$1.f37530n;
                ResultKt.throwOnFailure(obj);
                jVar = jVar3;
                function2 = function22;
                fileStorageConnection$writeScope$1.f37530n = fileStorageConnection;
                fileStorageConnection$writeScope$1.f37533t = jVar;
                fileStorageConnection$writeScope$1.f37528O = file;
                fileStorageConnection$writeScope$1.J2 = fileWriteScope;
                fileStorageConnection$writeScope$1.f37529Z = 2;
                if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != coroutine_suspended) {
                    file2 = file;
                    fileStorageConnection2 = fileStorageConnection;
                    closeable = fileWriteScope;
                    Unit unit3 = Unit.INSTANCE;
                    closeable.close();
                    th = null;
                    if (th == null) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th6) {
                th = th6;
                closeable = fileWriteScope;
                closeable.close();
                throw th;
            }
            fileWriteScope = new FileWriteScope(file, fileStorageConnection.serializer);
        } catch (IOException e3) {
            e = e3;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
        file = new File(fileStorageConnection.file.getAbsolutePath() + ".tmp");
    }

    private final void Uo(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }
}
