package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.common.collect.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class Wre implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Format f57767n;

    public static j nr(int i2, ParsableByteArray parsableByteArray) {
        if (i2 == 2) {
            return t(parsableByteArray);
        }
        if (i2 == 1) {
            return O(parsableByteArray);
        }
        Log.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Util.getTrackTypeString(i2));
        return null;
    }

    private static String rl(int i2) {
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

    private static j t(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        String strN = n(littleEndianInt3);
        if (strN != null) {
            Format.Builder builder = new Format.Builder();
            builder.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(strN);
            return new Wre(builder.build());
        }
        Log.w("StreamFormatChunk", "Ignoring track with unsupported compression " + littleEndianInt3);
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.j
    public int getType() {
        return 1718776947;
    }

    public Wre(Format format) {
        this.f57767n = format;
    }

    private static j O(ParsableByteArray parsableByteArray) {
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        String strRl = rl(littleEndianUnsignedShort);
        if (strRl == null) {
            Log.w("StreamFormatChunk", "Ignoring track with unsupported format tag " + littleEndianUnsignedShort);
            return null;
        }
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = Util.getPcmEncoding(parsableByteArray.readUnsignedShort());
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[littleEndianUnsignedShort3];
        parsableByteArray.readBytes(bArr, 0, littleEndianUnsignedShort3);
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(strRl).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt);
        if ("audio/raw".equals(strRl) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if ("audio/mp4a-latm".equals(strRl) && littleEndianUnsignedShort3 > 0) {
            builder.setInitializationData(nKK.o(bArr));
        }
        return new Wre(builder.build());
    }

    private static String n(int i2) {
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
                return YmsTEL.DcxYDzAphdX;
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }
}
