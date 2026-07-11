package GJW;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3487o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ h[] f3488r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f3486n = new h("DEFAULT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f3489t = new h("LAZY", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final h f3485O = new h("ATOMIC", 2);
    public static final h J2 = new h("UNDISPATCHED", 3);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.f3486n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.f3485O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.f3489t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        h[] hVarArrN = n();
        f3488r = hVarArrN;
        f3487o = EnumEntriesKt.enumEntries(hVarArrN);
    }

    private static final /* synthetic */ h[] n() {
        return new h[]{f3486n, f3489t, f3485O, J2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3488r.clone();
    }

    public final void rl(Function2 function2, Object obj, Continuation continuation) {
        int i2 = j.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            hND.j.t(function2, obj, continuation);
            return;
        }
        if (i2 == 2) {
            ContinuationKt.startCoroutine(function2, obj, continuation);
        } else if (i2 == 3) {
            hND.n.t(function2, obj, continuation);
        } else if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean t() {
        return this == f3489t;
    }

    private h(String str, int i2) {
    }
}
