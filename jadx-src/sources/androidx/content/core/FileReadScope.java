package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/datastore/core/FileReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "Ljava/io/File;", FileUploadManager.f61570h, "Landroidx/datastore/core/Serializer;", "serializer", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", MRAIDPresenter.CLOSE, "()V", "J2", c.f62177j, "Ljava/io/File;", "Uo", "()Ljava/io/File;", "rl", "Landroidx/datastore/core/Serializer;", "KN", "()Landroidx/datastore/core/Serializer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public class FileReadScope<T> implements ReadScope<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Serializer serializer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed;

    @Override // androidx.content.core.ReadScope
    public Object t(Continuation continuation) {
        return xMQ(this, continuation);
    }

    public FileReadScope(File file, Serializer serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.FileReadScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.core.FileReadScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object xMQ(FileReadScope fileReadScope, Continuation continuation) {
        FileReadScope$readData$1 fileReadScope$readData$1;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (continuation instanceof FileReadScope$readData$1) {
            fileReadScope$readData$1 = (FileReadScope$readData$1) continuation;
            int i2 = fileReadScope$readData$1.f37513r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileReadScope$readData$1.f37513r = i2 - Integer.MIN_VALUE;
            } else {
                fileReadScope$readData$1 = new FileReadScope$readData$1(fileReadScope, continuation);
            }
        }
        Object obj = fileReadScope$readData$1.f37511O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = fileReadScope$readData$1.f37513r;
        try {
        } catch (FileNotFoundException unused) {
            fileReadScope = r2;
        }
        if (r2 != 0) {
            if (r2 == 1) {
                closeable2 = (Closeable) fileReadScope$readData$1.f37514t;
                r2 = (FileReadScope) fileReadScope$readData$1.f37512n;
                try {
                    ResultKt.throwOnFailure(obj);
                    CloseableKt.closeFinally(closeable2, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (r2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) fileReadScope$readData$1.f37512n;
            try {
                ResultKt.throwOnFailure(obj);
                CloseableKt.closeFinally(closeable, null);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                try {
                    throw th;
                } finally {
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        fileReadScope.J2();
        try {
            FileInputStream fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
            try {
                Serializer serializer = ((FileReadScope) fileReadScope).serializer;
                fileReadScope$readData$1.f37512n = fileReadScope;
                fileReadScope$readData$1.f37514t = fileInputStream;
                fileReadScope$readData$1.f37513r = 1;
                Object from = serializer.readFrom(fileInputStream, fileReadScope$readData$1);
                if (from != coroutine_suspended) {
                    closeable2 = fileInputStream;
                    obj = from;
                    CloseableKt.closeFinally(closeable2, null);
                    return obj;
                }
            } catch (Throwable th5) {
                r2 = fileReadScope;
                closeable2 = fileInputStream;
                th2 = th5;
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            if (!((FileReadScope) fileReadScope).file.exists()) {
                return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
            }
            FileInputStream fileInputStream2 = new FileInputStream(((FileReadScope) fileReadScope).file);
            try {
                Serializer serializer2 = ((FileReadScope) fileReadScope).serializer;
                fileReadScope$readData$1.f37512n = fileInputStream2;
                fileReadScope$readData$1.f37514t = null;
                fileReadScope$readData$1.f37513r = 2;
                Object from2 = serializer2.readFrom(fileInputStream2, fileReadScope$readData$1);
                if (from2 != coroutine_suspended) {
                    obj = from2;
                    closeable = fileInputStream2;
                    CloseableKt.closeFinally(closeable, null);
                    return obj;
                }
            } catch (Throwable th6) {
                th = th6;
                closeable = fileInputStream2;
                throw th;
            }
        }
        return coroutine_suspended;
    }

    protected final void J2() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    protected final Serializer getSerializer() {
        return this.serializer;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    protected final File getFile() {
        return this.file;
    }

    @Override // androidx.content.core.Closeable
    public void close() {
        this.closed.set(true);
    }
}
