package com.bendingspoons.pico.domain.entities.additionalInfo.pico;

import CZF.I28;
import Dk.InterfaceC1335n;
import WN.j;
import ajd.j;
import android.content.Context;
import com.bendingspoons.concierge.domain.entities.Id;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.j;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    static final class I28 extends SuspendLambda implements Function1 {
        final /* synthetic */ InterfaceC1335n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f51489O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51490n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ rB.Ml f51491r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f51492t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.J2, this.f51491r, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(InterfaceC1335n interfaceC1335n, rB.Ml ml, Continuation continuation) {
            super(1, continuation);
            this.J2 = interfaceC1335n;
            this.f51491r = ml;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[LOOP:0: B:23:0x0090->B:25:0x0096, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC1335n interfaceC1335n;
            rB.Ml ml;
            Id.Predefined.Internal internal;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51489O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        internal = (Id.Predefined.Internal) this.f51490n;
                        ResultKt.throwOnFailure(obj);
                        Set setMinus = SetsKt.minus((Set) obj, (Iterable) SetsKt.setOf(internal));
                        String value = internal.getValue();
                        Set<Id> set = setMinus;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
                        for (Id id : set) {
                            Pair pair = TuplesKt.to(id.getName(), id.getValue());
                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        }
                        return new PicoAdditionalInfo.UserIds(value, linkedHashMap);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1335n = (InterfaceC1335n) this.f51492t;
                ml = (rB.Ml) this.f51490n;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC1335n = this.J2;
                rB.Ml ml2 = this.f51491r;
                Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.f51217O;
                this.f51490n = ml2;
                this.f51492t = interfaceC1335n;
                this.f51489O = 1;
                Object objO = interfaceC1335n.O(jVar, this);
                if (objO != coroutine_suspended) {
                    ml = ml2;
                    obj = objO;
                }
                return coroutine_suspended;
            }
            x0X.n nVar = (x0X.n) obj;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    Id.Predefined.Internal internal2 = (Id.Predefined.Internal) ((n.w6) nVar).n();
                    this.f51490n = internal2;
                    this.f51492t = null;
                    this.f51489O = 2;
                    Object objN = interfaceC1335n.n(this);
                    if (objN != coroutine_suspended) {
                        internal = internal2;
                        obj = objN;
                        Set setMinus2 = SetsKt.minus((Set) obj, (Iterable) SetsKt.setOf(internal));
                        String value2 = internal.getValue();
                        Set<Id> set2 = setMinus2;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
                        while (r13.hasNext()) {
                        }
                        return new PicoAdditionalInfo.UserIds(value2, linkedHashMap2);
                    }
                    return coroutine_suspended;
                }
                throw new NoWhenBranchMatchedException();
            }
            zD.j jVar2 = (zD.j) ((n.C1266n) nVar).n();
            rB.I28.rl(ml, CollectionsKt.listOf((Object[]) new String[]{"pico", "additionalInfoProvider", "backupPersistentId", MRAIDPresenter.ERROR}), j.EnumC0481j.J2, "Received an error while retrieving the backup persistent id in the additional info provider. ", null, jVar2.O(), 8, null);
            throw jVar2.nr();
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51493n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f51494t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(this.f51494t, null, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Function1 function1, Lk.j jVar, Continuation continuation) {
            super(1, continuation);
            this.f51494t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51493n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f51494t;
                this.f51493n = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map mapPlus = MapsKt.plus((Map) obj, MapsKt.emptyMap());
            if (mapPlus.isEmpty()) {
                return PicoAdditionalInfo.Experiment.Baseline.INSTANCE;
            }
            return new PicoAdditionalInfo.Experiment.Segmented(mapPlus);
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51495n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f51496t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51495n = obj;
            this.f51496t |= Integer.MIN_VALUE;
            return w6.rl(null, this);
        }
    }

    static final class j extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f51497O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51498n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28.n f51499t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new j(this.f51499t, this.f51497O, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(I28.n nVar, Context context, Continuation continuation) {
            super(1, continuation);
            this.f51499t = nVar;
            this.f51497O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51498n == 0) {
                ResultKt.throwOnFailure(obj);
                String strT = this.f51499t.t();
                YgZ.w6 w6Var = YgZ.w6.f12217n;
                return new PicoAdditionalInfo.App(strT, w6Var.t(this.f51497O), String.valueOf(w6Var.rl(this.f51497O)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.pico.domain.entities.additionalInfo.pico.w6$w6, reason: collision with other inner class name */
    static final class C0733w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51502n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Fyf.w6 f51503t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C0733w6(this.f51503t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0733w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0733w6(Fyf.w6 w6Var, Continuation continuation) {
            super(1, continuation);
            this.f51503t = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51502n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Fyf.w6 w6Var = this.f51503t;
                this.f51502n = 1;
                obj = w6Var.rl(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new PicoAdditionalInfo.Install(((Fyf.j) obj).rl());
        }
    }

    static final class CN3 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51487n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.bendingspoons.pico.domain.entities.additionalInfo.pico.j f51488t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(com.bendingspoons.pico.domain.entities.additionalInfo.pico.j jVar, Continuation continuation) {
            super(1, continuation);
            this.f51488t = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new CN3(this.f51488t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51487n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bendingspoons.pico.domain.entities.additionalInfo.pico.j jVar = this.f51488t;
            this.f51487n = 1;
            Object objN = jVar.n(this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51500n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f51501t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context, Continuation continuation) {
            super(1, continuation);
            this.f51501t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f51501t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51500n == 0) {
                ResultKt.throwOnFailure(obj);
                YgZ.n nVar = new YgZ.n();
                return new PicoAdditionalInfo.Device(new PicoAdditionalInfo.Device.Software(nVar.KN(), nVar.xMQ(), nVar.Uo(), nVar.t(), nVar.O(), nVar.J2(), new PicoAdditionalInfo.Device.Software.Timezone(nVar.gh(), nVar.nr(), nVar.qie())), new PicoAdditionalInfo.Device.Hardware(nVar.n(), nVar.rl(), nVar.mUb(this.f51501t)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final com.bendingspoons.pico.domain.entities.additionalInfo.pico.j n(j.C0732j c0732j, Context context, I28.n config, InterfaceC1335n concierge, rB.Ml debugLogger, Function1 remoteSegmentsProvider, Function1 monetizationProvider, Lk.j jVar, Fyf.w6 installManager) {
        Intrinsics.checkNotNullParameter(c0732j, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(debugLogger, "debugLogger");
        Intrinsics.checkNotNullParameter(remoteSegmentsProvider, "remoteSegmentsProvider");
        Intrinsics.checkNotNullParameter(monetizationProvider, "monetizationProvider");
        Intrinsics.checkNotNullParameter(installManager, "installManager");
        return c0732j.n(new j(config, context, null), new n(context, null), new C0733w6(installManager, null), monetizationProvider, new Ml(remoteSegmentsProvider, jVar, null), new I28(concierge, debugLogger, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(com.bendingspoons.pico.domain.entities.additionalInfo.pico.j jVar, Continuation continuation) {
        Wre wre;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f51496t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f51496t = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objUo = wre.f51495n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f51496t;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            CN3 cn3 = new CN3(jVar, null);
            wre.f51496t = 1;
            objUo = x0X.w6.Uo(cn3, wre);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        return t((x0X.n) objUo);
    }

    private static final x0X.n t(x0X.n nVar) {
        if (nVar instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) nVar).n();
            return new n.C1266n(new WN.j(j.w6.J2, j.EnumC0415j.f11469Z, j.n.f11480t, th.getMessage(), th));
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
