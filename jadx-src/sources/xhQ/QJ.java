package xhQ;

import GJW.vd;
import TFv.rv6;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.SavedStateHandle;
import androidx.view.ViewModelKt;
import java.util.List;
import kP.InterfaceC2210n;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import xAo.qf;
import xhQ.UGc;
import xhQ.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010 \u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u0019J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0019J\r\u0010$\u001a\u00020\u0014¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001a078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, d2 = {"LxhQ/QJ;", "LuW/n;", "LxhQ/UGc;", "LxhQ/fuX;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "LxhQ/Ml;", "getTrialListItemsUseCase", "LxAo/I28;", "crisperManager", "LxAo/qf;", "exportProFeatureManager", "LnYs/Ml;", "getAlightSettingsUseCase", "LkP/n;", "injet", "<init>", "(Landroidx/lifecycle/SavedStateHandle;LxhQ/Ml;LxAo/I28;LxAo/qf;LnYs/Ml;LkP/n;)V", "Lkotlin/Function1;", "LxhQ/UGc$j;", "", "block", "te", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "Uo", "()V", "", "", "projectIDs", "", "numAdsWatched", "numAdsToWatch", "S", "(Ljava/util/List;II)V", "g", "WPU", "aYN", "ViF", "()Lkotlin/Unit;", "Landroidx/lifecycle/SavedStateHandle;", "KN", "LxhQ/Ml;", "xMQ", "LxAo/I28;", "mUb", "LxAo/qf;", "gh", "LnYs/Ml;", "qie", "LkP/n;", "LTFv/rv6;", "az", "LTFv/rv6;", "ty", "HI", "LTFv/Wre;", "LxhQ/CN3;", "ck", "LTFv/Wre;", "items", "Ik", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrialListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrialListViewModel.kt\ncom/alightcreative/app/motion/activities/edit/fragments/trialList/TrialListViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,123:1\n49#2:124\n51#2:128\n46#3:125\n51#3:127\n105#4:126\n*S KotlinDebug\n*F\n+ 1 TrialListViewModel.kt\ncom/alightcreative/app/motion/activities/edit/fragments/trialList/TrialListViewModel\n*L\n55#1:124\n55#1:128\n55#1:125\n55#1:127\n55#1:126\n*E\n"})
public final class QJ extends uW.n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f75416r = 8;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private rv6 numAdsToWatch;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final xhQ.Ml getTrialListItemsUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final SavedStateHandle savedStateHandle;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final rv6 projectIDs;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final TFv.Wre items;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final qf exportProFeatureManager;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final InterfaceC2210n injet;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private rv6 numAdsWatched;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final xAo.I28 crisperManager;

    public static final class I28 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f75417n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ QJ f75418t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f75419n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ QJ f75420t;

            /* JADX INFO: renamed from: xhQ.QJ$I28$j$j, reason: collision with other inner class name */
            public static final class C1273j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f75421O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f75422n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f75423t;

                public C1273j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f75422n = obj;
                    this.f75423t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, QJ qj) {
                this.f75419n = cn3;
                this.f75420t = qj;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r7.rl(r8, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1273j c1273j;
                TFv.CN3 cn3;
                if (continuation instanceof C1273j) {
                    c1273j = (C1273j) continuation;
                    int i2 = c1273j.f75423t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1273j.f75423t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1273j = new C1273j(continuation);
                    }
                }
                Object obj2 = c1273j.f75422n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1273j.f75423t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn32 = this.f75419n;
                    xhQ.Ml ml = this.f75420t.getTrialListItemsUseCase;
                    c1273j.f75421O = cn32;
                    c1273j.f75423t = 1;
                    Object objN = ml.n((List) obj, c1273j);
                    if (objN != coroutine_suspended) {
                        obj2 = objN;
                        cn3 = cn32;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                cn3 = (TFv.CN3) c1273j.f75421O;
                ResultKt.throwOnFailure(obj2);
                c1273j.f75421O = null;
                c1273j.f75423t = 2;
            }
        }

        public I28(TFv.Wre wre, QJ qj) {
            this.f75417n = wre;
            this.f75418t = qj;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f75417n.n(new j(cn3, this.f75418t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75424n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75424n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210n = QJ.this.injet;
                Eu.I28 i28 = Eu.I28.f2379S;
                this.f75424n = 1;
                if (Eu.Wre.n(interfaceC2210n, i28, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            QJ.this.xMQ(fuX.j.f75462n);
            return Unit.INSTANCE;
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75426n;

        /* JADX INFO: renamed from: xhQ.QJ$j$j, reason: collision with other inner class name */
        static final class C1274j extends SuspendLambda implements Function4 {
            /* synthetic */ int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ int f75428O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75429n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f75430t;

            C1274j(Continuation continuation) {
                super(4, continuation);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return n((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (Continuation) obj4);
            }

            public final Object n(List list, int i2, int i3, Continuation continuation) {
                C1274j c1274j = new C1274j(continuation);
                c1274j.f75430t = list;
                c1274j.f75428O = i2;
                c1274j.J2 = i3;
                return c1274j.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f75429n == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.f75430t;
                    int i2 = this.f75428O;
                    int i3 = this.J2;
                    int iCoerceIn = RangesKt.coerceIn((int) ((i2 / RangesKt.coerceAtLeast(i3, 1)) * 100), (ClosedRange<Integer>) new IntRange(0, 100));
                    if (i3 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new UGc.j(list, z2, i3, i2, iCoerceIn);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ QJ f75431O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75432n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f75433t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(QJ qj, Continuation continuation) {
                super(2, continuation);
                this.f75431O = qj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f75431O, continuation);
                nVar.f75433t = obj;
                return nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f75432n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f75431O.mUb((UGc.j) this.f75433t);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(UGc.j jVar, Continuation continuation) {
                return ((n) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75426n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreAz = TFv.fuX.az(QJ.this.items, QJ.this.numAdsWatched, QJ.this.numAdsToWatch, new C1274j(null));
                n nVar = new n(QJ.this, null);
                this.f75426n = 1;
                if (TFv.fuX.gh(wreAz, nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ UGc.j f75434O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75435n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(UGc.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f75434O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new w6(this.f75434O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75435n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                qf qfVar = QJ.this.exportProFeatureManager;
                List list = (List) QJ.this.projectIDs.getValue();
                List listN = this.f75434O.n();
                this.f75435n = 1;
                if (qfVar.qie(list, listN, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    public QJ(SavedStateHandle savedStateHandle, xhQ.Ml getTrialListItemsUseCase, xAo.I28 crisperManager, qf exportProFeatureManager, nYs.Ml getAlightSettingsUseCase, InterfaceC2210n injet) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(getTrialListItemsUseCase, "getTrialListItemsUseCase");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(exportProFeatureManager, "exportProFeatureManager");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(injet, "injet");
        this.savedStateHandle = savedStateHandle;
        this.getTrialListItemsUseCase = getTrialListItemsUseCase;
        this.crisperManager = crisperManager;
        this.exportProFeatureManager = exportProFeatureManager;
        this.getAlightSettingsUseCase = getAlightSettingsUseCase;
        this.injet = injet;
        rv6 rv6VarNr = savedStateHandle.nr("project_ids", CollectionsKt.emptyList());
        this.projectIDs = rv6VarNr;
        this.numAdsWatched = savedStateHandle.nr("num_ads_watched", 0);
        this.numAdsToWatch = savedStateHandle.nr("num_ads_to_watch", 0);
        this.items = new I28(rv6VarNr, this);
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(QJ qj, UGc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GJW.C.nr(ViewModelKt.n(qj), null, null, qj.new w6(it, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void S(List projectIDs, int numAdsWatched, int numAdsToWatch) {
        Intrinsics.checkNotNullParameter(projectIDs, "projectIDs");
        this.savedStateHandle.J2("project_ids", projectIDs);
        this.savedStateHandle.J2("num_ads_watched", Integer.valueOf(numAdsWatched));
        this.savedStateHandle.J2("num_ads_to_watch", Integer.valueOf(numAdsToWatch));
    }

    public final Unit ViF() {
        return te(new Function1() { // from class: xhQ.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.nY(this.f75474n, (UGc.j) obj);
            }
        });
    }

    public final void WPU() {
        xMQ(fuX.j.f75462n);
    }

    public final void aYN() {
        xMQ(fuX.j.f75462n);
    }

    public final void g() {
        nYs.j jVarInvoke = this.getAlightSettingsUseCase.invoke();
        if (jVarInvoke != null && jVarInvoke.Xw()) {
            GJW.C.nr(ViewModelKt.n(this), null, null, new Ml(null), 3, null);
        } else {
            xAo.I28.o(this.crisperManager, xAo.l3D.f75283n, null, 2, null);
            xMQ(fuX.j.f75462n);
        }
    }

    private final Unit te(Function1 block) {
        UGc.j jVar;
        Object objNr = nr();
        if (objNr instanceof UGc.j) {
            jVar = (UGc.j) objNr;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        block.invoke(jVar);
        return Unit.INSTANCE;
    }
}
