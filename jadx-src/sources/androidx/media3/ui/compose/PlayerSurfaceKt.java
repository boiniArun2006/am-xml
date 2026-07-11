package androidx.media3.ui.compose;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001ao\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\n0\r2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0012\"\u0010\u0010\u0013\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0014\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\u0016\u0010\u0016\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, d2 = {"PlayerSurface", "", "player", "Landroidx/media3/common/Player;", "modifier", "Landroidx/compose/ui/Modifier;", "surfaceType", "", "(Landroidx/media3/common/Player;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "PlayerSurfaceInternal", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/view/View;", "createView", "Lkotlin/Function1;", "Landroid/content/Context;", "setViewOnPlayer", "Lkotlin/Function2;", "clearViewFromPlayer", "(Landroidx/media3/common/Player;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SURFACE_TYPE_SURFACE_VIEW", "SURFACE_TYPE_TEXTURE_VIEW", "lib-ui-compose_release", "view", "registeredPlayer"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlayerSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerSurface.kt\nandroidx/media3/ui/compose/PlayerSurfaceKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1225#2,6:117\n1225#2,6:123\n1225#2,6:129\n1225#2,6:135\n1225#2,6:141\n1225#2,6:147\n1225#2,6:153\n1225#2,6:159\n1225#2,6:165\n1225#2,6:171\n81#3:177\n107#3,2:178\n81#3:180\n107#3,2:181\n1#4:183\n*S KotlinDebug\n*F\n+ 1 PlayerSurface.kt\nandroidx/media3/ui/compose/PlayerSurfaceKt\n*L\n60#1:117,6\n61#1:123,6\n62#1:129,6\n68#1:135,6\n69#1:141,6\n70#1:147,6\n84#1:153,6\n85#1:159,6\n86#1:165,6\n88#1:171,6\n84#1:177\n84#1:178,2\n85#1:180\n85#1:181,2\n*E\n"})
public final class PlayerSurfaceKt {

    @UnstableApi
    public static final int SURFACE_TYPE_SURFACE_VIEW = 1;

