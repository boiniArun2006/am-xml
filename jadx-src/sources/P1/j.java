package P1;

import SpD.PicoXEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {
    public final String n(PicoXEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return n.nr.rl(PicoXEvent.INSTANCE.serializer(), event);
    }

    public final PicoXEvent rl(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return (PicoXEvent) n.nr.t(PicoXEvent.INSTANCE.serializer(), json);
    }
}
