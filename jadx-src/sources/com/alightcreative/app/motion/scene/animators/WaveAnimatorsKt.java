package com.alightcreative.app.motion.scene.animators;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0003"}, d2 = {"triangle", "", "x", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WaveAnimatorsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float triangle(float f3) {
        return (Math.abs(((f3 + 0.75f) % 1) - 0.5f) - 0.25f) * 4.0f;
    }
}
