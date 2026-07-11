package com.alightcreative.app.motion.scene;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getCurrentSceneOverlay", "Lcom/alightcreative/app/motion/scene/SceneOverlay;", "hideWatermark", "", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SceneOverlayKt {
    public static final SceneOverlay getCurrentSceneOverlay(boolean z2) {
        return z2 ? SceneOverlay_None.INSTANCE : SceneOverlay_StandardWM.INSTANCE;
    }
}
