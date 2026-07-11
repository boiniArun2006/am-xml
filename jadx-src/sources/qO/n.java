package qO;

import LQ.j;
import aUP.I28;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.exoplayer.RendererCapabilities;
import as.CN3;
import as.eO;
import as.qz;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class n {
    public static final MediaFormat J2(String mime, int i2, int i3, int i5, int i7, float f3, int i8) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        return O(mime, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7), Float.valueOf(f3), Integer.valueOf(i8), null, null, RendererCapabilities.DECODER_SUPPORT_MASK, null);
    }

    public static /* synthetic */ MediaFormat O(String str, Integer num, Integer num2, Integer num3, Integer num4, Float f3, Integer num5, eO eOVar, qz qzVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        if ((i2 & 8) != 0) {
            num3 = null;
        }
        if ((i2 & 16) != 0) {
            num4 = null;
        }
        if ((i2 & 32) != 0) {
            f3 = null;
        }
        if ((i2 & 64) != 0) {
            num5 = null;
        }
        if ((i2 & 128) != 0) {
            eOVar = null;
        }
        if ((i2 & 256) != 0) {
            qzVar = null;
        }
        return nr(str, num, num2, num3, num4, f3, num5, eOVar, qzVar);
    }

    public static final LQ.j Uo(MediaCodec mediaCodec) {
        Intrinsics.checkNotNullParameter(mediaCodec, "<this>");
        try {
            mediaCodec.start();
            return new j.w6(mediaCodec);
        } catch (MediaCodec.CodecException e2) {
            return new j.n(I28.rl.rl(mediaCodec, e2));
        }
    }

    public static final LQ.j n(MediaCodec mediaCodec, MediaFormat format, MediaCrypto mediaCrypto) {
        Intrinsics.checkNotNullParameter(mediaCodec, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return rl(mediaCodec, format, null, mediaCrypto, 1);
    }

    public static final MediaFormat nr(String str, Integer num, Integer num2, Integer num3, Integer num4, Float f3, Integer num5, eO eOVar, qz qzVar) {
        MediaFormat mediaFormat = new MediaFormat();
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        if (num != null) {
            mediaFormat.setInteger("bitrate", num.intValue());
        }
        if (num2 != null) {
            mediaFormat.setInteger("width", num2.intValue());
        }
        if (num3 != null) {
            mediaFormat.setInteger("height", num3.intValue());
        }
        if (num4 != null) {
            mediaFormat.setInteger("i-frame-interval", num4.intValue());
        }
        if (f3 != null) {
            mediaFormat.setFloat("frame-rate", f3.floatValue());
        }
        if (num5 != null) {
            mediaFormat.setInteger("color-format", num5.intValue());
        }
        if (eOVar != null) {
            mediaFormat.setInteger("sample-rate", eOVar.mUb());
        }
        if (qzVar != null) {
            mediaFormat.setInteger("channel-count", qzVar.Uo());
        }
        return mediaFormat;
    }

    public static final LQ.j rl(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        Intrinsics.checkNotNullParameter(mediaCodec, "<this>");
        Intrinsics.checkNotNullParameter(mediaFormat, obbPUqyhtS.CNCGaRfDV);
        try {
            mediaCodec.configure(mediaFormat, surface, mediaCrypto, i2);
            return new j.w6(mediaCodec);
        } catch (MediaCodec.CodecException e2) {
            return new j.n(I28.rl.n(mediaCodec, mediaFormat, i2, e2));
        } catch (MediaCodec.CryptoException e3) {
            return new j.n(I28.rl.n(mediaCodec, mediaFormat, i2, e3));
        }
    }

    public static final MediaFormat t(String mime, int i2, CN3 streamProperties) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        return O(mime, Integer.valueOf(i2), null, null, null, null, null, eO.n(streamProperties.t()), qz.n(streamProperties.rl()), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }
}
