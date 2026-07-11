package com.caoccao.javet.interfaces;

import com.caoccao.javet.values.V8Value;
import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@FunctionalInterface
public interface IJavetBiIndexedConsumer<Key extends V8Value, Value extends V8Value, E extends Throwable> {
    void accept(int i2, Key key, Value value) throws Throwable;
}
