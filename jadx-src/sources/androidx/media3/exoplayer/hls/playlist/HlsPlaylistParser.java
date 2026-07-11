package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.common.collect.lej;
import com.google.common.collect.nKK;
import com.safedk.android.analytics.brandsafety.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@UnstableApi
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String DATERANGE_CLASS_INTERSTITIALS = "com.apple.hls.interstitial";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DATERANGE = "#EXT-X-DATERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;

    @Nullable
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_VIDEO_RANGE = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_SUPPLEMENTAL_CODECS = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_ATTR_DURATION_PREFIXED = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_ID = Pattern.compile("[:,]ID=\"(.+?)\"");
    private static final Pattern REGEX_CLASS = Pattern.compile("CLASS=\"(.+?)\"");
    private static final Pattern REGEX_START_DATE = Pattern.compile("START-DATE=\"(.+?)\"");
    private static final Pattern REGEX_CUE = Pattern.compile("CUE=\"(.+?)\"");
    private static final Pattern REGEX_END_DATE = Pattern.compile("END-DATE=\"(.+?)\"");
    private static final Pattern REGEX_PLANNED_DURATION = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_END_ON_NEXT = compileBooleanAttrPattern("END-ON-NEXT");
    private static final Pattern REGEX_ASSET_URI = Pattern.compile(FijIa.wRIXuPwU);
    private static final Pattern REGEX_ASSET_LIST_URI = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");
    private static final Pattern REGEX_RESUME_OFFSET = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_PLAYOUT_LIMIT = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SNAP = Pattern.compile("X-SNAP=\"(.+?)\"");
    private static final Pattern REGEX_RESTRICT = Pattern.compile("X-RESTRICT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class DeltaUpdateException extends IOException {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private static class LineIterator {
        private final Queue<String> extraLines;

        @Nullable
        private String next;
        private final BufferedReader reader;

        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public String next() throws IOException {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static DrmInitData getPlaylistProtectionSchemes(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            schemeDataArr2[i2] = schemeDataArr[i2].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i2);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i2);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i2);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !Util.isLinebreak(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(" + BOOLEAN_FALSE + l.ad + BOOLEAN_TRUE + ")");
    }

    @Nullable
    private static String getSegmentEncryptionIV(long j2, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    private static HlsMediaPlaylist.ClientDefinedAttribute parseClientDefinedAttribute(String str, String str2, Map<String, String> map) throws ParserException {
        String str3 = str2 + l.ae;
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=\"(.+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseDoubleAttr(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] bArrDecode = Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, "video/mp4", PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? "cenc" : "cbcs";
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0699, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x069d, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06ab, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06b8, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0335 A[PHI: r2
      0x0335: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v1 java.lang.String) binds: [B:119:0x0346, B:113:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x069b A[PHI: r32
      0x069b: PHI (r32v8 int) = (r32v4 int), (r32v5 int), (r32v6 int), (r32v9 int) binds: [B:252:0x06c0, B:248:0x06b3, B:244:0x06a5, B:241:0x0699] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0923  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        boolean z2;
        DrmInitData drmInitData;
        ArrayList arrayList;
        DrmInitData drmInitData2;
        String str2;
        long j2;
        String str3;
        HlsMediaPlaylist.Part part;
        HlsMediaPlaylist.Segment segment;
        int i2;
        long j3;
        long j4;
        TreeMap treeMap;
        long j5;
        DrmInitData drmInitData3;
        long j6;
        DrmInitData drmInitData4;
        ArrayList arrayList2;
        int i3;
        HlsMediaPlaylist.Segment segment2;
        boolean z3;
        DrmInitData drmInitData5;
        DrmInitData playlistProtectionSchemes;
        ArrayList arrayList3;
        byte b2;
        ArrayList arrayList4;
        String strTrim;
        int i5;
        HlsMultivariantPlaylist hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z4 = hlsMultivariantPlaylist2.hasIndependentSegments;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str4 = "";
        boolean z5 = z4;
        long j7 = 0;
        long j9 = 0;
        long jMsToUs = 0;
        long j10 = 0;
        long longAttr = 0;
        long timeSecondsToUs = 0;
        long j11 = 0;
        long j12 = -9223372036854775807L;
        long intAttr = -9223372036854775807L;
        long doubleAttr = -9223372036854775807L;
        String optionalStringAttr = str4;
        String encryptionScheme = null;
        DrmInitData drmInitData6 = null;
        boolean optionalBooleanAttribute = false;
        int intAttr2 = 1;
        boolean z6 = false;
        int i7 = 0;
        DrmInitData playlistProtectionSchemes2 = null;
        String str5 = null;
        long j13 = -1;
        boolean z7 = false;
        HlsMediaPlaylist.Part part2 = null;
        int i8 = 0;
        HlsMediaPlaylist.Segment segment3 = null;
        int i9 = 0;
        String stringAttr = null;
        long j14 = -1;
        boolean z9 = false;
        long j15 = 0;
        boolean z10 = false;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList8.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String stringAttr2 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map);
                if ("VOD".equals(stringAttr2)) {
                    i7 = 1;
                } else if ("EVENT".equals(stringAttr2)) {
                    i7 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z9 = true;
            } else if (next.startsWith(TAG_START)) {
                DrmInitData drmInitData7 = drmInitData6;
                long doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                optionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false);
                drmInitData6 = drmInitData7;
                j12 = doubleAttr2;
            } else {
                DrmInitData drmInitData8 = drmInitData6;
                if (next.startsWith(TAG_SERVER_CONTROL)) {
                    serverControl = parseServerControl(next);
                    drmInitData6 = drmInitData8;
                } else {
                    if (next.startsWith(TAG_PART_INF)) {
                        z2 = optionalBooleanAttribute;
                        doubleAttr = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
                        drmInitData6 = drmInitData8;
                    } else {
                        z2 = optionalBooleanAttribute;
                        if (next.startsWith(TAG_INIT_SEGMENT)) {
                            String stringAttr3 = parseStringAttr(next, REGEX_URI, map);
                            String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                            if (optionalStringAttr2 != null) {
                                String[] strArrSplit = Util.split(optionalStringAttr2, "@");
                                j13 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j7 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            long j16 = j13;
                            long j17 = j16 == j14 ? 0L : j7;
                            if (stringAttr != null && str5 == null) {
                                throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            HlsMediaPlaylist.Segment segment4 = new HlsMediaPlaylist.Segment(stringAttr3, j17, j16, stringAttr, str5);
                            if (j16 != j14) {
                                j17 += j16;
                            }
                            j7 = j17;
                            drmInitData6 = drmInitData8;
                            segment3 = segment4;
                            j13 = j14;
                        } else {
                            ArrayList arrayList10 = arrayList8;
                            HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
                            String str6 = str5;
                            String str7 = stringAttr;
                            if (next.startsWith(TAG_TARGET_DURATION)) {
                                drmInitData = drmInitData8;
                                intAttr = ((long) parseIntAttr(next, REGEX_TARGET_DURATION)) * 1000000;
                            } else {
                                drmInitData = drmInitData8;
                                if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                                    longAttr = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                                    str5 = str6;
                                    stringAttr = str7;
                                    drmInitData6 = drmInitData;
                                    j15 = longAttr;
                                    optionalBooleanAttribute = z2;
                                    arrayList8 = arrayList10;
                                    serverControl = serverControl2;
                                } else if (next.startsWith(TAG_VERSION)) {
                                    intAttr2 = parseIntAttr(next, REGEX_VERSION);
                                } else {
                                    if (next.startsWith(TAG_DEFINE)) {
                                        String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_IMPORT, map);
                                        if (optionalStringAttr3 != null) {
                                            String str8 = hlsMultivariantPlaylist2.variableDefinitions.get(optionalStringAttr3);
                                            if (str8 != null) {
                                                map.put(optionalStringAttr3, str8);
                                            }
                                        } else {
                                            map.put(parseStringAttr(next, REGEX_NAME, map), parseStringAttr(next, REGEX_VALUE, map));
                                        }
                                        arrayList = arrayList9;
                                        drmInitData2 = drmInitData;
                                        str2 = str4;
                                    } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                                        timeSecondsToUs = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                                        optionalStringAttr = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str4, map);
                                    } else {
                                        String str9 = str4;
                                        if (next.startsWith(TAG_SKIP)) {
                                            int intAttr3 = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                            Assertions.checkState(hlsMediaPlaylist2 != null && arrayList5.isEmpty());
                                            ArrayList arrayList11 = arrayList9;
                                            int i10 = (int) (j15 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist2)).mediaSequence);
                                            int i11 = intAttr3 + i10;
                                            if (i10 < 0 || i11 > hlsMediaPlaylist2.segments.size()) {
                                                throw new DeltaUpdateException();
                                            }
                                            str5 = str6;
                                            stringAttr = str7;
                                            drmInitData6 = drmInitData;
                                            long j18 = j9;
                                            while (i10 < i11) {
                                                HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist2.segments.get(i10);
                                                String str10 = str9;
                                                if (j15 != hlsMediaPlaylist2.mediaSequence) {
                                                    segmentCopyWith = segmentCopyWith.copyWith(j18, (hlsMediaPlaylist2.discontinuitySequence - i8) + segmentCopyWith.relativeDiscontinuitySequence);
                                                }
                                                arrayList5.add(segmentCopyWith);
                                                j10 = j18 + segmentCopyWith.durationUs;
                                                long j19 = segmentCopyWith.byteRangeLength;
                                                if (j19 != j14) {
                                                    j7 = segmentCopyWith.byteRangeOffset + j19;
                                                }
                                                int i12 = segmentCopyWith.relativeDiscontinuitySequence;
                                                HlsMediaPlaylist.Segment segment5 = segmentCopyWith.initializationSegment;
                                                DrmInitData drmInitData9 = segmentCopyWith.drmInitData;
                                                String str11 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                                int i13 = i11;
                                                String str12 = segmentCopyWith.encryptionIV;
                                                if (str12 == null || !str12.equals(Long.toHexString(longAttr))) {
                                                    str5 = segmentCopyWith.encryptionIV;
                                                }
                                                longAttr++;
                                                i10++;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                i9 = i12;
                                                segment3 = segment5;
                                                drmInitData6 = drmInitData9;
                                                stringAttr = str11;
                                                i11 = i13;
                                                j18 = j10;
                                                str9 = str10;
                                            }
                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            j9 = j18;
                                            arrayList9 = arrayList11;
                                            optionalBooleanAttribute = z2;
                                            arrayList8 = arrayList10;
                                            serverControl = serverControl2;
                                        } else {
                                            ArrayList arrayList12 = arrayList9;
                                            if (next.startsWith(TAG_KEY)) {
                                                String stringAttr4 = parseStringAttr(next, REGEX_METHOD, map);
                                                String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map);
                                                if (METHOD_NONE.equals(stringAttr4)) {
                                                    treeMap2.clear();
                                                    drmInitData6 = null;
                                                    str5 = null;
                                                    stringAttr = null;
                                                } else {
                                                    String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_IV, map);
                                                    if (!KEYFORMAT_IDENTITY.equals(optionalStringAttr4)) {
                                                        if (encryptionScheme == null) {
                                                            encryptionScheme = parseEncryptionScheme(stringAttr4);
                                                        }
                                                        DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, optionalStringAttr4, map);
                                                        if (drmSchemeData != null) {
                                                            treeMap2.put(optionalStringAttr4, drmSchemeData);
                                                            str5 = optionalStringAttr5;
                                                            drmInitData6 = null;
                                                            stringAttr = null;
                                                        }
                                                    } else if (METHOD_AES_128.equals(stringAttr4)) {
                                                        stringAttr = parseStringAttr(next, REGEX_URI, map);
                                                        str5 = optionalStringAttr5;
                                                        drmInitData6 = drmInitData;
                                                    } else {
                                                        str5 = optionalStringAttr5;
                                                        drmInitData6 = drmInitData;
                                                        stringAttr = null;
                                                    }
                                                }
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                arrayList9 = arrayList12;
                                            } else {
                                                if (next.startsWith(TAG_BYTERANGE)) {
                                                    String[] strArrSplit2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, map), "@");
                                                    j13 = Long.parseLong(strArrSplit2[0]);
                                                    if (strArrSplit2.length > 1) {
                                                        j7 = Long.parseLong(strArrSplit2[1]);
                                                    }
                                                } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                                    i8 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    str5 = str6;
                                                    stringAttr = str7;
                                                    z6 = true;
                                                    arrayList9 = arrayList12;
                                                    drmInitData6 = drmInitData;
                                                } else if (next.equals(TAG_DISCONTINUITY)) {
                                                    i9++;
                                                } else {
                                                    if (!next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                                        if (next.equals(TAG_GAP)) {
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            str5 = str6;
                                                            stringAttr = str7;
                                                            arrayList9 = arrayList12;
                                                            drmInitData6 = drmInitData;
                                                            optionalBooleanAttribute = z2;
                                                            arrayList8 = arrayList10;
                                                            z7 = true;
                                                        } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            str5 = str6;
                                                            stringAttr = str7;
                                                            arrayList9 = arrayList12;
                                                            drmInitData6 = drmInitData;
                                                            optionalBooleanAttribute = z2;
                                                            arrayList8 = arrayList10;
                                                            z5 = true;
                                                        } else if (next.equals(TAG_ENDLIST)) {
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            str5 = str6;
                                                            stringAttr = str7;
                                                            arrayList9 = arrayList12;
                                                            drmInitData6 = drmInitData;
                                                            optionalBooleanAttribute = z2;
                                                            arrayList8 = arrayList10;
                                                            z10 = true;
                                                        } else if (next.startsWith(TAG_RENDITION_REPORT)) {
                                                            arrayList7.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, map))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j14), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                                            str2 = str9;
                                                        } else {
                                                            str9 = str9;
                                                            if (next.startsWith(TAG_PRELOAD_HINT)) {
                                                                part = part2;
                                                                if (part == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, map))) {
                                                                    String stringAttr5 = parseStringAttr(next, REGEX_URI, map);
                                                                    long optionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                                    long optionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                                    long j20 = longAttr;
                                                                    String segmentEncryptionIV = getSegmentEncryptionIV(j20, str7, str6);
                                                                    if (drmInitData != null || treeMap2.isEmpty()) {
                                                                        drmInitData3 = drmInitData;
                                                                    } else {
                                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[0]);
                                                                        DrmInitData drmInitData10 = new DrmInitData(encryptionScheme, schemeDataArr);
                                                                        if (playlistProtectionSchemes2 == null) {
                                                                            playlistProtectionSchemes2 = getPlaylistProtectionSchemes(encryptionScheme, schemeDataArr);
                                                                        }
                                                                        drmInitData3 = drmInitData10;
                                                                    }
                                                                    part2 = (optionalLongAttr == -1 || optionalLongAttr2 != -1) ? new HlsMediaPlaylist.Part(stringAttr5, segment3, 0L, i9, j10, drmInitData3, str7, segmentEncryptionIV, optionalLongAttr != -1 ? optionalLongAttr : 0L, optionalLongAttr2, false, false, true) : part;
                                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                    str5 = str6;
                                                                    stringAttr = str7;
                                                                    longAttr = j20;
                                                                    arrayList9 = arrayList12;
                                                                    drmInitData6 = drmInitData3;
                                                                    optionalBooleanAttribute = z2;
                                                                    arrayList8 = arrayList10;
                                                                    serverControl = serverControl2;
                                                                    j14 = -1;
                                                                } else {
                                                                    treeMap = treeMap2;
                                                                    str2 = str9;
                                                                    arrayList = arrayList12;
                                                                    drmInitData2 = drmInitData;
                                                                    j2 = j9;
                                                                    str3 = optionalStringAttr;
                                                                    segment = segment3;
                                                                    i2 = i9;
                                                                    j3 = longAttr;
                                                                    j4 = timeSecondsToUs;
                                                                    j5 = j7;
                                                                    str5 = str6;
                                                                    drmInitData6 = drmInitData2;
                                                                    longAttr = j3;
                                                                    optionalStringAttr = str3;
                                                                    timeSecondsToUs = j4;
                                                                    j9 = j2;
                                                                    treeMap2 = treeMap;
                                                                    j7 = j5;
                                                                    segment3 = segment;
                                                                    str4 = str2;
                                                                    optionalBooleanAttribute = z2;
                                                                    serverControl = serverControl2;
                                                                    j14 = -1;
                                                                    part2 = part;
                                                                    arrayList9 = arrayList;
                                                                    stringAttr = str7;
                                                                    i9 = i2;
                                                                    arrayList8 = arrayList10;
                                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                }
                                                            } else {
                                                                part = part2;
                                                                j3 = longAttr;
                                                                if (next.startsWith(TAG_PART)) {
                                                                    String segmentEncryptionIV2 = getSegmentEncryptionIV(j3, str7, str6);
                                                                    String stringAttr6 = parseStringAttr(next, REGEX_URI, map);
                                                                    TreeMap treeMap3 = treeMap2;
                                                                    long doubleAttr3 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                                    boolean optionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z5 && arrayList6.isEmpty());
                                                                    boolean optionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                                    String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                                                                    if (optionalStringAttr6 != null) {
                                                                        String[] strArrSplit3 = Util.split(optionalStringAttr6, "@");
                                                                        long j21 = Long.parseLong(strArrSplit3[0]);
                                                                        if (strArrSplit3.length > 1) {
                                                                            j11 = Long.parseLong(strArrSplit3[1]);
                                                                        }
                                                                        j6 = j21;
                                                                    } else {
                                                                        j6 = -1;
                                                                    }
                                                                    long j22 = j6 == -1 ? 0L : j11;
                                                                    if (drmInitData != null || treeMap3.isEmpty()) {
                                                                        drmInitData4 = drmInitData;
                                                                    } else {
                                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap3.values().toArray(new DrmInitData.SchemeData[0]);
                                                                        DrmInitData drmInitData11 = new DrmInitData(encryptionScheme, schemeDataArr2);
                                                                        if (playlistProtectionSchemes2 == null) {
                                                                            playlistProtectionSchemes2 = getPlaylistProtectionSchemes(encryptionScheme, schemeDataArr2);
                                                                        }
                                                                        drmInitData4 = drmInitData11;
                                                                    }
                                                                    HlsMediaPlaylist.Segment segment6 = segment3;
                                                                    int i14 = i9;
                                                                    arrayList6.add(new HlsMediaPlaylist.Part(stringAttr6, segment3, doubleAttr3, i9, j10, drmInitData4, str7, segmentEncryptionIV2, j22, j6, optionalBooleanAttribute3, optionalBooleanAttribute2, false));
                                                                    j10 += doubleAttr3;
                                                                    if (j6 != -1) {
                                                                        j22 += j6;
                                                                    }
                                                                    j11 = j22;
                                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                    str5 = str6;
                                                                    segment3 = segment6;
                                                                    stringAttr = str7;
                                                                    longAttr = j3;
                                                                    i9 = i14;
                                                                    arrayList9 = arrayList12;
                                                                    str4 = str9;
                                                                    treeMap2 = treeMap3;
                                                                    drmInitData6 = drmInitData4;
                                                                    optionalBooleanAttribute = z2;
                                                                    arrayList8 = arrayList10;
                                                                    serverControl = serverControl2;
                                                                    j14 = -1;
                                                                    part2 = part;
                                                                } else {
                                                                    treeMap = treeMap2;
                                                                    HlsMediaPlaylist.Segment segment7 = segment3;
                                                                    int i15 = i9;
                                                                    if (next.startsWith(TAG_DATERANGE)) {
                                                                        segment = segment7;
                                                                        if (parseOptionalStringAttr(next, REGEX_CLASS, str9, map).equals(DATERANGE_CLASS_INTERSTITIALS)) {
                                                                            String stringAttr7 = parseStringAttr(next, REGEX_ID, map);
                                                                            String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_ASSET_URI, map);
                                                                            Uri uri = optionalStringAttr7 != null ? Uri.parse(optionalStringAttr7) : null;
                                                                            String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_ASSET_LIST_URI, map);
                                                                            Uri uri2 = optionalStringAttr8 != null ? Uri.parse(optionalStringAttr8) : null;
                                                                            long jMsToUs2 = Util.msToUs(Util.parseXsDateTime(parseStringAttr(next, REGEX_START_DATE, map)));
                                                                            String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_END_DATE, map);
                                                                            long jMsToUs3 = optionalStringAttr9 != null ? Util.msToUs(Util.parseXsDateTime(optionalStringAttr9)) : -9223372036854775807L;
                                                                            ArrayList arrayList13 = new ArrayList();
                                                                            String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_CUE, map);
                                                                            arrayList2 = arrayList6;
                                                                            if (optionalStringAttr10 != null) {
                                                                                String[] strArrSplit4 = Util.split(optionalStringAttr10, ",");
                                                                                str2 = str9;
                                                                                int length = strArrSplit4.length;
                                                                                int i16 = 0;
                                                                                while (i16 < length) {
                                                                                    int i17 = i16;
                                                                                    strTrim = strArrSplit4[i16].trim();
                                                                                    strTrim.getClass();
                                                                                    switch (strTrim) {
                                                                                        case "PRE":
                                                                                        case "ONCE":
                                                                                        case "POST":
                                                                                            arrayList13.add(strTrim);
                                                                                            break;
                                                                                    }
                                                                                    i16 = i17 + 1;
                                                                                    length = i5;
                                                                                }
                                                                            } else {
                                                                                str2 = str9;
                                                                            }
                                                                            i3 = i15;
                                                                            double optionalDoubleAttr = parseOptionalDoubleAttr(next, REGEX_ATTR_DURATION_PREFIXED, -1.0d);
                                                                            long j23 = optionalDoubleAttr >= 0.0d ? (long) (optionalDoubleAttr * 1000000.0d) : -9223372036854775807L;
                                                                            double optionalDoubleAttr2 = parseOptionalDoubleAttr(next, REGEX_PLANNED_DURATION, -1.0d);
                                                                            long j24 = optionalDoubleAttr2 >= 0.0d ? (long) (optionalDoubleAttr2 * 1000000.0d) : -9223372036854775807L;
                                                                            boolean optionalBooleanAttribute4 = parseOptionalBooleanAttribute(next, REGEX_END_ON_NEXT, false);
                                                                            double optionalDoubleAttr3 = parseOptionalDoubleAttr(next, REGEX_RESUME_OFFSET, Double.MIN_VALUE);
                                                                            long j25 = optionalDoubleAttr3 != Double.MIN_VALUE ? (long) (optionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L;
                                                                            double optionalDoubleAttr4 = parseOptionalDoubleAttr(next, REGEX_PLAYOUT_LIMIT, -1.0d);
                                                                            long j26 = optionalDoubleAttr4 >= 0.0d ? (long) (optionalDoubleAttr4 * 1000000.0d) : -9223372036854775807L;
                                                                            ArrayList arrayList14 = new ArrayList();
                                                                            String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_SNAP, map);
                                                                            if (optionalStringAttr11 != null) {
                                                                                String[] strArrSplit5 = Util.split(optionalStringAttr11, ",");
                                                                                int length2 = strArrSplit5.length;
                                                                                arrayList3 = arrayList13;
                                                                                int i18 = 0;
                                                                                while (i18 < length2) {
                                                                                    int i19 = i18;
                                                                                    String strTrim2 = strArrSplit5[i18].trim();
                                                                                    strTrim2.getClass();
                                                                                    String[] strArr = strArrSplit5;
                                                                                    if (strTrim2.equals(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN) || strTrim2.equals(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT)) {
                                                                                        arrayList14.add(strTrim2);
                                                                                    }
                                                                                    i18 = i19 + 1;
                                                                                    strArrSplit5 = strArr;
                                                                                }
                                                                            } else {
                                                                                arrayList3 = arrayList13;
                                                                            }
                                                                            ArrayList arrayList15 = new ArrayList();
                                                                            String optionalStringAttr12 = parseOptionalStringAttr(next, REGEX_RESTRICT, map);
                                                                            if (optionalStringAttr12 != null) {
                                                                                String[] strArrSplit6 = Util.split(optionalStringAttr12, ",");
                                                                                int length3 = strArrSplit6.length;
                                                                                int i20 = 0;
                                                                                while (i20 < length3) {
                                                                                    ArrayList arrayList16 = arrayList14;
                                                                                    String strTrim3 = strArrSplit6[i20].trim();
                                                                                    strTrim3.getClass();
                                                                                    String[] strArr2 = strArrSplit6;
                                                                                    if (strTrim3.equals(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_JUMP) || strTrim3.equals(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP)) {
                                                                                        arrayList15.add(strTrim3);
                                                                                    }
                                                                                    i20++;
                                                                                    strArrSplit6 = strArr2;
                                                                                    arrayList14 = arrayList16;
                                                                                }
                                                                            }
                                                                            ArrayList arrayList17 = arrayList14;
                                                                            nKK.j jVar = new nKK.j();
                                                                            String strSubstring = next.substring(17);
                                                                            Matcher matcher = REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX.matcher(strSubstring);
                                                                            while (matcher.find()) {
                                                                                String strGroup = matcher.group();
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case -2136701954:
                                                                                        b2 = strGroup.equals("X-SNAP=") ? (byte) 0 : (byte) -1;
                                                                                        break;
                                                                                    case -148960310:
                                                                                        if (strGroup.equals("X-PLAYOUT-LIMIT=")) {
                                                                                            b2 = 1;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 397239341:
                                                                                        if (strGroup.equals("X-ASSET-LIST=")) {
                                                                                            b2 = 2;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1472528844:
                                                                                        if (strGroup.equals("X-RESTRICT=")) {
                                                                                            b2 = 3;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1748487807:
                                                                                        if (strGroup.equals(LHbnkhI.tbaXbJPjkppfHU)) {
                                                                                            b2 = 4;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1814205923:
                                                                                        if (strGroup.equals("X-ASSET-URI=")) {
                                                                                            b2 = 5;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                switch (b2) {
                                                                                    case 0:
                                                                                    case 1:
                                                                                    case 2:
                                                                                    case 3:
                                                                                    case 4:
                                                                                    case 5:
                                                                                        arrayList4 = arrayList15;
                                                                                        break;
                                                                                    default:
                                                                                        arrayList4 = arrayList15;
                                                                                        jVar.n(parseClientDefinedAttribute(strSubstring, strGroup.substring(0, strGroup.length() - 1), map));
                                                                                        break;
                                                                                }
                                                                                arrayList15 = arrayList4;
                                                                            }
                                                                            ArrayList arrayList18 = arrayList15;
                                                                            if ((uri2 != null || uri == null) && (uri2 == null || uri != null)) {
                                                                                arrayList = arrayList12;
                                                                            } else {
                                                                                arrayList = arrayList12;
                                                                                arrayList.add(new HlsMediaPlaylist.Interstitial(stringAttr7, uri, uri2, jMsToUs2, jMsToUs3, j23, j24, arrayList3, optionalBooleanAttribute4, j25, j26, arrayList17, arrayList18, jVar.gh()));
                                                                            }
                                                                            j5 = j7;
                                                                            drmInitData2 = drmInitData;
                                                                            i2 = i3;
                                                                            j2 = j9;
                                                                            str3 = optionalStringAttr;
                                                                            arrayList6 = arrayList2;
                                                                            j4 = timeSecondsToUs;
                                                                            str5 = str6;
                                                                            drmInitData6 = drmInitData2;
                                                                            longAttr = j3;
                                                                            optionalStringAttr = str3;
                                                                            timeSecondsToUs = j4;
                                                                            j9 = j2;
                                                                            treeMap2 = treeMap;
                                                                            j7 = j5;
                                                                            segment3 = segment;
                                                                            str4 = str2;
                                                                            optionalBooleanAttribute = z2;
                                                                            serverControl = serverControl2;
                                                                            j14 = -1;
                                                                            part2 = part;
                                                                            arrayList9 = arrayList;
                                                                            stringAttr = str7;
                                                                            i9 = i2;
                                                                            arrayList8 = arrayList10;
                                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                        } else {
                                                                            str2 = str9;
                                                                            arrayList2 = arrayList6;
                                                                            i3 = i15;
                                                                            arrayList = arrayList12;
                                                                        }
                                                                    } else {
                                                                        segment = segment7;
                                                                        str2 = str9;
                                                                        arrayList2 = arrayList6;
                                                                        arrayList = arrayList12;
                                                                        i3 = i15;
                                                                    }
                                                                    if (next.startsWith("#")) {
                                                                        j5 = j7;
                                                                        drmInitData2 = drmInitData;
                                                                        i2 = i3;
                                                                        j2 = j9;
                                                                        str3 = optionalStringAttr;
                                                                        arrayList6 = arrayList2;
                                                                        j4 = timeSecondsToUs;
                                                                        str5 = str6;
                                                                        drmInitData6 = drmInitData2;
                                                                        longAttr = j3;
                                                                        optionalStringAttr = str3;
                                                                        timeSecondsToUs = j4;
                                                                        j9 = j2;
                                                                        treeMap2 = treeMap;
                                                                        j7 = j5;
                                                                        segment3 = segment;
                                                                        str4 = str2;
                                                                        optionalBooleanAttribute = z2;
                                                                        serverControl = serverControl2;
                                                                        j14 = -1;
                                                                        part2 = part;
                                                                        arrayList9 = arrayList;
                                                                        stringAttr = str7;
                                                                        i9 = i2;
                                                                        arrayList8 = arrayList10;
                                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                    } else {
                                                                        int i21 = i3;
                                                                        long j27 = j9;
                                                                        String segmentEncryptionIV3 = getSegmentEncryptionIV(j3, str7, str6);
                                                                        longAttr = j3 + 1;
                                                                        String strReplaceVariableReferences = replaceVariableReferences(next, map);
                                                                        HlsMediaPlaylist.Segment segment8 = (HlsMediaPlaylist.Segment) map2.get(strReplaceVariableReferences);
                                                                        if (j13 == -1) {
                                                                            segment2 = segment8;
                                                                            j7 = 0;
                                                                        } else if (z9 && segment == null && segment8 == null) {
                                                                            HlsMediaPlaylist.Segment segment9 = new HlsMediaPlaylist.Segment(strReplaceVariableReferences, 0L, j7, null, null);
                                                                            map2.put(strReplaceVariableReferences, segment9);
                                                                            segment2 = segment9;
                                                                        } else {
                                                                            segment2 = segment8;
                                                                            j7 = j7;
                                                                        }
                                                                        if (drmInitData != null || treeMap.isEmpty()) {
                                                                            z3 = false;
                                                                            drmInitData5 = drmInitData;
                                                                        } else {
                                                                            z3 = false;
                                                                            DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                            DrmInitData drmInitData12 = new DrmInitData(encryptionScheme, schemeDataArr3);
                                                                            if (playlistProtectionSchemes2 == null) {
                                                                                playlistProtectionSchemes = getPlaylistProtectionSchemes(encryptionScheme, schemeDataArr3);
                                                                                drmInitData5 = drmInitData12;
                                                                                long j28 = j7;
                                                                                long j29 = timeSecondsToUs;
                                                                                arrayList5.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment == null ? segment : segment2, optionalStringAttr, j29, i21, j27, drmInitData5, str7, segmentEncryptionIV3, j28, j13, z7, arrayList2));
                                                                                j10 = j27 + j29;
                                                                                arrayList6 = new ArrayList();
                                                                                j7 = j13 == -1 ? j28 + j13 : j28;
                                                                                arrayList9 = arrayList;
                                                                                str5 = str6;
                                                                                playlistProtectionSchemes2 = playlistProtectionSchemes;
                                                                                z7 = z3;
                                                                                i9 = i21;
                                                                                drmInitData6 = drmInitData5;
                                                                                timeSecondsToUs = 0;
                                                                                treeMap2 = treeMap;
                                                                                j9 = j10;
                                                                                segment3 = segment;
                                                                                str4 = str2;
                                                                                optionalStringAttr = str4;
                                                                                optionalBooleanAttribute = z2;
                                                                                serverControl = serverControl2;
                                                                                j13 = -1;
                                                                                j14 = -1;
                                                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                                part2 = part;
                                                                                stringAttr = str7;
                                                                                arrayList8 = arrayList10;
                                                                            } else {
                                                                                drmInitData5 = drmInitData12;
                                                                            }
                                                                        }
                                                                        playlistProtectionSchemes = playlistProtectionSchemes2;
                                                                        long j282 = j7;
                                                                        long j292 = timeSecondsToUs;
                                                                        arrayList5.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment == null ? segment : segment2, optionalStringAttr, j292, i21, j27, drmInitData5, str7, segmentEncryptionIV3, j282, j13, z7, arrayList2));
                                                                        j10 = j27 + j292;
                                                                        arrayList6 = new ArrayList();
                                                                        if (j13 == -1) {
                                                                        }
                                                                        arrayList9 = arrayList;
                                                                        str5 = str6;
                                                                        playlistProtectionSchemes2 = playlistProtectionSchemes;
                                                                        z7 = z3;
                                                                        i9 = i21;
                                                                        drmInitData6 = drmInitData5;
                                                                        timeSecondsToUs = 0;
                                                                        treeMap2 = treeMap;
                                                                        j9 = j10;
                                                                        segment3 = segment;
                                                                        str4 = str2;
                                                                        optionalStringAttr = str4;
                                                                        optionalBooleanAttribute = z2;
                                                                        serverControl = serverControl2;
                                                                        j13 = -1;
                                                                        j14 = -1;
                                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                        part2 = part;
                                                                        stringAttr = str7;
                                                                        arrayList8 = arrayList10;
                                                                    }
                                                                }
                                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            }
                                                        }
                                                        str4 = str9;
                                                        serverControl = serverControl2;
                                                    } else if (jMsToUs == 0) {
                                                        jMsToUs = Util.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j9;
                                                    } else {
                                                        str2 = str9;
                                                    }
                                                    arrayList = arrayList12;
                                                    drmInitData2 = drmInitData;
                                                }
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                str5 = str6;
                                                stringAttr = str7;
                                                arrayList9 = arrayList12;
                                                drmInitData6 = drmInitData;
                                            }
                                            optionalBooleanAttribute = z2;
                                            arrayList8 = arrayList10;
                                            str4 = str9;
                                            serverControl = serverControl2;
                                        }
                                        str4 = str9;
                                    }
                                    j2 = j9;
                                    str3 = optionalStringAttr;
                                    part = part2;
                                    segment = segment3;
                                    i2 = i9;
                                    j3 = longAttr;
                                    j4 = timeSecondsToUs;
                                    treeMap = treeMap2;
                                    j5 = j7;
                                    str5 = str6;
                                    drmInitData6 = drmInitData2;
                                    longAttr = j3;
                                    optionalStringAttr = str3;
                                    timeSecondsToUs = j4;
                                    j9 = j2;
                                    treeMap2 = treeMap;
                                    j7 = j5;
                                    segment3 = segment;
                                    str4 = str2;
                                    optionalBooleanAttribute = z2;
                                    serverControl = serverControl2;
                                    j14 = -1;
                                    part2 = part;
                                    arrayList9 = arrayList;
                                    stringAttr = str7;
                                    i9 = i2;
                                    arrayList8 = arrayList10;
                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                }
                            }
                            str5 = str6;
                            stringAttr = str7;
                            drmInitData6 = drmInitData;
                            optionalBooleanAttribute = z2;
                            arrayList8 = arrayList10;
                            serverControl = serverControl2;
                        }
                    }
                    optionalBooleanAttribute = z2;
                }
            }
        }
        boolean z11 = optionalBooleanAttribute;
        ArrayList arrayList19 = arrayList8;
        ArrayList arrayList20 = arrayList9;
        HlsMediaPlaylist.ServerControl serverControl3 = serverControl;
        HlsMediaPlaylist.Part part3 = part2;
        HashMap map3 = new HashMap();
        for (int i22 = 0; i22 < arrayList7.size(); i22++) {
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList7.get(i22);
            long size = renditionReport.lastMediaSequence;
            if (size == -1) {
                size = (j15 + ((long) arrayList5.size())) - (arrayList6.isEmpty() ? 1L : 0L);
            }
            int size2 = renditionReport.lastPartIndex;
            if (size2 == -1 && doubleAttr != -9223372036854775807L) {
                size2 = (arrayList6.isEmpty() ? ((HlsMediaPlaylist.Segment) lej.nr(arrayList5)).parts : arrayList6).size() - 1;
            }
            Uri uri3 = renditionReport.playlistUri;
            map3.put(uri3, new HlsMediaPlaylist.RenditionReport(uri3, size, size2));
        }
        if (part3 != null) {
            arrayList6.add(part3);
        }
        return new HlsMediaPlaylist(i7, str, arrayList19, j12, z11, jMsToUs, z6, i8, j15, intAttr2, intAttr, doubleAttr, z5, z10, jMsToUs != 0, playlistProtectionSchemes2, arrayList5, arrayList6, serverControl3, map3, arrayList20);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:111:0x037e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws IOException {
        String str2;
        String stringAttr;
        String stringAttr2;
        Format.Builder language;
        Uri uriResolveToUri;
        Metadata metadata;
        ArrayList arrayList;
        ArrayList arrayList2;
        String mediaMimeType;
        ArrayList arrayList3;
        int i2;
        String str3;
        ArrayList arrayList4;
        HlsMultivariantPlaylist.Variant variant;
        String mediaMimeType2;
        int i3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str4;
        int i5;
        String str5;
        String codecsOfType;
        String optionalStringAttr;
        Uri uriResolveToUri2;
        String str6 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z2 = false;
        boolean zContains = false;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList18.add(next);
            }
            boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            if (next.startsWith(TAG_DEFINE)) {
                map2.put(parseStringAttr(next, REGEX_NAME, map2), parseStringAttr(next, REGEX_VALUE, map2));
            } else {
                if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList10 = arrayList16;
                    arrayList5 = arrayList17;
                    arrayList6 = arrayList18;
                    z2 = true;
                } else if (next.startsWith(TAG_MEDIA)) {
                    arrayList16.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map2), map2);
                    if (drmSchemeData != null) {
                        arrayList17.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map2)), drmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                    zContains |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i7 = zStartsWith ? 16384 : 0;
                    int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                    boolean z3 = z2;
                    arrayList5 = arrayList17;
                    int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                    String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_VIDEO_RANGE, map2);
                    arrayList6 = arrayList18;
                    String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_CODECS, map2);
                    arrayList7 = arrayList14;
                    String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_SUPPLEMENTAL_CODECS, map2);
                    arrayList8 = arrayList13;
                    if (optionalStringAttr4 != null) {
                        String[] strArrSplit = Util.split(Util.splitAtFirst(optionalStringAttr4, ",")[0], "/");
                        String str7 = strArrSplit[0];
                        if (strArrSplit.length > 1) {
                            str5 = strArrSplit[1];
                            arrayList9 = arrayList12;
                            arrayList10 = arrayList16;
                            str4 = str7;
                            i5 = 2;
                            codecsOfType = Util.getCodecsOfType(optionalStringAttr3, i5);
                            if (isDolbyVisionFormat(optionalStringAttr2, codecsOfType, str4, str5)) {
                                if (str4 == null) {
                                    str4 = codecsOfType;
                                }
                                String codecsWithoutType = Util.getCodecsWithoutType(optionalStringAttr3, i5);
                                if (codecsWithoutType != null) {
                                    str4 = str4 + "," + codecsWithoutType;
                                }
                                optionalStringAttr3 = str4;
                            }
                            optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map2);
                            if (optionalStringAttr == null) {
                                String[] strArrSplit2 = Util.split(optionalStringAttr, "x");
                                int i8 = Integer.parseInt(strArrSplit2[0]);
                                int i9 = Integer.parseInt(strArrSplit2[1]);
                                if (i8 <= 0 || i9 <= 0) {
                                    i9 = -1;
                                    i8 = -1;
                                }
                                String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map2);
                                float f3 = optionalStringAttr5 != null ? Float.parseFloat(optionalStringAttr5) : -1.0f;
                                String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_VIDEO, map2);
                                String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_AUDIO, map2);
                                String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map2);
                                String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map2);
                                if (zStartsWith) {
                                    uriResolveToUri2 = UriUtil.resolveToUri(str6, parseStringAttr(next, REGEX_URI, map2));
                                } else {
                                    if (!lineIterator.hasNext()) {
                                        throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                                    }
                                    uriResolveToUri2 = UriUtil.resolveToUri(str6, replaceVariableReferences(lineIterator.next(), map2));
                                }
                                Uri uri = uriResolveToUri2;
                                arrayList11.add(new HlsMultivariantPlaylist.Variant(uri, new Format.Builder().setId(arrayList11.size()).setContainerMimeType("application/x-mpegURL").setCodecs(optionalStringAttr3).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i8).setHeight(i9).setFrameRate(f3).setRoleFlags(i7).build(), optionalStringAttr6, optionalStringAttr7, optionalStringAttr8, optionalStringAttr9));
                                ArrayList arrayList19 = (ArrayList) map.get(uri);
                                if (arrayList19 == null) {
                                    arrayList19 = new ArrayList();
                                    map.put(uri, arrayList19);
                                }
                                arrayList19.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr6, optionalStringAttr7, optionalStringAttr8, optionalStringAttr9));
                                z2 = z3;
                            }
                        } else {
                            arrayList9 = arrayList12;
                            arrayList10 = arrayList16;
                            str4 = str7;
                        }
                    } else {
                        arrayList9 = arrayList12;
                        arrayList10 = arrayList16;
                        str4 = null;
                    }
                    i5 = 2;
                    str5 = null;
                    codecsOfType = Util.getCodecsOfType(optionalStringAttr3, i5);
                    if (isDolbyVisionFormat(optionalStringAttr2, codecsOfType, str4, str5)) {
                    }
                    optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map2);
                    if (optionalStringAttr == null) {
                    }
                }
                arrayList17 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
            }
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList10 = arrayList16;
            arrayList5 = arrayList17;
            arrayList6 = arrayList18;
            arrayList17 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
        }
        ArrayList arrayList20 = arrayList12;
        ArrayList arrayList21 = arrayList13;
        ArrayList arrayList22 = arrayList14;
        boolean z4 = z2;
        ArrayList arrayList23 = arrayList16;
        ArrayList arrayList24 = arrayList17;
        ArrayList arrayList25 = arrayList18;
        ArrayList arrayList26 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList11.size()) {
            HlsMultivariantPlaylist.Variant variant2 = (HlsMultivariantPlaylist.Variant) arrayList11.get(i10);
            if (hashSet.add(variant2.url)) {
                Assertions.checkState(variant2.format.metadata == null);
                i3 = 1;
                arrayList26.add(variant2.copyWithFormat(variant2.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) map.get(variant2.url))))).build()));
            } else {
                i3 = 1;
            }
            i10 += i3;
        }
        ArrayList arrayList27 = null;
        Format formatBuild = null;
        int i11 = 0;
        while (i11 < arrayList23.size()) {
            ArrayList arrayList28 = arrayList23;
            str2 = (String) arrayList28.get(i11);
            stringAttr = parseStringAttr(str2, REGEX_GROUP_ID, map2);
            stringAttr2 = parseStringAttr(str2, REGEX_NAME, map2);
            language = new Format.Builder().setId(stringAttr + ":" + stringAttr2).setLabel(stringAttr2).setContainerMimeType("application/x-mpegURL").setSelectionFlags(parseSelectionFlags(str2)).setRoleFlags(parseRoleFlags(str2, map2)).setLanguage(parseOptionalStringAttr(str2, REGEX_LANGUAGE, map2));
            String optionalStringAttr10 = parseOptionalStringAttr(str2, REGEX_URI, map2);
            uriResolveToUri = optionalStringAttr10 == null ? null : UriUtil.resolveToUri(str6, optionalStringAttr10);
            arrayList = arrayList27;
            metadata = new Metadata(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.EMPTY_LIST));
            String stringAttr3 = parseStringAttr(str2, REGEX_TYPE, map2);
            stringAttr3.getClass();
            switch (stringAttr3) {
                case "SUBTITLES":
                    arrayList2 = arrayList21;
                    HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList11, stringAttr);
                    if (variantWithSubtitleGroup != null) {
                        String codecsOfType2 = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                        language.setCodecs(codecsOfType2);
                        mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType2);
                    } else {
                        mediaMimeType = null;
                    }
                    if (mediaMimeType == null) {
                        mediaMimeType = "text/vtt";
                    }
                    language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                    if (uriResolveToUri != null) {
                        HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(uriResolveToUri, language.build(), stringAttr, stringAttr2);
                        arrayList3 = arrayList22;
                        arrayList3.add(rendition);
                    } else {
                        arrayList3 = arrayList22;
                        Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                    }
                    arrayList4 = arrayList;
                    break;
                case "CLOSED-CAPTIONS":
                    arrayList2 = arrayList21;
                    String stringAttr4 = parseStringAttr(str2, REGEX_INSTREAM_ID, map2);
                    if (stringAttr4.startsWith("CC")) {
                        i2 = Integer.parseInt(stringAttr4.substring(2));
                        str3 = "application/cea-608";
                    } else {
                        i2 = Integer.parseInt(stringAttr4.substring(7));
                        str3 = "application/cea-708";
                    }
                    arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                    language.setSampleMimeType(str3).setAccessibilityChannel(i2);
                    arrayList4.add(language.build());
                    arrayList3 = arrayList22;
                    break;
                case "AUDIO":
                    ArrayList arrayList29 = arrayList20;
                    HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList11, stringAttr);
                    if (variantWithAudioGroup != null) {
                        arrayList20 = arrayList29;
                        variant = variantWithAudioGroup;
                        String codecsOfType3 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                        language.setCodecs(codecsOfType3);
                        mediaMimeType2 = MimeTypes.getMediaMimeType(codecsOfType3);
                    } else {
                        variant = variantWithAudioGroup;
                        arrayList20 = arrayList29;
                        mediaMimeType2 = null;
                    }
                    String optionalStringAttr11 = parseOptionalStringAttr(str2, REGEX_CHANNELS, map2);
                    if (optionalStringAttr11 != null) {
                        language.setChannelCount(Integer.parseInt(Util.splitAtFirst(optionalStringAttr11, "/")[0]));
                        if ("audio/eac3".equals(mediaMimeType2) && optionalStringAttr11.endsWith("/JOC")) {
                            language.setCodecs("ec+3");
                            mediaMimeType2 = "audio/eac3-joc";
                        }
                    }
                    language.setSampleMimeType(mediaMimeType2);
                    if (uriResolveToUri == null) {
                        arrayList2 = arrayList21;
                        if (variant != null) {
                            arrayList4 = arrayList;
                            formatBuild = language.build();
                            arrayList3 = arrayList22;
                        }
                        break;
                    } else {
                        language.setMetadata(metadata);
                        arrayList2 = arrayList21;
                        arrayList2.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri, language.build(), stringAttr, stringAttr2));
                    }
                    arrayList3 = arrayList22;
                    arrayList4 = arrayList;
                    break;
                case "VIDEO":
                    HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList11, stringAttr);
                    if (variantWithVideoGroup != null) {
                        Format format = variantWithVideoGroup.format;
                        String codecsOfType4 = Util.getCodecsOfType(format.codecs, 2);
                        language.setCodecs(codecsOfType4).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType4)).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
                    }
                    if (uriResolveToUri != null) {
                        language.setMetadata(metadata);
                        arrayList20.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri, language.build(), stringAttr, stringAttr2));
                        break;
                    }
                default:
                    arrayList3 = arrayList22;
                    arrayList2 = arrayList21;
                    arrayList4 = arrayList;
                    break;
            }
            i11++;
            str6 = str;
            arrayList21 = arrayList2;
            arrayList23 = arrayList28;
            arrayList22 = arrayList3;
            arrayList27 = arrayList4;
        }
        return new HlsMultivariantPlaylist(str, arrayList25, arrayList26, arrayList20, arrayList21, arrayList22, arrayList15, formatBuild, zContains ? Collections.EMPTY_LIST : arrayList27, z4, map2, arrayList24);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        String[] strArrSplit = Util.split(optionalStringAttr, ",");
        int i2 = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r02 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r02 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r02 | 4 : r02;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j2 = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j3 = optionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr2 * 1000000.0d);
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        return new HlsMediaPlaylist.ServerControl(j2, optionalBooleanAttribute, j3, optionalDoubleAttr3 != -9.223372036854776E18d ? (long) (optionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith(TAG_STREAM_INF)) {
                        if (strTrim.startsWith(TAG_TARGET_DURATION) || strTrim.startsWith(TAG_MEDIA_SEQUENCE) || strTrim.startsWith(TAG_MEDIA_DURATION) || strTrim.startsWith(TAG_KEY) || strTrim.startsWith(TAG_BYTERANGE) || strTrim.equals(TAG_DISCONTINUITY) || strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) || strTrim.equals(TAG_ENDLIST)) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
        } finally {
            Util.closeQuietly(bufferedReader);
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int i2 = bufferedReader.read();
        if (i2 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i2 = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i2);
        for (int i3 = 0; i3 < 7; i3++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i3)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static boolean isDolbyVisionFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (!MimeTypes.isDolbyVisionCodec(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        if ((str.equals("PQ") && !str4.equals("db1p")) || ((str.equals("SDR") && !str4.equals("db2g")) || (str.equals("HLG") && !str4.startsWith("db4")))) {
            return false;
        }
        return true;
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return BOOLEAN_TRUE.equals(matcher.group(1));
        }
        return z2;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return d2;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return i2;
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return j2;
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }
}
