package com.alightcreative.maineditor.presetpreview.ui;

import QmE.iF;
import com.alightcreative.maineditor.presetpreview.ui.fuX;
import kP.InterfaceC2210n;
import zRY.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class CN3 {
    public static void J2(PresetPreviewActivity presetPreviewActivity, fuX.n nVar) {
        presetPreviewActivity.viewModelFactory = nVar;
    }

    public static void O(PresetPreviewActivity presetPreviewActivity, InterfaceC2210n interfaceC2210n) {
        presetPreviewActivity.injet = interfaceC2210n;
    }

    public static void Uo(PresetPreviewActivity presetPreviewActivity, g9s.n nVar) {
        presetPreviewActivity.viewModelFactoryPremadeContent = nVar;
    }

    public static void n(PresetPreviewActivity presetPreviewActivity, xAo.I28 i28) {
        presetPreviewActivity.crisperManager = i28;
    }

    public static void nr(PresetPreviewActivity presetPreviewActivity, kgE.fuX fux) {
        presetPreviewActivity.iapManager = fux;
    }

    public static void rl(PresetPreviewActivity presetPreviewActivity, iF iFVar) {
        presetPreviewActivity.eventLogger = iFVar;
    }

    public static void t(PresetPreviewActivity presetPreviewActivity, nYs.Ml ml) {
        presetPreviewActivity.getAlightSettingsUseCase = ml;
    }
}
