package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class StreamFormatChunk implements AviChunk {
    private static final String TAG = "StreamFormatChunk";
    public final Format format;

    @Nullable
    private static String getMimeTypeFromTag(int i2) {
        if (i2 == 1) {
            return "audio/raw";
        }
        if (i2 == 85) {
            return "audio/mpeg";
        }
        if (i2 == 255) {
            return "audio/mp4a-latm";
        }
        if (i2 == 8192) {
            return "audio/ac3";
        }
        if (i2 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @Nullable
    private static AviChunk parseBitmapInfoHeader(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        String mimeTypeFromCompression = getMimeTypeFromCompression(littleEndianInt3);
        if (mimeTypeFromCompression != null) {
            Format.Builder builder = new Format.Builder();
            builder.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
            return new StreamFormatChunk(builder.build());
        }
        Log.w(TAG, "Ignoring track with unsupported compression " + littleEndianInt3);
        return null;
    }

    @Nullable
    public static AviChunk parseFrom(int i2, ParsableByteArray parsableByteArray) {
        if (i2 == 2) {
            return parseBitmapInfoHeader(parsableByteArray);
        }
        if (i2 == 1) {
            return parseWaveFormatEx(parsableByteArray);
        }
        Log.w(TAG, "Ignoring strf box for unsupported track type: " + Util.getTrackTypeString(i2));
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 1718776947;
    }

    public StreamFormatChunk(Format format) {
        this.format = format;
    }

    @Nullable
    private static String getMimeTypeFromCompression(int i2) {
        switch (i2) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @Nullable
    private static AviChunk parseWaveFormatEx(ParsableByteArray parsableByteArray) {
        int littleEndianUnsignedShort;
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        String mimeTypeFromTag = getMimeTypeFromTag(littleEndianUnsignedShort2);
        if (mimeTypeFromTag == null) {
            Log.w(TAG, "Ignoring track with unsupported format tag " + littleEndianUnsignedShort2);
            return null;
        }
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = Util.getPcmEncoding(parsableByteArray.readLittleEndianUnsignedShort());
        if (parsableByteArray.bytesLeft() > 0) {
            littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        } else {
            littleEndianUnsignedShort = 0;
        }
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(mimeTypeFromTag).setChannelCount(littleEndianUnsignedShort3).setSampleRate(littleEndianInt);
        if (mimeTypeFromTag.equals("audio/raw") && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if (mimeTypeFromTag.equals("audio/mp4a-latm") && littleEndianUnsignedShort > 0) {
            byte[] bArr = new byte[littleEndianUnsignedShort];
            parsableByteArray.readBytes(bArr, 0, littleEndianUnsignedShort);
            builder.setInitializationData(nKK.o(bArr));
        }
        return new StreamFormatChunk(builder.build());
    }
}
