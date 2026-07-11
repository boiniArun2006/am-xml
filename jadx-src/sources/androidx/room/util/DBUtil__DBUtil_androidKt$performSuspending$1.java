package androidx.room.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {1, 1, 1, 1}, l = {249, 251, 251}, m = "performSuspending", n = {"db", "block", "isReadOnly", "inTransaction"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends ContinuationImpl {
    boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f41832O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41834o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f41835r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41836t;

    DBUtil__DBUtil_androidKt$performSuspending$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41835r = obj;
        this.f41834o |= Integer.MIN_VALUE;
        return DBUtil.O(null, false, false, null, this);
    }
}
