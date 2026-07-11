package androidx.content.core.okio;

import androidx.content.core.WriteScope;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Closeable;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", JavetError.PARAMETER_PATH, "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "value", "", c.f62177j, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:232\n66#2:237\n52#2,21:238\n60#2,10:259\n57#2,2:269\n71#2,2:271\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n214#1:231\n214#1:232,5\n215#1:237\n215#1:238,21\n214#1:259,10\n214#1:269,2\n214#1:271,2\n*E\n"})
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(FileSystem fileSystem, Path path, OkioSerializer serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:42:0x0097, B:48:0x00a4, B:37:0x008c, B:34:0x0087), top: B:60:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:42:0x0097, B:48:0x00a4, B:37:0x008c, B:34:0x0087), top: B:60:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioWriteScope$writeData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.datastore.core.okio.OkioSerializer] */
    @Override // androidx.content.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Object obj, Continuation continuation) throws Throwable {
        ?? okioWriteScope$writeData$1;
        ?? OpenReadWrite;
        Unit unit;
        Throwable th;
        Closeable closeable;
        ?? r12;
        Throwable th2;
        Unit unit2;
        if (continuation instanceof OkioWriteScope$writeData$1) {
            OkioWriteScope$writeData$1 okioWriteScope$writeData$12 = (OkioWriteScope$writeData$1) continuation;
            int i2 = okioWriteScope$writeData$12.f37648o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioWriteScope$writeData$12.f37648o = i2 - Integer.MIN_VALUE;
                okioWriteScope$writeData$1 = okioWriteScope$writeData$12;
            } else {
                okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, continuation);
            }
        }
        Object obj2 = okioWriteScope$writeData$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = okioWriteScope$writeData$1.f37648o;
        Throwable th3 = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                J2();
                OpenReadWrite = getFileSystem().openReadWrite(getCom.caoccao.javet.exceptions.JavetError.PARAMETER_PATH java.lang.String());
                try {
                    BufferedSink bufferedSinkBuffer = Okio.buffer(FileHandle.sink$default(OpenReadWrite, 0L, 1, null));
                    try {
                        ?? serializer = getSerializer();
                        okioWriteScope$writeData$1.f37647n = OpenReadWrite;
                        okioWriteScope$writeData$1.f37650t = OpenReadWrite;
                        okioWriteScope$writeData$1.f37646O = bufferedSinkBuffer;
                        okioWriteScope$writeData$1.f37648o = 1;
                        if (serializer.rl(obj, bufferedSinkBuffer, okioWriteScope$writeData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ?? r02 = OpenReadWrite;
                        r12 = r02;
                        closeable = bufferedSinkBuffer;
                        okioWriteScope$writeData$1 = r02;
                    } catch (Throwable th4) {
                        okioWriteScope$writeData$1 = OpenReadWrite;
                        th = th4;
                        closeable = bufferedSinkBuffer;
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th5) {
                                ExceptionsKt.addSuppressed(th, th5);
                            }
                        }
                        th2 = th;
                        unit2 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (OpenReadWrite != 0) {
                        try {
                            OpenReadWrite.close();
                        } catch (Throwable th7) {
                            ExceptionsKt.addSuppressed(th, th7);
                        }
                    }
                    th3 = th;
                    unit = null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) okioWriteScope$writeData$1.f37646O;
                FileHandle fileHandle = (FileHandle) okioWriteScope$writeData$1.f37650t;
                okioWriteScope$writeData$1 = (Closeable) okioWriteScope$writeData$1.f37647n;
                try {
                    ResultKt.throwOnFailure(obj2);
                    okioWriteScope$writeData$1 = okioWriteScope$writeData$1;
                    r12 = fileHandle;
                } catch (Throwable th8) {
                    th = th8;
                    if (closeable != null) {
                    }
                    th2 = th;
                    unit2 = null;
                }
            }
            r12.flush();
            unit2 = Unit.INSTANCE;
            if (closeable != null) {
                try {
                    closeable.close();
                    th2 = null;
                } catch (Throwable th9) {
                    th2 = th9;
                }
                if (th2 == null) {
                    throw th2;
                }
                Intrinsics.checkNotNull(unit2);
                unit = Unit.INSTANCE;
                if (okioWriteScope$writeData$1 != 0) {
                    try {
                        okioWriteScope$writeData$1.close();
                    } catch (Throwable th10) {
                        th3 = th10;
                    }
                }
            } else {
                th2 = null;
                if (th2 == null) {
                }
            }
        } catch (Throwable th11) {
            th = th11;
            OpenReadWrite = okioWriteScope$writeData$1;
        }
        if (th3 != null) {
            throw th3;
        }
        Intrinsics.checkNotNull(unit);
        return Unit.INSTANCE;
    }
}
