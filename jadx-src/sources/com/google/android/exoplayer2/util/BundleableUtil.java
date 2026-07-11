package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class BundleableUtil {
    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleableUtil.class.getClassLoader()));
        }
    }

    public static <T extends Bundleable> SparseArray<T> fromBundleSparseArray(Bundleable.Creator<T> creator, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcelableSparseArray.put(sparseArray.keyAt(i2), creator.fromBundle(sparseArray.valueAt(i2)));
        }
        return parcelableSparseArray;
    }

    public static <T extends Bundleable> ArrayList<Bundle> toBundleArrayList(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends Bundleable> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray2.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2).toBundle());
        }
        return sparseArray2;
    }

    private BundleableUtil() {
    }

    public static <T extends Bundleable> nKK fromBundleList(Bundleable.Creator<T> creator, List<Bundle> list) {
        nKK.j jVarGh = nKK.gh();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jVarGh.n(creator.fromBundle((Bundle) Assertions.checkNotNull(list.get(i2))));
        }
        return jVarGh.gh();
    }

    public static <T extends Bundleable> nKK toBundleList(List<T> list) {
        nKK.j jVarGh = nKK.gh();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jVarGh.n(list.get(i2).toBundle());
        }
        return jVarGh.gh();
    }
}
