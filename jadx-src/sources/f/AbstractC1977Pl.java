package f;

import GJW.vd;
import Hr.CQ.USEaHtCMH;
import YgZ.uQga.IYJfqUyym;
import Zzk.j;
import android.content.Intent;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.result.ActivityResult;
import com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity;
import com.alightcreative.monetization.ui.PaywallActivity;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import f.AbstractC1979Xo;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: f.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC1977Pl {

    /* JADX INFO: renamed from: f.Pl$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class j extends ContinuationImpl {
        /* synthetic */ Object E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63980O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f63981S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f63982Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63983e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f63984g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63985n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f63986o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f63987r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63988t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.E2 = obj;
            this.f63983e |= Integer.MIN_VALUE;
            return AbstractC1977Pl.t(null, null, null, null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: f.Pl$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ C1972C J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ sqD.w6 f63989O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Zzk.j f63990Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63991n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ nYs.Ml f63992o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ xAo.n f63993r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f63994t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ComponentActivity componentActivity, sqD.w6 w6Var, C1972C c1972c, xAo.n nVar, nYs.Ml ml, Zzk.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f63994t = componentActivity;
            this.f63989O = w6Var;
            this.J2 = c1972c;
            this.f63993r = nVar;
            this.f63992o = ml;
            this.f63990Z = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f63994t, this.f63989O, this.J2, this.f63993r, this.f63992o, this.f63990Z, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63991n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ComponentActivity componentActivity = this.f63994t;
                sqD.w6 w6Var = this.f63989O;
                C1972C c1972c = this.J2;
                xAo.n nVar = this.f63993r;
                nYs.Ml ml = this.f63992o;
                Zzk.j jVar = this.f63990Z;
                this.f63991n = 1;
                if (AbstractC1977Pl.t(componentActivity, w6Var, c1972c, nVar, ml, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1972C O(JSONObject jSONObject) {
        EnumC1982eO enumC1982eO;
        Integer numT;
        boolean z2;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String strO = bIo.Wre.O(jSONObject, "paywallType");
        if (strO != null) {
            switch (strO.hashCode()) {
                case -1932509691:
                    if (strO.equals("checkbox_comparison")) {
                        enumC1982eO = EnumC1982eO.f64025t;
                        EnumC1982eO enumC1982eO2 = enumC1982eO;
                        String strO2 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO3 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO4 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO5 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO6 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO7 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO8 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO9 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO10 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO11 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO12 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO13 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT2 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN = jSONArrayNr != null ? WK.w6.n(jSONArrayNr, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                            z2 = false;
                        } else {
                            z2 = true;
                            if (numT.intValue() != 1) {
                            }
                        }
                        return new C1972C(enumC1982eO2, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, strO11, strO12, strO13, numT2, listN, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case -1677434644:
                    if (strO.equals("cloud_cards_tiers_no_trial")) {
                        enumC1982eO = EnumC1982eO.f64024r;
                        EnumC1982eO enumC1982eO22 = enumC1982eO;
                        String strO22 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO32 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO42 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO52 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO62 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO72 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO82 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO92 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO102 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO112 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO122 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO132 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT22 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr2 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN2 = jSONArrayNr2 != null ? WK.w6.n(jSONArrayNr2, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO22, strO22, strO32, strO42, strO52, strO62, strO72, strO82, strO92, strO102, strO112, strO122, strO132, numT22, listN2, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case -1129942037:
                    if (strO.equals("cloud_cards_tiers")) {
                        enumC1982eO = EnumC1982eO.J2;
                        EnumC1982eO enumC1982eO222 = enumC1982eO;
                        String strO222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO322 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO422 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO522 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO622 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO722 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO822 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO922 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO1022 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO1122 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO1222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO1322 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr22 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN22 = jSONArrayNr22 != null ? WK.w6.n(jSONArrayNr22, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO222, strO222, strO322, strO422, strO522, strO622, strO722, strO822, strO922, strO1022, strO1122, strO1222, strO1322, numT222, listN22, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case -1070861133:
                    if (strO.equals("playful_unlock_ft")) {
                        enumC1982eO = EnumC1982eO.E2;
                        EnumC1982eO enumC1982eO2222 = enumC1982eO;
                        String strO2222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO3222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO4222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO5222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO6222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO7222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO8222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO9222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO10222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO11222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO12222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO13222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT2222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN222 = jSONArrayNr222 != null ? WK.w6.n(jSONArrayNr222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO2222, strO2222, strO3222, strO4222, strO5222, strO6222, strO7222, strO8222, strO9222, strO10222, strO11222, strO12222, strO13222, numT2222, listN222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case -991228994:
                    if (strO.equals("cloud_cards_tiers_cloud_discounted")) {
                        enumC1982eO = EnumC1982eO.f64019Z;
                        EnumC1982eO enumC1982eO22222 = enumC1982eO;
                        String strO22222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO32222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO42222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO52222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO62222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO72222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO82222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO92222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO102222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO112222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO122222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO132222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT22222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr2222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN2222 = jSONArrayNr2222 != null ? WK.w6.n(jSONArrayNr2222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO22222, strO22222, strO32222, strO42222, strO52222, strO62222, strO72222, strO82222, strO92222, strO102222, strO112222, strO122222, strO132222, numT22222, listN2222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case -91826654:
                    if (strO.equals(USEaHtCMH.fAGCgDJDXYRQSK)) {
                        enumC1982eO = EnumC1982eO.f64016O;
                        EnumC1982eO enumC1982eO222222 = enumC1982eO;
                        String strO222222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO322222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO422222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO522222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO622222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO722222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO822222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO922222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO1022222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO1122222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO1222222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO1322222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT222222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr22222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN22222 = jSONArrayNr22222 != null ? WK.w6.n(jSONArrayNr22222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO222222, strO222222, strO322222, strO422222, strO522222, strO622222, strO722222, strO822222, strO922222, strO1022222, strO1122222, strO1222222, strO1322222, numT222222, listN22222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case 1151760247:
                    if (strO.equals("cloud_one_chance")) {
                        enumC1982eO = EnumC1982eO.f64021g;
                        EnumC1982eO enumC1982eO2222222 = enumC1982eO;
                        String strO2222222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO3222222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO4222222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO5222222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO6222222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO7222222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO8222222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO9222222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO10222222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO11222222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO12222222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO13222222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT2222222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr222222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN222222 = jSONArrayNr222222 != null ? WK.w6.n(jSONArrayNr222222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO2222222, strO2222222, strO3222222, strO4222222, strO5222222, strO6222222, strO7222222, strO8222222, strO9222222, strO10222222, strO11222222, strO12222222, strO13222222, numT2222222, listN222222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case 1519378370:
                    if (strO.equals("cloud_countdown_24hrs_paywall")) {
                        enumC1982eO = EnumC1982eO.f64017S;
                        EnumC1982eO enumC1982eO22222222 = enumC1982eO;
                        String strO22222222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO32222222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO42222222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO52222222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO62222222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO72222222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO82222222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO92222222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO102222222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO112222222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO122222222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO132222222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT22222222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr2222222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN2222222 = jSONArrayNr2222222 != null ? WK.w6.n(jSONArrayNr2222222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO22222222, strO22222222, strO32222222, strO42222222, strO52222222, strO62222222, strO72222222, strO82222222, strO92222222, strO102222222, strO112222222, strO122222222, strO132222222, numT22222222, listN2222222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case 1536891843:
                    if (strO.equals("checkbox")) {
                        enumC1982eO = EnumC1982eO.f64022n;
                        EnumC1982eO enumC1982eO222222222 = enumC1982eO;
                        String strO222222222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO322222222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO422222222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO522222222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO622222222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO722222222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO822222222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO922222222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO1022222222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO1122222222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO1222222222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO1322222222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT222222222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr22222222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN22222222 = jSONArrayNr22222222 != null ? WK.w6.n(jSONArrayNr22222222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO222222222, strO222222222, strO322222222, strO422222222, strO522222222, strO622222222, strO722222222, strO822222222, strO922222222, strO1022222222, strO1122222222, strO1222222222, strO1322222222, numT222222222, listN22222222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
                case 2092548535:
                    if (strO.equals("cloud_upsell")) {
                        enumC1982eO = EnumC1982eO.f64023o;
                        EnumC1982eO enumC1982eO2222222222 = enumC1982eO;
                        String strO2222222222 = bIo.Wre.O(jSONObject, "normalProductId");
                        String strO3222222222 = bIo.Wre.O(jSONObject, "freeTrialProductId");
                        String strO4222222222 = bIo.Wre.O(jSONObject, "secondNormalProductId");
                        String strO5222222222 = bIo.Wre.O(jSONObject, "secondFreeTrialProductId");
                        String strO6222222222 = bIo.Wre.O(jSONObject, "normalUpsellProductId");
                        String strO7222222222 = bIo.Wre.O(jSONObject, "freeTrialUpsellProductId");
                        String strO8222222222 = bIo.Wre.O(jSONObject, "secondNormalUpsellProductId");
                        String strO9222222222 = bIo.Wre.O(jSONObject, "secondFreeTrialUpsellProductId");
                        String strO10222222222 = bIo.Wre.O(jSONObject, "normalDiscountedProductId");
                        String strO11222222222 = bIo.Wre.O(jSONObject, "freeTrialDiscountedProductId");
                        String strO12222222222 = bIo.Wre.O(jSONObject, "secondNormalDiscountedProductId");
                        String strO13222222222 = bIo.Wre.O(jSONObject, "secondFreeTrialDiscountedProductId");
                        Integer numT2222222222 = bIo.Wre.t(jSONObject, "defaultSelectionIndex");
                        JSONArray jSONArrayNr222222222 = bIo.Wre.nr(jSONObject, IYJfqUyym.eKYybn);
                        List listN222222222 = jSONArrayNr222222222 != null ? WK.w6.n(jSONArrayNr222222222, new Function1() { // from class: f.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1977Pl.J2(((Integer) obj).intValue());
                            }
                        }) : null;
                        numT = bIo.Wre.t(jSONObject, "isDismissedWithRewardedAd");
                        if (numT != null) {
                        }
                        return new C1972C(enumC1982eO2222222222, strO2222222222, strO3222222222, strO4222222222, strO5222222222, strO6222222222, strO7222222222, strO8222222222, strO9222222222, strO10222222222, strO11222222222, strO12222222222, strO13222222222, numT2222222222, listN222222222, Boolean.valueOf(z2), bIo.Wre.n(jSONObject, "arrowBeforeDismissible"));
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(sqD.w6 w6Var, ComponentActivity componentActivity, ComponentActivity componentActivity2, C1972C c1972c, xAo.n nVar, nYs.Ml ml, Zzk.j jVar, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        if (resultCode == -3) {
            w6Var.t(AbstractC1979Xo.n.f64006n);
        } else if (resultCode == -2) {
            w6Var.t(AbstractC1979Xo.j.f64005n);
        } else if (resultCode == -1) {
            w6Var.t(AbstractC1979Xo.w6.f64007n);
        } else if (resultCode == 0) {
            GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new n(componentActivity2, w6Var, c1972c, nVar, ml, jVar, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0143, code lost:
    
        if (r21.rl(r1, r16, r3) == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[PHI: r0 r5 r10 r11 r12 r13 r14 r15
      0x0120: PHI (r0v1 androidx.activity.ComponentActivity) = (r0v0 androidx.activity.ComponentActivity), (r0v5 androidx.activity.ComponentActivity) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r5v4 android.content.Intent) = (r5v3 android.content.Intent), (r5v5 android.content.Intent) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r10v7 Zzk.j) = (r10v2 Zzk.j), (r10v9 Zzk.j) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r11v5 f.C) = (r11v0 f.C), (r11v7 f.C) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r12v4 xAo.n) = (r12v0 xAo.n), (r12v7 xAo.n) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r13v3 nYs.Ml) = (r13v0 nYs.Ml), (r13v5 nYs.Ml) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r14v5 sqD.w6) = (r14v0 sqD.w6), (r14v7 sqD.w6) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r15v5 androidx.activity.ComponentActivity) = (r15v0 androidx.activity.ComponentActivity), (r15v7 androidx.activity.ComponentActivity) binds: [B:36:0x0115, B:33:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(ComponentActivity componentActivity, sqD.w6 w6Var, C1972C c1972c, xAo.n nVar, nYs.Ml ml, Zzk.j jVar, Continuation continuation) {
        j jVar2;
        Intent intent;
        C1972C c1972c2;
        xAo.n nVar2;
        nYs.Ml ml2;
        ComponentActivity componentActivity2;
        Zzk.j jVar3;
        sqD.w6 w6Var2;
        StackedIntroOffersEntity stackedIntroOffersEntityN;
        Intent intent2;
        ComponentActivity componentActivity3 = componentActivity;
        if (continuation instanceof j) {
            jVar2 = (j) continuation;
            int i2 = jVar2.f63983e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.f63983e = i2 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(continuation);
            }
        }
        Object obj = jVar2.E2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar2.f63983e;
        boolean z2 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            com.alightcreative.app.motion.persist.j jVar4 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar4.setPaywallNumber(jVar4.getPaywallNumber() + 1);
            sqD.CN3 cn3Rl = w6Var.rl();
            intent = new Intent(componentActivity3, (Class<?>) PaywallActivity.class);
            intent.putExtra("hook", cn3Rl.getValue());
            intent.putExtras(c1972c.n());
            nYs.j jVarInvoke = ml.invoke();
            if (jVarInvoke == null || (stackedIntroOffersEntityN = jVarInvoke.N()) == null) {
                c1972c2 = c1972c;
                nVar2 = nVar;
                ml2 = ml;
                componentActivity2 = componentActivity3;
                jVar3 = jVar;
                w6Var2 = w6Var;
                intent2 = intent;
                final ComponentActivity componentActivity4 = componentActivity3;
                final Zzk.j jVar5 = jVar3;
                final C1972C c1972c3 = c1972c2;
                final xAo.n nVar3 = nVar2;
                final nYs.Ml ml3 = ml2;
                final sqD.w6 w6Var3 = w6Var2;
                final ComponentActivity componentActivity5 = componentActivity2;
                Function1 function1 = new Function1() { // from class: f.qz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AbstractC1977Pl.nr(w6Var3, componentActivity4, componentActivity5, c1972c3, nVar3, ml3, jVar5, (ActivityResult) obj2);
                    }
                };
                jVar2.f63985n = null;
                jVar2.f63988t = null;
                jVar2.f63980O = null;
                jVar2.J2 = null;
                jVar2.f63987r = null;
                jVar2.f63986o = null;
                jVar2.f63982Z = null;
                jVar2.f63981S = null;
                jVar2.f63984g = null;
                jVar2.f63983e = 2;
            } else {
                Intent intentN = StackedOffersPaywallActivity.INSTANCE.n(componentActivity3, stackedIntroOffersEntityN, Intrinsics.areEqual(c1972c.rl(), Boxing.boxBoolean(true)));
                if (stackedIntroOffersEntityN.isEnabled()) {
                    jVar2.f63985n = componentActivity3;
                    jVar2.f63988t = w6Var;
                    c1972c2 = c1972c;
                    jVar2.f63980O = c1972c2;
                    nVar2 = nVar;
                    jVar2.J2 = nVar2;
                    ml2 = ml;
                    jVar2.f63987r = ml2;
                    jVar2.f63986o = jVar;
                    jVar2.f63982Z = componentActivity3;
                    jVar2.f63981S = intent;
                    jVar2.f63984g = intentN;
                    jVar2.f63983e = 1;
                    Object objN = j.C0462j.n(jVar, false, jVar2, 1, null);
                    if (objN != coroutine_suspended) {
                        jVar3 = jVar;
                        intent2 = intentN;
                        w6Var2 = w6Var;
                        obj = objN;
                        componentActivity2 = componentActivity3;
                    }
                    return coroutine_suspended;
                }
                c1972c2 = c1972c;
                nVar2 = nVar;
                ml2 = ml;
                jVar3 = jVar;
                intent2 = intentN;
                componentActivity2 = componentActivity3;
                w6Var2 = w6Var;
                if (!z2) {
                    intent2 = null;
                }
                if (intent2 == null) {
                    intent2 = intent;
                }
                final ComponentActivity componentActivity42 = componentActivity3;
                final Zzk.j jVar52 = jVar3;
                final C1972C c1972c32 = c1972c2;
                final xAo.n nVar32 = nVar2;
                final nYs.Ml ml32 = ml2;
                final sqD.w6 w6Var32 = w6Var2;
                final ComponentActivity componentActivity52 = componentActivity2;
                Function1 function12 = new Function1() { // from class: f.qz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AbstractC1977Pl.nr(w6Var32, componentActivity42, componentActivity52, c1972c32, nVar32, ml32, jVar52, (ActivityResult) obj2);
                    }
                };
                jVar2.f63985n = null;
                jVar2.f63988t = null;
                jVar2.f63980O = null;
                jVar2.J2 = null;
                jVar2.f63987r = null;
                jVar2.f63986o = null;
                jVar2.f63982Z = null;
                jVar2.f63981S = null;
                jVar2.f63984g = null;
                jVar2.f63983e = 2;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            Intent intent3 = (Intent) jVar2.f63984g;
            Intent intent4 = (Intent) jVar2.f63981S;
            ComponentActivity componentActivity6 = (ComponentActivity) jVar2.f63982Z;
            jVar3 = (Zzk.j) jVar2.f63986o;
            nYs.Ml ml4 = (nYs.Ml) jVar2.f63987r;
            nVar2 = (xAo.n) jVar2.J2;
            C1972C c1972c4 = (C1972C) jVar2.f63980O;
            w6Var2 = (sqD.w6) jVar2.f63988t;
            componentActivity2 = (ComponentActivity) jVar2.f63985n;
            ResultKt.throwOnFailure(obj);
            intent2 = intent3;
            componentActivity3 = componentActivity6;
            intent = intent4;
            ml2 = ml4;
            c1972c2 = c1972c4;
        }
        if (((Boolean) obj).booleanValue()) {
            z2 = true;
        }
        if (!z2) {
        }
        if (intent2 == null) {
        }
        final ComponentActivity componentActivity422 = componentActivity3;
        final Zzk.j jVar522 = jVar3;
        final C1972C c1972c322 = c1972c2;
        final xAo.n nVar322 = nVar2;
        final nYs.Ml ml322 = ml2;
        final sqD.w6 w6Var322 = w6Var2;
        final ComponentActivity componentActivity522 = componentActivity2;
        Function1 function122 = new Function1() { // from class: f.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC1977Pl.nr(w6Var322, componentActivity422, componentActivity522, c1972c322, nVar322, ml322, jVar522, (ActivityResult) obj2);
            }
        };
        jVar2.f63985n = null;
        jVar2.f63988t = null;
        jVar2.f63980O = null;
        jVar2.J2 = null;
        jVar2.f63987r = null;
        jVar2.f63986o = null;
        jVar2.f63982Z = null;
        jVar2.f63981S = null;
        jVar2.f63984g = null;
        jVar2.f63983e = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer J2(int i2) {
        return Integer.valueOf(i2);
    }
}
