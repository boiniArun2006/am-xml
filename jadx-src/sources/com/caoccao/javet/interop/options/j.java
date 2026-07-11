package com.caoccao.javet.interop.options;

import com.caoccao.javet.utils.StringUtils;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class j implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return StringUtils.isNotBlank((String) obj);
    }
}
