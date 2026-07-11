package KA9;

import Dj7.AbstractC1328c;
import KA9.UGc;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.TimeKt;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f4892n = Dp.KN(12);

    static final class j implements Function2 {
        final /* synthetic */ String E2;
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ MutableState f4893N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f4894O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ MutableState f4895S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ String f4896T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ String f4897X;
        final /* synthetic */ MutableState Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f4898Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4899e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProjectInfo f4900g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f4901n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ okd.n f4902o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f4903r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f4904t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function0 f4905v;

        /* JADX INFO: renamed from: KA9.UGc$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0176j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[okd.n.values().length];
                try {
                    iArr[okd.n.f71573t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[okd.n.f71568O.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[okd.n.J2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[okd.n.f71572r.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(boolean z2, Function0 function0, boolean z3, Function0 function02, boolean z4, okd.n nVar, boolean z5, MutableState mutableState, ProjectInfo projectInfo, String str, String str2, String str3, String str4, MutableState mutableState2, Function0 function03, MutableState mutableState3) {
            this.f4901n = z2;
            this.f4904t = function0;
            this.f4894O = z3;
            this.J2 = function02;
            this.f4903r = z4;
            this.f4902o = nVar;
            this.f4898Z = z5;
            this.f4895S = mutableState;
            this.f4900g = projectInfo;
            this.E2 = str;
            this.f4899e = str2;
            this.f4897X = str3;
            this.f4896T = str4;
            this.f4893N = mutableState2;
            this.f4905v = function03;
            this.Xw = mutableState3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(MutableState mutableState, Function0 function0, MutableState mutableState2) {
            if (mutableState != null) {
                mutableState.setValue(Offset.nr(UGc.mUb(mutableState2)));
            }
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(boolean z2, Function0 function0, Function0 function02) {
            if (z2) {
                function0.invoke();
            } else {
                function02.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            okd.n nVar;
            int i3;
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(408624435, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemRow.<anonymous>.<anonymous>.<anonymous> (ProjectItemRow.kt:145)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierN = ClipKt.n(companion, RoundedCornerShapeKt.t(UGc.f4892n));
            boolean z2 = this.f4901n;
            Function0 function0 = this.f4904t;
            composer2.eF(865766552);
            boolean zN = composer2.n(this.f4894O) | composer2.p5(this.f4904t) | composer2.p5(this.J2);
            final boolean z3 = this.f4894O;
            final Function0 function02 = this.f4904t;
            final Function0 function03 = this.J2;
            Object objIF = composer2.iF();
            if (zN || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: KA9.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UGc.j.nr(z3, function02, function03);
                    }
                };
                composer2.o(objIF);
            }
            composer2.Xw();
            Modifier modifierMUb = ClickableKt.mUb(modifierN, z2, null, null, null, function0, null, false, (Function0) objIF, 110, null);
            boolean z4 = this.f4894O;
            boolean z5 = this.f4903r;
            okd.n nVar2 = this.f4902o;
            boolean z6 = this.f4898Z;
            MutableState mutableState = this.f4895S;
            ProjectInfo projectInfo = this.f4900g;
            String str = this.E2;
            String str2 = this.f4899e;
            String str3 = this.f4897X;
            String str4 = this.f4896T;
            final MutableState mutableState2 = this.f4893N;
            final Function0 function04 = this.f4905v;
            final MutableState mutableState3 = this.Xw;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, modifierMUb);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(UGc.f4892n)), Color.INSTANCE.KN(), null, 2, null), Dp.KN(8));
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion2.xMQ(), composer2, 48);
            int iN2 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierXMQ);
            Function0 function0N2 = companion3.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Ew.O((Bitmap) mutableState.getValue(), TimeKt.formatFrameNumber(TimeKt.frameNumberFromTime(projectInfo.getDuration(), projectInfo.getFphs()), projectInfo.getFphs(), "hh:mm:ss"), projectInfo.isXml(), composer2, 0);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(16)), composer2, 6);
            I28.t(rowScopeInstance, str, str2, str3, str4, TimeKt.formatFPS(projectInfo.getFphs()) + "fps", RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 6, 0);
            composer2.eF(-1075532543);
            if (z6) {
                long jRQ = aD.w6.RQ();
                boolean z7 = !z4;
                composer2.eF(-1075525191);
                boolean zP5 = composer2.p5(mutableState2) | composer2.p5(function04);
                Object objIF2 = composer2.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: KA9.s4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UGc.j.O(mutableState2, function04, mutableState3);
                        }
                    };
                    composer2.o(objIF2);
                }
                composer2.Xw();
                UGc.Ik(rowScopeInstance, jRQ, z7, (Function0) objIF2, composer, 54, 0);
                composer2 = composer;
            }
            composer2.Xw();
            float f3 = 4;
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composer2, 6);
            composer2.XQ();
            composer2.eF(337620976);
            if ((!z4 || z5) && nVar2 != okd.n.f71568O) {
                nVar = nVar2;
            } else {
                float fKN = Dp.KN(z6 ? 36 : 12);
                nVar = nVar2;
                BoxKt.n(BackgroundKt.nr(SizeKt.J2(PaddingKt.az(companion, 0.0f, 0.0f, fKN, 0.0f, 11, null), 0.0f, 1, null), aD.w6.T(), null, 2, null), composer2, 0);
            }
            composer2.Xw();
            composer2.eF(337635549);
            if (nVar != null) {
                float f4 = 12;
                Modifier modifierN2 = boxScopeInstance.n(ClipKt.n(PaddingKt.az(companion, Dp.KN(f4), Dp.KN(f4), 0.0f, 0.0f, 12, null), RoundedCornerShapeKt.t(Dp.KN(f3))), companion2.HI());
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
                int iN3 = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk3 = composer2.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composer2, modifierN2);
                Function0 function0N3 = companion3.n();
                if (composer2.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer2.T();
                if (composer2.getInserting()) {
                    composer2.s7N(function0N3);
                } else {
                    composer2.r();
                }
                Composer composerN3 = Updater.n(composer2);
                Updater.O(composerN3, measurePolicyUo2, companion3.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
                Function2 function2Rl3 = companion3.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion3.nr());
                int i5 = C0176j.$EnumSwitchMapping$0[nVar.ordinal()];
                if (i5 == 1) {
                    i3 = 2131231807;
                } else if (i5 == 2) {
                    i3 = 2131231611;
                } else if (i5 == 3) {
                    i3 = 2131231609;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 2131231612;
                }
                Painter painterT = PainterResources_androidKt.t(i3, composer2, 0);
                String lowerCase = nVar.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                ImageKt.n(painterT, StringsKt.replace$default(lowerCase, "_", " ", false, 4, (Object) null), null, null, null, 0.0f, null, composer2, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                composer.XQ();
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final ProjectInfo project, final boolean z2, final boolean z3, String str, Function0 function0, Function0 function02, MutableState mutableState, boolean z4, boolean z5, Function0 function03, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, okd.n nVar, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        String str2;
        int i11;
        Function0 function04;
        int i12;
        Function0 function05;
        int i13;
        final MutableState mutableState2;
        int i14;
        boolean z7;
        int i15;
        boolean z9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String str3;
        Function0 function06;
        Function0 function07;
        Object objIF;
        Composer.Companion companion;
        Composer.Companion companion2;
        int i25;
        Object objO;
        Object objIF2;
        MutableState mutableState3;
        String title;
        Object objIF3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Object objIF4;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        final Function0 function08;
        final okd.n nVar2;
        final boolean z10;
        final Function0 function09;
        final String str4;
        final BitmapLruCache bitmapLruCache2;
        final SceneThumbnailMaker sceneThumbnailMaker2;
        final Function0 function010;
        final boolean z11;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(project, "project");
        Composer composerKN = composer.KN(-627805100);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(project) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            z6 = z2;
            i9 = i7 | 48;
            i8 = 16;
        } else {
            z6 = z2;
            if ((i2 & 48) == 0) {
                i8 = 16;
                i7 |= composerKN.n(z6) ? 32 : 16;
            } else {
                i8 = 16;
            }
            i9 = i7;
        }
        if ((i5 & 4) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerKN.n(z3) ? 256 : 128;
        }
        int i26 = i5 & 8;
        if (i26 != 0) {
            i9 |= 3072;
            i10 = 6;
        } else {
            i10 = 6;
            if ((i2 & 3072) == 0) {
                str2 = str;
                i9 |= composerKN.p5(str2) ? 2048 : 1024;
            }
            i11 = i5 & 16;
            if (i11 != 0) {
                if ((i2 & 24576) == 0) {
                    function04 = function0;
                    i9 |= composerKN.E2(function04) ? 16384 : 8192;
                }
                i12 = i5 & 32;
                if (i12 != 0) {
                    i9 |= 196608;
                    function05 = function02;
                } else {
                    function05 = function02;
                    if ((i2 & 196608) == 0) {
                        i9 |= composerKN.E2(function05) ? 131072 : 65536;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i9 |= 1572864;
                    mutableState2 = mutableState;
                } else {
                    mutableState2 = mutableState;
                    if ((i2 & 1572864) == 0) {
                        i9 |= composerKN.p5(mutableState2) ? 1048576 : 524288;
                    }
                }
                i14 = i5 & 128;
                if (i14 != 0) {
                    i9 |= 12582912;
                    z7 = z4;
                } else {
                    z7 = z4;
                    if ((i2 & 12582912) == 0) {
                        i9 |= composerKN.n(z7) ? 8388608 : 4194304;
                    }
                }
                i15 = i5 & 256;
                if (i15 != 0) {
                    i9 |= 100663296;
                    z9 = z5;
                } else {
                    z9 = z5;
                    if ((i2 & 100663296) == 0) {
                        i9 |= composerKN.n(z9) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                }
                i16 = i5 & 512;
                if (i16 != 0) {
                    i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i17 = i16;
                } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i17 = i16;
                    i9 |= composerKN.E2(function03) ? 536870912 : 268435456;
                } else {
                    i17 = i16;
                }
                i18 = 1024 & i5;
                if (i18 != 0) {
                    i20 = i3 | 6;
                    i19 = i18;
                } else if ((i3 & 6) == 0) {
                    i19 = i18;
                    i20 = i3 | (composerKN.p5(bitmapLruCache) ? 4 : 2);
                } else {
                    i19 = i18;
                    i20 = i3;
                }
                i21 = 2048 & i5;
                if (i21 != 0) {
                    i20 |= 48;
                    i22 = i21;
                } else if ((i3 & 48) == 0) {
                    i22 = i21;
                    i20 |= composerKN.E2(sceneThumbnailMaker) ? 32 : i8;
                } else {
                    i22 = i21;
                }
                int i27 = i20;
                i23 = i5 & 4096;
                if (i23 != 0) {
                    i24 = i27 | RendererCapabilities.DECODER_SUPPORT_MASK;
                } else {
                    int i28 = i27;
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i28 |= composerKN.p5(nVar) ? 256 : 128;
                    }
                    i24 = i28;
                }
                if ((i9 & 306783379) == 306783378 && (i24 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    boolean z12 = z7;
                    z11 = z9;
                    z10 = z12;
                    bitmapLruCache2 = bitmapLruCache;
                    function08 = function04;
                    str4 = str2;
                    function09 = function05;
                    composer2 = composerKN;
                    function010 = function03;
                    sceneThumbnailMaker2 = sceneThumbnailMaker;
                    nVar2 = nVar;
                } else {
                    str3 = i26 == 0 ? null : str2;
                    if (i11 != 0) {
                        composerKN.eF(1905974938);
                        Object objIF5 = composerKN.iF();
                        if (objIF5 == Composer.INSTANCE.n()) {
                            objIF5 = new Function0() { // from class: KA9.qz
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UGc.xMQ();
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        function04 = (Function0) objIF5;
                        composerKN.Xw();
                    }
                    if (i12 == 0) {
                        composerKN.eF(1905976090);
                        Object objIF6 = composerKN.iF();
                        if (objIF6 == Composer.INSTANCE.n()) {
                            objIF6 = new Function0() { // from class: KA9.Pl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UGc.ty();
                                }
                            };
                            composerKN.o(objIF6);
                        }
                        composerKN.Xw();
                        function06 = (Function0) objIF6;
                    } else {
                        function06 = function05;
                    }
                    if (i13 != 0) {
                        mutableState2 = null;
                    }
                    if (i14 != 0) {
                        z7 = true;
                    }
                    if (i15 != 0) {
                        z9 = true;
                    }
                    if (i17 == 0) {
                        composerKN.eF(1905981114);
                        Object objIF7 = composerKN.iF();
                        if (objIF7 == Composer.INSTANCE.n()) {
                            objIF7 = new Function0() { // from class: KA9.Xo
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UGc.HI();
                                }
                            };
                            composerKN.o(objIF7);
                        }
                        function07 = (Function0) objIF7;
                        composerKN.Xw();
                    } else {
                        function07 = function03;
                    }
                    BitmapLruCache bitmapLruCache3 = i19 == 0 ? null : bitmapLruCache;
                    SceneThumbnailMaker sceneThumbnailMaker3 = i22 == 0 ? null : sceneThumbnailMaker;
                    okd.n nVar3 = i23 == 0 ? null : nVar;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-627805100, i9, i24, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemRow (ProjectItemRow.kt:81)");
                    }
                    composerKN.eF(1905986786);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF != companion.n()) {
                        companion2 = companion;
                        i25 = 2;
                        objO = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                        composerKN.o(objO);
                    } else {
                        companion2 = companion;
                        i25 = 2;
                        objO = objIF;
                    }
                    MutableState mutableState4 = (MutableState) objO;
                    composerKN.Xw();
                    composerKN.eF(1905989063);
                    objIF2 = composerKN.iF();
                    int i29 = i9;
                    if (objIF2 == companion2.n()) {
                        objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, i25, null);
                        composerKN.o(objIF2);
                    }
                    mutableState3 = (MutableState) objIF2;
                    composerKN.Xw();
                    composerKN.eF(1905991158);
                    if (!Intrinsics.areEqual(mutableState3.getValue(), project)) {
                        mutableState3.setValue(project);
                        if (sceneThumbnailMaker3 != null && bitmapLruCache3 != null) {
                            six.w6.t((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()), project, mutableState4, bitmapLruCache3, sceneThumbnailMaker3);
                        }
                    }
                    composerKN.Xw();
                    composerKN.eF(1906006390);
                    title = project.getTitle();
                    if (StringsKt.isBlank(title)) {
                        title = StringResources_androidKt.t(2132019381, composerKN, i10);
                    }
                    composerKN.Xw();
                    Pair pairS = S(project);
                    String str5 = (String) pairS.component1();
                    String str6 = (String) pairS.component2();
                    String str7 = title;
                    String strT = com.alightcreative.app.motion.activities.lej.t(project.getFileSize(), false, 1, null);
                    State stateT = AnimateAsStateKt.t(Dp.KN(!z3 ? 40 : 0), new TweenSpec(d.f62986a, 0, null, 6, null), null, null, composerKN, 48, 12);
                    composerKN.eF(1906017344);
                    objIF3 = composerKN.iF();
                    if (objIF3 == companion2.n()) {
                        objIF3 = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.INSTANCE.t()), null, 2, null);
                        composerKN.o(objIF3);
                    }
                    final MutableState mutableState5 = (MutableState) objIF3;
                    composerKN.Xw();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion4.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Function0 function011 = function07;
                    Modifier modifierO = ComposedModifierKt.O(composerKN, companion3);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    MutableState mutableState6 = mutableState2;
                    Function0 function0N = companion5.n();
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
                    boolean z13 = z9;
                    Updater.O(composerN, measurePolicyN, companion5.t());
                    Updater.O(composerN, compositionLocalMapIk, companion5.O());
                    function2Rl = companion5.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion5.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    composerKN.eF(358509130);
                    if (str3 != null) {
                        n.rl(str3, composerKN, (i29 >> 9) & 14);
                    }
                    composerKN.Xw();
                    Modifier modifierXMQ = SizeKt.xMQ(companion3, Dp.KN(96));
                    composerKN.eF(358515423);
                    objIF4 = composerKN.iF();
                    if (objIF4 == companion2.n()) {
                        objIF4 = new Function1() { // from class: KA9.eO
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return UGc.qie(mutableState5, (LayoutCoordinates) obj);
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    composerKN.Xw();
                    Modifier modifierN = OnGloballyPositionedModifierKt.n(modifierXMQ, (Function1) objIF4);
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
                    Function0 function0N2 = companion5.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N2);
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyUo, companion5.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                    function2Rl2 = companion5.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion5.nr());
                    RadioButtonKt.n(z6, function011, BoxScopeInstance.f17448n.n(SizeKt.Z(PaddingKt.az(companion3, Dp.KN(2), 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(20)), companion4.KN()), z3, null, RadioButtonDefaults.f22577n.n(aD.w6.mI(), aD.w6.mI(), aD.w6.mI(), composerKN, (RadioButtonDefaults.rl << 9) | 438, 0), composerKN, ((i29 >> 3) & 14) | ((i29 >> 24) & 112) | ((i29 << 3) & 7168), 16);
                    Modifier modifierT = OffsetKt.t(SizeKt.J2(companion3, 0.0f, 1, null), ck(stateT), 0.0f, 2, null);
                    long jQZ6 = aD.w6.QZ6();
                    float f3 = 0;
                    float fKN = Dp.KN(f3);
                    float f4 = f4892n;
                    String str8 = str3;
                    boolean z14 = z7;
                    Function0 function012 = function04;
                    SceneThumbnailMaker sceneThumbnailMaker4 = sceneThumbnailMaker3;
                    okd.n nVar4 = nVar3;
                    BitmapLruCache bitmapLruCache4 = bitmapLruCache3;
                    Function0 function013 = function06;
                    composer2 = composerKN;
                    CardKt.n(AbstractC1328c.n(modifierT, jQZ6, fKN, f4, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f4), 0L, 0L, null, Dp.KN(f3), ComposableLambdaKt.nr(408624435, true, new j(z13, function011, z3, function012, z2, nVar4, z14, mutableState4, project, str7, str6, str5, strT, mutableState6, function06, mutableState5), composer2, 54), composer2, 1769472, 28);
                    composer2.XQ();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function08 = function012;
                    nVar2 = nVar4;
                    z10 = z14;
                    function09 = function013;
                    str4 = str8;
                    bitmapLruCache2 = bitmapLruCache4;
                    sceneThumbnailMaker2 = sceneThumbnailMaker4;
                    function010 = function011;
                    mutableState2 = mutableState6;
                    z11 = z13;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: KA9.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UGc.az(project, z2, z3, str4, function08, function09, mutableState2, z10, z11, function010, bitmapLruCache2, sceneThumbnailMaker2, nVar2, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i9 |= 24576;
            function04 = function0;
            i12 = i5 & 32;
            if (i12 != 0) {
            }
            i13 = i5 & 64;
            if (i13 != 0) {
            }
            i14 = i5 & 128;
            if (i14 != 0) {
            }
            i15 = i5 & 256;
            if (i15 != 0) {
            }
            i16 = i5 & 512;
            if (i16 != 0) {
            }
            i18 = 1024 & i5;
            if (i18 != 0) {
            }
            i21 = 2048 & i5;
            if (i21 != 0) {
            }
            int i272 = i20;
            i23 = i5 & 4096;
            if (i23 != 0) {
            }
            if ((i9 & 306783379) == 306783378) {
                if (i26 == 0) {
                }
                if (i11 != 0) {
                }
                if (i12 == 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(1905986786);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF != companion.n()) {
                }
                MutableState mutableState42 = (MutableState) objO;
                composerKN.Xw();
                composerKN.eF(1905989063);
                objIF2 = composerKN.iF();
                int i292 = i9;
                if (objIF2 == companion2.n()) {
                }
                mutableState3 = (MutableState) objIF2;
                composerKN.Xw();
                composerKN.eF(1905991158);
                if (!Intrinsics.areEqual(mutableState3.getValue(), project)) {
                }
                composerKN.Xw();
                composerKN.eF(1906006390);
                title = project.getTitle();
                if (StringsKt.isBlank(title)) {
                }
                composerKN.Xw();
                Pair pairS2 = S(project);
                String str52 = (String) pairS2.component1();
                String str62 = (String) pairS2.component2();
                String str72 = title;
                String strT2 = com.alightcreative.app.motion.activities.lej.t(project.getFileSize(), false, 1, null);
                State stateT2 = AnimateAsStateKt.t(Dp.KN(!z3 ? 40 : 0), new TweenSpec(d.f62986a, 0, null, 6, null), null, null, composerKN, 48, 12);
                composerKN.eF(1906017344);
                objIF3 = composerKN.iF();
                if (objIF3 == companion2.n()) {
                }
                final MutableState mutableState52 = (MutableState) objIF3;
                composerKN.Xw();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Arrangement.Vertical verticalUo2 = Arrangement.f17400n.Uo();
                Alignment.Companion companion42 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion42.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Function0 function0112 = function07;
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion32);
                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                MutableState mutableState62 = mutableState2;
                Function0 function0N3 = companion52.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                boolean z132 = z9;
                Updater.O(composerN, measurePolicyN2, companion52.t());
                Updater.O(composerN, compositionLocalMapIk3, companion52.O());
                function2Rl = companion52.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO3, companion52.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    composerKN.eF(358509130);
                    if (str3 != null) {
                    }
                    composerKN.Xw();
                    Modifier modifierXMQ2 = SizeKt.xMQ(companion32, Dp.KN(96));
                    composerKN.eF(358515423);
                    objIF4 = composerKN.iF();
                    if (objIF4 == companion2.n()) {
                    }
                    composerKN.Xw();
                    Modifier modifierN2 = OnGloballyPositionedModifierKt.n(modifierXMQ2, (Function1) objIF4);
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion42.HI(), false);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierN2);
                    Function0 function0N22 = companion52.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyUo2, companion52.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion52.O());
                    function2Rl2 = companion52.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO22, companion52.nr());
                        RadioButtonKt.n(z6, function0112, BoxScopeInstance.f17448n.n(SizeKt.Z(PaddingKt.az(companion32, Dp.KN(2), 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(20)), companion42.KN()), z3, null, RadioButtonDefaults.f22577n.n(aD.w6.mI(), aD.w6.mI(), aD.w6.mI(), composerKN, (RadioButtonDefaults.rl << 9) | 438, 0), composerKN, ((i292 >> 3) & 14) | ((i292 >> 24) & 112) | ((i292 << 3) & 7168), 16);
                        Modifier modifierT2 = OffsetKt.t(SizeKt.J2(companion32, 0.0f, 1, null), ck(stateT2), 0.0f, 2, null);
                        long jQZ62 = aD.w6.QZ6();
                        float f32 = 0;
                        float fKN2 = Dp.KN(f32);
                        float f42 = f4892n;
                        String str82 = str3;
                        boolean z142 = z7;
                        Function0 function0122 = function04;
                        SceneThumbnailMaker sceneThumbnailMaker42 = sceneThumbnailMaker3;
                        okd.n nVar42 = nVar3;
                        BitmapLruCache bitmapLruCache42 = bitmapLruCache3;
                        Function0 function0132 = function06;
                        composer2 = composerKN;
                        CardKt.n(AbstractC1328c.n(modifierT2, jQZ62, fKN2, f42, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f42), 0L, 0L, null, Dp.KN(f32), ComposableLambdaKt.nr(408624435, true, new j(z132, function0112, z3, function0122, z2, nVar42, z142, mutableState42, project, str72, str62, str52, strT2, mutableState62, function06, mutableState52), composer2, 54), composer2, 1769472, 28);
                        composer2.XQ();
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        function08 = function0122;
                        nVar2 = nVar42;
                        z10 = z142;
                        function09 = function0132;
                        str4 = str82;
                        bitmapLruCache2 = bitmapLruCache42;
                        sceneThumbnailMaker2 = sceneThumbnailMaker42;
                        function010 = function0112;
                        mutableState2 = mutableState62;
                        z11 = z132;
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        str2 = str;
        i11 = i5 & 16;
        if (i11 != 0) {
        }
        function04 = function0;
        i12 = i5 & 32;
        if (i12 != 0) {
        }
        i13 = i5 & 64;
        if (i13 != 0) {
        }
        i14 = i5 & 128;
        if (i14 != 0) {
        }
        i15 = i5 & 256;
        if (i15 != 0) {
        }
        i16 = i5 & 512;
        if (i16 != 0) {
        }
        i18 = 1024 & i5;
        if (i18 != 0) {
        }
        i21 = 2048 & i5;
        if (i21 != 0) {
        }
        int i2722 = i20;
        i23 = i5 & 4096;
        if (i23 != 0) {
        }
        if ((i9 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Ik(final RowScope RightActionButton, final long j2, boolean z2, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        long j3;
        final boolean z3;
        int i7;
        Function0 function02;
        Function0 function03;
        final Function0 function04;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(RightActionButton, "$this$RightActionButton");
        Composer composerKN = composer.KN(1209618847);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(RightActionButton) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.nr(j3) ? 32 : 16;
            }
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    function02 = function0;
                    i5 |= composerKN.E2(function02) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function04 = function02;
                } else {
                    boolean z4 = i8 == 0 ? true : z3;
                    if (i7 == 0) {
                        composerKN.eF(726887100);
                        Object objIF = composerKN.iF();
                        if (objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: KA9.QJ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UGc.r();
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        function03 = (Function0) objIF;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1209618847, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.RightActionButton (ProjectItemRow.kt:236)");
                    }
                    boolean z5 = z4;
                    IconKt.n(PainterResources_androidKt.t(2131231829, composerKN, 6), null, ClickableKt.J2(SizeKt.Z(RightActionButton.t(Modifier.INSTANCE, Alignment.INSTANCE.xMQ()), Dp.KN(24)), z4, null, null, function03, 6, null), j3, composerKN, ((i5 << 6) & 7168) | 48, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    z3 = z5;
                    function04 = function03;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: KA9.l3D
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UGc.o(RightActionButton, j2, z3, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            function02 = function0;
            if ((i5 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                boolean z52 = z4;
                IconKt.n(PainterResources_androidKt.t(2131231829, composerKN, 6), null, ClickableKt.J2(SizeKt.Z(RightActionButton.t(Modifier.INSTANCE, Alignment.INSTANCE.xMQ()), Dp.KN(24)), z4, null, null, function03, 6, null), j3, composerKN, ((i5 << 6) & 7168) | 48, 0);
                if (ComposerKt.v()) {
                }
                z3 = z52;
                function04 = function03;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        z3 = z2;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(ProjectInfo projectInfo, boolean z2, boolean z3, String str, Function0 function0, Function0 function02, MutableState mutableState, boolean z4, boolean z5, Function0 function03, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, okd.n nVar, int i2, int i3, int i5, Composer composer, int i7) {
        KN(projectInfo, z2, z3, str, function0, function02, mutableState, z4, z5, function03, bitmapLruCache, sceneThumbnailMaker, nVar, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(RowScope rowScope, long j2, boolean z2, Function0 function0, int i2, int i3, Composer composer, int i5) {
        Ik(rowScope, j2, z2, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gh(mutableState, LayoutCoordinatesKt.J2(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ() {
        return Unit.INSTANCE;
    }

    private static final Pair S(ProjectInfo projectInfo) {
        String str;
        String str2;
        int width = projectInfo.getWidth();
        if (width == (projectInfo.getHeight() * 16) / 9) {
            str = projectInfo.getHeight() + TtmlNode.TAG_P;
            str2 = "16:9";
        } else if (width == (projectInfo.getHeight() * 9) / 16) {
            str = projectInfo.getWidth() + TtmlNode.TAG_P;
            str2 = "9:16";
        } else if (width == (projectInfo.getHeight() * 4) / 3) {
            str = projectInfo.getHeight() + TtmlNode.TAG_P;
            str2 = "4:3";
        } else if (width == projectInfo.getHeight()) {
            str = projectInfo.getWidth() + TtmlNode.TAG_P;
            str2 = "1:1";
        } else {
            str = projectInfo.getWidth() + "x" + projectInfo.getHeight();
            str2 = "";
        }
        return TuplesKt.to(str, str2);
    }

    private static final float ck(State state) {
        return ((Dp) state.getValue()).getValue();
    }

    private static final void gh(MutableState mutableState, long j2) {
        mutableState.setValue(Offset.nr(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long mUb(MutableState mutableState) {
        return ((Offset) mutableState.getValue()).getPackedValue();
    }
}
