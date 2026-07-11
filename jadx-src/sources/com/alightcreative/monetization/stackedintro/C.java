package com.alightcreative.monetization.stackedintro;

import GJW.vd;
import TFv.Lu;
import TFv.SPz;
import YV.eO;
import YV.z;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import com.bendingspoons.monopoly.product.BasePlan;
import com.bendingspoons.monopoly.product.Offer;
import com.bendingspoons.monopoly.product.PricingPhase;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import g8.s4;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C extends uW.n {
    private final SPz HI;
    private final TFv.Wre Ik;
    private final YV.Wre KN;
    private final CZF.I28 Uo;
    private final SPz az;
    private final pq.Ml ck;
    private final boolean gh;
    private final StackedIntroOffersEntity mUb;
    private final SPz qie;
    private final SPz ty;
    private final kgE.fuX xMQ;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w6 f46753r = new w6(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f46752o = 8;

    public interface CN3 {

        public static final class j implements CN3 {
            private final boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f46754O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f46755n;
            private final String nr;
            private final StackedIntroOffersEntity.Treatment rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final s4 f46756t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f46755n == jVar.f46755n && this.rl == jVar.rl && this.f46756t == jVar.f46756t && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f46754O, jVar.f46754O) && this.J2 == jVar.J2;
            }

            public int hashCode() {
                int iHashCode = ((((((Boolean.hashCode(this.f46755n) * 31) + this.rl.hashCode()) * 31) + this.f46756t.hashCode()) * 31) + this.nr.hashCode()) * 31;
                String str = this.f46754O;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.J2);
            }

            public String toString() {
                return "Content(isFreeTrialSelected=" + this.f46755n + ", treatment=" + this.rl + ", periodicity=" + this.f46756t + ", price=" + this.nr + ", introOffer=" + this.f46754O + ", isLoading=" + this.J2 + ")";
            }

            public j(boolean z2, StackedIntroOffersEntity.Treatment treatment, s4 periodicity, String price, String str, boolean z3) {
                Intrinsics.checkNotNullParameter(treatment, "treatment");
                Intrinsics.checkNotNullParameter(periodicity, "periodicity");
                Intrinsics.checkNotNullParameter(price, "price");
                this.f46755n = z2;
                this.rl = treatment;
                this.f46756t = periodicity;
                this.nr = price;
                this.f46754O = str;
                this.J2 = z3;
            }

            public final boolean J2() {
                return this.J2;
            }

            public final boolean O() {
                return this.f46755n;
            }

            public final String n() {
                return this.f46754O;
            }

            public final StackedIntroOffersEntity.Treatment nr() {
                return this.rl;
            }

            public final s4 rl() {
                return this.f46756t;
            }

            public final String t() {
                return this.nr;
            }
        }

        public static final class n implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f46757n = new n();

            private n() {
            }
        }
    }

    private static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SubscriptionProduct f46760n;
        private final SubscriptionProduct nr;
        private final SubscriptionProduct rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SubscriptionProduct f46761t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof I28)) {
                return false;
            }
            I28 i28 = (I28) obj;
            return Intrinsics.areEqual(this.f46760n, i28.f46760n) && Intrinsics.areEqual(this.rl, i28.rl) && Intrinsics.areEqual(this.f46761t, i28.f46761t) && Intrinsics.areEqual(this.nr, i28.nr);
        }

        public int hashCode() {
            return (((((this.f46760n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f46761t.hashCode()) * 31) + this.nr.hashCode();
        }

        public String toString() {
            return "PaywallProducts(weeklyProduct=" + this.f46760n + ", weeklyNoTrialProduct=" + this.rl + ", yearlyProduct=" + this.f46761t + ", yearlyProductNoTrial=" + this.nr + ")";
        }

        public I28(SubscriptionProduct weeklyProduct, SubscriptionProduct weeklyNoTrialProduct, SubscriptionProduct yearlyProduct, SubscriptionProduct yearlyProductNoTrial) {
            Intrinsics.checkNotNullParameter(weeklyProduct, "weeklyProduct");
            Intrinsics.checkNotNullParameter(weeklyNoTrialProduct, "weeklyNoTrialProduct");
            Intrinsics.checkNotNullParameter(yearlyProduct, "yearlyProduct");
            Intrinsics.checkNotNullParameter(yearlyProductNoTrial, "yearlyProductNoTrial");
            this.f46760n = weeklyProduct;
            this.rl = weeklyNoTrialProduct;
            this.f46761t = yearlyProduct;
            this.nr = yearlyProductNoTrial;
        }

        public final SubscriptionProduct n() {
            return this.rl;
        }

        public final SubscriptionProduct nr() {
            return this.nr;
        }

        public final SubscriptionProduct rl() {
            return this.f46760n;
        }

        public final SubscriptionProduct t() {
            return this.f46761t;
        }
    }

    public interface Ml {
        C n(StackedIntroOffersEntity stackedIntroOffersEntity);
    }

    public interface Wre {

        public static final class j implements Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f46762n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.f46762n == ((j) obj).f46762n;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f46762n);
            }

            public String toString() {
                return "ClosePaywall(hasPurchased=" + this.f46762n + ")";
            }

            public final boolean n() {
                return this.f46762n;
            }

            public j(boolean z2) {
                this.f46762n = z2;
            }
        }
    }

    static final class aC extends SuspendLambda implements Function5 {
        /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f46763O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46764n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f46766r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f46767t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[s4.values().length];
                try {
                    iArr[s4.f67124n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s4.f67125t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        aC(Continuation continuation) {
            super(5, continuation);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return n((I28) obj, (s4) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (Continuation) obj5);
        }

        public final Object n(I28 i28, s4 s4Var, boolean z2, boolean z3, Continuation continuation) {
            aC aCVar = C.this.new aC(continuation);
            aCVar.f46767t = i28;
            aCVar.f46763O = s4Var;
            aCVar.J2 = z2;
            aCVar.f46766r = z3;
            return aCVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SubscriptionProduct subscriptionProductN;
            String formattedPrice;
            String str;
            PricingPhase pricingPhaseNr;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f46764n == 0) {
                ResultKt.throwOnFailure(obj);
                I28 i28 = (I28) this.f46767t;
                s4 s4Var = (s4) this.f46763O;
                boolean z2 = this.J2;
                boolean z3 = this.f46766r;
                if (i28 == null) {
                    return CN3.n.f46757n;
                }
                if (z2) {
                    int i2 = j.$EnumSwitchMapping$0[s4Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            subscriptionProductN = i28.t();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        subscriptionProductN = i28.rl();
                    }
                } else {
                    int i3 = j.$EnumSwitchMapping$0[s4Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            subscriptionProductN = i28.nr();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        subscriptionProductN = i28.n();
                    }
                }
                String formattedPrice2 = ((BasePlan) CollectionsKt.last((List) subscriptionProductN.getBasePlans())).getFormattedPrice();
                Offer offer = (Offer) CollectionsKt.firstOrNull((List) subscriptionProductN.getIntroPriceOffers());
                if (offer != null && (pricingPhaseNr = KNH.w6.nr(offer)) != null) {
                    formattedPrice = pricingPhaseNr.getFormattedPrice();
                } else {
                    formattedPrice = null;
                }
                if (C.this.mUb.getTreatment() != StackedIntroOffersEntity.Treatment.TIMELINE_NO_INTRO_OFFER) {
                    str = formattedPrice;
                } else {
                    str = null;
                }
                return new CN3.j(z2, C.this.mUb.getTreatment(), s4Var, formattedPrice2, str, z3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46771n;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.alightcreative.monetization.stackedintro.C$j$j, reason: collision with other inner class name */
        static final class C0669j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ C f46773O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46774n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ boolean f46775t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0669j(C c2, Continuation continuation) {
                super(2, continuation);
                this.f46773O = c2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0669j c0669j = new C0669j(this.f46773O, continuation);
                c0669j.f46775t = ((Boolean) obj).booleanValue();
                return c0669j;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            public final Object n(boolean z2, Continuation continuation) {
                return ((C0669j) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f46774n == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f46775t) {
                        this.f46773O.xMQ(new Wre.j(false));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46771n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreKN = C.this.KN.KN();
                C0669j c0669j = new C0669j(C.this, null);
                this.f46771n = 1;
                if (TFv.fuX.gh(wreKN, c0669j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46776n;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
        
            if (TFv.fuX.gh(r11, r0, r10) == r4) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46776n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1[] function1Arr = {new j(C.this, null), new C0670n(C.this, null), new w6(C.this, null), new Ml(C.this, null)};
                this.f46776n = 1;
                obj = sJa.Dsr.n(function1Arr, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Iterable<x0X.n> iterable = (Iterable) obj;
            C c2 = C.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (x0X.n nVar : iterable) {
                if (nVar instanceof n.C1266n) {
                    c2.xMQ(new Wre.j(false));
                    return Unit.INSTANCE;
                }
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add((SubscriptionProduct) ((n.w6) nVar).n());
            }
            C.this.ty.setValue(new I28((SubscriptionProduct) arrayList.get(0), (SubscriptionProduct) arrayList.get(1), (SubscriptionProduct) arrayList.get(2), (SubscriptionProduct) arrayList.get(3)));
            C.this.HI.setValue(Boxing.boxBoolean(false));
            TFv.Wre wre = C.this.Ik;
            I28 i28 = new I28(C.this, null);
            this.f46776n = 2;
        }

        static final class I28 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ C f46778O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46779n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f46780t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            I28(C c2, Continuation continuation) {
                super(2, continuation);
                this.f46778O = c2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                I28 i28 = new I28(this.f46778O, continuation);
                i28.f46780t = obj;
                return i28;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CN3 cn3, Continuation continuation) {
                return ((I28) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f46779n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f46778O.mUb((CN3) this.f46780t);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        static final class Ml extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46781n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C f46782t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Ml(C c2, Continuation continuation) {
                super(1, continuation);
                this.f46782t = c2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new Ml(this.f46782t, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f46781n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                YV.Wre wre = this.f46782t.KN;
                String yearlyNoTrialProductId = this.f46782t.mUb.getYearlyNoTrialProductId();
                this.f46781n = 1;
                Object objGh = wre.gh(yearlyNoTrialProductId, this);
                if (objGh == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objGh;
            }
        }

        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46783n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C f46784t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C c2, Continuation continuation) {
                super(1, continuation);
                this.f46784t = c2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f46784t, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f46783n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                YV.Wre wre = this.f46784t.KN;
                String weeklyProductId = this.f46784t.mUb.getWeeklyProductId();
                this.f46783n = 1;
                Object objGh = wre.gh(weeklyProductId, this);
                if (objGh == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objGh;
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.monetization.stackedintro.C$n$n, reason: collision with other inner class name */
        static final class C0670n extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46785n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C f46786t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0670n(C c2, Continuation continuation) {
                super(1, continuation);
                this.f46786t = c2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0670n(this.f46786t, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0670n) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f46785n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                YV.Wre wre = this.f46786t.KN;
                String weeklyNoTrialProductId = this.f46786t.mUb.getWeeklyNoTrialProductId();
                this.f46785n = 1;
                Object objGh = wre.gh(weeklyNoTrialProductId, this);
                if (objGh == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objGh;
            }
        }

        static final class w6 extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46787n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C f46788t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(C c2, Continuation continuation) {
                super(1, continuation);
                this.f46788t = c2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new w6(this.f46788t, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f46787n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                YV.Wre wre = this.f46788t.KN;
                String yearlyProductId = this.f46788t.mUb.getYearlyProductId();
                this.f46787n = 1;
                Object objGh = wre.gh(yearlyProductId, this);
                if (objGh == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objGh;
            }
        }
    }

    public static final class w6 {

        public static final class j implements ViewModelProvider.Factory {
            final /* synthetic */ Ml rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ StackedIntroOffersEntity f46789t;

            j(Ml ml, StackedIntroOffersEntity stackedIntroOffersEntity) {
                this.rl = ml;
                this.f46789t = stackedIntroOffersEntity;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                C cN = this.rl.n(this.f46789t);
                Intrinsics.checkNotNull(cN, "null cannot be cast to non-null type T of com.alightcreative.monetization.stackedintro.StackedOffersPaywallViewModel.Companion.provideFactory.<no name provided>.create");
                return cN;
            }
        }

        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }

        public final ViewModelProvider.Factory n(Ml assistedFactory, StackedIntroOffersEntity configuration) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new j(assistedFactory, configuration);
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46758n;

        Dsr(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C.this.new Dsr(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46758n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C.this.HI.setValue(Boxing.boxBoolean(true));
                YV.Wre wre = C.this.KN;
                boolean z2 = C.this.gh;
                this.f46758n = 1;
                if (wre.mUb(z2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C.this.HI.setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ StackedOffersPaywallActivity f46768O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46769n;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[s4.values().length];
                try {
                    iArr[s4.f67124n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s4.f67125t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[YV.fuX.values().length];
                try {
                    iArr2[YV.fuX.f12140n.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[YV.fuX.f12142t.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[YV.fuX.f12139O.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(StackedOffersPaywallActivity stackedOffersPaywallActivity, Continuation continuation) {
            super(2, continuation);
            this.f46768O = stackedOffersPaywallActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C.this.new fuX(this.f46768O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CN3.j jVar;
            String weeklyNoTrialProductId;
            fuX fux;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46769n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    fux = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C.this.HI.setValue(Boxing.boxBoolean(true));
                Object objNr = C.this.nr();
                if (objNr instanceof CN3.j) {
                    jVar = (CN3.j) objNr;
                } else {
                    jVar = null;
                }
                if (jVar == null) {
                    return Unit.INSTANCE;
                }
                int i3 = j.$EnumSwitchMapping$0[jVar.rl().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (jVar.O()) {
                            weeklyNoTrialProductId = C.this.mUb.getYearlyProductId();
                        } else {
                            weeklyNoTrialProductId = C.this.mUb.getYearlyNoTrialProductId();
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (jVar.O()) {
                    weeklyNoTrialProductId = C.this.mUb.getWeeklyProductId();
                } else {
                    weeklyNoTrialProductId = C.this.mUb.getWeeklyNoTrialProductId();
                }
                String str = weeklyNoTrialProductId;
                C.this.xMQ.t();
                YV.Wre wre = C.this.KN;
                StackedOffersPaywallActivity stackedOffersPaywallActivity = this.f46768O;
                KNH.I28 i28 = KNH.I28.f5294t;
                z zVar = new z("", Boxing.boxBoolean(C.this.gh), C.this.ck);
                this.f46769n = 1;
                fux = this;
                obj = eO.j.n(wre, stackedOffersPaywallActivity, str, null, null, i28, zVar, fux, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            C c2 = C.this;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    int i5 = j.$EnumSwitchMapping$1[((YV.fuX) ((n.w6) nVar).n()).ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                c2.xMQ(new Wre.j(true));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        c2.xMQ(new Wre.j(true));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            C.this.HI.setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    public C(CZF.I28 pico, YV.Wre monopoly, kgE.fuX iapManager, StackedIntroOffersEntity configuration) {
        Intrinsics.checkNotNullParameter(pico, "pico");
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.Uo = pico;
        this.KN = monopoly;
        this.xMQ = iapManager;
        this.mUb = configuration;
        boolean zIsFirstPaywall = com.alightcreative.app.motion.persist.j.INSTANCE.isFirstPaywall();
        this.gh = zIsFirstPaywall;
        SPz sPzN = Lu.n(s4.f67124n);
        this.qie = sPzN;
        SPz sPzN2 = Lu.n(Boolean.FALSE);
        this.az = sPzN2;
        SPz sPzN3 = Lu.n(null);
        this.ty = sPzN3;
        SPz sPzN4 = Lu.n(Boolean.TRUE);
        this.HI = sPzN4;
        pq.Ml mlN = pq.I28.n(pq.n.O("treatment", configuration.getTreatment().name()), pq.n.n("is_first_paywall", zIsFirstPaywall));
        this.ck = mlN;
        this.Ik = TFv.fuX.qie(sPzN3, sPzN, sPzN2, sPzN4, new aC(null));
        jgV.Wre.n(pico, "paywall_shown", mlN);
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
    }

    public final void S() {
        jgV.Wre.n(this.Uo, "paywall_dismissed", this.ck);
        xMQ(new Wre.j(false));
    }

    public final void ViF(s4 periodicity) {
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        this.qie.setValue(periodicity);
    }

    public final void WPU() {
        jgV.Wre.n(this.Uo, "paywall_dismissed", this.ck);
        xMQ(new Wre.j(false));
    }

    public final void aYN(boolean z2) {
        if (z2) {
            jgV.Wre.n(this.Uo, "paywall_free_trial_selected", this.ck);
        }
        this.az.setValue(Boolean.valueOf(z2));
    }

    public final void nY(StackedOffersPaywallActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        GJW.C.nr(ViewModelKt.n(this), null, null, new fuX(activity, null), 3, null);
    }

    public final void g() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new Dsr(null), 3, null);
    }
}
