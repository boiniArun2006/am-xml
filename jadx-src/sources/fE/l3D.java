package fE;

import com.bendingspoons.oracle.models.Consumable;
import com.bendingspoons.oracle.models.NonConsumable;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Subscription;
import com.bendingspoons.oracle.models.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l3D {
    public static final YV.n n(OracleResponse oracleResponse) {
        Intrinsics.checkNotNullParameter(oracleResponse, "<this>");
        List<Subscription> subscriptions = oracleResponse.getProducts().getSubscriptions();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(subscriptions, 10)), 16));
        for (Subscription subscription : subscriptions) {
            Pair pair = TuplesKt.to(subscription.getId(), subscription.getFeatures());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        List<NonConsumable> nonConsumables = oracleResponse.getProducts().getNonConsumables();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(nonConsumables, 10)), 16));
        for (NonConsumable nonConsumable : nonConsumables) {
            Pair pair2 = TuplesKt.to(nonConsumable.getId(), nonConsumable.getFeatures());
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        List<Consumable> consumables = oracleResponse.getProducts().getConsumables();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(consumables, 10)), 16));
        Iterator<T> it = consumables.iterator();
        while (it.hasNext()) {
            Pair pair3 = TuplesKt.to(((Consumable) it.next()).getId(), SetsKt.emptySet());
            linkedHashMap3.put(pair3.getFirst(), pair3.getSecond());
        }
        return new YV.n(linkedHashMap, linkedHashMap3, linkedHashMap2);
    }

    public static final YV.QJ rl(OracleResponse oracleResponse) {
        Intrinsics.checkNotNullParameter(oracleResponse, "<this>");
        boolean zIsFreeUser = oracleResponse.getSettings().isFreeUser();
        List<User.ActiveSubscription> activeSubscriptions = oracleResponse.getMe().getActiveSubscriptions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : activeSubscriptions) {
            String lowerCase = ((User.ActiveSubscription) obj).getVendor().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "google")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((User.ActiveSubscription) it.next()).getId());
        }
        List<String> nonConsumablesIds = oracleResponse.getMe().getNonConsumablesIds();
        List<User.BundleSubscription> activeBundleSubscriptions = oracleResponse.getMe().getActiveBundleSubscriptions();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(activeBundleSubscriptions, 10));
        for (User.BundleSubscription bundleSubscription : activeBundleSubscriptions) {
            arrayList3.add(new YV.w6(bundleSubscription.getFeatures(), bundleSubscription.getExpiry(), bundleSubscription.getProductId(), bundleSubscription.getPlanId()));
        }
        Map<String, Integer> availableConsumableCredits = oracleResponse.getMe().getAvailableConsumableCredits();
        List<User.ActiveSubscription> activeSubscriptions2 = oracleResponse.getMe().getActiveSubscriptions();
        ArrayList<User.ActiveSubscription> arrayList4 = new ArrayList();
        for (Object obj2 : activeSubscriptions2) {
            String lowerCase2 = ((User.ActiveSubscription) obj2).getVendor().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!Intrinsics.areEqual(lowerCase2, "google")) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (User.ActiveSubscription activeSubscription : arrayList4) {
            arrayList5.add(new YV.C(activeSubscription.getId(), activeSubscription.getVendor()));
        }
        return new YV.QJ(zIsFreeUser, arrayList2, nonConsumablesIds, arrayList3, availableConsumableCredits, arrayList5);
    }
}
