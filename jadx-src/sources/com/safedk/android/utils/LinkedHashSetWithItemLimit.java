package com.safedk.android.utils;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class LinkedHashSetWithItemLimit<T> extends LinkedHashSet<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63106a = "LinkedHashSetWithItemLimit";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f63107b;

    public LinkedHashSetWithItemLimit(long maxSize) {
        this.f63107b = maxSize;
        Logger.d(f63106a, "LinkedHashSetWithItemLimit created. maxSize = ", Long.valueOf(maxSize));
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public synchronized boolean add(T item) {
        if (size() >= this.f63107b) {
            a();
        }
        return super.add(item);
    }

    private void a() {
        if (size() > 0) {
            remove(iterator().next());
        }
    }
}
