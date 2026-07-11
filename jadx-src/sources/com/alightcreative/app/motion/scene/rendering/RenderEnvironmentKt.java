package com.alightcreative.app.motion.scene.rendering;

import androidx.annotation.IdRes;
import com.alightcreative.app.motion.scene.SceneElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"withMode", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "editMode", "", "withTimingForElement", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentForElement;", "el", "Lcom/alightcreative/app/motion/scene/SceneElement;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RenderEnvironmentKt {
    public static final RenderEnvironment withMode(RenderEnvironment renderEnvironment, @IdRes int i2) {
        Intrinsics.checkNotNullParameter(renderEnvironment, "<this>");
        return renderEnvironment.getEditMode() == i2 ? renderEnvironment : new RenderEnvironmentAltMode(renderEnvironment, i2);
    }

    public static final RenderEnvironmentForElement withTimingForElement(RenderEnvironment renderEnvironment, SceneElement el) {
        Intrinsics.checkNotNullParameter(renderEnvironment, "<this>");
        Intrinsics.checkNotNullParameter(el, "el");
        return new RenderEnvironmentForElement(renderEnvironment, el);
    }
}
