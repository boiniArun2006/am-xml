package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Cache {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Pools.Pool f34974n = new Pools.SimplePool(256);
    Pools.Pool rl = new Pools.SimplePool(256);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Pools.Pool f34975t = new Pools.SimplePool(256);
    SolverVariable[] nr = new SolverVariable[32];
}
