package com.alightcreative.app.motion.scene;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"AudioElement", "Lcom/alightcreative/app/motion/scene/SceneElement;", "startTime", "", "endTime", "inTime", "outTime", "id", "", "loop", "", "label", "", "gain", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "src", "Landroid/net/Uri;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AudioElementKt {
    public static final SceneElement AudioElement(int i2, int i3, int i5, int i7, long j2, boolean z2, String label, Keyable<Float> gain, Uri src) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(gain, "gain");
        Intrinsics.checkNotNullParameter(src, "src");
        return new SceneElement(SceneElementType.Audio, i2, i3, j2, new EngineState(nCS.j.f71005n.n()), label, null, null, null, null, null, null, null, null, src, null, null, i5, i7, z2, gain, null, null, SceneKt.getEMPTY_SCENE(), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -27148352, 127, null);
    }
}
