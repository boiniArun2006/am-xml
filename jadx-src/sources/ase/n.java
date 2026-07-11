package ase;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n {

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ByteBuffer f43109n;
        private final MediaCodec.BufferInfo rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f43109n, jVar.f43109n) && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public j(ByteBuffer buffer, MediaCodec.BufferInfo info) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(info, "info");
            this.f43109n = buffer;
            this.rl = info;
        }

        public int hashCode() {
            return (this.f43109n.hashCode() * 31) + this.rl.hashCode();
        }

        public final ByteBuffer n() {
            return this.f43109n;
        }

        public final MediaCodec.BufferInfo rl() {
            return this.rl;
        }

        public String toString() {
            return "EncodedData(buffer=" + this.f43109n + ", info=" + this.rl + ')';
        }
    }

    /* JADX INFO: renamed from: ase.n$n, reason: collision with other inner class name */
    public static final class C0569n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaFormat f43110n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0569n) && Intrinsics.areEqual(this.f43110n, ((C0569n) obj).f43110n);
        }

        public C0569n(MediaFormat format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f43110n = format;
        }

        public int hashCode() {
            return this.f43110n.hashCode();
        }

        public final MediaFormat n() {
            return this.f43110n;
        }

        public String toString() {
            return "OutputFormatChanged(format=" + this.f43110n + ')';
        }
    }
}
