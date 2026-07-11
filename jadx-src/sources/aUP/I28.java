package aUP;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f13004n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final I28 n(MediaCodec codec, MediaFormat format, int i2, Exception exception) {
            Intrinsics.checkNotNullParameter(codec, "codec");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(exception, "exception");
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to configure codec '");
            sb.append(codec.getName());
            sb.append("' with\n  format: ");
            sb.append(format);
            sb.append("\n  flags: ");
            sb.append(i2);
            sb.append("\nException: ");
            sb.append(exception);
            sb.append('\n');
            MediaCodecInfo codecInfo = codec.getCodecInfo();
            Intrinsics.checkNotNullExpressionValue(codecInfo, "codec.codecInfo");
            sb.append(qO.j.nr(codecInfo, String.valueOf(qO.w6.nr(format)), qO.w6.J2(format), false, 4, null));
            return new I28(sb.toString());
        }

        public final I28 rl(MediaCodec codec, Exception exception) {
            Intrinsics.checkNotNullParameter(codec, "codec");
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new I28("Failed to start codec '" + codec.getName() + "'.\nException: " + exception + '\n');
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I28) && Intrinsics.areEqual(this.f13004n, ((I28) obj).f13004n);
    }

    public I28(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f13004n = message;
    }

    public int hashCode() {
        return this.f13004n.hashCode();
    }

    public String toString() {
        return "CodecFailure(message=" + this.f13004n + ')';
    }
}
