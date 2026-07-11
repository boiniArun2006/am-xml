package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import aT.dE.JLZo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001e\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableTransform;", "transform", "", "startTime", "endTime", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Ljava/util/UUID;", "linkedSceneUUID", "", "id", "", "label", "inTime", "outTime", "Lcom/alightcreative/app/motion/scene/FillType;", "fillType", "Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "fillColor", "", "loop", "Lcom/alightcreative/app/motion/scene/BlendingMode;", "blendingMode", "templatePPId", "Lcom/alightcreative/app/motion/scene/SceneElement;", "NestedSceneElement", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;IILcom/alightcreative/app/motion/scene/Scene;Ljava/util/UUID;JLjava/lang/String;IILcom/alightcreative/app/motion/scene/FillType;Lcom/alightcreative/app/motion/scene/KeyableSolidColor;ZLcom/alightcreative/app/motion/scene/BlendingMode;Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/SceneElement;", "cts", "hostFphs", "Lcom/alightcreative/app/motion/scene/RetimedScene;", "retimeNestedScene", "(Lcom/alightcreative/app/motion/scene/SceneElement;II)Lcom/alightcreative/app/motion/scene/RetimedScene;", "ALLOW_SIMPLE_RENDER", "Z", "LWzY/z;", "scratchPath", "LWzY/z;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNestedSceneElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedSceneElement.kt\ncom/alightcreative/app/motion/scene/NestedSceneElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,570:1\n1#2:571\n*E\n"})
public final class NestedSceneElementKt {
    private static final boolean ALLOW_SIMPLE_RENDER = false;
    private static final C1487z scratchPath = new C1487z();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReTimingMethod.values().length];
            try {
                iArr[ReTimingMethod.STRETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReTimingMethod.FREEZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReTimingMethod.BLANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReTimingMethod.LOOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReTimingMethod.LOOP_STRETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReTimingMethod.OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RetimedScene retimeNestedScene(SceneElement sceneElement, int i2, int i3) {
        double d2;
        double d4;
        double dMin;
        final double d5;
        Ref.DoubleRef doubleRef;
        double dCoerceAtMost;
        final Ref.DoubleRef doubleRef2;
        final double d6;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        final int endTime = sceneElement.getEndTime() - sceneElement.getStartTime();
        final double startTime = (((double) i2) - ((double) sceneElement.getStartTime())) - ((double) (TimeKt.roundToFrame(i2, i3) - TimeKt.roundToFrameStartTime(i2, i3)));
        final int totalTime = sceneElement.getNestedScene().getTotalTime();
        final int iFrameNumberFromTime = TimeKt.frameNumberFromTime(sceneElement.getEndTime(), i3) - TimeKt.frameNumberFromTime(sceneElement.getStartTime(), i3);
        final int iFrameNumberFromTime2 = TimeKt.frameNumberFromTime(sceneElement.getStartTime() + totalTime, i3) - TimeKt.frameNumberFromTime(sceneElement.getStartTime(), i3);
        final boolean z2 = iFrameNumberFromTime2 == iFrameNumberFromTime;
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.iwV
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$0(endTime, startTime, totalTime, iFrameNumberFromTime, iFrameNumberFromTime2, z2);
            }
        });
        double d7 = endTime;
        double d8 = totalTime;
        final int iN = yU.O.n(MathKt.roundToInt(Math.ceil(RangesKt.coerceAtLeast(d7 / d8, 1.0d))));
        final int iCoerceAtLeast = RangesKt.coerceAtLeast(sceneElement.getNestedSceneSpeedFactor() < 0.99999f ? MathKt.roundToInt(1.0f / Math.max(sceneElement.getNestedSceneSpeedFactor(), 1.0E-6f)) : 1, 1);
        final int iCoerceAtMost = RangesKt.coerceAtMost(i3 * iN * iCoerceAtLeast * 16, 192000);
        final Scene sceneCopy$default = Scene.copy$default(sceneElement.getNestedScene(), null, 0, 0, 0, 0, 0, null, iCoerceAtMost, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
        if (sceneElement.getNestedScene().getReTimingMethod() == ReTimingMethod.OFF) {
            return new RetimedScene(sceneCopy$default, TimeKt.frameNumberFromTime(RangesKt.coerceAtMost(MathKt.roundToInt(((i2 - sceneElement.getStartTime()) * sceneElement.getNestedSceneSpeedFactor()) + sceneElement.getInTime()), SceneKt.getDuration(sceneCopy$default) - 1), sceneCopy$default.getFramesPerHundredSeconds()), totalTime > 0);
        }
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$1(iCoerceAtMost, iN, iCoerceAtLeast);
            }
        });
        final Ref.DoubleRef doubleRef3 = new Ref.DoubleRef();
        doubleRef3.element = ((double) TimeKt.roundToFrame(totalTime - 1, sceneElement.getNestedScene().getFramesPerHundredSeconds())) / d8;
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.rv6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$2(doubleRef3);
            }
        });
        final ReTimingMethod reTimingMethod = sceneCopy$default.getReTimingMethod();
        final int iMax = Math.max(0, sceneCopy$default.getReTimingInMark());
        int iMin = (sceneCopy$default.getReTimingOutMark() == 0 || sceneCopy$default.getReTimingOutMark() < iMax) ? totalTime : Math.min(totalTime, sceneCopy$default.getReTimingOutMark());
        if (iMax > iMin || (iMax == 0 && iMin == 0)) {
            d2 = d7;
            d4 = d8;
            dMin = doubleRef3.element;
            d5 = 0.0d;
        } else {
            d2 = d7;
            d4 = d8;
            dMin = Math.min(((double) iMin) / d8, doubleRef3.element);
            d5 = ((double) iMax) / d8;
        }
        final double d9 = dMin;
        double d10 = d9 - d5;
        final double d11 = d10 * d4;
        final int i5 = iMin;
        final double d12 = d5;
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.vd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$3(reTimingMethod, d5, d9, sceneCopy$default, iMax, i5);
            }
        });
        final Ref.DoubleRef doubleRef4 = new Ref.DoubleRef();
        doubleRef4.element = (d12 * d4) / ((double) sceneElement.getNestedSceneSpeedFactor());
        final Ref.DoubleRef doubleRef5 = new Ref.DoubleRef();
        double nestedSceneSpeedFactor = (d4 - (d9 * d4)) / ((double) sceneElement.getNestedSceneSpeedFactor());
        doubleRef5.element = nestedSceneSpeedFactor;
        double d13 = doubleRef4.element;
        if ((d2 - d13) - nestedSceneSpeedFactor < 0.0d) {
            doubleRef4.element = d2 * (d13 / (d13 + nestedSceneSpeedFactor));
            doubleRef5.element = d2 * (d13 / (d13 + nestedSceneSpeedFactor));
        }
        final double d14 = doubleRef4.element;
        final Ref.DoubleRef doubleRef6 = new Ref.DoubleRef();
        doubleRef6.element = d2 - doubleRef5.element;
        final Ref.DoubleRef doubleRef7 = new Ref.DoubleRef();
        doubleRef7.element = RangesKt.coerceAtLeast(doubleRef6.element - d14, 0.5d);
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$4(doubleRef4, doubleRef5, d14, doubleRef6, doubleRef7, d11, totalTime);
            }
        });
        if (!z2 && reTimingMethod != ReTimingMethod.BLANK) {
            if (startTime <= d14) {
                if (d14 == 0.0d) {
                    doubleRef2 = doubleRef6;
                    d6 = d11;
                    dCoerceAtMost = 0.0d;
                    final double d15 = dCoerceAtMost;
                    XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NestedSceneElementKt.retimeNestedScene$lambda$6(d15, z2, reTimingMethod, totalTime, startTime, d14, doubleRef2, d12, d6, d9);
                        }
                    });
                    final int iRoundToInt = d15 >= 0.0d ? totalTime + 1000000 : MathKt.roundToInt(RangesKt.coerceAtMost(d15, doubleRef3.element) * d4);
                    final int iFrameNumberFromTime3 = TimeKt.frameNumberFromTime(iRoundToInt, sceneCopy$default.getFramesPerHundredSeconds());
                    XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.K
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NestedSceneElementKt.retimeNestedScene$lambda$7(d15, iRoundToInt, iFrameNumberFromTime3);
                        }
                    });
                    return new RetimedScene(sceneCopy$default, iFrameNumberFromTime3, d15 < 0.0d);
                }
                dCoerceAtMost = (startTime / d14) * d12;
                doubleRef2 = doubleRef6;
                d6 = d11;
                final double d152 = dCoerceAtMost;
                XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NestedSceneElementKt.retimeNestedScene$lambda$6(d152, z2, reTimingMethod, totalTime, startTime, d14, doubleRef2, d12, d6, d9);
                    }
                });
                if (d152 >= 0.0d) {
                }
                final int iFrameNumberFromTime32 = TimeKt.frameNumberFromTime(iRoundToInt, sceneCopy$default.getFramesPerHundredSeconds());
                XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NestedSceneElementKt.retimeNestedScene$lambda$7(d152, iRoundToInt, iFrameNumberFromTime32);
                    }
                });
                return new RetimedScene(sceneCopy$default, iFrameNumberFromTime32, d152 < 0.0d);
            }
            double d16 = doubleRef6.element;
            doubleRef = doubleRef6;
            if (startTime >= d16) {
                double d17 = doubleRef5.element;
                if (d17 > 0.0d) {
                    dCoerceAtMost = (((startTime - d16) / d17) * (1.0d - d9)) + d9;
                } else {
                    switch (WhenMappings.$EnumSwitchMapping$0[reTimingMethod.ordinal()]) {
                        case 1:
                            dCoerceAtMost = d12 + (((startTime - d14) / doubleRef7.element) * d10);
                            break;
                        case 2:
                        case 3:
                            dCoerceAtMost = RangesKt.coerceAtMost(d12 + (((startTime - d14) * ((double) sceneElement.getNestedSceneSpeedFactor())) / d4), d9);
                            break;
                        case 4:
                            dCoerceAtMost = d12 + ((((startTime - d14) * ((double) sceneElement.getNestedSceneSpeedFactor())) % d11) / d4);
                            break;
                        case 5:
                            double dCoerceAtLeast = doubleRef7.element / ((double) RangesKt.coerceAtLeast(MathKt.roundToInt((doubleRef7.element / (d11 + ((double) 1))) * ((double) sceneElement.getNestedSceneSpeedFactor())), 1));
                            dCoerceAtMost = d12 + (((((startTime - d14) % dCoerceAtLeast) / dCoerceAtLeast) * d11) / d4);
                            break;
                        case 6:
                            throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            final double d1522 = dCoerceAtMost;
            XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NestedSceneElementKt.retimeNestedScene$lambda$6(d1522, z2, reTimingMethod, totalTime, startTime, d14, doubleRef2, d12, d6, d9);
                }
            });
            if (d1522 >= 0.0d) {
            }
            final int iFrameNumberFromTime322 = TimeKt.frameNumberFromTime(iRoundToInt, sceneCopy$default.getFramesPerHundredSeconds());
            XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NestedSceneElementKt.retimeNestedScene$lambda$7(d1522, iRoundToInt, iFrameNumberFromTime322);
                }
            });
            return new RetimedScene(sceneCopy$default, iFrameNumberFromTime322, d1522 < 0.0d);
        }
        doubleRef = doubleRef6;
        double d18 = startTime / d4;
        if (d18 > 1.0d) {
            d18 = -1.0d;
        }
        dCoerceAtMost = d18;
        doubleRef2 = doubleRef;
        d6 = d11;
        final double d15222 = dCoerceAtMost;
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$6(d15222, z2, reTimingMethod, totalTime, startTime, d14, doubleRef2, d12, d6, d9);
            }
        });
        if (d15222 >= 0.0d) {
        }
        final int iFrameNumberFromTime3222 = TimeKt.frameNumberFromTime(iRoundToInt, sceneCopy$default.getFramesPerHundredSeconds());
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementKt.retimeNestedScene$lambda$7(d15222, iRoundToInt, iFrameNumberFromTime3222);
            }
        });
        return new RetimedScene(sceneCopy$default, iFrameNumberFromTime3222, d15222 < 0.0d);
    }

    public static final SceneElement NestedSceneElement(KeyableTransform transform, int i2, int i3, Scene scene, UUID uuid, long j2, String label, int i5, int i7, FillType fillType, KeyableSolidColor fillColor, boolean z2, BlendingMode blendingMode, String str) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Intrinsics.checkNotNullParameter(blendingMode, JLZo.uixxEKAtChjViLL);
        return new SceneElement(SceneElementType.Scene, i2, i3, j2, new EngineState(nCS.j.f71005n.n()), label, transform, fillColor, null, null, null, fillType, null, KeyableCompoundCubicBSpline.INSTANCE.getEMPTY(), null, null, null, i5, i7, z2, null, null, blendingMode, scene, uuid, null, null, null, null, null, null, null, null, false, null, null, false, str, null, -30288896, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$0(int i2, double d2, int i3, int i5, int i7, boolean z2) {
        return "retimeNestedScene: --- elementDuration=" + i2 + " localTime=" + d2 + " nestedSceneTotalTime=" + i3 + " elementDurationFrames=" + i5 + " nestedSceneDurationFrames=" + i7 + " matchesOriginalDuration=" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$1(int i2, int i3, int i5) {
        return "retimeNestedScene: fphs=" + i2 + " durationFramerateFactor=" + i3 + " speedFramerateFactor=" + i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$2(Ref.DoubleRef doubleRef) {
        return "retimeNestedScene: nestedMaxFractionalTime=" + doubleRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$4(Ref.DoubleRef doubleRef, Ref.DoubleRef doubleRef2, double d2, Ref.DoubleRef doubleRef3, Ref.DoubleRef doubleRef4, double d4, int i2) {
        return "retimeNestedScene: retimingStartMargin=" + doubleRef.element + " retimingEndMargin=" + doubleRef2.element + " localStart=" + d2 + " localEnd=" + doubleRef3.element + " localMidDuration=" + doubleRef4.element + " nestedMiddleDuration=" + d4 + " nestedSceneTotalTime=" + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$6(double d2, boolean z2, ReTimingMethod reTimingMethod, int i2, double d4, double d5, Ref.DoubleRef doubleRef, double d6, double d7, double d8) {
        return "nestedSceneFractionalTime=" + d2 + " matchesOriginalDuration=" + z2 + " reTimingMethod=" + reTimingMethod + " nestedSceneTotalTime=" + i2 + " localTime=" + d4 + " localStart=" + d5 + " localEnd=" + doubleRef.element + " reTimingInMark=" + d6 + " nestedMiddleDuration=" + d7 + " reTimingOutMark=" + d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$7(double d2, int i2, int i3) {
        return "retimeNestedScene: nestedSceneFractionalTime=" + d2 + " resultTime=" + i2 + " resultFrame=" + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retimeNestedScene$lambda$3(ReTimingMethod reTimingMethod, double d2, double d4, Scene scene, int i2, int i3) {
        return "retimeNestedScene: reTimingMethod=" + reTimingMethod + " reTimingInMark=" + d2 + " reTimingOutMark=" + d4 + " scene.reTimingInMark=" + scene.getReTimingInMark() + " scene.reTimingOutMark=" + scene.getReTimingOutMark() + " adj=" + i2 + "," + i3;
    }
}
