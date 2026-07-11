package aUP;

import ILs.Q;
import ILs.r;
import android.media.MediaCodec;
import android.media.MediaFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml extends MediaCodec.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ILs.CN3 f13005n = ILs.aC.rl(Integer.MAX_VALUE, null, null, 6, null);
    private final ILs.CN3 rl = ILs.aC.rl(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: aUP.Ml$Ml, reason: collision with other inner class name */
    public interface InterfaceC0473Ml {
    }

    public static final class j implements InterfaceC0473Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f13006n;
        private final MediaCodec.BufferInfo rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f13006n == jVar.f13006n && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public j(int i2, MediaCodec.BufferInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f13006n = i2;
            this.rl = info;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f13006n) * 31) + this.rl.hashCode();
        }

        public final int n() {
            return this.f13006n;
        }

        public final MediaCodec.BufferInfo rl() {
            return this.rl;
        }

        public String toString() {
            return "BufferAvailable(index=" + this.f13006n + ", info=" + this.rl + ')';
        }
    }

    public static final class n implements InterfaceC0473Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaFormat f13007n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f13007n, ((n) obj).f13007n);
        }

        public n(MediaFormat format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f13007n = format;
        }

        public int hashCode() {
            return this.f13007n.hashCode();
        }

        public final MediaFormat n() {
            return this.f13007n;
        }

        public String toString() {
            return "FormatChanged(format=" + this.f13007n + ')';
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f13008n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && this.f13008n == ((w6) obj).f13008n;
        }

        public int hashCode() {
            return Integer.hashCode(this.f13008n);
        }

        public final int n() {
            return this.f13008n;
        }

        public String toString() {
            return "InputBuffer(index=" + this.f13008n + ')';
        }

        public w6(int i2) {
            this.f13008n = i2;
        }
    }

    public final Q n() {
        return this.f13005n;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec codec, MediaCodec.CodecException e2) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(e2, "e");
        this.f13005n.xMQ(e2);
        this.rl.xMQ(e2);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec codec, int i2) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f13005n.nr(new w6(i2));
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec codec, int i2, MediaCodec.BufferInfo info) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(info, "info");
        this.rl.nr(new j(i2, info));
        if (oVe.j.rl(info)) {
            r.j.n(this.rl, null, 1, null);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(format, "format");
        this.rl.nr(new n(format));
    }

    public final Q rl() {
        return this.rl;
    }
}
