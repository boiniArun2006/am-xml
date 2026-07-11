package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.google.android.exoplayer2.metadata.id3.j
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i2, int i3, int i5, int i7, int i8) {
            return Id3Decoder.n(i2, i3, i5, i7, i8);
        }
    };
    private static final String TAG = "Id3Decoder";

    @Nullable
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i2, int i3, int i5, int i7, int i8);
    }

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f57981n;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f57982t;

        public j(int i2, boolean z2, int i3) {
            this.f57981n = i2;
            this.rl = z2;
            this.f57982t = i3;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        parsableByteArray.readBytes(bArr2, 0, i3);
        int iIndexOfEos = indexOfEos(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfEos(bArr2, iDelimiterLength, unsignedByte), charsetName));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0214 A[Catch: all -> 0x01f5, UnsupportedEncodingException -> 0x0238, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0238, blocks: (B:174:0x0214, B:162:0x01f0, B:171:0x0205, B:172:0x020a), top: B:185:0x010b }] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [com.google.android.exoplayer2.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Id3Frame decodeFrame(int i2, ParsableByteArray parsableByteArray, boolean z2, int i3, @Nullable FramePredicate framePredicate) throws Throwable {
        int unsignedIntToInt;
        ?? r12;
        int i5;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        ?? r15;
        boolean z5;
        ?? r16;
        ?? r13;
        int i9;
        int i10;
        int i11;
        Id3Frame id3FrameDecodeBinaryFrame;
        ?? r8;
        ?? r82;
        ParsableByteArray parsableByteArray2;
        ?? r162;
        int i12 = i2;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        int unsignedByte4 = i12 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i12 == 4) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (!z2) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i12 == 3 ? parsableByteArray.readUnsignedIntToInt() : parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i12 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            boolean zEvaluate = framePredicate.evaluate(i12, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            i12 = i12;
            r12 = unsignedByte2;
            i5 = unsignedByte;
            i7 = unsignedByte3;
            i8 = unsignedByte4;
            if (!zEvaluate) {
                parsableByteArray.setPosition(position);
                return null;
            }
        } else {
            r12 = unsignedByte2;
            i5 = unsignedByte;
            i7 = unsignedByte3;
            i8 = unsignedByte4;
        }
        if (i12 == 3) {
            z3 = (unsignedShort & 128) != 0;
            boolean z6 = (unsignedShort & 64) != 0;
            z5 = false;
            z = z3;
            z4 = (unsignedShort & 32) != 0;
            r15 = z6;
        } else if (i12 == 4) {
            boolean z7 = (unsignedShort & 64) != 0;
            boolean z9 = (unsignedShort & 8) != 0;
            r16 = (unsignedShort & 4) != 0 ? 1 : 0;
            boolean z10 = (unsignedShort & 2) != 0;
            z = (unsignedShort & 1) != 0;
            z4 = z7;
            z3 = z;
            z = z9;
            r15 = r16;
            z5 = z10;
        } else {
            z3 = false;
            z4 = false;
            r15 = 0;
            z5 = false;
        }
        if (z || r15 != 0) {
            Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(position);
            return null;
        }
        if (z4) {
            iRemoveUnsynchronization--;
            parsableByteArray.skipBytes(1);
        }
        if (z3) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z5) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            try {
                try {
                    try {
                        if (i5 == 84 && r12 == 88 && i7 == 88 && (i12 == 2 || i8 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else if (i5 == 84) {
                            id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i12, i5, r12, i7, i8));
                        } else if (i5 == 87 && r12 == 88 && i7 == 88 && (i12 == 2 || i8 == 88)) {
                            id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else if (i5 == 87) {
                            id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i12, i5, r12, i7, i8));
                        } else if (i5 == 80 && r12 == 82 && i7 == 73 && i8 == 86) {
                            id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else if (i5 == 71 && r12 == 69 && i7 == 79 && (i8 == 66 || i12 == 2)) {
                            id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else {
                            r16 = 0;
                            try {
                                if (i12 != 2 ? i5 == 65 && r12 == 80 && i7 == 73 && i8 == 67 : i5 == 80 && r12 == 73 && i7 == 67) {
                                    id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i12);
                                } else {
                                    if (i5 != 67 || r12 != 79 || i7 != 77 || (i8 != 77 && i12 != 2)) {
                                        if (i5 == 67 && r12 == 72 && i7 == 65 && i8 == 80) {
                                            r8 = r12;
                                            i9 = i7;
                                            i10 = iRemoveUnsynchronization;
                                            i11 = i8;
                                            try {
                                                id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray, i10, i12, z2, i3, framePredicate);
                                                i12 = i2;
                                                r12 = parsableByteArray;
                                                r16 = r16;
                                            } catch (UnsupportedEncodingException unused) {
                                                r12 = parsableByteArray;
                                                Log.w(TAG, "Unsupported character encoding");
                                                r12.setPosition(position);
                                                return r16;
                                            } catch (Throwable th) {
                                                th = th;
                                                r13 = parsableByteArray;
                                                r13.setPosition(position);
                                                throw th;
                                            }
                                        } else {
                                            ?? r83 = r12;
                                            i9 = i7;
                                            i10 = iRemoveUnsynchronization;
                                            i11 = i8;
                                            if (i5 == 67 && r83 == 84 && i9 == 79 && i11 == 67) {
                                                i12 = i2;
                                                ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray3, i10, i12, z2, i3, framePredicate);
                                                r12 = parsableByteArray3;
                                                r8 = r83;
                                                r16 = r16;
                                            } else {
                                                i12 = i2;
                                                ParsableByteArray parsableByteArray4 = parsableByteArray;
                                                if (i5 == 77 && r83 == 76 && i9 == 76 && i11 == 84) {
                                                    id3FrameDecodeBinaryFrame = decodeMlltFrame(parsableByteArray4, i10);
                                                    r12 = parsableByteArray4;
                                                    r8 = r83;
                                                    r16 = r16;
                                                } else {
                                                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray4, i10, getFrameId(i12, i5, r83 == true ? 1 : 0, i9, i11));
                                                    r12 = parsableByteArray4;
                                                    r8 = r83;
                                                    r16 = r16;
                                                }
                                            }
                                        }
                                        if (id3FrameDecodeBinaryFrame == null) {
                                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i12, i5, r8, i9, i11) + ", frameSize=" + i10);
                                        }
                                        r12.setPosition(position);
                                        return id3FrameDecodeBinaryFrame;
                                    }
                                    id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
                                }
                                r82 = r12;
                                i9 = i7;
                                parsableByteArray2 = parsableByteArray;
                                i10 = iRemoveUnsynchronization;
                                r162 = r16;
                                i11 = i8;
                                r12 = parsableByteArray2;
                                r8 = r82;
                                r16 = r162;
                                if (id3FrameDecodeBinaryFrame == null) {
                                }
                                r12.setPosition(position);
                                return id3FrameDecodeBinaryFrame;
                            } catch (UnsupportedEncodingException unused2) {
                                r12 = parsableByteArray;
                            }
                        }
                        r82 = r12;
                        i9 = i7;
                        parsableByteArray2 = parsableByteArray;
                        i10 = iRemoveUnsynchronization;
                        r162 = 0;
                        i11 = i8;
                        r12 = parsableByteArray2;
                        r8 = r82;
                        r16 = r162;
                        if (id3FrameDecodeBinaryFrame == null) {
                        }
                        r12.setPosition(position);
                        return id3FrameDecodeBinaryFrame;
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = parsableByteArray;
                    }
                } catch (UnsupportedEncodingException unused3) {
                }
            } catch (Throwable th3) {
                th = th3;
                r13 = r12;
            }
        } catch (UnsupportedEncodingException unused4) {
            r12 = parsableByteArray;
            r16 = 0;
        }
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i2, String str) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, unsignedByte), charsetName));
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfEos(bArr, iDelimiterLength, unsignedByte), charsetName));
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfEos = indexOfEos(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), C.ISO88591_NAME));
    }

    private static int delimiterLength(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static String getCharsetName(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? C.ISO88591_NAME : C.UTF8_NAME : "UTF-16BE" : C.UTF16_NAME;
    }

    private static String getFrameId(int i2, int i3, int i5, int i7, int i8) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    private static int indexOfZeroByte(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean n(int i2, int i3, int i5, int i7, int i8) {
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i2, i3);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i2, String str) {
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i5, @Nullable FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, C.ISO88591_NAME);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z3 = (unsignedByte & 2) != 0;
        boolean z4 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i7 = 0; i7 < unsignedByte2; i7++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i7] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, C.ISO88591_NAME);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = position + i2;
        while (parsableByteArray.getPosition() < i8) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i3, parsableByteArray, z2, i5, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z3, z4, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, C.ISO88591_NAME), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i2));
    }

    private static String decodeStringIfValid(byte[] bArr, int i2, int i3, String str) throws UnsupportedEncodingException {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i2, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), C.ISO88591_NAME));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2) {
        int unsignedInt24;
        long unsignedInt242;
        int unsignedShort;
        int i5;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z3 = true;
                if (parsableByteArray.bytesLeft() < i3) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i2 >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt242 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt242 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt242 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i2 == 4 && !z2) {
                    if ((8421504 & unsignedInt242) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt242 = (((unsignedInt242 >> 24) & 255) << 21) | (unsignedInt242 & 255) | (((unsignedInt242 >> 8) & 255) << 7) | (((unsignedInt242 >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i5 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z3 = false;
                    }
                } else if (i2 == 3) {
                    i5 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                    }
                } else {
                    i5 = 0;
                    z3 = false;
                }
                if (z3) {
                    i5 += 4;
                }
                if (unsignedInt242 < i5) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt242) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt242);
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    @Nullable
    public Metadata decode(byte[] bArr, int i2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i2);
        j jVarDecodeHeader = decodeHeader(parsableByteArray);
        if (jVarDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i3 = jVarDecodeHeader.f57981n == 2 ? 6 : 10;
        int iRemoveUnsynchronization = jVarDecodeHeader.f57982t;
        if (jVarDecodeHeader.rl) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, jVarDecodeHeader.f57982t);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z2 = false;
        if (!validateFrames(parsableByteArray, jVarDecodeHeader.f57981n, i3, false)) {
            if (jVarDecodeHeader.f57981n != 4 || !validateFrames(parsableByteArray, 4, i3, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + jVarDecodeHeader.f57981n);
                return null;
            }
            z2 = true;
        }
        while (parsableByteArray.bytesLeft() >= i3) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(jVarDecodeHeader.f57981n, parsableByteArray, z2, i3, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i2, int i3) throws UnsupportedEncodingException {
        int iIndexOfZeroByte;
        String strO;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i5 = i2 - 1;
        byte[] bArr = new byte[i5];
        parsableByteArray.readBytes(bArr, 0, i5);
        if (i3 == 2) {
            strO = "image/" + AbstractC2372w6.O(new String(bArr, 0, 3, C.ISO88591_NAME));
            if ("image/jpg".equals(strO)) {
                strO = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            strO = AbstractC2372w6.O(new String(bArr, 0, iIndexOfZeroByte, C.ISO88591_NAME));
            if (strO.indexOf(47) == -1) {
                strO = "image/" + strO;
            }
        }
        int i7 = bArr[iIndexOfZeroByte + 1] & UByte.MAX_VALUE;
        int i8 = iIndexOfZeroByte + 2;
        int iIndexOfEos = indexOfEos(bArr, i8, unsignedByte);
        return new ApicFrame(strO, new String(bArr, i8, iIndexOfEos - i8, charsetName), i7, copyOfRangeIfValid(bArr, iIndexOfEos + delimiterLength(unsignedByte), i5));
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i5, @Nullable FramePredicate framePredicate) throws Throwable {
        long j2;
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, C.ISO88591_NAME);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        if (unsignedInt2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = unsignedInt2;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = position + i2;
        while (parsableByteArray.getPosition() < i9) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i3, parsableByteArray, z2, i5, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i7, i8, unsignedInt, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(unsignedByte);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, iIndexOfZeroByte, C.ISO88591_NAME);
        int i5 = iIndexOfZeroByte + 1;
        int iIndexOfEos = indexOfEos(bArr, i5, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i5, iIndexOfEos, charsetName);
        int iDelimiterLength = iIndexOfEos + delimiterLength(unsignedByte);
        int iIndexOfEos2 = indexOfEos(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(str, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfEos2, charsetName), copyOfRangeIfValid(bArr, iIndexOfEos2 + delimiterLength(unsignedByte), i3));
    }

    @Nullable
    private static j decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = true;
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i2 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i2);
                synchSafeInt -= i2 + 4;
            }
        } else if (unsignedByte == 4) {
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        } else {
            Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
            return null;
        }
        if (unsignedByte >= 4 || (unsignedByte2 & 128) == 0) {
            z2 = false;
        }
        return new j(unsignedByte, z2, synchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i2) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt242 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i3 = ((i2 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i5] = bits;
            iArr2[i5] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    private static int indexOfEos(byte[] bArr, int i2, int i3) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i2);
        if (i3 != 0 && i3 != 3) {
            while (iIndexOfZeroByte < bArr.length - 1) {
                if ((iIndexOfZeroByte - i2) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                    return iIndexOfZeroByte;
                }
                iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
            }
            return bArr.length;
        }
        return iIndexOfZeroByte;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i2) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i3 = position;
        while (true) {
            int i5 = i3 + 1;
            if (i5 < position + i2) {
                if ((data[i3] & UByte.MAX_VALUE) == 255 && data[i5] == 0) {
                    System.arraycopy(data, i3 + 2, data, i5, (i2 - (i3 - position)) - 2);
                    i2--;
                }
                i3 = i5;
            } else {
                return i2;
            }
        }
    }
}
