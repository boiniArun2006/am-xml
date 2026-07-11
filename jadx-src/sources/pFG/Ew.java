package pFG;

import TFv.Lu;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.InitializerViewModelFactoryBuilder;
import com.bendingspoons.networking.NetworkError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import ktm.j;
import pFG.DAz;
import pFG.Ew;
import pFG.Z;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ew extends ViewModel {
    private final TFv.SPz J2;
    private final TFv.SPz KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TFv.SPz f71721O;
    private final TFv.SPz Uo;
    private final TFv.Wre gh;
    private final ILs.CN3 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xWk.j f71722n;
    private final TFv.SPz nr;
    private final S3.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TFv.SPz f71723t;
    private final TFv.rv6 xMQ;
    public static final n qie = new n(null);
    public static final int az = 8;

    static final class CN3 extends SuspendLambda implements Function8 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71724O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f71725S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f71726Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71728n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ boolean f71729o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f71730r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71731t;

        public static final class j implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                j.n nVarJ2 = ((ktm.j) obj).J2();
                Integer numValueOf = nVarJ2 != null ? Integer.valueOf(nVarJ2.rl()) : null;
                j.n nVarJ22 = ((ktm.j) obj2).J2();
                return ComparisonsKt.compareValues(numValueOf, nVarJ22 != null ? Integer.valueOf(nVarJ22.rl()) : null);
            }
        }

        public static final class n implements Comparator {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f71732n;

            public n(String str) {
                this.f71732n = str;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((ktm.j) obj2).t(), this.f71732n)), Boolean.valueOf(Intrinsics.areEqual(((ktm.j) obj).t(), this.f71732n)));
            }
        }

        @Override // kotlin.jvm.functions.Function8
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            return n((x0X.n) obj, (x0X.n) obj2, (Map) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (String) obj6, (String) obj7, (Continuation) obj8);
        }

        CN3(Continuation continuation) {
            super(8, continuation);
        }

        public final Object n(x0X.n nVar, x0X.n nVar2, Map map, boolean z2, boolean z3, String str, String str2, Continuation continuation) {
            CN3 cn3 = Ew.this.new CN3(continuation);
            cn3.f71731t = nVar;
            cn3.f71724O = nVar2;
            cn3.J2 = map;
            cn3.f71730r = z2;
            cn3.f71729o = z3;
            cn3.f71726Z = str;
            cn3.f71725S = str2;
            return cn3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f71728n == 0) {
                ResultKt.throwOnFailure(obj);
                x0X.n nVar = (x0X.n) this.f71731t;
                x0X.n nVar2 = (x0X.n) this.f71724O;
                Map map = (Map) this.J2;
                boolean z2 = this.f71730r;
                boolean z3 = this.f71729o;
                String str = (String) this.f71726Z;
                String str2 = (String) this.f71725S;
                if (z2) {
                    nVar = nVar2;
                }
                if (nVar == null) {
                    return Z.w6.f71777n;
                }
                Ew ew = Ew.this;
                if (nVar instanceof n.C1266n) {
                    return new Z.n(com.bendingspoons.networking.j.n((NetworkError) ((n.C1266n) nVar).n()));
                }
                if (nVar instanceof n.w6) {
                    List list = (List) ((n.w6) nVar).n();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(u.J2((ktm.j) it.next(), map));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        ktm.j jVar = (ktm.j) obj2;
                        if (str.length() == 0 || u.KN(jVar, str)) {
                            if (!z3 || u.Uo(jVar)) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    List<ktm.j> listSortedWith = CollectionsKt.sortedWith(CollectionsKt.sortedWith(arrayList2, new j()), new n(str2));
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                    for (ktm.j jVar2 : listSortedWith) {
                        arrayList3.add(ew.Z(jVar2, Intrinsics.areEqual(jVar2.t(), str2)));
                    }
                    return new Z.j(arrayList3, z2, z3, str);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ew f71733O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71734n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ pFG.CN3 f71735t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(pFG.CN3 cn3, Ew ew, Continuation continuation) {
            super(2, continuation);
            this.f71735t = cn3;
            this.f71733O = ew;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f71735t, this.f71733O, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5.rl(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r5.t(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71734n;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f71735t.Uo()) {
                    S3.w6 w6Var = this.f71733O.rl;
                    this.f71734n = 1;
                } else {
                    S3.w6 w6Var2 = this.f71733O.rl;
                    String strRl = this.f71735t.rl();
                    this.f71734n = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71736n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ew.this.new Ml(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (r5.Ik(r4) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r5.gh(r4) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71736n;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Collection collectionValues = ((Map) Ew.this.f71721O.getValue()).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((j.C1041j) it.next()) == null) {
                            Ew ew = Ew.this;
                            this.f71736n = 1;
                        }
                    }
                }
                Ew ew2 = Ew.this;
                this.f71736n = 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71738O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71739n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f71740r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71741t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71738O = obj;
            this.f71740r |= Integer.MIN_VALUE;
            return Ew.this.Ik(this);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71742n;

        /* JADX INFO: renamed from: pFG.Ew$j$j, reason: collision with other inner class name */
        static final class C1095j extends SuspendLambda implements Function2 {
            final /* synthetic */ Ew J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ boolean f71744O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f71745n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f71746t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1095j(Ew ew, Continuation continuation) {
                super(2, continuation);
                this.J2 = ew;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C1095j c1095j = new C1095j(this.J2, continuation);
                c1095j.f71744O = ((Boolean) obj).booleanValue();
                return c1095j;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                TFv.SPz sPz;
                TFv.SPz sPz2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f71746t;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            sPz = (TFv.SPz) this.f71745n;
                            ResultKt.throwOnFailure(obj);
                            sPz.setValue(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sPz2 = (TFv.SPz) this.f71745n;
                        ResultKt.throwOnFailure(obj);
                        sPz2.setValue(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (this.f71744O) {
                        if (this.J2.nr.getValue() == null) {
                            TFv.SPz sPz3 = this.J2.nr;
                            xWk.j jVar = this.J2.f71722n;
                            this.f71745n = sPz3;
                            this.f71746t = 1;
                            Object objN = jVar.n(true, this);
                            if (objN != coroutine_suspended) {
                                sPz2 = sPz3;
                                obj = objN;
                                sPz2.setValue(obj);
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    } else if (this.J2.f71723t.getValue() == null) {
                        TFv.SPz sPz4 = this.J2.f71723t;
                        xWk.j jVar2 = this.J2.f71722n;
                        this.f71745n = sPz4;
                        this.f71746t = 2;
                        Object objN2 = jVar2.n(false, this);
                        if (objN2 != coroutine_suspended) {
                            sPz = sPz4;
                            obj = objN2;
                            sPz.setValue(obj);
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            public final Object n(boolean z2, Continuation continuation) {
                return ((C1095j) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ew.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71742n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.SPz sPz = Ew.this.J2;
                C1095j c1095j = new C1095j(Ew.this, null);
                this.f71742n = 1;
                if (TFv.fuX.gh(sPz, c1095j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ew t(xWk.j jVar, S3.w6 w6Var, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new Ew(jVar, w6Var);
        }

        public final ViewModelProvider.Factory rl(final xWk.j experimentsUseCase, final S3.w6 favouriteExperimentRepository) {
            Intrinsics.checkNotNullParameter(experimentsUseCase, "experimentsUseCase");
            Intrinsics.checkNotNullParameter(favouriteExperimentRepository, "favouriteExperimentRepository");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.n(Reflection.getOrCreateKotlinClass(Ew.class), new Function1() { // from class: pFG.nKK
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ew.n.t(experimentsUseCase, favouriteExperimentRepository, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.rl();
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71748n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71749t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71749t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ew.this.gh(this);
        }
    }

    public Ew(xWk.j experimentsUseCase, S3.w6 favouriteExperimentRepository) {
        Intrinsics.checkNotNullParameter(experimentsUseCase, "experimentsUseCase");
        Intrinsics.checkNotNullParameter(favouriteExperimentRepository, "favouriteExperimentRepository");
        this.f71722n = experimentsUseCase;
        this.rl = favouriteExperimentRepository;
        TFv.SPz sPzN = Lu.n(null);
        this.f71723t = sPzN;
        TFv.SPz sPzN2 = Lu.n(null);
        this.nr = sPzN2;
        TFv.SPz sPzN3 = Lu.n(MapsKt.emptyMap());
        this.f71721O = sPzN3;
        Boolean bool = Boolean.FALSE;
        TFv.SPz sPzN4 = Lu.n(bool);
        this.J2 = sPzN4;
        TFv.SPz sPzN5 = Lu.n(bool);
        this.Uo = sPzN5;
        TFv.SPz sPzN6 = Lu.n("");
        this.KN = sPzN6;
        this.xMQ = TFv.fuX.Xw(u.O(sPzN, sPzN2, sPzN3, sPzN4, sPzN5, sPzN6, favouriteExperimentRepository.n(), new CN3(null)), ViewModelKt.n(this), TFv.Ln.f10289n.nr(), Z.w6.f71777n);
        ILs.CN3 cn3Rl = ILs.aC.rl(10, ILs.j.f4187t, null, 4, null);
        this.mUb = cn3Rl;
        this.gh = TFv.fuX.bzg(cn3Rl);
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ik(Continuation continuation) {
        Wre wre;
        Ew ew;
        Map mutableMap;
        Ew ew2;
        boolean z2;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f71740r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f71740r = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objN = wre.f71738O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f71740r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            xWk.j jVar = this.f71722n;
            wre.f71739n = this;
            wre.f71740r = 1;
            objN = jVar.n(true, wre);
            if (objN != coroutine_suspended) {
                ew = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ew2 = (Ew) wre.f71739n;
                ResultKt.throwOnFailure(objN);
                x0X.n nVar = (x0X.n) objN;
                z2 = nVar instanceof n.C1266n;
                if (!z2) {
                    if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ew2.mUb.nr(DAz.n.f71712n);
                }
                if (!z2) {
                    ew2.mUb.nr(new DAz.j(com.bendingspoons.networking.j.n((NetworkError) ((n.C1266n) nVar).n())));
                } else if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                new n.w6(nVar);
                return Unit.INSTANCE;
            }
            Map map = (Map) wre.f71741t;
            Ew ew3 = (Ew) wre.f71739n;
            ResultKt.throwOnFailure(objN);
            mutableMap = map;
            ew = ew3;
            xWk.j jVar2 = ew.f71722n;
            wre.f71739n = ew;
            wre.f71741t = null;
            wre.f71740r = 3;
            objN = jVar2.t(mutableMap, wre);
            if (objN != coroutine_suspended) {
                ew2 = ew;
                x0X.n nVar2 = (x0X.n) objN;
                z2 = nVar2 instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
                new n.w6(nVar2);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        ew = (Ew) wre.f71739n;
        ResultKt.throwOnFailure(objN);
        x0X.n nVar3 = (x0X.n) objN;
        if (!(nVar3 instanceof n.C1266n)) {
            if (!(nVar3 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((n.w6) nVar3).n();
            ArrayList<ktm.j> arrayList = new ArrayList();
            for (Object obj : list) {
                if (u.Uo((ktm.j) obj)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (ktm.j jVar3 : arrayList) {
                String strT = jVar3.t();
                j.C1041j c1041jNr = jVar3.nr();
                Intrinsics.checkNotNull(c1041jNr);
                Pair pair = TuplesKt.to(strT, Boxing.boxInt(c1041jNr.n()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            mutableMap = MapsKt.toMutableMap(linkedHashMap);
            for (Map.Entry entry : ((Map) ew.f71721O.getValue()).entrySet()) {
                j.C1041j c1041j = (j.C1041j) entry.getValue();
                if (c1041j == null) {
                    mutableMap.remove(entry.getKey());
                } else {
                    mutableMap.put(entry.getKey(), Boxing.boxInt(c1041j.n()));
                }
            }
            xWk.j jVar4 = ew.f71722n;
            wre.f71739n = ew;
            wre.f71741t = mutableMap;
            wre.f71740r = 2;
            if (jVar4.rl(wre) != coroutine_suspended) {
                xWk.j jVar22 = ew.f71722n;
                wre.f71739n = ew;
                wre.f71741t = null;
                wre.f71740r = 3;
                objN = jVar22.t(mutableMap, wre);
                if (objN != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(Continuation continuation) {
        w6 w6Var;
        Ew ew;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objT = w6Var.f71749t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            xWk.j jVar = this.f71722n;
            Map map = (Map) this.f71721O.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Intrinsics.checkNotNull(value);
                linkedHashMap.put(key, Boxing.boxInt(((j.C1041j) value).n()));
            }
            w6Var.f71748n = this;
            w6Var.J2 = 1;
            objT = jVar.t(linkedHashMap, w6Var);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            ew = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ew = (Ew) w6Var.f71748n;
            ResultKt.throwOnFailure(objT);
        }
        x0X.n nVar = (x0X.n) objT;
        boolean z2 = nVar instanceof n.C1266n;
        if (!z2) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            ew.mUb.nr(DAz.n.f71712n);
        }
        if (z2) {
            ew.mUb.nr(new DAz.j(com.bendingspoons.networking.j.n((NetworkError) ((n.C1266n) nVar).n())));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public final void HI(pFG.CN3 experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        GJW.C.nr(ViewModelKt.n(this), null, null, new I28(experiment, this, null), 3, null);
    }

    public final void XQ(String name, j.C1041j c1041j) {
        List list;
        ktm.j jVar;
        List listO;
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        x0X.n nVar = (x0X.n) this.nr.getValue();
        Object obj = null;
        if (nVar == null || (list = (List) x0X.w6.nr(nVar)) == null) {
            x0X.n nVar2 = (x0X.n) this.f71723t.getValue();
            list = nVar2 != null ? (List) x0X.w6.nr(nVar2) : null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.areEqual(((ktm.j) next).t(), name)) {
                        break;
                    }
                }
            }
            jVar = (ktm.j) next;
        } else {
            jVar = null;
        }
        if (jVar != null && (listO = jVar.O()) != null) {
            Iterator it2 = listO.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.areEqual((j.C1041j) next2, c1041j)) {
                    obj = next2;
                    break;
                }
            }
            obj = (j.C1041j) obj;
        }
        TFv.SPz sPz = this.f71721O;
        sPz.setValue(MapsKt.plus((Map) sPz.getValue(), MapsKt.mapOf(TuplesKt.to(name, obj))));
    }

    public final TFv.Wre az() {
        return this.gh;
    }

    public final void ck(String newSearch) {
        Intrinsics.checkNotNullParameter(newSearch, "newSearch");
        this.KN.setValue(newSearch);
    }

    public final void o(boolean z2) {
        this.J2.setValue(Boolean.valueOf(z2));
    }

    public final void qie() {
        if (((Map) this.f71721O.getValue()).isEmpty()) {
            ILs.C.rl(this.mUb.nr(new DAz.j("No segments were updated.")));
        } else {
            GJW.C.nr(ViewModelKt.n(this), null, null, new Ml(null), 3, null);
        }
    }

    public final void r(boolean z2) {
        this.Uo.setValue(Boolean.valueOf(z2));
    }

    public final TFv.rv6 ty() {
        return this.xMQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pFG.CN3 Z(ktm.j jVar, boolean z2) {
        String str;
        String strT = jVar.t();
        j.C1041j c1041jNr = jVar.nr();
        j.C1041j c1041jNr2 = jVar.nr();
        if (c1041jNr2 != null) {
            str = c1041jNr2.n() + " - " + c1041jNr2.rl();
            if (str == null) {
                str = "Not segmented";
            }
        }
        return new pFG.CN3(strT, c1041jNr, str, jVar.O(), jVar.J2(), jVar.Uo(), z2);
    }
}
