package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface CacheWithNotNullValues<K, V> {
    V computeIfAbsent(K k2, Function0<? extends V> function0);
}
