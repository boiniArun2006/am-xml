package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J²\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\f2e\u0010\u0017\u001aa\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000e¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a²\u0006\f\u0010\u0012\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "<init>", "()V", "Landroidx/compose/material/InputPhase;", "inputState", "Landroidx/compose/ui/graphics/Color;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,381:1\n1969#2:382\n1884#2,7:383\n1969#2:390\n1884#2,7:391\n1884#2,7:409\n1884#2,7:427\n68#3,3:398\n71#3:404\n74#3:408\n68#3,3:416\n71#3:422\n74#3:426\n1225#4,3:401\n1228#4,3:405\n1225#4,3:419\n1228#4,3:423\n85#5:434\n85#5:435\n85#5:436\n85#5:437\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n291#1:382\n291#1:383,7\n303#1:390\n303#1:391,7\n333#1:409,7\n344#1:427,7\n333#1:398,3\n333#1:404\n333#1:408\n344#1:416,3\n344#1:422\n344#1:426\n333#1:401,3\n333#1:405,3\n344#1:419,3\n344#1:423,3\n291#1:434\n303#1:435\n333#1:436\n344#1:437\n*E\n"})
final class TextFieldTransitionScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextFieldTransitionScope f23736n = new TextFieldTransitionScope();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.f22115n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.f22117t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.f22114O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final InputPhase inputPhase, long j2, final long j3, final Function3 function3, final boolean z2, final Function6 function6, Composer composer, final int i2) {
        int i3;
        long j4;
        Function6 function62;
        Composer composer2;
        float f3;
        int i5;
        int i7;
        char c2;
        float f4;
        int i8;
        float f5;
        int i9;
        ColorSpace colorSpaceR;
        boolean zP5;
        Object objIF;
        ColorSpace colorSpaceR2;
        boolean zP52;
        Object objIF2;
        Composer composerKN = composer.KN(1988729962);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(inputPhase) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j4 = j2;
            i3 |= composerKN.nr(j4) ? 32 : 16;
        } else {
            j4 = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.n(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function62 = function6;
            i3 |= composerKN.E2(function62) ? 131072 : 65536;
        } else {
            function62 = function6;
        }
        if (composerKN.HI((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1988729962, i3, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:283)");
            }
            Transition transitionMUb = TransitionKt.mUb(inputPhase, "TextFieldInputState", composerKN, (i3 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                    return n(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i10) {
                    composer3.eF(-611722692);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-611722692, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
                    }
                    TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer3.Xw();
                    return tweenSpecTy;
                }
            };
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(floatCompanionObject);
            InputPhase inputPhase2 = (InputPhase) transitionMUb.xMQ();
            composerKN.eF(-1158004136);
            if (ComposerKt.v()) {
                ComposerKt.p5(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i10 = iArr[inputPhase2.ordinal()];
            float f6 = 0.0f;
            if (i10 == 1) {
                f3 = 1.0f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                Float fValueOf = Float.valueOf(f3);
                InputPhase inputPhase3 = (InputPhase) transitionMUb.Ik();
                composerKN.eF(-1158004136);
                if (ComposerKt.v()) {
                    i5 = -1;
                    ComposerKt.p5(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)");
                } else {
                    i5 = -1;
                }
                i7 = iArr[inputPhase3.ordinal()];
                if (i7 == 1) {
                    c2 = 3;
                } else if (i7 != 2) {
                    c2 = 3;
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    c2 = 3;
                    f4 = 0.0f;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composerKN.Xw();
                    State stateJ2 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "LabelProgress", composerKN, 196608);
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return n(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i11) {
                            FiniteAnimationSpec finiteAnimationSpecAz;
                            composer3.eF(-1079955085);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1079955085, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                            }
                            InputPhase inputPhase4 = InputPhase.f22115n;
                            InputPhase inputPhase5 = InputPhase.f22117t;
                            if (segment.t(inputPhase4, inputPhase5)) {
                                finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                            } else if (!segment.t(inputPhase5, inputPhase4) && !segment.t(InputPhase.f22114O, inputPhase5)) {
                                finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                            } else {
                                finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer3.Xw();
                            return finiteAnimationSpecAz;
                        }
                    };
                    TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(floatCompanionObject);
                    InputPhase inputPhase4 = (InputPhase) transitionMUb.xMQ();
                    composerKN.eF(-1376159017);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1376159017, 0, i5, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)");
                    }
                    i8 = iArr[inputPhase4.ordinal()];
                    if (i8 == 1) {
                        f5 = 1.0f;
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composerKN.Xw();
                        Float fValueOf2 = Float.valueOf(f5);
                        InputPhase inputPhase5 = (InputPhase) transitionMUb.Ik();
                        composerKN.eF(-1376159017);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1376159017, 0, i5, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)");
                        }
                        i9 = iArr[inputPhase5.ordinal()];
                        if (i9 == 1) {
                            f6 = 1.0f;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composerKN.Xw();
                            State stateJ22 = TransitionKt.J2(transitionMUb, fValueOf2, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ2, "PlaceholderOpacity", composerKN, 196608);
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return n(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i11) {
                                    composer3.eF(-130058045);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-130058045, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
                                    }
                                    TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer3.Xw();
                                    return tweenSpecTy;
                                }
                            };
                            InputPhase inputPhase6 = (InputPhase) transitionMUb.Ik();
                            composerKN.eF(-1490209928);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1490209928, 0, i5, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
                            }
                            long j5 = iArr[inputPhase6.ordinal()] != 1 ? j4 : j3;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composerKN.Xw();
                            colorSpaceR = Color.r(j5);
                            zP5 = composerKN.p5(colorSpaceR);
                            objIF = composerKN.iF();
                            if (!zP5 || objIF == Composer.INSTANCE.n()) {
                                objIF = (TwoWayConverter) ColorVectorConverterKt.n(Color.INSTANCE).invoke(colorSpaceR);
                                composerKN.o(objIF);
                            }
                            TwoWayConverter twoWayConverter = (TwoWayConverter) objIF;
                            InputPhase inputPhase7 = (InputPhase) transitionMUb.xMQ();
                            composerKN.eF(-1490209928);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1490209928, 0, i5, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
                            }
                            long j6 = iArr[inputPhase7.ordinal()] != 1 ? j4 : j3;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composerKN.Xw();
                            Color colorXMQ = Color.xMQ(j6);
                            InputPhase inputPhase8 = (InputPhase) transitionMUb.Ik();
                            composerKN.eF(-1490209928);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1490209928, 0, i5, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
                            }
                            long j7 = iArr[inputPhase8.ordinal()] != 1 ? j4 : j3;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composerKN.Xw();
                            State stateJ23 = TransitionKt.J2(transitionMUb, colorXMQ, Color.xMQ(j7), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter, "LabelTextStyleColor", composerKN, 196608);
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return n(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i11) {
                                    composer3.eF(-32667848);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-32667848, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
                                    }
                                    TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer3.Xw();
                                    return tweenSpecTy;
                                }
                            };
                            int i11 = (i3 & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK;
                            colorSpaceR2 = Color.r(((Color) function3.invoke(transitionMUb.Ik(), composerKN, Integer.valueOf((i11 >> 6) & 112))).getValue());
                            zP52 = composerKN.p5(colorSpaceR2);
                            objIF2 = composerKN.iF();
                            if (!zP52 || objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = (TwoWayConverter) ColorVectorConverterKt.n(Color.INSTANCE).invoke(colorSpaceR2);
                                composerKN.o(objIF2);
                            }
                            int i12 = ((((i11 << 3) & 57344) | 3072) >> 9) & 112;
                            function62.invoke(Float.valueOf(rl(stateJ2)), Color.xMQ(nr(stateJ23)), Color.xMQ(O(TransitionKt.J2(transitionMUb, function3.invoke(transitionMUb.xMQ(), composerKN, Integer.valueOf(i12)), function3.invoke(transitionMUb.Ik(), composerKN, Integer.valueOf(i12)), textFieldTransitionScope$Transition$labelContentColor$2.invoke(transitionMUb.HI(), composerKN, 0), (TwoWayConverter) objIF2, "LabelContentColor", composerKN, 196608))), Float.valueOf(t(stateJ22)), composerKN, Integer.valueOf((i3 >> 3) & 57344));
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        } else {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z2) {
                            }
                            if (ComposerKt.v()) {
                            }
                            composerKN.Xw();
                            State stateJ222 = TransitionKt.J2(transitionMUb, fValueOf2, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ2, "PlaceholderOpacity", composerKN, 196608);
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return n(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i112) {
                                    composer3.eF(-130058045);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-130058045, i112, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
                                    }
                                    TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer3.Xw();
                                    return tweenSpecTy;
                                }
                            };
                            InputPhase inputPhase62 = (InputPhase) transitionMUb.Ik();
                            composerKN.eF(-1490209928);
                            if (ComposerKt.v()) {
                            }
                            if (iArr[inputPhase62.ordinal()] != 1) {
                            }
                            if (ComposerKt.v()) {
                            }
                            composerKN.Xw();
                            colorSpaceR = Color.r(j5);
                            zP5 = composerKN.p5(colorSpaceR);
                            objIF = composerKN.iF();
                            if (!zP5) {
                                objIF = (TwoWayConverter) ColorVectorConverterKt.n(Color.INSTANCE).invoke(colorSpaceR);
                                composerKN.o(objIF);
                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) objIF;
                                InputPhase inputPhase72 = (InputPhase) transitionMUb.xMQ();
                                composerKN.eF(-1490209928);
                                if (ComposerKt.v()) {
                                }
                                if (iArr[inputPhase72.ordinal()] != 1) {
                                }
                                if (ComposerKt.v()) {
                                }
                                composerKN.Xw();
                                Color colorXMQ2 = Color.xMQ(j6);
                                InputPhase inputPhase82 = (InputPhase) transitionMUb.Ik();
                                composerKN.eF(-1490209928);
                                if (ComposerKt.v()) {
                                }
                                if (iArr[inputPhase82.ordinal()] != 1) {
                                }
                                if (ComposerKt.v()) {
                                }
                                composerKN.Xw();
                                State stateJ232 = TransitionKt.J2(transitionMUb, colorXMQ2, Color.xMQ(j7), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter2, "LabelTextStyleColor", composerKN, 196608);
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return n(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i112) {
                                        composer3.eF(-32667848);
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-32667848, i112, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
                                        }
                                        TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        composer3.Xw();
                                        return tweenSpecTy;
                                    }
                                };
                                int i112 = (i3 & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK;
                                colorSpaceR2 = Color.r(((Color) function3.invoke(transitionMUb.Ik(), composerKN, Integer.valueOf((i112 >> 6) & 112))).getValue());
                                zP52 = composerKN.p5(colorSpaceR2);
                                objIF2 = composerKN.iF();
                                if (!zP52) {
                                    objIF2 = (TwoWayConverter) ColorVectorConverterKt.n(Color.INSTANCE).invoke(colorSpaceR2);
                                    composerKN.o(objIF2);
                                    int i122 = ((((i112 << 3) & 57344) | 3072) >> 9) & 112;
                                    function62.invoke(Float.valueOf(rl(stateJ2)), Color.xMQ(nr(stateJ232)), Color.xMQ(O(TransitionKt.J2(transitionMUb, function3.invoke(transitionMUb.xMQ(), composerKN, Integer.valueOf(i122)), function3.invoke(transitionMUb.Ik(), composerKN, Integer.valueOf(i122)), textFieldTransitionScope$Transition$labelContentColor$22.invoke(transitionMUb.HI(), composerKN, 0), (TwoWayConverter) objIF2, "LabelContentColor", composerKN, 196608))), Float.valueOf(t(stateJ222)), composerKN, Integer.valueOf((i3 >> 3) & 57344));
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                    }
                                }
                            }
                        }
                    } else {
                        if (i8 == 2) {
                            if (z2) {
                            }
                            if (ComposerKt.v()) {
                            }
                            composerKN.Xw();
                            Float fValueOf22 = Float.valueOf(f5);
                            InputPhase inputPhase52 = (InputPhase) transitionMUb.Ik();
                            composerKN.eF(-1376159017);
                            if (ComposerKt.v()) {
                            }
                            i9 = iArr[inputPhase52.ordinal()];
                            if (i9 == 1) {
                            }
                        } else if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f5 = 0.0f;
                        if (ComposerKt.v()) {
                        }
                        composerKN.Xw();
                        Float fValueOf222 = Float.valueOf(f5);
                        InputPhase inputPhase522 = (InputPhase) transitionMUb.Ik();
                        composerKN.eF(-1376159017);
                        if (ComposerKt.v()) {
                        }
                        i9 = iArr[inputPhase522.ordinal()];
                        if (i9 == 1) {
                        }
                    }
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                State stateJ24 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "LabelProgress", composerKN, 196608);
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                        return n(segment, composer3, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i113) {
                        FiniteAnimationSpec finiteAnimationSpecAz;
                        composer3.eF(-1079955085);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1079955085, i113, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                        }
                        InputPhase inputPhase42 = InputPhase.f22115n;
                        InputPhase inputPhase53 = InputPhase.f22117t;
                        if (segment.t(inputPhase42, inputPhase53)) {
                            finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                        } else if (!segment.t(inputPhase53, inputPhase42) && !segment.t(InputPhase.f22114O, inputPhase53)) {
                            finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                        } else {
                            finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer3.Xw();
                        return finiteAnimationSpecAz;
                    }
                };
                TwoWayConverter twoWayConverterXMQ22 = VectorConvertersKt.xMQ(floatCompanionObject);
                InputPhase inputPhase42 = (InputPhase) transitionMUb.xMQ();
                composerKN.eF(-1376159017);
                if (ComposerKt.v()) {
                }
                i8 = iArr[inputPhase42.ordinal()];
                if (i8 == 1) {
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                Float fValueOf3 = Float.valueOf(f3);
                InputPhase inputPhase32 = (InputPhase) transitionMUb.Ik();
                composerKN.eF(-1158004136);
                if (ComposerKt.v()) {
                }
                i7 = iArr[inputPhase32.ordinal()];
                if (i7 == 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                State stateJ242 = TransitionKt.J2(transitionMUb, fValueOf3, Float.valueOf(f4), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "LabelProgress", composerKN, 196608);
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                        return n(segment, composer3, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i113) {
                        FiniteAnimationSpec finiteAnimationSpecAz;
                        composer3.eF(-1079955085);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1079955085, i113, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                        }
                        InputPhase inputPhase422 = InputPhase.f22115n;
                        InputPhase inputPhase53 = InputPhase.f22117t;
                        if (segment.t(inputPhase422, inputPhase53)) {
                            finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                        } else if (!segment.t(inputPhase53, inputPhase422) && !segment.t(InputPhase.f22114O, inputPhase53)) {
                            finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                        } else {
                            finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer3.Xw();
                        return finiteAnimationSpecAz;
                    }
                };
                TwoWayConverter twoWayConverterXMQ222 = VectorConvertersKt.xMQ(floatCompanionObject);
                InputPhase inputPhase422 = (InputPhase) transitionMUb.xMQ();
                composerKN.eF(-1376159017);
                if (ComposerKt.v()) {
                }
                i8 = iArr[inputPhase422.ordinal()];
                if (i8 == 1) {
                }
            } else {
                f3 = 0.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                Float fValueOf32 = Float.valueOf(f3);
                InputPhase inputPhase322 = (InputPhase) transitionMUb.Ik();
                composerKN.eF(-1158004136);
                if (ComposerKt.v()) {
                }
                i7 = iArr[inputPhase322.ordinal()];
                if (i7 == 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.v()) {
                }
                composerKN.Xw();
                State stateJ2422 = TransitionKt.J2(transitionMUb, fValueOf32, Float.valueOf(f4), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverterXMQ, "LabelProgress", composerKN, 196608);
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                        return n(segment, composer3, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i113) {
                        FiniteAnimationSpec finiteAnimationSpecAz;
                        composer3.eF(-1079955085);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1079955085, i113, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                        }
                        InputPhase inputPhase4222 = InputPhase.f22115n;
                        InputPhase inputPhase53 = InputPhase.f22117t;
                        if (segment.t(inputPhase4222, inputPhase53)) {
                            finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                        } else if (!segment.t(inputPhase53, inputPhase4222) && !segment.t(InputPhase.f22114O, inputPhase53)) {
                            finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                        } else {
                            finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer3.Xw();
                        return finiteAnimationSpecAz;
                    }
                };
                TwoWayConverter twoWayConverterXMQ2222 = VectorConvertersKt.xMQ(floatCompanionObject);
                InputPhase inputPhase4222 = (InputPhase) transitionMUb.xMQ();
                composerKN.eF(-1376159017);
                if (ComposerKt.v()) {
                }
                i8 = iArr[inputPhase4222.ordinal()];
                if (i8 == 1) {
                }
            }
        } else {
            composer2 = composerKN;
            composer2.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final long j9 = j4;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i13) {
                    this.f23740n.n(inputPhase, j9, j3, function3, z2, function6, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final long O(State state) {
        return ((Color) state.getValue()).getValue();
    }

    private static final long nr(State state) {
        return ((Color) state.getValue()).getValue();
    }

    private static final float rl(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
