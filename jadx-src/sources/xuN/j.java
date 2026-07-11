package xuN;

import com.bendingspoons.pico.data.repository.internal.entity.picoEvent.PicoEventData;
import com.bendingspoons.pico.data.repository.internal.entity.picoEvent.PicoInternalEventData;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    public static final PicoEventData n(PicoEvent picoEvent) {
        Intrinsics.checkNotNullParameter(picoEvent, "<this>");
        return new PicoEventData(picoEvent.getId$pico_release(), picoEvent.getType(), picoEvent.getData().n());
    }

    public static final PicoInternalEventData rl(QAv.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new PicoInternalEventData(n(jVar.n()), jVar.t(), com.bendingspoons.pico.data.repository.internal.entity.picoEvent.j.rl(jVar.rl()), jVar.nr());
    }
}
