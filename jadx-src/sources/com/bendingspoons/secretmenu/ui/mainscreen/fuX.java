package com.bendingspoons.secretmenu.ui.mainscreen;

import DSG.Wre;
import DSG.aC;
import GJW.OU;
import GJW.RzR;
import GJW.vd;
import ILs.C;
import TFv.Ln;
import TFv.rv6;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.InitializerViewModelFactoryBuilder;
import com.bendingspoons.secretmenu.ui.mainscreen.Ml;
import com.bendingspoons.secretmenu.ui.mainscreen.fuX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX extends ViewModel {
    public static final j J2 = new j(null);
    public static final int Uo = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TFv.Wre f51543O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DSG.fuX f51544n;
    private final ILs.CN3 nr;
    private final Lazy rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rv6 f51545t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fuX t(TFv.Wre wre, DSG.fuX fux, CO9.w6 w6Var, CO9.n nVar, String str, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new fuX(wre, fux, w6Var, nVar, str);
        }

        public final ViewModelProvider.Factory rl(final TFv.Wre showDeveloperOptions, final DSG.fuX itemRegistry, final CO9.w6 getAppVersionInfoUseCase, final CO9.n getAppNameUseCase, final String str) {
            Intrinsics.checkNotNullParameter(showDeveloperOptions, "showDeveloperOptions");
            Intrinsics.checkNotNullParameter(itemRegistry, "itemRegistry");
            Intrinsics.checkNotNullParameter(getAppVersionInfoUseCase, "getAppVersionInfoUseCase");
            Intrinsics.checkNotNullParameter(getAppNameUseCase, "getAppNameUseCase");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.n(Reflection.getOrCreateKotlinClass(fuX.class), new Function1() { // from class: SRO.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.j.t(showDeveloperOptions, itemRegistry, getAppVersionInfoUseCase, getAppNameUseCase, str, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.rl();
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ fuX f51546O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51547n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ DSG.Wre f51548t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Wre.j.EnumC0054j.values().length];
                try {
                    iArr[Wre.j.EnumC0054j.f1449t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Wre.j.EnumC0054j.f1446O.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Wre.j.EnumC0054j.f1447n.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f51548t, this.f51546O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(DSG.Wre wre, fuX fux, Continuation continuation) {
            super(2, continuation);
            this.f51548t = wre;
            this.f51546O = fux;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51547n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1O = ((Wre.j) this.f51548t).O();
                this.f51547n = 1;
                obj = function1O.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            int i3 = j.$EnumSwitchMapping$0[((Wre.j.EnumC0054j) obj).ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    C.rl(this.f51546O.nr.nr(Ml.j.f51516n));
                }
            } else {
                C.rl(this.f51546O.nr.nr(Ml.n.f51517n));
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function3 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f51549O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51550n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ fuX f51551r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f51552t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, fuX fux, Continuation continuation) {
            super(3, continuation);
            this.J2 = str;
            this.f51551r = fux;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return n(((Boolean) obj).booleanValue(), (List) obj2, (Continuation) obj3);
        }

        public final Object n(boolean z2, List list, Continuation continuation) {
            w6 w6Var = new w6(this.J2, this.f51551r, continuation);
            w6Var.f51552t = z2;
            w6Var.f51549O = list;
            return w6Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Wre.Ml ml;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51550n == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z2 = this.f51552t;
                List list = (List) this.f51549O;
                E14.Ml ml2 = null;
                if (this.J2 == null) {
                    E14.n nVar = new E14.n(this.f51551r.Uo(), false);
                    if (z2) {
                        str = "Universal";
                    } else {
                        str = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((aC) obj2).rl()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(SRO.Ml.rl(((aC) it.next()).n()));
                    }
                    E14.Ml ml3 = new E14.Ml(str, arrayList2);
                    if (z2) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((aC) obj3).rl()) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(SRO.Ml.rl(((aC) it2.next()).n()));
                        }
                        ml2 = new E14.Ml("Spooner", arrayList4);
                    }
                    return new E14.I28(nVar, CollectionsKt.listOfNotNull((Object[]) new E14.Ml[]{ml3, ml2}));
                }
                DSG.Wre wreRl = this.f51551r.f51544n.rl(this.J2);
                if (wreRl instanceof Wre.Ml) {
                    ml = (Wre.Ml) wreRl;
                } else {
                    ml = null;
                }
                if (ml != null) {
                    E14.n nVar2 = new E14.n(ml.rl() + " " + ml.nr(), true);
                    List listO = ml.O();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
                    Iterator it3 = listO.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(SRO.Ml.rl((DSG.Wre) it3.next()));
                    }
                    return new E14.I28(nVar2, CollectionsKt.listOf(new E14.Ml(null, arrayList5)));
                }
                return new E14.I28(new E14.n(this.f51551r.Uo(), true), CollectionsKt.emptyList());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public fuX(TFv.Wre showDeveloperOptions, DSG.fuX itemRegistry, final CO9.w6 getAppVersionInfoUseCase, final CO9.n getAppNameUseCase, String str) {
        Intrinsics.checkNotNullParameter(showDeveloperOptions, "showDeveloperOptions");
        Intrinsics.checkNotNullParameter(itemRegistry, "itemRegistry");
        Intrinsics.checkNotNullParameter(getAppVersionInfoUseCase, "getAppVersionInfoUseCase");
        Intrinsics.checkNotNullParameter(getAppNameUseCase, "getAppNameUseCase");
        this.f51544n = itemRegistry;
        this.rl = LazyKt.lazy(new Function0() { // from class: SRO.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.qie(getAppVersionInfoUseCase, getAppNameUseCase);
            }
        });
        this.f51545t = TFv.fuX.Xw(TFv.fuX.ty(showDeveloperOptions, itemRegistry.t(), new w6(str, this, null)), ViewModelKt.n(this), Ln.f10289n.nr(), new E14.I28(new E14.n(Uo(), false), CollectionsKt.emptyList()));
        ILs.CN3 cn3Rl = ILs.aC.rl(10, ILs.j.f4187t, null, 4, null);
        this.nr = cn3Rl;
        this.f51543O = TFv.fuX.bzg(cn3Rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Uo() {
        return (String) this.rl.getValue();
    }

    public final TFv.Wre J2() {
        return this.f51543O;
    }

    public final rv6 KN() {
        return this.f51545t;
    }

    public final void gh(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        DSG.Wre wreRl = this.f51544n.rl(itemId);
        if (wreRl instanceof Wre.j) {
            GJW.C.nr(RzR.f3449n, OU.t(), null, new n(wreRl, this, null), 2, null);
            return;
        }
        if (wreRl instanceof Wre.Ml) {
            C.rl(this.nr.nr(new Ml.I28(itemId)));
            return;
        }
        if (wreRl instanceof Wre.w6) {
            C.rl(this.nr.nr(new Ml.C0734Ml(((Wre.w6) wreRl).t())));
        } else if (wreRl instanceof Wre.n) {
            Unit unit = Unit.INSTANCE;
        } else {
            if (wreRl != null) {
                throw new NoWhenBranchMatchedException();
            }
            C.rl(this.nr.nr(Ml.n.f51517n));
        }
    }

    public final void mUb() {
        this.nr.nr(Ml.n.f51517n);
    }

    public final void xMQ() {
        this.nr.nr(Ml.w6.f51518n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(CO9.w6 w6Var, CO9.n nVar) {
        CO9.j jVarInvoke = w6Var.invoke();
        return nVar.invoke() + " - " + jVarInvoke.rl() + " (" + jVarInvoke.n() + ")";
    }
}
