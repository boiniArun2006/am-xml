package com.caoccao.javet.interop;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class V8Notifier {
    private final ConcurrentHashMap<Long, V8Runtime> v8RuntimeMap;

    public void registerListeners() {
    }

    public void unregisterListener() {
    }

    public V8Notifier(ConcurrentHashMap<Long, V8Runtime> concurrentHashMap) {
        this.v8RuntimeMap = concurrentHashMap;
    }
}
