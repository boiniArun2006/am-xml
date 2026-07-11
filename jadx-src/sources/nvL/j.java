package nvL;

import Dk.CN3;
import androidx.content.core.DataStore;
import com.bendingspoons.concierge.domain.entities.CreationType;
import com.bendingspoons.concierge.domain.entities.Id;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nvL.j;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements I3c.n {
    public static final C1074j nr = new C1074j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataStore f71251t;

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71252O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71253n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f71254r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71255t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71252O = obj;
            this.f71254r |= Integer.MIN_VALUE;
            return j.this.rl(null, this);
        }
    }

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71256O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71257n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f71258r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71259t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71256O = obj;
            this.f71258r |= Integer.MIN_VALUE;
            return j.this.n(null, this);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71260n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71260n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.f71251t;
                Dk.CN3 cn3Qie = Dk.CN3.qie();
                this.f71260n = 1;
                obj = nKx.j.rl(dataStore, cn3Qie, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Dk.CN3 cn3 = (Dk.CN3) obj;
            if (cn3.ty()) {
                String strGh = cn3.gh();
                Intrinsics.checkNotNullExpressionValue(strGh, "getBackupPersistentId(...)");
                if (strGh.length() > 0) {
                    String strGh2 = cn3.gh();
                    Intrinsics.checkNotNullExpressionValue(strGh2, "getBackupPersistentId(...)");
                    return new Id.Predefined.Internal.BackupPersistentId(strGh2, CreationType.READ_FROM_FILE);
                }
                return null;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Id.Predefined.Internal.BackupPersistentId f71262O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71263n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Id.Predefined.Internal.BackupPersistentId backupPersistentId, Continuation continuation) {
            super(1, continuation);
            this.f71262O = backupPersistentId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Wre(this.f71262O, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Id.Predefined.Internal.BackupPersistentId backupPersistentId, CN3.n nVar) {
            nVar.xMQ(backupPersistentId.getValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71263n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.f71251t;
                final Id.Predefined.Internal.BackupPersistentId backupPersistentId = this.f71262O;
                Function1 function1 = new Function1() { // from class: nvL.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.Wre.xMQ(backupPersistentId, (CN3.n) obj2);
                    }
                };
                this.f71263n = 1;
                if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nvL.j$j, reason: collision with other inner class name */
    public static final class C1074j {
        public /* synthetic */ C1074j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1074j() {
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71266n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f71267t;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(CN3.n nVar) {
            nVar.xMQ("");
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new w6(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            if (nKx.j.nr(r6, r1, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71267t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.f71266n;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                jVar = j.this;
                DataStore dataStore = jVar.f71251t;
                Dk.CN3 cn3Qie = Dk.CN3.qie();
                this.f71266n = jVar;
                this.f71267t = 1;
                obj = nKx.j.rl(dataStore, cn3Qie, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Dk.CN3 cn3 = (Dk.CN3) obj;
            if (cn3.ty()) {
                String strGh = cn3.gh();
                Intrinsics.checkNotNullExpressionValue(strGh, "getBackupPersistentId(...)");
                if (strGh.length() > 0) {
                    DataStore dataStore2 = jVar.f71251t;
                    Function1 function1 = new Function1() { // from class: nvL.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return j.w6.xMQ((CN3.n) obj2);
                        }
                    };
                    this.f71266n = null;
                    this.f71267t = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Id.Predefined.Internal.j.values().length];
            try {
                iArr[Id.Predefined.Internal.j.f51217O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(DataStore backupPersistentIdDS) {
        Intrinsics.checkNotNullParameter(backupPersistentIdDS, "backupPersistentIdDS");
        this.f71251t = backupPersistentIdDS;
    }

    private final Object J2(Continuation continuation) {
        return QV.j.n(j.w6.J2, j.EnumC1290j.f76381O, new Ml(null), continuation);
    }

    private final Object KN(Id.Predefined.Internal.BackupPersistentId backupPersistentId, Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.f76381O, new Wre(backupPersistentId, null), continuation);
    }

    private final Object O(Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.f76381O, new w6(null), continuation);
    }

    private final zD.j Uo(String str, String str2) {
        String str3 = "id " + str + " not supported by backup persistent storage. Called in " + str2 + ".";
        return new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76388O, str3, new Exception(str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // I3c.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Id.Predefined.Internal.j jVar, Continuation continuation) {
        I28 i28;
        x0X.n nVar;
        j jVar2;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f71258r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f71258r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objJ2 = i28.f71256O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f71258r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            if (n.$EnumSwitchMapping$0[jVar.ordinal()] != 1) {
                nVar = null;
                jVar2 = this;
                return nVar != null ? new n.C1266n(jVar2.Uo(jVar.n(), "DSIdBackupPersistentStorage::getId")) : nVar;
            }
            i28.f71257n = this;
            i28.f71259t = jVar;
            i28.f71258r = 1;
            objJ2 = J2(i28);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (Id.Predefined.Internal.j) i28.f71259t;
            jVar2 = (j) i28.f71257n;
            ResultKt.throwOnFailure(objJ2);
        }
        nVar = (x0X.n) objJ2;
        if (nVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // I3c.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Id.Predefined.Internal internal, Continuation continuation) {
        CN3 cn3;
        x0X.n nVar;
        j jVar;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f71254r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f71254r = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objKN = cn3.f71252O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f71254r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKN);
            if (!(internal instanceof Id.Predefined.Internal.BackupPersistentId)) {
                if (!(internal instanceof Id.Predefined.Internal.AndroidId) && !(internal instanceof Id.Predefined.Internal.NonBackupPersistentId)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar = null;
                jVar = this;
                return nVar != null ? new n.C1266n(jVar.Uo(internal.toString(), "DSIdBackupPersistentStorage::storeId")) : nVar;
            }
            cn3.f71253n = this;
            cn3.f71255t = internal;
            cn3.f71254r = 1;
            objKN = KN((Id.Predefined.Internal.BackupPersistentId) internal, cn3);
            if (objKN == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            internal = (Id.Predefined.Internal) cn3.f71255t;
            jVar = (j) cn3.f71253n;
            ResultKt.throwOnFailure(objKN);
        }
        nVar = (x0X.n) objKN;
        if (nVar != null) {
        }
    }

    @Override // I3c.I28
    public Object t(Id.Predefined.Internal.j jVar, Continuation continuation) {
        return jVar == Id.Predefined.Internal.j.f51217O ? O(continuation) : new n.C1266n(Uo(jVar.n(), "DSIdBackupPersistentStorage::clearId"));
    }
}
