package com.alightcreative.account;

import com.alightcreative.account.PurchasePeriod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kgE.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class C {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IAPItemType.values().length];
            try {
                iArr[IAPItemType.Subscription.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAPItemType.Pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAPItemType.Consumable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAPItemType.Item.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PurchasePeriod rl(String str) {
        Character chLastOrNull;
        if (str == null || (chLastOrNull = StringsKt.lastOrNull(StringsKt.trim((CharSequence) str).toString())) == null) {
            return null;
        }
        char cCharValue = chLastOrNull.charValue();
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.dropLast(str, 1));
        if (intOrNull == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        if (cCharValue != 'D') {
            if (cCharValue != 'M') {
                if (cCharValue != 'W') {
                    if (cCharValue != 'Y') {
                        if (cCharValue != 'd') {
                            if (cCharValue != 'm') {
                                if (cCharValue != 'w') {
                                    if (cCharValue != 'y') {
                                        if (cCharValue != 'H') {
                                            if (cCharValue != 'I') {
                                                if (cCharValue != 'h') {
                                                    if (cCharValue != 'i') {
                                                        return null;
                                                    }
                                                }
                                            }
                                            return new PurchasePeriod(PurchasePeriod.Unit.Minute, iIntValue);
                                        }
                                        return new PurchasePeriod(PurchasePeriod.Unit.Hour, iIntValue);
                                    }
                                }
                            }
                        }
                    }
                    return new PurchasePeriod(PurchasePeriod.Unit.Year, iIntValue);
                }
                return new PurchasePeriod(PurchasePeriod.Unit.Week, iIntValue);
            }
            return new PurchasePeriod(PurchasePeriod.Unit.Month, iIntValue);
        }
        return new PurchasePeriod(PurchasePeriod.Unit.Day, iIntValue);
    }

    public static final long O(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        long jNr = 0;
        while (it.hasNext()) {
            jNr |= ((K) it.next()).nr();
        }
        return jNr;
    }

    public static final int n(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set.contains(K.Xw)) {
            return 2;
        }
        return set.contains(K.f70081v) ? 1 : 0;
    }

    public static final LicenseType nr(IAPItemType iAPItemType) {
        Intrinsics.checkNotNullParameter(iAPItemType, "<this>");
        int i2 = j.$EnumSwitchMapping$0[iAPItemType.ordinal()];
        if (i2 == 1) {
            return LicenseType.Subscription;
        }
        if (i2 == 2) {
            return LicenseType.Pass;
        }
        if (i2 == 3) {
            return null;
        }
        if (i2 == 4) {
            return LicenseType.Promotional;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LicenseInfo t(BackendLicenseInfo backendLicenseInfo) {
        LicenseType licenseType;
        LicenseStore licenseStore;
        Set setEmptySet;
        K k2;
        Intrinsics.checkNotNullParameter(backendLicenseInfo, "<this>");
        LicenseType[] licenseTypeArrValues = LicenseType.values();
        int length = licenseTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                licenseType = null;
                break;
            }
            LicenseType licenseType2 = licenseTypeArrValues[i2];
            if (Intrinsics.areEqual(backendLicenseInfo.getType(), licenseType2.getId())) {
                licenseType = licenseType2;
                break;
            }
            i2++;
        }
        if (licenseType == null) {
            return null;
        }
        if (backendLicenseInfo.getStore() == null) {
            licenseStore = LicenseStore.None;
        } else {
            LicenseStore[] licenseStoreArrValues = LicenseStore.values();
            int length2 = licenseStoreArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    licenseStore = null;
                    break;
                }
                LicenseStore licenseStore2 = licenseStoreArrValues[i3];
                if (Intrinsics.areEqual(backendLicenseInfo.getStore(), licenseStore2.getId())) {
                    licenseStore = licenseStore2;
                    break;
                }
                i3++;
            }
            if (licenseStore == null) {
                return null;
            }
        }
        LicenseStore licenseStore3 = licenseStore;
        Boolean valid = backendLicenseInfo.getValid();
        boolean zBooleanValue = valid != null ? valid.booleanValue() : false;
        String productId = backendLicenseInfo.getProductId();
        String str = productId == null ? "" : productId;
        Boolean autoRenewing = backendLicenseInfo.getAutoRenewing();
        boolean zBooleanValue2 = autoRenewing != null ? autoRenewing.booleanValue() : false;
        String orderNumber = backendLicenseInfo.getOrderNumber();
        String str2 = orderNumber == null ? "" : orderNumber;
        PurchasePeriod purchasePeriodRl = rl(backendLicenseInfo.getPeriod());
        Long expires = backendLicenseInfo.getExpires();
        List<String> benefits = backendLicenseInfo.getBenefits();
        if (benefits != null) {
            ArrayList arrayList = new ArrayList();
            for (String str3 : benefits) {
                K[] kArrValues = K.values();
                int length3 = kArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        k2 = null;
                        break;
                    }
                    K k3 = kArrValues[i5];
                    if (Intrinsics.areEqual(str3, k3.J2())) {
                        k2 = k3;
                        break;
                    }
                    i5++;
                }
                if (k2 != null) {
                    arrayList.add(k2);
                }
            }
            setEmptySet = CollectionsKt.toSet(arrayList);
            if (setEmptySet == null) {
                setEmptySet = SetsKt.emptySet();
            }
        }
        return new LicenseInfo(zBooleanValue, licenseType, licenseStore3, str, zBooleanValue2, str2, purchasePeriodRl, expires, setEmptySet);
    }
}
