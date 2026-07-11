package com.bendingspoons.monopoly.product;

import YV.CN3;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.Wre;
import com.bendingspoons.monopoly.product.BasePlan;
import com.bendingspoons.monopoly.product.Offer;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x0X.n;
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00012B?\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JH\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019¨\u00063"}, d2 = {"Lcom/bendingspoons/monopoly/product/SubscriptionProduct;", "", "", "productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "title", "description", "", "Lcom/bendingspoons/monopoly/product/BasePlan;", "basePlans", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "basePlanId", "getBasePlan", "(Ljava/lang/String;)Lcom/bendingspoons/monopoly/product/BasePlan;", "offerId", "Lcom/bendingspoons/monopoly/product/Offer;", "getOffer", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/monopoly/product/Offer;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bendingspoons/monopoly/product/SubscriptionProduct;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getName", "getTitle", "getDescription", "Ljava/util/List;", "getBasePlans", "getOffers", "offers", "getFreeTrialOffers", "freeTrialOffers", "getIntroPriceOffers", "introPriceOffers", "Companion", "j", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionProduct.kt\ncom/bendingspoons/monopoly/product/SubscriptionProduct\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1368#2:123\n1454#2,5:124\n1368#2:129\n1454#2,5:130\n1368#2:135\n1454#2,5:136\n1#3:141\n*S KotlinDebug\n*F\n+ 1 SubscriptionProduct.kt\ncom/bendingspoons/monopoly/product/SubscriptionProduct\n*L\n42#1:123\n42#1:124,5\n48#1:129\n48#1:130,5\n55#1:135\n55#1:136,5\n*E\n"})
public final /* data */ class SubscriptionProduct {
    private final List<BasePlan> basePlans;
    private final String description;
    private final String name;
    private final String productId;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.bendingspoons.monopoly.product.SubscriptionProduct$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final n t(final Wre productDetails) {
            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
            n nVarN = w6.n(new Function0() { // from class: KNH.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubscriptionProduct.Companion.rl(productDetails);
                }
            });
            if (!(nVarN instanceof n.C1266n)) {
                if (nVarN instanceof n.w6) {
                    return nVarN;
                }
                throw new NoWhenBranchMatchedException();
            }
            Throwable th = (Throwable) ((n.C1266n) nVarN).n();
            CN3.j jVar = CN3.f12097t;
            String strNr = productDetails.nr();
            Intrinsics.checkNotNullExpressionValue(strNr, "getProductId(...)");
            return new n.C1266n(jVar.nr(strNr, th));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SubscriptionProduct rl(Wre wre) {
            List listJ2 = wre.J2();
            if (listJ2 != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listJ2) {
                    if (((Wre.I28) obj).rl() == null) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List<Wre.I28> list = (List) pair.component1();
                List<Wre.I28> list2 = (List) pair.component2();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (Wre.I28 i28 : list2) {
                    Offer.Companion companion = Offer.INSTANCE;
                    Intrinsics.checkNotNull(i28);
                    String strNr = wre.nr();
                    Intrinsics.checkNotNullExpressionValue(strNr, "getProductId(...)");
                    n nVarT = companion.t(i28, strNr);
                    if (!(nVarT instanceof n.C1266n)) {
                        if (nVarT instanceof n.w6) {
                            arrayList3.add((Offer) ((n.w6) nVarT).n());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw new IllegalArgumentException("Failed to convert offer " + i28.rl() + " to Offer.", (Throwable) ((n.C1266n) nVarT).n());
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Wre.I28 i282 : list) {
                    BasePlan.Companion companion2 = BasePlan.INSTANCE;
                    Intrinsics.checkNotNull(i282);
                    String strNr2 = wre.nr();
                    Intrinsics.checkNotNullExpressionValue(strNr2, "getProductId(...)");
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (Intrinsics.areEqual(((Offer) obj2).getBasePlanId(), i282.n())) {
                            arrayList5.add(obj2);
                        }
                    }
                    n nVarT2 = companion2.t(i282, strNr2, arrayList5);
                    if (!(nVarT2 instanceof n.C1266n)) {
                        if (nVarT2 instanceof n.w6) {
                            arrayList4.add((BasePlan) ((n.w6) nVarT2).n());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw new IllegalArgumentException("Failed to convert base plan " + i282.n() + " to BasePlan.", (Throwable) ((n.C1266n) nVarT2).n());
                    }
                }
                String strNr3 = wre.nr();
                Intrinsics.checkNotNullExpressionValue(strNr3, "getProductId(...)");
                String strRl = wre.rl();
                Intrinsics.checkNotNullExpressionValue(strRl, "getName(...)");
                String strUo = wre.Uo();
                Intrinsics.checkNotNullExpressionValue(strUo, "getTitle(...)");
                String strN = wre.n();
                Intrinsics.checkNotNullExpressionValue(strN, "getDescription(...)");
                return new SubscriptionProduct(strNr3, strRl, strUo, strN, arrayList4);
            }
            throw new IllegalArgumentException("productDetails.subscriptionOfferDetails must not be null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionProduct copy$default(SubscriptionProduct subscriptionProduct, String str, String str2, String str3, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscriptionProduct.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = subscriptionProduct.name;
        }
        if ((i2 & 4) != 0) {
            str3 = subscriptionProduct.title;
        }
        if ((i2 & 8) != 0) {
            str4 = subscriptionProduct.description;
        }
        if ((i2 & 16) != 0) {
            list = subscriptionProduct.basePlans;
        }
        List list2 = list;
        String str5 = str3;
        return subscriptionProduct.copy(str, str2, str5, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<BasePlan> component5() {
        return this.basePlans;
    }

    public final SubscriptionProduct copy(@Json(name = "product_id") String productId, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "base_plans") List<BasePlan> basePlans) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(basePlans, "basePlans");
        return new SubscriptionProduct(productId, name, title, description, basePlans);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProduct)) {
            return false;
        }
        SubscriptionProduct subscriptionProduct = (SubscriptionProduct) other;
        return Intrinsics.areEqual(this.productId, subscriptionProduct.productId) && Intrinsics.areEqual(this.name, subscriptionProduct.name) && Intrinsics.areEqual(this.title, subscriptionProduct.title) && Intrinsics.areEqual(this.description, subscriptionProduct.description) && Intrinsics.areEqual(this.basePlans, subscriptionProduct.basePlans);
    }

    public int hashCode() {
        return (((((((this.productId.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.basePlans.hashCode();
    }

    public String toString() {
        return "SubscriptionProduct(productId=" + this.productId + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", basePlans=" + this.basePlans + ")";
    }

    public SubscriptionProduct(@Json(name = "product_id") String productId, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "base_plans") List<BasePlan> basePlans) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(basePlans, "basePlans");
        this.productId = productId;
        this.name = name;
        this.title = title;
        this.description = description;
        this.basePlans = basePlans;
    }

    public final BasePlan getBasePlan(String basePlanId) {
        Object next;
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Iterator<T> it = this.basePlans.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((BasePlan) next).getBasePlanId(), basePlanId)) {
                break;
            }
        }
        return (BasePlan) next;
    }

    public final List<BasePlan> getBasePlans() {
        return this.basePlans;
    }

    public String getDescription() {
        return this.description;
    }

    public final List<Offer> getFreeTrialOffers() {
        List<BasePlan> list = this.basePlans;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((BasePlan) it.next()).getFreeTrialOffers());
        }
        return arrayList;
    }

    public final List<Offer> getIntroPriceOffers() {
        List<BasePlan> list = this.basePlans;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((BasePlan) it.next()).getIntroPriceOffers());
        }
        return arrayList;
    }

    public String getName() {
        return this.name;
    }

    public final Offer getOffer(String basePlanId, String offerId) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        BasePlan basePlan = getBasePlan(basePlanId);
        if (basePlan != null) {
            return basePlan.getOffer(offerId);
        }
        return null;
    }

    public final List<Offer> getOffers() {
        List<BasePlan> list = this.basePlans;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((BasePlan) it.next()).getOffers());
        }
        return arrayList;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getTitle() {
        return this.title;
    }
}
