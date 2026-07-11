package vBM;

import androidx.content.core.DataMigration;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements DataMigration {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f74687n;
    private final boolean nr;
    private final Function3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function3 f74688t;

    public j(Function0 getFile, Function3 shouldMigrate, Function3 migrate, boolean z2) {
        Intrinsics.checkNotNullParameter(getFile, "getFile");
        Intrinsics.checkNotNullParameter(shouldMigrate, "shouldMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        this.f74687n = getFile;
        this.rl = shouldMigrate;
        this.f74688t = migrate;
        this.nr = z2;
    }

    @Override // androidx.content.core.DataMigration
    public Object n(Object obj, Continuation continuation) {
        return this.rl.invoke(this.f74687n.invoke(), obj, continuation);
    }

    @Override // androidx.content.core.DataMigration
    public Object rl(Continuation continuation) {
        if (this.nr) {
            File file = (File) this.f74687n.invoke();
            if (file.exists()) {
                file.delete();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.content.core.DataMigration
    public Object t(Object obj, Continuation continuation) {
        return this.f74688t.invoke(this.f74687n.invoke(), obj, continuation);
    }
}
