package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a¦\u0001\u0010%\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "rl", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n309#2,12:166\n238#2,11:178\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,12\n116#1:178,11\n*E\n"})
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final List list, int i2, String str, Brush brush, float f3, Brush brush2, float f4, float f5, int i3, int i5, float f6, float f7, float f8, float f9, Composer composer, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        Brush brush3;
        int i14;
        float f10;
        int i15;
        Brush brush4;
        int i16;
        float f11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        final String str2;
        final float f12;
        final float f13;
        final float f14;
        Composer composer2;
        final Brush brush5;
        final float f15;
        final Brush brush6;
        final int i30;
        final float f16;
        final int i31;
        final int i32;
        final float f17;
        final float f18;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i33;
        Composer composerKN = composer.KN(-1478270750);
        if ((i9 & 1) != 0) {
            i10 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i10 = (composerKN.E2(list) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i34 = i9 & 2;
        if (i34 != 0) {
            i10 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                i11 = i2;
                i10 |= composerKN.t(i11) ? 32 : 16;
            }
            i12 = i9 & 4;
            if (i12 == 0) {
                i10 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i10 |= composerKN.p5(str) ? 256 : 128;
                }
                i13 = i9 & 8;
                if (i13 != 0) {
                    i10 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        brush3 = brush;
                        i10 |= composerKN.p5(brush3) ? 2048 : 1024;
                    }
                    i14 = i9 & 16;
                    if (i14 == 0) {
                        i10 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            f10 = f3;
                            i10 |= composerKN.rl(f10) ? 16384 : 8192;
                        }
                        i15 = i9 & 32;
                        if (i15 != 0) {
                            i10 |= 196608;
                            brush4 = brush2;
                        } else {
                            brush4 = brush2;
                            if ((i7 & 196608) == 0) {
                                i10 |= composerKN.p5(brush4) ? 131072 : 65536;
                            }
                        }
                        i16 = i9 & 64;
                        if (i16 != 0) {
                            i10 |= 1572864;
                            f11 = f4;
                        } else {
                            f11 = f4;
                            if ((i7 & 1572864) == 0) {
                                i10 |= composerKN.rl(f11) ? 1048576 : 524288;
                            }
                        }
                        i17 = i9 & 128;
                        if (i17 != 0) {
                            i10 |= 12582912;
                        } else if ((i7 & 12582912) == 0) {
                            i10 |= composerKN.rl(f5) ? 8388608 : 4194304;
                        }
                        i18 = i9 & 256;
                        if (i18 != 0) {
                            i10 |= 100663296;
                        } else {
                            if ((i7 & 100663296) == 0) {
                                i19 = i18;
                                i10 |= composerKN.t(i3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i20 = i9 & 512;
                            if (i20 == 0) {
                                i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else {
                                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i21 = i20;
                                    i10 |= composerKN.t(i5) ? 536870912 : 268435456;
                                }
                                i22 = i9 & 1024;
                                if (i22 != 0) {
                                    i24 = i8 | 6;
                                    i23 = i22;
                                } else if ((i8 & 6) == 0) {
                                    i23 = i22;
                                    i24 = i8 | (composerKN.rl(f6) ? 4 : 2);
                                } else {
                                    i23 = i22;
                                    i24 = i8;
                                }
                                i25 = i9 & 2048;
                                if (i25 != 0) {
                                    i24 |= 48;
                                    i26 = i25;
                                } else if ((i8 & 48) == 0) {
                                    i26 = i25;
                                    i24 |= composerKN.rl(f7) ? 32 : 16;
                                } else {
                                    i26 = i25;
                                }
                                int i35 = i24;
                                i27 = i9 & 4096;
                                if (i27 != 0) {
                                    i28 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    int i36 = i35;
                                    if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i36 |= composerKN.rl(f8) ? 256 : 128;
                                    }
                                    i28 = i36;
                                }
                                i29 = i9 & 8192;
                                if (i29 == 0) {
                                    if ((i8 & 3072) == 0) {
                                        i28 |= composerKN.rl(f9) ? 2048 : 1024;
                                    }
                                    if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
                                        composerKN.wTp();
                                        str2 = str;
                                        f12 = f5;
                                        f13 = f7;
                                        f14 = f9;
                                        composer2 = composerKN;
                                        brush5 = brush3;
                                        f15 = f10;
                                        brush6 = brush4;
                                        i30 = i11;
                                        f16 = f11;
                                        i31 = i3;
                                        i32 = i5;
                                        f17 = f6;
                                        f18 = f8;
                                    } else {
                                        int iN = i34 != 0 ? VectorKt.n() : i11;
                                        String str3 = i12 != 0 ? "" : str;
                                        if (i13 != 0) {
                                            brush3 = null;
                                        }
                                        if (i14 != 0) {
                                            f10 = 1.0f;
                                        }
                                        if (i15 != 0) {
                                            brush4 = null;
                                        }
                                        if (i16 != 0) {
                                            f11 = 1.0f;
                                        }
                                        float f19 = i17 != 0 ? 0.0f : f5;
                                        int iRl = i19 != 0 ? VectorKt.rl() : i3;
                                        int iT = i21 != 0 ? VectorKt.t() : i5;
                                        float f20 = i23 != 0 ? 4.0f : f6;
                                        float f21 = i26 != 0 ? 0.0f : f7;
                                        float f22 = i27 == 0 ? f8 : 1.0f;
                                        float f23 = i29 == 0 ? f9 : 0.0f;
                                        if (ComposerKt.v()) {
                                            i33 = iN;
                                            ComposerKt.p5(-1478270750, i10, i28, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
                                        } else {
                                            i33 = iN;
                                        }
                                        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final PathComponent invoke() {
                                                return new PathComponent();
                                            }
                                        };
                                        if (!(composerKN.getApplier() instanceof VectorApplier)) {
                                            ComposablesKt.t();
                                        }
                                        composerKN.qie();
                                        if (composerKN.getInserting()) {
                                            composerKN.s7N(vectorComposeKt$Path$1);
                                        } else {
                                            composerKN.r();
                                        }
                                        Composer composerN = Updater.n(composerKN);
                                        Updater.O(composerN, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                                                n(pathComponent, str4);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, String str4) {
                                                pathComponent.mUb(str4);
                                            }
                                        });
                                        Updater.O(composerN, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                                                n(pathComponent, list2);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, List list2) {
                                                pathComponent.gh(list2);
                                            }
                                        });
                                        Updater.O(composerN, PathFillType.t(i33), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                                                n(pathComponent, pathFillType.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, int i37) {
                                                pathComponent.qie(i37);
                                            }
                                        });
                                        Updater.O(composerN, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush7) {
                                                n(pathComponent, brush7);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, Brush brush7) {
                                                pathComponent.KN(brush7);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f10), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.xMQ(f24);
                                            }
                                        });
                                        Updater.O(composerN, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush7) {
                                                n(pathComponent, brush7);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, Brush brush7) {
                                                pathComponent.az(brush7);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f11), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.ty(f24);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.r(f24);
                                            }
                                        });
                                        Updater.O(composerN, StrokeJoin.nr(iT), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                                                n(pathComponent, strokeJoin.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, int i37) {
                                                pathComponent.ck(i37);
                                            }
                                        });
                                        Updater.O(composerN, StrokeCap.nr(iRl), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                                                n(pathComponent, strokeCap.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, int i37) {
                                                pathComponent.HI(i37);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.Ik(f24);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f21), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.XQ(f24);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f22), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.o(f24);
                                            }
                                        });
                                        Updater.O(composerN, Float.valueOf(f23), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f24) {
                                                n(pathComponent, f24.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(PathComponent pathComponent, float f24) {
                                                pathComponent.Z(f24);
                                            }
                                        });
                                        composerKN.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        str2 = str3;
                                        composer2 = composerKN;
                                        brush5 = brush3;
                                        f15 = f10;
                                        brush6 = brush4;
                                        f16 = f11;
                                        i31 = iRl;
                                        i32 = iT;
                                        i30 = i33;
                                        f18 = f22;
                                        f14 = f23;
                                        f12 = f19;
                                        f17 = f20;
                                        f13 = f21;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                VectorComposeKt.rl(list, i30, str2, brush5, f15, brush6, f16, f12, i31, i32, f17, f13, f18, f14, composer3, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i28 |= 3072;
                                if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i21 = i20;
                            i22 = i9 & 1024;
                            if (i22 != 0) {
                            }
                            i25 = i9 & 2048;
                            if (i25 != 0) {
                            }
                            int i352 = i24;
                            i27 = i9 & 4096;
                            if (i27 != 0) {
                            }
                            i29 = i9 & 8192;
                            if (i29 == 0) {
                            }
                            if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i19 = i18;
                        i20 = i9 & 512;
                        if (i20 == 0) {
                        }
                        i21 = i20;
                        i22 = i9 & 1024;
                        if (i22 != 0) {
                        }
                        i25 = i9 & 2048;
                        if (i25 != 0) {
                        }
                        int i3522 = i24;
                        i27 = i9 & 4096;
                        if (i27 != 0) {
                        }
                        i29 = i9 & 8192;
                        if (i29 == 0) {
                        }
                        if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    f10 = f3;
                    i15 = i9 & 32;
                    if (i15 != 0) {
                    }
                    i16 = i9 & 64;
                    if (i16 != 0) {
                    }
                    i17 = i9 & 128;
                    if (i17 != 0) {
                    }
                    i18 = i9 & 256;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    i20 = i9 & 512;
                    if (i20 == 0) {
                    }
                    i21 = i20;
                    i22 = i9 & 1024;
                    if (i22 != 0) {
                    }
                    i25 = i9 & 2048;
                    if (i25 != 0) {
                    }
                    int i35222 = i24;
                    i27 = i9 & 4096;
                    if (i27 != 0) {
                    }
                    i29 = i9 & 8192;
                    if (i29 == 0) {
                    }
                    if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                brush3 = brush;
                i14 = i9 & 16;
                if (i14 == 0) {
                }
                f10 = f3;
                i15 = i9 & 32;
                if (i15 != 0) {
                }
                i16 = i9 & 64;
                if (i16 != 0) {
                }
                i17 = i9 & 128;
                if (i17 != 0) {
                }
                i18 = i9 & 256;
                if (i18 != 0) {
                }
                i19 = i18;
                i20 = i9 & 512;
                if (i20 == 0) {
                }
                i21 = i20;
                i22 = i9 & 1024;
                if (i22 != 0) {
                }
                i25 = i9 & 2048;
                if (i25 != 0) {
                }
                int i352222 = i24;
                i27 = i9 & 4096;
                if (i27 != 0) {
                }
                i29 = i9 & 8192;
                if (i29 == 0) {
                }
                if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i13 = i9 & 8;
            if (i13 != 0) {
            }
            brush3 = brush;
            i14 = i9 & 16;
            if (i14 == 0) {
            }
            f10 = f3;
            i15 = i9 & 32;
            if (i15 != 0) {
            }
            i16 = i9 & 64;
            if (i16 != 0) {
            }
            i17 = i9 & 128;
            if (i17 != 0) {
            }
            i18 = i9 & 256;
            if (i18 != 0) {
            }
            i19 = i18;
            i20 = i9 & 512;
            if (i20 == 0) {
            }
            i21 = i20;
            i22 = i9 & 1024;
            if (i22 != 0) {
            }
            i25 = i9 & 2048;
            if (i25 != 0) {
            }
            int i3522222 = i24;
            i27 = i9 & 4096;
            if (i27 != 0) {
            }
            i29 = i9 & 8192;
            if (i29 == 0) {
            }
            if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i11 = i2;
        i12 = i9 & 4;
        if (i12 == 0) {
        }
        i13 = i9 & 8;
        if (i13 != 0) {
        }
        brush3 = brush;
        i14 = i9 & 16;
        if (i14 == 0) {
        }
        f10 = f3;
        i15 = i9 & 32;
        if (i15 != 0) {
        }
        i16 = i9 & 64;
        if (i16 != 0) {
        }
        i17 = i9 & 128;
        if (i17 != 0) {
        }
        i18 = i9 & 256;
        if (i18 != 0) {
        }
        i19 = i18;
        i20 = i9 & 512;
        if (i20 == 0) {
        }
        i21 = i20;
        i22 = i9 & 1024;
        if (i22 != 0) {
        }
        i25 = i9 & 2048;
        if (i25 != 0) {
        }
        int i35222222 = i24;
        i27 = i9 & 4096;
        if (i27 != 0) {
        }
        i29 = i9 & 8192;
        if (i29 == 0) {
        }
        if (composerKN.HI((i10 & 306783379) == 306783378 || (i28 & 1171) != 1170, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, final Function2 function2, Composer composer, final int i2, final int i3) {
        String str2;
        int i5;
        float f10;
        int i7;
        float f11;
        int i8;
        float f12;
        int i9;
        float f13;
        int i10;
        int i11;
        int i12;
        int i13;
        final float f14;
        float f15;
        final List listNr;
        final float f16;
        final float f17;
        ScopeUpdateScope scopeUpdateScopeGh;
        float f18;
        float f19;
        float f20;
        Composer composerKN = composer.KN(-213417674);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i5 = i2 | 6;
            str2 = str;
        } else if ((i2 & 6) == 0) {
            str2 = str;
            i5 = (composerKN.p5(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i5 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                f10 = f3;
                i5 |= composerKN.rl(f10) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    f11 = f4;
                    i5 |= composerKN.rl(f11) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        f12 = f5;
                        i5 |= composerKN.rl(f12) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            f13 = f6;
                            i5 |= composerKN.rl(f13) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerKN.rl(f7) ? 131072 : 65536;
                        }
                        i11 = i3 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.rl(f8) ? 1048576 : 524288;
                        }
                        i12 = i3 & 128;
                        if (i12 == 0) {
                            if ((i2 & 12582912) == 0) {
                                i13 = i12;
                                i5 |= composerKN.rl(f9) ? 8388608 : 4194304;
                            }
                            if ((i2 & 100663296) == 0) {
                                i5 |= ((i3 & 256) == 0 && composerKN.E2(list)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) == 0) {
                                i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.E2(function2) ? 536870912 : 268435456;
                            }
                            if (composerKN.HI((306783379 & i5) == 306783378, i5 & 1)) {
                                composerKN.wTp();
                                f14 = f8;
                                f15 = f9;
                                listNr = list;
                                f16 = f10;
                                f17 = f7;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i14 != 0) {
                                        str2 = "";
                                    }
                                    if (i15 != 0) {
                                        f10 = 0.0f;
                                    }
                                    if (i7 != 0) {
                                        f11 = 0.0f;
                                    }
                                    if (i8 != 0) {
                                        f12 = 0.0f;
                                    }
                                    if (i9 != 0) {
                                        f13 = 1.0f;
                                    }
                                    f18 = i10 == 0 ? f7 : 1.0f;
                                    f14 = i11 != 0 ? 0.0f : f8;
                                    f19 = i13 == 0 ? f9 : 0.0f;
                                    if ((i3 & 256) != 0) {
                                        listNr = VectorKt.nr();
                                        i5 &= -234881025;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        f20 = f19;
                                    } else {
                                        f20 = f19;
                                        ComposerKt.p5(-213417674, i5, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                    }
                                    VectorComposeKt$Group$1 vectorComposeKt$Group$1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final GroupComponent invoke() {
                                            return new GroupComponent();
                                        }
                                    };
                                    if (!(composerKN.getApplier() instanceof VectorApplier)) {
                                        ComposablesKt.t();
                                    }
                                    composerKN.qie();
                                    if (composerKN.getInserting()) {
                                        composerKN.r();
                                    } else {
                                        composerKN.s7N(vectorComposeKt$Group$1);
                                    }
                                    Composer composerN = Updater.n(composerKN);
                                    Updater.O(composerN, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                            n(groupComponent, str3);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, String str3) {
                                            groupComponent.r(str3);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.XQ(f21);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.o(f21);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.Z(f21);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.S(f21);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f18), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.WPU(f21);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.aYN(f21);
                                        }
                                    });
                                    Updater.O(composerN, Float.valueOf(f20), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                            n(groupComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, float f21) {
                                            groupComponent.ViF(f21);
                                        }
                                    });
                                    Updater.O(composerN, listNr, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                            n(groupComponent, list2);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GroupComponent groupComponent, List list2) {
                                            groupComponent.Ik(list2);
                                        }
                                    });
                                    function2.invoke(composerKN, Integer.valueOf((i5 >> 27) & 14));
                                    composerKN.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    f15 = f20;
                                    f16 = f10;
                                    f17 = f18;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 256) != 0) {
                                        i5 &= -234881025;
                                    }
                                    f18 = f7;
                                    f14 = f8;
                                    f19 = f9;
                                }
                                listNr = list;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                VectorComposeKt$Group$1 vectorComposeKt$Group$12 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final GroupComponent invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                if (!(composerKN.getApplier() instanceof VectorApplier)) {
                                }
                                composerKN.qie();
                                if (composerKN.getInserting()) {
                                }
                                Composer composerN2 = Updater.n(composerKN);
                                Updater.O(composerN2, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                        n(groupComponent, str3);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, String str3) {
                                        groupComponent.r(str3);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.XQ(f21);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.o(f21);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.Z(f21);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.S(f21);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f18), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.WPU(f21);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.aYN(f21);
                                    }
                                });
                                Updater.O(composerN2, Float.valueOf(f20), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21) {
                                        n(groupComponent, f21.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, float f21) {
                                        groupComponent.ViF(f21);
                                    }
                                });
                                Updater.O(composerN2, listNr, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                        n(groupComponent, list2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GroupComponent groupComponent, List list2) {
                                        groupComponent.Ik(list2);
                                    }
                                });
                                function2.invoke(composerKN, Integer.valueOf((i5 >> 27) & 14));
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                f15 = f20;
                                f16 = f10;
                                f17 = f18;
                            }
                            final float f21 = f12;
                            final float f22 = f13;
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                final String str3 = str2;
                                final float f23 = f11;
                                final float f24 = f15;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i16) {
                                        VectorComposeKt.n(str3, f16, f23, f21, f22, f17, f14, f24, listNr, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 12582912;
                        i13 = i12;
                        if ((i2 & 100663296) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if (composerKN.HI((306783379 & i5) == 306783378, i5 & 1)) {
                        }
                        final float f212 = f12;
                        final float f222 = f13;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    f13 = f6;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if (composerKN.HI((306783379 & i5) == 306783378, i5 & 1)) {
                    }
                    final float f2122 = f12;
                    final float f2222 = f13;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                f12 = f5;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                f13 = f6;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                }
                i12 = i3 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if (composerKN.HI((306783379 & i5) == 306783378, i5 & 1)) {
                }
                final float f21222 = f12;
                final float f22222 = f13;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            f11 = f4;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            f12 = f5;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            f13 = f6;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            i11 = i3 & 64;
            if (i11 != 0) {
            }
            i12 = i3 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if (composerKN.HI((306783379 & i5) == 306783378, i5 & 1)) {
            }
            final float f212222 = f12;
            final float f222222 = f13;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        f10 = f3;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        f11 = f4;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        f12 = f5;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        f13 = f6;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        i11 = i3 & 64;
        if (i11 != 0) {
        }
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if (composerKN.HI((306783379 & i5) == 306783378, i5 & 1)) {
        }
        final float f2122222 = f12;
        final float f2222222 = f13;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
