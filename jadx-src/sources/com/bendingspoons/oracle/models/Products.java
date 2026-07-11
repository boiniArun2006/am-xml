package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Wre;
import Du.i;
import Du.vd;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.oracle.models.Consumable;
import com.bendingspoons.oracle.models.NonConsumable;
import com.bendingspoons.oracle.models.Subscription;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import gi.I28;
import gi.w6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B7\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010+R.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010+R.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010(\u0012\u0004\b3\u0010-\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010+¨\u00067"}, d2 = {"Lcom/bendingspoons/oracle/models/Products;", "", "", "Lcom/bendingspoons/oracle/models/Consumable;", "consumables", "Lcom/bendingspoons/oracle/models/NonConsumable;", "nonConsumables", "Lcom/bendingspoons/oracle/models/Subscription;", "subscriptions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/Products;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/bendingspoons/oracle/models/Products;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConsumables", "setConsumables", "(Ljava/util/List;)V", "getConsumables$annotations", "()V", "getNonConsumables", "setNonConsumables", "getNonConsumables$annotations", "getSubscriptions", "setSubscriptions", "getSubscriptions$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class Products {
    private List<Consumable> consumables;
    private List<NonConsumable> nonConsumables;
    private List<Subscription> subscriptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    private static final Ml[] $childSerializers = {new Wre(Consumable.j.f51422n), new Wre(NonConsumable.j.f51427n), new Wre(Subscription.j.f51432n)};

    public /* synthetic */ class j implements vd {
        private static final EJn.Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51429n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51429n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.Products", jVar, 3);
            dc.HI("consumables", true);
            dc.HI("non_consumables", true);
            dc.HI("subscriptions", true);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final EJn.Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final Products deserialize(I28 decoder) {
            int i2;
            List list;
            List list2;
            List list3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            EJn.Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            Ml[] mlArr = Products.$childSerializers;
            List list4 = null;
            if (w6VarRl.HI()) {
                List list5 = (List) w6VarRl.fD(wre, 0, mlArr[0], null);
                List list6 = (List) w6VarRl.fD(wre, 1, mlArr[1], null);
                list3 = (List) w6VarRl.fD(wre, 2, mlArr[2], null);
                list = list5;
                i2 = 7;
                list2 = list6;
            } else {
                boolean z2 = true;
                int i3 = 0;
                List list7 = null;
                List list8 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        list4 = (List) w6VarRl.fD(wre, 0, mlArr[0], list4);
                        i3 |= 1;
                    } else if (iNY == 1) {
                        list7 = (List) w6VarRl.fD(wre, 1, mlArr[1], list7);
                        i3 |= 2;
                    } else {
                        if (iNY != 2) {
                            throw new UnknownFieldException(iNY);
                        }
                        list8 = (List) w6VarRl.fD(wre, 2, mlArr[2], list8);
                        i3 |= 4;
                    }
                }
                i2 = i3;
                list = list4;
                list2 = list7;
                list3 = list8;
            }
            w6VarRl.t(wre);
            return new Products(i2, list, list2, list3, (i) null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, Products value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            EJn.Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            Products.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Ml[] mlArr = Products.$childSerializers;
            return new Ml[]{mlArr[0], mlArr[1], mlArr[2]};
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.Products$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51429n;
        }
    }

    public Products() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Products copy$default(Products products, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = products.consumables;
        }
        if ((i2 & 2) != 0) {
            list2 = products.nonConsumables;
        }
        if ((i2 & 4) != 0) {
            list3 = products.subscriptions;
        }
        return products.copy(list, list2, list3);
    }

    public static /* synthetic */ void getConsumables$annotations() {
    }

    public static /* synthetic */ void getNonConsumables$annotations() {
    }

    public static /* synthetic */ void getSubscriptions$annotations() {
    }

    public final List<Consumable> component1() {
        return this.consumables;
    }

    public final List<NonConsumable> component2() {
        return this.nonConsumables;
    }

    public final List<Subscription> component3() {
        return this.subscriptions;
    }

    public final Products copy(@Json(name = "consumables") List<Consumable> consumables, @Json(name = "non_consumables") List<NonConsumable> nonConsumables, @Json(name = "subscriptions") List<Subscription> subscriptions) {
        Intrinsics.checkNotNullParameter(consumables, "consumables");
        Intrinsics.checkNotNullParameter(nonConsumables, "nonConsumables");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        return new Products(consumables, nonConsumables, subscriptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Products)) {
            return false;
        }
        Products products = (Products) other;
        return Intrinsics.areEqual(this.consumables, products.consumables) && Intrinsics.areEqual(this.nonConsumables, products.nonConsumables) && Intrinsics.areEqual(this.subscriptions, products.subscriptions);
    }

    public int hashCode() {
        return (((this.consumables.hashCode() * 31) + this.nonConsumables.hashCode()) * 31) + this.subscriptions.hashCode();
    }

    public String toString() {
        return "Products(consumables=" + this.consumables + ", nonConsumables=" + this.nonConsumables + ", subscriptions=" + this.subscriptions + ")";
    }

    public /* synthetic */ Products(int i2, List list, List list2, List list3, i iVar) {
        this.consumables = (i2 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i2 & 2) == 0) {
            this.nonConsumables = CollectionsKt.emptyList();
        } else {
            this.nonConsumables = list2;
        }
        if ((i2 & 4) == 0) {
            this.subscriptions = CollectionsKt.emptyList();
        } else {
            this.subscriptions = list3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(Products self, gi.Ml output, EJn.Wre serialDesc) {
        Ml[] mlArr = $childSerializers;
        if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.consumables, CollectionsKt.emptyList())) {
            output.S(serialDesc, 0, mlArr[0], self.consumables);
        }
        if (output.r(serialDesc, 1) || !Intrinsics.areEqual(self.nonConsumables, CollectionsKt.emptyList())) {
            output.S(serialDesc, 1, mlArr[1], self.nonConsumables);
        }
        if (!output.r(serialDesc, 2) && Intrinsics.areEqual(self.subscriptions, CollectionsKt.emptyList())) {
            return;
        }
        output.S(serialDesc, 2, mlArr[2], self.subscriptions);
    }

    public final List<Consumable> getConsumables() {
        return this.consumables;
    }

    public final List<NonConsumable> getNonConsumables() {
        return this.nonConsumables;
    }

    public final List<Subscription> getSubscriptions() {
        return this.subscriptions;
    }

    public final void setConsumables(List<Consumable> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.consumables = list;
    }

    public final void setNonConsumables(List<NonConsumable> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.nonConsumables = list;
    }

    public final void setSubscriptions(List<Subscription> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.subscriptions = list;
    }

    public Products(@Json(name = "consumables") List<Consumable> consumables, @Json(name = "non_consumables") List<NonConsumable> nonConsumables, @Json(name = "subscriptions") List<Subscription> subscriptions) {
        Intrinsics.checkNotNullParameter(consumables, "consumables");
        Intrinsics.checkNotNullParameter(nonConsumables, "nonConsumables");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.consumables = consumables;
        this.nonConsumables = nonConsumables;
        this.subscriptions = subscriptions;
    }

    public /* synthetic */ Products(List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
