package jgV;

import com.bendingspoons.pico.domain.entities.PicoEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {
    public static final void n(CZF.I28 i28, String type, pq.Ml info) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(info, "info");
        i28.n(PicoEvent.INSTANCE.n(type, info));
    }
}
