package ujA;

import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f74602n = CollectionsKt.toSet(Id.Predefined.Internal.j.t());
    private static final Set rl = CollectionsKt.toSet(Id.Predefined.External.j.nr());

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Id.Predefined.Internal.j.values().length];
            try {
                iArr[Id.Predefined.Internal.j.f51217O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Id.Predefined.Internal.j.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Id.Predefined.Internal.j.f51220t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Set n() {
        return rl;
    }

    public static final boolean nr(Id.Predefined.Internal.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return t(jVar) != zD.n.f76400O;
    }

    public static final Set rl() {
        return f74602n;
    }

    public static final zD.n t(Id.Predefined.Internal.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i2 = j.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            return zD.n.f76401n;
        }
        if (i2 == 2) {
            return zD.n.f76403t;
        }
        if (i2 == 3) {
            return zD.n.f76400O;
        }
        throw new NoWhenBranchMatchedException();
    }
}
