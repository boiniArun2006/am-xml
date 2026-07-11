package XA;

import Du.AbstractC1338n;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Dsr {
    public static final w6 n(AbstractC1338n abstractC1338n, gi.w6 decoder, String str) {
        Intrinsics.checkNotNullParameter(abstractC1338n, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        w6 w6VarNr = abstractC1338n.nr(decoder, str);
        if (w6VarNr != null) {
            return w6VarNr;
        }
        Du.w6.n(str, abstractC1338n.J2());
        throw new KotlinNothingValueException();
    }

    public static final eO rl(AbstractC1338n abstractC1338n, gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(abstractC1338n, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        eO eOVarO = abstractC1338n.O(encoder, value);
        if (eOVarO != null) {
            return eOVarO;
        }
        Du.w6.rl(Reflection.getOrCreateKotlinClass(value.getClass()), abstractC1338n.J2());
        throw new KotlinNothingValueException();
    }
}
