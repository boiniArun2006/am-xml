package Pjo;

import GJW.vd;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class aC {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7816n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f7817t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f7817t = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f7817t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7816n == 0) {
                ResultKt.throwOnFailure(obj);
                aC.nr(this.f7817t, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f7818O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7819n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Player f7820t;

        public static final class j implements Player.Listener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Player f7821n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MutableState f7822t;

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i2) {
                if (i2 == 3) {
                    MutableState mutableState = this.f7822t;
                    Duration.Companion companion = Duration.INSTANCE;
                    aC.nr(mutableState, Duration.m1650boximpl(DurationKt.toDuration(this.f7821n.getDuration(), DurationUnit.MILLISECONDS)));
                }
            }

            j(Player player, MutableState mutableState) {
                this.f7821n = player;
                this.f7822t = mutableState;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Player player, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f7820t = player;
            this.f7818O = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f7820t, this.f7818O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7819n == 0) {
                ResultKt.throwOnFailure(obj);
                Player player = this.f7820t;
                if (player != null) {
                    player.addListener(new j(player, this.f7818O));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String title, final List tags, final int i2, final int i3, final boolean z2, final boolean z3, final Function0 onBackClicked, final Function0 onSaveClicked, final Function0 onUseTemplateClicked, final Function0 onSeeAllSavedClicked, final Function0 onRightScreenHalfClicked, final Function0 onLeftScreenHalfClicked, final Player player, Modifier modifier, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Object objIF;
        Composer.Companion companion;
        MutableState mutableState;
        Object objIF2;
        boolean zE2;
        Object objIF3;
        Object obj;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        DefaultConstructorMarker defaultConstructorMarker;
        int i17;
        int i18;
        Unit unit;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onSaveClicked, "onSaveClicked");
        Intrinsics.checkNotNullParameter(onUseTemplateClicked, "onUseTemplateClicked");
        Intrinsics.checkNotNullParameter(onSeeAllSavedClicked, "onSeeAllSavedClicked");
        Intrinsics.checkNotNullParameter(onRightScreenHalfClicked, "onRightScreenHalfClicked");
        Intrinsics.checkNotNullParameter(onLeftScreenHalfClicked, "onLeftScreenHalfClicked");
        Composer composerKN = composer.KN(-849471382);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = i5 | (composerKN.p5(title) ? 4 : 2);
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 |= composerKN.E2(tags) ? 32 : 16;
        }
        int i19 = i9;
        if ((i8 & 4) != 0) {
            i19 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i19 |= composerKN.t(i2) ? 256 : 128;
        }
        if ((i8 & 8) != 0) {
            i19 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i19 |= composerKN.t(i3) ? 2048 : 1024;
        }
        if ((i8 & 16) != 0) {
            i19 |= 24576;
        } else {
            if ((i5 & 24576) == 0) {
                i19 |= composerKN.n(z2) ? 16384 : 8192;
            }
            if ((i8 & 32) == 0) {
                i19 |= 196608;
            } else {
                if ((i5 & 196608) == 0) {
                    i10 = i19 | (composerKN.n(z3) ? 131072 : 65536);
                }
                if ((i8 & 64) != 0) {
                    i10 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i10 |= composerKN.E2(onBackClicked) ? 1048576 : 524288;
                }
                if ((i8 & 128) != 0) {
                    i10 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    i10 |= composerKN.E2(onSaveClicked) ? 8388608 : 4194304;
                }
                if ((i8 & 256) != 0) {
                    i10 |= 100663296;
                } else if ((i5 & 100663296) == 0) {
                    i10 |= composerKN.E2(onUseTemplateClicked) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                if ((i8 & 512) != 0) {
                    i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i10 |= composerKN.E2(onSeeAllSavedClicked) ? 536870912 : 268435456;
                }
                i11 = i10;
                if ((i8 & 1024) != 0) {
                    i13 = i7 | 6;
                } else if ((i7 & 6) == 0) {
                    i13 = i7 | (composerKN.E2(onRightScreenHalfClicked) ? 4 : 2);
                } else {
                    i12 = i7;
                    if ((i8 & 2048) == 0) {
                        i14 = i12 | 48;
                    } else if ((i7 & 48) == 0) {
                        i14 = i12 | (composerKN.E2(onLeftScreenHalfClicked) ? 32 : 16);
                    } else {
                        i14 = i12;
                    }
                    if ((i8 & 4096) == 0) {
                        i14 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i14 |= composerKN.E2(player) ? 256 : 128;
                    }
                    i15 = 8192 & i8;
                    if (i15 != 0) {
                        i16 = i15;
                        if ((i7 & 3072) == 0) {
                            i14 |= composerKN.p5(modifier) ? 2048 : 1024;
                        }
                        if ((i11 & 306783379) == 306783378 && (i14 & 1171) == 1170 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier2 = modifier;
                        } else {
                            Modifier modifier3 = i16 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-849471382, i11, i14, "com.alightcreative.app.motion.activities.main.templatepreview.stories.StoriesScreen (StoriesScreen.kt:45)");
                            }
                            composerKN.eF(-1269693);
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF != companion.n()) {
                                objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                                composerKN.o(objIF);
                            }
                            mutableState = (MutableState) objIF;
                            composerKN.Xw();
                            Integer numValueOf = Integer.valueOf(i2);
                            composerKN.eF(-1267302);
                            objIF2 = composerKN.iF();
                            int i20 = i14;
                            if (objIF2 == companion.n()) {
                                objIF2 = new j(mutableState, null);
                                composerKN.o(objIF2);
                            }
                            composerKN.Xw();
                            int i21 = i11 >> 6;
                            EffectsKt.O(numValueOf, (Function2) objIF2, composerKN, i21 & 14);
                            composerKN.eF(-1265317);
                            zE2 = composerKN.E2(player);
                            objIF3 = composerKN.iF();
                            if (!zE2 || objIF3 == companion.n()) {
                                obj = null;
                                objIF3 = new n(player, mutableState, null);
                                composerKN.o(objIF3);
                            } else {
                                obj = null;
                            }
                            composerKN.Xw();
                            int i22 = (i20 >> 6) & 14;
                            EffectsKt.O(player, (Function2) objIF3, composerKN, i22);
                            Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(modifier3, 0.0f, 1, obj), Color.INSTANCE.n(), null, 2, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                            iN = ComposablesKt.n(composerKN, 0);
                            Modifier modifier4 = modifier3;
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion3.n();
                            if (composerKN.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                                composerKN.r();
                            } else {
                                composerKN.s7N(function0N);
                            }
                            composerN = Updater.n(composerKN);
                            Updater.O(composerN, measurePolicyUo, companion3.t());
                            Updater.O(composerN, compositionLocalMapIk, companion3.O());
                            function2Rl = companion3.rl();
                            if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion3.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            composerKN.eF(-423277413);
                            if (player != null) {
                                i18 = 2;
                                defaultConstructorMarker = null;
                            } else {
                                Duration durationT = t(mutableState);
                                composerKN.eF(-423276608);
                                if (durationT == null) {
                                    i17 = 32;
                                    i18 = 2;
                                    defaultConstructorMarker = null;
                                    unit = null;
                                } else {
                                    durationT.getRawValue();
                                    defaultConstructorMarker = null;
                                    i17 = 32;
                                    i18 = 2;
                                    PlayerSurfaceKt.PlayerSurface(player, SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), 0, composerKN, i22 | 48, 4);
                                    unit = Unit.INSTANCE;
                                }
                                composerKN.Xw();
                                composerKN.eF(-423276865);
                                if (unit == null) {
                                    ProgressIndicatorKt.nr(boxScopeInstance.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(i17)), companion2.O()), ((aF1.j) composerKN.ty(aF1.w6.t())).J2(), 0.0f, 0L, 0, composerKN, 0, 28);
                                }
                                composerKN.Xw();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composerKN.Xw();
                            nz.aC aCVar = new nz.aC(i3, i2, t(mutableState), defaultConstructorMarker);
                            Modifier modifierO2 = WindowInsetsPadding_androidKt.O(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(20), 0.0f, i18, defaultConstructorMarker));
                            int i23 = i11 >> 9;
                            nz.Ml.rl(title, z2, z3, tags, onBackClicked, onSaveClicked, onUseTemplateClicked, onSeeAllSavedClicked, modifierO2, aCVar, onLeftScreenHalfClicked, onRightScreenHalfClicked, false, composerKN, (i11 & 14) | (i23 & 112) | (i23 & 896) | ((i11 << 6) & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128), ((i20 >> 3) & 14) | ((i20 << 3) & 112), 4096);
                            composerKN = composerKN;
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier2 = modifier4;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: Pjo.Dsr
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return aC.O(title, tags, i2, i3, z2, z3, onBackClicked, onSaveClicked, onUseTemplateClicked, onSeeAllSavedClicked, onRightScreenHalfClicked, onLeftScreenHalfClicked, player, modifier2, i5, i7, i8, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 |= 3072;
                    i16 = i15;
                    if ((i11 & 306783379) == 306783378) {
                        if (i16 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        composerKN.eF(-1269693);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF != companion.n()) {
                        }
                        mutableState = (MutableState) objIF;
                        composerKN.Xw();
                        Integer numValueOf2 = Integer.valueOf(i2);
                        composerKN.eF(-1267302);
                        objIF2 = composerKN.iF();
                        int i202 = i14;
                        if (objIF2 == companion.n()) {
                        }
                        composerKN.Xw();
                        int i212 = i11 >> 6;
                        EffectsKt.O(numValueOf2, (Function2) objIF2, composerKN, i212 & 14);
                        composerKN.eF(-1265317);
                        zE2 = composerKN.E2(player);
                        objIF3 = composerKN.iF();
                        if (zE2) {
                            obj = null;
                            objIF3 = new n(player, mutableState, null);
                            composerKN.o(objIF3);
                            composerKN.Xw();
                            int i222 = (i202 >> 6) & 14;
                            EffectsKt.O(player, (Function2) objIF3, composerKN, i222);
                            Modifier modifierNr2 = BackgroundKt.nr(SizeKt.J2(modifier3, 0.0f, 1, obj), Color.INSTANCE.n(), null, 2, null);
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
                            iN = ComposablesKt.n(composerKN, 0);
                            Modifier modifier42 = modifier3;
                            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierNr2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0 function0N2 = companion32.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN = Updater.n(composerKN);
                            Updater.O(composerN, measurePolicyUo2, companion32.t());
                            Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                            function2Rl = companion32.rl();
                            if (!composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO3, companion32.nr());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                composerKN.eF(-423277413);
                                if (player != null) {
                                }
                                composerKN.Xw();
                                nz.aC aCVar2 = new nz.aC(i3, i2, t(mutableState), defaultConstructorMarker);
                                Modifier modifierO22 = WindowInsetsPadding_androidKt.O(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(20), 0.0f, i18, defaultConstructorMarker));
                                int i232 = i11 >> 9;
                                nz.Ml.rl(title, z2, z3, tags, onBackClicked, onSaveClicked, onUseTemplateClicked, onSeeAllSavedClicked, modifierO22, aCVar2, onLeftScreenHalfClicked, onRightScreenHalfClicked, false, composerKN, (i11 & 14) | (i232 & 112) | (i232 & 896) | ((i11 << 6) & 7168) | (i212 & 57344) | (i212 & 458752) | (i212 & 3670016) | (i212 & 29360128), ((i202 >> 3) & 14) | ((i202 << 3) & 112), 4096);
                                composerKN = composerKN;
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                modifier2 = modifier42;
                            }
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i13;
                if ((i8 & 2048) == 0) {
                }
                if ((i8 & 4096) == 0) {
                }
                i15 = 8192 & i8;
                if (i15 != 0) {
                }
                if ((i11 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i10 = i19;
            if ((i8 & 64) != 0) {
            }
            if ((i8 & 128) != 0) {
            }
            if ((i8 & 256) != 0) {
            }
            if ((i8 & 512) != 0) {
            }
            i11 = i10;
            if ((i8 & 1024) != 0) {
            }
            i12 = i13;
            if ((i8 & 2048) == 0) {
            }
            if ((i8 & 4096) == 0) {
            }
            i15 = 8192 & i8;
            if (i15 != 0) {
            }
            if ((i11 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i8 & 32) == 0) {
        }
        i10 = i19;
        if ((i8 & 64) != 0) {
        }
        if ((i8 & 128) != 0) {
        }
        if ((i8 & 256) != 0) {
        }
        if ((i8 & 512) != 0) {
        }
        i11 = i10;
        if ((i8 & 1024) != 0) {
        }
        i12 = i13;
        if ((i8 & 2048) == 0) {
        }
        if ((i8 & 4096) == 0) {
        }
        i15 = 8192 & i8;
        if (i15 != 0) {
        }
        if ((i11 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(String str, List list, int i2, int i3, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Player player, Modifier modifier, int i5, int i7, int i8, Composer composer, int i9) {
        rl(str, list, i2, i3, z2, z3, function0, function02, function03, function04, function05, function06, player, modifier, composer, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableState mutableState, Duration duration) {
        mutableState.setValue(duration);
    }

    private static final Duration t(MutableState mutableState) {
        return (Duration) mutableState.getValue();
    }
}
