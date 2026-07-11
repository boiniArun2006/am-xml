package com.bendingspoons.adorable.internal;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Wre implements Player.Listener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f51195n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f51196t;

    public Wre(Function1 onError, Function0 onPlaybackCompleted) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onPlaybackCompleted, "onPlaybackCompleted");
        this.f51195n = onError;
        this.f51196t = onPlaybackCompleted;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onPlayerError(error);
        this.f51195n.invoke(error);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int i2) {
        super.onPlaybackStateChanged(i2);
        if (i2 == 4) {
            this.f51196t.invoke();
        }
    }
}
