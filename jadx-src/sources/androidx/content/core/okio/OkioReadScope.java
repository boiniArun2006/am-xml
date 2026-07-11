package androidx.content.core.okio;

import androidx.content.core.ReadScope;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", JavetError.PARAMETER_PATH, "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", MRAIDPresenter.CLOSE, "()V", "J2", c.f62177j, "Lokio/FileSystem;", "Uo", "()Lokio/FileSystem;", "rl", "Lokio/Path;", "KN", "()Lokio/Path;", "Landroidx/datastore/core/okio/OkioSerializer;", "xMQ", "()Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/okio/AtomicBoolean;", "nr", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:233\n60#2,10:239\n57#2,2:249\n71#2,2:251\n66#2:253\n52#2,5:255\n60#2,10:261\n57#2,2:271\n71#2,2:273\n67#3:232\n68#3:238\n67#3:254\n68#3:260\n1#4:275\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n177#1:231\n177#1:233,5\n177#1:239,10\n177#1:249,2\n177#1:251,2\n187#1:253\n187#1:255,5\n187#1:261,10\n187#1:271,2\n187#1:273,2\n177#1:232\n177#1:238\n187#1:254\n187#1:260\n*E\n"})
public class OkioReadScope<T> implements ReadScope<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FileSystem fileSystem;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AtomicBoolean closed;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final OkioSerializer serializer;

    @Override // androidx.content.core.ReadScope
    public Object t(Continuation continuation) {
        return mUb(this, continuation);
    }

    public OkioReadScope(FileSystem fileSystem, Path path, OkioSerializer serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090 A[Catch: FileNotFoundException -> 0x008a, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[Catch: FileNotFoundException -> 0x008a, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object mUb(OkioReadScope okioReadScope, Continuation continuation) throws Throwable {
        OkioReadScope$readData$1 okioReadScope$readData$1;
        OkioReadScope okioReadScope2;
        Closeable closeable;
        Throwable th;
        Object objN;
        Throwable th2;
        Closeable closeable2;
        Object objN2;
        Throwable th3;
        if (continuation instanceof OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (OkioReadScope$readData$1) continuation;
            int i2 = okioReadScope$readData$1.f37624r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioReadScope$readData$1.f37624r = i2 - Integer.MIN_VALUE;
            } else {
                okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, continuation);
            }
        }
        Object obj = okioReadScope$readData$1.f37622O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = okioReadScope$readData$1.f37624r;
        Throwable th4 = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            okioReadScope.J2();
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(okioReadScope.fileSystem.source(okioReadScope.path));
                try {
                    OkioSerializer okioSerializer = okioReadScope.serializer;
                    okioReadScope$readData$1.f37623n = okioReadScope;
                    okioReadScope$readData$1.f37625t = bufferedSourceBuffer;
                    okioReadScope$readData$1.f37624r = 1;
                    objN = okioSerializer.n(bufferedSourceBuffer, okioReadScope$readData$1);
                } catch (Throwable th5) {
                    okioReadScope2 = okioReadScope;
                    closeable = bufferedSourceBuffer;
                    th = th5;
                    if (closeable != null) {
                    }
                    th3 = th;
                    obj = null;
                }
                if (objN != coroutine_suspended) {
                    closeable = bufferedSourceBuffer;
                    obj = objN;
                    if (closeable == null) {
                    }
                    if (th3 == null) {
                    }
                }
            } catch (FileNotFoundException unused) {
                if (okioReadScope.fileSystem.exists(okioReadScope.path)) {
                    return okioReadScope.serializer.getDefaultValue();
                }
                BufferedSource bufferedSourceBuffer2 = Okio.buffer(okioReadScope.fileSystem.source(okioReadScope.path));
                try {
                    OkioSerializer okioSerializer2 = okioReadScope.serializer;
                    okioReadScope$readData$1.f37623n = bufferedSourceBuffer2;
                    okioReadScope$readData$1.f37625t = null;
                    okioReadScope$readData$1.f37624r = 2;
                    objN2 = okioSerializer2.n(bufferedSourceBuffer2, okioReadScope$readData$1);
                } catch (Throwable th6) {
                    th2 = th6;
                    closeable2 = bufferedSourceBuffer2;
                    if (closeable2 != null) {
                    }
                    th4 = th2;
                    obj = null;
                }
                if (objN2 != coroutine_suspended) {
                    obj = objN2;
                    closeable2 = bufferedSourceBuffer2;
                    if (closeable2 != null) {
                    }
                    if (th4 == null) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            closeable = (Closeable) okioReadScope$readData$1.f37625t;
            okioReadScope2 = (OkioReadScope) okioReadScope$readData$1.f37623n;
            try {
                ResultKt.throwOnFailure(obj);
                if (closeable == null) {
                    try {
                        closeable.close();
                        th3 = null;
                    } catch (Throwable th7) {
                        th3 = th7;
                    }
                } else {
                    th3 = null;
                }
            } catch (Throwable th8) {
                th = th8;
                if (closeable != null) {
                    try {
                        try {
                            closeable.close();
                        } catch (Throwable th9) {
                            ExceptionsKt.addSuppressed(th, th9);
                        }
                    } catch (FileNotFoundException unused2) {
                        okioReadScope = okioReadScope2;
                        if (okioReadScope.fileSystem.exists(okioReadScope.path)) {
                        }
                    }
                }
                th3 = th;
                obj = null;
            }
            if (th3 == null) {
                throw th3;
            }
            Intrinsics.checkNotNull(obj);
            return obj;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        closeable2 = (Closeable) okioReadScope$readData$1.f37623n;
        try {
            ResultKt.throwOnFailure(obj);
            if (closeable2 != null) {
                try {
                    closeable2.close();
                } catch (Throwable th10) {
                    th4 = th10;
                }
            }
        } catch (Throwable th11) {
            th2 = th11;
            if (closeable2 != null) {
                try {
                    closeable2.close();
                } catch (Throwable th12) {
                    ExceptionsKt.addSuppressed(th2, th12);
                }
            }
            th4 = th2;
            obj = null;
        }
        if (th4 == null) {
            throw th4;
        }
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    protected final void J2() {
        if (this.closed.n()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    protected final Path getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    protected final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // androidx.content.core.Closeable
    public void close() {
        this.closed.rl(true);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    protected final OkioSerializer getSerializer() {
        return this.serializer;
    }
}
