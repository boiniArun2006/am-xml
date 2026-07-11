package androidx.compose.foundation;

import GJW.vd;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.foundation.AndroidExternalSurfaceZOrder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a]\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aU\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceState;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isOpaque", "Landroidx/compose/ui/unit/IntSize;", "surfaceSize", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "zOrder", "isSecure", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "", "Lkotlin/ExtensionFunctionType;", "onInit", "rl", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/ui/graphics/Matrix;", "transform", c.f62177j, "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,457:1\n557#2:458\n554#2,6:459\n557#2:490\n554#2,6:491\n1247#3,3:465\n1250#3,3:469\n1247#3,6:472\n1247#3,6:478\n1247#3,6:484\n1247#3,3:497\n1250#3,3:501\n1247#3,6:504\n1247#3,6:510\n555#4:468\n555#4:500\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n190#1:458\n190#1:459,6\n373#1:490\n373#1:491,6\n190#1:465,3\n190#1:469,3\n191#1:472,6\n280#1:478,6\n288#1:484,6\n373#1:497,3\n373#1:501,3\n374#1:504,6\n441#1:510,6\n190#1:468\n373#1:500\n*E\n"})
public final class AndroidExternalSurface_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, boolean z2, long j2, float[] fArr, final Function1 function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        boolean z3;
        long jN;
        int i7;
        Function1 function12;
        final float[] fArr2;
        final Modifier modifier3;
        final boolean z4;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        final float[] fArr3;
        final boolean z5;
        final AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceStateT;
        boolean zE2;
        Object objIF;
        final long j4;
        Composer composerKN = composer.KN(217541314);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                jN = j2;
                i5 |= ((i3 & 4) == 0 && composerKN.nr(jN)) ? 256 : 128;
            } else {
                jN = j2;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(fArr != null ? Matrix.n(fArr) : null) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i2 & 24576) == 0) {
                    function12 = function1;
                    i5 |= composerKN.E2(function12) ? 16384 : 8192;
                }
                if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i9 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                            jN = IntSize.INSTANCE.n();
                        }
                        if (i7 != 0) {
                            z5 = z3;
                            fArr3 = null;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(217541314, i5, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:433)");
                            }
                            androidEmbeddedExternalSurfaceStateT = t(composerKN, 0);
                            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 = new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final TextureView invoke(Context context) {
                                    return new TextureView(context);
                                }
                            };
                            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                                public final void n(TextureView textureView) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                                    n(textureView);
                                    return Unit.INSTANCE;
                                }
                            };
                            zE2 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 && composerKN.nr(jN)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(androidEmbeddedExternalSurfaceStateT) | ((57344 & i5) == 16384) | ((i5 & 112) == 32) | composerKN.E2(fArr3 != null ? Matrix.n(fArr3) : null);
                            objIF = composerKN.iF();
                            if (zE2 || objIF == Composer.INSTANCE.n()) {
                                j4 = jN;
                                final Function1 function13 = function12;
                                objIF = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                                        n(textureView);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TextureView textureView) {
                                        android.graphics.Matrix matrix;
                                        SurfaceTexture surfaceTexture;
                                        if (!IntSize.O(j4, IntSize.INSTANCE.n()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                            long j5 = j4;
                                            surfaceTexture.setDefaultBufferSize((int) (j5 >> 32), (int) (j5 & 4294967295L));
                                        }
                                        androidEmbeddedExternalSurfaceStateT.Uo(j4);
                                        TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
                                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateT;
                                        if (surfaceTextureListener != androidEmbeddedExternalSurfaceState) {
                                            function13.invoke(androidEmbeddedExternalSurfaceState);
                                            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceStateT);
                                        }
                                        textureView.setOpaque(z5);
                                        float[] fArr4 = fArr3;
                                        if (fArr4 != null) {
                                            matrix = androidEmbeddedExternalSurfaceStateT.getMatrix();
                                            AndroidMatrixConversions_androidKt.n(matrix, fArr4);
                                        } else {
                                            matrix = null;
                                        }
                                        textureView.setTransform(matrix);
                                    }
                                };
                                composerKN.o(objIF);
                            } else {
                                j4 = jN;
                            }
                            Modifier modifier5 = modifier4;
                            AndroidView_androidKt.rl(androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1, modifier5, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2, null, (Function1) objIF, composerKN, ((i5 << 3) & 112) | 390, 8);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier5;
                            j3 = j4;
                            z4 = z5;
                            fArr2 = fArr3;
                        } else {
                            fArr3 = fArr;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        fArr3 = fArr;
                        modifier4 = modifier2;
                    }
                    z5 = z3;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    androidEmbeddedExternalSurfaceStateT = t(composerKN, 0);
                    AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$12 = new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final TextureView invoke(Context context) {
                            return new TextureView(context);
                        }
                    };
                    AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$22 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                        public final void n(TextureView textureView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                            n(textureView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                        zE2 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 && composerKN.nr(jN)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(androidEmbeddedExternalSurfaceStateT) | ((57344 & i5) == 16384) | ((i5 & 112) == 32) | composerKN.E2(fArr3 != null ? Matrix.n(fArr3) : null);
                        objIF = composerKN.iF();
                        if (zE2) {
                            j4 = jN;
                            final Function1 function132 = function12;
                            objIF = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                                    n(textureView);
                                    return Unit.INSTANCE;
                                }

                                public final void n(TextureView textureView) {
                                    android.graphics.Matrix matrix;
                                    SurfaceTexture surfaceTexture;
                                    if (!IntSize.O(j4, IntSize.INSTANCE.n()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                        long j5 = j4;
                                        surfaceTexture.setDefaultBufferSize((int) (j5 >> 32), (int) (j5 & 4294967295L));
                                    }
                                    androidEmbeddedExternalSurfaceStateT.Uo(j4);
                                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
                                    AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateT;
                                    if (surfaceTextureListener != androidEmbeddedExternalSurfaceState) {
                                        function132.invoke(androidEmbeddedExternalSurfaceState);
                                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceStateT);
                                    }
                                    textureView.setOpaque(z5);
                                    float[] fArr4 = fArr3;
                                    if (fArr4 != null) {
                                        matrix = androidEmbeddedExternalSurfaceStateT.getMatrix();
                                        AndroidMatrixConversions_androidKt.n(matrix, fArr4);
                                    } else {
                                        matrix = null;
                                    }
                                    textureView.setTransform(matrix);
                                }
                            };
                            composerKN.o(objIF);
                            Modifier modifier52 = modifier4;
                            AndroidView_androidKt.rl(androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$12, modifier52, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$22, null, (Function1) objIF, composerKN, ((i5 << 3) & 112) | 390, 8);
                            if (ComposerKt.v()) {
                            }
                            modifier3 = modifier52;
                            j3 = j4;
                            z4 = z5;
                            fArr2 = fArr3;
                        }
                    } else {
                        zE2 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 && composerKN.nr(jN)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(androidEmbeddedExternalSurfaceStateT) | ((57344 & i5) == 16384) | ((i5 & 112) == 32) | composerKN.E2(fArr3 != null ? Matrix.n(fArr3) : null);
                        objIF = composerKN.iF();
                        if (zE2) {
                        }
                    }
                } else {
                    composerKN.wTp();
                    fArr2 = fArr;
                    modifier3 = modifier2;
                    z4 = z3;
                    j3 = jN;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i10) {
                            AndroidExternalSurface_androidKt.n(modifier3, z4, j3, fArr2, function1, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            function12 = function1;
            if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        z3 = z2;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        function12 = function1;
        if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Modifier modifier, boolean z2, long j2, int i2, boolean z3, final Function1 function1, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        boolean z4;
        long jN;
        int i8;
        int iN;
        int i9;
        boolean z5;
        final Modifier modifier3;
        final boolean z6;
        final long j3;
        final boolean z7;
        final int i10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        long j4;
        int i11;
        boolean z9;
        Composer composerKN = composer.KN(640888974);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i7 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerKN.p5(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i7 = i3;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                z4 = z2;
                i7 |= composerKN.n(z4) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                jN = j2;
                i7 |= ((i5 & 4) == 0 && composerKN.nr(jN)) ? 256 : 128;
            } else {
                jN = j2;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    iN = i2;
                    i7 |= composerKN.t(iN) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i3 & 24576) == 0) {
                        z5 = z3;
                        i7 |= composerKN.n(z5) ? 16384 : 8192;
                    }
                    if ((i5 & 32) == 0) {
                        i7 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        i7 |= composerKN.E2(function1) ? 131072 : 65536;
                    }
                    if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z6 = z4;
                        j3 = jN;
                        z7 = z5;
                        i10 = iN;
                    } else {
                        composerKN.e();
                        if ((i3 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier5 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i13 != 0) {
                                z4 = true;
                            }
                            if ((i5 & 4) != 0) {
                                i7 &= -897;
                                jN = IntSize.INSTANCE.n();
                            }
                            if (i8 != 0) {
                                iN = AndroidExternalSurfaceZOrder.INSTANCE.n();
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            modifier4 = modifier5;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 4) != 0) {
                                i7 &= -897;
                            }
                            modifier4 = modifier2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(640888974, i7, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:275)");
                        }
                        final AndroidExternalSurfaceState androidExternalSurfaceStateNr = nr(composerKN, 0);
                        boolean zE2 = ((458752 & i7) == 131072) | composerKN.E2(androidExternalSurfaceStateNr);
                        Object objIF = composerKN.iF();
                        if (zE2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final SurfaceView invoke(Context context) {
                                    SurfaceView surfaceView = new SurfaceView(context);
                                    Function1 function12 = function1;
                                    AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateNr;
                                    function12.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }
                            };
                            composerKN.o(objIF);
                        }
                        Function1 function12 = (Function1) objIF;
                        AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                            public final void n(SurfaceView surfaceView) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                n(surfaceView);
                                return Unit.INSTANCE;
                            }
                        };
                        boolean z10 = ((57344 & i7) == 16384) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jN)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((i7 & 112) == 32) | ((i7 & 7168) == 2048);
                        Object objIF2 = composerKN.iF();
                        if (z10 || objIF2 == Composer.INSTANCE.n()) {
                            final boolean z11 = z4;
                            final long j5 = jN;
                            final boolean z12 = z5;
                            final int i14 = iN;
                            objIF2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    n(surfaceView);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SurfaceView surfaceView) {
                                    if (IntSize.O(j5, IntSize.INSTANCE.n())) {
                                        surfaceView.getHolder().setSizeFromLayout();
                                    } else {
                                        SurfaceHolder holder = surfaceView.getHolder();
                                        long j6 = j5;
                                        holder.setFixedSize((int) (j6 >> 32), (int) (j6 & 4294967295L));
                                    }
                                    surfaceView.getHolder().setFormat(z11 ? -1 : -3);
                                    int i15 = i14;
                                    AndroidExternalSurfaceZOrder.Companion companion = AndroidExternalSurfaceZOrder.INSTANCE;
                                    if (AndroidExternalSurfaceZOrder.J2(i15, companion.n())) {
                                        surfaceView.setZOrderOnTop(false);
                                    } else if (AndroidExternalSurfaceZOrder.J2(i15, companion.rl())) {
                                        surfaceView.setZOrderMediaOverlay(true);
                                    } else if (AndroidExternalSurfaceZOrder.J2(i15, companion.t())) {
                                        surfaceView.setZOrderOnTop(true);
                                    }
                                    surfaceView.setSecure(z12);
                                }
                            };
                            j4 = j5;
                            i11 = i14;
                            z9 = z12;
                            composerKN.o(objIF2);
                        } else {
                            j4 = jN;
                            z9 = z5;
                            i11 = iN;
                        }
                        AndroidView_androidKt.rl(function12, modifier4, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) objIF2, composerKN, ((i7 << 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        j3 = j4;
                        z6 = z4;
                        modifier3 = modifier4;
                        z7 = z9;
                        i10 = i11;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i15) {
                                AndroidExternalSurface_androidKt.rl(modifier3, z6, j3, i10, z7, function1, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                z5 = z3;
                if ((i5 & 32) == 0) {
                }
                if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            iN = i2;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z5 = z3;
            if ((i5 & 32) == 0) {
            }
            if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        z4 = z2;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        iN = i2;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z5 = z3;
        if ((i5 & 32) == 0) {
        }
        if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final AndroidExternalSurfaceState nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-873615933, i2, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:188)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
            composer.o(objIF);
        }
        vd vdVar = (vd) objIF;
        Object objIF2 = composer.iF();
        if (objIF2 == companion.n()) {
            objIF2 = new AndroidExternalSurfaceState(vdVar);
            composer.o(objIF2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) objIF2;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return androidExternalSurfaceState;
    }

    private static final AndroidEmbeddedExternalSurfaceState t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1057437053, i2, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:371)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
            composer.o(objIF);
        }
        vd vdVar = (vd) objIF;
        Object objIF2 = composer.iF();
        if (objIF2 == companion.n()) {
            objIF2 = new AndroidEmbeddedExternalSurfaceState(vdVar);
            composer.o(objIF2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) objIF2;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return androidEmbeddedExternalSurfaceState;
    }
}
