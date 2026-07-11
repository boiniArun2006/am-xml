package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005¨\u0006\r"}, d2 = {"NullObjectElement", "Lcom/alightcreative/app/motion/scene/SceneElement;", "transform", "Lcom/alightcreative/app/motion/scene/KeyableTransform;", "startTime", "", "endTime", "id", "", "label", "", "inTime", "outTime", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NullObjectElementKt {
    public static final SceneElement NullObjectElement(KeyableTransform transform, int i2, int i3, long j2, String label, int i5, int i7) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(label, "label");
        return new SceneElement(SceneElementType.NullObject, i2, i3, j2, new EngineState(nCS.j.f71005n.n()), label, transform, null, null, null, null, null, null, null, null, null, null, i5, i7, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -917632, 127, null);
    }

    public static /* synthetic */ SceneElement NullObjectElement$default(KeyableTransform keyableTransform, int i2, int i3, long j2, String str, int i5, int i7, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i8 & 16) != 0) {
            str = "";
        }
        return NullObjectElement(keyableTransform, i2, i3, j3, str, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? Integer.MAX_VALUE : i7);
    }
}
