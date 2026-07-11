package uPp;

import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.google.android.exoplayer2.Format;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class Wre {
    public static final String n(Format format) {
        Intrinsics.checkNotNullParameter(format, "<this>");
        return StringsKt.trimIndent("Format[\n    id=" + format.id + ",\n    label=" + format.label + ",\n    language=" + format.language + ",\n    selectionFlags=" + format.selectionFlags + ",\n    roleFlags=" + format.roleFlags + ",\n    averageBitrate=" + format.averageBitrate + ",\n    peakBitrate=" + format.peakBitrate + qUrazMnwDskFs.LmVXVdJITcawh + format.codecs + ",\n    metadata=" + format.metadata + ",\n    sampleMimeType=" + format.sampleMimeType + ",\n    Video[\n        width=" + format.width + ",\n        height=" + format.height + ",\n        frameRate=" + format.frameRate + ",\n        rotationDegrees=" + format.rotationDegrees + ",\n        pixelWidthHeightRatio=" + format.pixelWidthHeightRatio + ",\n        projectionData=" + format.projectionData + ",\n        stereoMode=" + format.stereoMode + ",\n        colorInfo=" + format.colorInfo + ",\n    ],\n    Audio[\n        channelCount=" + format.channelCount + ",\n        sampleRate=" + format.sampleRate + ",\n        pcmEncoding=" + format.pcmEncoding + ",\n        encoderDelay=" + format.encoderDelay + ",\n        encoderPadding=" + format.encoderPadding + ",\n    ],\n");
    }
}
