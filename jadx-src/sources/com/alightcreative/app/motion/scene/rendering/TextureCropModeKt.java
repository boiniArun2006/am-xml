package com.alightcreative.app.motion.scene.rendering;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"nextTextureCropMode", "Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextureCropModeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextureCropMode.values().length];
            try {
                iArr[TextureCropMode.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextureCropMode.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextureCropMode.STRETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TextureCropMode nextTextureCropMode(TextureCropMode textureCropMode) {
        Intrinsics.checkNotNullParameter(textureCropMode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[textureCropMode.ordinal()];
        if (i2 == 1) {
            return TextureCropMode.FIT;
        }
        if (i2 == 2) {
            return TextureCropMode.STRETCH;
        }
        if (i2 == 3) {
            return TextureCropMode.FILL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
