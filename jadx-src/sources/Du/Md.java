package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Md extends DC {
    private final boolean az;

    @Override // Du.DC
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Md)) {
            return false;
        }
        EJn.Wre wre = (EJn.Wre) obj;
        if (!Intrinsics.areEqual(KN(), wre.KN())) {
            return false;
        }
        Md md = (Md) obj;
        if (!md.isInline() || !Arrays.equals(Z(), md.Z()) || nr() != wre.nr()) {
            return false;
        }
        int iNr = nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            if (!Intrinsics.areEqual(Uo(i2).KN(), wre.Uo(i2).KN()) || !Intrinsics.areEqual(Uo(i2).getKind(), wre.Uo(i2).getKind())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Md(String name, vd generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.az = true;
    }

    @Override // EJn.Wre
    public boolean isInline() {
        return this.az;
    }

    @Override // Du.DC
    public int hashCode() {
        return super.hashCode() * 31;
    }
}
