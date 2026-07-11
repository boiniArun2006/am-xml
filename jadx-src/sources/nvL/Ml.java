package nvL;

import Dk.Dsr;
import androidx.content.core.DataStore;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.bendingspoons.concierge.domain.entities.CreationType;
import com.bendingspoons.concierge.domain.entities.Id;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
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
import nvL.Ml;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements I3c.Ml {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataStore f71237t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71238O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71239n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f71240r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71241t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71238O = obj;
            this.f71240r |= Integer.MIN_VALUE;
            return Ml.this.rl(null, this);
        }
    }

    /* JADX INFO: renamed from: nvL.Ml$Ml, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class C1073Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Id.Predefined.Internal.NonBackupPersistentId f71242O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71243n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1073Ml(Id.Predefined.Internal.NonBackupPersistentId nonBackupPersistentId, Continuation continuation) {
            super(1, continuation);
            this.f71242O = nonBackupPersistentId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Ml.this.new C1073Ml(this.f71242O, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Id.Predefined.Internal.NonBackupPersistentId nonBackupPersistentId, Dsr.n nVar) {
            nVar.mUb(nonBackupPersistentId.getValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C1073Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71243n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = Ml.this.f71237t;
                final Id.Predefined.Internal.NonBackupPersistentId nonBackupPersistentId = this.f71242O;
                Function1 function1 = new Function1() { // from class: nvL.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Ml.C1073Ml.xMQ(nonBackupPersistentId, (Dsr.n) obj2);
                    }
                };
                this.f71243n = 1;
                if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71246n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f71247t;

        n(Continuation continuation) {
            super(1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Dsr.n nVar) {
            nVar.mUb("");
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Ml.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (nKx.j.nr(r6, r1, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ml ml;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71247t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ml = (Ml) this.f71246n;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                ml = Ml.this;
                DataStore dataStore = ml.f71237t;
                Dsr dsrGh = Dsr.gh();
                this.f71246n = ml;
                this.f71247t = 1;
                obj = nKx.j.rl(dataStore, dsrGh, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Dsr dsr = (Dsr) obj;
            if (dsr.HI()) {
                String strAz = dsr.az();
                Intrinsics.checkNotNullExpressionValue(strAz, YmsTEL.JoOocIAJZxPpK);
                if (strAz.length() > 0) {
                    DataStore dataStore2 = ml.f71237t;
                    Function1 function1 = new Function1() { // from class: nvL.I28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Ml.n.xMQ((Dsr.n) obj2);
                        }
                    };
                    this.f71246n = null;
                    this.f71247t = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71248n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Ml.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71248n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = Ml.this.f71237t;
                Dsr dsrGh = Dsr.gh();
                this.f71248n = 1;
                obj = nKx.j.rl(dataStore, dsrGh, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Dsr dsr = (Dsr) obj;
            if (dsr.HI()) {
                String strAz = dsr.az();
                Intrinsics.checkNotNullExpressionValue(strAz, "getNonBackupPersistentId(...)");
                if (strAz.length() > 0) {
                    String strAz2 = dsr.az();
                    Intrinsics.checkNotNullExpressionValue(strAz2, "getNonBackupPersistentId(...)");
                    return new Id.Predefined.Internal.NonBackupPersistentId(strAz2, CreationType.READ_FROM_FILE);
                }
                return null;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Ml(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, qfEYuUHwj.bfbcNsleOzOfzpt);
        this.f71237t = dataStore;
    }

    private final zD.j J2(String str, String str2) {
        String str3 = "id " + str + " not supported by NON backup persistent storage. Called at " + str2 + ".";
        return new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76388O, str3, new Exception(str3));
    }

    private final Object KN(Id.Predefined.Internal.NonBackupPersistentId nonBackupPersistentId, Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.f76381O, new C1073Ml(nonBackupPersistentId, null), continuation);
    }

    private final Object O(Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.f76381O, new n(null), continuation);
    }

    private final Object Uo(Continuation continuation) {
        return QV.j.n(j.w6.J2, j.EnumC1290j.f76381O, new w6(null), continuation);
    }

    @Override // I3c.I28
    public Object n(Id.Predefined.Internal.j jVar, Continuation continuation) {
        if (jVar != Id.Predefined.Internal.j.J2) {
            return new n.C1266n(J2(jVar.n(), "DSIdNonBackupPersistentStorage::getId"));
        }
        Object objUo = Uo(continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : (x0X.n) objUo;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // I3c.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Id.Predefined.Internal internal, Continuation continuation) {
        I28 i28;
        x0X.n nVar;
        Ml ml;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f71240r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f71240r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objKN = i28.f71238O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f71240r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKN);
            if (!(internal instanceof Id.Predefined.Internal.NonBackupPersistentId)) {
                if (!(internal instanceof Id.Predefined.Internal.BackupPersistentId) && !(internal instanceof Id.Predefined.Internal.AndroidId)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar = null;
                ml = this;
                return nVar != null ? new n.C1266n(ml.J2(internal.toString(), "DSIdNonBackupPersistentStorage::storeId")) : nVar;
            }
            i28.f71239n = this;
            i28.f71241t = internal;
            i28.f71240r = 1;
            objKN = KN((Id.Predefined.Internal.NonBackupPersistentId) internal, i28);
            if (objKN == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            internal = (Id.Predefined.Internal) i28.f71241t;
            ml = (Ml) i28.f71239n;
            ResultKt.throwOnFailure(objKN);
        }
        nVar = (x0X.n) objKN;
        if (nVar != null) {
        }
    }

    @Override // I3c.I28
    public Object t(Id.Predefined.Internal.j jVar, Continuation continuation) {
        return jVar == Id.Predefined.Internal.j.J2 ? O(continuation) : new n.C1266n(J2(jVar.n(), "DSIdNonBackupPersistentStorage::clearId"));
    }
}
