package androidx.content.core.okio;

import androidx.content.core.Closeable;
import androidx.content.core.InterProcessCoordinator;
import androidx.content.core.StorageConnection;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
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
import okio.FileSystem;
import okio.Path;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122B\u0010\u001c\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0013¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\f2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001f¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", JavetError.PARAMETER_PATH, "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lkotlin/jvm/functions/Function0;)V", "J2", "()V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "locked", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "nr", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "rl", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MRAIDPresenter.CLOSE, c.f62177j, "Lokio/FileSystem;", "Lokio/Path;", "t", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "O", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/jvm/functions/Function0;", "Landroidx/datastore/core/okio/AtomicBoolean;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "LyB/j;", "Uo", "LyB/j;", "transactionMutex", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n38#2,23:231\n38#2,23:262\n120#3,8:254\n129#3:285\n1#4:286\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:231,23\n136#1:262,23\n129#1:254,8\n129#1:285\n*E\n"})
public final class OkioStorageConnection<T> implements StorageConnection<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final AtomicBoolean closed;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function0 onClose;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final j transactionMutex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FileSystem fileSystem;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final InterProcessCoordinator coordinator;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final OkioSerializer serializer;

    public OkioStorageConnection(FileSystem fileSystem, Path path, OkioSerializer serializer, InterProcessCoordinator coordinator, Function0 onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = CN3.rl(false, 1, null);
    }

    private final void J2() {
        if (this.closed.n()) {
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
        this.closed.rl(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:31:0x007d, B:40:0x008e, B:39:0x008b, B:36:0x0086), top: B:54:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Function3 function3, Continuation continuation) throws Throwable {
        ?? okioStorageConnection$readScope$1;
        Throwable th;
        Closeable closeable;
        ?? r9;
        ?? r02;
        if (continuation instanceof OkioStorageConnection$readScope$1) {
            OkioStorageConnection$readScope$1 okioStorageConnection$readScope$12 = (OkioStorageConnection$readScope$1) continuation;
            int i2 = okioStorageConnection$readScope$12.f37637o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioStorageConnection$readScope$12.f37637o = i2 - Integer.MIN_VALUE;
                okioStorageConnection$readScope$1 = okioStorageConnection$readScope$12;
            } else {
                okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, continuation);
            }
        }
        Object obj = okioStorageConnection$readScope$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = okioStorageConnection$readScope$1.f37637o;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = okioStorageConnection$readScope$1.f37635O;
                closeable = (Closeable) okioStorageConnection$readScope$1.f37639t;
                okioStorageConnection$readScope$1 = (OkioStorageConnection) okioStorageConnection$readScope$1.f37636n;
                try {
                    ResultKt.throwOnFailure(obj);
                    r02 = okioStorageConnection$readScope$1;
                    r9 = function3;
                    try {
                        closeable.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
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
                OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zRl);
                    okioStorageConnection$readScope$1.f37636n = this;
                    okioStorageConnection$readScope$1.f37639t = okioReadScope;
                    okioStorageConnection$readScope$1.f37635O = zRl;
                    okioStorageConnection$readScope$1.f37637o = 1;
                    Object objInvoke = function3.invoke(okioReadScope, boolBoxBoolean, okioStorageConnection$readScope$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    r9 = zRl;
                    r02 = this;
                    closeable = okioReadScope;
                    closeable.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    function3 = zRl;
                    okioStorageConnection$readScope$1 = this;
                    closeable = okioReadScope;
                    closeable.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                function3 = zRl;
                okioStorageConnection$readScope$1 = this;
                if (function3 != 0) {
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (function3 != 0) {
                j.C1281j.t(okioStorageConnection$readScope$1.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v5, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r10v19, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r10v23, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, okio.Path] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r5v4, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.datastore.core.okio.OkioStorageConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.content.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Function2 function2, Continuation continuation) throws Throwable {
        OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$1;
        ?? r11;
        ?? r7;
        ?? Resolve;
        Path pathParent;
        OkioWriteScope okioWriteScope;
        Throwable th;
        Closeable closeable;
        ?? r12;
        ?? r02;
        ?? r2;
        if (continuation instanceof OkioStorageConnection$writeScope$1) {
            okioStorageConnection$writeScope$1 = (OkioStorageConnection$writeScope$1) continuation;
            int i2 = okioStorageConnection$writeScope$1.f37641Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okioStorageConnection$writeScope$1.f37641Z = i2 - Integer.MIN_VALUE;
            } else {
                okioStorageConnection$writeScope$1 = new OkioStorageConnection$writeScope$1(this, continuation);
            }
        }
        Object obj = okioStorageConnection$writeScope$1.f37644r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r22 = okioStorageConnection$writeScope$1.f37641Z;
        try {
            try {
                try {
                    try {
                        try {
                            if (r22 == 0) {
                                ResultKt.throwOnFailure(obj);
                                J2();
                                pathParent = this.path.parent();
                                if (pathParent == null) {
                                    throw new IllegalStateException("must have a parent path");
                                }
                                this.fileSystem.createDirectories(pathParent, false);
                                j jVar = this.transactionMutex;
                                okioStorageConnection$writeScope$1.f37642n = this;
                                okioStorageConnection$writeScope$1.f37645t = function2;
                                okioStorageConnection$writeScope$1.f37640O = pathParent;
                                okioStorageConnection$writeScope$1.J2 = jVar;
                                okioStorageConnection$writeScope$1.f37641Z = 1;
                                if (jVar.Z(null, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                                    r7 = this;
                                    r11 = jVar;
                                }
                                return coroutine_suspended;
                            }
                            if (r22 != 1) {
                                if (r22 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                closeable = (Closeable) okioStorageConnection$writeScope$1.J2;
                                Path path = (Path) okioStorageConnection$writeScope$1.f37640O;
                                j jVar2 = (j) okioStorageConnection$writeScope$1.f37645t;
                                OkioStorageConnection okioStorageConnection = (OkioStorageConnection) okioStorageConnection$writeScope$1.f37642n;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    r02 = okioStorageConnection;
                                    r12 = path;
                                    r2 = jVar2;
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        closeable.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r02.fileSystem.exists(r12)) {
                                        r02.fileSystem.atomicMove(r12, r02.path);
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    r2.T(null);
                                    return Unit.INSTANCE;
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
                            j jVar3 = (j) okioStorageConnection$writeScope$1.J2;
                            pathParent = (Path) okioStorageConnection$writeScope$1.f37640O;
                            Function2 function22 = (Function2) okioStorageConnection$writeScope$1.f37645t;
                            OkioStorageConnection okioStorageConnection2 = (OkioStorageConnection) okioStorageConnection$writeScope$1.f37642n;
                            ResultKt.throwOnFailure(obj);
                            r11 = jVar3;
                            function2 = function22;
                            r7 = okioStorageConnection2;
                            okioStorageConnection$writeScope$1.f37642n = r7;
                            okioStorageConnection$writeScope$1.f37645t = r11;
                            okioStorageConnection$writeScope$1.f37640O = Resolve;
                            okioStorageConnection$writeScope$1.J2 = okioWriteScope;
                            okioStorageConnection$writeScope$1.f37641Z = 2;
                            if (function2.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != coroutine_suspended) {
                                r12 = Resolve;
                                closeable = okioWriteScope;
                                r02 = r7;
                                r2 = r11;
                                Unit unit3 = Unit.INSTANCE;
                                closeable.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (Throwable th5) {
                            th = th5;
                            closeable = okioWriteScope;
                            closeable.close();
                            throw th;
                        }
                        r7.fileSystem.delete(Resolve, false);
                        okioWriteScope = new OkioWriteScope(r7.fileSystem, Resolve, r7.serializer);
                    } catch (IOException e2) {
                        e = e2;
                        if (r7.fileSystem.exists(Resolve)) {
                            try {
                                r7.fileSystem.delete(Resolve);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    Resolve = pathParent.resolve(r7.path.name() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r11.T(null);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                r7 = okioStorageConnection$writeScope$1;
                r11 = r22;
                Resolve = coroutine_suspended;
            }
        } catch (Throwable th7) {
            th = th7;
            r11 = r22;
            r11.T(null);
            throw th;
        }
    }
}
