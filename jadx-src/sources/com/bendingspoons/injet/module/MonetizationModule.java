package com.bendingspoons.injet.module;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class MonetizationModule implements j8.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f51306n = 0;

    public static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51307O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51308n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51309t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51307O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C c2 = new C(this.f51307O, continuation);
            c2.f51309t = obj;
            return c2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((C) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            String json;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51308n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(List.class).toJson(objNr);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            } else {
                                json = null;
                            }
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51307O;
                Unit unit = Unit.INSTANCE;
                this.f51308n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    public static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51312O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51313n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51314t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dsr(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51312O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = new Dsr(this.f51312O, continuation);
            dsr.f51314t = obj;
            return dsr;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Dsr) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objFromJson;
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51313n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    nVar = (x0X.n) obj;
                    if (!(nVar instanceof n.w6)) {
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + JsonUtils.EMPTY_JSON + "\n                }\n            ");
                    }
                    Throwable th = (Throwable) x0X.w6.rl(nVar);
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "Unknown error";
                    }
                    return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f51314t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51312O;
                this.f51313n = 2;
                obj = function2.invoke(objFromJson, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$PaymentMode;", "", "<init>", "(Ljava/lang/String;I)V", "FREE_TRIAL", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PaymentMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentMode[] $VALUES;

        @Json(name = "freeTrial")
        public static final PaymentMode FREE_TRIAL = new PaymentMode("FREE_TRIAL", 0);

        private static final /* synthetic */ PaymentMode[] $values() {
            return new PaymentMode[]{FREE_TRIAL};
        }

        public static EnumEntries<PaymentMode> getEntries() {
            return $ENTRIES;
        }

        static {
            PaymentMode[] paymentModeArr$values = $values();
            $VALUES = paymentModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(paymentModeArr$values);
        }

        public static PaymentMode valueOf(String str) {
            return (PaymentMode) Enum.valueOf(PaymentMode.class, str);
        }

        public static PaymentMode[] values() {
            return (PaymentMode[]) $VALUES.clone();
        }

        private PaymentMode(String str, int i2) {
        }
    }

    public static final class Pl extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51319O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51320n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51321t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pl(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51319O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Pl pl = new Pl(this.f51319O, continuation);
            pl.f51321t = obj;
            return pl;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Pl) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            String json;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51320n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(Boolean.class).toJson(objNr);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            } else {
                                json = null;
                            }
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51319O;
                Unit unit = Unit.INSTANCE;
                this.f51320n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$Product;", "", "id", "", "price", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;", "subscriptionPeriod", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;", "introductoryOffer", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductIntroductoryOffer;", "<init>", "(Ljava/lang/String;Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;Lcom/bendingspoons/injet/module/MonetizationModule$ProductIntroductoryOffer;)V", "getId", "()Ljava/lang/String;", "getPrice", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;", "getSubscriptionPeriod", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;", "getIntroductoryOffer", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductIntroductoryOffer;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 0;
        private final String id;
        private final ProductIntroductoryOffer introductoryOffer;
        private final ProductPrice price;
        private final ProductPeriod subscriptionPeriod;

        public static /* synthetic */ Product copy$default(Product product, String str, ProductPrice productPrice, ProductPeriod productPeriod, ProductIntroductoryOffer productIntroductoryOffer, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = product.id;
            }
            if ((i2 & 2) != 0) {
                productPrice = product.price;
            }
            if ((i2 & 4) != 0) {
                productPeriod = product.subscriptionPeriod;
            }
            if ((i2 & 8) != 0) {
                productIntroductoryOffer = product.introductoryOffer;
            }
            return product.copy(str, productPrice, productPeriod, productIntroductoryOffer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ProductPrice getPrice() {
            return this.price;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ProductPeriod getSubscriptionPeriod() {
            return this.subscriptionPeriod;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ProductIntroductoryOffer getIntroductoryOffer() {
            return this.introductoryOffer;
        }

        public final Product copy(@Json(name = "id") String id, @Json(name = "price") ProductPrice price, @Json(name = "subscriptionPeriod") ProductPeriod subscriptionPeriod, @Json(name = "introductoryOffer") ProductIntroductoryOffer introductoryOffer) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(subscriptionPeriod, "subscriptionPeriod");
            return new Product(id, price, subscriptionPeriod, introductoryOffer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.areEqual(this.id, product.id) && Intrinsics.areEqual(this.price, product.price) && Intrinsics.areEqual(this.subscriptionPeriod, product.subscriptionPeriod) && Intrinsics.areEqual(this.introductoryOffer, product.introductoryOffer);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.price.hashCode()) * 31) + this.subscriptionPeriod.hashCode()) * 31;
            ProductIntroductoryOffer productIntroductoryOffer = this.introductoryOffer;
            return iHashCode + (productIntroductoryOffer == null ? 0 : productIntroductoryOffer.hashCode());
        }

        public String toString() {
            return "Product(id=" + this.id + ", price=" + this.price + ", subscriptionPeriod=" + this.subscriptionPeriod + ", introductoryOffer=" + this.introductoryOffer + ")";
        }

        public Product(@Json(name = "id") String id, @Json(name = "price") ProductPrice price, @Json(name = "subscriptionPeriod") ProductPeriod subscriptionPeriod, @Json(name = "introductoryOffer") ProductIntroductoryOffer productIntroductoryOffer) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(subscriptionPeriod, "subscriptionPeriod");
            this.id = id;
            this.price = price;
            this.subscriptionPeriod = subscriptionPeriod;
            this.introductoryOffer = productIntroductoryOffer;
        }

        public final String getId() {
            return this.id;
        }

        public final ProductIntroductoryOffer getIntroductoryOffer() {
            return this.introductoryOffer;
        }

        public final ProductPrice getPrice() {
            return this.price;
        }

        public final ProductPeriod getSubscriptionPeriod() {
            return this.subscriptionPeriod;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$ProductIntroductoryOffer;", "", "price", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;", "period", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;", "paymentMode", "Lcom/bendingspoons/injet/module/MonetizationModule$PaymentMode;", "<init>", "(Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;Lcom/bendingspoons/injet/module/MonetizationModule$PaymentMode;)V", "getPrice", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;", "getPeriod", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;", "getPaymentMode", "()Lcom/bendingspoons/injet/module/MonetizationModule$PaymentMode;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductIntroductoryOffer {
        public static final int $stable = 0;
        private final PaymentMode paymentMode;
        private final ProductPeriod period;
        private final ProductPrice price;

        public static /* synthetic */ ProductIntroductoryOffer copy$default(ProductIntroductoryOffer productIntroductoryOffer, ProductPrice productPrice, ProductPeriod productPeriod, PaymentMode paymentMode, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                productPrice = productIntroductoryOffer.price;
            }
            if ((i2 & 2) != 0) {
                productPeriod = productIntroductoryOffer.period;
            }
            if ((i2 & 4) != 0) {
                paymentMode = productIntroductoryOffer.paymentMode;
            }
            return productIntroductoryOffer.copy(productPrice, productPeriod, paymentMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProductPrice getPrice() {
            return this.price;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ProductPeriod getPeriod() {
            return this.period;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final PaymentMode getPaymentMode() {
            return this.paymentMode;
        }

        public final ProductIntroductoryOffer copy(@Json(name = "price") ProductPrice price, @Json(name = "period") ProductPeriod period, @Json(name = "paymentMode") PaymentMode paymentMode) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
            return new ProductIntroductoryOffer(price, period, paymentMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductIntroductoryOffer)) {
                return false;
            }
            ProductIntroductoryOffer productIntroductoryOffer = (ProductIntroductoryOffer) other;
            return Intrinsics.areEqual(this.price, productIntroductoryOffer.price) && Intrinsics.areEqual(this.period, productIntroductoryOffer.period) && this.paymentMode == productIntroductoryOffer.paymentMode;
        }

        public int hashCode() {
            return (((this.price.hashCode() * 31) + this.period.hashCode()) * 31) + this.paymentMode.hashCode();
        }

        public String toString() {
            return "ProductIntroductoryOffer(price=" + this.price + ", period=" + this.period + ", paymentMode=" + this.paymentMode + ")";
        }

        public ProductIntroductoryOffer(@Json(name = "price") ProductPrice price, @Json(name = "period") ProductPeriod period, @Json(name = "paymentMode") PaymentMode paymentMode) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
            this.price = price;
            this.period = period;
            this.paymentMode = paymentMode;
        }

        public final PaymentMode getPaymentMode() {
            return this.paymentMode;
        }

        public final ProductPeriod getPeriod() {
            return this.period;
        }

        public final ProductPrice getPrice() {
            return this.price;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriod;", "", "unit", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicityUnit;", "numberOfUnits", "", "periodicity", "Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicity;", "<init>", "(Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicityUnit;ILcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicity;)V", "getUnit", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicityUnit;", "getNumberOfUnits", "()I", "getPeriodicity", "()Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicity;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPeriod {
        public static final int $stable = 0;
        private final int numberOfUnits;
        private final ProductPeriodicity periodicity;
        private final ProductPeriodicityUnit unit;

        public static /* synthetic */ ProductPeriod copy$default(ProductPeriod productPeriod, ProductPeriodicityUnit productPeriodicityUnit, int i2, ProductPeriodicity productPeriodicity, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                productPeriodicityUnit = productPeriod.unit;
            }
            if ((i3 & 2) != 0) {
                i2 = productPeriod.numberOfUnits;
            }
            if ((i3 & 4) != 0) {
                productPeriodicity = productPeriod.periodicity;
            }
            return productPeriod.copy(productPeriodicityUnit, i2, productPeriodicity);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProductPeriodicityUnit getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getNumberOfUnits() {
            return this.numberOfUnits;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ProductPeriodicity getPeriodicity() {
            return this.periodicity;
        }

        public final ProductPeriod copy(@Json(name = "unit") ProductPeriodicityUnit unit, @Json(name = "numberOfUnits") int numberOfUnits, @Json(name = "periodicity") ProductPeriodicity periodicity) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(periodicity, "periodicity");
            return new ProductPeriod(unit, numberOfUnits, periodicity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductPeriod)) {
                return false;
            }
            ProductPeriod productPeriod = (ProductPeriod) other;
            return this.unit == productPeriod.unit && this.numberOfUnits == productPeriod.numberOfUnits && this.periodicity == productPeriod.periodicity;
        }

        public int hashCode() {
            return (((this.unit.hashCode() * 31) + Integer.hashCode(this.numberOfUnits)) * 31) + this.periodicity.hashCode();
        }

        public String toString() {
            return "ProductPeriod(unit=" + this.unit + ", numberOfUnits=" + this.numberOfUnits + ", periodicity=" + this.periodicity + jhotmBbwMbr.vPWb;
        }

        public ProductPeriod(@Json(name = "unit") ProductPeriodicityUnit unit, @Json(name = "numberOfUnits") int i2, @Json(name = "periodicity") ProductPeriodicity productPeriodicity) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(productPeriodicity, HrvQKfmFZJudBc.jkaIh);
            this.unit = unit;
            this.numberOfUnits = i2;
            this.periodicity = productPeriodicity;
        }

        public final int getNumberOfUnits() {
            return this.numberOfUnits;
        }

        public final ProductPeriodicity getPeriodicity() {
            return this.periodicity;
        }

        public final ProductPeriodicityUnit getUnit() {
            return this.unit;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicity;", "", "<init>", "(Ljava/lang/String;I)V", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductPeriodicity {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProductPeriodicity[] $VALUES;

        @Json(name = "daily")
        public static final ProductPeriodicity DAILY = new ProductPeriodicity("DAILY", 0);

        @Json(name = "weekly")
        public static final ProductPeriodicity WEEKLY = new ProductPeriodicity("WEEKLY", 1);

        @Json(name = "monthly")
        public static final ProductPeriodicity MONTHLY = new ProductPeriodicity("MONTHLY", 2);

        @Json(name = "yearly")
        public static final ProductPeriodicity YEARLY = new ProductPeriodicity("YEARLY", 3);

        private static final /* synthetic */ ProductPeriodicity[] $values() {
            return new ProductPeriodicity[]{DAILY, WEEKLY, MONTHLY, YEARLY};
        }

        public static EnumEntries<ProductPeriodicity> getEntries() {
            return $ENTRIES;
        }

        static {
            ProductPeriodicity[] productPeriodicityArr$values = $values();
            $VALUES = productPeriodicityArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(productPeriodicityArr$values);
        }

        public static ProductPeriodicity valueOf(String str) {
            return (ProductPeriodicity) Enum.valueOf(ProductPeriodicity.class, str);
        }

        public static ProductPeriodicity[] values() {
            return (ProductPeriodicity[]) $VALUES.clone();
        }

        private ProductPeriodicity(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$ProductPeriodicityUnit;", "", "<init>", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductPeriodicityUnit {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProductPeriodicityUnit[] $VALUES;

        @Json(name = "day")
        public static final ProductPeriodicityUnit DAY = new ProductPeriodicityUnit("DAY", 0);

        @Json(name = "week")
        public static final ProductPeriodicityUnit WEEK = new ProductPeriodicityUnit("WEEK", 1);

        @Json(name = "month")
        public static final ProductPeriodicityUnit MONTH = new ProductPeriodicityUnit("MONTH", 2);

        @Json(name = "year")
        public static final ProductPeriodicityUnit YEAR = new ProductPeriodicityUnit("YEAR", 3);

        private static final /* synthetic */ ProductPeriodicityUnit[] $values() {
            return new ProductPeriodicityUnit[]{DAY, WEEK, MONTH, YEAR};
        }

        public static EnumEntries<ProductPeriodicityUnit> getEntries() {
            return $ENTRIES;
        }

        static {
            ProductPeriodicityUnit[] productPeriodicityUnitArr$values = $values();
            $VALUES = productPeriodicityUnitArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(productPeriodicityUnitArr$values);
        }

        public static ProductPeriodicityUnit valueOf(String str) {
            return (ProductPeriodicityUnit) Enum.valueOf(ProductPeriodicityUnit.class, str);
        }

        public static ProductPeriodicityUnit[] values() {
            return (ProductPeriodicityUnit[]) $VALUES.clone();
        }

        private ProductPeriodicityUnit(String str, int i2) {
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bendingspoons/injet/module/MonetizationModule$ProductPrice;", "", "priceAmount", "", "currencyCode", "", "<init>", "(DLjava/lang/String;)V", "getPriceAmount", "()D", "getCurrencyCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPrice {
        public static final int $stable = 0;
        private final String currencyCode;
        private final double priceAmount;

        public static /* synthetic */ ProductPrice copy$default(ProductPrice productPrice, double d2, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d2 = productPrice.priceAmount;
            }
            if ((i2 & 2) != 0) {
                str = productPrice.currencyCode;
            }
            return productPrice.copy(d2, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getPriceAmount() {
            return this.priceAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final ProductPrice copy(@Json(name = "priceAmount") double priceAmount, @Json(name = "currencyCode") String currencyCode) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            return new ProductPrice(priceAmount, currencyCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductPrice)) {
                return false;
            }
            ProductPrice productPrice = (ProductPrice) other;
            return Double.compare(this.priceAmount, productPrice.priceAmount) == 0 && Intrinsics.areEqual(this.currencyCode, productPrice.currencyCode);
        }

        public int hashCode() {
            return (Double.hashCode(this.priceAmount) * 31) + this.currencyCode.hashCode();
        }

        public String toString() {
            return "ProductPrice(priceAmount=" + this.priceAmount + ", currencyCode=" + this.currencyCode + ")";
        }

        public ProductPrice(@Json(name = "priceAmount") double d2, @Json(name = "currencyCode") String currencyCode) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.priceAmount = d2;
            this.currencyCode = currencyCode;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final double getPriceAmount() {
            return this.priceAmount;
        }
    }

    public static final class Xo extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51324O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51325n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51326t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Xo(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51324O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Xo xo = new Xo(this.f51324O, continuation);
            xo.f51326t = obj;
            return xo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Xo) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            String json;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51325n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(Integer.class).toJson(objNr);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            } else {
                                json = null;
                            }
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51324O;
                Unit unit = Unit.INSTANCE;
                this.f51325n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    public static final class aC extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51327O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51328n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51329t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aC(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51327O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            aC aCVar = new aC(this.f51327O, continuation);
            aCVar.f51329t = obj;
            return aCVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((aC) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51328n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + JsonUtils.EMPTY_JSON + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51327O;
                Unit unit = Unit.INSTANCE;
                this.f51328n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    public static final class eO extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51330O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51331n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51332t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eO(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51330O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            eO eOVar = new eO(this.f51330O, continuation);
            eOVar.f51332t = obj;
            return eOVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((eO) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51331n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + JsonUtils.EMPTY_JSON + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51330O;
                Unit unit = Unit.INSTANCE;
                this.f51331n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51336n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51337t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = MonetizationModule.this.new j(continuation);
            jVar.f51337t = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((j) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51336n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f51337t;
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51336n = 1;
            Object objXMQ = monetizationModule.xMQ(str, this);
            if (objXMQ == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objXMQ;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51340O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51341n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51342t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51340O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            o oVar = new o(this.f51340O, continuation);
            oVar.f51342t = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((o) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            String json;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51341n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(String.class).toJson(objNr);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            } else {
                                json = null;
                            }
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51340O;
                Unit unit = Unit.INSTANCE;
                this.f51341n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    public static final class qz extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51343O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51344n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51345t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qz(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51343O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            qz qzVar = new qz(this.f51343O, continuation);
            qzVar.f51345t = obj;
            return qzVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((qz) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            String json;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51344n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(Boolean.class).toJson(objNr);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            } else {
                                json = null;
                            }
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f51343O;
                Unit unit = Unit.INSTANCE;
                this.f51344n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    public abstract Object J2(Continuation continuation);

    public abstract Object KN(Continuation continuation);

    public abstract Object O(Continuation continuation);

    public abstract Object Uo(Continuation continuation);

    public abstract Object mUb(Continuation continuation);

    public abstract Object nr(Continuation continuation);

    public abstract Object t(Continuation continuation);

    public abstract Object xMQ(String str, Continuation continuation);

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51310n;

        CN3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new CN3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((CN3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51310n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51310n = 1;
            Object objJ2 = monetizationModule.J2(this);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objJ2;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51315n;

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new I28(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((I28) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51315n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51315n = 1;
            Object objO = monetizationModule.O(this);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objO;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51317n;

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new Ml(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((Ml) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51317n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51317n = 1;
            Object objT = monetizationModule.t(this);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objT;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51322n;

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new Wre(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((Wre) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51322n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51322n = 1;
            Object objNr = monetizationModule.nr(this);
            if (objNr == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objNr;
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51333n;

        fuX(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new fuX(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((fuX) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51333n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51333n = 1;
            Object objKN = monetizationModule.KN(this);
            if (objKN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objKN;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51338n;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((n) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51338n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51338n = 1;
            Object objMUb = monetizationModule.mUb(this);
            if (objMUb == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objMUb;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51346n;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MonetizationModule.this.new w6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((w6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51346n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MonetizationModule monetizationModule = MonetizationModule.this;
            this.f51346n = 1;
            Object objUo = monetizationModule.Uo(this);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUo;
        }
    }

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n("purchase", new Dsr(new j(null), null));
        scope.n("restore", new aC(new n(null), null));
        scope.n("getProducts", new C(new w6(null), null));
        scope.n("getActiveProductId", new o(new Ml(null), null));
        scope.n("getIsUserPro", new qz(new I28(null), null));
        scope.n("getIsUserEligibleForFreeTrial", new Pl(new Wre(null), null));
        scope.n("getPaywallHits", new Xo(new CN3(null), null));
        scope.n("incrementPaywallHits", new eO(new fuX(null), null));
    }

    @Override // j8.j
    public String rl() {
        return "Monetization";
    }
}
