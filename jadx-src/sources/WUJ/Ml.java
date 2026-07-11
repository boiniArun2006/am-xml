package WUJ;

import Dk.CN3;
import Dk.Dsr;
import android.content.Context;
import c8G.Fsz.qwlyMfUJj;
import cB.C1678n;
import com.google.protobuf.g9s;
import java.io.File;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f11513n = new Ml();

    /* JADX INFO: renamed from: WUJ.Ml$Ml, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    /* synthetic */ class C0416Ml extends AdaptedFunctionReference implements Function3, SuspendFunction {
        C0416Ml(Object obj) {
            super(3, obj, Ml.class, "migrateNonBackupPersistentId", "migrateNonBackupPersistentId(Ljava/io/File;Lcom/bendingspoons/concierge/InternalNonBackupPersistentIds;)Lcom/bendingspoons/concierge/InternalNonBackupPersistentIds;", 4);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(File file, Dsr dsr, Continuation continuation) {
            return Ml.qie((Ml) this.receiver, file, dsr, continuation);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    /* synthetic */ class j extends AdaptedFunctionReference implements Function2, SuspendFunction {
        j(Object obj) {
            super(2, obj, Ml.class, "shouldRunBackupPersistentIdMigration", "shouldRunBackupPersistentIdMigration(Lcom/bendingspoons/concierge/InternalBackupPersistentIds;)Z", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CN3 cn3, Continuation continuation) {
            return Ml.xMQ((Ml) this.receiver, cn3, continuation);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    /* synthetic */ class n extends AdaptedFunctionReference implements Function3, SuspendFunction {
        n(Object obj) {
            super(3, obj, Ml.class, "migrateBackupPersistentId", "migrateBackupPersistentId(Lcom/bendingspoons/storage/migration/sharedPreferences/SharedPreferencesView;Lcom/bendingspoons/concierge/InternalBackupPersistentIds;)Lcom/bendingspoons/concierge/InternalBackupPersistentIds;", 4);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1678n c1678n, CN3 cn3, Continuation continuation) {
            return Ml.KN((Ml) this.receiver, c1678n, cn3, continuation);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class w6 extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11514n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11515t;

        w6(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(File file, Dsr dsr, Continuation continuation) {
            w6 w6Var = new w6(continuation);
            w6Var.f11515t = dsr;
            return w6Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11514n == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(Ml.f11513n.r((Dsr) this.f11515t));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File gh(Context context) {
        return new File(context.getNoBackupFilesDir(), "non_backup_persistent_id.txt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(C1678n c1678n, CN3.n nVar) {
        String strRl = c1678n.rl("backup_persistent_id", null);
        if (strRl != null) {
            nVar.xMQ(strRl);
        }
        nVar.mUb(1);
        return Unit.INSTANCE;
    }

    public final Dsr HI(final File fileToBeMigrated, Dsr dsr) {
        Intrinsics.checkNotNullParameter(fileToBeMigrated, "fileToBeMigrated");
        Intrinsics.checkNotNullParameter(dsr, qwlyMfUJj.RXbDMxzR);
        g9s g9sVarN = nKx.j.n(dsr, new Function1() { // from class: WUJ.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.ck(fileToBeMigrated, (Dsr.n) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(g9sVarN, "edit(...)");
        return (Dsr) g9sVarN;
    }

    public final boolean Ik(CN3 datastore) {
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        return !datastore.HI() || datastore.az() < 1;
    }

    public final List Uo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        vBM.w6 w6Var = vBM.w6.f74692n;
        Ml ml = f11513n;
        return CollectionsKt.listOf(w6Var.rl(context, "ConciergeStorageImpl", false, new j(ml), new n(ml)));
    }

    public final CN3 az(final C1678n prefs, CN3 datastore) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        g9s g9sVarN = nKx.j.n(datastore, new Function1() { // from class: WUJ.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.ty(prefs, (CN3.n) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(g9sVarN, "edit(...)");
        return (CN3) g9sVarN;
    }

    public final List mUb(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt.listOf(new vBM.j(new Function0() { // from class: WUJ.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.gh(context);
            }
        }, new w6(null), new C0416Ml(f11513n), false));
    }

    public final boolean r(Dsr datastore) {
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        return !datastore.ty() || datastore.qie() < 1;
    }

    private Ml() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object KN(Ml ml, C1678n c1678n, CN3 cn3, Continuation continuation) {
        return ml.az(c1678n, cn3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(File file, Dsr.n nVar) {
        if (file.exists()) {
            String text = FilesKt.readText(file, Charsets.UTF_8);
            if (!StringsKt.isBlank(text)) {
                nVar.mUb(text);
            }
        }
        nVar.xMQ(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object qie(Ml ml, File file, Dsr dsr, Continuation continuation) {
        return ml.HI(file, dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object xMQ(Ml ml, CN3 cn3, Continuation continuation) {
        return Boxing.boxBoolean(ml.Ik(cn3));
    }
}
