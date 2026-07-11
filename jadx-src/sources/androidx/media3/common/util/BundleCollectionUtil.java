package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.common.collect.nKK;
import com.google.common.collect.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class BundleCollectionUtil {
    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static u bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? u.ty() : u.Uo(bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleCollectionUtil.class.getClassLoader()));
        }
    }

    public static <T> SparseArray<T> fromBundleSparseArray(t1.CN3 cn3, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcelableSparseArray.put(sparseArray.keyAt(i2), cn3.apply(sparseArray.valueAt(i2)));
        }
        return parcelableSparseArray;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, t1.CN3 cn3) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) cn3.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, t1.CN3 cn3) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray2.put(sparseArray.keyAt(i2), (Bundle) cn3.apply(sparseArray.valueAt(i2)));
        }
        return sparseArray2;
    }

    private BundleCollectionUtil() {
    }

    public static <T> nKK fromBundleList(t1.CN3 cn3, List<Bundle> list) {
        nKK.j jVarGh = nKK.gh();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jVarGh.n(cn3.apply((Bundle) Assertions.checkNotNull(list.get(i2))));
        }
        return jVarGh.gh();
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        if (bundle3 != null) {
            return bundle3;
        }
        return bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        return arrayList;
    }

    public static <T> nKK toBundleList(List<T> list, t1.CN3 cn3) {
        nKK.j jVarGh = nKK.gh();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jVarGh.n((Bundle) cn3.apply(list.get(i2)));
        }
        return jVarGh.gh();
    }
}
