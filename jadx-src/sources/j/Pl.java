package j;

import java.util.Set;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f69244n = new Pl();

    public final Set n() {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        return SetsKt.setOfNotNull((Object[]) new kPg.aC[]{jVar.getMaxLayers2160() > 0 ? kPg.aC.f69912O : null, jVar.getMaxLayers1440() > 0 ? kPg.aC.J2 : null, jVar.getMaxLayers1080() > 0 ? kPg.aC.f69919r : null, jVar.getMaxLayers720() > 0 ? kPg.aC.f69918o : null, kPg.aC.f69915Z, kPg.aC.f69913S, kPg.aC.f69917g, kPg.aC.E2});
    }

    private Pl() {
    }
}
