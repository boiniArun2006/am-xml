package bH;

import DSG.Wre;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import TFv.SPz;
import android.content.Context;
import android.content.Intent;
import bH.CN3;
import bH.aC;
import com.bendingspoons.secretmenu.ui.SecretMenuActivity;
import com.bendingspoons.secretmenu.ui.overlay.view.j;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class aC implements CN3 {
    private final SPz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f43241O;
    private final Map Uo;
    private final DSG.Ml nr;
    private final DSG.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LJY.n f43242t;

    static final class j extends SuspendLambda implements Function3 {
        final /* synthetic */ DSG.Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ boolean f43243O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43244n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f43245o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ aC f43246r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f43247t;

        /* JADX INFO: renamed from: bH.aC$j$j, reason: collision with other inner class name */
        static final class C0573j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ DSG.j f43248O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43249n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ DSG.Ml f43250t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0573j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0573j(DSG.Ml ml, DSG.j jVar, Continuation continuation) {
                super(2, continuation);
                this.f43250t = ml;
                this.f43248O = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0573j(this.f43250t, this.f43248O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f43249n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    DSG.Ml ml = this.f43250t;
                    DSG.j jVar = this.f43248O;
                    this.f43249n = 1;
                    if (ml.t(jVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(DSG.Ml ml, aC aCVar, Context context, Continuation continuation) {
            super(3, continuation);
            this.J2 = ml;
            this.f43246r = aCVar;
            this.f43245o = context;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return xMQ(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        public final Object xMQ(boolean z2, boolean z3, Continuation continuation) {
            j jVar = new j(this.J2, this.f43246r, this.f43245o, continuation);
            jVar.f43247t = z2;
            jVar.f43243O = z3;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(DSG.Ml ml, DSG.j jVar) {
            GJW.C.nr(Lu.n(OU.rl()), null, null, new C0573j(ml, jVar, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(aC aCVar, Context context) {
            aCVar.rl(context);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43244n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                boolean z2 = this.f43247t;
                if (this.f43243O && z2) {
                    DSG.Ml ml = this.J2;
                    this.f43244n = 1;
                    obj = ml.nr(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return j.C0737j.f51564n;
                }
            }
            final aC aCVar = this.f43246r;
            final Context context = this.f43245o;
            Function0 function0 = new Function0() { // from class: bH.fuX
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return aC.j.mUb(aCVar, context);
                }
            };
            final DSG.Ml ml2 = this.J2;
            return new j.n((DSG.j) obj, function0, new Function1() { // from class: bH.Dsr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return aC.j.gh(ml2, (DSG.j) obj2);
                }
            });
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public aC(DSG.fuX itemRegistry, LJY.n installer, DSG.Ml repository, rB.Ml ml, Context context) {
        Intrinsics.checkNotNullParameter(itemRegistry, "itemRegistry");
        Intrinsics.checkNotNullParameter(installer, "installer");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.rl = itemRegistry;
        this.f43242t = installer;
        this.nr = repository;
        this.f43241O = ml;
        SPz sPzN = TFv.Lu.n(Boolean.FALSE);
        this.J2 = sPzN;
        this.Uo = new LinkedHashMap();
        com.bendingspoons.secretmenu.ui.mainscreen.Dsr.rl.rl(TFv.fuX.t(sPzN));
        sZH.n.n(this, context, repository);
    }

    private final void xMQ() {
        rB.Ml ml = this.f43241O;
        if (ml != null) {
            rB.I28.rl(ml, CollectionsKt.listOf((Object[]) new String[]{"secretmenu", "opened"}), null, null, null, pq.I28.n(pq.n.n("has_developer_items", KN())), 14, null);
        }
    }

    @Override // bH.CN3
    public void J2(CN3.Ml installType) {
        Intrinsics.checkNotNullParameter(installType, "installType");
        DSG.Ml ml = this.nr;
        if (!(installType instanceof CN3.Ml.n)) {
            throw new NoWhenBranchMatchedException();
        }
        Context baseContext = ((CN3.Ml.n) installType).n().getBaseContext();
        Intrinsics.checkNotNull(baseContext);
        TFv.Wre wreUo = Uo(ml, baseContext);
        if (!(installType instanceof CN3.Ml.n)) {
            throw new NoWhenBranchMatchedException();
        }
        CN3.Ml.n nVar = (CN3.Ml.n) installType;
        this.f43242t.n(nVar.n(), this, TFv.fuX.t(this.J2), wreUo, C.rl(nVar.rl()));
    }

    public boolean KN() {
        return ((Boolean) this.J2.getValue()).booleanValue();
    }

    @Override // bH.CN3
    public void O(String parentName, String parentEmoji, String str, DSG.Wre item) {
        List arrayList;
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(parentEmoji, "parentEmoji");
        Intrinsics.checkNotNullParameter(item, "item");
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{parentEmoji, parentName, str}), "/", null, null, 0, null, null, 62, null);
        qz qzVar = (qz) this.Uo.get(strJoinToString$default);
        if (qzVar == null || (arrayList = qzVar.n()) == null) {
            arrayList = new ArrayList();
            Wre.Ml ml = new Wre.Ml(parentName, parentEmoji, str, arrayList);
            n(CN3.I28.f43224n, ml);
            this.Uo.put(strJoinToString$default, new qz(ml, arrayList));
        }
        arrayList.add(item);
    }

    @Override // bH.CN3
    public void n(CN3.I28 visibility, DSG.Wre item) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(item, "item");
        this.rl.n(CollectionsKt.listOf(new DSG.aC(visibility == CN3.I28.f43224n, item)));
    }

    @Override // bH.CN3
    public void nr(boolean z2) {
        this.J2.setValue(Boolean.valueOf(z2));
    }

    @Override // bH.CN3
    public void rl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) SecretMenuActivity.class);
        intent.setFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        xMQ();
    }

    @Override // bH.CN3
    public void t(CN3.I28 visibility, List items) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(items, "items");
        DSG.fuX fux = this.rl;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new DSG.aC(visibility == CN3.I28.f43224n, (DSG.Wre) it.next()));
        }
        fux.n(arrayList);
    }

    private final TFv.Wre Uo(DSG.Ml ml, Context context) {
        return TFv.fuX.fD(ml.n(), this.J2, new j(ml, this, context, null));
    }
}
