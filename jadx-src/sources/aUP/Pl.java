package aUP;

import android.media.MediaMuxer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Pl implements w9.fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaMuxer f13009n;

    public Pl(MediaMuxer muxer) {
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        this.f13009n = muxer;
    }

    public final MediaMuxer gh() {
        return this.f13009n;
    }

    @Override // w9.fuX
    public void release() {
        this.f13009n.release();
    }
}
