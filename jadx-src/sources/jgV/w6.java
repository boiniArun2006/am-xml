package jgV;

import com.bendingspoons.install.InstallEventData;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {
    public static final PicoEvent n(PicoEvent.Companion companion, InstallEventData installEventData) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(installEventData, "installEventData");
        return companion.n("Install", installEventData.toMap());
    }
}
