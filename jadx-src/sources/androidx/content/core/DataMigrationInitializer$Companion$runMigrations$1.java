package androidx.content.core;

import androidx.content.core.DataMigrationInitializer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    final /* synthetic */ DataMigrationInitializer.Companion J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37375O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37376n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37377r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37378t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, Continuation continuation) {
        super(continuation);
        this.J2 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37375O = obj;
        this.f37377r |= Integer.MIN_VALUE;
        return this.J2.t(null, null, this);
    }
}
