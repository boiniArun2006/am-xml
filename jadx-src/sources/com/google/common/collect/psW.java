package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface psW extends Collection {

    public interface j {
        int getCount();

        Object getElement();

        String toString();
    }

    int M(Object obj, int i2);

    @Override // java.util.Collection, com.google.common.collect.psW
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    int count(Object obj);

    int eF(Object obj, int i2);

    Set elementSet();

    Set entrySet();

    @Override // com.google.common.collect.psW
    boolean equals(Object obj);

    @Override // com.google.common.collect.psW
    int hashCode();

    @Override // java.util.Collection, com.google.common.collect.psW
    boolean remove(Object obj);

    @Override // java.util.Collection, com.google.common.collect.psW
    int size();

    boolean z(Object obj, int i2, int i3);
}
