package Mms;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.InterfaceC2252c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class iwV {
    public static final void n(kotlinx.serialization.json.n json, g9s writer, XA.eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new C1415m(writer, json, O.f6703O, new InterfaceC2252c[O.rl().size()]).ViF(serializer, obj);
    }
}
