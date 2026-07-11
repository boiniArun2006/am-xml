package gi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface I28 {
    boolean E2();

    byte N();

    int S(EJn.Wre wre);

    boolean WPU();

    double Z();

    char aYN();

    I28 az(EJn.Wre wre);

    String g();

    Void gh();

    DGv.Ml n();

    float o();

    short r();

    w6 rl(EJn.Wre wre);

    long ty();

    int xMQ();

    default Object qie(XA.w6 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }
}
