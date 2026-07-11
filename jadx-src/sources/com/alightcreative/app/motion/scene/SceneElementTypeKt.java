package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"supportsIntrinsicFill", "", "Lcom/alightcreative/app/motion/scene/SceneElementType;", "getSupportsIntrinsicFill", "(Lcom/alightcreative/app/motion/scene/SceneElementType;)Z", "supportsMediaFill", "getSupportsMediaFill", "canBecomeClippingMaskChild", "getCanBecomeClippingMaskChild", "canBecomeClippingMaskParent", "getCanBecomeClippingMaskParent", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SceneElementTypeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneElementType.values().length];
            try {
                iArr[SceneElementType.Drawing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneElementType.Scene.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneElementType.Shape.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SceneElementType.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SceneElementType.NullObject.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SceneElementType.Camera.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SceneElementType.Audio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getCanBecomeClippingMaskChild(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElementType.ordinal()];
        return (i2 == 5 || i2 == 6 || i2 == 7) ? false : true;
    }

    public static final boolean getCanBecomeClippingMaskParent(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElementType.ordinal()];
        return (i2 == 5 || i2 == 6 || i2 == 7) ? false : true;
    }

    public static final boolean getSupportsIntrinsicFill(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElementType.ordinal()];
        return i2 == 1 || i2 == 2;
    }

    public static final boolean getSupportsMediaFill(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElementType.ordinal()];
        return i2 == 3 || i2 == 4;
    }
}
