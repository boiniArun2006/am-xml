package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", i = {0}, l = {201}, m = "writeData", n = {"stream"}, s = {"L$1"})
final class FileWriteScope$writeData$1 extends ContinuationImpl {
    final /* synthetic */ FileWriteScope J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37534O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37535n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37536r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37537t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileWriteScope$writeData$1(FileWriteScope fileWriteScope, Continuation continuation) {
        super(continuation);
        this.J2 = fileWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37534O = obj;
        this.f37536r |= Integer.MIN_VALUE;
        return this.J2.n(null, this);
    }
}
