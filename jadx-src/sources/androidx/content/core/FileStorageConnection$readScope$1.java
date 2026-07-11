package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0}, l = {101}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
final class FileStorageConnection$readScope$1<R> extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f37523O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37525o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ FileStorageConnection f37526r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37527t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileStorageConnection$readScope$1(FileStorageConnection fileStorageConnection, Continuation continuation) {
        super(continuation);
        this.f37526r = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f37525o |= Integer.MIN_VALUE;
        return this.f37526r.nr(null, this);
    }
}
