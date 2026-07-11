package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f60236n;

    public DependencyCycleException(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f60236n = list;
    }
}
