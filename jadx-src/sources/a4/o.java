package a4;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.ui.PlayerView;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class o {

    public static final class j implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f12683n;
        final /* synthetic */ LifecycleEventObserver rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f12684t;

        public j(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver, ExoPlayer exoPlayer) {
            this.f12683n = lifecycleOwner;
            this.rl = lifecycleEventObserver;
            this.f12684t = exoPlayer;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f12683n.getLifecycleRegistry().nr(this.rl);
            this.f12684t.release();
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView J2(Context context, int i2, ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context, null, 0);
        playerView.setUseController(false);
        playerView.setResizeMode(i2);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(ExoPlayer exoPlayer, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = n.$EnumSwitchMapping$0[event.ordinal()];
        if (i2 == 1) {
            exoPlayer.pause();
            exoPlayer.seekTo(0L);
        } else {
            if (i2 != 2) {
                return;
            }
            exoPlayer.play();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Uri uri, final boolean z2, Modifier modifier, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        final Context context;
        final LifecycleOwner lifecycleOwner;
        Object objIF;
        Composer.Companion companion;
        final ExoPlayer exoPlayer;
        int i10;
        boolean zE2;
        Object objIF2;
        final int i11;
        boolean zE22;
        Object objIF3;
        final int i12;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Composer composerKN = composer.KN(-133866564);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(uri) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.n(z2) ? 32 : 16;
        }
        int i13 = i5 & 4;
        if (i13 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    i9 = i2;
                    i7 |= composerKN.t(i9) ? 2048 : 1024;
                }
                if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    i12 = i9;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    int i14 = i8 == 0 ? 0 : i9;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-133866564, i7, -1, "com.alightcreative.onboarding.ui.components.VideoPlayer (VideoPlayer.kt:32)");
                    }
                    context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                    lifecycleOwner = (LifecycleOwner) composerKN.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerKN.eF(3439261);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    Object obj = objIF;
                    if (objIF == companion.n()) {
                        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                        exoPlayerBuild.setRepeatMode(2);
                        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(context, new DefaultDataSource.Factory(context))).createMediaSource(MediaItem.fromUri(uri));
                        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
                        exoPlayerBuild.setMediaSource(progressiveMediaSourceCreateMediaSource);
                        exoPlayerBuild.prepare();
                        composerKN.o(exoPlayerBuild);
                        obj = exoPlayerBuild;
                    }
                    exoPlayer = (ExoPlayer) obj;
                    composerKN.Xw();
                    Intrinsics.checkNotNull(exoPlayer);
                    if (z2) {
                        exoPlayer.pause();
                        i10 = i14;
                        exoPlayer.seekTo(0L);
                    } else {
                        exoPlayer.play();
                        i10 = i14;
                    }
                    composerKN.eF(3465157);
                    zE2 = composerKN.E2(context) | ((i7 & 7168) != 2048) | composerKN.E2(exoPlayer);
                    objIF2 = composerKN.iF();
                    if (!zE2 || objIF2 == companion.n()) {
                        i11 = i10;
                        objIF2 = new Function1() { // from class: a4.fuX
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return o.J2(context, i11, exoPlayer, (Context) obj2);
                            }
                        };
                        composerKN.o(objIF2);
                    } else {
                        i11 = i10;
                    }
                    composerKN.Xw();
                    AndroidView_androidKt.n((Function1) objIF2, modifier2, null, composerKN, (i7 >> 3) & 112, 4);
                    composerKN.eF(3478970);
                    zE22 = composerKN.E2(exoPlayer) | composerKN.E2(lifecycleOwner);
                    objIF3 = composerKN.iF();
                    if (!zE22 || objIF3 == companion.n()) {
                        objIF3 = new Function1() { // from class: a4.Dsr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return o.Uo(lifecycleOwner, exoPlayer, (DisposableEffectScope) obj2);
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    composerKN.Xw();
                    EffectsKt.rl(lifecycleOwner, (Function1) objIF3, composerKN, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    i12 = i11;
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: a4.aC
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return o.xMQ(uri, z2, modifier3, i12, i3, i5, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 3072;
            i9 = i2;
            if ((i7 & 1171) == 1170) {
                if (i13 != 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.v()) {
                }
                context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                lifecycleOwner = (LifecycleOwner) composerKN.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                composerKN.eF(3439261);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                Object obj2 = objIF;
                if (objIF == companion.n()) {
                }
                exoPlayer = (ExoPlayer) obj2;
                composerKN.Xw();
                Intrinsics.checkNotNull(exoPlayer);
                if (z2) {
                }
                composerKN.eF(3465157);
                zE2 = composerKN.E2(context) | ((i7 & 7168) != 2048) | composerKN.E2(exoPlayer);
                objIF2 = composerKN.iF();
                if (zE2) {
                    i11 = i10;
                    objIF2 = new Function1() { // from class: a4.fuX
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            return o.J2(context, i11, exoPlayer, (Context) obj22);
                        }
                    };
                    composerKN.o(objIF2);
                    composerKN.Xw();
                    AndroidView_androidKt.n((Function1) objIF2, modifier2, null, composerKN, (i7 >> 3) & 112, 4);
                    composerKN.eF(3478970);
                    zE22 = composerKN.E2(exoPlayer) | composerKN.E2(lifecycleOwner);
                    objIF3 = composerKN.iF();
                    if (!zE22) {
                        objIF3 = new Function1() { // from class: a4.Dsr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj22) {
                                return o.Uo(lifecycleOwner, exoPlayer, (DisposableEffectScope) obj22);
                            }
                        };
                        composerKN.o(objIF3);
                        composerKN.Xw();
                        EffectsKt.rl(lifecycleOwner, (Function1) objIF3, composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                        i12 = i11;
                    }
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i2;
        if ((i7 & 1171) == 1170) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Uo(LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: a4.C
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                o.KN(exoPlayer, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycleRegistry().n(lifecycleEventObserver);
        return new j(lifecycleOwner, lifecycleEventObserver, exoPlayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Uri uri, boolean z2, Modifier modifier, int i2, int i3, int i5, Composer composer, int i7) {
        O(uri, z2, modifier, i2, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }
}
