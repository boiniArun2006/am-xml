package QAv;

import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import com.bendingspoons.pico.domain.internal.PicoBaseInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PicoEvent f7956n;
    private final Map nr;
    private final PicoBaseInfo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PicoAdditionalInfo f7957t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f7956n, jVar.f7956n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f7957t, jVar.f7957t) && Intrinsics.areEqual(this.nr, jVar.nr);
    }

    public j(PicoEvent event, PicoBaseInfo picoBaseInfo, PicoAdditionalInfo picoAdditionalInfo, Map userAdditionalInfo) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(picoBaseInfo, "picoBaseInfo");
        Intrinsics.checkNotNullParameter(picoAdditionalInfo, "picoAdditionalInfo");
        Intrinsics.checkNotNullParameter(userAdditionalInfo, "userAdditionalInfo");
        this.f7956n = event;
        this.rl = picoBaseInfo;
        this.f7957t = picoAdditionalInfo;
        this.nr = userAdditionalInfo;
    }

    public int hashCode() {
        return (((((this.f7956n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f7957t.hashCode()) * 31) + this.nr.hashCode();
    }

    public final PicoEvent n() {
        return this.f7956n;
    }

    public final Map nr() {
        return this.nr;
    }

    public final PicoAdditionalInfo rl() {
        return this.f7957t;
    }

    public final PicoBaseInfo t() {
        return this.rl;
    }

    public String toString() {
        return "PicoInternalEvent(event=" + this.f7956n + ", picoBaseInfo=" + this.rl + ", picoAdditionalInfo=" + this.f7957t + ", userAdditionalInfo=" + this.nr + ")";
    }
}
