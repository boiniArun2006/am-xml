package androidx.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.common.collect.nKK;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@UnstableApi
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
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: androidx.media3.extractor.metadata.id3.j
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i2, int i3, int i5, int i7, int i8) {
            return Id3Decoder.n(i2, i3, i5, i7, i8);
        }
    };
    private static final String TAG = "Id3Decoder";

    @Nullable
    private final FramePredicate framePredicate;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface FramePredicate {
        boolean evaluate(int i2, int i3, int i5, int i7, int i8);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i2, boolean z2, int i3) {
            this.majorVersion = i2;
            this.isUnsynchronized = z2;
            this.framesSize = i3;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i2) {
        if (i2 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        parsableByteArray.readBytes(bArr2, 0, i3);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i2, String str) {
        if (i2 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static nKK decodeTextInformationFrameValues(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return nKK.o("");
        }
        nKK.j jVarGh = nKK.gh();
        int iIndexOfTerminator = indexOfTerminator(bArr, i3, i2);
        while (i3 < iIndexOfTerminator) {
            jVarGh.n(new String(bArr, i3, iIndexOfTerminator - i3, getCharset(i2)));
            i3 = delimiterLength(i2) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i3, i2);
        }
        nKK nkkGh = jVarGh.gh();
        return nkkGh.isEmpty() ? nKK.o("") : nkkGh;
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i2) {
        if (i2 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i2) {
        if (i2 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), StandardCharsets.ISO_8859_1));
    }

    private static int delimiterLength(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static Charset getCharset(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
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

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
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
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z3 = (unsignedByte & 2) != 0;
        boolean z4 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i7 = 0; i7 < unsignedByte2; i7++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i7] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, StandardCharsets.ISO_8859_1);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Id3Frame decodeFrame(int i2, ParsableByteArray parsableByteArray, boolean z2, int i3, @Nullable FramePredicate framePredicate) throws Throwable {
        int unsignedIntToInt;
        int i5;
        ?? r12;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r8;
        int i7;
        int i8;
        ParsableByteArray parsableByteArray2;
        Throwable th;
        ?? r13;
        int i9;
        ?? r82;
        ?? r14;
        ?? r122;
        ?? r83;
        ?? r84;
        Id3Frame id3FrameDecodeChapterFrame;
        Id3Frame id3FrameDecodeCommentFrame;
        Id3Frame id3FrameDecodeGeobFrame;
        int i10 = i2;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        int unsignedByte4 = i10 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i10 == 4) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (!z2) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i10 == 3 ? parsableByteArray.readUnsignedIntToInt() : parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i10 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
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
            boolean zEvaluate = framePredicate.evaluate(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            i10 = i10;
            r12 = unsignedByte;
            i5 = unsignedByte2;
            if (!zEvaluate) {
                parsableByteArray.setPosition(position);
                return null;
            }
        } else {
            i5 = unsignedByte2;
            r12 = unsignedByte;
        }
        if (i10 == 3) {
            z3 = (unsignedShort & 128) != 0;
            boolean z7 = (unsignedShort & 64) != 0;
            z6 = false;
            z = z3;
            z4 = (unsignedShort & 32) != 0;
            z5 = z7;
        } else if (i10 == 4) {
            boolean z9 = (unsignedShort & 64) != 0;
            boolean z10 = (unsignedShort & 8) != 0;
            boolean z11 = (unsignedShort & 4) != 0;
            boolean z12 = (unsignedShort & 2) != 0;
            z = (unsignedShort & 1) != 0;
            z4 = z9;
            z3 = z;
            z = z10;
            z5 = z11;
            z6 = z12;
        } else {
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z || z5) {
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
        if (z6) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                r13 = parsableByteArray;
            }
        } catch (Exception e2) {
            e = e2;
            r8 = r12;
            i7 = i5;
            i8 = unsignedByte4;
            parsableByteArray2 = parsableByteArray;
            i5 = iRemoveUnsynchronization;
            th = null;
            i9 = unsignedByte3;
            r14 = parsableByteArray2;
            r82 = r8;
            r14.setPosition(position);
            r122 = th;
            r83 = r82;
            if (r122 == 0) {
            }
            return r122;
        } catch (OutOfMemoryError e3) {
            e = e3;
            r8 = r12;
            i7 = i5;
            i8 = unsignedByte4;
            parsableByteArray2 = parsableByteArray;
            i5 = iRemoveUnsynchronization;
            th = null;
            i9 = unsignedByte3;
            r14 = parsableByteArray2;
            r82 = r8;
            r14.setPosition(position);
            r122 = th;
            r83 = r82;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i5 == 88 && unsignedByte3 == 88 && (i10 == 2 || unsignedByte4 == 88)) {
            id3FrameDecodeGeobFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
        } else if (r12 == 84) {
            id3FrameDecodeGeobFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, r12, i5, unsignedByte3, unsignedByte4));
        } else if (r12 == 87 && i5 == 88 && unsignedByte3 == 88 && (i10 == 2 || unsignedByte4 == 88)) {
            id3FrameDecodeGeobFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
        } else if (r12 == 87) {
            id3FrameDecodeGeobFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, r12, i5, unsignedByte3, unsignedByte4));
        } else if (r12 == 80 && i5 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
            id3FrameDecodeGeobFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
        } else {
            if (r12 != 71 || i5 != 69 || unsignedByte3 != 79 || (unsignedByte4 != 66 && i10 != 2)) {
                th = null;
                try {
                } catch (Exception e4) {
                    e = e4;
                    r8 = r12;
                    i7 = i5;
                    i8 = unsignedByte4;
                    parsableByteArray2 = parsableByteArray;
                    i5 = iRemoveUnsynchronization;
                    i9 = unsignedByte3;
                    r14 = parsableByteArray2;
                    r82 = r8;
                    r14.setPosition(position);
                    r122 = th;
                    r83 = r82;
                    if (r122 == 0) {
                    }
                    return r122;
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    r8 = r12;
                    i7 = i5;
                    i8 = unsignedByte4;
                    parsableByteArray2 = parsableByteArray;
                    i5 = iRemoveUnsynchronization;
                    i9 = unsignedByte3;
                    r14 = parsableByteArray2;
                    r82 = r8;
                    r14.setPosition(position);
                    r122 = th;
                    r83 = r82;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (i10 != 2 ? r12 == 65 && i5 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67 : r12 == 80 && i5 == 73 && unsignedByte3 == 67) {
                    id3FrameDecodeCommentFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i10);
                } else {
                    if (r12 != 67 || i5 != 79 || unsignedByte3 != 77 || (unsignedByte4 != 77 && i10 != 2)) {
                        if (r12 == 67 && i5 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                            r84 = r12;
                            i7 = i5;
                            i8 = unsignedByte4;
                            i5 = iRemoveUnsynchronization;
                            i9 = unsignedByte3;
                            try {
                                id3FrameDecodeChapterFrame = decodeChapterFrame(parsableByteArray, i5, i10, z2, i3, framePredicate);
                                i10 = i2;
                                r12 = parsableByteArray;
                                r12.setPosition(position);
                                r122 = id3FrameDecodeChapterFrame;
                                e = th;
                                r83 = r84;
                            } catch (Exception e6) {
                                e = e6;
                                i10 = i2;
                                r14 = parsableByteArray;
                                r82 = r84;
                                r14.setPosition(position);
                                r122 = th;
                                r83 = r82;
                            } catch (OutOfMemoryError e7) {
                                e = e7;
                                i10 = i2;
                                r14 = parsableByteArray;
                                r82 = r84;
                                r14.setPosition(position);
                                r122 = th;
                                r83 = r82;
                            } catch (Throwable th3) {
                                th = th3;
                                r13 = parsableByteArray;
                                r13.setPosition(position);
                                throw th;
                            }
                        } else {
                            r84 = r12;
                            i7 = i5;
                            i8 = unsignedByte4;
                            i5 = iRemoveUnsynchronization;
                            i9 = unsignedByte3;
                            try {
                                if (r84 == 67 && i7 == 84 && i9 == 79 && i8 == 67) {
                                    i10 = i2;
                                    ParsableByteArray parsableByteArray3 = parsableByteArray;
                                    id3FrameDecodeChapterFrame = decodeChapterTOCFrame(parsableByteArray3, i5, i10, z2, i3, framePredicate);
                                    r12 = parsableByteArray3;
                                } else {
                                    i10 = i2;
                                    ParsableByteArray parsableByteArray4 = parsableByteArray;
                                    if (r84 == 77 && i7 == 76 && i9 == 76 && i8 == 84) {
                                        id3FrameDecodeChapterFrame = decodeMlltFrame(parsableByteArray4, i5);
                                        r12 = parsableByteArray4;
                                    } else {
                                        id3FrameDecodeChapterFrame = decodeBinaryFrame(parsableByteArray4, i5, getFrameId(i10, r84 == true ? 1 : 0, i7, i9, i8));
                                        r12 = parsableByteArray4;
                                    }
                                }
                                r12.setPosition(position);
                                r122 = id3FrameDecodeChapterFrame;
                                e = th;
                                r83 = r84;
                            } catch (Exception e8) {
                                e = e8;
                                r14 = r12;
                                r82 = r84;
                                r14.setPosition(position);
                                r122 = th;
                                r83 = r82;
                            } catch (OutOfMemoryError e9) {
                                e = e9;
                                r14 = r12;
                                r82 = r84;
                                r14.setPosition(position);
                                r122 = th;
                                r83 = r82;
                            } catch (Throwable th4) {
                                th = th4;
                                r13 = r12;
                                r13.setPosition(position);
                                throw th;
                            }
                        }
                        if (r122 == 0) {
                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i10, r83, i7, i9, i8) + ", frameSize=" + i5, e);
                        }
                        return r122;
                    }
                    id3FrameDecodeCommentFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
                }
                r84 = r12;
                i7 = i5;
                i8 = unsignedByte4;
                r12 = parsableByteArray;
                i5 = iRemoveUnsynchronization;
                id3FrameDecodeChapterFrame = id3FrameDecodeCommentFrame;
                r12 = r12;
                i9 = unsignedByte3;
                r12.setPosition(position);
                r122 = id3FrameDecodeChapterFrame;
                e = th;
                r83 = r84;
                if (r122 == 0) {
                }
                return r122;
            }
            id3FrameDecodeGeobFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
        }
        r84 = r12;
        i7 = i5;
        i8 = unsignedByte4;
        r12 = parsableByteArray;
        i5 = iRemoveUnsynchronization;
        th = null;
        id3FrameDecodeChapterFrame = id3FrameDecodeGeobFrame;
        r12 = r12;
        i9 = unsignedByte3;
        r12.setPosition(position);
        r122 = id3FrameDecodeChapterFrame;
        e = th;
        r83 = r84;
        if (r122 == 0) {
        }
        return r122;
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i2) {
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i2));
    }

    private static String decodeStringIfValid(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i2, String str) {
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), StandardCharsets.ISO_8859_1));
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
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i3 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z2 = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i3, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i3, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z2 = true;
        }
        while (parsableByteArray.bytesLeft() >= i3) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z2, i3, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i2, int i3) {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i5 = i2 - 1;
        byte[] bArr = new byte[i5];
        parsableByteArray.readBytes(bArr, 0, i5);
        if (i3 == 2) {
            str = "image/" + AbstractC2372w6.O(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String strO = AbstractC2372w6.O(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
            if (strO.indexOf(47) == -1) {
                str = "image/" + strO;
            } else {
                str = strO;
            }
        }
        int i7 = bArr[iIndexOfZeroByte + 1] & UByte.MAX_VALUE;
        int i8 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i8, unsignedByte);
        return new ApicFrame(str, new String(bArr, i8, iIndexOfTerminator - i8, charset), i7, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i5));
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i2, int i3, boolean z2, int i5, @Nullable FramePredicate framePredicate) throws Throwable {
        long j2;
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
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

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i2) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
        int i5 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i5, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i5, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i3));
    }

    @Nullable
    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        String str = gUxOLwRQBPPLC.KAPPgc;
        if (iBytesLeft < 10) {
            Log.w(str, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            Log.w(str, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = true;
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(str, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
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
            Log.w(str, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
            return null;
        }
        if (unsignedByte >= 4 || (unsignedByte2 & 128) == 0) {
            z2 = false;
        }
        return new Id3Header(unsignedByte, z2, synchSafeInt);
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

    private static int indexOfTerminator(byte[] bArr, int i2, int i3) {
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
