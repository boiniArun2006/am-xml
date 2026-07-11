package YV;

import aT.dE.JLZo;
import ajd.j;
import cS.Zv.SzFNXybiSxdx;
import com.bendingspoons.monopoly.contracts.j;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pq.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f12114n = new Ml();

    public static /* synthetic */ ajd.j nr(Ml ml, List list, CN3 cn3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cn3 = null;
        }
        return ml.t(list, cn3);
    }

    public final ajd.j HI() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "update", "userCancelled"}), null, SzFNXybiSxdx.OjlXmgyM, null, null, 26, null);
    }

    public final ajd.j Ik(fE.j error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"one_time_product", "purchases", "query", "failed"}), j.EnumC0481j.J2, "Failed to query one-time product purchases.", error.n().name(), pq.I28.n(pq.n.O("error_message", error.rl())));
    }

    public final ajd.j J2(String productId, fE.j error) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "acknowledge", "failed"}), null, "Failed to acknowledge a purchase: " + error.rl(), null, pq.I28.n(pq.n.O("productId", productId)), 10, null);
    }

    public final ajd.j KN(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "acknowledge", "success"}), null, "Acknowledged a new purchase with success.", null, pq.I28.n(pq.n.O("productId", productId)), 10, null);
    }

    public final ajd.j O(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"non_consumables", "acknowledge"}), null, null, null, pq.I28.n(pq.n.O("productId", productId)), 14, null);
    }

    public final ajd.j S() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "verification", YjqZUJsVmhcjko.YKFZziITTiwyIv, JLZo.nCDaTiIUDobg}), j.EnumC0481j.J2, "Received a new purchase to verify but wasn't able to connect.", null, null, 24, null);
    }

    public final ajd.j Uo() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchases", "acknowledge", "failed", "notConnected"}), j.EnumC0481j.f13101O, "Received a new purchase to acknowledge but wasn't able to connect.", null, null, 24, null);
    }

    public final ajd.j ViF(String str) {
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"purchase", "verification", "success"});
        pq.Ml ml = new pq.Ml();
        if (str != null) {
            ml.O("productId", str);
        }
        Unit unit = Unit.INSTANCE;
        return new ajd.j(listListOf, null, "Verified a new purchase.", null, ml, 10, null);
    }

    public final ajd.j WPU(List purchases, String str) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"purchase", "verification", "failed", "invalidPurchases"});
        j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
        pq.Ml ml = new pq.Ml();
        Iterator it = purchases.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            String str2 = "existingProductId" + i2;
            String strT = ((o) it.next()).t();
            if (strT == null) {
                strT = "";
            }
            ml.O(str2, strT);
            i2 = i3;
        }
        if (str != null) {
            ml.O("newProductId", str);
        }
        Unit unit = Unit.INSTANCE;
        return new ajd.j(listListOf, enumC0481j, "Monopoly encountered invalid purchases. ", null, ml, 8, null);
    }

    public final ajd.j XQ(j.C0725j verifyResult, List purchases, String str) {
        Intrinsics.checkNotNullParameter(verifyResult, "verifyResult");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"purchase", "verification", "failed", verifyResult.n()});
        j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
        pq.Ml ml = new pq.Ml();
        ml.O("errorDescription", verifyResult.t());
        Iterator it = purchases.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            String str2 = "existingProductId" + i2;
            String strT = ((o) it.next()).t();
            if (strT == null) {
                strT = "";
            }
            ml.O(str2, strT);
            i2 = i3;
        }
        if (str != null) {
            ml.O("newProductId", str);
        }
        Unit unit = Unit.INSTANCE;
        return new ajd.j(listListOf, enumC0481j, "A purchase verifier encountered an error.", null, ml.rl(verifyResult.rl()), 8, null);
    }

    public final ajd.j Z() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "verification", "cancelled"}), j.EnumC0481j.f13105t, "Monopoly did not verify the purchase, because the purchases list was empty. ", null, null, 24, null);
    }

    public final ajd.j aYN(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "verification", "failed", "missingOldPurchase"}), j.EnumC0481j.f13101O, "Missing last purchase from purchase history.", null, pq.I28.n(pq.n.O("productId", productId)), 8, null);
    }

    public final ajd.j az(com.android.billingclient.api.Ml billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"purchase", "update", "failed"});
        String strValueOf = String.valueOf(billingResult.rl());
        String strN = billingResult.n();
        Intrinsics.checkNotNullExpressionValue(strN, "getDebugMessage(...)");
        return new ajd.j(listListOf, null, "A purchase encountered an error.", strValueOf, pq.I28.n(pq.n.O("debugMessage", strN), pq.n.O("errorName", fE.CN3.n(billingResult))), 2, null);
    }

    public final ajd.j ck(fE.j error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchases", "query", "failed"}), j.EnumC0481j.J2, "Failed to query all purchases.", error.n().name(), pq.I28.n(pq.n.O("error_message", error.rl())));
    }

    public final ajd.j gh(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"subscriptions", "purchase"}), null, "Launch the billing flow to purchase the subscription with the given id.", null, pq.I28.n(pq.n.O("product_id", productId)), 10, null);
    }

    public final ajd.j mUb(List products) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchases", "productsSize"}), j.EnumC0481j.f13101O, "Received a new purchase which contains skus list with different size than exactly one.", null, pq.I28.n(pq.n.O("products", products.toString())), 8, null);
    }

    public final ajd.j n(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"consumables", "consume"}), null, null, null, pq.I28.n(pq.n.O("productId", productId)), 14, null);
    }

    public final ajd.j o() {
        return new ajd.j(CollectionsKt.listOf("restore"), null, "Attempt to restore active purchases.", null, null, 26, null);
    }

    public final ajd.j qie() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "purchaseState", "unspecified"}), j.EnumC0481j.f13101O, "Received a new purchase which is in the UNSPECIFIED_STATE state.", null, null, 24, null);
    }

    public final ajd.j r(fE.j error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"subscriptions", "purchases", "query", "failed"}), j.EnumC0481j.J2, "Failed to query subscription product purchases.", error.n().name(), pq.I28.n(pq.n.O("error_message", error.rl())));
    }

    public final ajd.j rl(String productId, Throwable error) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(error, "error");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"subscriptions", "details", "cached", "get", "failed"});
        j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
        j.I28 i28O = pq.n.O("product_id", productId);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        return new ajd.j(listListOf, enumC0481j, "Failed to retrieve details of the subscription product with the given id from local storage cache.", "SubscriptionsCacheLoadError", pq.I28.n(i28O, pq.n.O("error_message", message)));
    }

    public final ajd.j t(List productIds, CN3 cn3) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"subscriptions", "details", "remote", "get", "failed"});
        j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
        String strN = cn3 != null ? cn3.n() : null;
        String str = strN == null ? "" : strN;
        j.n nVarRl = pq.n.rl("product_ids", pq.I28.rl(productIds));
        String strRl = cn3 != null ? cn3.rl() : null;
        return new ajd.j(listListOf, enumC0481j, "Failed to retrieve details of the subscription products with the given ids.", str, pq.I28.n(nVarRl, pq.n.O("error_message", strRl != null ? strRl : "")));
    }

    public final ajd.j ty() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"purchase", "update", "success"}), null, "Purchases correctly updated.", null, null, 26, null);
    }

    public final ajd.j xMQ(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"one_time_product", "purchase"}), null, "Launch the billing flow to purchase the OTP with the given id.", null, pq.I28.n(pq.n.O("product_id", productId)), 10, null);
    }

    private Ml() {
    }
}
