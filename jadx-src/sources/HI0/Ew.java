package HI0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ew {
    public static final Enum n(Enum[] enumArr, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (enumArr != null) {
            for (Enum r3 : enumArr) {
                if (Intrinsics.areEqual(r3.name(), name)) {
                    return r3;
                }
            }
        }
        return null;
    }
}
