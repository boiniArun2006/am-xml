package jT;

import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import com.bendingspoons.pico.domain.entities.network.PicoNetworkBaseUserInfo;
import com.bendingspoons.pico.domain.entities.network.PicoNetworkDeviceInfo;
import com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent;
import com.bendingspoons.pico.domain.entities.network.PicoNetworkTimezoneInfo;
import com.bendingspoons.pico.domain.entities.network.PicoNetworkUser;
import com.bendingspoons.pico.domain.internal.PicoBaseInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements jT.j {
    public static final j rl = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Override // jT.j
    public PicoNetworkEvent n(QAv.j event, double d2) {
        Intrinsics.checkNotNullParameter(event, "event");
        PicoEvent picoEventN = event.n();
        PicoBaseInfo picoBaseInfoT = event.t();
        PicoAdditionalInfo picoAdditionalInfoRl = event.rl();
        Map mapNr = event.nr();
        String id$pico_release = picoEventN.getId$pico_release();
        double timestamp = picoBaseInfoT.getTimestamp();
        String bspId = picoAdditionalInfoRl.getApp().getBspId();
        Map mapT = t(picoAdditionalInfoRl.getUserIds());
        String country = picoAdditionalInfoRl.getDevice().getSoftware().getCountry();
        String language = picoAdditionalInfoRl.getDevice().getSoftware().getLanguage();
        String language2 = picoAdditionalInfoRl.getDevice().getSoftware().getLanguage();
        String locale = picoAdditionalInfoRl.getDevice().getSoftware().getLocale();
        String version = picoAdditionalInfoRl.getApp().getVersion();
        String bundleVersion = picoAdditionalInfoRl.getApp().getBundleVersion();
        boolean occurredBeforePico = picoAdditionalInfoRl.getInstall().getOccurredBeforePico();
        PicoAdditionalInfo.Experiment experiment = picoAdditionalInfoRl.getExperiment();
        Boolean boolValueOf = experiment != null ? Boolean.valueOf(experiment instanceof PicoAdditionalInfo.Experiment.Baseline) : null;
        Boolean everythingIsFree = picoAdditionalInfoRl.getMonetization().getEverythingIsFree();
        PicoNetworkTimezoneInfo picoNetworkTimezoneInfo = new PicoNetworkTimezoneInfo(picoAdditionalInfoRl.getDevice().getSoftware().getTimezone().getGmtOffsetSeconds(), picoAdditionalInfoRl.getDevice().getSoftware().getTimezone().getName(), picoAdditionalInfoRl.getDevice().getSoftware().getTimezone().isDaylightSaving());
        PicoAdditionalInfo.Experiment experiment2 = picoAdditionalInfoRl.getExperiment();
        return new PicoNetworkEvent(id$pico_release, timestamp, d2, bspId, new PicoNetworkUser(mapT, new PicoNetworkBaseUserInfo(country, language, language2, locale, version, bundleVersion, occurredBeforePico, boolValueOf, everythingIsFree, picoNetworkTimezoneInfo, new PicoNetworkDeviceInfo(picoAdditionalInfoRl.getDevice().getSoftware().getOsVersionApi(), picoAdditionalInfoRl.getDevice().getSoftware().getOsVersionRelease(), picoAdditionalInfoRl.getDevice().getSoftware().getOsBuildId(), picoAdditionalInfoRl.getDevice().getHardware().getScreenSizeInches(), picoAdditionalInfoRl.getDevice().getHardware().getManufacturer(), picoAdditionalInfoRl.getDevice().getHardware().getModel()), experiment2 instanceof PicoAdditionalInfo.Experiment.Segmented ? ((PicoAdditionalInfo.Experiment.Segmented) experiment2).getSegments() : MapsKt.emptyMap()), MapsKt.plus(MapsKt.mapOf(TuplesKt.to("is_premium_user", Boolean.valueOf(picoAdditionalInfoRl.getMonetization().isPremium()))), mapNr)), picoEventN.getType(), MapsKt.plus(picoEventN.getData().n(), rl(picoBaseInfoT.getSession())));
    }

    private final Map rl(PicoBaseInfo.Session session) {
        String id;
        String id2 = null;
        if (session.getContainsEvent()) {
            id = session.getId();
        } else {
            id = null;
        }
        Pair pair = TuplesKt.to("session_id", id);
        if (!session.getContainsEvent()) {
            id2 = session.getId();
        }
        return MapsKt.mapOf(pair, TuplesKt.to("last_foreground_session_id", id2), TuplesKt.to("seconds_from_session_start", session.getDurationInSeconds()), TuplesKt.to("is_background_event", Boolean.valueOf(!session.getContainsEvent())));
    }

    private final Map t(PicoAdditionalInfo.UserIds userIds) {
        return MapsKt.plus(userIds.getAdditionalIds(), MapsKt.mapOf(TuplesKt.to("backup_persistent_id", userIds.getBackupPersistentId())));
    }
}
