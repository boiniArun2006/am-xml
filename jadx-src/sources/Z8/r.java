package Z8;

import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum r {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final SparseArray f12372S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f12378n;

    static {
        r rVar = DEFAULT;
        r rVar2 = UNMETERED_ONLY;
        r rVar3 = UNMETERED_OR_DAILY;
        r rVar4 = FAST_IF_RADIO_AWAKE;
        r rVar5 = NEVER;
        r rVar6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f12372S = sparseArray;
        sparseArray.put(0, rVar);
        sparseArray.put(1, rVar2);
        sparseArray.put(2, rVar3);
        sparseArray.put(3, rVar4);
        sparseArray.put(4, rVar5);
        sparseArray.put(-1, rVar6);
    }

    r(int i2) {
        this.f12378n = i2;
    }
}
