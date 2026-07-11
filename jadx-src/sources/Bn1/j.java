package Bn1;

import B7.fuX;
import B7.w6;
import LQ.fuX;
import LQ.j;
import android.media.AudioTrack;
import as.qz;
import as.z;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements B7.Dsr {
    public static final C0017j rl = new C0017j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AudioTrack f615n;

    /* JADX INFO: renamed from: Bn1.j$j, reason: collision with other inner class name */
    public static final class C0017j {
        public /* synthetic */ C0017j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0017j() {
        }
    }

    public j(AudioTrack audioTrack) {
        Intrinsics.checkNotNullParameter(audioTrack, "audioTrack");
        this.f615n = audioTrack;
    }

    @Override // B7.Dsr
    public void flush() {
        this.f615n.flush();
    }

    @Override // B7.Dsr
    public B7.fuX getPlaybackState() {
        int playState = this.f615n.getPlayState();
        if (playState == 1) {
            return fuX.w6.f265n;
        }
        if (playState == 2) {
            return fuX.j.f263n;
        }
        if (playState == 3) {
            return fuX.n.f264n;
        }
        throw new IllegalStateException(("Unhandled play state: " + this.f615n.getPlayState()).toString());
    }

    @Override // B7.Dsr
    public as.CN3 n() {
        return new as.CN3(qz.rl(this.f615n.getChannelCount()), z.n(this.f615n.getSampleRate()), null);
    }

    @Override // B7.Dsr
    public void pause() {
        this.f615n.pause();
    }

    @Override // B7.Dsr
    public void play() {
        this.f615n.play();
    }

    @Override // B7.Dsr
    public void release() {
        this.f615n.release();
    }

    @Override // B7.Dsr
    public int rl() {
        return this.f615n.getUnderrunCount();
    }

    @Override // B7.Dsr
    public void stop() {
        this.f615n.stop();
    }

    @Override // B7.Dsr
    public int t() {
        return as.Ml.t(this.f615n.getPlaybackHeadPosition());
    }

    @Override // B7.Dsr
    public LQ.j write(ByteBuffer byteBuffer) throws fuX.j {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        LQ.fuX fux = new LQ.fuX();
        try {
            int iWrite = this.f615n.write(byteBuffer, byteBuffer.remaining(), 1);
            if (iWrite >= 0) {
                return new j.w6(w9.w6.rl(w9.w6.J2(iWrite)));
            }
            if (iWrite == -32 || iWrite == -6) {
                fux.n(w6.j.f275n);
                throw new KotlinNothingValueException();
            }
            if (iWrite == -3) {
                throw new IllegalStateException(("Audio track " + this.f615n + " has not been properly initialized").toString());
            }
            if (iWrite != -2) {
                if (iWrite == -1) {
                    fux.n(w6.n.f276n);
                    throw new KotlinNothingValueException();
                }
                throw new IllegalStateException(("Unknown error with code " + iWrite).toString());
            }
            throw new IllegalStateException(("Parameters provided (" + byteBuffer + ", 1) don't resolve to valid data and indices").toString());
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }
}
