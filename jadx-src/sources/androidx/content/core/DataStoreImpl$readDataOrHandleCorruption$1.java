package androidx.content.core;

import androidx.media3.exoplayer.RendererCapabilities;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {365, 366, 368, 369, 380, RendererCapabilities.DECODER_SUPPORT_MASK}, m = "readDataOrHandleCorruption", n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", NodeModuleProcess.PROPERTY_VERSION}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
final class DataStoreImpl$readDataOrHandleCorruption$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37464O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37465S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f37466Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f37467g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37469o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f37470r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37471t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.f37465S = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37466Z = obj;
        this.f37467g |= Integer.MIN_VALUE;
        return this.f37465S.ViF(false, this);
    }
}
