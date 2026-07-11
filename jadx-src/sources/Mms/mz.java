package Mms;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class mz {
    public static final Object n(kotlinx.serialization.json.n json, kotlinx.serialization.json.Dsr element, XA.w6 deserializer) {
        gi.I28 qfVar;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof kotlinx.serialization.json.nKK) {
            qfVar = new rv6(json, (kotlinx.serialization.json.nKK) element, null, null, 12, null);
        } else if (element instanceof kotlinx.serialization.json.w6) {
            qfVar = new Lu(json, (kotlinx.serialization.json.w6) element);
        } else {
            if (!(element instanceof kotlinx.serialization.json.r) && !Intrinsics.areEqual(element, kotlinx.serialization.json.afx.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            qfVar = new qf(json, (kotlinx.serialization.json.qf) element, null, 4, null);
        }
        return qfVar.qie(deserializer);
    }

    public static final Object rl(kotlinx.serialization.json.n nVar, String discriminator, kotlinx.serialization.json.nKK element, XA.w6 deserializer) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new rv6(nVar, element, discriminator, deserializer.getDescriptor()).qie(deserializer);
    }
}
