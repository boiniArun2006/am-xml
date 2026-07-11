package com.bendingspoons.pico.data.repository.internal.entity.picoEvent;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData;", "", PangleCreativeInfo.f62498a, "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;", "device", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;", "install", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;", "monetization", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;", "experiment", "Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData$Experiment;", "userIds", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;", "<init>", "(Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData$Experiment;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;)V", "getApp", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;", "getDevice", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;", "getInstall", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;", "getMonetization", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;", "getExperiment", "()Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData$Experiment;", "getUserIds", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;", "toDomain", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Experiment", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoAdditionalInfoData {
    private final PicoAdditionalInfo.App app;
    private final PicoAdditionalInfo.Device device;
    private final Experiment experiment;
    private final PicoAdditionalInfo.Install install;
    private final PicoAdditionalInfo.Monetization monetization;
    private final PicoAdditionalInfo.UserIds userIds;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData$Experiment;", "", "segments", "", "", "", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/SegmentSet;", "isBaseline", "", "<init>", "(Ljava/util/Map;Z)V", "getSegments", "()Ljava/util/Map;", "()Z", "toDomain", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;", "component1", "component2", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Experiment {
        private final boolean isBaseline;
        private final Map<String, Integer> segments;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Experiment copy$default(Experiment experiment, Map map, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                map = experiment.segments;
            }
            if ((i2 & 2) != 0) {
                z2 = experiment.isBaseline;
            }
            return experiment.copy(map, z2);
        }

        public final Map<String, Integer> component1() {
            return this.segments;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsBaseline() {
            return this.isBaseline;
        }

        public final Experiment copy(Map<String, Integer> segments, boolean isBaseline) {
            Intrinsics.checkNotNullParameter(segments, "segments");
            return new Experiment(segments, isBaseline);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Experiment)) {
                return false;
            }
            Experiment experiment = (Experiment) other;
            return Intrinsics.areEqual(this.segments, experiment.segments) && this.isBaseline == experiment.isBaseline;
        }

        public int hashCode() {
            return (this.segments.hashCode() * 31) + Boolean.hashCode(this.isBaseline);
        }

        public String toString() {
            return "Experiment(segments=" + this.segments + ", isBaseline=" + this.isBaseline + ")";
        }

        @VisibleForTesting
        public Experiment(Map<String, Integer> segments, boolean z2) {
            Intrinsics.checkNotNullParameter(segments, "segments");
            this.segments = segments;
            this.isBaseline = z2;
        }

        public final Map<String, Integer> getSegments() {
            return this.segments;
        }

        public final boolean isBaseline() {
            return this.isBaseline;
        }

        public final PicoAdditionalInfo.Experiment toDomain() {
            return this.isBaseline ? PicoAdditionalInfo.Experiment.Baseline.INSTANCE : new PicoAdditionalInfo.Experiment.Segmented(this.segments);
        }
    }

    public static /* synthetic */ PicoAdditionalInfoData copy$default(PicoAdditionalInfoData picoAdditionalInfoData, PicoAdditionalInfo.App app, PicoAdditionalInfo.Device device, PicoAdditionalInfo.Install install, PicoAdditionalInfo.Monetization monetization, Experiment experiment, PicoAdditionalInfo.UserIds userIds, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            app = picoAdditionalInfoData.app;
        }
        if ((i2 & 2) != 0) {
            device = picoAdditionalInfoData.device;
        }
        if ((i2 & 4) != 0) {
            install = picoAdditionalInfoData.install;
        }
        if ((i2 & 8) != 0) {
            monetization = picoAdditionalInfoData.monetization;
        }
        if ((i2 & 16) != 0) {
            experiment = picoAdditionalInfoData.experiment;
        }
        if ((i2 & 32) != 0) {
            userIds = picoAdditionalInfoData.userIds;
        }
        Experiment experiment2 = experiment;
        PicoAdditionalInfo.UserIds userIds2 = userIds;
        return picoAdditionalInfoData.copy(app, device, install, monetization, experiment2, userIds2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PicoAdditionalInfo.App getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PicoAdditionalInfo.Device getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PicoAdditionalInfo.Install getInstall() {
        return this.install;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PicoAdditionalInfo.Monetization getMonetization() {
        return this.monetization;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Experiment getExperiment() {
        return this.experiment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PicoAdditionalInfo.UserIds getUserIds() {
        return this.userIds;
    }

    public final PicoAdditionalInfoData copy(PicoAdditionalInfo.App app, PicoAdditionalInfo.Device device, PicoAdditionalInfo.Install install, PicoAdditionalInfo.Monetization monetization, Experiment experiment, PicoAdditionalInfo.UserIds userIds) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(install, "install");
        Intrinsics.checkNotNullParameter(monetization, "monetization");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        return new PicoAdditionalInfoData(app, device, install, monetization, experiment, userIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoAdditionalInfoData)) {
            return false;
        }
        PicoAdditionalInfoData picoAdditionalInfoData = (PicoAdditionalInfoData) other;
        return Intrinsics.areEqual(this.app, picoAdditionalInfoData.app) && Intrinsics.areEqual(this.device, picoAdditionalInfoData.device) && Intrinsics.areEqual(this.install, picoAdditionalInfoData.install) && Intrinsics.areEqual(this.monetization, picoAdditionalInfoData.monetization) && Intrinsics.areEqual(this.experiment, picoAdditionalInfoData.experiment) && Intrinsics.areEqual(this.userIds, picoAdditionalInfoData.userIds);
    }

    public int hashCode() {
        int iHashCode = ((((((this.app.hashCode() * 31) + this.device.hashCode()) * 31) + this.install.hashCode()) * 31) + this.monetization.hashCode()) * 31;
        Experiment experiment = this.experiment;
        return ((iHashCode + (experiment == null ? 0 : experiment.hashCode())) * 31) + this.userIds.hashCode();
    }

    public String toString() {
        return "PicoAdditionalInfoData(app=" + this.app + ", device=" + this.device + ", install=" + this.install + ", monetization=" + this.monetization + ", experiment=" + this.experiment + ", userIds=" + this.userIds + ")";
    }

    public PicoAdditionalInfoData(PicoAdditionalInfo.App app, PicoAdditionalInfo.Device device, PicoAdditionalInfo.Install install, PicoAdditionalInfo.Monetization monetization, Experiment experiment, PicoAdditionalInfo.UserIds userIds) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(install, "install");
        Intrinsics.checkNotNullParameter(monetization, "monetization");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.app = app;
        this.device = device;
        this.install = install;
        this.monetization = monetization;
        this.experiment = experiment;
        this.userIds = userIds;
    }

    public final PicoAdditionalInfo.App getApp() {
        return this.app;
    }

    public final PicoAdditionalInfo.Device getDevice() {
        return this.device;
    }

    public final Experiment getExperiment() {
        return this.experiment;
    }

    public final PicoAdditionalInfo.Install getInstall() {
        return this.install;
    }

    public final PicoAdditionalInfo.Monetization getMonetization() {
        return this.monetization;
    }

    public final PicoAdditionalInfo.UserIds getUserIds() {
        return this.userIds;
    }

    public final PicoAdditionalInfo toDomain() {
        PicoAdditionalInfo.App app = this.app;
        PicoAdditionalInfo.Device device = this.device;
        PicoAdditionalInfo.Install install = this.install;
        PicoAdditionalInfo.Monetization monetization = this.monetization;
        Experiment experiment = this.experiment;
        return new PicoAdditionalInfo(app, device, install, monetization, experiment != null ? experiment.toDomain() : null, this.userIds);
    }
}
