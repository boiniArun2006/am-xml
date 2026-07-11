package uN;

import GJW.OU;
import GJW.vd;
import HX.Dsr;
import com.bendingspoons.concierge.domain.entities.CreationType;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class I28 implements Dsr {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f74344O;
    private final Function0 nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f74345t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28 f74346O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74347n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Id.Predefined.Internal.j f74348t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Id.Predefined.Internal.j.values().length];
                try {
                    iArr[Id.Predefined.Internal.j.f51220t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Id.Predefined.Internal.j.f51217O.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Id.Predefined.Internal.j.J2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Id.Predefined.Internal.j jVar, I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f74348t = jVar;
            this.f74346O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f74348t, this.f74346O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f74347n == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = j.$EnumSwitchMapping$0[this.f74348t.ordinal()];
                if (i2 == 1) {
                    return this.f74346O.KN();
                }
                if (i2 == 2) {
                    return this.f74346O.mUb();
                }
                if (i2 == 3) {
                    return this.f74346O.qie();
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public I28(Map mockedIds, String appPackage, Function0 getSSAID, Function0 getRandomId) {
        Intrinsics.checkNotNullParameter(mockedIds, "mockedIds");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(getSSAID, "getSSAID");
        Intrinsics.checkNotNullParameter(getRandomId, "getRandomId");
        this.rl = mockedIds;
        this.f74345t = appPackage;
        this.nr = getSSAID;
        this.f74344O = getRandomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n KN() {
        x0X.n nVarN = x0X.w6.n(new Function0() { // from class: uN.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.xMQ(this.f74361n);
            }
        });
        if (nVarN instanceof n.C1266n) {
            nVarN = new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76392r, "Unable to retrieve the android id.", (Throwable) ((n.C1266n) nVarN).n()));
        } else if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (nVarN instanceof n.C1266n) {
            return nVarN;
        }
        if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((n.w6) nVarN).n();
        return str == null ? new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76392r, "Unable to retrieve the android id.", new Throwable("Unable to retrieve the android id."))) : new n.w6(new Id.Predefined.Internal.AndroidId(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Id.Predefined.Internal.NonBackupPersistentId az(I28 i28) {
        String str = (String) i28.rl.get(Id.Predefined.Internal.j.J2);
        if (str == null) {
            str = (String) i28.f74344O.invoke();
        }
        return new Id.Predefined.Internal.NonBackupPersistentId(str, CreationType.JUST_GENERATED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Id.Predefined.Internal.BackupPersistentId gh(I28 i28) {
        return new Id.Predefined.Internal.BackupPersistentId((String) i28.f74344O.invoke(), CreationType.JUST_GENERATED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n qie() {
        x0X.n nVarN = x0X.w6.n(new Function0() { // from class: uN.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.az(this.f74349n);
            }
        });
        if (nVarN instanceof n.C1266n) {
            return new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76392r, "Unable to retrieve the random id for the non backup persistent id.", (Throwable) ((n.C1266n) nVarN).n()));
        }
        if (nVarN instanceof n.w6) {
            return nVarN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(I28 i28) {
        String str = (String) i28.rl.get(Id.Predefined.Internal.j.f51220t);
        return str == null ? (String) i28.nr.invoke() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n mUb() {
        x0X.n nVarKN = KN();
        if (!(nVarKN instanceof n.C1266n)) {
            if (nVarKN instanceof n.w6) {
                Id.Predefined.Internal.AndroidId androidId = (Id.Predefined.Internal.AndroidId) ((n.w6) nVarKN).n();
                String str = (String) this.rl.get(Id.Predefined.Internal.j.f51217O);
                if (str == null) {
                    str = androidId.getValue() + "_" + this.f74345t;
                }
                return new n.w6(new Id.Predefined.Internal.BackupPersistentId(str, CreationType.JUST_GENERATED));
            }
            throw new NoWhenBranchMatchedException();
        }
        x0X.n nVarN = x0X.w6.n(new Function0() { // from class: uN.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.gh(this.f74360n);
            }
        });
        if (nVarN instanceof n.C1266n) {
            return new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76392r, "Unable to retrieve the random id for the backup persistent id.", (Throwable) ((n.C1266n) nVarN).n()));
        }
        if (nVarN instanceof n.w6) {
            return nVarN;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // HX.Dsr
    public Object n(Id.Predefined.Internal.j jVar, Continuation continuation) {
        return GJW.Dsr.Uo(OU.n(), new n(jVar, this, null), continuation);
    }
}
