package com.google.common.collect;

import com.google.common.collect.psW;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface gnv extends psW, Iterable {
    gnv FX();

    gnv GD(Object obj, EnumC1898o enumC1898o);

    gnv Mx(Object obj, EnumC1898o enumC1898o);

    Comparator comparator();

    @Override // com.google.common.collect.psW
    NavigableSet elementSet();

    @Override // com.google.common.collect.psW
    Set entrySet();

    psW.j firstEntry();

    psW.j lastEntry();

    gnv p5(Object obj, EnumC1898o enumC1898o, Object obj2, EnumC1898o enumC1898o2);

    psW.j pollFirstEntry();

    psW.j pollLastEntry();
}
