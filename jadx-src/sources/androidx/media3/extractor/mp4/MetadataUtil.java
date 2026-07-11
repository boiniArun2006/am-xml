package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    private static final String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    @Nullable
    public static MdtaMetadataEntry findMdtaMetadataEntryWithKey(Metadata metadata, String str) {
        for (int i2 = 0; i2 < metadata.length(); i2++) {
            Metadata.Entry entry = metadata.get(i2);
            if (entry instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                if (mdtaMetadataEntry.key.equals(str)) {
                    return mdtaMetadataEntry;
                }
            }
        }
        return null;
    }

    @Nullable
    private static Id3Frame parseIntegerAttribute(int i2, String str, ParsableByteArray parsableByteArray, boolean z2, boolean z3) {
        int integerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z3) {
            integerAttribute = Math.min(1, integerAttribute);
        }
        if (integerAttribute >= 0) {
            return z2 ? new TextInformationFrame(str, (String) null, nKK.o(Integer.toString(integerAttribute))) : new CommentFrame("und", str, Integer.toString(integerAttribute));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Mp4Box.getBoxTypeString(i2));
        return null;
    }

    @Nullable
    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i2) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i3 = -1;
        int i5 = -1;
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i7 = parsableByteArray.readInt();
            int i8 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i8 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i7 - 12);
            } else if (i8 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i7 - 12);
            } else {
                if (i8 == 1684108385) {
                    i3 = position;
                    i5 = i7;
                }
                parsableByteArray.skipBytes(i7 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i3 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i3);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i5 - 16));
    }

    public static void setFormatGaplessInfo(int i2, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i2 == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    public static void setFormatMetadata(int i2, @Nullable Metadata metadata, Format.Builder builder, @Nullable Metadata metadata2, Metadata... metadataArr) {
        if (metadata2 == null) {
            metadata2 = new Metadata(new Metadata.Entry[0]);
        }
        if (metadata != null) {
            for (int i3 = 0; i3 < metadata.length(); i3++) {
                Metadata.Entry entry = metadata.get(i3);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.key.equals("com.android.capture.fps")) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i2 == 2) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    private MetadataUtil() {
    }

    @Nullable
    private static CommentFrame parseCommentAttribute(int i2, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i3 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Mp4Box.getBoxTypeString(i2));
        return null;
    }

    @Nullable
    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
            if (fullBoxFlags == 13) {
                str = "image/jpeg";
            } else if (fullBoxFlags == 14) {
                str = MimeTypes.IMAGE_PNG;
            } else {
                str = null;
            }
            if (str == null) {
                Log.w(TAG, "Unrecognized cover art flags: " + fullBoxFlags);
                return null;
            }
            parsableByteArray.skipBytes(4);
            int i3 = i2 - 16;
            byte[] bArr = new byte[i3];
            parsableByteArray.readBytes(bArr, 0, i3);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w(TAG, "Failed to parse cover art attribute");
        return null;
    }

    @Nullable
    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int i2 = parsableByteArray.readInt();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 != TYPE_TOP_BYTE_COPYRIGHT && i3 != TYPE_TOP_BYTE_REPLACEMENT) {
                if (i2 == TYPE_GENRE) {
                    return parseStandardGenreAttribute(parsableByteArray);
                }
                if (i2 == TYPE_DISK_NUMBER) {
                    return parseIndexAndCountAttribute(i2, "TPOS", parsableByteArray);
                }
                if (i2 == TYPE_TRACK_NUMBER) {
                    return parseIndexAndCountAttribute(i2, "TRCK", parsableByteArray);
                }
                if (i2 == TYPE_TEMPO) {
                    return parseIntegerAttribute(i2, "TBPM", parsableByteArray, true, false);
                }
                if (i2 == TYPE_COMPILATION) {
                    return parseIntegerAttribute(i2, "TCMP", parsableByteArray, true, true);
                }
                if (i2 == TYPE_COVER_ART) {
                    return parseCoverArt(parsableByteArray);
                }
                if (i2 == TYPE_ALBUM_ARTIST) {
                    return parseTextAttribute(i2, "TPE2", parsableByteArray);
                }
                if (i2 == TYPE_SORT_TRACK_NAME) {
                    return parseTextAttribute(i2, "TSOT", parsableByteArray);
                }
                if (i2 == TYPE_SORT_ALBUM) {
                    return parseTextAttribute(i2, "TSOA", parsableByteArray);
                }
                if (i2 == TYPE_SORT_ARTIST) {
                    return parseTextAttribute(i2, "TSOP", parsableByteArray);
                }
                if (i2 == TYPE_SORT_ALBUM_ARTIST) {
                    return parseTextAttribute(i2, "TSO2", parsableByteArray);
                }
                if (i2 == TYPE_SORT_COMPOSER) {
                    return parseTextAttribute(i2, "TSOC", parsableByteArray);
                }
                if (i2 == TYPE_RATING) {
                    return parseIntegerAttribute(i2, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (i2 == TYPE_GAPLESS_ALBUM) {
                    return parseIntegerAttribute(i2, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (i2 == TYPE_TV_SORT_SHOW) {
                    return parseTextAttribute(i2, "TVSHOWSORT", parsableByteArray);
                }
                if (i2 == TYPE_TV_SHOW) {
                    return parseTextAttribute(i2, "TVSHOW", parsableByteArray);
                }
                if (i2 == TYPE_INTERNAL) {
                    return parseInternalAttribute(parsableByteArray, position);
                }
            } else {
                int i5 = 16777215 & i2;
                if (i5 == SHORT_TYPE_COMMENT) {
                    return parseCommentAttribute(i2, parsableByteArray);
                }
                if (i5 != SHORT_TYPE_NAME_1 && i5 != SHORT_TYPE_NAME_2) {
                    if (i5 != SHORT_TYPE_COMPOSER_1 && i5 != SHORT_TYPE_COMPOSER_2) {
                        if (i5 == SHORT_TYPE_YEAR) {
                            return parseTextAttribute(i2, "TDRC", parsableByteArray);
                        }
                        if (i5 == SHORT_TYPE_ARTIST) {
                            return parseTextAttribute(i2, "TPE1", parsableByteArray);
                        }
                        if (i5 == SHORT_TYPE_ENCODER) {
                            return parseTextAttribute(i2, "TSSE", parsableByteArray);
                        }
                        if (i5 == SHORT_TYPE_ALBUM) {
                            return parseTextAttribute(i2, "TALB", parsableByteArray);
                        }
                        if (i5 == SHORT_TYPE_LYRICS) {
                            return parseTextAttribute(i2, "USLT", parsableByteArray);
                        }
                        if (i5 == SHORT_TYPE_GENRE) {
                            return parseTextAttribute(i2, "TCON", parsableByteArray);
                        }
                        if (i5 == TYPE_GROUPING) {
                            return parseTextAttribute(i2, "TIT1", parsableByteArray);
                        }
                    } else {
                        return parseTextAttribute(i2, "TCOM", parsableByteArray);
                    }
                } else {
                    return parseTextAttribute(i2, "TIT2", parsableByteArray);
                }
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Mp4Box.getBoxTypeString(i2));
            parsableByteArray.setPosition(position);
            return null;
        } finally {
            parsableByteArray.setPosition(position);
        }
    }

    @Nullable
    private static TextInformationFrame parseIndexAndCountAttribute(int i2, String str, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i3 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String str2 = "" + unsignedShort;
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + "/" + unsignedShort2;
                }
                return new TextInformationFrame(str, (String) null, nKK.o(str2));
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Mp4Box.getBoxTypeString(i2));
        return null;
    }

    @Nullable
    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i2, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position < i2) {
                int i3 = parsableByteArray.readInt();
                if (parsableByteArray.readInt() == 1684108385) {
                    int i5 = parsableByteArray.readInt();
                    int i7 = parsableByteArray.readInt();
                    int i8 = i3 - 16;
                    byte[] bArr = new byte[i8];
                    parsableByteArray.readBytes(bArr, 0, i8);
                    return new MdtaMetadataEntry(str, bArr, i7, i5);
                }
                parsableByteArray.setPosition(position + i3);
            } else {
                return null;
            }
        }
    }

    @Nullable
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String strResolveV1Genre = Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (strResolveV1Genre != null) {
            return new TextInformationFrame("TCON", (String) null, nKK.o(strResolveV1Genre));
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    private static TextInformationFrame parseTextAttribute(int i2, String str, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, (String) null, nKK.o(parsableByteArray.readNullTerminatedString(i3 - 16)));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Mp4Box.getBoxTypeString(i2));
        return null;
    }

    private static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i3 = i2 - 16;
            if (i3 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i3 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i3 != 3) {
                if (i3 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                    return parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                return parsableByteArray.readUnsignedInt24();
            }
        }
        Log.w(TAG, "Failed to parse data atom to int");
        return -1;
    }
}
