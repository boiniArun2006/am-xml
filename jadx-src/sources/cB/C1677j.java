package cB;

import android.content.SharedPreferences;
import androidx.content.core.DataMigration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cB.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1677j implements DataMigration {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f43569n;
    private final Function3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f43570t;

    public C1677j(Function0 produceSharedPreferences, Function2 shouldRunMigration, Function3 migrate) {
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        this.f43569n = shouldRunMigration;
        this.rl = migrate;
        this.f43570t = LazyKt.lazy(produceSharedPreferences);
    }

    private final SharedPreferences nr() {
        return (SharedPreferences) this.f43570t.getValue();
    }

    @Override // androidx.content.core.DataMigration
    public Object n(Object obj, Continuation continuation) {
        return this.f43569n.invoke(obj, continuation);
    }

    @Override // androidx.content.core.DataMigration
    public Object rl(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // androidx.content.core.DataMigration
    public Object t(Object obj, Continuation continuation) {
        return this.rl.invoke(new C1678n(nr(), null, 2, null), obj, continuation);
    }
}
