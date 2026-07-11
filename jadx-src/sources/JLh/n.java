package JLh;

import com.bendingspoons.concierge.domain.entities.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements Fqb.n {
    public static final j nr = new j(null);
    private final I3c.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I3c.Ml f4467t;

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f4468O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4469n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4470r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4471t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4468O = obj;
            this.f4470r |= Integer.MIN_VALUE;
            return n.this.rl(null, this);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f4472O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4473n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4474r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4475t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4472O = obj;
            this.f4474r |= Integer.MIN_VALUE;
            return n.this.n(null, this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f4476O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f4477Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4478n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4480r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4481t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4480r = obj;
            this.f4477Z |= Integer.MIN_VALUE;
            return n.this.t(this);
        }
    }

    /* JADX INFO: renamed from: JLh.n$n, reason: collision with other inner class name */
    public /* synthetic */ class C0155n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Id.Predefined.Internal.j.values().length];
            try {
                iArr[Id.Predefined.Internal.j.f51217O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Id.Predefined.Internal.j.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Id.Predefined.Internal.j.f51220t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[zD.n.values().length];
            try {
                iArr2[zD.n.f76401n.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[zD.n.f76403t.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[zD.n.f76400O.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public n(I3c.n backupPersistentStorage, I3c.Ml nonBackupPersistentStorage) {
        Intrinsics.checkNotNullParameter(backupPersistentStorage, "backupPersistentStorage");
        Intrinsics.checkNotNullParameter(nonBackupPersistentStorage, "nonBackupPersistentStorage");
        this.rl = backupPersistentStorage;
        this.f4467t = nonBackupPersistentStorage;
    }

    private final zD.j nr(String str, String str2) {
        String str3 = "id " + str + " not supported by the repository. Called in " + str2 + ".";
        return new zD.j(j.w6.f76395O, j.EnumC1290j.f76381O, j.n.f76388O, str3, new Exception(str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Fqb.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Id.Predefined.Internal.j jVar, Continuation continuation) {
        Ml ml;
        n nVar;
        x0X.n nVar2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f4474r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f4474r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objN = ml.f4472O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f4474r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            int i5 = C0155n.$EnumSwitchMapping$0[jVar.ordinal()];
            if (i5 == 1) {
                I3c.n nVar3 = this.rl;
                ml.f4473n = this;
                ml.f4475t = jVar;
                ml.f4474r = 1;
                objN = nVar3.n(jVar, ml);
                if (objN != coroutine_suspended) {
                    nVar = this;
                    nVar2 = (x0X.n) objN;
                }
            } else if (i5 == 2) {
                I3c.Ml ml2 = this.f4467t;
                ml.f4473n = this;
                ml.f4475t = jVar;
                ml.f4474r = 2;
                objN = ml2.n(jVar, ml);
                if (objN != coroutine_suspended) {
                    nVar = this;
                    nVar2 = (x0X.n) objN;
                }
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar2 = null;
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            jVar = (Id.Predefined.Internal.j) ml.f4475t;
            nVar = (n) ml.f4473n;
            ResultKt.throwOnFailure(objN);
            nVar2 = (x0X.n) objN;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (Id.Predefined.Internal.j) ml.f4475t;
            nVar = (n) ml.f4473n;
            ResultKt.throwOnFailure(objN);
            nVar2 = (x0X.n) objN;
        }
        return nVar2 == null ? new n.C1266n(nVar.nr(jVar.n(), "DSIdRepositoryImpl::getId")) : nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Fqb.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Id.Predefined.Internal internal, Continuation continuation) {
        I28 i28;
        x0X.n nVar;
        n nVar2;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f4470r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f4470r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objRl = i28.f4468O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f4470r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            if (internal instanceof Id.Predefined.Internal.BackupPersistentId) {
                I3c.n nVar3 = this.rl;
                i28.f4469n = this;
                i28.f4471t = internal;
                i28.f4470r = 1;
                objRl = nVar3.rl(internal, i28);
                if (objRl != coroutine_suspended) {
                    nVar2 = this;
                    nVar = (x0X.n) objRl;
                }
            } else if (internal instanceof Id.Predefined.Internal.NonBackupPersistentId) {
                I3c.Ml ml = this.f4467t;
                i28.f4469n = this;
                i28.f4471t = internal;
                i28.f4470r = 2;
                objRl = ml.rl(internal, i28);
                if (objRl != coroutine_suspended) {
                    nVar2 = this;
                    nVar = (x0X.n) objRl;
                }
            } else {
                if (!(internal instanceof Id.Predefined.Internal.AndroidId)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar = null;
                nVar2 = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            internal = (Id.Predefined.Internal) i28.f4471t;
            nVar2 = (n) i28.f4469n;
            ResultKt.throwOnFailure(objRl);
            nVar = (x0X.n) objRl;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            internal = (Id.Predefined.Internal) i28.f4471t;
            nVar2 = (n) i28.f4469n;
            ResultKt.throwOnFailure(objRl);
            nVar = (x0X.n) objRl;
        }
        return nVar == null ? new n.C1266n(nVar2.nr(internal.toString(), "DSIdRepositoryImpl::storeId")) : nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b4 -> B:43:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00df -> B:37:0x00e0). Please report as a decompilation issue!!! */
    @Override // Fqb.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        w6 w6Var;
        n nVar;
        Iterator it;
        Collection collection;
        Collection collection2;
        x0X.n c1266n;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f4477Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f4477Z = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objT = w6Var.f4480r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f4477Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            Set setRl = ujA.w6.rl();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setRl) {
                if (ujA.w6.nr((Id.Predefined.Internal.j) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            nVar = this;
            it = arrayList.iterator();
            collection = arrayList2;
            if (!it.hasNext()) {
            }
        } else if (i3 == 1) {
            collection = (Collection) w6Var.J2;
            it = (Iterator) w6Var.f4476O;
            collection2 = (Collection) w6Var.f4481t;
            nVar = (n) w6Var.f4478n;
            ResultKt.throwOnFailure(objT);
            c1266n = (x0X.n) objT;
            collection.add(c1266n);
            collection = collection2;
            if (!it.hasNext()) {
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) w6Var.J2;
            it = (Iterator) w6Var.f4476O;
            collection2 = (Collection) w6Var.f4481t;
            nVar = (n) w6Var.f4478n;
            ResultKt.throwOnFailure(objT);
            c1266n = (x0X.n) objT;
            collection.add(c1266n);
            collection = collection2;
            if (!it.hasNext()) {
                Id.Predefined.Internal.j jVar = (Id.Predefined.Internal.j) it.next();
                int i5 = C0155n.$EnumSwitchMapping$1[ujA.w6.t(jVar).ordinal()];
                if (i5 == 1) {
                    I3c.n nVar2 = nVar.rl;
                    w6Var.f4478n = nVar;
                    w6Var.f4481t = collection;
                    w6Var.f4476O = it;
                    w6Var.J2 = collection;
                    w6Var.f4477Z = 1;
                    Object objT2 = nVar2.t(jVar, w6Var);
                    if (objT2 != coroutine_suspended) {
                        collection2 = collection;
                        c1266n = (x0X.n) objT2;
                        collection.add(c1266n);
                        collection = collection2;
                    }
                    return coroutine_suspended;
                }
                if (i5 == 2) {
                    I3c.Ml ml = nVar.f4467t;
                    w6Var.f4478n = nVar;
                    w6Var.f4481t = collection;
                    w6Var.f4476O = it;
                    w6Var.J2 = collection;
                    w6Var.f4477Z = 2;
                    objT = ml.t(jVar, w6Var);
                    if (objT != coroutine_suspended) {
                        collection2 = collection;
                        c1266n = (x0X.n) objT;
                        collection.add(c1266n);
                        collection = collection2;
                    }
                    return coroutine_suspended;
                }
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c1266n = new n.C1266n(nVar.nr(jVar.toString(), "DSIdRepositoryImpl::clearIds"));
                collection2 = collection;
                collection.add(c1266n);
                collection = collection2;
                if (!it.hasNext()) {
                    return x0X.w6.t((List) collection);
                }
            }
        }
    }
}
