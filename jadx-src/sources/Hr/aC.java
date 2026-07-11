package Hr;

import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MediaCodecList f3970n = new MediaCodecList(0);

    public static final List HI(MediaExtractor mediaExtractor) {
        Intrinsics.checkNotNullParameter(mediaExtractor, "<this>");
        ArrayList arrayList = new ArrayList();
        int trackCount = mediaExtractor.getTrackCount();
        for (int i2 = 0; i2 < trackCount; i2++) {
            arrayList.add(mediaExtractor.getTrackFormat(i2));
        }
        return arrayList;
    }

    public static final void Ik(MediaFormat mediaFormat, Integer num) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (num == null) {
            mediaFormat.setString("pcm-encoding", null);
        } else {
            mediaFormat.setInteger("pcm-encoding", num.intValue());
        }
    }

    public static final String J2(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("language")) {
            return mediaFormat.getString("language");
        }
        return null;
    }

    public static final Integer KN(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("max-input-size")) {
            return Integer.valueOf(mediaFormat.getInteger("max-input-size"));
        }
        return null;
    }

    public static final int O(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("height")) {
            return mediaFormat.getInteger("height");
        }
        return 0;
    }

    public static final Integer Uo(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey(AppLovinEventTypes.USER_COMPLETED_LEVEL)) {
            return Integer.valueOf(mediaFormat.getInteger(AppLovinEventTypes.USER_COMPLETED_LEVEL));
        }
        return null;
    }

    public static final Integer az(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("rotation-degrees")) {
            return Integer.valueOf(mediaFormat.getInteger("rotation-degrees"));
        }
        return null;
    }

    public static final int ck(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("width")) {
            return mediaFormat.getInteger("width");
        }
        return 0;
    }

    public static final Integer gh(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey(Scopes.PROFILE)) {
            return Integer.valueOf(mediaFormat.getInteger(Scopes.PROFILE));
        }
        return null;
    }

    public static final Integer mUb(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("pcm-encoding")) {
            return Integer.valueOf(mediaFormat.getInteger("pcm-encoding"));
        }
        return null;
    }

    public static final Integer n(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("aac-profile")) {
            return Integer.valueOf(mediaFormat.getInteger("aac-profile"));
        }
        return null;
    }

    public static final Integer nr(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("color-format")) {
            return Integer.valueOf(mediaFormat.getInteger("color-format"));
        }
        return null;
    }

    public static final MediaCodecList qie() {
        return f3970n;
    }

    public static final Integer rl(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("bitrate")) {
            return Integer.valueOf(mediaFormat.getInteger("bitrate"));
        }
        return null;
    }

    public static final int t(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("channel-count")) {
            return mediaFormat.getInteger("channel-count");
        }
        return 0;
    }

    public static final int ty(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("sample-rate")) {
            return mediaFormat.getInteger("sample-rate");
        }
        return 0;
    }

    public static final String xMQ(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return mediaFormat.getString("mime");
    }
}