    @UnstableApi
    public static final int SURFACE_TYPE_TEXTURE_VIEW = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurface$lambda$12(Player player, Modifier modifier, int i2, int i3, int i5, Composer composer, int i7) {
        PlayerSurface(player, modifier, i2, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurfaceInternal$lambda$26(Player player, Modifier modifier, Function1 function1, Function2 function2, Function2 function22, int i2, Composer composer, int i3) {
        PlayerSurfaceInternal(player, modifier, function1, function2, function22, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    @Composable
    @UnstableApi
    public static final void PlayerSurface(final Player player, Modifier modifier, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(player, "player");
        Composer composerKN = composer.KN(12998269);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(player) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(modifier) ? 32 : 16;
        }
        int i9 = i5 & 4;
        if (i9 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.t(i2) ? 256 : 128;
        }
        if ((i7 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
        } else {
            if (i8 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i9 != 0) {
                i2 = 1;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(12998269, i7, -1, "androidx.media3.ui.compose.PlayerSurface (PlayerSurface.kt:53)");
            }
            if (i2 == 1) {
                composerKN.eF(-316865792);
                composerKN.eF(-316863549);
                Object objIF = composerKN.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = new Function1() { // from class: androidx.media3.ui.compose.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PlayerSurfaceKt.PlayerSurface$lambda$1$lambda$0((Context) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                Function1 function1 = (Function1) objIF;
                composerKN.Xw();
                composerKN.eF(-316862012);
                Object objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = new Function2() { // from class: androidx.media3.ui.compose.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PlayerSurfaceKt.PlayerSurface$lambda$3$lambda$2((Player) obj, (SurfaceView) obj2);
                        }
                    };
                    composerKN.o(objIF2);
                }
                Function2 function2 = (Function2) objIF2;
                composerKN.Xw();
                composerKN.eF(-316859322);
                Object objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                    objIF3 = new Function2() { // from class: androidx.media3.ui.compose.w6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PlayerSurfaceKt.PlayerSurface$lambda$5$lambda$4((Player) obj, (SurfaceView) obj2);
                        }
                    };
                    composerKN.o(objIF3);
                }
                composerKN.Xw();
                PlayerSurfaceInternal(player, modifier3, function1, function2, (Function2) objIF3, composerKN, (i7 & 14) | 28032 | (i7 & 112));
                composerKN.Xw();
            } else {
                if (i2 != 2) {
                    composerKN.eF(-316846887);
                    composerKN.Xw();
                    throw new IllegalArgumentException("Unrecognized surface type: " + i2);
                }
                composerKN.eF(-316855808);
                composerKN.eF(-316853565);
                Object objIF4 = composerKN.iF();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objIF4 == companion2.n()) {
                    objIF4 = new Function1() { // from class: androidx.media3.ui.compose.Ml
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PlayerSurfaceKt.PlayerSurface$lambda$7$lambda$6((Context) obj);
                        }
                    };
                    composerKN.o(objIF4);
                }
                Function1 function12 = (Function1) objIF4;
                composerKN.Xw();
                composerKN.eF(-316852028);
                Object objIF5 = composerKN.iF();
                if (objIF5 == companion2.n()) {
                    objIF5 = new Function2() { // from class: androidx.media3.ui.compose.I28
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PlayerSurfaceKt.PlayerSurface$lambda$9$lambda$8((Player) obj, (TextureView) obj2);
                        }
                    };
                    composerKN.o(objIF5);
                }
                Function2 function22 = (Function2) objIF5;
                composerKN.Xw();
                composerKN.eF(-316849338);
                Object objIF6 = composerKN.iF();
                if (objIF6 == companion2.n()) {
                    objIF6 = new Function2() { // from class: androidx.media3.ui.compose.Wre
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PlayerSurfaceKt.PlayerSurface$lambda$11$lambda$10((Player) obj, (TextureView) obj2);
                        }
                    };
                    composerKN.o(objIF6);
                }
                composerKN.Xw();
                PlayerSurfaceInternal(player, modifier3, function12, function22, (Function2) objIF6, composerKN, (i7 & 14) | 28032 | (i7 & 112));
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
        }
        final int i10 = i2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: androidx.media3.ui.compose.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlayerSurfaceKt.PlayerSurface$lambda$12(player, modifier2, i10, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurfaceView PlayerSurface$lambda$1$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SurfaceView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurface$lambda$11$lambda$10(Player player, TextureView view) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(view, "view");
        player.clearVideoTextureView(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurface$lambda$3$lambda$2(Player player, SurfaceView view) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(view, "view");
        player.setVideoSurfaceView(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurface$lambda$5$lambda$4(Player player, SurfaceView view) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(view, "view");
        player.clearVideoSurfaceView(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureView PlayerSurface$lambda$7$lambda$6(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextureView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurface$lambda$9$lambda$8(Player player, TextureView view) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(view, "view");
        player.setVideoTextureView(view);
        return Unit.INSTANCE;
    }

    @ComposableTarget
    @Composable
    private static final <T extends View> void PlayerSurfaceInternal(final Player player, final Modifier modifier, final Function1<? super Context, ? extends T> function1, final Function2<? super Player, ? super T, Unit> function2, final Function2<? super Player, ? super T, Unit> function22, Composer composer, final int i2) {
        int i3;
        Function2<? super Player, ? super T, Unit> function23;
        View view;
        int i5;
        Composer composerKN = composer.KN(921581664);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(player) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function23 = function2;
            i3 |= composerKN.E2(function23) ? 2048 : 1024;
        } else {
            function23 = function2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function22) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(921581664, i3, -1, "androidx.media3.ui.compose.PlayerSurfaceInternal (PlayerSurface.kt:82)");
            }
            composerKN.eF(-1838683342);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-1838681289);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                composerKN.o(objIF2);
            }
            MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            composerKN.eF(-1838679147);
            boolean z2 = (i3 & 896) == 256;
            Object objIF3 = composerKN.iF();
            if (z2 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: androidx.media3.ui.compose.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlayerSurfaceKt.PlayerSurfaceInternal$lambda$21$lambda$20(function1, mutableState, (Context) obj);
                    }
                };
                composerKN.o(objIF3);
            }
            Function1 function12 = (Function1) objIF3;
            composerKN.Xw();
            composerKN.eF(-1838677521);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new Function1() { // from class: androidx.media3.ui.compose.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlayerSurfaceKt.PlayerSurfaceInternal$lambda$23$lambda$22((View) obj);
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            AndroidView_androidKt.rl(function12, modifier, (Function1) objIF4, null, null, composerKN, (i3 & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 24);
            View viewPlayerSurfaceInternal$lambda$14 = PlayerSurfaceInternal$lambda$14(mutableState);
            if (viewPlayerSurfaceInternal$lambda$14 != null) {
                composerKN.eF(-898423831);
                boolean zE2 = ((57344 & i3) == 16384) | composerKN.E2(viewPlayerSurfaceInternal$lambda$14) | composerKN.E2(player) | ((i3 & 7168) == 2048);
                Object objIF5 = composerKN.iF();
                if (zE2 || objIF5 == companion.n()) {
                    view = viewPlayerSurfaceInternal$lambda$14;
                    i5 = i3;
                    PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1 playerSurfaceKt$PlayerSurfaceInternal$3$1$1 = new PlayerSurfaceKt$PlayerSurfaceInternal$3$1$1(player, function23, view, mutableState2, function22, null);
                    composerKN.o(playerSurfaceKt$PlayerSurfaceInternal$3$1$1);
                    objIF5 = playerSurfaceKt$PlayerSurfaceInternal$3$1$1;
                } else {
                    view = viewPlayerSurfaceInternal$lambda$14;
                    i5 = i3;
                }
                composerKN.Xw();
                EffectsKt.nr(view, player, (Function2) objIF5, composerKN, (i5 << 3) & 112);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: androidx.media3.ui.compose.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlayerSurfaceKt.PlayerSurfaceInternal$lambda$26(player, modifier, function1, function2, function22, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View PlayerSurfaceInternal$lambda$21$lambda$20(Function1 function1, MutableState mutableState, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View view = (View) function1.invoke(it);
        mutableState.setValue(view);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlayerSurfaceInternal$lambda$23$lambda$22(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final <T extends View> T PlayerSurfaceInternal$lambda$14(MutableState<T> mutableState) {
        return (T) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Player PlayerSurfaceInternal$lambda$17(MutableState<Player> mutableState) {
        return (Player) mutableState.getValue();
    }
}
