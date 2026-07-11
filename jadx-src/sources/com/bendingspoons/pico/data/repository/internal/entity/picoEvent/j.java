package com.bendingspoons.pico.data.repository.internal.entity.picoEvent;

import com.bendingspoons.pico.data.repository.internal.entity.picoEvent.PicoAdditionalInfoData;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static final PicoAdditionalInfoData.Experiment n(PicoAdditionalInfo.Experiment experiment) {
        Intrinsics.checkNotNullParameter(experiment, "<this>");
        if (experiment instanceof PicoAdditionalInfo.Experiment.Segmented) {
            return new PicoAdditionalInfoData.Experiment(((PicoAdditionalInfo.Experiment.Segmented) experiment).getSegments(), false);
        }
        if (experiment instanceof PicoAdditionalInfo.Experiment.Baseline) {
            return new PicoAdditionalInfoData.Experiment(MapsKt.emptyMap(), true);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PicoAdditionalInfoData rl(PicoAdditionalInfo picoAdditionalInfo) {
        Intrinsics.checkNotNullParameter(picoAdditionalInfo, "<this>");
        PicoAdditionalInfo.App app = picoAdditionalInfo.getApp();
        PicoAdditionalInfo.Device device = picoAdditionalInfo.getDevice();
        PicoAdditionalInfo.Install install = picoAdditionalInfo.getInstall();
        PicoAdditionalInfo.Monetization monetization = picoAdditionalInfo.getMonetization();
        PicoAdditionalInfo.Experiment experiment = picoAdditionalInfo.getExperiment();
        return new PicoAdditionalInfoData(app, device, install, monetization, experiment != null ? n(experiment) : null, picoAdditionalInfo.getUserIds());
    }
}
