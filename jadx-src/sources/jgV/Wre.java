package jgV;

import com.bendingspoons.pico.domain.entities.PicoEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {
    public static final void n(CZF.I28 i28, String actionKind, pq.Ml info) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(info, "info");
        i28.n(rl(PicoEvent.INSTANCE, actionKind, info));
    }

    public static final PicoEvent rl(PicoEvent.Companion companion, String actionKind, pq.Ml info) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(info, "info");
        pq.Ml ml = new pq.Ml();
        ml.O("action_kind", actionKind);
        ml.Uo("action_info", info);
        Unit unit = Unit.INSTANCE;
        return companion.n("UserAction", ml);
    }
}
