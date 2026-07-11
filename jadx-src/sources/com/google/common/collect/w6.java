package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class w6 extends Ml implements M {
    @Override // com.google.common.collect.Ml, com.google.common.collect.Lu
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.Ml
    Collection iF(Object obj, Collection collection) {
        return fD(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.Ml
    Collection te(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    protected w6(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.Wre
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.Ml, com.google.common.collect.Lu
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public Map rl() {
        return super.rl();
    }
}
