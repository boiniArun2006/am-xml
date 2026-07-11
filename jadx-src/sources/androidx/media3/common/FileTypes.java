package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int AVIF = 21;
    public static final int BMP = 19;
    private static final String EXTENSION_AAC = ".aac";
    private static final String EXTENSION_AC3 = ".ac3";
    private static final String EXTENSION_AC4 = ".ac4";
    private static final String EXTENSION_ADTS = ".adts";
    private static final String EXTENSION_AMR = ".amr";
    private static final String EXTENSION_AVI = ".avi";
    private static final String EXTENSION_AVIF = ".avif";
    private static final String EXTENSION_BMP = ".bmp";
    private static final String EXTENSION_DIB = ".dib";
    private static final String EXTENSION_EC3 = ".ec3";
    private static final String EXTENSION_FLAC = ".flac";
    private static final String EXTENSION_FLV = ".flv";
    private static final String EXTENSION_HEIC = ".heic";
    private static final String EXTENSION_HEIF = ".heif";
    private static final String EXTENSION_JPEG = ".jpeg";
    private static final String EXTENSION_JPG = ".jpg";
    private static final String EXTENSION_M2P = ".m2p";
    private static final String EXTENSION_MID = ".mid";
    private static final String EXTENSION_MIDI = ".midi";
    private static final String EXTENSION_MP3 = ".mp3";
    private static final String EXTENSION_MP4 = ".mp4";
    private static final String EXTENSION_MPEG = ".mpeg";
    private static final String EXTENSION_MPG = ".mpg";
    private static final String EXTENSION_OPUS = ".opus";
    private static final String EXTENSION_PNG = ".png";
    private static final String EXTENSION_PREFIX_CMF = ".cmf";
    private static final String EXTENSION_PREFIX_M4 = ".m4";
    private static final String EXTENSION_PREFIX_MK = ".mk";
    private static final String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final String EXTENSION_PREFIX_OG = ".og";
    private static final String EXTENSION_PREFIX_TS = ".ts";
    private static final String EXTENSION_PS = ".ps";
    private static final String EXTENSION_SMF = ".smf";
    private static final String EXTENSION_TS = ".ts";
    private static final String EXTENSION_VTT = ".vtt";
    private static final String EXTENSION_WAV = ".wav";
    private static final String EXTENSION_WAVE = ".wave";
    private static final String EXTENSION_WEBM = ".webm";
    private static final String EXTENSION_WEBP = ".webp";
    private static final String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;

    @VisibleForTesting
    static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int HEIF = 20;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PNG = 17;
    public static final int PS = 10;
    public static final int TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBP = 18;
    public static final int WEBVTT = 13;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a4, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b3, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c2, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cf, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01dd, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01eb, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f9, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0206, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0214, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ff, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012c, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0177, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0186, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0195, code lost:
    
        r23 = 20;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021e A[PHI: r23
      0x021e: PHI (r23v32 int) = 
      (r23v1 int)
      (r23v2 int)
      (r23v3 int)
      (r23v4 int)
      (r23v5 int)
      (r23v6 int)
      (r23v7 int)
      (r23v8 int)
      (r23v9 int)
      (r23v10 int)
      (r23v11 int)
      (r23v12 int)
      (r23v13 int)
      (r23v14 int)
      (r23v15 int)
      (r23v16 int)
      (r23v17 int)
      (r23v18 int)
      (r23v19 int)
      (r23v20 int)
      (r23v21 int)
      (r23v22 int)
      (r23v23 int)
      (r23v24 int)
      (r23v25 int)
      (r23v26 int)
      (r23v27 int)
      (r23v28 int)
      (r23v29 int)
      (r23v30 int)
      (r23v31 int)
      (r23v33 int)
     binds: [B:133:0x021c, B:129:0x020e, B:125:0x0201, B:121:0x01f3, B:117:0x01e5, B:113:0x01d7, B:109:0x01ca, B:105:0x01bb, B:101:0x01ac, B:97:0x019d, B:93:0x018e, B:89:0x017f, B:85:0x0170, B:81:0x0161, B:77:0x0152, B:73:0x0143, B:69:0x0134, B:65:0x0125, B:61:0x0116, B:57:0x0107, B:53:0x00f7, B:49:0x00e7, B:45:0x00d7, B:41:0x00c7, B:37:0x00b7, B:33:0x00a7, B:29:0x0097, B:25:0x0087, B:21:0x0077, B:17:0x0067, B:13:0x0057, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int inferFileTypeFromMimeType(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(str);
        strNormalizeMimeType.getClass();
        switch (strNormalizeMimeType) {
        }
        return -1;
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    private FileTypes() {
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(EXTENSION_AC3) && !lastPathSegment.endsWith(EXTENSION_EC3)) {
            if (lastPathSegment.endsWith(EXTENSION_AC4)) {
                return 1;
            }
            if (!lastPathSegment.endsWith(EXTENSION_ADTS) && !lastPathSegment.endsWith(EXTENSION_AAC)) {
                if (lastPathSegment.endsWith(EXTENSION_AMR)) {
                    return 3;
                }
                if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
                    return 4;
                }
                if (lastPathSegment.endsWith(EXTENSION_FLV)) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(EXTENSION_MID) && !lastPathSegment.endsWith(EXTENSION_MIDI) && !lastPathSegment.endsWith(EXTENSION_SMF)) {
                    if (!lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(EXTENSION_WEBM)) {
                        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(EXTENSION_OPUS)) {
                                if (!lastPathSegment.endsWith(EXTENSION_PS) && !lastPathSegment.endsWith(EXTENSION_MPEG) && !lastPathSegment.endsWith(EXTENSION_MPG) && !lastPathSegment.endsWith(EXTENSION_M2P)) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(EXTENSION_WAV) && !lastPathSegment.endsWith(EXTENSION_WAVE)) {
                                            if (!lastPathSegment.endsWith(EXTENSION_VTT) && !lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
                                                if (!lastPathSegment.endsWith(EXTENSION_JPG) && !lastPathSegment.endsWith(EXTENSION_JPEG)) {
                                                    if (lastPathSegment.endsWith(EXTENSION_AVI)) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(EXTENSION_PNG)) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(EXTENSION_WEBP)) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(EXTENSION_BMP) && !lastPathSegment.endsWith(EXTENSION_DIB)) {
                                                        if (!lastPathSegment.endsWith(EXTENSION_HEIC) && !lastPathSegment.endsWith(EXTENSION_HEIF)) {
                                                            if (!lastPathSegment.endsWith(EXTENSION_AVIF)) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}
