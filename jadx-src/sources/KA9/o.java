package KA9;

import Dj7.YzO;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {

    public static final class I28 extends Lambda implements Function4 {
        final /* synthetic */ Function1 E2;
        final /* synthetic */ six.I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f4976O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ MutableState f4977S;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f4978X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f4979Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f4980e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f4981g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f4982n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f4983o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Map f4984r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f4985t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(List list, List list2, List list3, six.I28 i28, Map map, boolean z2, Function1 function1, MutableState mutableState, boolean z3, Function1 function12, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            super(4);
            this.f4982n = list;
            this.f4985t = list2;
            this.f4976O = list3;
            this.J2 = i28;
            this.f4984r = map;
            this.f4983o = z2;
            this.f4979Z = function1;
            this.f4977S = mutableState;
            this.f4981g = z3;
            this.E2 = function12;
            this.f4980e = bitmapLruCache;
            this.f4978X = sceneThumbnailMaker;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = i3 | (composer.p5(lazyItemScope) ? 4 : 2);
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ProjectInfo projectInfo = (ProjectInfo) this.f4982n.get(i2);
            composer.eF(414522116);
            boolean zContains = CollectionsKt.contains(this.f4985t, projectInfo);
            String str = (String) this.f4976O.get(i2);
            boolean zRl = this.J2.rl();
            okd.n nVar = (okd.n) this.f4984r.get(projectInfo.getId());
            boolean z2 = this.f4983o;
            composer.eF(2091588953);
            boolean zP5 = composer.p5(this.f4979Z) | composer.p5(projectInfo);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this.f4979Z, projectInfo);
                composer.o(objIF);
            }
            Function0 function0 = (Function0) objIF;
            composer.Xw();
            composer.eF(2091591105);
            boolean zP52 = composer.p5(this.J2) | ((((i5 & 112) ^ 48) > 32 && composer.t(i2)) || (i5 & 48) == 32);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(this.J2, i2);
                composer.o(objIF2);
            }
            Function0 function02 = (Function0) objIF2;
            composer.Xw();
            MutableState mutableState = this.f4977S;
            boolean z3 = this.f4981g;
            composer.eF(2091599489);
            boolean zP53 = composer.p5(projectInfo) | composer.p5(this.E2);
            Object objIF3 = composer.iF();
            if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(projectInfo, this.E2);
                composer.o(objIF3);
            }
            composer.Xw();
            UGc.KN(projectInfo, zContains, z2, str, function0, function02, mutableState, z3, zRl, (Function0) objIF3, this.f4980e, this.f4978X, nVar, composer, 0, 0, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class Ml extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f4986n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(List list) {
            super(1);
            this.f4986n = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            this.f4986n.get(i2);
            return null;
        }
    }

    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f4987n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ProjectInfo f4988t;

        j(Function1 function1, ProjectInfo projectInfo) {
            this.f4987n = function1;
            this.f4988t = projectInfo;
        }

        public final void n() {
            this.f4987n.invoke(this.f4988t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ six.I28 f4989n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f4990t;

        n(six.I28 i28, int i2) {
            this.f4989n = i28;
            this.f4990t = i2;
        }

        public final void n() {
            this.f4989n.Uo(Integer.valueOf(this.f4990t));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ProjectInfo f4991n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f4992t;

        w6(ProjectInfo projectInfo, Function1 function1) {
            this.f4991n = projectInfo;
            this.f4992t = function1;
        }

        public final void n() {
            ProjectInfo projectInfo = this.f4991n;
            ProjectInfo.n nVar = projectInfo instanceof ProjectInfo.n ? (ProjectInfo.n) projectInfo : null;
            if (nVar != null) {
                this.f4992t.invoke(nVar);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final six.I28 listTabState, final List projectList, final boolean z2, final List selectedProjects, final u selectedSortOption, final LazyListState lazyListState, Function1 function1, Function1 function12, MutableState mutableState, boolean z3, Function1 function13, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Map map, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        Function1 function14;
        int i9;
        Function1 function15;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        BitmapLruCache bitmapLruCache2;
        final Map mapEmptyMap;
        Function1 function19;
        Object objIF;
        State state;
        final ArrayList arrayList;
        Iterator it;
        Modifier.Companion companion;
        final MutableState mutableState2;
        int iN;
        final Function1 function110;
        Composer composerN;
        final boolean z4;
        Function2 function2Rl;
        final SceneThumbnailMaker sceneThumbnailMaker2;
        boolean zE2;
        Object objIF2;
        int i22;
        Modifier.Companion companion2;
        Composer composer2;
        Map map2;
        Function1 function111;
        Function1 function112;
        BitmapLruCache bitmapLruCache3;
        SceneThumbnailMaker sceneThumbnailMaker3;
        Function1 function113;
        final Function1 function114;
        Composer composer3;
        final Function1 function115;
        final Function1 function116;
        final BitmapLruCache bitmapLruCache4;
        final MutableState mutableState3;
        final boolean z5;
        final SceneThumbnailMaker sceneThumbnailMaker4;
        final Map map3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(listTabState, "listTabState");
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Composer composerKN = composer.KN(1910868596);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(listTabState) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(projectList) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.n(z2) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i7 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i7 |= composerKN.E2(selectedProjects) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i7 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i7 |= composerKN.p5(selectedSortOption) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i7 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i7 |= composerKN.p5(lazyListState) ? 131072 : 65536;
            }
            i8 = i5 & 64;
            if (i8 == 0) {
                i7 |= 1572864;
                function14 = function1;
            } else {
                function14 = function1;
                if ((i2 & 1572864) == 0) {
                    i7 |= composerKN.E2(function14) ? 1048576 : 524288;
                }
            }
            i9 = i5 & 128;
            if (i9 == 0) {
                i7 |= 12582912;
                function15 = function12;
            } else {
                function15 = function12;
                if ((i2 & 12582912) == 0) {
                    i7 |= composerKN.E2(function15) ? 8388608 : 4194304;
                }
            }
            i10 = i5 & 256;
            if (i10 == 0) {
                i7 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i7 |= composerKN.p5(mutableState) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            i11 = i5 & 512;
            if (i11 != 0) {
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i12 = i11;
                    i7 |= composerKN.n(z3) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i15 = i3 | 6;
                    i14 = i13;
                } else if ((i3 & 6) == 0) {
                    i14 = i13;
                    i15 = i3 | (composerKN.E2(function13) ? 4 : 2);
                } else {
                    i14 = i13;
                    i15 = i3;
                }
                i16 = i5 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                    i17 = i16;
                } else if ((i3 & 48) == 0) {
                    i17 = i16;
                    i15 |= composerKN.p5(bitmapLruCache) ? 32 : 16;
                } else {
                    i17 = i16;
                }
                int i23 = i15;
                i18 = i5 & 4096;
                if (i18 != 0) {
                    i19 = i23 | RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i19 = i23 | (composerKN.E2(sceneThumbnailMaker) ? 256 : 128);
                } else {
                    i19 = i23;
                }
                i20 = i5 & 8192;
                if (i20 != 0) {
                    i21 = i19 | 3072;
                } else {
                    int i24 = i19;
                    if ((i3 & 3072) == 0) {
                        i21 = i24 | (composerKN.E2(map) ? 2048 : 1024);
                    } else {
                        i21 = i24;
                    }
                }
                if ((i7 & 306783379) == 306783378 && (i21 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    z5 = z3;
                    bitmapLruCache4 = bitmapLruCache;
                    sceneThumbnailMaker4 = sceneThumbnailMaker;
                    map3 = map;
                    composer3 = composerKN;
                    function114 = function14;
                    function115 = function15;
                    mutableState3 = mutableState;
                    function116 = function13;
                } else {
                    if (i8 == 0) {
                        composerKN.eF(-1225051774);
                        Object objIF3 = composerKN.iF();
                        if (objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function1() { // from class: KA9.Wre
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return o.KN((u) obj);
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        composerKN.Xw();
                        function16 = (Function1) objIF3;
                    } else {
                        function16 = function14;
                    }
                    if (i9 == 0) {
                        composerKN.eF(-1225050174);
                        Object objIF4 = composerKN.iF();
                        if (objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new Function1() { // from class: KA9.CN3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return o.gh((ProjectInfo) obj);
                                }
                            };
                            composerKN.o(objIF4);
                        }
                        function17 = (Function1) objIF4;
                        composerKN.Xw();
                    } else {
                        function17 = function15;
                    }
                    MutableState mutableState4 = i10 == 0 ? null : mutableState;
                    boolean z6 = i12 == 0 ? true : z3;
                    if (i14 == 0) {
                        composerKN.eF(-1225045534);
                        Object objIF5 = composerKN.iF();
                        if (objIF5 == Composer.INSTANCE.n()) {
                            objIF5 = new Function1() { // from class: KA9.fuX
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return o.qie((ProjectInfo.n) obj);
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        function18 = (Function1) objIF5;
                        composerKN.Xw();
                    } else {
                        function18 = function13;
                    }
                    bitmapLruCache2 = i17 == 0 ? null : bitmapLruCache;
                    SceneThumbnailMaker sceneThumbnailMaker5 = i18 == 0 ? null : sceneThumbnailMaker;
                    mapEmptyMap = i20 == 0 ? MapsKt.emptyMap() : map;
                    if (ComposerKt.v()) {
                        function19 = function17;
                    } else {
                        function19 = function17;
                        ComposerKt.p5(1910868596, i7, i21, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemList (ProjectItemList.kt:43)");
                    }
                    composerKN.eF(-1225039066);
                    objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = SnapshotStateKt.O(new Function0() { // from class: KA9.Dsr
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(o.az(lazyListState));
                            }
                        });
                        composerKN.o(objIF);
                    }
                    state = (State) objIF;
                    composerKN.Xw();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(projectList, 10));
                    it = projectList.iterator();
                    int i25 = i21;
                    int i26 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String strN = six.aC.n(((ProjectInfo) next).getLastModified());
                        Iterator it2 = it;
                        if (selectedSortOption != u.f5008t || (i26 != 0 && Intrinsics.areEqual(strN, six.aC.n(((ProjectInfo) projectList.get(i26 - 1)).getLastModified())))) {
                            strN = null;
                        }
                        arrayList.add(strN);
                        it = it2;
                        i26 = i27;
                    }
                    companion = Modifier.INSTANCE;
                    mutableState2 = mutableState4;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    function110 = function18;
                    Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
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
                    z4 = z6;
                    Updater.O(composerN, measurePolicyUo, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    function2Rl = companion3.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    float f3 = 16;
                    Modifier modifierJ2 = SizeKt.J2(PaddingKt.gh(companion, Dp.KN(f3), 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
                    boolean zRl = listTabState.rl();
                    PaddingValues paddingValuesO = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
                    composerKN.eF(1452206278);
                    sceneThumbnailMaker2 = sceneThumbnailMaker5;
                    zE2 = composerKN.E2(projectList) | composerKN.E2(selectedProjects) | composerKN.E2(arrayList) | ((i7 & 14) != 4) | composerKN.E2(mapEmptyMap) | ((i7 & 896) != 256) | ((29360128 & i7) != 8388608) | ((234881024 & i7) != 67108864) | ((1879048192 & i7) != 536870912) | ((i25 & 14) != 4) | ((i25 & 112) != 32) | composerKN.E2(sceneThumbnailMaker2);
                    objIF2 = composerKN.iF();
                    if (!zE2 || objIF2 == Composer.INSTANCE.n()) {
                        final Function1 function117 = function19;
                        i22 = i7;
                        companion2 = companion;
                        composer2 = composerKN;
                        final BitmapLruCache bitmapLruCache5 = bitmapLruCache2;
                        Function1 function118 = new Function1() { // from class: KA9.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return o.xMQ(projectList, selectedProjects, arrayList, listTabState, mapEmptyMap, z2, function117, mutableState2, z4, function110, bitmapLruCache5, sceneThumbnailMaker2, (LazyListScope) obj);
                            }
                        };
                        map2 = mapEmptyMap;
                        function111 = function117;
                        function112 = function110;
                        bitmapLruCache3 = bitmapLruCache5;
                        sceneThumbnailMaker3 = sceneThumbnailMaker2;
                        composer2.o(function118);
                        objIF2 = function118;
                    } else {
                        function112 = function110;
                        companion2 = companion;
                        map2 = mapEmptyMap;
                        composer2 = composerKN;
                        sceneThumbnailMaker3 = sceneThumbnailMaker2;
                        bitmapLruCache3 = bitmapLruCache2;
                        function111 = function19;
                        i22 = i7;
                    }
                    composer2.Xw();
                    int i28 = i22 >> 12;
                    Composer composer4 = composer2;
                    LazyDslKt.rl(modifierJ2, lazyListState, paddingValuesO, false, horizontalOrVerticalTy, null, null, zRl, null, (Function1) objIF2, composer4, (i28 & 112) | 24966, 360);
                    composer4.eF(1452236719);
                    if (((Boolean) state.getValue()).booleanValue()) {
                        YzO.rl(aD.w6.tFV(), SizeKt.xMQ(companion2, Dp.KN(25)), null, composer4, 54, 4);
                    }
                    composer4.Xw();
                    composer4.eF(1452242650);
                    if (listTabState.nr()) {
                        function113 = function16;
                    } else {
                        Function1 function119 = function16;
                        iF.rl(boxScopeInstance, selectedSortOption, function119, 0.0f, composer4, ((i22 >> 9) & 112) | 6 | (i28 & 896), 4);
                        function113 = function119;
                    }
                    composer4.Xw();
                    composer4.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function114 = function113;
                    composer3 = composer4;
                    function115 = function111;
                    function116 = function112;
                    bitmapLruCache4 = bitmapLruCache3;
                    mutableState3 = mutableState2;
                    z5 = z4;
                    sceneThumbnailMaker4 = sceneThumbnailMaker3;
                    map3 = map2;
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: KA9.C
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return o.mUb(listTabState, projectList, z2, selectedProjects, selectedSortOption, lazyListState, function114, function115, mutableState3, z5, function116, bitmapLruCache4, sceneThumbnailMaker4, map3, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
            }
            int i232 = i15;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i20 = i5 & 8192;
            if (i20 != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i20 == 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(-1225039066);
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                }
                state = (State) objIF;
                composerKN.Xw();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(projectList, 10));
                it = projectList.iterator();
                int i252 = i21;
                int i262 = 0;
                while (it.hasNext()) {
                }
                companion = Modifier.INSTANCE;
                mutableState2 = mutableState4;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                function110 = function18;
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion32.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                z4 = z6;
                Updater.O(composerN, measurePolicyUo2, companion32.t());
                Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                function2Rl = companion32.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion32.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    float f32 = 16;
                    Modifier modifierJ22 = SizeKt.J2(PaddingKt.gh(companion, Dp.KN(f32), 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(Dp.KN(12));
                    boolean zRl2 = listTabState.rl();
                    PaddingValues paddingValuesO2 = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f32), 7, null);
                    composerKN.eF(1452206278);
                    sceneThumbnailMaker2 = sceneThumbnailMaker5;
                    zE2 = composerKN.E2(projectList) | composerKN.E2(selectedProjects) | composerKN.E2(arrayList) | ((i7 & 14) != 4) | composerKN.E2(mapEmptyMap) | ((i7 & 896) != 256) | ((29360128 & i7) != 8388608) | ((234881024 & i7) != 67108864) | ((1879048192 & i7) != 536870912) | ((i252 & 14) != 4) | ((i252 & 112) != 32) | composerKN.E2(sceneThumbnailMaker2);
                    objIF2 = composerKN.iF();
                    if (zE2) {
                        final Function1 function1172 = function19;
                        i22 = i7;
                        companion2 = companion;
                        composer2 = composerKN;
                        final BitmapLruCache bitmapLruCache52 = bitmapLruCache2;
                        Function1 function1182 = new Function1() { // from class: KA9.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return o.xMQ(projectList, selectedProjects, arrayList, listTabState, mapEmptyMap, z2, function1172, mutableState2, z4, function110, bitmapLruCache52, sceneThumbnailMaker2, (LazyListScope) obj);
                            }
                        };
                        map2 = mapEmptyMap;
                        function111 = function1172;
                        function112 = function110;
                        bitmapLruCache3 = bitmapLruCache52;
                        sceneThumbnailMaker3 = sceneThumbnailMaker2;
                        composer2.o(function1182);
                        objIF2 = function1182;
                        composer2.Xw();
                        int i282 = i22 >> 12;
                        Composer composer42 = composer2;
                        LazyDslKt.rl(modifierJ22, lazyListState, paddingValuesO2, false, horizontalOrVerticalTy2, null, null, zRl2, null, (Function1) objIF2, composer42, (i282 & 112) | 24966, 360);
                        composer42.eF(1452236719);
                        if (((Boolean) state.getValue()).booleanValue()) {
                        }
                        composer42.Xw();
                        composer42.eF(1452242650);
                        if (listTabState.nr()) {
                        }
                        composer42.Xw();
                        composer42.XQ();
                        if (ComposerKt.v()) {
                        }
                        function114 = function113;
                        composer3 = composer42;
                        function115 = function111;
                        function116 = function112;
                        bitmapLruCache4 = bitmapLruCache3;
                        mutableState3 = mutableState2;
                        z5 = z4;
                        sceneThumbnailMaker4 = sceneThumbnailMaker3;
                        map3 = map2;
                    }
                }
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        i8 = i5 & 64;
        if (i8 == 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i5 & 256;
        if (i10 == 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
        }
        int i2322 = i15;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i20 = i5 & 8192;
        if (i20 != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(u it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(ProjectInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(six.I28 i28, List list, boolean z2, List list2, u uVar, LazyListState lazyListState, Function1 function1, Function1 function12, MutableState mutableState, boolean z3, Function1 function13, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Map map, int i2, int i3, int i5, Composer composer, int i7) {
        Uo(i28, list, z2, list2, uVar, lazyListState, function1, function12, mutableState, z3, function13, bitmapLruCache, sceneThumbnailMaker, map, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(List list, List list2, List list3, six.I28 i28, Map map, boolean z2, Function1 function1, MutableState mutableState, boolean z3, Function1 function12, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.qie(list.size(), null, new Ml(list), ComposableLambdaKt.rl(-1091073711, true, new I28(list, list2, list3, i28, map, z2, function1, mutableState, z3, function12, bitmapLruCache, sceneThumbnailMaker)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean az(LazyListState lazyListState) {
        if (lazyListState.o() == 0 && lazyListState.Z() <= 0) {
            return false;
        }
        return true;
    }
}
